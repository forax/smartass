package com.github.forax.smartass.ast;

import java.util.Objects;

public class Stop extends Locatable implements Expr {
  private final Kind kind;
  private final Expr expr;
  
  public enum Kind {
    RETURN,
    THROW
  }

  Stop(Kind kind, Expr expr, int lineNumber) {
    super(lineNumber);
    this.kind = Objects.requireNonNull(kind);
    this.expr = Objects.requireNonNull(expr);
  }

  public Kind getKind() {
    return kind;
  }
  public Expr getExpr() {
    return expr;
  }
}
