package com.github.forax.smartass.ast;

import java.util.Objects;

abstract class Locatable {
  private final Location location;
  private String docComment;

  Locatable(Location location) {
    this.location = location;
  }
  
  public Location getLocation() {
    return location;
  }
  public String getOptionalDocComment() {
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
