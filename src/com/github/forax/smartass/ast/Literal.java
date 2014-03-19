package com.github.forax.smartass.ast;

public class Literal extends Locatable implements Expr {
  private final String value;

  Literal(String value, Location location) {
    super(location);
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
