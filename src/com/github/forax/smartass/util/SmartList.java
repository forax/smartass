package com.github.forax.smartass.util;

import java.util.AbstractList;
import java.util.RandomAccess;

public final class SmartList extends AbstractList<Object> implements RandomAccess {
  private final Object[] array;
  
  public SmartList(Object... array) {
    this.array = array;
  }
  @Override
  public Object get(int index) {
    return array[index];
  }
  @Override
  public int size() {
    return array.length;
  }
}