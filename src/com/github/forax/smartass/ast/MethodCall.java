package com.github.forax.smartass.ast;

import java.util.List;

public class MethodCall extends Locatable implements Expr {
  private final Expr receiver;
  private final Expr selector;
  private final List<Expr> arguments;
  private final Lambda lambdaOrNull;

  MethodCall(Expr receiver, Expr selector, List<Expr> arguments, Lambda lambdaOrNull, Location location) {
    super(location);
    this.receiver = receiver;
    this.selector = selector;
    this.arguments = arguments;
    this.lambdaOrNull = lambdaOrNull;
  }

  public Expr getReceiver() {
    return receiver;
  }
  public Expr getSelector() {
    return selector;
  }
  public List<Expr> getArguments() {
    return arguments;
  }
  public Lambda getLambdaOrNull() {
    return lambdaOrNull;
  }
}
