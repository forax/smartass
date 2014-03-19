package com.github.forax.smartass.ast;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiFunction;

public class Visitor<E,R> {
  private final HashMap<Class<?>, BiFunction<Expr, ? super E, ? extends R>> functionMap = new HashMap<>();
  
  @SuppressWarnings("unchecked")
  public <T extends Expr> Visitor<E,R> when(Class<T> type, BiFunction<? super T, ? super E, ? extends R> function) {
    functionMap.put(type, (BiFunction<Expr,? super E, ? extends R>)function);
    return this;
  }
  
  public R visit(Expr expr, E env) {
    Objects.requireNonNull(expr, "expr is null");
    Objects.requireNonNull(env, "env is null");
    Class<? extends Expr> type = expr.getClass();
    BiFunction<Expr, ? super E, ? extends R> biFunction = functionMap.get(type);
    if (biFunction == null) {
      throw new IllegalStateException("no method visit for " + type.getName());
    }
    return biFunction.apply(expr, env);
  }
}
