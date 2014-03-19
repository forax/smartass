package com.github.forax.smartass.rt;

import static org.objectweb.asm.Opcodes.*;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.util.CheckClassAdapter;

import com.github.forax.smartass.ast.Block;

public class Script {
  private final ConstantDictionnary dictionnary = new ConstantDictionnary();
  private final ScriptClassLoader classLoader = new ScriptClassLoader();
  final HashMap<String, Klass> klassCache = new HashMap<>();
  
  private final Klass klassOfNull = Klass.create("null", null, Collections.emptyList());
  final ThreadLocal<Klass> threadLocal = new ThreadLocal<>();
  private final ClassValue<Klass> klasses = new ClassValue<Klass>() {
    @Override
    protected Klass computeValue(Class<?> type) {
      Klass klass = threadLocal.get();
      if (klass != null) {
        return klass;
      }
      
      // transform a Java class to a Klass
      klass = JavaBridge.javaClasstoKlass(type, this);
      klassCache.put(type.getName(), klass);
      return klass;
    }
  };
  
  public Script() {
    // empty
  }
  
  private void linkKlass(Class<?> type, Klass klass) {
    klassCache.put(klass.getName(), klass);
    threadLocal.set(klass);
    try {
      if (klasses.get(type) != klass) {
        throw new IllegalStateException("java class already linked to a klass");
      }
    } finally {
      threadLocal.set(null);
    }
  }
  
  private Klass getKlass(Object o) {  // here lies the magic
    if (o == null) {
      return klassOfNull;
    }
    if (o instanceof Klass) {
      Klass metaKlass =  ((Klass)o).getStaticKlass();
      if (metaKlass != null) {
        return metaKlass;
      }
    }
    return klasses.get(o.getClass());
  }
  
  class ScriptClassLoader extends ClassLoader {
    Class<?> defineClasse(String name, byte[] bytecodes) {
      return defineClass(name, bytecodes, 0, bytecodes.length);
    }
    
    Script getScript() {
      return Script.this;
    }
  }
  
