package com.github.forax.smartass;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.forax.smartass.ast.ASTBuilder;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.rt.Script;

public class Main {
  public static void main(String[] args) throws Throwable {
    Lambda lambda;
    Path path = null;
    try(Reader reader = (args.length>0)?
          Files.newBufferedReader(path = Paths.get(args[0])):
          new java.io.InputStreamReader(System.in)) {
      lambda = ASTBuilder.parseScript(reader, path);
    }

    Script script = new Script();
    Object result = script.eval(lambda);
    System.out.println(result);
  }
}
