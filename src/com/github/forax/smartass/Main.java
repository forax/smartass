package com.github.forax.smartass;
import com.github.forax.smartass.ast.ASTBuilder;
import com.github.forax.smartass.ast.Block;
import com.github.forax.smartass.rt.Script;


public class Main {
  public static void main(String[] args) throws Throwable {
    java.io.Reader reader;
    if (args.length>0) {
      reader = new java.io.FileReader(args[0]);
    } else {
      reader = new java.io.InputStreamReader(System.in);
    }

    Block block = ASTBuilder.parseBlock(reader);

    Script script = new Script();
    Object result = script.start(block);
    System.out.println(result);
  }
}
