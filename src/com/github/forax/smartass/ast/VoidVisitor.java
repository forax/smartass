package com.github.forax.smartass.ast;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiConsumer;

public class VoidVisitor<E> {
  private final HashMap<Class<?>, BiConsumer<Expr, ? super E>> consumerMap = new HashMap<>();
  
  @SuppressWarnings("unchecked")
  public <T extends Expr> VoidVisitor<E> when(Class<T> type, BiConsumer<? super T, ? super E> function) {
    consumerMap.put(type, (BiConsumer<Expr,? super E>)function);
    return this;
  }
  
  public void visit(Expr expr, E env) {
    Objects.requireNonNull(expr, "expr is null");
    Objects.requireNonNull(env, "env is null");
    Class<? extends Expr> type = expr.getClass();
    BiConsumer<Expr, ? super E> biConsumer = consumerMap.get(type);
    if (biConsumer == null) {
      throw new IllegalStateException("no method visit for " + type.getName());
    }
    biConsumer.accept(expr, env);
  }
}
