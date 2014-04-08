package com.github.forax.smartass.ast;

import java.io.Reader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.forax.smartass.ast.Data.DataKind;
import com.github.forax.smartass.grammar.tools.Analyzers;
import com.github.forax.smartass.grammar.tools.GrammarEvaluator;
import com.github.forax.smartass.grammar.tools.TerminalEvaluator;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;

public class ASTBuilder implements GrammarEvaluator {
  public static Lambda parseScript(Reader reader, Path path) {
    Objects.requireNonNull(reader);
    LocationTracker tracker = new LocationTracker();
    ReaderWrapper buffer = new ReaderWrapper(reader, tracker);
    ASTBuilder astBuilder = new ASTBuilder(path);
    Analyzers.run(buffer, new TerminalBuilder(tracker), astBuilder, null, null);
    return astBuilder.lambda;
  }
  
  static class TerminalBuilder implements TerminalEvaluator<CharSequence> {
    private final LocationTracker tracker;
    
    TerminalBuilder(LocationTracker tracker) {
      this.tracker = tracker;
    }

    private int getLineNumber() {
      return 1 + tracker.getLineNumber();
    }
    
    @Override
    public void comment(CharSequence data) {
      // do nothing
    }
    
    @Override
    public int pipe(CharSequence data) {
      return getLineNumber(); 
    }
    @Override
    public int colon(CharSequence data) {
      return getLineNumber();
    }
    @Override
    public int lopt(CharSequence data) {
      return getLineNumber(); 
    }
    @Override
    public int lcurl(CharSequence data) {
      return getLineNumber();
    }

    @Override
    public Token<String> text(CharSequence data) {
      return asStringToken(data);
    }
    @Override
    public Token<String> quote(CharSequence data) {
      return asStringToken(data);
    }
    @Override
    public Token<String> id(CharSequence data) {
      return asStringToken(data);
    }
    @Override
    public Token<String> value(CharSequence data) {
      return asStringToken(data);
    }
    @Override
    public Token<String> doc(CharSequence data) {
      return asStringToken(data);
    }
    private Token<String> asStringToken(CharSequence data) {
      return new Token<>(data.toString(), getLineNumber());
    }
  }
  
  private final Path path;
  private Lambda lambda;
  
  private ASTBuilder(Path path) {
    this.path = path;
  }
  
