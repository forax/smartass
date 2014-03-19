package com.github.forax.smartass.ast;

public class Location {
  private final int lineNumber;
  private final int columnNumber;
  
  public Location(int lineNumber, int columnNumber) {
    this.lineNumber = lineNumber;
    this.columnNumber = columnNumber;
  }
  
  public int getLineNumber() {
    return lineNumber;
  }
  public int getColumnNumber() {
    return columnNumber;
  }
}
