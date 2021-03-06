package com.github.forax.smartass.ast;

import java.util.Objects;

public class Token<V> extends Locatable {
  private final V value;

  Token(V value, int lineNumber) {
    super(lineNumber);
    this.value = Objects.requireNonNull(value);
  }
  
  public V getValue() {
    return value;
  }
}
