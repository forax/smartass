package com.github.forax.smartass.grammar.tools;

import com.github.forax.smartass.ast.Expr;
import com.github.forax.smartass.ast.Lambda;
import com.github.forax.smartass.ast.Location;
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
   *  <code>instrs ::= expr eoi instrs</code>
   */
  public List<Expr> instrs_rec(Expr expr,List<Expr> instrs);
  /** This methods is called after the reduction of the non terminal instrs
   *  by the grammar production instrs_expr_eoi.
   *  <code>instrs ::= expr eoi</code>
   */
  public List<Expr> instrs_expr_eoi(Expr expr);
  /** This methods is called after the reduction of the non terminal instrs
   *  by the grammar production instrs_expr.
   *  <code>instrs ::= expr</code>
   */
  public List<Expr> instrs_expr(Expr expr);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= instrs_optional_1</code>
   */
  public List<Expr> block(List<Expr> instrs_optional);
  /** This methods is called after the reduction of the non terminal block_param
   *  by the grammar production block_param_block.
   *  <code>block_param ::= colon block</code>
   */
  public Lambda block_param_block(Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal block_param
   *  by the grammar production block_param_lambda.
   *  <code>block_param ::= pipe id_star_2 colon block</code>
   */
  public Lambda block_param_lambda(Location pipe,List<Token<String>> id_star,Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal name
   *  by the grammar production name_id.
   *  <code>name ::= id</code>
   */
  public Token<String> name_id(Token<String> id);
  /** This methods is called after the reduction of the non terminal name
   *  by the grammar production name_text.
   *  <code>name ::= text</code>
   */
  public Token<String> name_text(Token<String> text);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_value.
   *  <code>expr ::= value</code>
   */
  public Expr expr_value(Token<String> value);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar expr rpar</code>
   */
  public Expr expr_parens(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_var_access.
   *  <code>expr ::= name</code>
   */
  public Expr expr_var_access(Token<String> name);
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
  public Expr expr_block(Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lambda.
   *  <code>expr ::= lpar id_plus_3 colon block rpar</code>
   */
  public Expr expr_lambda(List<Token<String>> id_plus,Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_funcall.
   *  <code>expr ::= expr lpar expr_star_4 block_param_optional_5 rpar</code>
   */
  public Expr expr_funcall(Expr expr,List<Expr> expr_star,Lambda block_param_optional);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mthcall.
   *  <code>expr ::= expr dot name lpar expr_star_6 block_param_optional_7 rpar</code>
   */
  public Expr expr_mthcall(Expr expr,Token<String> name,List<Expr> expr_star,Lambda block_param_optional);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_while.
   *  <code>expr ::= _while lpar expr colon block rpar</code>
   */
  public Expr expr_while(Expr expr,Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if.
   *  <code>expr ::= _if lpar expr colon block rpar</code>
   */
  public Expr expr_if(Expr expr,Location colon,List<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ifelse.
   *  <code>expr ::= _if lpar expr colon block colon block rpar</code>
   */
  public Expr expr_ifelse(Expr expr,Location colon,List<Expr> block,Location colon2,List<Expr> block2);
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