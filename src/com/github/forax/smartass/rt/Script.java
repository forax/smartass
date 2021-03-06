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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import com.github.forax.smartass.util.SmartList;
import com.github.forax.smartass.util.SmartMap;

public final class Script {
  private final ConstantDictionary dictionary = new ConstantDictionary();
  private final ScriptClassLoader classLoader = new ScriptClassLoader();
  final HashMap<String, Klass> klassCache = new HashMap<>();
  
  final ThreadLocal<Klass> threadLocal = new ThreadLocal<>();
  private final ClassValue<Klass> klasses = new ClassValue<Klass>() {
    @Override
    protected Klass computeValue(Class<?> type) {
      Klass klass = threadLocal.get();
      if (klass != null) {
        klass.setJavaClass(type);
        return klass;
      }
      
      // transform a Java class to a Klass
      klass = JavaBridge.javaClasstoKlass(type, this);
      klass.setJavaClass(type);
      klassCache.put(type.getName(), klass);
      return klass;
    }
  };
  private final Klass klassOfNull = klasses.get(Void.class);
  
  public Script() {
    // empty
  }
  
  private void linkKlass(Class<?> type, Klass klass) {
    klassCache.put(klass.getName(), klass);
    threadLocal.set(klass);
    try {
      if (klasses.get(type) != klass) {
        throw new IllegalStateException("Java class already linked to a klass");
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
      if (!Character.isJavaIdentifierPart(id.charAt(i))) {
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
    
    //System.out.println("rewrite " + nameHint);
    
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
    
    //System.out.println("createFunctionMH:" + function);
    //System.out.println("isTypeHintsEnabled:" + function.isTypeHintsEnabled());
    //System.out.println("function: freevars + receiver" + (1 + function.getFreeVars().size()));
    
    List<Klass> parameterTypeHints = resolveParameterTypeHints(function.getLambdaOptional().getParameters());
    target = assertTypeHints(target, function.getFreeVars().size() + 1, parameterTypeHints);
    //System.out.println("assert typeHint for " + function.getNameHint());
    
    return target;
  }
  
  private static final MethodHandle TYPE_ASSERT = findVirtual(Class.class, "cast", Object.class, Object.class);
  
  private static MethodHandle assertTypeHints(MethodHandle target, int startOfFirstParameter, List<Klass> parameterTypeHints) {
    MethodHandle[] filters = null;
    for(int i = 0; i<parameterTypeHints.size(); i++) {
      Klass typeHint = parameterTypeHints.get(i);
      if (typeHint != null) {
        if (filters == null) {
          filters = new MethodHandle[parameterTypeHints.size()];
        }
        filters[i] = TYPE_ASSERT.bindTo(typeHint.getJavaClass());
      }
    }
    if (filters == null) {
      return target;
    }
    return MethodHandles.filterArguments(target, startOfFirstParameter, filters);
  }
  
  MethodHandle createKlassMH(Klass klass) {
    String className = "class$" + klass.getName();
    String internalName = className.replace('.', '/');
    
    ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
    writer.visit(V1_8, ACC_PUBLIC|ACC_SUPER, internalName, null, "java/lang/Object", null);
    Set<String> fields = klass.getFieldMap().keySet();
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
  public static CallSite bsm_symbol(Lookup lookup, String name, @SuppressWarnings("unused")MethodType mtype, String symbol) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    
    Object constant = script.resolveKlass(symbol);
    if (constant == null) {
      if (!name.equals("symbolOrString")) {
        throw new BootstrapMethodError("unknown local variable " + symbol);
      }
      constant = symbol;
    }
    
    //System.out.println("resolved symbol " + symbol + " as " + constant.getClass());
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_const(@SuppressWarnings("unused") Lookup lookup,  @SuppressWarnings("unused") String name, @SuppressWarnings("unused") MethodType type, String literal) {
    Object constant;
    switch(literal) {
    case "true":
      constant = true;
      break;
    case "false":
      constant = false;
      break;
    default:
      if (literal.charAt(0) == '"') { // string literal ?
        constant = literal.substring(1, literal.length() - 1);
      } else {
        if (literal.indexOf('.') == -1) {   // integer value ?
          try {
            constant = Integer.parseInt(literal);
          } catch(NumberFormatException e) {
            try {
              constant = Long.parseLong(literal);
            } catch(NumberFormatException e2) {
              constant = new BigInteger(literal);
            } 
          }
        } else {
          try {
            constant = Double.parseDouble(literal);
          } catch(NumberFormatException e) {
            constant = new BigDecimal(literal);
          }
        }
      }
    }
    return new ConstantCallSite(MethodHandles.constant(Object.class, constant));
  }
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_lambda(Lookup lookup, @SuppressWarnings("unused") String name, MethodType type, int constantIndex) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    ProtoFun protoFun = (ProtoFun)script.dictionary.getConstantAt(constantIndex);
    List<String> freeVars = protoFun.freeVars;
    Lambda lambda = protoFun.lambda;
    List<String> parameters = lambda.getParameters().stream().map(Parameter::getName).collect(Collectors.toList());
    
    // no free variables, always return the same function
    if (freeVars.isEmpty()) {
      Function function = Function.createFromLambda(script, freeVars, parameters, lambda);
      return new ConstantCallSite(MethodHandles.constant(Object.class, function));
    }
    
    BoundInfo boundInfo = new BoundInfo(script, freeVars, parameters, lambda);
    return new ConstantCallSite(BOUND_FUNCTION.bindTo(boundInfo).asCollector(Object[].class, type.parameterCount()));
  }
  
  private static final MethodHandle BOUND_FUNCTION =
      findVirtual(BoundInfo.class, "createBoundFunction", Object.class, Object[].class);
  
  static class BoundInfo {
    private final Script script;
    private final List<String> freeVars;
    private final List<String> parameters;
    private final Lambda lambda;
    private MethodHandle cache;
    
    BoundInfo(Script script, List<String> freeVars, List<String> parameters, Lambda lambda) {
      this.script = script;
      this.freeVars = freeVars;
      this.parameters = parameters;
      this.lambda = lambda;
    }
    
    //called from a method handle
    Object createBoundFunction(Object[] boundValues) {
      return Function.createFromLambda(freeVars, parameters, lambda,
          fun -> {
            MethodHandle target = cache;
            if (target == null) {
              cache = target = script.createFunctionMH(fun);
            }
            return MethodHandles.insertArguments(target, 0, boundValues);
          });
    }
  }
  
  private static final MethodHandle FIELD_GET =
      findStatic(Script.class, "field_get", Object.class, Script.class, String.class, Object.class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_field_get(Lookup lookup, String name, @SuppressWarnings("unused") MethodType type) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    return new ConstantCallSite(FIELD_GET.bindTo(script).bindTo(name));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object field_get(Script script, String name, Object receiver) throws Throwable {
    //System.out.println("bsm_get " + receiver.getClass() +" " + name);
    Klass klass = script.getKlass(receiver);
    MethodHandle target = klass.getFieldMap().computeIfAbsent(name, fieldName -> {
      try {
        MethodHandle mh = MethodHandles.publicLookup().findGetter(klass.getJavaClass(), fieldName, Object.class);
        return mh.asType(MethodType.methodType(Object.class, Object.class));
      } catch (NoSuchFieldException | IllegalAccessException e) {
        throw (LinkageError)new LinkageError().initCause(e);
      }
    });
    return target.invokeExact(receiver);
  }
  
  private static final MethodHandle METHOD_CALL =
      findVirtual(Script.class, "method_call", Object.class, Object.class, Object[].class);
  
  @MethodInfo(hidden=true)
  public static CallSite bsm_method_call(Lookup lookup, @SuppressWarnings("unused") String name, MethodType type) {
    ScriptClassLoader classLoader = (ScriptClassLoader)lookup.lookupClass().getClassLoader();
    Script script = classLoader.getScript();
    return new ConstantCallSite(METHOD_CALL.bindTo(script)
                                           .asCollector(Object[].class, type.parameterCount() - 1)
                                           .asType(type));
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private Object method_call(Object selector, Object[] args) throws Throwable {
    MethodHandle mh;
    if (selector instanceof Function) {
      mh = ((Function)selector).getTarget();
      if (args.length != mh.type().parameterCount()) {
        throw new LinkageError("wrong number of arguments(" + (args.length - 1)+ ") to call " + selector + ' ' + mh.type());
      }
    } else {
      Klass klass;
      if (selector instanceof Klass) {
        klass = (Klass)selector;
        selector = "@init";
      } else {
        if (selector instanceof String) {
          klass = getKlass(args[0]);
        } else {
          throw new LinkageError("invalid selector " + selector + " of klass " + getKlass(selector).getName());
        }
      }
      klass.initialize();  // need to run klass initializers if they exist
      Function[] functions = klass.getMethodMap().get(selector);
      if (functions == null) {
        throw new LinkageError("no method '" + selector + "' defined on " + klass.getName());
      }
      Function method;
      int parameterCount = args.length - 1;
      if (parameterCount >= functions.length || ((method = functions[parameterCount]) == null)) {
        throw new LinkageError("wrong number of arguments(" + parameterCount + ") to call " + selector);
      }
      mh = method.getTarget();
    }
    return mh.invokeWithArguments(args);
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
  private static Object asList(Object[] array) {
    return new SmartList(array);
  }
  
  @SuppressWarnings("unused")  // called from a method handle
  private static Object asMap(Object[] array) {
    LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
    for(int i = 0; i < array.length; i+=2) {
      map.put(array[i], array[i + 1]);
    }
    return new SmartMap(map);
  }
  
  // ---------------------------
  // public API !
  // ---------------------------
  
  @MethodInfo(name="class")
  public Klass defClass(Object symbol, Map<String,Object> parameterMap, Function body) throws Throwable {
    Objects.requireNonNull(symbol);
    Objects.requireNonNull(parameterMap);
    Objects.requireNonNull(body);
    
    if (!body.getParameters().isEmpty()) {
      throw new IllegalStateException("init function shoulld have no parameters");
    }
    
    Klass klass;
    if (symbol instanceof String) { // new class !
      String name = (String)symbol;
      List<String> parameters = parameterMap.keySet().stream().map(key -> (String)key).collect(Collectors.toList());
      klass = Klass.create(name, null, parameters, new HashMap<>());
      klass.def("@init", Function.createFromMH(parameters,
          __ -> {
            List<Klass> typeHints = parameterMap.values().stream().map(typeName -> {
              if (typeName instanceof String) {
                Klass typeHint = resolveKlass((String)typeName);
                if (typeHint == null) {
                  throw new LinkageError("invalid type name  " + typeName);
                }
                return typeHint;  
              }
              return (Klass)typeName;  // may be null
            }).collect(Collectors.toList());
            return assertTypeHints(createKlassMH(klass), 1, typeHints);
          }));
      alias(name, klass);
    } else {
      klass = (Klass)symbol;
    }
    
    if (body.getNameHint() == null) {
      body.setNameHint(klass.getName().replace('.',  '_') + "_init");
    }
    klass.registerInitializer(klazz -> body.getTarget().invoke(klazz));  // delay initialization
    //body.getTarget().invoke(klass);  // direct call
    return klass;
  }
  
  public Klass alias(String name, Klass klass) {
    if (klassCache.get(name) != null) {
      throw new IllegalStateException("klass " + name +" is already defined");
    }
    klassCache.put(name, klass);
    return klass;
  }
  
  public Object eval(Lambda lambda, String name, Object... arguments) throws Throwable {
    Objects.requireNonNull(lambda);
    Function main = Function.createFromLambda(this,
        Collections.emptyList(),
        lambda.getParameters().stream().map(Parameter::getName).collect(Collectors.toList()),
        lambda);
    main.setNameHint(name);
    Object[] args = new Object[1 + arguments.length];
    args[0] = this;
    System.arraycopy(arguments, 0, args, 1, arguments.length);
    return main.getTarget().invokeWithArguments(args);
  }
  
  public Function fieldAccessor(String name) {
    Objects.requireNonNull(name);
    return Function.createFromMH(Collections.emptyList(),
        fun -> FIELD_GET.bindTo(this).bindTo(name)
        );
  }
  
  public Function methodAccessor(String name, int parameterCount) {
    Objects.requireNonNull(name);
    if (parameterCount < 0) {
      throw new IllegalArgumentException("parameterCount < 0");
    }
    return Function.createFromMH(
        IntStream.range(0, parameterCount).mapToObj(value -> "arg" + value).collect(Collectors.toList()),
        __ -> METHOD_CALL.bindTo(this).asCollector(Object[].class, parameterCount)
        );
  }
  
  public Object require(String filename) throws Throwable {
    Lambda lambda;
    Path path = Paths.get(filename);
    try(Reader reader = Files.newBufferedReader(path)) {
      lambda = ASTBuilder.parseScript(reader, path);
    }
    return eval(lambda, "main");
  }
}
