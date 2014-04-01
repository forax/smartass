package com.github.forax.smartass.ast;

public interface Expr {
  public int getLineNumber();
  public String getOptionalDocComment();
  public void setDocComment(String docComment);
}
