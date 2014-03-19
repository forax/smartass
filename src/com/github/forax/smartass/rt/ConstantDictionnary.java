package com.github.forax.smartass.rt;

import java.util.ArrayList;
import java.util.HashMap;

class ConstantDictionnary {
  private final HashMap<Object, Integer> constantMap = new HashMap<>();
  private final ArrayList<Object> constantList = new ArrayList<>();
  
  public int intern(Object constant) {
    return constantMap.computeIfAbsent(constant, key -> {
      int index = constantList.size();
      constantList.add(key);
      return index;
    });
  }
  
  public Object getConstantAt(int index) {
    return constantList.get(index);
  }
}
