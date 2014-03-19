package com.github.forax.smartass.rt;

import static org.objectweb.asm.Opcodes.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import com.github.forax.smartass.ast.Block;
import com.github.forax.smartass.ast.Expr;
import com.github.forax.smartass.ast.FieldAccess;
import com.github.forax.smartass.ast.If;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.ast.Literal;
import com.github.forax.smartass.ast.MethodCall;
import com.github.forax.smartass.ast.VarAccess;
import com.github.forax.smartass.ast.VarAssignment;
import com.github.forax.smartass.ast.VoidVisitor;
import com.github.forax.smartass.ast.While;

public class Rewriter {
  static final String INTERNAL_NAME = Script.class.getName().replace('.', '/');
  static final String BSM_SIG = 
      MethodType.methodType(CallSite.class, Lookup.class, String.class, MethodType.class).toMethodDescriptorString();
  static final String BSM_INT_SIG =
      MethodType.methodType(CallSite.class, Lookup.class, String.class, MethodType.class, int.class).toMethodDescriptorString();
  
  
  static class Env {
    private final MethodVisitor mv;
    private final ConstantDictionnary dictionnary;
    private final HashMap<String, Integer> slotMap; 
    
    private Env(MethodVisitor mv, ConstantDictionnary dictionnary, HashMap<String, Integer> slotMap) {
      this.mv = mv;
      this.dictionnary = dictionnary;
      this.slotMap = slotMap;
    }
    
    Env(MethodVisitor mv, ConstantDictionnary dictionnary) {
      this(mv, dictionnary, new HashMap<>());
    }
    
    Env newEnv() {
      return new Env(mv, dictionnary, new HashMap<>(slotMap));
    }
    
    public Integer lookupSlotOrNull(String name) {
      Objects.requireNonNull(name);
      return slotMap.get(name);
    }
    public int registerSlot(String name) {
      Objects.requireNonNull(name);
      int slot = slotMap.size();
      slotMap.putIfAbsent(name, slot);
      return slot;
    }
    public int getNumberOfSlots() {
      return slotMap.size();
    }
    
    public void emitInsn(int opcode) {
      mv.visitInsn(opcode);
    }
    public void emitVar(int opcode, int slot) {
      mv.visitVarInsn(opcode, slot);
    }
    public void emitJump(int opcode, Label label) {
      mv.visitJumpInsn(opcode, label);
    }
    public void emitLabel(Label label) {
      mv.visitLabel(label);
    }
    public void emitIndy(String bsmName, String name, String desc) {
      mv.visitInvokeDynamicInsn(name, desc,
          new Handle(H_INVOKESTATIC, INTERNAL_NAME, bsmName, BSM_SIG));
    }
    public void emitIndy(String bsmName, String name, String desc, Function constObject) {
      mv.visitInvokeDynamicInsn(name, desc,
          new Handle(H_INVOKESTATIC, INTERNAL_NAME, bsmName, BSM_INT_SIG),
          dictionnary.intern(constObject));
    }
    
    public void emitLineNumber(int lineNumber) {
      Label label = new Label();
      mv.visitLabel(label);
      mv.visitLineNumber(lineNumber, label);
    }
  }
  
  private static String desc(int parameterCount) {
    return MethodType.genericMethodType(parameterCount).toMethodDescriptorString();
  }
  
  static void visit(Expr expr, Env env) {
    VISITOR.visit(expr, env);
  } // with
  private static final VoidVisitor<Env> VISITOR =
      new VoidVisitor<Env>()
          .when(Block.class, (block, env) -> {
            env.emitLineNumber(block.getLocation().getLineNumber());
            List<Expr> exprs = block.getExprs();
            if (exprs.isEmpty()) {
              env.emitInsn(ACONST_NULL);
              return;
            }
            for(int i = 0; i < exprs.size() - 1; i++) {
              Expr expr = exprs.get(i);
              env.emitLineNumber(expr.getLocation().getLineNumber());
              visit(expr, env);
              env.emitInsn(POP);
            }
            Expr lastExpr = exprs.get(exprs.size() - 1);
            env.emitLineNumber(lastExpr.getLocation().getLineNumber());
            visit(lastExpr, env);
          })
          .when(Literal.class, (expr, env) -> {
            env.emitIndy("bsm_const", expr.getValue(), "()Ljava/lang/Object;");
          })
          .when(VarAccess.class, (expr, env) -> {
            String name = expr.getId();
            Integer slotOrNull = env.lookupSlotOrNull(name);
            if (slotOrNull == null) {   // unknown local variable, so it's a symbol
              // may be the symbol can be different depending on 'this' ??
              env.emitIndy("bsm_symbol", Utils.mangle(name), "()Ljava/lang/Object;");
            } else {
              env.emitVar(ALOAD, slotOrNull);
            }
          })
          .when(VarAssignment.class, (expr, env) -> {
            visit(expr.getExpr(), env);
            env.emitInsn(DUP);
            env.emitVar(ASTORE, env.registerSlot(expr.getId()));
          })
          .when(FieldAccess.class, (expr, env) -> {
            env.emitVar(ALOAD, env.lookupSlotOrNull("this"));
            env.emitIndy("bsm_field_get", expr.getId(),
                "(Ljava/lang/Object;)Ljava/lang/Object;");
          })
          .when(Lambda.class, (lambda, env) -> {
            ArrayList<String> freeVars = new ArrayList<>();
            visitFreeVar(lambda, new VarEnv(freeVars));
            for(Iterator<String> it = freeVars.iterator(); it.hasNext();) {
              String name = it.next();
              Integer slotOrNull = env.lookupSlotOrNull(name);
              if (slotOrNull == null) {
                it.remove();
              } else {
                env.emitVar(ALOAD, slotOrNull);
              }
            }
            Function function = new Function(freeVars, lambda.getParameters(), lambda.getBlock());
            env.emitIndy("bsm_lambda", "lambda", desc(freeVars.size()), function);
          })
          .when(MethodCall.class, (call, env) -> {
            visit(call.getReceiver(), env);
            visit(call.getSelector(), env);
            env.emitInsn(SWAP);
            for(Expr expr: call.getArguments()) {
              visit(expr, env);
            }
            int argCount = 2 + call.getArguments().size();
            Lambda lambdaOrNull = call.getLambdaOrNull();
            if (lambdaOrNull != null) {
              visit(lambdaOrNull, env);
              argCount++;
            }
            env.emitIndy("bsm_method_call", "apply", desc(argCount));
          })
          .when(While.class, (loop, env) -> {
            env.emitInsn(ACONST_NULL);
            Label check = new Label();
            env.emitJump(GOTO, check);
            Label start = new Label();
            env.emitLabel(start);
            env.emitInsn(POP);
            visit(loop.getBlock(), env.newEnv());
            env.emitLabel(check);
            visit(loop.getCondition(), env);
            env.emitIndy("bsm_truth", "truth", "(Ljava/lang/Object;)Z");
            env.emitJump(IFEQ, start);
          })
          .when(If.class, (_if, env) -> {
            Label notTrue = new Label();
            visit(_if.getCondition(), env);
            env.emitIndy("bsm_truth", "truth", "(Ljava/lang/Object;)Z");
            env.emitJump(IFEQ, notTrue);
            visit(_if.getTrueBlock(), env.newEnv());
            Label end = new Label();
            env.emitJump(GOTO, end);
            env.emitLabel(notTrue);
            Block falseBlock = _if.getFalseBlock();
            if (falseBlock != null) {
              visit(falseBlock, env.newEnv());
            } else {
              env.emitInsn(ACONST_NULL);
            }
            env.emitLabel(end);
          })
          ;
  
