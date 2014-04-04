package com.github.forax.smartass.ast;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Data extends Locatable implements Expr {
  private final DataKind kind;
  private final List<Expr> exprs;

  public enum DataKind {
    LIST,
    MAP
  }
  
  Data(DataKind kind, List<Expr> exprs, int lineNumber) {
    super(lineNumber);
    this.kind = Objects.requireNonNull(kind);
    this.exprs = Collections.unmodifiableList(exprs);
  }

  public DataKind getKind() {
    return kind;
  }
  public List<Expr> getExprs() {
    return exprs;
  }
}
