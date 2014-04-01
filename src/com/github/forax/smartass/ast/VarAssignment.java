package com.github.forax.smartass.ast;

import java.util.Objects;

public class VarAssignment extends Locatable implements Expr {
  private final String id;
  private final Expr expr;

  VarAssignment(String id, Expr expr, int lineNumber) {
    super(lineNumber);
    this.id = Objects.requireNonNull(id);
    this.expr = Objects.requireNonNull(expr);
  }
  
  public String getId() {
    return id;
  }
  public Expr getExpr() {
    return expr;
  }
}
