package com.github.forax.smartass.rt;

import static org.objectweb.asm.Opcodes.*;

import java.io.PrintWriter;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.Arrays;
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

import com.github.forax.smartass.ast.ASTBuilder;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.ast.Parameter;
import com.github.forax.smartass.rt.Rewriter.ProtoFun;

public class Script {
  private final ConstantDictionary dictionary = new ConstantDictionary();
  private final ScriptClassLoader classLoader = new ScriptClassLoader();
  final HashMap<String, Klass> klassCache = new HashMap<>();
  
  private final Klass klassOfNull = Klass.create("null", null, Collections.emptyList(), new HashMap<>());
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
  
  private Klass resolveKlass(String name) {
    Klass klass = klassCache.get(name);
    if (klass != null) {  // known klass ?
      return klass;
    }
    if (name.indexOf('.') == -1) { // not a Java class ?
      return null;
    }
    try {
      Class<?> type = classLoader.loadClass(name);
      return klasses.get(type);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }
  
  private List<Klass> resolveParameterTypeHints(List<Parameter> parameters) {
    Klass[] klasses = new Klass[parameters.size()];
    for(int i = 0; i < klasses.length; i++) {
      String typeHint = parameters.get(i).getTypeHintOptional();
      if (typeHint != null) {
        Klass klass = resolveKlass(typeHint);
        if (klass == null) {
          throw new LinkageError("invalid type name " + typeHint);
        }
        klasses[i] = klass;
      }
    }
    return Arrays.asList(klasses);
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
  
  private static boolean validJavaIdentifier(String id) {
    int length = id.length();
    if (length == 0) {
      return false;
    }
    if (!Character.isJavaIdentifierStart(id.charAt(0))) {
      return false;
    }
    for(int i = 1; i < length; i++) {
      if (!Character.isJavaIdentifierPart(id.charAt(0))) {
        return false;
      }
    }
    return true;
  }
  
  MethodHandle createFunctionMH(Function function) {
    int constantIndex = dictionary.intern(function); //FIXME, don't use the dictionary to store a function
    String className = "fun" + constantIndex;
    String nameHint = function.getNameHint();
    if (nameHint == null || !validJavaIdentifier(nameHint)) {
      nameHint = "lambda";
    }
    byte[] bytecodes = Rewriter.rewrite(function, nameHint, className, dictionary);
    CheckClassAdapter.verify(new ClassReader(bytecodes), false, new PrintWriter(System.out));
    Class<?> clazz = classLoader.defineClasse(className, bytecodes);
    MethodHandle target;
    try {
      target = MethodHandles.publicLookup().findStatic(clazz, nameHint,
          MethodType.genericMethodType(function.getFreeVars().size() + 1 + function.getParameters().size()));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
    return target;
  }
  
  MethodHandle createKlassMH(Klass klass) {
    String className = "class$" + klass.getName();
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
    
    String symbol = (String)script.dictionary.getConstantAt(constantIndex);
    Klass klass = script.resolveKlass(symbol);
    Object constant = (klass != null)? klass: symbol;
    
    //System.out.println("resolved symbol " + symbol + " as " + constant.getClass());
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_const(@SuppressWarnings("unused") Lookup lookup,  String name, @SuppressWarnings("unused") MethodType type) {
    Object constant;
    switch(name) {
    case "true":
      constant = true;
      break;
    case "false":
      constant = false;
      break;
    default:
      if (name.indexOf('_') == -1) {
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
        name = name.replace('_', '.');
        try {
          constant = Double.parseDouble(name);
        } catch(NumberFormatException e) {
          constant = new BigDecimal(name);
        }
      }
    }
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  private static final MethodHandle LAMBDA =
      findStatic(Script.class, "lambda", Object.class, Function.class, Object[].class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_lambda(Lookup lookup, @SuppressWarnings("unused") String name, MethodType type, int constantIndex) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    ProtoFun protoFun = (ProtoFun)script.dictionary.getConstantAt(constantIndex);
    
    List<String> freeVars = protoFun.freeVars;
    Lambda lambda = protoFun.lambda;
    List<Parameter> parameters = lambda.getParameters();
    Function function = new Function(script, freeVars,
        parameters.stream().map(Parameter::getName).collect(Collectors.toList()),
        script.resolveParameterTypeHints(parameters),
        lambda);
    
    // no free variables, always return the same function
    if (freeVars.isEmpty()) {
      return new ConstantCallSite(MethodHandles.constant(Object.class, function));
    }
    return new ConstantCallSite(LAMBDA.bindTo(function).asCollector(Object[].class, type.parameterCount()));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object lambda(Function function, Object[] boundValues) {
    // create a new lambda with the same values
    return new Function(function.getFreeVars(), function.getParameters(), function.getTypeHints(), function.getLambda(),
         __ -> MethodHandles.insertArguments(function.getTarget(), 0, boundValues)
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
    MethodHandle mh;
    if (selector instanceof Function) {
      mh = ((Function)selector).getTarget();
    } else {
      Klass klass;
      if (selector instanceof Klass) {
        klass = (Klass)selector;
        selector = "@init";
      } else {
        if (selector instanceof String) {
          klass = getKlass(args[0]);
        } else {
          throw new LinkageError("invalid selector " + selector + " of type " + selector.getClass());
        }
      }
      klass.initialize();  // need to run klass initializers if they exist
      Function method = klass.getMethodMap().get(selector);
      if (method == null) {
        throw new LinkageError("no method '" + selector + "' defined on " + klass.getName());
      }
      mh = method.getTarget();
    }
    if (args.length != mh.type().parameterCount()) {
      throw new LinkageError("wrong number of arguments(" + args.length + ") to call " + selector + ' ' + mh.type());
    }
    return mh.invokeWithArguments(args);
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
  
  private static final MethodHandle AS_THROWABLE = findStatic(Script.class, "asThrowable", Throwable.class, Object.class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_throwable(@SuppressWarnings("unused") Lookup lookup, @SuppressWarnings("unused") String name, @SuppressWarnings("unused") MethodType type) {
    return new ConstantCallSite(AS_THROWABLE);
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Throwable asThrowable(Object value) {
    return new Error(value.toString());
  }
  
  private static final MethodHandle AS_LIST = findStatic(Script.class, "asList", Object.class, Object[].class);
  private static final MethodHandle AS_MAP = findStatic(Script.class, "asMap", Object.class, Object[].class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_data(@SuppressWarnings("unused") Lookup lookup, String name, MethodType type) {
    MethodHandle mh;
    switch(name) {
    case "list":
      mh = AS_LIST;
      break;
    case "map":
      mh = AS_MAP;
      break;
    default:
      throw new LinkageError("unknown data structure " + name);
    }
    return new ConstantCallSite(mh.asCollector(Object[].class, type.parameterCount()));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object asList(Object[] values) {
    return new AbstractList<Object>() {
      @Override
      public Object get(int index) {
        return values[index];
      }
      @Override
      public int size() {
        return values.length;
      }
    };
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object asMap(Object[] values) {
    HashMap<Object, Object> map = new HashMap<>();
    for(int i = 0; i < values.length; i+=2) {
      map.put(values[i], values[i + 1]);
    }
    return Collections.unmodifiableMap(map);
  }
  
  @MethodInfo(hidden=true)
  public Object eval(Lambda lambda) throws Throwable {
    Objects.requireNonNull(lambda);
    Function main = new Function(this, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), lambda);
    main.setNameHint("main");
    return main.getTarget().invokeExact((Object)this);
  }
  
  // ---------------------------
  // public API !
  // ---------------------------
  
  @MethodInfo(name="class")
  public Klass createClass(Object symbol, Function body) throws Throwable {
    Objects.requireNonNull(symbol);
    Objects.requireNonNull(body);
    Klass klass;
    String name;
    List<String> parameters = body.getParameters();
    if (symbol instanceof String) { // new class !
      name = (String)symbol;
      klass = Klass.create(name, null, parameters, new HashMap<>());
      klass.def("@init", new Function(Collections.emptyList(),
          parameters,
          body.getTypeHints(),
          null,
          fun -> createKlassMH(klass)));
      klassCache.put(name, klass);
    } else {
      klass = (Klass)symbol;
      name = klass.getName();
    }
    if (body.getNameHint() == null) {
      body.setNameHint(klass.getName().replace('.',  '_') + "\\init");
    }
    klass.registerInitializer(this, body);  // delay initialization
    return klass;
  }
  
  @SuppressWarnings("static-method")
  public Function fieldAccessor(String name) {
    Objects.requireNonNull(name);
    return new Function(Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null,
        fun -> Script.bsm_field_get(null /*unused*/, name, null /*unused*/).dynamicInvoker()
        );
  }
  
  public Function methodAccessor(String name, int parameterCount) {
    Objects.requireNonNull(name);
    if (parameterCount < 0) {
      throw new IllegalArgumentException("parameterCount < 0");
    }
    return new Function(Collections.emptyList(),
        IntStream.range(0, parameterCount).mapToObj(value -> "arg" + value).collect(Collectors.toList()),
        Collections.nCopies(parameterCount, null),
        null,
        fun -> METHOD_CALL.bindTo(this).asCollector(Object[].class, parameterCount)
        );
  }
  
  public Object require(String filename) throws Throwable {
    Lambda lambda;
    Path path = Paths.get(filename);
    try(Reader reader = Files.newBufferedReader(path)) {
      lambda = ASTBuilder.parseScript(reader, path);
    }
    return eval(lambda);
  }
}
