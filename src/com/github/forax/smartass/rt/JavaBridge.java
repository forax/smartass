package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;import java.util.stream.IntStream;

class JavaBridge {
  static Klass javaClasstoKlass(Class<?> type, ClassValue<Klass> klasses) {
    // Java class, not a class generated by the runtime
    String klassName = type.getName();
    
    HashMap<String, Function> classFunMap = new HashMap<>();
    HashMap<String, Function> staticFunMap = new HashMap<>();
    populateKlassWithStaticFields(type, staticFunMap);
    
    HashMap<String, ArrayList<Method>> classMap = new HashMap<>();
    HashMap<String, ArrayList<Method>> staticMap = new HashMap<>();
    gatherMethods(type, classMap, staticMap);
    populateKlassWithMethods(classFunMap, classMap); 
    populateKlassWithMethods(staticFunMap, staticMap); 
    
    // add all methods defined in Klass to the static klass
    if (type != Klass.class) { // avoid infinite recursion
      staticFunMap.putAll(klasses.get(Klass.class).getMethodMap());
    } else {
      staticFunMap.putAll(classFunMap);
    }
    
    Klass staticKlass = Klass.create("static-" + klassName, null, Collections.emptyList(), staticFunMap);
    Klass klass = Klass.create(klassName, staticKlass, Collections.emptyList(), classFunMap);
    return klass;
  }