  @Override
  public void acceptScript() {
    // cool
  }
  @Override
  public void script(List<Expr> expr_star_opt) {
    lambda = new Lambda(Collections.emptyList(), new Block(block(expr_star_opt), 1), path, 1);
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
  public Expr instr_doc_expr(List<Token<String>> doc_plus, Expr expr) {
    expr.setDocComment(doc_plus.stream().map(Token<String>::getValue).collect(Collectors.joining()));
    return expr;
  }
  @Override
  public Expr instr_return(Expr expr) {
    return new Stop(Stop.Kind.RETURN, expr, expr.getLineNumber());
  }
  @Override
  public Expr instr_throw(Expr expr) {
    return new Stop(Stop.Kind.THROW, expr, expr.getLineNumber());
  }
  
  @Override
  public Expr selector_id(Token<String> id) {
    return new VarAccess(id.getValue(), id.getLineNumber()).allowString();
  }
  @Override
  public Expr selector_quote(Token<String> text) {
    return new Literal(text.getValue(), text.getLineNumber());
  }

  @Override
  public Expr expr_parens(Expr expr) {
    return expr;
  }
  
  @Override
  public Expr expr_value(Token<String> value) {
    return new Literal(value.getValue(), value.getLineNumber());
  }
  @Override
  public Expr expr_text(Token<String> text) {
    return expr_value(text);
  }
  @Override
  public Expr expr_quote(Token<String> quote) {
    return expr_value(quote);
  }

  @Override
  public Expr expr_var_access(Token<String> id) {
    return new VarAccess(id.getValue(), id.getLineNumber());
  }
  @Override
  public Expr expr_var_assignment(Token<String> id, Expr expr) {
    return new VarAssignment(id.getValue(), expr, id.getLineNumber());
  }

  @Override
  public Expr expr_field_access(Token<String> id) {
    return new FieldAccess(id.getValue(), id.getLineNumber());
  }
  
  @Override
  public Expr expr_block(int colon, List<Expr> block) {
    return block_param_block(colon, block);
  }
  @Override
  public Expr expr_lambda(List<Parameter> parameter_plus, int colon, List<Expr> block) {
    return block_param_lambda(parameter_plus.get(0).getLineNumber(), parameter_plus, colon, block); 
  }
  @Override
  public Lambda block_param_block(int colon, List<Expr> block) {
    return new Lambda(Collections.emptyList(), new Block(block, colon), path, colon);
  }
  @Override
  public Parameter parameter_id(Token<String> id) {
    return new Parameter(id.getValue(), null, id.getLineNumber());
  }
  @Override
  public Parameter parameter_hint_id_id(Token<String> id, Token<String> id2) {
    return new Parameter(id2.getValue(), id.getValue(), id.getLineNumber());
  }
  @Override
  public Parameter parameter_hint_quote_id(Token<String> text, Token<String> id) {
    return new Parameter(id.getValue(), text.getValue().substring(1), text.getLineNumber());
  }
  @Override
  public Lambda block_param_lambda(int pipe, List<Parameter> parameter_star, int colon, List<Expr> block) {
    return new Lambda(parameter_star, new Block(block, colon), path, pipe);
  }
  
  @Override
  public Expr expr_funcall(Expr expr, List<Expr> expr_star, Lambda lambda_optional) {
    if (expr instanceof VarAccess) {
      ((VarAccess)expr).allowString();
    }
    return new MethodCall(new VarAccess("this", expr.getLineNumber()), expr, expr_star, lambda_optional, expr.getLineNumber());
  }
  @Override
  public Expr expr_mthcall(Expr expr, Expr selector, List<Expr> expr_star, Lambda lambda_optional) {
    return new MethodCall(expr, selector, expr_star, lambda_optional, expr.getLineNumber());
  }
  @Override
  public Expr expr_fieldcall(Expr expr, Expr selector) {
    return new MethodCall(expr, selector, Collections.emptyList(), null, expr.getLineNumber());
  }
  
  @Override
  public Expr expr_while(Expr expr, int colon, List<Expr> block) {
    return new While(expr, new Block(block, colon), expr.getLineNumber());
  }
  @Override
  public Expr expr_if(Expr expr, int colon, List<Expr> block) {
    return new If(expr, new Block(block, colon), null, expr.getLineNumber());
  }
  @Override
  public Expr expr_ifelse(Expr expr, int colon, List<Expr> block, int colon2, List<Expr> block2) {
    return new If(expr, new Block(block, colon), new Block(block2, colon2), expr.getLineNumber());
  }
  
  @Override
  public Expr expr_list(int lopt, List<Expr> expr_star) {
    return new Data(DataKind.LIST, expr_star, lopt);
  }
  
  @Override
  public Expr[] entry_key_value(Expr key, int colon, Expr value) {
    return new Expr[] { key, value };
  }
  @Override
  public Expr[] entry_hint_id(Expr expr, Token<String> id) {
    return new Expr[] { new Literal(id.getValue(), id.getLineNumber()), expr };
  }
  @Override
  public Expr[] entry_hint_quote(Expr expr, Token<String> quote) {
    return new Expr[] { new Literal(quote.getValue(), quote.getLineNumber()), expr };
  }
  @Override
  public Expr[] entry_expr(Expr expr) {
    return new Expr[] { expr,  new Literal("null", expr.getLineNumber()) };
  }
  @Override
  public Expr expr_map(int lcurl, List<Expr[]> entry_star) {
    return new Data(DataKind.MAP, entry_star.stream().flatMap(array -> Stream.of(array[0], array[1])).collect(Collectors.toList()), lcurl);
  }
  
  private static MethodCall op(Expr receiver, String selector, Expr... arguments) {
    return new MethodCall(receiver, new Literal('\'' + selector, receiver.getLineNumber()), Arrays.asList(arguments), null, receiver.getLineNumber());
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
  public Expr expr_unary_plus(Expr expr) {
    return expr;
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
