package com.github.forax.smartass.grammar.tools;

import com.github.forax.smartass.ast.Expr;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.ast.Parameter;
import com.github.forax.smartass.ast.Token;
import java.util.List;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal script
   *  by the grammar production script.
   *  <code>script ::= instrs_optional_0</code>
   */
  public void script(List<Expr> instrs_optional);
  /** This methods is called after the reduction of the non terminal instrs
   *  by the grammar production instrs_rec.
   *  <code>instrs ::= instr eoi instrs</code>
   */
  public List<Expr> instrs_rec(Expr instr,List<Expr> instrs);
  /** This methods is called after the reduction of the non terminal instrs
   *  by the grammar production instrs_instr_eoi.
   *  <code>instrs ::= instr eoi</code>
   */
  public List<Expr> instrs_instr_eoi(Expr instr);
  /** This methods is called after the reduction of the non terminal instrs
   *  by the grammar production instrs_instr.
   *  <code>instrs ::= instr</code>
   */
  public List<Expr> instrs_instr(Expr instr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_expr.
   *  <code>instr ::= expr</code>
   */
  public Expr instr_expr(Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_doc_expr.
   *  <code>instr ::= doc_plus_1 expr</code>
   */
  public Expr instr_doc_expr(List<Token<String>> doc_plus,Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_return.
   *  <code>instr ::= _return expr</code>
   */
  public Expr instr_return(Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_throw.
   *  <code>instr ::= _throw expr</code>
   */
  public Expr instr_throw(Expr expr);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= instrs_optional_2</code>
   */
  public List<Expr> block(List<Expr> instrs_optional);
  /** This methods is called after the reduction of the non terminal block_param
   *  by the grammar production block_param_block.
   *  <code>block_param ::= colon block</code>
   */
  public Lambda block_param_block(int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal block_param
   *  by the grammar production block_param_lambda.
   *  <code>block_param ::= pipe parameter_star_3 colon block</code>
   */
  public Lambda block_param_lambda(int pipe,List<Parameter> parameter_star,int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_hint_quote_id.
   *  <code>parameter ::= quote id</code>
   */
  public Parameter parameter_hint_quote_id(Token<String> quote,Token<String> id);
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_hint_id_id.
   *  <code>parameter ::= id id</code>
   */
  public Parameter parameter_hint_id_id(Token<String> id,Token<String> id2);
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_id.
   *  <code>parameter ::= id</code>
   */
  public Parameter parameter_id(Token<String> id);
  /** This methods is called after the reduction of the non terminal entry
   *  by the grammar production entry.
   *  <code>entry ::= expr colon expr</code>
   */
  public Expr[] entry(Expr expr,int colon,Expr expr2);
  /** This methods is called after the reduction of the non terminal selector
   *  by the grammar production selector_id.
   *  <code>selector ::= id</code>
   */
  public Expr selector_id(Token<String> id);
  /** This methods is called after the reduction of the non terminal selector
   *  by the grammar production selector_quote.
   *  <code>selector ::= quote</code>
   */
  public Expr selector_quote(Token<String> quote);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_value.
   *  <code>expr ::= value</code>
   */
  public Expr expr_value(Token<String> value);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_text.
   *  <code>expr ::= text</code>
   */
  public Expr expr_text(Token<String> text);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_quote.
   *  <code>expr ::= quote</code>
   */
  public Expr expr_quote(Token<String> quote);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar expr rpar</code>
   */
  public Expr expr_parens(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_access.
   *  <code>expr ::= id</code>
   */
  public Expr expr_var_access(Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_assignment.
   *  <code>expr ::= id assign expr</code>
   */
  public Expr expr_var_assignment(Token<String> id,Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_field_access.
   *  <code>expr ::= at id</code>
   */
  public Expr expr_field_access(Token<String> id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_block.
   *  <code>expr ::= lpar colon block rpar</code>
   */
  public Expr expr_block(int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lambda.
   *  <code>expr ::= lpar parameter_plus_4 colon block rpar</code>
   */
  public Expr expr_lambda(List<Parameter> parameter_plus,int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_funcall.
   *  <code>expr ::= expr lpar expr_star_5 block_param_optional_6 rpar</code>
   */
  public Expr expr_funcall(Expr expr,List<Expr> expr_star,Lambda block_param_optional);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mthcall.
   *  <code>expr ::= expr dot selector lpar expr_star_7 block_param_optional_8 rpar</code>
   */
  public Expr expr_mthcall(Expr expr,Expr selector,List<Expr> expr_star,Lambda block_param_optional);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_while.
   *  <code>expr ::= _while lpar expr colon block rpar</code>
   */
  public Expr expr_while(Expr expr,int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if.
   *  <code>expr ::= _if lpar expr colon block rpar</code>
   */
  public Expr expr_if(Expr expr,int colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ifelse.
   *  <code>expr ::= _if lpar expr colon block colon block rpar</code>
   */
  public Expr expr_ifelse(Expr expr,int colon,List<Expr> block,int colon2,List<Expr> block2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_list.
   *  <code>expr ::= lopt expr_star_9 ropt</code>
   */
  public Expr expr_list(int lopt,List<Expr> expr_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_map.
   *  <code>expr ::= lcurl entry_star_10 rcurl</code>
   */
  public Expr expr_map(int lcurl,List<Expr[]> entry_star);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_not.
   *  <code>expr ::= bang expr</code>
   */
  public Expr expr_unary_not(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_neg.
   *  <code>expr ::= minus expr</code>
   */
  public Expr expr_unary_neg(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_plus.
   *  <code>expr ::= plus expr</code>
   */
  public Expr expr_unary_plus(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_add.
   *  <code>expr ::= expr plus expr</code>
   */
  public Expr expr_binary_add(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_sub.
   *  <code>expr ::= expr minus expr</code>
   */
  public Expr expr_binary_sub(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mul.
   *  <code>expr ::= expr star expr</code>
   */
  public Expr expr_binary_mul(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_div.
   *  <code>expr ::= expr slash expr</code>
   */
  public Expr expr_binary_div(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_mod.
   *  <code>expr ::= expr mod expr</code>
   */
  public Expr expr_binary_mod(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public Expr expr_binary_eq(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ne.
   *  <code>expr ::= expr ne expr</code>
   */
  public Expr expr_binary_ne(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public Expr expr_binary_lt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_le.
   *  <code>expr ::= expr le expr</code>
   */
  public Expr expr_binary_le(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public Expr expr_binary_gt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_binary_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public Expr expr_binary_ge(Expr expr,Expr expr2);

  public void acceptScript();
}
