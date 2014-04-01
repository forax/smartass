package com.github.forax.smartass.ast;

public class VarAssignment extends Locatable implements Expr {
  private final String id;
  private final Expr expr;

  VarAssignment(String id, Expr expr, int lineNumber) {
    super(lineNumber);
    this.id = id;
    this.expr = expr;
  }
  
  public String getId() {
    return id;
  }
  public Expr getExpr() {
    return expr;
  }
}
