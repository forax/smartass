package com.github.forax.smartass.rt;

import java.util.function.Function;
import java.util.function.Supplier;

public class Builtins {
  public static double subtract(double v1, double v2) {
    return v1 - v2;
  }
  
  public static double multiply(double v1, double v2) {
    return v1 * v2;
  }
  
  public static double divide(double v1, double v2) {
    return v1 / v2;
  }
  
  public static double remainder(double v1, double v2) {
    return v1 % v2;
  }
  
  public static Object tryEval(Supplier<Object> supplier, Function<Throwable, Object> handler) {
    try {
      return supplier.get();
    } catch(Throwable t) {
      return handler.apply(t);
    }
  }
}
