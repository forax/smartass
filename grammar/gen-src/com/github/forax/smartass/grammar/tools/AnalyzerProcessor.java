package com.github.forax.smartass.grammar.tools;

  import com.github.forax.smartass.ast.Expr;
    import com.github.forax.smartass.ast.Lambda;
    import com.github.forax.smartass.ast.Location;
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
                                  com.github.forax.smartass.ast.Location pipe=terminalEvaluator.pipe(data);
                                      stack.push_Object(pipe);
                                 return;
           }
                 case at: {
                       return;
           }
                 case colon: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Location colon=terminalEvaluator.colon(data);
                                      stack.push_Object(colon);
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
                                  com.github.forax.smartass.ast.Location lopt=terminalEvaluator.lopt(data);
                                      stack.push_Object(lopt);
                                 return;
           }
                 case ropt: {
                       return;
           }
                 case lcurl: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Location lcurl=terminalEvaluator.lcurl(data);
                                      stack.push_Object(lcurl);
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
                 case text: {
         data=dataViewer.view(buffer);
                                  com.github.forax.smartass.ast.Token<String> text=terminalEvaluator.text(data);
                                      stack.push_Object(text);
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
                    case instrs_optional_1_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case instrs_optional_1_instrs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case block: { // not synthetic
                                 List<Expr> instrs_optional_1=(List<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block(instrs_optional_1));
                      
          }
          return;
                    case block_param_block: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block_param_block(colon,block));
                      
          }
          return;
                    case id_star_2_element: { // STAR_SINGLETON
                             java.util.ArrayList<Token<String>> list=
                     new java.util.ArrayList<Token<String>>();
                   list.add((Token<String>)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_star_2_rec: { // STAR_RECURSIVE_LEFT
                            
                    Token<String> id=(Token<String>)stack.pop_Object();
                    List<Token<String>> id_star_2_sub=(List<Token<String>>)stack.pop_Object();
                     id_star_2_sub.add(id);
                     stack.push_Object(id_star_2_sub);
                       
          }
          return;
                    case id_star_2_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case id_star_2_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_lambda: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                          List<Token<String>> id_star_2=(List<Token<String>>)stack.pop_Object();
                                          Location pipe=(Location)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block_param_lambda(pipe,id_star_2,colon,block));
                      
          }
          return;
                    case name_id: { // not synthetic
                                 Token<String> id=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.name_id(id));
                      
          }
          return;
                    case name_text: { // not synthetic
                                 Token<String> text=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.name_text(text));
                      
          }
          return;
                    case expr_value: { // not synthetic
                                 Token<String> value=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_value(value));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(expr));
                      
          }
          return;
                    case expr_var_access: { // not synthetic
                                 Token<String> name=(Token<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_var_access(name));
                      
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
                    case expr_block: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_block(colon,block));
                      
          }
          return;
                    case id_plus_3_element: { // STAR_SINGLETON
                             java.util.ArrayList<Token<String>> list=
                     new java.util.ArrayList<Token<String>>();
                   list.add((Token<String>)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case id_plus_3_rec: { // STAR_RECURSIVE_LEFT
                            
                    Token<String> id=(Token<String>)stack.pop_Object();
                    List<Token<String>> id_plus_3=(List<Token<String>>)stack.pop_Object();
                     id_plus_3.add(id);
                     stack.push_Object(id_plus_3);
                       
          }
          return;
                    case expr_lambda: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                          List<Token<String>> id_plus_3=(List<Token<String>>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_lambda(id_plus_3,colon,block));
                      
          }
          return;
                    case expr_star_4_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_4_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_4_sub=(List<Expr>)stack.pop_Object();
                     expr_star_4_sub.add(expr);
                     stack.push_Object(expr_star_4_sub);
                       
          }
          return;
                    case expr_star_4_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_4_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_optional_5_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case block_param_optional_5_block_param: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case expr_funcall: { // not synthetic
                                 Lambda block_param_optional_5=(Lambda)stack.pop_Object();
                                          List<Expr> expr_star_4=(List<Expr>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_funcall(expr,expr_star_4,block_param_optional_5));
                      
          }
          return;
                    case expr_star_6_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_6_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_6_sub=(List<Expr>)stack.pop_Object();
                     expr_star_6_sub.add(expr);
                     stack.push_Object(expr_star_6_sub);
                       
          }
          return;
                    case expr_star_6_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_6_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case block_param_optional_7_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case block_param_optional_7_block_param: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case expr_mthcall: { // not synthetic
                                 Lambda block_param_optional_7=(Lambda)stack.pop_Object();
                                          List<Expr> expr_star_6=(List<Expr>)stack.pop_Object();
                                          Token<String> name=(Token<String>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mthcall(expr,name,expr_star_6,block_param_optional_7));
                      
          }
          return;
                    case expr_while: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_while(expr,colon,block));
                      
          }
          return;
                    case expr_if: { // not synthetic
                                 List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if(expr,colon,block));
                      
          }
          return;
                    case expr_ifelse: { // not synthetic
                                 List<Expr> block2=(List<Expr>)stack.pop_Object();
                                          Location colon2=(Location)stack.pop_Object();
                                          List<Expr> block=(List<Expr>)stack.pop_Object();
                                          Location colon=(Location)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ifelse(expr,colon,block,colon2,block2));
                      
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
       switch(nonterminal) {            case script:
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
              stack.pop_Object();
              return;
                         case at:
              
              return;
                         case colon:
              stack.pop_Object();
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
              stack.pop_Object();
              return;
                         case ropt:
              
              return;
                         case lcurl:
              stack.pop_Object();
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
                         case text:
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
                         case block:
              stack.pop_Object();
              return;
                         case block_param:
              stack.pop_Object();
              return;
                         case name:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case instrs_optional_0:
              stack.pop_Object();
              return;
                         case instrs_optional_1:
              stack.pop_Object();
              return;
                         case id_star_2:
              stack.pop_Object();
              return;
                         case id_star_2_sub:
              stack.pop_Object();
              return;
                         case id_plus_3:
              stack.pop_Object();
              return;
                         case expr_star_4:
              stack.pop_Object();
              return;
                         case expr_star_4_sub:
              stack.pop_Object();
              return;
                         case block_param_optional_5:
              stack.pop_Object();
              return;
                         case expr_star_6:
              stack.pop_Object();
              return;
                         case expr_star_6_sub:
              stack.pop_Object();
              return;
                         case block_param_optional_7:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}