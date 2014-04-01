package com.github.forax.smartass.ast;

import java.util.Objects;

public class VarAccess extends Locatable implements Expr {
  private final String id;

  VarAccess(String id, int lineNumber) {
    super(lineNumber);
    this.id = Objects.requireNonNull(id);
  }
  
  public String getId() {
    return id;
  }
}
