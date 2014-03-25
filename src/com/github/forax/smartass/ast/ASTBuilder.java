package com.github.forax.smartass.ast;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.forax.smartass.grammar.tools.Analyzers;
import com.github.forax.smartass.grammar.tools.GrammarEvaluator;
import com.github.forax.smartass.grammar.tools.TerminalEvaluator;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;

public class ASTBuilder implements GrammarEvaluator {
  public static Block parseBlock(Reader reader) {
    LocationTracker tracker = new LocationTracker();
    ReaderWrapper buffer = new ReaderWrapper(reader, tracker);
    ASTBuilder astBuilder = new ASTBuilder();
    Analyzers.run(buffer, new TerminalBuilder(tracker), astBuilder, null, null);
    return astBuilder.block;
  }
  
  static class TerminalBuilder implements TerminalEvaluator<CharSequence> {
    private final LocationTracker tracker;
    
    TerminalBuilder(LocationTracker tracker) {
      this.tracker = tracker;
    }

    private Location createLocation() {
      return new Location(1 + tracker.getLineNumber(), tracker.getColumnNumber());
    }
    
    @Override
    public void comment(CharSequence data) {
      // do nothing
    }
    
    @Override
    public Location pipe(CharSequence data) {
      return createLocation(); 
    }
    @Override
    public Location colon(CharSequence data) {
      return createLocation();
    }
    @Override
    public Location lopt(CharSequence data) {
      return createLocation(); 
    }
    @Override
    public Location lcurl(CharSequence data) {
      return createLocation();
    }

    @Override
    public Token<String> text(CharSequence data) {
      // the quotes will be removed in the rewriter
      return new Token<>(data.toString(), createLocation());
    }
    @Override
    public Token<String> id(CharSequence data) {
      return new Token<>(data.toString(), createLocation());
    }
    @Override
    public Token<String> value(CharSequence data) {
      return new Token<>(data.toString(), createLocation());
    }
  }
  
  private Block block;
  
  @Override
  public void acceptScript() {
    // cool
  }
  @Override
  public void script(List<Expr> expr_star_opt) {
    block = new Block(block(expr_star_opt), new Location(1, 1));
  }
  
  @Override
  public List<Expr> block(List<Expr> expr_star_opt) {
    return (expr_star_opt == null)? new ArrayList<>(): new ArrayList<>(expr_star_opt);
  }
  
  @Override
  public List<Expr> instrs_rec(Expr expr, List<Expr> instrs) {
    instrs.add(0, expr);
    return instrs;
  }
  @Override
  public List<Expr> instrs_instr_eoi(Expr expr) {
    LinkedList<Expr> exprs = new LinkedList<>();
    exprs.add(expr);
    return exprs;
  }
  @Override
  public List<Expr> instrs_instr(Expr expr) {
    return instrs_instr_eoi(expr);
  }

  @Override
  public Expr instr_expr(Expr expr) {
    return expr;
  }
  @Override
  public Expr instr_return(Expr expr) {
    return new Stop(Stop.Kind.RETURN, expr, expr.getLocation());
  }
  @Override
  public Expr instr_throw(Expr expr) {
    return new Stop(Stop.Kind.THROW, expr, expr.getLocation());
  }
  
  @Override
  public Token<String> name_id(Token<String> id) {
    return id;
  }
  @Override
  public Token<String> name_text(Token<String> text) {
    return text;
  }

  @Override
  public Expr expr_parens(Expr expr) {
    return expr;
  }
  
  @Override
  public Expr expr_value(Token<String> value) {
    return new Literal(value.getValue(), value.getLocation());
  }

  @Override
  public Expr expr_var_access(Token<String> id) {
    return new VarAccess(id.getValue(), id.getLocation());
  }
  @Override
  public Expr expr_var_assignment(Token<String> id, Expr expr) {
    return new VarAssignment(id.getValue(), expr, id.getLocation());
  }