  private static void populateKlassWithStaticFields(Class<?> type,
      HashMap<String, Function> staticFunMap) {
    for(Field field: type.getFields()) {
      int modifiers = field.getModifiers();
      if (!(Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers))) {
        continue;
      }
      
      //System.out.println("register field " + field.getName());
      staticFunMap.put(field.getName(),
          Function.createFromMH(Collections.emptyList(),
              fun -> {
                MethodHandle mh;
                try {
                  mh = MethodHandles.publicLookup().unreflectGetter(field);
                } catch (IllegalAccessException e) {
                  mh = MethodHandles.throwException(Object.class, LinkageError.class);
                }  
                mh = mh.asType(mh.type().generic());
                // a static method should skip the first parameter
                return MethodHandles.dropArguments(mh, 0, Object.class);
              }));
    }
  }
  
  private static void populateKlassWithMethods(HashMap<String, Function> funMap, HashMap<String, ArrayList<Method>> classMap) {
    classMap.forEach((name, methods) -> {
      Method method = methods.get(0);
      List<String> params = Arrays.stream(method.getParameters()).map(Parameter::getName).collect(Collectors.toList());
      Function function = Function.createFromMH(params,
          fun -> {
            if (methods.size() == 1) {
              return createMH(methods.get(0));
            }
            Class<?>[][] parameters = methods.stream()
                .map((java.util.function.Function<Method,Class<?>[]>)Method::getParameterTypes)
                .toArray(Class<?>[][]::new);
            
            //System.out.println("create decision tree " + methods);
            
            MethodHandle[] mhs = methods.stream().map(JavaBridge::createMH).toArray(MethodHandle[]::new);
            int[] indexes = IntStream.range(0, mhs.length).toArray();
            
            return createDecisionTree(parameters[0].length, parameters, 0, mhs, indexes, 0, indexes.length - 1);
          });
      funMap.put(name, function);
    });
  }
  
  private static MethodHandle createDecisionTree(int length, Class<?>[][] parameters, int parameterIndex,
      MethodHandle[] mhs, int[] indexes, int start, int end) {
    
    HashSet<Class<?>> typeSet = new HashSet<>();
    for(int j = 0; j < parameters.length; j++) {
      typeSet.add(parameters[j][parameterIndex]);
    }

    if (typeSet.size() == 1) {  // parameter types are all the same, look for the next parameter
      return createDecisionTree(length, parameters, parameterIndex + 1, mhs, indexes, start, end);
    }

    Class<?>[] types = typeSet.toArray(new Class<?>[typeSet.size()]);
    Arrays.sort(types, JavaBridge::compareByType);

    //System.out.println("types sorted " + Arrays.toString(types));
    
    MethodHandle[] targets = new MethodHandle[types.length];
    
    for(int j = types.length; --j >=0;) {
      Class<?> type = types[j];
      
      //System.out.println("pick " + type);
      
      int last = end;
      for(int i = start; i <= last;) {
        int index = indexes[i];
        Class<?> methodParameterType = parameters[index][parameterIndex];
        
        //System.out.println("type check: " + type + ' ' + methodParameterType + ": " + isSubTypeOf(type, methodParameterType));
        
        if (type == methodParameterType) {
          i++;
          continue;
        }
        // swap index at i and last
        indexes[i] = indexes[last];
        indexes[last] = index;
        last--;
      }
      
      MethodHandle mh;
      if (start == last) {
        mh = mhs[indexes[start]];
      } else {
        mh = createDecisionTree(length, parameters, parameterIndex + 1, mhs, indexes, start, last);
      }
      targets[j] = mh;
      
      start = last + 1;
    }
    
    return createTreeFromMHs(parameterIndex, types, targets);
  }
  
  private static MethodHandle createTreeFromMHs(int parameterIndex, Class<?>[] types, MethodHandle[] targets) {
    MethodHandle tree = targets[0];
    for(int i = 1; i<types.length; i++) {
      Class<?> type = types[i];
      if (type.isPrimitive()) {
        type = boxedType(type);
      } 
      MethodHandle test = MethodHandles.dropArguments(IS_INSTANCE.bindTo(type), 0, Collections.nCopies(1 + parameterIndex, Object.class));
      tree = MethodHandles.guardWithTest(test, targets[i], tree);
    }
    return tree;
  }

  
  
  private static int compareByType(Class<?> type1, Class<?> type2) {
    assert type1 != type2;  // the types must be different
    
    if (type1.isPrimitive()) {
      if (type2.isPrimitive()) {
        if (type1 != boolean.class && type2 != boolean.class) {
          int ordinal1 = ordinalType(type1);
          int ordinal2 = ordinalType(type2);
          if (ordinal1 != ordinal2) {  // not comparable like short and char
            return ordinal1 - ordinal2;  
          }
        }
      } else {
        if (type2 == Object.class) {
          return 1;
        }
      }
    } else {
      if (type1 == Object.class && type2.isPrimitive()) {
        return -1;
      }
    }
    
    if (type1.isAssignableFrom(type2)) {
      return -1;
    }
    if (type2.isAssignableFrom(type1)) {
      return 1;
    }
    return type1.getName().compareTo(type2.getName());  // make it stable
  }
  
  private static int ordinalType(Class<?> type) {
    if (type == int.class) {
      return 4;
    }
    if (type == double.class) {
      return 1;
    }
    if (type == char.class) {
      return 5;
    }
    if (type == byte.class) {
      return 6;
    }
    if (type == long.class) {
      return 3;
    }
    if (type == float.class) {
      return 2;
    }
    return 5;  // short
  }
  
  private static Class<?> boxedType(Class<?> type) {
    if (type == int.class) {
      return Integer.class;
    }
    if (type == double.class) {
      return Double.class;
    }
    if (type == char.class) {
      return Character.class;
    }
    if (type == byte.class) {
      return Byte.class;
    }
    if (type == long.class) {
      return Long.class;
    }
    if (type == float.class) {
      return Float.class;
    }
    return Short.class;  // short
  }

  private static MethodHandle createMH(Method method) {
    int modifiers = method.getModifiers();
    boolean isStatic = Modifier.isStatic(modifiers);
    Class<?> declaringClass = method.getDeclaringClass();
    MethodHandle mh;
    try {
      if (isStatic || Modifier.isPublic(declaringClass.getModifiers())) {
        mh = MethodHandles.publicLookup().unreflect(method);
        if (isStatic) {
          // a static method should skip the first parameter
          mh = MethodHandles.dropArguments(mh, 0, Object.class);
        }
      } else {
        mh = findVirtualMHInHierarchy(declaringClass, method.getName(),
               MethodType.methodType(method.getReturnType(), method.getParameterTypes()));
      
      }
    } catch (IllegalAccessException e) {
      return willThrowAnException(method, e);
    }
    return conversionFilter(mh);
  }
  
  private static MethodHandle willThrowAnException(Method method, Exception e) {
    MethodHandle mh = MethodHandles.throwException(method.getReturnType(), IllegalAccessException.class);
    mh = mh.bindTo(e);
    return MethodHandles.dropArguments(mh, 0,
        MethodType.genericMethodType(1 + method.getParameterCount()).parameterList());
  }
  
  private static MethodHandle findVirtualMHInHierarchy(Class<?> declaringClass, String name, MethodType methodType) throws IllegalAccessException {
    // first lookup in super class hierarchy
    LinkedHashSet<Class<?>> interfaces = new LinkedHashSet<>();
    Collections.addAll(interfaces, declaringClass.getInterfaces());
    for(Class<?> type = declaringClass.getSuperclass(); type != null; type = type.getSuperclass()) {
      if (Modifier.isPublic(type.getModifiers())) {
        try {
          return MethodHandles.publicLookup().findVirtual(type, name, methodType);
        } catch(NoSuchMethodException e) {
          Collections.addAll(interfaces, type.getInterfaces());
          break;
        }
      }
      Collections.addAll(interfaces, type.getInterfaces());
    }
    
    // not found in the super class hierarchy, try interface hierarchy
    ArrayDeque<Class<?>> queue = new ArrayDeque<>(interfaces);
    Class<?> interfaceType;
    while((interfaceType = queue.poll()) != null) {
      if (Modifier.isPublic(interfaceType.getModifiers())) {
        try {
          return MethodHandles.publicLookup().findVirtual(interfaceType, name, methodType);
        } catch(NoSuchMethodException e) {
          // do nothing
        }
      }
      for(Class<?> iType: interfaceType.getInterfaces()) {
        if (interfaces.add(iType) == true) {  // only add unknown interface to the queue
          queue.add(iType); 
        }
      }
    }
    throw new IllegalAccessException("method " + declaringClass.getName() + '.' + name + methodType + " not visible");
  }

  private static final MethodHandle IS_INSTANCE;
  private static final MethodHandle FUNCTION_TEST;
  private static final MethodHandle PROXY_FUNCTION;
  private static final MethodHandle IDENTITY;
  static {
    Lookup lookup = MethodHandles.lookup();
    MethodHandle isInstance, proxyFunction;
    try {
      isInstance = lookup.findVirtual(Class.class, "isInstance",
          MethodType.methodType(boolean.class, Object.class));
      proxyFunction = lookup.findStatic(JavaBridge.class, "proxyFunction",
          MethodType.methodType(Object.class, Class.class, Object.class));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new AssertionError(e);
    }
    PROXY_FUNCTION = proxyFunction.asType(MethodType.methodType(Object.class, Class.class, Object.class));
    IS_INSTANCE = isInstance;
    FUNCTION_TEST = isInstance.bindTo(Function.class);
    IDENTITY = MethodHandles.identity(Object.class);
  }
  
  private static MethodHandle conversionFilter(MethodHandle mh) {
    MethodType type = mh.type();
    int parameterCount = type.parameterCount();
    MethodHandle[] filters = new MethodHandle[parameterCount];
    for(int i = 0; i < parameterCount; i++) {
      Class<?> parameterType = type.parameterType(i);
      if (parameterType.isInterface()) {
        MethodHandle filter = MethodHandles.guardWithTest(FUNCTION_TEST, PROXY_FUNCTION.bindTo(parameterType), IDENTITY);
        filters[i] = filter;
      }
    }
    mh = mh.asType(type.generic());
    return MethodHandles.filterArguments(mh, 0, filters);
  }
  
  @SuppressWarnings("unused")  // called using a method handle
  private static Object proxyFunction(Class<?> interfaceType, Object fun) {
    Function function = (Function)fun;
    return Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class<?>[]{interfaceType},
        (Object proxy, Method method, Object[] args) -> {
          if (method.isDefault() || method.getDeclaringClass() == Object.class) {
            return method.invoke(proxy, args);
          }
          Object[] arguments = new Object[1 + args.length];
          arguments[0] = proxy;
          System.arraycopy(args, 0, arguments, 1, args.length);
          return function.getTarget().invokeWithArguments(arguments);
        });
  }

  private static void gatherMethods(Class<?> type,
      HashMap<String, ArrayList<Method>> classMap,
      HashMap<String, ArrayList<Method>> staticMap) {
    for(Method method: type.getMethods()) {
      if (method.getDeclaringClass() == Object.class) {
        continue;  // skip java.lang.Object's methods, objects have no identity
      }
      
      String name;
      MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
      if (methodInfo != null) {
        if (methodInfo.hidden()) {
          continue;
        }
        name = methodInfo.name();
      } else {
        name = method.getName();
      }
      
      boolean isStatic = Modifier.isStatic(method.getModifiers());
      
      HashMap<String, ArrayList<Method>> map = (isStatic)? staticMap: classMap;
      ArrayList<Method> list = map.get(name);
      if (list == null) {
        list = new ArrayList<>();
        list.add(method);
        map.put(name, list);
      } else {
        Method firstMethod = list.get(0);
        int count = method.getParameterCount();
        int firstCount = firstMethod.getParameterCount();
        if (count == firstCount) {
          list.add(method);
        } else {
          if (count < firstCount) {
            // just forget it
          } else {
            // we have a new king !
            list = new ArrayList<>();
            list.add(method);
            map.put(name, list);
          }
        }
      }
    }
  }
}
