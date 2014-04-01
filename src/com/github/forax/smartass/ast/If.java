package com.github.forax.smartass.ast;

import java.util.Objects;

public class If extends Locatable implements Expr {
  private final Expr condition;
  private final Block trueBlock;
  private final Block falseBlock;

  If(Expr condition, Block trueBlock, Block falseBlock, int lineNmber) {
    super(lineNmber);
    this.condition = Objects.requireNonNull(condition);
    this.trueBlock = Objects.requireNonNull(trueBlock);
    this.falseBlock = falseBlock;
  }

  public Expr getCondition() {
    return condition;
  }
  public Block getTrueBlock() {
    return trueBlock;
  }
  public Block getFalseBlockOptional() {
    return falseBlock;
  }
}
