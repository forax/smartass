package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Klass {
  private final String name;
  private final Klass staticKlass;
  private final LinkedHashMap<String, MethodHandle> fieldMap;
  private final Map<String, Function[]> methodMap;
  private Class<?> javaClass;
  private Initializer initializer;
  
  private Klass(String name, Klass staticKlass, LinkedHashMap<String, MethodHandle> fieldMap, Map<String, Function[]> methodMap) {
    this.name = Objects.requireNonNull(name);
    this.staticKlass = staticKlass;  
    this.fieldMap = fieldMap;
    this.methodMap = methodMap;
  }
  
  static Klass create(String name, Klass staticKlass, List<String> fields, Map<String, Function[]> methodMap) {
    LinkedHashMap<String, MethodHandle> fieldMap = new LinkedHashMap<>();
    for(String field: fields) {
      fieldMap.put(field, null);
    }
    return new Klass(name, staticKlass, fieldMap, methodMap);
  }
  
  interface Initializer {
    void accept(Klass klass) throws Throwable;
  }
  
  void registerInitializer(Initializer initializer) {
    Initializer previousInitializer = this.initializer;
    this.initializer = klass -> {
      if (previousInitializer != null) {
        previousInitializer.accept(klass);
      }
      initializer.accept(klass);
    };
  }
  
  void initialize() throws Throwable {
    Initializer initializer = this.initializer;
    if (initializer != null) {
      this.initializer = null;
      initializer.accept(this);
    }
  }
  
  void setJavaClass(Class<?> javaClass) {
    Objects.requireNonNull(javaClass);
    if (this.javaClass != null) {
      throw new IllegalStateException("current klass already linked to a Java class");
    }
    this.javaClass = javaClass;
  }
  Class<?> getJavaClass() {
    if (javaClass == null) { 
      // The class is not yet created, force it's creation(FIXME)
      getInitMethod().getTarget();
      
      if (javaClass == null) {
        throw new AssertionError();
      }
    }
    return javaClass;
  }
  
  Map<String, MethodHandle> getFieldMap() {
    return fieldMap;
  }
  Map<String, Function[]> getMethodMap() {
    return methodMap;
  }
  
  Function getInitMethod() {
    for(Function function: methodMap.get("@init")) {
      if (function != null) {
        return function;
      }
    }
    throw new AssertionError("no method @init !");
  }
  
  
  //---------------------------
  // public API !
  // ---------------------------
 
  public Function def(String name, Function body) throws Throwable {
    Objects.requireNonNull(name);
    Objects.requireNonNull(body);
    initialize();
    
    int parameterCount = body.getParameters().size();
    Function[] functions = methodMap.get(name);
    if (functions == null) {
      functions = new Function[1 + parameterCount];
      methodMap.put(name, functions);
    } else if (functions.length <= parameterCount) {
      functions = Arrays.copyOf(functions, 1 + parameterCount);
      methodMap.put(name, functions);
    }
    
    if (functions[parameterCount] != null) {
      throw new LinkageError("a method " + name + " with " + parameterCount + " parameter(s) already exists in klass " + this.name);
    }
    functions[parameterCount] = body;
    if (body.getNameHint() == null) {
      body.setNameHint(name);
    }
    return body;
  }
  
  @Override
  public String toString() {
    return "klass " + name;
  }
  
  public String getName() {
    return name;
  }
  public Klass getStaticKlass() {
    return staticKlass;
  }
}
