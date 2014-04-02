package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.github.forax.smartass.ast.Lambda;

public class Function {
  private final List<String> freeVars;
  private final List<String> parameters;
  private final List<Klass> typeHints;
  private final Lambda lambda;
  private final java.util.function.Function<Function, MethodHandle> createTarget;
  private String nameHint;
  private MethodHandle target;

  Function(List<String> freeVars, List<String> parameters, List<Klass> typeHints, Lambda lambda, java.util.function.Function<Function, MethodHandle> createTarget) {
    this.freeVars = Objects.requireNonNull(freeVars);
    this.parameters = Objects.requireNonNull(parameters);
    this.typeHints = Objects.requireNonNull(typeHints);
    this.lambda = lambda;
    this.createTarget = Objects.requireNonNull(createTarget);
  }
  
  Function(Script script, List<String> freeVars, List<String> parameters, List<Klass> typeHints, Lambda lambda) {
    this(freeVars, parameters, typeHints, lambda, script::createFunctionMH);
  }
  
  @Override
  public String toString() {
    return ((nameHint != null)? nameHint: "lambda") + parameters.stream().collect(Collectors.joining(",", "(", ")"));
  }
  
  String getNameHint() {
    return nameHint;
  }
  void setNameHint(String nameHint) {
    Objects.requireNonNull(nameHint);
    if (this.nameHint != null) {
      throw new IllegalStateException();
    }
    this.nameHint = nameHint;
  }
  
  MethodHandle getTarget() {
    if (target != null) {
      return target;
    }
    return target = createTarget.apply(this);
  }
  
  //---------------------------
  // public API !
  // ---------------------------
  
  public List<String> getFreeVars() {
    return freeVars;
  }
  public List<String> getParameters() {
    return parameters;
  }
  public List<Klass> getTypeHints() {
    return typeHints;
  }
  public Lambda getLambda() {
    return lambda;
  }
}
