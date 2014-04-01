package com.github.forax.smartass.ast;

import java.util.Objects;

abstract class Locatable {
  private final int lineNumber;
  private String docComment;

  Locatable(int lineNumber) {
    this.lineNumber = lineNumber;
  }
  
  public int getLineNumber() {
    return lineNumber;
  }
  public String getDocCommentOptional() {
    return docComment;
  }
  public void setDocComment(String docComment) {
    Objects.requireNonNull(docComment);
    if (this.docComment != null) {
      throw new IllegalStateException("a doc comment can only be set once");
    }
    this.docComment = docComment;
  }
}
