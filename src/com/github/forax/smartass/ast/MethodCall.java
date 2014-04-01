package com.github.forax.smartass.ast;

import java.util.List;
import java.util.Objects;

public class MethodCall extends Locatable implements Expr {
  private final Expr receiver;
  private final Expr selector;
  private final List<Expr> arguments;
  private final Lambda lambdaOrNull;

  MethodCall(Expr receiver, Expr selector, List<Expr> arguments, Lambda lambdaOrNull, int lineNumber) {
    super(lineNumber);
    this.receiver = Objects.requireNonNull(receiver);
    this.selector = Objects.requireNonNull(selector);
    this.arguments = Objects.requireNonNull(arguments);
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
  public Lambda getLambdaOptional() {
    return lambdaOrNull;
  }
}
