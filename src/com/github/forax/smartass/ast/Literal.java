package com.github.forax.smartass.ast;

public class Literal extends Locatable implements Expr {
  private final String value;

  Literal(String value, int lineNumber) {
    super(lineNumber);
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
