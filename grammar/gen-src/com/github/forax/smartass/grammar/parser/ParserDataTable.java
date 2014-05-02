package com.github.forax.smartass.grammar.parser;

import com.github.forax.smartass.grammar.parser.NonTerminalEnum;
import com.github.forax.smartass.grammar.parser.ProductionEnum;
import com.github.forax.smartass.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initscriptGotoes();
    initblock_paramGotoes();
    initparameter_star_4Gotoes();
    initreplGotoes();
    initinstrs_optional_2Gotoes();
    initentry_star_10Gotoes();
    initexprGotoes();
    initselectorGotoes();
    initinstrs_optional_0Gotoes();
    initinstrsGotoes();
    initblock_param_optional_6Gotoes();
    initeoiGotoes();
    initentryGotoes();
    initparameter_star_3Gotoes();
    initdoc_plus_1Gotoes();
    initparameterGotoes();
    initblock_param_optional_8Gotoes();
    initinstrGotoes();
    initentry_star_10_subGotoes();
    initexpr_star_7Gotoes();
    initparameter_star_3_subGotoes();
    initexpr_star_5Gotoes();
    initexpr_star_9_subGotoes();
    initexpr_star_9Gotoes();
    initexpr_star_5_subGotoes();
    initexpr_star_7_subGotoes();
    initblockGotoes();
    initparameter_star_4_subGotoes();
    reduceentry_key_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_key_value,3,entryGotoes);
    reduceentry_star_10_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_element,1,entry_star_10_subGotoes);
    reduceparameter_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_id,1,parameterGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,2,instrGotoes);
    reduceparameter_star_3_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_element,1,parameter_star_3_subGotoes);
    reduceinstrs_optional_0_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_instrs,1,instrs_optional_0Gotoes);
    reduceexpr_map = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_map,3,exprGotoes);
    reduceblock_param_optional_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_empty,0,block_param_optional_8Gotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,7,exprGotoes);
    reduceinstrs_optional_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_empty,0,instrs_optional_2Gotoes);
    reduceexpr_star_9_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_rec,3,expr_star_9_subGotoes);
    reduceparameter_star_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_4_element,1,parameter_star_4_subGotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceparameter_star_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_4_empty,0,parameter_star_4Gotoes);
    reduceexpr_ifelse = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ifelse,8,exprGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reducerepl_rec_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.repl_rec_expr,3,replGotoes);
    reduceblock_param_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_lambda,4,block_paramGotoes);
    reduceinstr_throw = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_throw,2,instrGotoes);
    reduceparameter_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_empty,0,parameter_star_3Gotoes);
    reduceexpr_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_text,1,exprGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_star_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_empty,0,expr_star_7Gotoes);
    reduceparameter_hint_id_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_hint_id_id,2,parameterGotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,5,exprGotoes);
    reduceexpr_star_5_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_through,1,expr_star_5Gotoes);
    reducerepl_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.repl_expr,1,replGotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,2,exprGotoes);
    reduceeoi_eol = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_eol,1,eoiGotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceentry_star_10_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_through,1,entry_star_10Gotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceentry_star_10_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_empty,0,entry_star_10Gotoes);
    reduceinstrs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_rec,3,instrsGotoes);
    reduceinstr_doc_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_doc_expr,2,instrGotoes);
    reduceinstrs_optional_2_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_instrs,1,instrs_optional_2Gotoes);
    reduceexpr_star_7_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_element,1,expr_star_7_subGotoes);
    reduceselector_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.selector_quote,1,selectorGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_fieldcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_fieldcall,3,exprGotoes);
    reduceparameter_star_4_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_4_through,1,parameter_star_4Gotoes);
    reduceparameter_hint_quote_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_hint_quote_id,2,parameterGotoes);
    reduceexpr_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_block,6,exprGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,1,instrGotoes);
    reduceblock_param_optional_6_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_block_param,1,block_param_optional_6Gotoes);
    reduceentry_hint_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_hint_quote,2,entryGotoes);
    reduceexpr_unary_neg = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_neg,2,exprGotoes);
    reducedoc_plus_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_element,1,doc_plus_1Gotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceparameter_star_3_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_through,1,parameter_star_3Gotoes);
    reduceexpr_star_9_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_through,1,expr_star_9Gotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_star_9_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_empty,0,expr_star_9Gotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceexpr_star_5_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_rec,3,expr_star_5_subGotoes);
    reduceexpr_star_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_rec,3,expr_star_7_subGotoes);
    reduceparameter_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_rec,3,parameter_star_3_subGotoes);
    reduceexpr_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_quote,1,exprGotoes);
    reduceentry_star_10_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_rec,3,entry_star_10_subGotoes);
    reduceexpr_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_value,1,exprGotoes);
    reduceselector_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.selector_id,1,selectorGotoes);
    reduceparameter_star_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_4_rec,3,parameter_star_4_subGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,6,exprGotoes);
    reducedoc_plus_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_rec,2,doc_plus_1Gotoes);
    reduceentry_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_expr,1,entryGotoes);
    reduceentry_hint_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_hint_id,2,entryGotoes);
    reduceexpr_star_7_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_through,1,expr_star_7Gotoes);
    reduceexpr_star_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_empty,0,expr_star_5Gotoes);
    reduceinstrs_instr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr,1,instrsGotoes);
    reduceexpr_star_9_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_element,1,expr_star_9_subGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceblock_param_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_block,2,block_paramGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceinstrs_instr_eoi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr_eoi,2,instrsGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceblock_param_optional_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_empty,0,block_param_optional_6Gotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceblock_param_optional_8_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_block_param,1,block_param_optional_8Gotoes);
    reduceinstrs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_empty,0,instrs_optional_0Gotoes);
    reduceexpr_list = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_list,3,exprGotoes);
    reduceexpr_star_5_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_element,1,expr_star_5_subGotoes);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift73 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(73);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift103 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(103);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift116 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(116);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift108 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(108);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift79 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(79);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift59 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(59);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift105 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(105);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift100 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(100);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift106 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(106);
    shift86 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(86);
    shift128 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(128);
    shift63 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(63);
    shift135 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(135);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift44 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(44);
    shift130 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(130);
    shift120 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(120);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift132 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(132);
    shift117 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(117);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift94 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(94);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift48 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(48);
    shift112 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(112);
    shift74 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(74);
    shift124 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(124);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift114 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(114);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift68 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(68);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initcommaArray();
    initlparArray();
    init__eof__Array();
    init_whileArray();
    initminusArray();
    initpipeArray();
    initneArray();
    initloptArray();
    initdocArray();
    initcolonArray();
    initstarArray();
    initslashArray();
    initgeArray();
    init_returnArray();
    initquoteArray();
    inittextArray();
    initassignArray();
    initatArray();
    initleArray();
    initvalueArray();
    initroptArray();
    initgtArray();
    initmodArray();
    initeqArray();
    initrcurlArray();
    initltArray();
    initdotArray();
    initsemicolonArray();
    initplusArray();
    initrparArray();
    initlcurlArray();
    initeolArray();
    init_throwArray();
    initidArray();
    initbangArray();
    init_ifArray();
    initaslashArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.doc,docArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.quote,quoteArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.at,atArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.value,valueArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum._throw,_throwArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.aslash,aslashArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.repl,0);
    tableStarts.put(NonTerminalEnum.script,141);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),146,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0eol_metadata0reduceeoi_eol = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceeoi_eol);
    metadata0instr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0rcurl_metadata0reduceexpr_map = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceexpr_map);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0block_metadata0reduceblock_param_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_lambda);
    metadata0id_metadata0reduceexpr_field_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_field_access);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0block_param_optional_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_8,null);
    metadata0parameter_metadata0reduceparameter_star_4_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_4_rec);
    metadata0expr_star_9_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9_sub,null);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0quote_metadata0reduceselector_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceselector_quote);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0parameter_metadata0reduceparameter_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_rec);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0instrs_metadata0reduceinstrs_optional_0_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_0_instrs);
    metadata0block_metadata0reduceblock_param_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_block);
    metadata0instrs_metadata0reduceinstrs_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_rec);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0entry_metadata0reduceentry_star_10_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry,reduceentry_star_10_element);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0parameter_star_3_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3_sub,null);
    metadata0ropt_metadata0reduceexpr_list = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,reduceexpr_list);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0instrs_optional_0_metadata0reducescript = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_0,reducescript);
    metadata0instrs_optional_2_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_2,reduceblock);
    metadata0quote_metadata0reduceentry_hint_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceentry_hint_quote);
    metadata0parameter_metadata0reduceparameter_star_3_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_element);
    metadata0expr_star_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7,null);
    metadata0id_metadata0reduceparameter_hint_id_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter_hint_id_id);
    metadata0at_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.at,null);
    metadata0parameter_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3,null);
    metadata0repl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.repl,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0parameter_metadata0reduceparameter_star_4_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_4_element);
    metadata0parameter_star_4_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_4_sub,null);
    metadata0doc_plus_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.doc_plus_1,null);
    metadata0doc_metadata0reducedoc_plus_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_rec);
    metadata0entry_star_10_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry_star_10,null);
    metadata0quote_metadata0reduceexpr_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceexpr_quote);
    metadata0aslash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.aslash,null);
    metadata0entry_star_10_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry_star_10_sub,null);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0expr_star_7_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7_sub,null);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0expr_star_9_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0rpar_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_while);
    metadata0_throw_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._throw,null);
    metadata0selector_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.selector,null);
    metadata0instrs_metadata0reduceinstrs_optional_2_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_2_instrs);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0value_metadata0reduceexpr_value = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.value,reduceexpr_value);
    metadata0lcurl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,null);
    metadata0expr_star_5_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5_sub,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0rpar_metadata0reduceexpr_ifelse = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_ifelse);
    metadata0eoi_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0doc_metadata0reducedoc_plus_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_element);
    metadata0id_metadata0reduceselector_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceselector_id);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0block_param_optional_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_6,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0block_param_metadata0reduceblock_param_optional_8_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_8_block_param);
    metadata0rpar_metadata0reduceexpr_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_block);
    metadata0id_metadata0reduceparameter_hint_quote_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter_hint_quote_id);
    metadata0lopt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,null);
    metadata0entry_metadata0reduceentry_star_10_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry,reduceentry_star_10_rec);
    metadata0quote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,null);
    metadata0id_metadata0reduceentry_hint_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceentry_hint_id);
    metadata0parameter_star_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_4,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0text_metadata0reduceexpr_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reduceexpr_text);
    metadata0block_param_metadata0reduceblock_param_optional_6_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_6_block_param);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0expr_star_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0lpar_metadata0null,metadata0minus_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0lopt_metadata0null,metadata0quote_metadata0reduceexpr_quote,metadata0plus_metadata0null,metadata0text_metadata0reduceexpr_text,metadata0at_metadata0null,metadata0id_metadata0reduceexpr_field_access,metadata0value_metadata0reduceexpr_value,metadata0lcurl_metadata0null,metadata0bang_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0aslash_metadata0null,metadata0lpar_metadata0null,metadata0quote_metadata0null,metadata0id_metadata0reduceparameter_hint_quote_id,metadata0id_metadata0null,metadata0id_metadata0reduceparameter_hint_id_id,metadata0parameter_star_4_metadata0null,metadata0colon_metadata0null,metadata0doc_metadata0reducedoc_plus_1_element,metadata0_return_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_5_metadata0null,metadata0pipe_metadata0null,metadata0parameter_star_3_metadata0null,metadata0colon_metadata0null,metadata0_throw_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0quote_metadata0reduceselector_quote,metadata0id_metadata0reduceselector_id,metadata0selector_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_7_metadata0null,metadata0colon_metadata0null,metadata0instrs_optional_2_metadata0reduceblock,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0doc_plus_1_metadata0null,metadata0doc_metadata0reducedoc_plus_1_rec,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_optional_2_instrs,metadata0block_metadata0reduceblock_param_block,metadata0instr_metadata0null,metadata0eol_metadata0reduceeoi_eol,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0null,metadata0instrs_metadata0reduceinstrs_rec,metadata0block_param_metadata0reduceblock_param_optional_8_block_param,metadata0block_param_optional_8_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0expr_metadata0null,metadata0expr_star_7_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0block_metadata0reduceblock_param_lambda,metadata0parameter_star_3_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_3_rec,metadata0parameter_metadata0reduceparameter_star_3_element,metadata0block_param_optional_6_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0block_param_metadata0reduceblock_param_optional_6_block_param,metadata0expr_metadata0null,metadata0expr_star_5_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_block,metadata0parameter_metadata0reduceparameter_star_4_element,metadata0parameter_star_4_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_4_rec,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_ifelse,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0entry_star_10_metadata0null,metadata0rcurl_metadata0reduceexpr_map,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0expr_metadata0null,metadata0quote_metadata0reduceentry_hint_quote,metadata0id_metadata0reduceentry_hint_id,metadata0entry_metadata0reduceentry_star_10_element,metadata0entry_star_10_sub_metadata0null,metadata0comma_metadata0null,metadata0entry_metadata0reduceentry_star_10_rec,metadata0expr_metadata0null,metadata0expr_star_9_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_star_9_metadata0null,metadata0ropt_metadata0reduceexpr_list,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_while,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0repl_metadata0null,metadata0__eof___metadata0null,metadata0eoi_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0null_metadata0null,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0instrs_optional_0_metadata0reducescript,metadata0instrs_metadata0reduceinstrs_optional_0_instrs};
  }

  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,142,-1,-1,-1,-1};
  }
  
  private int[] block_paramGotoes;

  private void initblock_paramGotoes() {
    block_paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_4Gotoes;

  private void initparameter_star_4Gotoes() {
    parameter_star_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] replGotoes;

  private void initreplGotoes() {
    replGotoes = 
      new int[]{136,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_2Gotoes;

  private void initinstrs_optional_2Gotoes() {
    instrs_optional_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] entry_star_10Gotoes;

  private void initentry_star_10Gotoes() {
    entry_star_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,111,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{140,134,133,-1,129,126,-1,122,-1,-1,-1,-1,113,110,-1,109,-1,102,-1,-1,-1,-1,-1,-1,-1,52,-1,28,-1,30,-1,92,-1,-1,-1,52,37,-1,39,-1,41,-1,43,-1,-1,-1,-1,-1,80,-1,52,-1,-1,54,-1,56,-1,58,-1,60,-1,62,-1,64,-1,66,-1,69,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,95,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,115,-1,-1,-1,-1,-1,113,-1,-1,-1,125,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,139,-1,-1,52,-1,-1,-1,-1};
  }
  
  private int[] selectorGotoes;

  private void initselectorGotoes() {
    selectorGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,47,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_0Gotoes;

  private void initinstrs_optional_0Gotoes() {
    instrs_optional_0Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,144,-1,-1,-1,-1};
  }
  
  private int[] instrsGotoes;

  private void initinstrsGotoes() {
    instrsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,76,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,145,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_6Gotoes;

  private void initblock_param_optional_6Gotoes() {
    block_param_optional_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,89,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,138,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] entryGotoes;

  private void initentryGotoes() {
    entryGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,118,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,121,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3Gotoes;

  private void initparameter_star_3Gotoes() {
    parameter_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,34,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] doc_plus_1Gotoes;

  private void initdoc_plus_1Gotoes() {
    doc_plus_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1};
  }
  
  private int[] parameterGotoes;

  private void initparameterGotoes() {
    parameterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,98,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_8Gotoes;

  private void initblock_param_optional_8Gotoes() {
    block_param_optional_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,78,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1};
  }
  
  private int[] entry_star_10_subGotoes;

  private void initentry_star_10_subGotoes() {
    entry_star_10_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,119,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7Gotoes;

  private void initexpr_star_7Gotoes() {
    expr_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3_subGotoes;

  private void initparameter_star_3_subGotoes() {
    parameter_star_3_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,85,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5Gotoes;

  private void initexpr_star_5Gotoes() {
    expr_star_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9_subGotoes;

  private void initexpr_star_9_subGotoes() {
    expr_star_9_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9Gotoes;

  private void initexpr_star_9Gotoes() {
    expr_star_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,127,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5_subGotoes;

  private void initexpr_star_5_subGotoes() {
    expr_star_5_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7_subGotoes;

  private void initexpr_star_7_subGotoes() {
    expr_star_7_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,131,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_4_subGotoes;

  private void initparameter_star_4_subGotoes() {
    parameter_star_4_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,99,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_hint_quote_id,reduceparameter_id,reduceparameter_hint_id_id,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,reduceexpr_star_7_element,shift82,branch0,reduceexpr_star_7_rec,branch0,shift86,branch0,reduceparameter_star_3_rec,reduceparameter_star_3_element,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,shift94,branch0,reduceexpr_star_5_rec,branch0,reduceexpr_block,reduceparameter_star_4_element,shift100,branch0,reduceparameter_star_4_rec,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,reduceentry_expr,branch0,reduceentry_key_value,reduceentry_hint_quote,reduceentry_hint_id,reduceentry_star_10_element,shift120,branch0,reduceentry_star_10_rec,reduceexpr_unary_plus,shift124,branch0,reduceexpr_star_9_rec,reduceexpr_star_9_element,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,shift1,shift1,shift4,shift1,shift1,reduceexpr_quote,shift1,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,shift1,shift1,reduceexpr_var_access,shift1,shift17,shift1,shift19,branch0,branch0,branch0,branch0,branch0,branch0,shift1,reducedoc_plus_1_element,shift1,shift31,shift1,shift31,shift1,branch0,branch0,branch0,shift1,shift1,shift31,shift1,shift31,shift1,shift31,shift1,shift31,branch0,reduceselector_quote,reduceselector_id,shift48,shift1,branch0,shift1,branch0,shift31,shift1,shift31,shift1,shift31,shift1,shift31,shift1,shift31,shift1,shift31,shift1,shift31,shift1,shift31,shift1,reducedoc_plus_1_rec,shift31,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift1,branch0,branch0,branch0,reduceexpr_mthcall,shift31,branch0,shift1,shift31,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift31,branch0,shift1,shift31,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift31,shift1,branch0,reduceexpr_if,shift1,branch0,reduceexpr_ifelse,shift31,shift31,branch0,reduceexpr_map,shift31,shift1,shift31,branch0,branch0,branch0,branch0,shift1,branch0,shift31,branch0,shift1,shift31,shift31,branch0,reduceexpr_list,shift31,shift1,branch0,reduceexpr_while,shift31,shift31,reduceexpr_parens,branch0,branch0,shift1,shift31,shift31,shift1,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,accept,accept,branch0,reducerepl_rec_expr,reducerepl_expr,reduceinstrs_optional_0_empty,accept,accept,reducescript,reduceinstrs_optional_0_instrs};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift3,shift3,shift3,branch0,shift3,shift3,branch0,shift3,branch0,branch0,branch0,branch0,shift3,shift3,branch0,shift3,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,reducedoc_plus_1_element,shift3,branch0,shift3,branch0,shift3,branch0,branch0,branch0,shift3,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,branch0,branch0,branch0,branch0,shift3,branch0,shift3,branch0,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift3,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift2,shift2,shift2,branch0,shift2,shift2,reduceexpr_quote,shift2,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,shift2,shift2,reduceexpr_var_access,shift2,branch0,shift2,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift2,reducedoc_plus_1_element,shift2,shift38,shift2,shift38,shift2,branch0,branch0,branch0,shift2,shift2,shift38,shift2,reduceexpr_binary_sub,shift2,shift38,shift2,shift38,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,shift2,branch0,shift2,branch0,shift38,shift2,reduceexpr_binary_div,shift2,reduceexpr_binary_mul,shift2,shift38,shift2,reduceexpr_binary_add,shift2,shift38,shift2,shift38,shift2,reduceexpr_binary_mod,shift2,reducedoc_plus_1_rec,shift38,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift2,branch0,branch0,branch0,reduceexpr_mthcall,shift38,branch0,shift2,shift38,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift38,branch0,shift2,shift38,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift38,shift2,branch0,reduceexpr_if,shift2,branch0,reduceexpr_ifelse,shift38,reduceexpr_unary_not,branch0,reduceexpr_map,shift38,shift2,shift38,branch0,branch0,branch0,branch0,shift2,branch0,reduceexpr_unary_plus,branch0,shift2,shift38,shift38,branch0,reduceexpr_list,shift38,shift2,branch0,reduceexpr_while,reduceexpr_unary_neg,shift38,reduceexpr_parens,branch0,branch0,shift2,shift38,shift38,shift2,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_eq,reduceexpr_star_5_empty,shift33,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,reduceexpr_star_7_empty,shift33,branch0,branch0,branch0,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift42,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift42,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift42,branch0,branch0,shift42,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift42,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift42,reduceexpr_unary_not,branch0,reduceexpr_map,shift42,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift42,shift42,branch0,reduceexpr_list,shift42,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift42,reduceexpr_parens,branch0,branch0,branch0,shift42,shift42,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift5,shift5,shift5,branch0,shift5,shift5,branch0,shift5,branch0,branch0,branch0,branch0,shift5,shift5,branch0,shift5,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,reducedoc_plus_1_element,shift5,branch0,shift5,branch0,shift5,branch0,branch0,branch0,shift5,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,shift5,branch0,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift5,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] docArray;
  @SuppressWarnings("unchecked")
  private void initdocArray() {
    docArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,reducedoc_plus_1_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift68,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,branch0,branch0,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift26,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceparameter_star_4_empty,branch0,reduceparameter_hint_quote_id,reduceparameter_id,reduceparameter_hint_id_id,shift25,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_eq,reduceexpr_star_5_empty,shift50,reduceparameter_star_3_empty,shift35,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,reduceexpr_star_7_empty,shift50,branch0,reduceblock,reduceinstr_expr,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,reduceinstr_doc_expr,reduceinstrs_optional_2_instrs,branch0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,branch0,branch0,reduceexpr_mthcall,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,branch0,reduceparameter_star_3_through,branch0,reduceparameter_star_3_rec,reduceparameter_star_3_element,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,branch0,reduceexpr_block,reduceparameter_star_4_element,reduceparameter_star_4_through,branch0,reduceparameter_star_4_rec,shift103,reduceinstrs_optional_2_empty,shift106,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,shift114,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,shift130,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift55,branch0,shift55,branch0,branch0,branch0,branch0,branch0,branch0,shift55,branch0,shift55,branch0,shift55,branch0,shift55,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift55,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,shift55,branch0,shift55,branch0,shift55,branch0,shift55,branch0,reduceexpr_binary_mod,branch0,branch0,shift55,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift55,branch0,branch0,shift55,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift55,branch0,branch0,shift55,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift55,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift55,reduceexpr_unary_not,branch0,reduceexpr_map,shift55,branch0,shift55,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift55,shift55,branch0,reduceexpr_list,shift55,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift55,reduceexpr_parens,branch0,branch0,branch0,shift55,shift55,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift53,branch0,shift53,branch0,branch0,branch0,branch0,branch0,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift53,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,shift53,branch0,shift53,branch0,shift53,branch0,shift53,branch0,reduceexpr_binary_mod,branch0,branch0,shift53,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift53,branch0,branch0,shift53,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift53,branch0,branch0,shift53,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift53,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift53,reduceexpr_unary_not,branch0,reduceexpr_map,shift53,branch0,shift53,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift53,shift53,branch0,reduceexpr_list,shift53,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift53,reduceexpr_parens,branch0,branch0,branch0,shift53,shift53,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift57,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift57,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift57,branch0,branch0,shift57,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift57,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift57,reduceexpr_unary_not,branch0,reduceexpr_map,shift57,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift57,shift57,branch0,reduceexpr_list,shift57,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift57,reduceexpr_parens,branch0,branch0,branch0,shift57,shift57,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] quoteArray;
  @SuppressWarnings("unchecked")
  private void initquoteArray() {
    quoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift6,shift6,shift6,branch0,shift6,shift6,reduceexpr_quote,shift6,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,shift6,shift6,reduceexpr_var_access,shift6,branch0,shift6,branch0,shift20,branch0,branch0,branch0,branch0,branch0,shift6,reducedoc_plus_1_element,shift6,branch0,shift6,reduceexpr_binary_eq,shift6,branch0,shift20,branch0,shift6,shift6,branch0,shift6,reduceexpr_binary_sub,shift6,reduceexpr_binary_lt,shift6,reduceexpr_binary_ne,shift45,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,shift6,branch0,shift6,branch0,branch0,shift6,reduceexpr_binary_div,shift6,reduceexpr_binary_mul,shift6,reduceexpr_binary_ge,shift6,reduceexpr_binary_add,shift6,reduceexpr_binary_le,shift6,reduceexpr_binary_gt,shift6,reduceexpr_binary_mod,shift6,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift6,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift6,branch0,branch0,branch0,shift20,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift6,branch0,branch0,reduceexpr_block,branch0,branch0,shift20,branch0,branch0,shift6,branch0,reduceexpr_if,shift6,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,shift116,shift6,branch0,branch0,branch0,branch0,branch0,shift6,branch0,reduceexpr_unary_plus,branch0,shift6,branch0,branch0,branch0,reduceexpr_list,branch0,shift6,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,shift6,branch0,branch0,shift6,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift8,shift8,shift8,branch0,shift8,shift8,branch0,shift8,branch0,branch0,branch0,branch0,shift8,shift8,branch0,shift8,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,reducedoc_plus_1_element,shift8,branch0,shift8,branch0,shift8,branch0,branch0,branch0,shift8,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,shift8,branch0,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift8,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] atArray;
  @SuppressWarnings("unchecked")
  private void initatArray() {
    atArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift9,shift9,shift9,branch0,shift9,shift9,branch0,shift9,branch0,branch0,branch0,branch0,shift9,shift9,branch0,shift9,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,reducedoc_plus_1_element,shift9,branch0,shift9,branch0,shift9,branch0,branch0,branch0,shift9,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,branch0,branch0,branch0,branch0,shift9,branch0,shift9,branch0,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift61,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift61,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift61,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift61,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift61,branch0,branch0,shift61,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift61,branch0,branch0,shift61,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift61,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift61,reduceexpr_unary_not,branch0,reduceexpr_map,shift61,branch0,shift61,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift61,shift61,branch0,reduceexpr_list,shift61,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift61,reduceexpr_parens,branch0,branch0,branch0,shift61,shift61,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] valueArray;
  @SuppressWarnings("unchecked")
  private void initvalueArray() {
    valueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift11,shift11,shift11,branch0,shift11,shift11,branch0,shift11,branch0,branch0,branch0,branch0,shift11,shift11,branch0,shift11,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,reducedoc_plus_1_element,shift11,branch0,shift11,branch0,shift11,branch0,branch0,branch0,shift11,shift11,branch0,shift11,branch0,shift11,branch0,shift11,branch0,branch0,branch0,branch0,branch0,shift11,branch0,shift11,branch0,branch0,shift11,branch0,shift11,branch0,shift11,branch0,shift11,branch0,shift11,branch0,shift11,branch0,shift11,branch0,shift11,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift11,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,shift11,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,reduceexpr_star_9_empty,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,reduceexpr_star_9_through,branch0,reduceexpr_star_9_rec,reduceexpr_star_9_element,shift128,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift63,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift63,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift63,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift63,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift63,branch0,branch0,shift63,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift63,branch0,branch0,shift63,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift63,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift63,reduceexpr_unary_not,branch0,reduceexpr_map,shift63,branch0,shift63,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift63,shift63,branch0,reduceexpr_list,shift63,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift63,reduceexpr_parens,branch0,branch0,branch0,shift63,shift63,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift65,branch0,shift65,branch0,branch0,branch0,branch0,branch0,branch0,shift65,branch0,shift65,branch0,shift65,branch0,shift65,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift65,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,shift65,branch0,shift65,branch0,shift65,branch0,shift65,branch0,reduceexpr_binary_mod,branch0,branch0,shift65,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift65,branch0,branch0,shift65,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift65,branch0,branch0,shift65,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift65,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift65,reduceexpr_unary_not,branch0,reduceexpr_map,shift65,branch0,shift65,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift65,shift65,branch0,reduceexpr_list,shift65,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift65,reduceexpr_parens,branch0,branch0,branch0,shift65,shift65,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift29,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift29,branch0,branch0,shift29,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift29,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift29,reduceexpr_unary_not,branch0,reduceexpr_map,shift29,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift29,shift29,branch0,reduceexpr_list,shift29,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift29,reduceexpr_parens,branch0,branch0,branch0,shift29,shift29,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,reduceentry_star_10_empty,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,shift112,reduceexpr_map,reduceentry_expr,branch0,reduceentry_key_value,reduceentry_hint_quote,reduceentry_hint_id,reduceentry_star_10_element,reduceentry_star_10_through,branch0,reduceentry_star_10_rec,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift40,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,shift40,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift40,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,shift40,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift40,branch0,branch0,shift40,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift40,branch0,branch0,shift40,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift40,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift40,reduceexpr_unary_not,branch0,reduceexpr_map,shift40,branch0,shift40,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,shift40,shift40,branch0,reduceexpr_list,shift40,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,shift40,reduceexpr_parens,branch0,branch0,branch0,shift40,shift40,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,shift44,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,branch0,shift44,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,shift44,branch0,branch0,shift44,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift44,branch0,branch0,shift44,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift44,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift44,shift44,branch0,reduceexpr_map,shift44,branch0,shift44,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,branch0,shift44,shift44,branch0,reduceexpr_list,shift44,branch0,branch0,reduceexpr_while,shift44,shift44,reduceexpr_parens,branch0,branch0,branch0,shift44,shift44,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,shift74,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,shift74,branch0,branch0,reducerepl_rec_expr,reducerepl_expr,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift7,shift7,shift7,branch0,shift7,shift7,reduceexpr_quote,shift7,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,shift7,shift7,reduceexpr_var_access,shift7,branch0,shift7,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift7,reducedoc_plus_1_element,shift7,shift59,shift7,shift59,shift7,branch0,branch0,branch0,shift7,shift7,shift59,shift7,reduceexpr_binary_sub,shift7,shift59,shift7,shift59,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,shift7,branch0,shift7,branch0,shift59,shift7,reduceexpr_binary_div,shift7,reduceexpr_binary_mul,shift7,shift59,shift7,reduceexpr_binary_add,shift7,shift59,shift7,shift59,shift7,reduceexpr_binary_mod,shift7,reducedoc_plus_1_rec,shift59,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift7,branch0,branch0,branch0,reduceexpr_mthcall,shift59,branch0,shift7,shift59,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,shift59,branch0,shift7,shift59,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,shift59,shift7,branch0,reduceexpr_if,shift7,branch0,reduceexpr_ifelse,shift59,reduceexpr_unary_not,branch0,reduceexpr_map,shift59,shift7,shift59,branch0,branch0,branch0,branch0,shift7,branch0,reduceexpr_unary_plus,branch0,shift7,shift59,shift59,branch0,reduceexpr_list,shift59,shift7,branch0,reduceexpr_while,reduceexpr_unary_neg,shift59,reduceexpr_parens,branch0,branch0,shift7,shift59,shift59,shift7,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstrs_optional_2_empty,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_eq,reduceexpr_star_5_empty,reduceblock_param_optional_6_empty,branch0,branch0,reduceinstrs_optional_2_empty,branch0,reduceinstr_throw,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,reduceexpr_star_7_empty,reduceblock_param_optional_8_empty,reduceinstrs_optional_2_empty,reduceblock,reduceinstr_expr,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,reduceinstr_doc_expr,reduceinstrs_optional_2_instrs,reduceblock_param_block,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceblock_param_optional_8_block_param,shift79,reduceexpr_mthcall,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,reduceblock_param_lambda,branch0,branch0,branch0,branch0,shift90,reduceexpr_funcall,reduceblock_param_optional_6_block_param,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,shift97,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,reduceinstrs_optional_2_empty,shift105,reduceexpr_if,reduceinstrs_optional_2_empty,shift108,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,reduceinstrs_optional_2_empty,shift132,reduceexpr_while,reduceexpr_unary_neg,shift135,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift12,shift12,shift12,branch0,shift12,shift12,branch0,shift12,branch0,branch0,branch0,branch0,shift12,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,reducedoc_plus_1_element,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,shift12,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,branch0,shift12,branch0,shift12,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift12,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_text,branch0,reduceexpr_field_access,reduceexpr_value,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mod,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,shift73,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,shift73,branch0,branch0,reducerepl_rec_expr,reducerepl_expr,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _throwArray;
  @SuppressWarnings("unchecked")
  private void init_throwArray() {
    _throwArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift14,shift14,shift14,branch0,shift14,shift14,reduceexpr_quote,shift14,reduceexpr_text,shift10,reduceexpr_field_access,reduceexpr_value,shift14,shift14,reduceexpr_var_access,shift14,branch0,shift14,branch0,shift22,shift21,branch0,shift23,branch0,branch0,shift14,reducedoc_plus_1_element,shift14,branch0,shift14,reduceexpr_binary_eq,shift14,branch0,shift22,branch0,shift14,shift14,branch0,shift14,reduceexpr_binary_sub,shift14,reduceexpr_binary_lt,shift14,reduceexpr_binary_ne,shift46,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,shift14,branch0,shift14,branch0,branch0,shift14,reduceexpr_binary_div,shift14,reduceexpr_binary_mul,shift14,reduceexpr_binary_ge,shift14,reduceexpr_binary_add,shift14,reduceexpr_binary_le,shift14,reduceexpr_binary_gt,shift14,reduceexpr_binary_mod,shift14,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift14,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift14,branch0,branch0,branch0,shift22,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift14,branch0,branch0,reduceexpr_block,branch0,branch0,shift22,branch0,branch0,shift14,branch0,reduceexpr_if,shift14,branch0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,branch0,reduceexpr_map,shift117,shift14,branch0,branch0,branch0,branch0,branch0,shift14,branch0,reduceexpr_unary_plus,branch0,shift14,branch0,branch0,branch0,reduceexpr_list,branch0,shift14,branch0,reduceexpr_while,reduceexpr_unary_neg,branch0,reduceexpr_parens,branch0,branch0,shift14,branch0,branch0,shift14,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift13,shift13,shift13,branch0,shift13,shift13,branch0,shift13,branch0,branch0,branch0,branch0,shift13,shift13,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,reducedoc_plus_1_element,shift13,branch0,shift13,branch0,shift13,branch0,branch0,branch0,shift13,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift13,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift16,shift16,shift16,branch0,shift16,shift16,branch0,shift16,branch0,branch0,branch0,branch0,shift16,shift16,branch0,shift16,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,reducedoc_plus_1_element,shift16,branch0,shift16,branch0,shift16,branch0,branch0,branch0,shift16,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,branch0,branch0,branch0,branch0,shift16,branch0,shift16,branch0,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift16,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,shift16,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] aslashArray;
  @SuppressWarnings("unchecked")
  private void initaslashArray() {
    aslashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift18,shift18,shift18,branch0,shift18,shift18,branch0,shift18,branch0,branch0,branch0,branch0,shift18,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,reducedoc_plus_1_element,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,shift18,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,branch0,branch0,shift18,branch0,shift18,branch0,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift18,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{error0,error0,error0,error0,error0,error0,reduceexpr_quote,error0,reduceexpr_text,error0,reduceexpr_field_access,reduceexpr_value,error0,error0,reduceexpr_var_access,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_return,error0,reduceexpr_binary_eq,error0,error0,error0,error0,error0,error0,reduceinstr_throw,error0,reduceexpr_binary_sub,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_ne,error0,reduceselector_quote,reduceselector_id,reduceexpr_fieldcall,error0,error0,error0,error0,reduceinstr_expr,error0,reduceexpr_binary_div,error0,reduceexpr_binary_mul,error0,reduceexpr_binary_ge,error0,reduceexpr_binary_add,error0,reduceexpr_binary_le,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_mod,error0,error0,reduceinstr_doc_expr,error0,error0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,error0,error0,reduceexpr_mthcall,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,error0,reduceexpr_block,error0,error0,error0,error0,error0,error0,error0,reduceexpr_if,error0,error0,reduceexpr_ifelse,reduceexpr_var_assignment,reduceexpr_unary_not,error0,reduceexpr_map,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_unary_plus,error0,error0,error0,error0,error0,reduceexpr_list,error0,error0,error0,reduceexpr_while,reduceexpr_unary_neg,error0,reduceexpr_parens,exit,exit,error0,reducerepl_rec_expr,reducerepl_expr,reduceinstrs_optional_0_empty,exit,exit,reducescript,reduceinstrs_optional_0_instrs};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_key_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_map;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ifelse;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducerepl_rec_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_throw;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_hint_id_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducerepl_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_eol;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_doc_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceselector_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_fieldcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_4_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_hint_quote_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_hint_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_neg;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceselector_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_hint_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr_eoi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_list;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_element;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift73;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift103;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift116;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift108;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift79;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift59;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift105;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift100;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift106;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift86;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift128;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift63;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift135;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift44;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift130;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift120;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift132;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift117;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift94;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift48;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift112;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift74;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift124;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift114;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift68;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceeoi_eol;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceexpr_map;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_field_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_4_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceselector_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_0_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_metadata0reduceentry_star_10_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0reduceexpr_list;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_0_metadata0reducescript;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_2_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceentry_hint_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter_hint_id_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0at_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0repl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_4_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_4_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_plus_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_star_10_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceexpr_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0aslash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_star_10_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_throw_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0selector_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_2_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0value_metadata0reduceexpr_value;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_ifelse;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceselector_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_8_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter_hint_quote_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_metadata0reduceentry_star_10_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceentry_hint_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reduceexpr_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_6_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_metadata0null;
}
