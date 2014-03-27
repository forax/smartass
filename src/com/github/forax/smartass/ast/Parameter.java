package com.github.forax.smartass.ast;

import java.util.Objects;

public class Parameter extends Locatable {
  private final String name;
  private final Expr typeHint;
  
  public Parameter(String name, Expr typeHint, Location location) {
    super(location);
    this.name = Objects.requireNonNull(name);
    this.typeHint = typeHint;
  }
  
  public String getName() {
    return name;
  }
  public Expr getTypeHintOptional() {
    return typeHint;
  }
}
