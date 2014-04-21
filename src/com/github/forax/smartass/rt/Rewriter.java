package com.github.forax.smartass.rt;

import static org.objectweb.asm.Opcodes.*;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import com.github.forax.smartass.ast.Block;
import com.github.forax.smartass.ast.Data;
import com.github.forax.smartass.ast.Expr;
import com.github.forax.smartass.ast.FieldAccess;
import com.github.forax.smartass.ast.If;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.ast.Literal;
import com.github.forax.smartass.ast.MethodCall;
import com.github.forax.smartass.ast.Parameter;
import com.github.forax.smartass.ast.Stop;
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
  static final String BSM_STRING_SIG =
      MethodType.methodType(CallSite.class, Lookup.class, String.class, MethodType.class, String.class).toMethodDescriptorString();
  
  static class ProtoFun {
    final List<String> freeVars;
    final Lambda lambda;

    ProtoFun(List<String> freeVars, Lambda lambda) {
      this.freeVars = Objects.requireNonNull(freeVars);
      this.lambda = Objects.requireNonNull(lambda);
    }
  }
  
  static class Env {
    private final ConstantDictionary dictionary;
    private final MethodVisitor mv;
    private final HashMap<String, Integer> slotMap;
    
    private Env(ConstantDictionary dictionary, MethodVisitor mv, HashMap<String, Integer> slotMap) {
      this.dictionary = dictionary;
      this.mv = mv;
      this.slotMap = slotMap;
    }
    
    Env(ConstantDictionary dictionnary, MethodVisitor mv) {
      this(dictionnary, mv, new HashMap<>());
    }
    
    Env newEnv() {
      return new Env(dictionary, mv, new HashMap<>(slotMap));
    }
    
    public Integer lookupSlotOrNull(String name) {
      Objects.requireNonNull(name);
      return slotMap.get(name);
    }
    public int registerSlot(String name) {
      Objects.requireNonNull(name);
      int slot = slotMap.size();
      Integer oldSlot = slotMap.putIfAbsent(name, slot);
      return (oldSlot == null)? slot: oldSlot;
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
    public void emitLdc(Object constant) {
      mv.visitLdcInsn(constant);
    }
    public void emitIndy(String bsmName, String name, String desc) {
      mv.visitInvokeDynamicInsn(name, desc,
          new Handle(H_INVOKESTATIC, INTERNAL_NAME, bsmName, BSM_SIG));
    }
    public void emitIndy(String bsmName, String name, String desc, String constValue) {
      mv.visitInvokeDynamicInsn(name, desc,
          new Handle(H_INVOKESTATIC, INTERNAL_NAME, bsmName, BSM_STRING_SIG),
          constValue);
    }
    public void emitIndy(String bsmName, String name, String desc, ProtoFun protoFun) {
      mv.visitInvokeDynamicInsn(name, desc,
          new Handle(H_INVOKESTATIC, INTERNAL_NAME, bsmName, BSM_INT_SIG),
          dictionary.intern(protoFun));
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
            env.emitLineNumber(block.getLineNumber());
            List<Expr> exprs = block.getExprs();
            if (exprs.isEmpty()) {
              env.emitInsn(ACONST_NULL);
              return;
            }
            for(int i = 0; i < exprs.size() - 1; i++) {
              Expr expr = exprs.get(i);
              env.emitLineNumber(expr.getLineNumber());
              visit(expr, env);
              env.emitInsn(POP);
            }
            Expr lastExpr = exprs.get(exprs.size() - 1);
            env.emitLineNumber(lastExpr.getLineNumber());
            visit(lastExpr, env);
          })
          .when(Literal.class, (expr, env) -> {
            String value = expr.getValue();
            if (value.charAt(0) == '\'') {
              env.emitIndy("bsm_symbol", "symbolOrString", "()Ljava/lang/Object;", value.substring(1));
              return;
            }
            if (value.equals("null")) {
              env.emitInsn(ACONST_NULL);
              return;   
            }
            env.emitIndy("bsm_const", "const", "()Ljava/lang/Object;", value);
          })
          .when(VarAccess.class, (expr, env) -> {
            String name = expr.getId();
            Integer slot = env.lookupSlotOrNull(name);
            if (slot == null) { // it can be a symbol
              env.emitIndy("bsm_symbol", (expr.stringAllowed())? "symbolOrString": "symbol", "()Ljava/lang/Object;", name);
              return;
            }
            env.emitVar(ALOAD, slot);
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
            LinkedHashSet<String> freeVars = new LinkedHashSet<>();
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
            env.emitIndy("bsm_lambda", "lambda", desc(freeVars.size()),
                new ProtoFun(freeVars.stream().collect(Collectors.toList()), lambda));
          })
          .when(MethodCall.class, (call, env) -> {
            visit(call.getReceiver(), env);
            visit(call.getSelector(), env);
            env.emitInsn(SWAP);
            for(Expr expr: call.getArguments()) {
              visit(expr, env);
            }
            int argCount = 2 + call.getArguments().size();
            Lambda lambdaOrNull = call.getLambdaOptional();
            if (lambdaOrNull != null) {
              visit(lambdaOrNull, env);
              argCount++;
            }
            env.emitLineNumber(call.getLineNumber());
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
            env.emitLdc("truth");
            visit(loop.getCondition(), env);
            env.emitIndy("bsm_method_call", "truth", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
            env.emitJump(IFNE, start);
          })
          .when(If.class, (_if, env) -> {
            Label notTrue = new Label();
            env.emitLdc("truth");
            visit(_if.getCondition(), env);
            env.emitIndy("bsm_method_call", "truth", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
            env.emitJump(IFEQ, notTrue);
            visit(_if.getTrueBlock(), env.newEnv());
            Label end = new Label();
            env.emitJump(GOTO, end);
            env.emitLabel(notTrue);
            Block falseBlock = _if.getFalseBlockOptional();
            if (falseBlock != null) {
              visit(falseBlock, env.newEnv());
            } else {
              env.emitInsn(ACONST_NULL);
            }
            env.emitLabel(end);
          })
          .when(Stop.class, (stop, env) -> {
            visit(stop.getExpr(), env);
            switch(stop.getKind()) {
            case RETURN:
              env.emitInsn(ARETURN);
              break;
            default: //case THROW:
              env.emitIndy("bsm_throwable", "as_throwable", "(Ljava/lang/Object;)Ljava/lang/Throwable;");
              env.emitInsn(ATHROW);
            }
            env.emitInsn(ACONST_NULL);  // dead code, but not a big deal
          })
          .when(Data.class, (data, env) -> {
            for(Expr expr: data.getExprs()) {
              visit(expr, env);
            }
            env.emitIndy("bsm_data", data.getKind().name().toLowerCase(), desc(data.getExprs().size()));
          })
          ;
  
  static class VarEnv {
    final HashSet<String> localVars;
    final LinkedHashSet<String> freeVars;
    
    private VarEnv(HashSet<String> localVars, LinkedHashSet<String> freeVars) {
      this.localVars = localVars;
      this.freeVars = freeVars;
    }
    
    public VarEnv(LinkedHashSet<String> freeVars) {
      this(new HashSet<>(), freeVars);
    }
    
    public VarEnv duplicateEnv() {
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
            visitFreeVar(expr.getExpr(), env);
          })
          .when(FieldAccess.class, (expr, env) -> {
            // field name are not variable
          })
          .when(Lambda.class, (lambda, env) -> {
            VarEnv newEnv = new VarEnv(env.freeVars);  // fresh env
            newEnv.localVars.add("this");  // implicit this
            for(Parameter parameter: lambda.getParameters()) {
              newEnv.localVars.add(parameter.getName());
            }
            visitFreeVar(lambda.getBlock(), newEnv);
          })
          .when(MethodCall.class, (call, env) -> {
            visitFreeVar(call.getSelector(), env);
            visitFreeVar(call.getReceiver(), env);
            for(Expr argument: call.getArguments()) {
              visitFreeVar(argument, env);
            }
            Lambda lambda = call.getLambdaOptional();
            if (lambda != null) {
              visitFreeVar(lambda, env);
            }
          })
          .when(While.class, (loop, env) -> {
            visitFreeVar(loop.getCondition(), env);
            visitFreeVar(loop.getBlock(), env.duplicateEnv());
          })
          .when(If.class, (_if, env) -> {
            visitFreeVar(_if.getCondition(), env);
            visitFreeVar(_if.getTrueBlock(), env.duplicateEnv());
            Block falseBlock = _if.getFalseBlockOptional();
            if (falseBlock != null) {
              visitFreeVar(falseBlock, env.duplicateEnv());
            }
          })
          .when(Stop.class, (stop, env) -> {
            visitFreeVar(stop.getExpr(), env);
          })
          .when(Data.class, (data, env) -> {
            for(Expr expr: data.getExprs()) {
              visitFreeVar(expr, env);
            }
          })
          ;
  
  static byte[] rewrite(Function function, String nameHint, String className, ConstantDictionary dictionary) {
    ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
    writer.visit(V1_8, ACC_PUBLIC|ACC_SUPER, className.replace('.',  '/'), null, "java/lang/Object", null);
    Path path = function.getLambdaOptional().getPathOptional();
    writer.visitSource((path == null)? "script": path.toString(), null);
    
    List<String> freeVars = function.getFreeVars();
    List<String> parameters = function.getParameters();
    
    MethodVisitor mv = writer.visitMethod(ACC_PUBLIC|ACC_STATIC, nameHint, desc(freeVars.size() + 1 + parameters.size()), null, null);
    Env env = new Env(dictionary, mv);
    for(String freeVar: freeVars) {
      env.registerSlot(freeVar);
    }
    env.registerSlot("this");  // implicit this
    for(String parameter: parameters) {
      env.registerSlot(parameter);
    }
    mv.visitCode();
    VISITOR.visit(function.getLambdaOptional().getBlock(), env);
    mv.visitInsn(ARETURN);
    mv.visitMaxs(-1, -1);
    mv.visitEnd();
    
    writer.visitEnd();
    return writer.toByteArray();
  }
}
