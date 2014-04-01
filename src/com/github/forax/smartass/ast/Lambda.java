package com.github.forax.smartass.ast;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lambda extends Locatable implements Expr {
  private final List<Parameter> parameters;
  private final Block block;
  private final Path path;

  Lambda(List<Parameter> parameters, Block block, Path path, int lineNumber) {
    super(lineNumber);
    this.parameters = Collections.unmodifiableList(parameters);
    this.block = Objects.requireNonNull(block);
    this.path = path;
  }
  
  public List<Parameter> getParameters() {
    return parameters;
  }
  public Block getBlock() {
    return block;
  }
  public Path getPathOptional() {
    return path;
  }
}
