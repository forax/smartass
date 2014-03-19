package com.github.forax.smartass.ast;

public class FieldAccess extends Locatable implements Expr {
  private final String id;

  FieldAccess(String id, Location location) {
    super(location);
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
