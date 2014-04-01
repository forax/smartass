package com.github.forax.smartass.ast;

import java.util.Objects;

public class While extends Locatable implements Expr {
  private final Expr condition;
  private final Block block;

  While(Expr condition, Block block, int lineNumber) {
    super(lineNumber);
    this.condition = Objects.requireNonNull(condition);
    this.block = Objects.requireNonNull(block);
  }
  
  public Expr getCondition() {
    return condition;
  }
  public Block getBlock() {
    return block;
  }
}
