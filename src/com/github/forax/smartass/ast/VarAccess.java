package com.github.forax.smartass.ast;

public class VarAccess extends Locatable implements Expr {
  private final String id;

  VarAccess(String id, int lineNumber) {
    super(lineNumber);
    this.id = id;
  }
  
  public String getId() {
    return id;
  }
}
