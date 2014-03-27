package com.github.forax.smartass.ast;

import java.util.Collections;
import java.util.List;

public class Lambda extends Locatable implements Expr {
  private final List<Parameter> parameters;
  private final Block block;

  Lambda(List<Parameter> parameters, Block block, Location location) {
    super(location);
    this.parameters = Collections.unmodifiableList(parameters);
    this.block = block;
  }
  
  public List<Parameter> getParameters() {
    return parameters;
  }
  public Block getBlock() {
    return block;
  }
}
