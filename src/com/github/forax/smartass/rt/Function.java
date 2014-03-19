package com.github.forax.smartass.rt;

import java.lang.invoke.MethodHandle;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;

import com.github.forax.smartass.ast.Block;

public class Function {
  private final List<String> freeVars;
  private final List<String> parameters;
  private final Block block;
  private final BiFunction<Script, Function, MethodHandle> createTarget;
  private MethodHandle target;

  Function(List<String> freeVars, List<String> parameters, Block block, BiFunction<Script, Function, MethodHandle> createTarget) {
    this.freeVars = Objects.requireNonNull(freeVars);
    this.parameters = Objects.requireNonNull(parameters);
    this.block = block;
    this.createTarget = Objects.requireNonNull(createTarget);
  }
  
  Function(List<String> freeVars, List<String> parameters, Block block) {
    this(freeVars, parameters, block, Script::createFunctionMH);
  }
  
  @Override
  public String toString() {
    return "lambda" + parameters;
  }
 
  MethodHandle getTarget(Script script) {
    if (target != null) {
      return target;
    }
    return target = createTarget.apply(script, this);
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
  public Block getBlock() {
    return block;
  }
}