package com.github.forax.smartass.ast;

import java.util.Objects;

public class VarAccess extends Locatable implements Expr {
  private final String id;
  private boolean allowString;

  VarAccess(String id, int lineNumber) {
    super(lineNumber);
    this.id = Objects.requireNonNull(id);
  }
  
  VarAccess allowString() {
    this.allowString = true;
    return this;
  }
  
  public boolean stringAllowed() {
    return allowString;
  }
  
  public String getId() {
    return id;
  }
}
