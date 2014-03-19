package com.github.forax.smartass.ast;

public class If extends Locatable implements Expr {
  private final Expr condition;
  private final Block trueBlock;
  private final Block falseBlock;

  public If(Expr condition, Block trueBlock, Block falseBlock, Location location) {
    super(location);
    this.condition = condition;
    this.trueBlock = trueBlock;
    this.falseBlock = falseBlock;
  }

  public Expr getCondition() {
    return condition;
  }
  public Block getTrueBlock() {
    return trueBlock;
  }
  public Block getFalseBlock() {
    return falseBlock;
  }
}
