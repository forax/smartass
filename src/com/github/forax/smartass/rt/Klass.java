package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Klass {
  private final String name;
  private final Klass staticKlass;
  private final LinkedHashMap<String, MethodHandle> fieldMap;
  private final Map<String, Function> methodMap;
  private Initializer initializer;
  
  private Klass(String name, Klass staticKlass, LinkedHashMap<String, MethodHandle> fieldMap, Map<String, Function> methodMap) {
    this.name = Objects.requireNonNull(name);
    this.staticKlass = staticKlass;  
    this.fieldMap = fieldMap;
    this.methodMap = methodMap;
  }
  
  static Klass create(String name, Klass staticKlass, List<String> fields, Map<String, Function> methodMap) {
    LinkedHashMap<String, MethodHandle> fieldMap = new LinkedHashMap<>();
    for(String field: fields) {
      fieldMap.put(field, null);
    }
    return new Klass(name, staticKlass, fieldMap, methodMap);
  }
  
  private interface Initializer {
    void accept(Klass klass) throws Throwable;
  }
  
  void registerInitializer(Script script, Function function) {
    Initializer initializer = this.initializer;
    this.initializer = klass -> {
      if (initializer != null) {  // call previous initializer
        initializer.accept(klass);
      }
      
      List<String> parameters = function.getParameters();
      Object[] args = new Object[1 + parameters.size()];
      args[0] = klass;
      for(int i = 1; i < args.length; i++) {
        args[i] = script.fieldAccessor(parameters.get(i - 1));
      }
      function.getTarget().invokeWithArguments(args);
    };
  }
  
  void initialize() throws Throwable {
    Initializer initializer = this.initializer;
    if (initializer != null) {
      this.initializer = null;
      initializer.accept(this);
    }
  }
  
  Set<String> getFields() {
    return fieldMap.keySet();
  }
  Map<String, Function> getMethodMap() {
    return methodMap;
  }
  
  
  //---------------------------
  // public API !
  // ---------------------------
 
  public Function def(String name, Function body) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(body);
    if (methodMap.get(name) != null) {
      throw new LinkageError("a method " + name + " already exist in klass " + this.name);
    }
    methodMap.put(name, body);
    if (body.getNameHint() == null) {
      body.setNameHint(name);
    }
    return body;
  }
  
  public Function getMethod(String name) {
    Objects.requireNonNull(name);
    return methodMap.get(name);
  }
  
  public String getName() {
    return name;
  }
  
  public Klass getStaticKlass() {
    return staticKlass;
  }
}
