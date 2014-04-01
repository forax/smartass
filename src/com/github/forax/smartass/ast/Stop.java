package com.github.forax.smartass.ast;

public class Stop extends Locatable implements Expr {
  private final Kind kind;
  private final Expr expr;
  
  public enum Kind {
    RETURN,
    THROW
  }

  Stop(Kind kind, Expr expr, int lineNumber) {
    super(lineNumber);
    this.kind = kind;
    this.expr = expr;
  }

  public Kind getKind() {
    return kind;
  }
  public Expr getExpr() {
    return expr;
  }
}
