package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.github.forax.smartass.ast.Lambda;

public final class Function {
  private final List<String> freeVars;
  private final List<String> parameters;
  private final Lambda lambda;
  private final java.util.function.Function<Function, MethodHandle> createTarget;
  private String nameHint;
  private MethodHandle target;

  private Function(List<String> freeVars, List<String> parameters, Lambda lambda, java.util.function.Function<Function, MethodHandle> createTarget) {
    this.freeVars = Objects.requireNonNull(freeVars);
    this.parameters = Objects.requireNonNull(parameters);
    this.lambda = lambda;
    this.createTarget = Objects.requireNonNull(createTarget);
  }
  
  static Function createFromLambda(Script script, List<String> freeVars, List<String> parameters, Lambda lambda) {
    return createFromLambda(freeVars, parameters, lambda, script::createFunctionMH);
  }
  static Function createFromLambda(List<String> freeVars, List<String> parameters, Lambda lambda, java.util.function.Function<Function, MethodHandle> createTarget) {
    return new Function(freeVars, parameters, Objects.requireNonNull(lambda), createTarget);
  }
  
  static Function createFromMH(List<String> parameters, java.util.function.Function<Function, MethodHandle> createTarget) {
    return new Function(Collections.emptyList(), parameters, null, createTarget);
  }
  
  @Override
  public String toString() {
    return ((nameHint != null)? nameHint: "lambda") + parameters.stream().collect(Collectors.joining(",", "(", ")"));
  }
  
  List<String> getFreeVars() {
    return freeVars;
  }
  
  String getNameHint() {
    return nameHint;
  }
  void setNameHint(String nameHint) {
    Objects.requireNonNull(nameHint);
    if (this.nameHint != null) {
      throw new IllegalStateException(" name hint already set");
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
  
  public List<String> getParameters() {
    return parameters;
  }
  public Lambda getLambdaOptional() {
    return lambda;
  }
}
