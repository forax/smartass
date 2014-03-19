package com.github.forax.smartass.ast;

public class Token<V> extends Locatable {
  private final V value;

  Token(V value, Location location) {
    super(location);
    this.value = value;
  }
  
  public V getValue() {
    return value;
  }
}
