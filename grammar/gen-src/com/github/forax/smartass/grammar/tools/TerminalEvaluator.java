package com.github.forax.smartass.grammar.tools;

import com.github.forax.smartass.ast.Location;
import com.github.forax.smartass.ast.Token;

/** 
 *  @param <D> data type passed by the lexer listener.
 *
 *  This class is generated - please do not edit it 
 */
public interface TerminalEvaluator<D> {
  /** This method is called when the rule <code>comment</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
   */
  public void comment(D data);
  /** This method is called when the rule <code>text</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Token<String> text(D data);
  /** This method is called when the rule <code>id</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Token<String> id(D data);
  /** This method is called when the rule <code>doc</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Token<String> doc(D data);
  /** This method is called when the rule <code>value</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Token<String> value(D data);
  /** This method is called when the rule <code>colon</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Location colon(D data);
  /** This method is called when the rule <code>pipe</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Location pipe(D data);
  /** This method is called when the rule <code>lcurl</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Location lcurl(D data);
  /** This method is called when the rule <code>lopt</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public Location lopt(D data);
}
