package com.github.forax.smartass.ast;

import java.util.Objects;

public class Parameter extends Locatable {
  private final String name;
  private final String typeHint;
  
  Parameter(String name, String typeHint, int lineNumber) {
    super(lineNumber);
    this.name = Objects.requireNonNull(name);
    this.typeHint = typeHint;
  }
  
  public String getName() {
    return name;
  }
  public String getTypeHintOptional() {
    return typeHint;
  }
}