  private static final Lookup LOOKUP = MethodHandles.lookup();
  private static MethodHandle findVirtual(Class<?> declaringClass, String name, Class<?> returnType, Class<?>... parameterTypes) {
    try {
      return LOOKUP.findVirtual(declaringClass, name, MethodType.methodType(returnType, parameterTypes));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
  }
  private static MethodHandle findStatic(Class<?> declaringClass, String name, Class<?> returnType, Class<?>... parameterTypes) {
    try {
      return LOOKUP.findStatic(declaringClass, name, MethodType.methodType(returnType, parameterTypes));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
  }
  
  MethodHandle createFunctionMH(Function function) {
    int constantIndex = dictionnary.intern(function);
    String className = "do.$" + constantIndex;
    byte[] bytecodes = Rewriter.rewrite(function, className, dictionnary);
    CheckClassAdapter.verify(new ClassReader(bytecodes), false, new PrintWriter(System.out));
    Class<?> clazz = classLoader.defineClasse(className, bytecodes);
    MethodHandle target;
    try {
      target = MethodHandles.publicLookup().findStatic(clazz, "lambda",
          MethodType.genericMethodType(function.getFreeVars().size() + 1 + function.getParameters().size()));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
    return target;
  }
  
  MethodHandle createKlassMH(Klass klass) {
    String className = "class." + klass.getName();
    String internalName = className.replace('.', '/');
    
    ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
    writer.visit(V1_8, ACC_PUBLIC|ACC_SUPER, internalName, null, "java/lang/Object", null);
    Set<String> fields = klass.getFields();
    MethodType methodType = MethodType.genericMethodType(1 + fields.size()).changeReturnType(void.class);
    MethodVisitor init = writer.visitMethod(ACC_PUBLIC, "<init>", methodType.toMethodDescriptorString(), null, null);
    init.visitCode();
    init.visitVarInsn(ALOAD, 0);
    init.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>",  "()V", false);
    Iterator<String> it = fields.iterator();
    for(int i = 0; it.hasNext(); i++) {
      String fieldName = it.next();
      init.visitVarInsn(ALOAD, 0);
      init.visitVarInsn(ALOAD, 2 + i);
      init.visitFieldInsn(PUTFIELD, internalName, fieldName, "Ljava/lang/Object;");
      
      FieldVisitor fv = writer.visitField(ACC_PUBLIC|ACC_FINAL, fieldName, "Ljava/lang/Object;", null, null);  
      fv.visitEnd();
    }
    init.visitInsn(RETURN);
    init.visitMaxs(-1, -1);
    init.visitEnd();
    
    writer.visitEnd();
    byte[] bytecodes = writer.toByteArray();
    CheckClassAdapter.verify(new ClassReader(bytecodes), false, new PrintWriter(System.out));
    
    Class<?> type = classLoader.defineClasse(className, bytecodes);
    linkKlass(type, klass);
    
    MethodHandle target;
    try {
      target = MethodHandles.publicLookup().findConstructor(type, methodType);
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
    return target;
  }
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_symbol(Lookup lookup, @SuppressWarnings("unused")String name, @SuppressWarnings("unused")MethodType mtype, int constantIndex) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    
    String symbol = (String)script.dictionnary.getConstantAt(constantIndex);
    Object constant = symbol;
    
    Klass klass = script.klassCache.get(symbol);
    if (klass != null) {  // known klass ?
      constant = klass;
    } else {
      if (symbol.indexOf('.') != -1) { // a Java class ?
        try {
          Class<?> type = classLoader.loadClass(symbol);
          constant = script.klasses.get(type);
        } catch (ClassNotFoundException e) {
          // do nothing
        }
      }
    }
    //System.out.println("resolved symbol " + symbol + " as " + constant.getClass());
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_const(@SuppressWarnings("unused") Lookup lookup,  String name, @SuppressWarnings("unused") MethodType type) {
    Object constant;
    if (name.indexOf('.') == -1) {
      try {
        constant = Integer.parseInt(name);
      } catch(NumberFormatException e) {
        try {
          constant = Long.parseLong(name);
        } catch(NumberFormatException e2) {
          constant = new BigInteger(name);
        } 
      }
    } else {
      try {
        constant = Double.parseDouble(name);
      } catch(NumberFormatException e) {
        constant = new BigDecimal(name);
      }
    }
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  private static final MethodHandle LAMBDA =
      findVirtual(Script.class, "lambda", Object.class, Function.class, Object[].class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_lambda(Lookup lookup, @SuppressWarnings("unused") String name, MethodType type, int constantIndex) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    Function function = (Function)script.dictionnary.getConstantAt(constantIndex);
    
    // no free variables, always return the same function
    if (function.getFreeVars().isEmpty()) {
      return new ConstantCallSite(MethodHandles.constant(Object.class, function));
    }
    return new ConstantCallSite(LAMBDA.bindTo(script).bindTo(function).asCollector(Object[].class, type.parameterCount()));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private Object lambda(Function function, Object[] boundValues) {
    // create a new lambda with the same values
    return new Function(function.getFreeVars(), function.getParameters(), function.getBlock(),
        (script, __) -> MethodHandles.insertArguments(function.getTarget(this), 0, boundValues)
    );
  }
  
  private static final MethodHandle FIELD_GET =
      findStatic(Script.class, "field_get", Object.class, String.class, Object.class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_field_get(@SuppressWarnings("unused") Lookup lookup, String name, @SuppressWarnings("unused") MethodType type) {
    return new ConstantCallSite(FIELD_GET.bindTo(name));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object field_get(String name, Object receiver) throws Throwable {
    MethodHandle target = MethodHandles.publicLookup().findGetter(receiver.getClass(), name, Object.class);
    return target.asType(MethodType.methodType(Object.class, Object.class)).invokeExact(receiver);
  }
  
  private static final MethodHandle METHOD_CALL =
      findVirtual(Script.class, "method_call", Object.class, Object.class, Object[].class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_method_call(Lookup lookup, @SuppressWarnings("unused") String name, MethodType type) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    return new ConstantCallSite(METHOD_CALL.bindTo(script).asCollector(Object[].class, type.parameterCount() - 1));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private Object method_call(Object selector, Object[] args) throws Throwable {
    if (selector instanceof Function) {
      return ((Function)selector).getTarget(this).invokeWithArguments(args);
    }
    if (selector instanceof Klass) {
      return ((Klass)selector).getTarget(this).invokeWithArguments(args);
    }
    if (selector instanceof String) {
      Function method = getKlass(args[0]).getMethodMap().get(selector);
      if (method == null) {
        throw new LinkageError("no method '" + selector + "' defined on " + getKlass(args[0]));
      }
      return method.getTarget(this).invokeWithArguments(args);
    }
    throw new LinkageError("invalid selector " + selector);
  }
  
  private static final MethodHandle TRUTH = findStatic(Script.class, "truth", boolean.class, Object.class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_truth(@SuppressWarnings("unused") Lookup lookup, @SuppressWarnings("unused") String name, @SuppressWarnings("unused") MethodType type) {
    return new ConstantCallSite(TRUTH);
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static boolean truth(Object value) {
    if (value == null) {
      return false;
    }
    if (value instanceof Boolean) {
      return ((Boolean)value);
    }
    if (value instanceof Integer) {
      return ((Integer)value) != 0;
    }
    if (value instanceof Long) {
      return ((Long)value) != 0L;
    }
    if (value instanceof BigInteger) {
      return ((BigInteger)value).equals(BigInteger.ZERO);
    }
    return false;
  }
  
  @MethodInfo(hidden=true)
  public Object start(Block block) throws Throwable {
    Function main = new Function(Collections.emptyList(), Collections.emptyList(), block);
    return main.getTarget(this).invokeExact((Object)this);
  }
  
  
  // ---------------------------
  // public API !
  // ---------------------------
  
  @MethodInfo(name="class")
  public Klass createClass(Object symbol, Function body) throws Throwable {
    Objects.requireNonNull(symbol);
    Objects.requireNonNull(body);
    Klass klass;
    List<String> parameters = body.getParameters();
    if (symbol instanceof String) { // new class !
      String name = (String)symbol;
      klass = Klass.create(name, null, parameters);
      klassCache.put(name, klass);
    } else {
      klass = (Klass)symbol;
    }
    Object[] args = new Object[1 + parameters.size()];
    args[0] = klass;
    for(int i = 1; i < args.length; i++) {
      args[i] = fieldAccessor(parameters.get(i - 1));
    }
    body.getTarget(this).invokeWithArguments(args);
    return klass;
  }
  
  @SuppressWarnings("static-method")
  public Function fieldAccessor(String name) {
    Objects.requireNonNull(name);
    return new Function(Collections.emptyList(), Collections.emptyList(), null,
        (script, fun) -> Script.bsm_field_get(null /*unused*/, name, null /*unused*/).dynamicInvoker()
        );
  }
  
  public Function methodAccessor(String name, int parameterCount) {
    Objects.requireNonNull(name);
    if (parameterCount < 0) {
      throw new IllegalArgumentException("parameterCount < 0");
    }
    return new Function(Collections.emptyList(),
        IntStream.range(0, parameterCount).mapToObj(value -> "arg" + value).collect(Collectors.toList()),
        null,
        (script, fun) -> METHOD_CALL.bindTo(this).asCollector(Object[].class, parameterCount)
        );
  }
}
