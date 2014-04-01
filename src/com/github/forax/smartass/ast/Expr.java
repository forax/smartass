package com.github.forax.smartass.ast;

public interface Expr {
  public int getLineNumber();
  public String getDocCommentOptional();
  public void setDocComment(String docComment);
}