  static class VarEnv {
    final HashSet<String> localVars;
    final ArrayList<String> freeVars;
    
    private VarEnv(HashSet<String> localVars, ArrayList<String> freeVars) {
      this.localVars = localVars;
      this.freeVars = freeVars;
    }
    
    public VarEnv(ArrayList<String> freeVars) {
      this(new HashSet<>(), freeVars);
    }
    
    public VarEnv newEnv() {
      return new VarEnv(new HashSet<>(localVars), freeVars);
    }
  }
  
  
  // collect variables that are not local variables
  private static void visitFreeVar(Expr expr, VarEnv env) {
    FREE_VAR_VISITOR.visit(expr, env);
  } // with
  private static final VoidVisitor<VarEnv> FREE_VAR_VISITOR =
      new VoidVisitor<VarEnv>()
          .when(Block.class, (block, env) -> {
            for(Expr expr: block.getExprs()) {
              visitFreeVar(expr, env);
            }
          })
          .when(Literal.class, (expr, env) -> {
            // do nothing
          })
          .when(VarAccess.class, (expr, env) -> {
            if (!env.localVars.contains(expr.getId())) {
              env.freeVars.add(expr.getId());
            }
          })
          .when(VarAssignment.class, (expr, env) -> {
            env.localVars.add(expr.getId());
          })
          .when(FieldAccess.class, (expr, env) -> {
            // field name are not variable
          })
          .when(Lambda.class, (lambda, env) -> {
            VarEnv newEnv = env.newEnv();
            newEnv.localVars.add("this");  // implicit this
            for(String parameter: lambda.getParameters()) {
              newEnv.localVars.add(parameter);
            }
            visitFreeVar(lambda.getBlock(), newEnv);
          })
          .when(MethodCall.class, (call, env) -> {
            visitFreeVar(call.getSelector(), env);
            visitFreeVar(call.getReceiver(), env);
            for(Expr argument: call.getArguments()) {
              visitFreeVar(argument, env);
            }
            Lambda lambdaOrNull = call.getLambdaOrNull();
            if (lambdaOrNull != null) {
              visitFreeVar(lambdaOrNull, env);
            }
          })
          .when(While.class, (loop, env) -> {
            visitFreeVar(loop.getCondition(), env);
            visitFreeVar(loop.getBlock(), env.newEnv());
          })
          .when(If.class, (_if, env) -> {
            visitFreeVar(_if.getCondition(), env);
            visitFreeVar(_if.getTrueBlock(), env.newEnv());
            Block falseBlock = _if.getFalseBlock();
            if (falseBlock != null) {
              visitFreeVar(falseBlock, env.newEnv());
            }
          })
          ;
  
  public static byte[] rewrite(Function function, String className, ConstantDictionnary dictionnary) {
    ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
    writer.visit(V1_8, ACC_PUBLIC|ACC_SUPER, className.replace('.',  '/'), null, "java/lang/Object", null);
    writer.visitSource("script", null);
    
    List<String> freeVars = function.getFreeVars();
    List<String> parameters = function.getParameters();
    
    MethodVisitor mv = writer.visitMethod(ACC_PUBLIC|ACC_STATIC, "lambda", desc(freeVars.size() + 1 + parameters.size()), null, null);
    Env env = new Env(mv, dictionnary);
    for(String freeVar: freeVars) {
      env.registerSlot(freeVar);
    }
    env.registerSlot("this");  // implicit this
    for(String parameter: parameters) {
      env.registerSlot(parameter);
    }
    mv.visitCode();
    VISITOR.visit(function.getBlock(), env);
    mv.visitInsn(ARETURN);
    mv.visitMaxs(-1, -1);
    mv.visitEnd();
    
    writer.visitEnd();
    return writer.toByteArray();
  }
}
