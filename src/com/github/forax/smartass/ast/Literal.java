package com.github.forax.smartass.ast;

import java.util.Objects;

public class Literal extends Locatable implements Expr {
  private final String value;

  Literal(String value, int lineNumber) {
    super(lineNumber);
    this.value = Objects.requireNonNull(value);
  }

  public String getValue() {
    return value;
  }
}
