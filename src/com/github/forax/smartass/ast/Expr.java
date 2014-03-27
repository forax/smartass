package com.github.forax.smartass.ast;

public interface Expr {
  public Location getLocation();
  public String getOptionalDocComment();
  public void setDocComment(String docComment);
}