  @Override
  public Expr expr_field_access(Token<String> id) {
    return new FieldAccess(id.getValue(), id.getLocation());
  }
  
  @Override
  public Expr expr_block(Location colon, List<Expr> block) {
    return block_param_block(colon, block);
  }
  @Override
  public Expr expr_lambda(List<Token<String>> id_plus, Location colon, List<Expr> block) {
    return block_param_lambda(id_plus.get(0).getLocation(), id_plus, colon, block); 
  }
  @Override
  public Lambda block_param_block(Location colon, List<Expr> block) {
    return new Lambda(Collections.emptyList(), new Block(block, colon), colon);
  }
  @Override
  public Lambda block_param_lambda(Location pipe, List<Token<String>> id_star, Location colon, List<Expr> block) {
    return new Lambda(id_star.stream().map(Token<String>::getValue).collect(Collectors.toList()),
        new Block(block, colon),
        pipe);
  }
  
  @Override
  public Expr expr_funcall(Expr expr, List<Expr> expr_star, Lambda lambda_optional) {
    return new MethodCall(new VarAccess("this", expr.getLocation()), expr, expr_star, lambda_optional, expr.getLocation());
  }
  @Override
  public Expr expr_mthcall(Expr expr, Token<String> name, List<Expr> expr_star, Lambda lambda_optional) {
    return new MethodCall(expr, expr_var_access(name), expr_star, lambda_optional, expr.getLocation());
  }
  
  @Override
  public Expr expr_while(Expr expr, Location colon, List<Expr> block) {
    return new While(expr, new Block(block, colon), expr.getLocation());
  }
  @Override
  public Expr expr_if(Expr expr, Location colon, List<Expr> block) {
    return new If(expr, new Block(block, colon), null, expr.getLocation());
  }
  @Override
  public Expr expr_ifelse(Expr expr, Location colon, List<Expr> block, Location colon2, List<Expr> block2) {
    return new If(expr, new Block(block, colon), new Block(block2, colon2), expr.getLocation());
  }
  
  private static MethodCall op(Expr receiver, String selector, Expr... arguments) {
    return new MethodCall(receiver, new VarAccess(selector, receiver.getLocation()), Arrays.asList(arguments), null, receiver.getLocation());
  }
  @Override
  public Expr expr_unary_neg(Expr expr) {
    return op(expr, "-@");
  }
  @Override
  public Expr expr_unary_not(Expr expr) {
    return op(expr, "!");
  }

  @Override
  public Expr expr_binary_add(Expr expr, Expr expr2) {
    return op(expr, "+", expr2);
  }
  @Override
  public Expr expr_binary_sub(Expr expr, Expr expr2) {
    return op(expr, "-", expr2);
  }
  @Override
  public Expr expr_binary_mul(Expr expr, Expr expr2) {
    return op(expr, "*", expr2);
  }
  @Override
  public Expr expr_binary_div(Expr expr, Expr expr2) {
    return op(expr, "/", expr2);
  }
  @Override
  public Expr expr_binary_mod(Expr expr, Expr expr2) {
    return op(expr, "%", expr2);
  }

  @Override
  public Expr expr_binary_eq(Expr expr, Expr expr2) {
    return op(expr, "==", expr2);
  }
  @Override
  public Expr expr_binary_ne(Expr expr, Expr expr2) {
    return op(expr, "!=", expr2);
  }
  @Override
  public Expr expr_binary_lt(Expr expr, Expr expr2) {
    return op(expr, "<", expr2);
  }
  @Override
  public Expr expr_binary_le(Expr expr, Expr expr2) {
    return op(expr, "<=", expr2);
  }
  @Override
  public Expr expr_binary_gt(Expr expr, Expr expr2) {
    return op(expr, ">", expr2);
  }
  @Override
  public Expr expr_binary_ge(Expr expr, Expr expr2) {
    return op(expr, ">=", expr2);
  }
}
