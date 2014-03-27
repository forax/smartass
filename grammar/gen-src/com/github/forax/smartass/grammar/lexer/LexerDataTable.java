package com.github.forax.smartass.grammar.lexer;

import com.github.forax.smartass.grammar.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(1, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 0, false);
    initminusMainAccepts();
    initminusMainTransitions();
    CharRegexTable minusMain = new CharRegexTable(1, minusMainTransitions, minusMainAccepts);
    RuleData minus = new RuleData(minusMain, null, 1, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 2, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 3, false);
    initmodMainAccepts();
    initmodMainTransitions();
    CharRegexTable modMain = new CharRegexTable(1, modMainTransitions, modMainAccepts);
    RuleData mod = new RuleData(modMain, null, 4, false);
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 5, false);
    initeqMainAccepts();
    initeqMainTransitions();
    CharRegexTable eqMain = new CharRegexTable(1, eqMainTransitions, eqMainAccepts);
    RuleData eq = new RuleData(eqMain, null, 6, false);
    initneMainAccepts();
    initneMainTransitions();
    CharRegexTable neMain = new CharRegexTable(1, neMainTransitions, neMainAccepts);
    RuleData ne = new RuleData(neMain, null, 7, false);
    initltMainAccepts();
    initltMainTransitions();
    CharRegexTable ltMain = new CharRegexTable(1, ltMainTransitions, ltMainAccepts);
    RuleData lt = new RuleData(ltMain, null, 8, false);
    initleMainAccepts();
    initleMainTransitions();
    CharRegexTable leMain = new CharRegexTable(2, leMainTransitions, leMainAccepts);
    RuleData le = new RuleData(leMain, null, 9, false);
    initgtMainAccepts();
    initgtMainTransitions();
    CharRegexTable gtMain = new CharRegexTable(1, gtMainTransitions, gtMainAccepts);
    RuleData gt = new RuleData(gtMain, null, 10, false);
    initgeMainAccepts();
    initgeMainTransitions();
    CharRegexTable geMain = new CharRegexTable(2, geMainTransitions, geMainAccepts);
    RuleData ge = new RuleData(geMain, null, 11, false);
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(1, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 12, false);
    initbangMainAccepts();
    initbangMainTransitions();
    CharRegexTable bangMain = new CharRegexTable(1, bangMainTransitions, bangMainAccepts);
    RuleData bang = new RuleData(bangMain, null, 13, false);
    initpipeMainAccepts();
    initpipeMainTransitions();
    CharRegexTable pipeMain = new CharRegexTable(1, pipeMainTransitions, pipeMainAccepts);
    RuleData pipe = new RuleData(pipeMain, null, 14, false);
    initatMainAccepts();
    initatMainTransitions();
    CharRegexTable atMain = new CharRegexTable(1, atMainTransitions, atMainAccepts);
    RuleData at = new RuleData(atMain, null, 15, false);
    initsharpMainAccepts();
    initsharpMainTransitions();
    CharRegexTable sharpMain = new CharRegexTable(1, sharpMainTransitions, sharpMainAccepts);
    RuleData sharp = new RuleData(sharpMain, null, 16, false);
    initcolonMainAccepts();
    initcolonMainTransitions();
    CharRegexTable colonMain = new CharRegexTable(1, colonMainTransitions, colonMainAccepts);
    RuleData colon = new RuleData(colonMain, null, 17, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(1, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 18, false);
    initsemicolonMainAccepts();
    initsemicolonMainTransitions();
    CharRegexTable semicolonMain = new CharRegexTable(1, semicolonMainTransitions, semicolonMainAccepts);
    RuleData semicolon = new RuleData(semicolonMain, null, 19, false);
    initeolMainAccepts();
    initeolMainTransitions();
    CharRegexTable eolMain = new CharRegexTable(1, eolMainTransitions, eolMainAccepts);
    RuleData eol = new RuleData(eolMain, null, 20, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 21, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 22, false);
    initloptMainAccepts();
    initloptMainTransitions();
    CharRegexTable loptMain = new CharRegexTable(1, loptMainTransitions, loptMainAccepts);
    RuleData lopt = new RuleData(loptMain, null, 23, false);
    initroptMainAccepts();
    initroptMainTransitions();
    CharRegexTable roptMain = new CharRegexTable(1, roptMainTransitions, roptMainAccepts);
    RuleData ropt = new RuleData(roptMain, null, 24, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(1, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 25, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(1, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 26, false);
    init_whileMainAccepts();
    init_whileMainTransitions();
    CharRegexTable _whileMain = new CharRegexTable(1, _whileMainTransitions, _whileMainAccepts);
    RuleData _while = new RuleData(_whileMain, null, 27, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(1, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 28, false);
    init_returnMainAccepts();
    init_returnMainTransitions();
    CharRegexTable _returnMain = new CharRegexTable(3, _returnMainTransitions, _returnMainAccepts);
    RuleData _return = new RuleData(_returnMain, null, 29, false);
    init_throwMainAccepts();
    init_throwMainTransitions();
    CharRegexTable _throwMain = new CharRegexTable(4, _throwMainTransitions, _throwMainAccepts);
    RuleData _throw = new RuleData(_throwMain, null, 30, false);
    initvalueMainAccepts();
    initvalueMainTransitions();
    CharRegexTable valueMain = new CharRegexTable(10, valueMainTransitions, valueMainAccepts);
    RuleData value = new RuleData(valueMain, null, 31, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(1, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 32, false);
    inittextMainAccepts();
    inittextMainTransitions();
    CharRegexTable textMain = new CharRegexTable(1, textMainTransitions, textMainAccepts);
    RuleData text = new RuleData(textMain, null, 33, false);
    initdocMainAccepts();
    initdocMainTransitions();
    CharRegexTable docMain = new CharRegexTable(1, docMainTransitions, docMainAccepts);
    RuleData doc = new RuleData(docMain, null, 34, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 35, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(1, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 36, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.plus, plus);
    datas.put(RuleEnum.minus, minus);
    datas.put(RuleEnum.star, star);
    datas.put(RuleEnum.slash, slash);
    datas.put(RuleEnum.mod, mod);
    datas.put(RuleEnum.assign, assign);
    datas.put(RuleEnum.eq, eq);
    datas.put(RuleEnum.ne, ne);
    datas.put(RuleEnum.lt, lt);
    datas.put(RuleEnum.le, le);
    datas.put(RuleEnum.gt, gt);
    datas.put(RuleEnum.ge, ge);
    datas.put(RuleEnum.dot, dot);
    datas.put(RuleEnum.bang, bang);
    datas.put(RuleEnum.pipe, pipe);
    datas.put(RuleEnum.at, at);
    datas.put(RuleEnum.sharp, sharp);
    datas.put(RuleEnum.colon, colon);
    datas.put(RuleEnum.comma, comma);
    datas.put(RuleEnum.semicolon, semicolon);
    datas.put(RuleEnum.eol, eol);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.lopt, lopt);
    datas.put(RuleEnum.ropt, ropt);
    datas.put(RuleEnum.lcurl, lcurl);
    datas.put(RuleEnum.rcurl, rcurl);
    datas.put(RuleEnum._while, _while);
    datas.put(RuleEnum._if, _if);
    datas.put(RuleEnum._return, _return);
    datas.put(RuleEnum._throw, _throw);
    datas.put(RuleEnum.value, value);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.text, text);
    datas.put(RuleEnum.doc, doc);
    datas.put(RuleEnum.space, space);
    datas.put(RuleEnum.comment, comment);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] plusMainAccepts;
  private void initplusMainAccepts() {
    plusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] plusMainTransitions;
  private void initplusMainTransitions() {
    plusMainTransitions = new int[][] {{0,-1},{0,-1,43,0,44,-1}};
  }
  
  private boolean[] minusMainAccepts;
  private void initminusMainAccepts() {
    minusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] minusMainTransitions;
  private void initminusMainTransitions() {
    minusMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] starMainAccepts;
  private void initstarMainAccepts() {
    starMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] starMainTransitions;
  private void initstarMainTransitions() {
    starMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] modMainAccepts;
  private void initmodMainAccepts() {
    modMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] modMainTransitions;
  private void initmodMainTransitions() {
    modMainTransitions = new int[][] {{0,-1},{0,-1,37,0,38,-1}};
  }
  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] eqMainAccepts;
  private void initeqMainAccepts() {
    eqMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eqMainTransitions;
  private void initeqMainTransitions() {
    eqMainTransitions = new int[][] {{0,-1},{0,-1,61,2,62,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] neMainAccepts;
  private void initneMainAccepts() {
    neMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] neMainTransitions;
  private void initneMainTransitions() {
    neMainTransitions = new int[][] {{0,-1},{0,-1,33,2,34,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] ltMainAccepts;
  private void initltMainAccepts() {
    ltMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] ltMainTransitions;
  private void initltMainTransitions() {
    ltMainTransitions = new int[][] {{0,-1},{0,-1,60,0,61,-1}};
  }
  
  private boolean[] leMainAccepts;
  private void initleMainAccepts() {
    leMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] leMainTransitions;
  private void initleMainTransitions() {
    leMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,60,1,61,-1}};
  }
  
  private boolean[] gtMainAccepts;
  private void initgtMainAccepts() {
    gtMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] gtMainTransitions;
  private void initgtMainTransitions() {
    gtMainTransitions = new int[][] {{0,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] geMainAccepts;
  private void initgeMainAccepts() {
    geMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] geMainTransitions;
  private void initgeMainTransitions() {
    geMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,62,1,63,-1}};
  }
  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1},{0,-1,46,0,47,-1}};
  }
  
  private boolean[] bangMainAccepts;
  private void initbangMainAccepts() {
    bangMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] bangMainTransitions;
  private void initbangMainTransitions() {
    bangMainTransitions = new int[][] {{0,-1},{0,-1,33,0,34,-1}};
  }
  
  private boolean[] pipeMainAccepts;
  private void initpipeMainAccepts() {
    pipeMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] pipeMainTransitions;
  private void initpipeMainTransitions() {
    pipeMainTransitions = new int[][] {{0,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] atMainAccepts;
  private void initatMainAccepts() {
    atMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] atMainTransitions;
  private void initatMainTransitions() {
    atMainTransitions = new int[][] {{0,-1},{0,-1,64,0,65,-1}};
  }
  
  private boolean[] sharpMainAccepts;
  private void initsharpMainAccepts() {
    sharpMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] sharpMainTransitions;
  private void initsharpMainTransitions() {
    sharpMainTransitions = new int[][] {{0,-1},{0,-1,35,0,36,-1}};
  }
  
  private boolean[] colonMainAccepts;
  private void initcolonMainAccepts() {
    colonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] colonMainTransitions;
  private void initcolonMainTransitions() {
    colonMainTransitions = new int[][] {{0,-1},{0,-1,58,0,59,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1},{0,-1,44,0,45,-1}};
  }
  
  private boolean[] semicolonMainAccepts;
  private void initsemicolonMainAccepts() {
    semicolonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] semicolonMainTransitions;
  private void initsemicolonMainTransitions() {
    semicolonMainTransitions = new int[][] {{0,-1},{0,-1,59,0,60,-1}};
  }
  
  private boolean[] eolMainAccepts;
  private void initeolMainAccepts() {
    eolMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] eolMainTransitions;
  private void initeolMainTransitions() {
    eolMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] loptMainAccepts;
  private void initloptMainAccepts() {
    loptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] loptMainTransitions;
  private void initloptMainTransitions() {
    loptMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] roptMainAccepts;
  private void initroptMainAccepts() {
    roptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] roptMainTransitions;
  private void initroptMainTransitions() {
    roptMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] _whileMainAccepts;
  private void init_whileMainAccepts() {
    _whileMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _whileMainTransitions;
  private void init_whileMainTransitions() {
    _whileMainTransitions = new int[][] {{0,-1},{0,-1,119,5,120,-1},{0,-1,105,4,106,-1},{0,-1,101,0,102,-1},{0,-1,108,3,109,-1},{0,-1,104,2,105,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1},{0,-1,105,2,106,-1},{0,-1,102,0,103,-1}};
  }
  
  private boolean[] _returnMainAccepts;
  private void init_returnMainAccepts() {
    _returnMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] _returnMainTransitions;
  private void init_returnMainTransitions() {
    _returnMainTransitions = new int[][] {{0,-1},{0,-1,101,6,102,-1},{0,-1,117,4,118,-1},{0,-1,114,1,115,-1},{0,-1,114,5,115,-1},{0,-1,110,0,111,-1},{0,-1,116,2,117,-1}};
  }
  
  private boolean[] _throwMainAccepts;
  private void init_throwMainAccepts() {
    _throwMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _throwMainTransitions;
  private void init_throwMainTransitions() {
    _throwMainTransitions = new int[][] {{0,-1},{0,-1,111,2,112,-1},{0,-1,119,0,120,-1},{0,-1,114,1,115,-1},{0,-1,116,5,117,-1},{0,-1,104,3,105,-1}};
  }
  
  private boolean[] valueMainAccepts;
  private void initvalueMainAccepts() {
    valueMainAccepts = new boolean[] {true,true,true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] valueMainTransitions;
  private void initvalueMainTransitions() {
    valueMainTransitions = new int[][] {{0,-1},{0,-1,48,1,58,-1},{0,-1,46,9,47,-1,48,2,58,-1},{0,-1,117,6,118,-1},{0,-1,115,6,116,-1},{0,-1,97,8,98,-1},{0,-1,101,0,102,-1},{0,-1,114,3,115,-1},{0,-1,108,4,109,-1},{0,-1,48,1,58,-1},{0,-1,48,2,58,-1,102,5,103,-1,116,7,117,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,48,0,58,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1},{0,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1}};
  }
  
  private boolean[] textMainAccepts;
  private void inittextMainAccepts() {
    textMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] textMainTransitions;
  private void inittextMainTransitions() {
    textMainTransitions = new int[][] {{0,-1},{0,-1,39,2,40,-1},{0,2,39,0,40,2}};
  }
  
  private boolean[] docMainAccepts;
  private void initdocMainAccepts() {
    docMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] docMainTransitions;
  private void initdocMainTransitions() {
    docMainTransitions = new int[][] {{0,-1},{0,-1,35,3,36,-1},{0,-1,10,0,11,-1},{0,3,10,0,11,3,13,2,14,3}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,-1},{0,-1,47,2,48,-1},{0,-1,47,4,48,-1},{0,-1,10,0,11,-1},{0,4,10,0,11,4,13,3,14,4}};
  }
  
  private final LexerTable<RuleEnum> table;
}
