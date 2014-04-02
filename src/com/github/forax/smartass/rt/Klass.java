package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Klass {
  private final String name;
  private final Klass staticKlass;
  private final LinkedHashMap<String, MethodHandle> fieldMap;
  private final HashMap<String, Function> methodMap = new HashMap<>();
  
  private Klass(String name, Klass staticKlass, LinkedHashMap<String, MethodHandle> fieldMap) {
    this.name = Objects.requireNonNull(name);
    this.staticKlass = staticKlass;  
    this.fieldMap = fieldMap;
  }
  
  static Klass create(String name, Klass staticKlass, List<String> fields) {
    LinkedHashMap<String, MethodHandle> fieldMap = new LinkedHashMap<>();
    for(String field: fields) {
      fieldMap.put(field, null);
    }
    return new Klass(name, staticKlass, fieldMap);
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
