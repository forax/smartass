package com.github.forax.smartass.ast;

public class While extends Locatable implements Expr {
  private final Expr condition;
  private final Block block;

  public While(Expr condition, Block block, Location location) {
    super(location);
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
