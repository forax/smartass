package com.github.forax.smartass.ast;

import java.util.Collections;
import java.util.List;

public class Block extends Locatable implements Expr {
  private final List<Expr> exprs;

  Block(List<Expr> exprs, int lineNumber) {
    super(lineNumber);
    this.exprs = Collections.unmodifiableList(exprs);
  }
  
  public List<Expr> getExprs() {
    return exprs;
  }
}
