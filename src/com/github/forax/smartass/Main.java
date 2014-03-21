package com.github.forax.smartass;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.github.forax.smartass.ast.ASTBuilder;
import com.github.forax.smartass.ast.Block;
import com.github.forax.smartass.rt.Script;

public class Main {
  public static void main(String[] args) throws Throwable {
    Block block;
    try(Reader reader = (args.length>0)?
          Files.newBufferedReader(Paths.get(args[0])):
          new java.io.InputStreamReader(System.in)) {
      block = ASTBuilder.parseBlock(reader);
    }

    Script script = new Script();
    Object result = script.eval(block);
    System.out.println(result);
  }
}
