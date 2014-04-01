package com.github.forax.smartass.ast;

public class While extends Locatable implements Expr {
  private final Expr condition;
  private final Block block;

  public While(Expr condition, Block block, int lineNumber) {
    super(lineNumber);
    this.condition = condition;
    this.block = block;
  }
  
  public Expr getCondition() {
    return condition;
  }
  public Block getBlock() {
    return block;
  }
}
