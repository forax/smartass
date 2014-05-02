package com.github.forax.smartass.grammar.tools;

  import com.github.forax.smartass.ast.Expr;
    import com.github.forax.smartass.ast.Lambda;
    import com.github.forax.smartass.ast.Parameter;
    import com.github.forax.smartass.ast.Token;
    import java.util.List;
  
import com.github.forax.smartass.grammar.lexer.RuleEnum;
import com.github.forax.smartass.grammar.parser.TerminalEnum;
import com.github.forax.smartass.grammar.parser.NonTerminalEnum;
import com.github.forax.smartass.grammar.parser.ProductionEnum;
import com.github.forax.smartass.grammar.tools.TerminalEvaluator;
import com.github.forax.smartass.grammar.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case plus: {
                       return;
           }
                 case minus: {
                       return;
           }
                 case star: {
                       return;
           }
                 case slash: {
                       return;
           }
                 case mod: {
                       return;
           }
                 case assign: {
                       return;
           }
                 case eq: {
                       return;
           }
                 case ne: {
                       return;
           }
                 case lt: {
                       return;
           }
                 case le: {
                       return;
           }
                 case gt: {
                       return;
           }
                 case ge: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case bang: {
                       return;
           }
                 case pipe: {
         data=dataViewer.view(buffer);
                                  int pipe=terminalEvaluator.pipe(data);
                                      stack.push_int(pipe);
                                 return;
           }
                 case aslash: {
         data=dataViewer.view(buffer);
                                  int aslash=terminalEvaluator.aslash(data);
                                      stack.push_int(aslash);
                                 return;
           }
                 case at: {
                       return;
           }
                 case sharp: {
                       return;
           }
                 case colon: {
         data=dataViewer.view(buffer);
                                  int colon=terminalEvaluator.colon(data);
                                      stack.push_int(colon);
                                 return;
           }
                 case comma: {
                       return;
           }
                 case semicolon: {
                       return;
           }
                 case eol: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lopt: {
         data=dataViewer.view(buffer);
                                  int lopt=terminalEvaluator.lopt(data);
                                      stack.push_int(lopt);
                                 return;
           }
                 case ropt: {
                       return;
           }
                 case lcurl: {
         data=dataViewer.view(buffer);
                                  int lcurl=terminalEvaluator.lcurl(data);
                                      stack.push_int(lcurl);
                                 return;
           }
                 case rcurl: {
                       return;
           }
                 case _while: {
                       return;
           }
                 case _if: {
                       return;
           }
                 case _return: {
                       return;
           }
                 case _throw: {
                       return;
           }
                 case value: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> value=terminalEvaluator.value(data);
                                      stack.push_Object(value);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case quote: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> quote=terminalEvaluator.quote(data);
                                      stack.push_Object(quote);
                                 return;
           }
                 case text: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> text=terminalEvaluator.text(data);
                                      stack.push_Object(text);
                                 return;
           }
                 case doc: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> doc=terminalEvaluator.doc(data);
                                      stack.push_Object(doc);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case instrs_optional_0_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case instrs_optional_0_instrs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case script: { // not synthetic
                                 List<Expr> instrs_optional_0=(List<Expr>)stack.pop_Object();
                                           grammarEvaluator.script(instrs_optional_0);
                      
          }
          return;
                    case eoi_eol: { // not synthetic
            
          }
          return;
                    case eoi_semi: { // not synthetic
            
          }
          return;
                    case instrs_rec: { // not synthetic
                                 List<Expr> instrs=(List<Expr>)stack.pop_Object();
                                          Expr instr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instrs_rec(instr,instrs));
                      
          }
          return;
                    case instrs_instr_eoi: { // not synthetic
                                 Expr instr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instrs_instr_eoi(instr));
                      
          }
          return;
                    case instrs_instr: { // not synthetic
                                 Expr instr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instrs_instr(instr));
                      
          }
          return;
                    case instr_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_expr(expr));
                      
          }
          return;
                    case doc_plus_1_element: { // STAR_SINGLETON
                             java.util.ArrayList<Token<String>> list=
                     new java.util.ArrayList<Token<String>>();
                   list.add((Token<String>)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case doc_plus_1_rec: { // STAR_RECURSIVE_LEFT
                            
                    Token<String> doc=(Token<String>)stack.pop_Object();
                    List<Token<String>> doc_plus_1=(List<Token<String>>)stack.pop_Object();
                     doc_plus_1.add(doc);
                     stack.push_Object(doc_plus_1);
                       
          }
          return;
                    case instr_doc_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          List<Token<String>> doc_plus_1=(List<Token<String>>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_doc_expr(doc_plus_1,expr));
                      
          }
          return;
                    case instr_return: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_return(expr));
                      
          }
          return;
                    case instr_throw: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_throw(expr));
                      
          }
          return;
                    case repl_rec_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                           grammarEvaluator.repl_rec_expr(expr);
                      
          }
          return;
                    case repl_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                           grammarEvaluator.repl_expr(expr);
                      
          }
          return;
                    case instrs_optional_2_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case instrs_optional_2_instrs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case block: { // not synthetic
                                 List<Expr> instrs_optional_2=(List<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block(instrs_optional_2));
                      
          }
          return;
                    case block_param_block: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.block_param_block(colon,block));
                      
          }
          return;
                    case parameter_star_3_element: { // STAR_SINGLETON
                             java.util.ArrayList<Parameter> list=
                     new java.util.ArrayList<Parameter>();
                   list.add((Parameter)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case parameter_star_3_rec: { // STAR_RECURSIVE_LEFT
                            
                    Parameter parameter=(Parameter)stack.pop_Object();
                    List<Parameter> parameter_star_3_sub=(List<Parameter>)stack.pop_Object();
                     parameter_star_3_sub.add(parameter);
                     stack.push_Object(parameter_star_3_sub);
                       
          }
          return;
                    case parameter_star_3_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case parameter_star_3_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_lambda: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          List<Parameter> parameter_star_3=(List<Parameter>)stack.pop_Object();
                                          int pipe=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.block_param_lambda(pipe,parameter_star_3,colon,block));
                      
          }
          return;
                    case parameter_hint_quote_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                          Token<String> quote=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameter_hint_quote_id(quote,id));
                      
          }
          return;
                    case parameter_hint_id_id: { // not synthetic
                                 Token<String> id2=(Token<String>)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameter_hint_id_id(id,id2));
                      
          }
          return;
                    case parameter_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameter_id(id));
                      
          }
          return;
                    case entry_key_value: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.entry_key_value(expr,colon,expr2));
                      
          }
          return;
                    case entry_hint_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.entry_hint_id(expr,id));
                      
          }
          return;
                    case entry_hint_quote: { // not synthetic
                                 Token<String> quote=(Token<String>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.entry_hint_quote(expr,quote));
                      
          }
          return;
                    case entry_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.entry_expr(expr));
                      
          }
          return;
                    case selector_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.selector_id(id));
                      
          }
          return;
                    case selector_quote: { // not synthetic
                                 Token<String> quote=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.selector_quote(quote));
                      
          }
          return;
                    case expr_value: { // not synthetic
                                 Token<String> value=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_value(value));
                      
          }
          return;
                    case expr_text: { // not synthetic
                                 Token<String> text=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_text(text));
                      
          }
          return;
                    case expr_quote: { // not synthetic
                                 Token<String> quote=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_quote(quote));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(expr));
                      
          }
          return;
                    case expr_var_access: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_access(id));
                      
          }
          return;
                    case expr_var_assignment: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_assignment(id,expr));
                      
          }
          return;
                    case expr_field_access: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_field_access(id));
                      
          }
          return;
                    case parameter_star_4_element: { // STAR_SINGLETON
                             java.util.ArrayList<Parameter> list=
                     new java.util.ArrayList<Parameter>();
                   list.add((Parameter)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case parameter_star_4_rec: { // STAR_RECURSIVE_LEFT
                            
                    Parameter parameter=(Parameter)stack.pop_Object();
                    List<Parameter> parameter_star_4_sub=(List<Parameter>)stack.pop_Object();
                     parameter_star_4_sub.add(parameter);
                     stack.push_Object(parameter_star_4_sub);
                       
          }
          return;
                    case parameter_star_4_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case parameter_star_4_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_block: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          List<Parameter> parameter_star_4=(List<Parameter>)stack.pop_Object();
                                          int aslash=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.expr_block(aslash,parameter_star_4,colon,block));
                      
          }
          return;
                    case expr_star_5_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_5_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_5_sub=(List<Expr>)stack.pop_Object();
                     expr_star_5_sub.add(expr);
                     stack.push_Object(expr_star_5_sub);
                       
          }
          return;
                    case expr_star_5_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_5_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_optional_6_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case block_param_optional_6_block_param: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case expr_funcall: { // not synthetic
                                 Lambda block_param_optional_6=(Lambda)stack.pop_Object();
                                          List<Expr> expr_star_5=(List<Expr>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_funcall(expr,expr_star_5,block_param_optional_6));
                      
          }
          return;
                    case expr_star_7_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_7_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_7_sub=(List<Expr>)stack.pop_Object();
                     expr_star_7_sub.add(expr);
                     stack.push_Object(expr_star_7_sub);
                       
          }
          return;
                    case expr_star_7_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_7_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_optional_8_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case block_param_optional_8_block_param: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case expr_mthcall: { // not synthetic
                                 Lambda block_param_optional_8=(Lambda)stack.pop_Object();
                                          List<Expr> expr_star_7=(List<Expr>)stack.pop_Object();
                                          Expr selector=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mthcall(expr,selector,expr_star_7,block_param_optional_8));
                      
          }
          return;
                    case expr_fieldcall: { // not synthetic
                                 Expr selector=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_fieldcall(expr,selector));
                      
          }
          return;
                    case expr_while: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_while(expr,colon,block));
                      
          }
          return;
                    case expr_if: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if(expr,colon,block));
                      
          }
          return;
                    case expr_ifelse: { // not synthetic
                                 List<Expr> block2=(List<Expr>)stack.pop_Object();
                                          int colon2=stack.pop_int();
                                          List<Expr> block=(List<Expr>)stack.pop_Object();
                                          int colon=stack.pop_int();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ifelse(expr,colon,block,colon2,block2));
                      
          }
          return;
                    case expr_star_9_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_9_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_9_sub=(List<Expr>)stack.pop_Object();
                     expr_star_9_sub.add(expr);
                     stack.push_Object(expr_star_9_sub);
                       
          }
          return;
                    case expr_star_9_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_9_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_list: { // not synthetic
                                 List<Expr> expr_star_9=(List<Expr>)stack.pop_Object();
                                          int lopt=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.expr_list(lopt,expr_star_9));
                      
          }
          return;
                    case entry_star_10_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr[]> list=
                     new java.util.ArrayList<Expr[]>();
                   list.add((Expr[])stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case entry_star_10_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr[] entry=(Expr[])stack.pop_Object();
                    List<Expr[]> entry_star_10_sub=(List<Expr[]>)stack.pop_Object();
                     entry_star_10_sub.add(entry);
                     stack.push_Object(entry_star_10_sub);
                       
          }
          return;
                    case entry_star_10_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case entry_star_10_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case expr_map: { // not synthetic
                                 List<Expr[]> entry_star_10=(List<Expr[]>)stack.pop_Object();
                                          int lcurl=stack.pop_int();
                                                stack.push_Object(grammarEvaluator.expr_map(lcurl,entry_star_10));
                      
          }
          return;
                    case expr_unary_not: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_not(expr));
                      
          }
          return;
                    case expr_unary_neg: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_neg(expr));
                      
          }
          return;
                    case expr_unary_plus: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_plus(expr));
                      
          }
          return;
                    case expr_binary_add: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_add(expr,expr2));
                      
          }
          return;
                    case expr_binary_sub: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_sub(expr,expr2));
                      
          }
          return;
                    case expr_binary_mul: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mul(expr,expr2));
                      
          }
          return;
                    case expr_binary_div: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_div(expr,expr2));
                      
          }
          return;
                    case expr_binary_mod: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_mod(expr,expr2));
                      
          }
          return;
                    case expr_binary_eq: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_eq(expr,expr2));
                      
          }
          return;
                    case expr_binary_ne: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ne(expr,expr2));
                      
          }
          return;
                    case expr_binary_lt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_lt(expr,expr2));
                      
          }
          return;
                    case expr_binary_le: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_le(expr,expr2));
                      
          }
          return;
                    case expr_binary_gt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_gt(expr,expr2));
                      
          }
          return;
                    case expr_binary_ge: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_binary_ge(expr,expr2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case repl:
             grammarEvaluator.acceptRepl();
             return;
                      case script:
             grammarEvaluator.acceptScript();
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case plus:
              
              return;
                         case minus:
              
              return;
                         case star:
              
              return;
                         case slash:
              
              return;
                         case mod:
              
              return;
                         case assign:
              
              return;
                         case eq:
              
              return;
                         case ne:
              
              return;
                         case lt:
              
              return;
                         case le:
              
              return;
                         case gt:
              
              return;
                         case ge:
              
              return;
                         case dot:
              
              return;
                         case bang:
              
              return;
                         case pipe:
              stack.pop_int();
              return;
                         case aslash:
              stack.pop_int();
              return;
                         case at:
              
              return;
                         case sharp:
              
              return;
                         case colon:
              stack.pop_int();
              return;
                         case comma:
              
              return;
                         case semicolon:
              
              return;
                         case eol:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lopt:
              stack.pop_int();
              return;
                         case ropt:
              
              return;
                         case lcurl:
              stack.pop_int();
              return;
                         case rcurl:
              
              return;
                         case _while:
              
              return;
                         case _if:
              
              return;
                         case _return:
              
              return;
                         case _throw:
              
              return;
                         case value:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case quote:
              stack.pop_Object();
              return;
                         case text:
              stack.pop_Object();
              return;
                         case doc:
              stack.pop_Object();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case script:
              
              return;
                         case eoi:
              
              return;
                         case instrs:
              stack.pop_Object();
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case repl:
              
              return;
                         case block:
              stack.pop_Object();
              return;
                         case block_param:
              stack.pop_Object();
              return;
                         case parameter:
              stack.pop_Object();
              return;
                         case entry:
              stack.pop_Object();
              return;
                         case selector:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case instrs_optional_0:
              stack.pop_Object();
              return;
                         case doc_plus_1:
              stack.pop_Object();
              return;
                         case instrs_optional_2:
              stack.pop_Object();
              return;
                         case parameter_star_3:
              stack.pop_Object();
              return;
                         case parameter_star_3_sub:
              stack.pop_Object();
              return;
                         case parameter_star_4:
              stack.pop_Object();
              return;
                         case parameter_star_4_sub:
              stack.pop_Object();
              return;
                         case expr_star_5:
              stack.pop_Object();
              return;
                         case expr_star_5_sub:
              stack.pop_Object();
              return;
                         case block_param_optional_6:
              stack.pop_Object();
              return;
                         case expr_star_7:
              stack.pop_Object();
              return;
                         case expr_star_7_sub:
              stack.pop_Object();
              return;
                         case block_param_optional_8:
              stack.pop_Object();
              return;
                         case expr_star_9:
              stack.pop_Object();
              return;
                         case expr_star_9_sub:
              stack.pop_Object();
              return;
                         case entry_star_10:
              stack.pop_Object();
              return;
                         case entry_star_10_sub:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}