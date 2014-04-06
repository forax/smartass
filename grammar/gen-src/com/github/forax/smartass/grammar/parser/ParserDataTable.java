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
    initexpr_star_5Gotoes();
    initinstrGotoes();
    initscriptGotoes();
    initexprGotoes();
    initselectorGotoes();
    initexpr_star_9_subGotoes();
    initexpr_star_9Gotoes();
    initparameter_plus_4Gotoes();
    initparameterGotoes();
    initparameter_star_3_subGotoes();
    initblock_paramGotoes();
    initinstrsGotoes();
    initinstrs_optional_0Gotoes();
    initparameter_star_3Gotoes();
    initexpr_star_7_subGotoes();
    initblock_param_optional_8Gotoes();
    initblock_param_optional_6Gotoes();
    initblockGotoes();
    initexpr_star_7Gotoes();
    initdoc_plus_1Gotoes();
    initinstrs_optional_2Gotoes();
    initentryGotoes();
    initentry_star_10_subGotoes();
    initentry_star_10Gotoes();
    initeoiGotoes();
    initexpr_star_5_subGotoes();
    reduceinstrs_instr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr,1,instrsGotoes);
    reduceexpr_star_7_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_element,1,expr_star_7_subGotoes);
    reduceentry_star_10_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_element,1,entry_star_10_subGotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,7,exprGotoes);
    reduceexpr_unary_neg = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_neg,2,exprGotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,2,exprGotoes);
    reduceblock_param_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_lambda,4,block_paramGotoes);
    reduceblock_param_optional_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_empty,0,block_param_optional_8Gotoes);
    reduceentry = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry,3,entryGotoes);
    reduceexpr_star_5_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_element,1,expr_star_5_subGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceblock_param_optional_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_empty,0,block_param_optional_6Gotoes);
    reduceexpr_star_9_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_empty,0,expr_star_9Gotoes);
    reduceinstr_throw = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_throw,2,instrGotoes);
    reduceexpr_star_7_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_through,1,expr_star_7Gotoes);
    reduceparameter_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_id,1,parameterGotoes);
    reduceexpr_star_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_empty,0,expr_star_7Gotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceblock_param_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_block,2,block_paramGotoes);
    reduceexpr_star_9_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_through,1,expr_star_9Gotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceparameter_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_rec,3,parameter_star_3_subGotoes);
    reduceeoi_eol = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_eol,1,eoiGotoes);
    reduceentry_star_10_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_rec,3,entry_star_10_subGotoes);
    reduceparameter_plus_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_plus_4_element,1,parameter_plus_4Gotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceexpr_star_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_empty,0,expr_star_5Gotoes);
    reducedoc_plus_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_element,1,doc_plus_1Gotoes);
    reduceexpr_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_block,4,exprGotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceparameter_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_empty,0,parameter_star_3Gotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceexpr_star_9_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_element,1,expr_star_9_subGotoes);
    reduceexpr_star_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_rec,3,expr_star_7_subGotoes);
    reduceexpr_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_text,1,exprGotoes);
    reduceinstrs_optional_2_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_instrs,1,instrs_optional_2Gotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceentry_star_10_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_through,1,entry_star_10Gotoes);
    reduceparameter_plus_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_plus_4_rec,3,parameter_plus_4Gotoes);
    reduceparameter_star_3_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_element,1,parameter_star_3_subGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,5,exprGotoes);
    reduceexpr_star_9_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_9_rec,3,expr_star_9_subGotoes);
    reduceexpr_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda,5,exprGotoes);
    reduceparameter_hint_id_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_hint_id_id,2,parameterGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceexpr_ifelse = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ifelse,8,exprGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceselector_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.selector_id,1,selectorGotoes);
    reduceblock_param_optional_6_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_block_param,1,block_param_optional_6Gotoes);
    reduceinstr_doc_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_doc_expr,2,instrGotoes);
    reduceinstrs_optional_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_empty,0,instrs_optional_2Gotoes);
    reduceinstrs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_rec,3,instrsGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reducedoc_plus_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_rec,2,doc_plus_1Gotoes);
    reduceexpr_map = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_map,3,exprGotoes);
    reduceselector_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.selector_quote,1,selectorGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_list = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_list,3,exprGotoes);
    reduceexpr_star_5_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_rec,3,expr_star_5_subGotoes);
    reduceparameter_hint_quote_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_hint_quote_id,2,parameterGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,6,exprGotoes);
    reduceparameter_star_3_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_through,1,parameter_star_3Gotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_star_5_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_through,1,expr_star_5Gotoes);
    reduceinstrs_optional_0_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_instrs,1,instrs_optional_0Gotoes);
    reduceexpr_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_value,1,exprGotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_quote,1,exprGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,2,instrGotoes);
    reduceinstrs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_empty,0,instrs_optional_0Gotoes);
    reduceinstrs_instr_eoi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr_eoi,2,instrsGotoes);
    reduceentry_star_10_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.entry_star_10_empty,0,entry_star_10Gotoes);
    reduceblock_param_optional_8_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_block_param,1,block_param_optional_8Gotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,1,instrGotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift72 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(72);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift124 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(124);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift112 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(112);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift135 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(135);
    shift89 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(89);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift44 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(44);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift108 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(108);
    shift118 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(118);
    shift121 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(121);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift67 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(67);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift54 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(54);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift132 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(132);
    shift106 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(106);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift78 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(78);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift114 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(114);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift48 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(48);
    shift134 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(134);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift93 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(93);
    shift105 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(105);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift102 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(102);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift81 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(81);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift62 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(62);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift130 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(130);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift110 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(110);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initltArray();
    initroptArray();
    initneArray();
    initplusArray();
    initidArray();
    init__eof__Array();
    initdocArray();
    initbangArray();
    initsemicolonArray();
    initminusArray();
    initlcurlArray();
    initeolArray();
    initpipeArray();
    initlparArray();
    initstarArray();
    initdotArray();
    initgtArray();
    initloptArray();
    initquoteArray();
    inittextArray();
    initrparArray();
    initeqArray();
    init_throwArray();
    initmodArray();
    init_ifArray();
    initslashArray();
    initgeArray();
    initcolonArray();
    initassignArray();
    initrcurlArray();
    initcommaArray();
    init_returnArray();
    initatArray();
    init_whileArray();
    initvalueArray();
    initleArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.doc,docArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.quote,quoteArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum._throw,_throwArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.at,atArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.value,valueArray);
    tableMap.put(TerminalEnum.le,leArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),140,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0instrs_optional_2_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_2,reduceblock);
    metadata0rpar_metadata0reduceexpr_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_lambda);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0parameter_star_3_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3_sub,null);
    metadata0expr_star_9_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9,null);
    metadata0lopt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,null);
    metadata0eol_metadata0reduceeoi_eol = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceeoi_eol);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0expr_star_7_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7_sub,null);
    metadata0id_metadata0reduceexpr_field_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_field_access);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0text_metadata0reduceexpr_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reduceexpr_text);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0expr_star_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7,null);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0parameter_plus_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_plus_4,null);
    metadata0quote_metadata0reduceselector_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceselector_quote);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0doc_plus_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.doc_plus_1,null);
    metadata0instr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,null);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0rpar_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_while);
    metadata0parameter_metadata0reduceparameter_plus_4_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_plus_4_rec);
    metadata0parameter_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3,null);
    metadata0block_param_optional_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_8,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0instrs_metadata0reduceinstrs_optional_2_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_2_instrs);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0_throw_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._throw,null);
    metadata0rcurl_metadata0reduceexpr_map = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceexpr_map);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0eoi_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0entry_star_10_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry_star_10,null);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0block_param_metadata0reduceblock_param_optional_6_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_6_block_param);
    metadata0entry_metadata0reduceentry_star_10_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry,reduceentry_star_10_element);
    metadata0parameter_metadata0reduceparameter_plus_4_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_plus_4_element);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0instrs_metadata0reduceinstrs_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_rec);
    metadata0quote_metadata0reduceexpr_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceexpr_quote);
    metadata0block_param_metadata0reduceblock_param_optional_8_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_8_block_param);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0doc_metadata0reducedoc_plus_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_rec);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0block_metadata0reduceblock_param_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_block);
    metadata0block_param_optional_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_6,null);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0expr_star_9_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_9_sub,null);
    metadata0rpar_metadata0reduceexpr_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_block);
    metadata0at_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.at,null);
    metadata0ropt_metadata0reduceexpr_list = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,reduceexpr_list);
    metadata0parameter_metadata0reduceparameter_star_3_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_element);
    metadata0block_metadata0reduceblock_param_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_lambda);
    metadata0expr_star_5_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5_sub,null);
    metadata0value_metadata0reduceexpr_value = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.value,reduceexpr_value);
    metadata0parameter_metadata0reduceparameter_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_rec);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0lcurl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,null);
    metadata0doc_metadata0reducedoc_plus_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_element);
    metadata0id_metadata0reduceselector_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceselector_id);
    metadata0entry_star_10_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry_star_10_sub,null);
    metadata0id_metadata0reduceparameter_hint_id_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter_hint_id_id);
    metadata0selector_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.selector,null);
    metadata0instrs_metadata0reduceinstrs_optional_0_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_0_instrs);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0quote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,null);
    metadata0rpar_metadata0reduceexpr_ifelse = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_ifelse);
    metadata0instrs_optional_0_metadata0reducescript = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_0,reducescript);
    metadata0id_metadata0reduceparameter_hint_quote_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter_hint_quote_id);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0entry_metadata0reduceentry_star_10_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.entry,reduceentry_star_10_rec);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0expr_star_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0plus_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0bang_metadata0null,metadata0minus_metadata0null,metadata0lcurl_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0id_metadata0reduceparameter_hint_id_id,metadata0colon_metadata0null,metadata0doc_metadata0reducedoc_plus_1_element,metadata0lopt_metadata0null,metadata0quote_metadata0reduceexpr_quote,metadata0at_metadata0null,metadata0id_metadata0reduceexpr_field_access,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0text_metadata0reduceexpr_text,metadata0value_metadata0reduceexpr_value,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_5_metadata0null,metadata0colon_metadata0null,metadata0_return_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0quote_metadata0reduceselector_quote,metadata0id_metadata0reduceselector_id,metadata0selector_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_7_metadata0null,metadata0pipe_metadata0null,metadata0id_metadata0null,metadata0quote_metadata0null,metadata0id_metadata0reduceparameter_hint_quote_id,metadata0parameter_star_3_metadata0null,metadata0colon_metadata0null,metadata0_throw_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_optional_2_instrs,metadata0block_metadata0reduceblock_param_lambda,metadata0doc_plus_1_metadata0null,metadata0doc_metadata0reducedoc_plus_1_rec,metadata0expr_metadata0null,metadata0instrs_optional_2_metadata0reduceblock,metadata0instr_metadata0null,metadata0semicolon_metadata0reduceeoi_semi,metadata0eol_metadata0reduceeoi_eol,metadata0eoi_metadata0null,metadata0instrs_metadata0reduceinstrs_rec,metadata0expr_metadata0null,metadata0parameter_metadata0reduceparameter_star_3_element,metadata0parameter_star_3_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_3_rec,metadata0block_param_optional_8_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0block_param_metadata0reduceblock_param_optional_8_block_param,metadata0expr_metadata0null,metadata0expr_star_7_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0block_metadata0reduceblock_param_block,metadata0block_param_optional_6_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0block_param_metadata0reduceblock_param_optional_6_block_param,metadata0expr_metadata0null,metadata0expr_star_5_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_while,metadata0expr_star_9_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_9_metadata0null,metadata0ropt_metadata0reduceexpr_list,metadata0expr_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_block,metadata0quote_metadata0null,metadata0parameter_plus_4_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_plus_4_rec,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_lambda,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0parameter_metadata0reduceparameter_plus_4_element,metadata0entry_metadata0reduceentry_star_10_element,metadata0entry_star_10_sub_metadata0null,metadata0comma_metadata0null,metadata0entry_metadata0reduceentry_star_10_rec,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0expr_metadata0null,metadata0entry_star_10_metadata0null,metadata0rcurl_metadata0reduceexpr_map,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_ifelse,metadata0rpar_metadata0reduceexpr_if,metadata0instrs_metadata0reduceinstrs_optional_0_instrs,metadata0instrs_optional_0_metadata0reducescript,metadata0script_metadata0null,metadata0__eof___metadata0null};
  }

  
  private int[] expr_star_5Gotoes;

  private void initexpr_star_5Gotoes() {
    expr_star_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,70,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{138,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{75,-1,129,128,-1,127,126,125,120,113,-1,-1,75,-1,103,-1,-1,-1,-1,22,-1,-1,-1,24,-1,26,-1,28,-1,30,-1,32,-1,34,-1,91,-1,75,39,-1,41,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,75,55,-1,57,-1,59,-1,61,-1,63,-1,-1,-1,68,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,86,-1,-1,-1,-1,-1,-1,-1,94,-1,75,-1,-1,-1,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,120,-1,-1,122,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,75,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] selectorGotoes;

  private void initselectorGotoes() {
    selectorGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9_subGotoes;

  private void initexpr_star_9_subGotoes() {
    expr_star_9_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,98,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_9Gotoes;

  private void initexpr_star_9Gotoes() {
    expr_star_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_plus_4Gotoes;

  private void initparameter_plus_4Gotoes() {
    parameter_plus_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameterGotoes;

  private void initparameterGotoes() {
    parameterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,115,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,76,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3_subGotoes;

  private void initparameter_star_3_subGotoes() {
    parameter_star_3_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_paramGotoes;

  private void initblock_paramGotoes() {
    block_paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,82,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrsGotoes;

  private void initinstrsGotoes() {
    instrsGotoes = 
      new int[]{136,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,64,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_0Gotoes;

  private void initinstrs_optional_0Gotoes() {
    instrs_optional_0Gotoes = 
      new int[]{137,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3Gotoes;

  private void initparameter_star_3Gotoes() {
    parameter_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7_subGotoes;

  private void initexpr_star_7_subGotoes() {
    expr_star_7_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_8Gotoes;

  private void initblock_param_optional_8Gotoes() {
    block_param_optional_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_6Gotoes;

  private void initblock_param_optional_6Gotoes() {
    block_param_optional_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,96,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,111,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,131,-1,133,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7Gotoes;

  private void initexpr_star_7Gotoes() {
    expr_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,47,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] doc_plus_1Gotoes;

  private void initdoc_plus_1Gotoes() {
    doc_plus_1Gotoes = 
      new int[]{66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,66,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_2Gotoes;

  private void initinstrs_optional_2Gotoes() {
    instrs_optional_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,69,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] entryGotoes;

  private void initentryGotoes() {
    entryGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,116,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,119,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] entry_star_10_subGotoes;

  private void initentry_star_10_subGotoes() {
    entry_star_10_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,117,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] entry_star_10Gotoes;

  private void initentry_star_10Gotoes() {
    entry_star_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5_subGotoes;

  private void initexpr_star_5_subGotoes() {
    expr_star_5_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,92,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift23,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift23,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift23,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift23,branch0,branch0,branch0,branch0,branch0,branch0,shift23,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift23,branch0,branch0,shift23,branch0,branch0,reduceexpr_funcall,branch0,shift23,branch0,branch0,shift23,branch0,branch0,reduceexpr_while,branch0,branch0,shift23,branch0,reduceexpr_list,shift23,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift23,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift23,branch0,shift23,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift23,reduceexpr_unary_plus,shift23,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_star_9_empty,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,reduceexpr_star_9_through,branch0,reduceexpr_star_9_rec,shift102,reduceexpr_list,reduceexpr_star_9_element,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift25,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift25,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift25,branch0,branch0,shift25,branch0,branch0,reduceexpr_funcall,branch0,shift25,branch0,branch0,shift25,branch0,branch0,reduceexpr_while,branch0,branch0,shift25,branch0,reduceexpr_list,shift25,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift25,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift25,branch0,shift25,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift25,reduceexpr_unary_plus,shift25,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift3,branch0,shift3,shift3,reduceexpr_var_access,shift3,shift3,shift3,shift3,shift3,reduceexpr_var_access,branch0,shift3,reducedoc_plus_1_element,shift3,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,shift3,reduceexpr_text,reduceexpr_value,shift27,shift3,shift27,shift3,shift27,shift3,reduceexpr_binary_add,shift3,reduceexpr_binary_div,shift3,shift27,shift3,reduceexpr_binary_sub,shift3,branch0,shift3,shift3,shift27,shift3,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,shift3,shift3,shift27,shift3,shift27,shift3,shift27,shift3,shift27,shift3,reduceexpr_binary_mod,branch0,branch0,shift3,reducedoc_plus_1_rec,shift27,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift3,branch0,shift27,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift27,branch0,shift3,shift27,branch0,branch0,reduceexpr_funcall,branch0,shift27,branch0,shift3,shift27,shift3,branch0,reduceexpr_while,branch0,shift3,shift27,branch0,reduceexpr_list,shift27,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,shift3,branch0,reduceexpr_lambda,shift27,reduceexpr_parens,branch0,branch0,branch0,shift3,branch0,shift27,shift3,shift27,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift27,reduceexpr_unary_plus,shift27,shift3,branch0,shift3,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift4,branch0,shift4,shift4,branch0,shift4,shift4,shift4,shift4,shift10,shift11,branch0,shift4,reducedoc_plus_1_element,shift4,branch0,shift17,branch0,branch0,shift4,branch0,branch0,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,shift4,branch0,shift4,branch0,shift44,branch0,branch0,branch0,shift4,branch0,shift49,shift11,shift51,branch0,branch0,shift4,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,branch0,branch0,shift4,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift4,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,shift4,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,shift49,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,reduceinstr_doc_expr,branch0,reduceinstrs_instr,reduceeoi_semi,reduceeoi_eol,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceinstrs_optional_0_instrs,reducescript,accept,accept};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] docArray;
  @SuppressWarnings("unchecked")
  private void initdocArray() {
    docArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,reducedoc_plus_1_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift67,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift6,branch0,shift6,shift6,branch0,shift6,shift6,shift6,shift6,shift6,branch0,branch0,shift6,reducedoc_plus_1_element,shift6,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,shift6,branch0,shift6,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,shift6,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,branch0,branch0,shift6,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,shift6,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,reduceinstr_doc_expr,branch0,shift71,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift7,branch0,shift7,shift7,reduceexpr_var_access,shift7,shift7,shift7,shift7,shift7,reduceexpr_var_access,branch0,shift7,reducedoc_plus_1_element,shift7,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,shift7,reduceexpr_text,reduceexpr_value,shift33,shift7,shift33,shift7,shift33,shift7,reduceexpr_binary_add,shift7,reduceexpr_binary_div,shift7,shift33,shift7,reduceexpr_binary_sub,shift7,branch0,shift7,shift7,shift33,shift7,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift7,branch0,branch0,branch0,branch0,branch0,branch0,shift7,shift7,shift33,shift7,shift33,shift7,shift33,shift7,shift33,shift7,reduceexpr_binary_mod,branch0,branch0,shift7,reducedoc_plus_1_rec,shift33,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift7,branch0,shift33,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift33,branch0,shift7,shift33,branch0,branch0,reduceexpr_funcall,branch0,shift33,branch0,shift7,shift33,shift7,branch0,reduceexpr_while,branch0,shift7,shift33,branch0,reduceexpr_list,shift33,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,shift7,branch0,reduceexpr_lambda,shift33,reduceexpr_parens,branch0,branch0,branch0,shift7,branch0,shift33,shift7,shift33,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift33,reduceexpr_unary_plus,shift33,shift7,branch0,shift7,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift8,branch0,shift8,shift8,branch0,shift8,shift8,shift8,shift8,shift8,branch0,branch0,shift8,reducedoc_plus_1_element,shift8,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,shift8,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,shift8,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,branch0,branch0,shift8,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,shift8,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,reduceinstr_doc_expr,branch0,shift72,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,reduceexpr_star_5_empty,shift48,branch0,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceexpr_star_7_empty,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,branch0,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift9,shift2,shift9,shift9,reduceexpr_var_access,shift9,shift9,shift9,shift9,shift9,reduceexpr_var_access,branch0,shift9,reducedoc_plus_1_element,shift9,reduceexpr_quote,branch0,reduceexpr_field_access,shift19,shift9,reduceexpr_text,reduceexpr_value,shift35,shift9,shift35,shift9,shift35,shift9,shift35,shift9,shift35,shift9,shift35,shift9,shift35,shift9,branch0,shift9,shift9,shift35,shift9,shift35,branch0,reduceselector_quote,reduceselector_id,shift46,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,shift9,shift35,shift9,shift35,shift9,shift35,shift9,shift35,shift9,shift35,branch0,branch0,shift9,reducedoc_plus_1_rec,shift35,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift9,branch0,shift35,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift35,branch0,shift9,shift35,branch0,branch0,reduceexpr_funcall,branch0,shift35,branch0,shift9,shift35,shift9,branch0,reduceexpr_while,branch0,shift9,shift35,branch0,reduceexpr_list,shift35,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,shift9,branch0,reduceexpr_lambda,shift35,reduceexpr_parens,branch0,branch0,branch0,shift9,branch0,shift35,shift9,shift35,branch0,reduceexpr_map,shift35,shift35,shift35,shift35,shift35,shift9,branch0,shift9,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift40,branch0,shift40,branch0,shift40,branch0,shift40,branch0,reduceexpr_binary_div,branch0,shift40,branch0,shift40,branch0,branch0,branch0,branch0,shift40,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift40,branch0,shift40,branch0,shift40,branch0,shift40,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift40,branch0,branch0,branch0,branch0,branch0,branch0,shift40,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift40,branch0,branch0,shift40,branch0,branch0,reduceexpr_funcall,branch0,shift40,branch0,branch0,shift40,branch0,branch0,reduceexpr_while,branch0,branch0,shift40,branch0,reduceexpr_list,shift40,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift40,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift40,branch0,shift40,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift40,reduceexpr_unary_plus,shift40,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,shift42,branch0,branch0,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift42,branch0,branch0,shift42,branch0,branch0,reduceexpr_funcall,branch0,shift42,branch0,branch0,shift42,branch0,branch0,reduceexpr_while,branch0,branch0,shift42,branch0,reduceexpr_list,shift42,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift42,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,reduceexpr_map,shift42,shift42,shift42,shift42,shift42,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift56,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift56,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift56,branch0,branch0,shift56,branch0,branch0,reduceexpr_funcall,branch0,shift56,branch0,branch0,shift56,branch0,branch0,reduceexpr_while,branch0,branch0,shift56,branch0,reduceexpr_list,shift56,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift56,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift56,branch0,shift56,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift56,reduceexpr_unary_plus,shift56,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift14,branch0,shift14,shift14,branch0,shift14,shift14,shift14,shift14,shift14,branch0,branch0,shift14,reducedoc_plus_1_element,shift14,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,shift14,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,branch0,branch0,shift14,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,shift14,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] quoteArray;
  @SuppressWarnings("unchecked")
  private void initquoteArray() {
    quoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift15,branch0,shift15,shift15,branch0,shift15,shift15,shift15,shift15,shift106,branch0,branch0,shift15,reducedoc_plus_1_element,shift15,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,shift15,branch0,shift15,branch0,shift43,branch0,branch0,branch0,shift15,branch0,shift50,branch0,branch0,branch0,branch0,shift15,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,branch0,branch0,shift15,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift15,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,shift15,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift20,branch0,shift20,shift20,branch0,shift20,shift20,shift20,shift20,shift20,branch0,branch0,shift20,reducedoc_plus_1_element,shift20,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,shift20,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,branch0,branch0,shift20,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,reduceinstrs_optional_2_empty,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,reduceexpr_star_5_empty,reduceblock_param_optional_6_empty,reduceinstrs_optional_2_empty,branch0,reduceinstr_return,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceexpr_star_7_empty,reduceblock_param_optional_8_empty,branch0,branch0,branch0,branch0,branch0,reduceinstrs_optional_2_empty,branch0,reduceinstr_throw,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,reduceinstrs_optional_2_instrs,reduceblock_param_lambda,branch0,branch0,reduceinstr_doc_expr,reduceblock,reduceinstrs_instr,reduceeoi_semi,reduceeoi_eol,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,branch0,branch0,branch0,branch0,shift81,reduceexpr_mthcall,reduceblock_param_optional_8_block_param,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,reduceblock_param_block,shift89,reduceexpr_funcall,reduceblock_param_optional_6_block_param,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,reduceinstrs_optional_2_empty,shift97,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,shift105,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,reduceinstrs_optional_2_empty,shift112,reduceexpr_lambda,shift114,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,reduceinstrs_optional_2_empty,shift135,reduceinstrs_optional_2_empty,shift134,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift58,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift58,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift58,branch0,branch0,shift58,branch0,branch0,reduceexpr_funcall,branch0,shift58,branch0,branch0,shift58,branch0,branch0,reduceexpr_while,branch0,branch0,shift58,branch0,reduceexpr_list,shift58,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift58,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift58,branch0,shift58,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift58,reduceexpr_unary_plus,shift58,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _throwArray;
  @SuppressWarnings("unchecked")
  private void init_throwArray() {
    _throwArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift62,branch0,shift62,branch0,shift62,branch0,shift62,branch0,reduceexpr_binary_div,branch0,shift62,branch0,shift62,branch0,branch0,branch0,branch0,shift62,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift62,branch0,shift62,branch0,shift62,branch0,shift62,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift62,branch0,branch0,branch0,branch0,branch0,branch0,shift62,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift62,branch0,branch0,shift62,branch0,branch0,reduceexpr_funcall,branch0,shift62,branch0,branch0,shift62,branch0,branch0,reduceexpr_while,branch0,branch0,shift62,branch0,reduceexpr_list,shift62,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift62,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift62,branch0,shift62,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift62,reduceexpr_unary_plus,shift62,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,branch0,shift1,shift1,branch0,shift1,shift1,shift1,shift1,shift1,branch0,branch0,shift1,reducedoc_plus_1_element,shift1,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,shift1,branch0,shift1,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,shift1,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,branch0,branch0,shift1,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,shift1,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,reduceexpr_binary_div,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift29,branch0,branch0,shift29,branch0,branch0,reduceexpr_funcall,branch0,shift29,branch0,branch0,shift29,branch0,branch0,reduceexpr_while,branch0,branch0,shift29,branch0,reduceexpr_list,shift29,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift29,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift29,reduceexpr_unary_plus,shift29,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift31,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift31,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift31,branch0,branch0,shift31,branch0,branch0,reduceexpr_funcall,branch0,shift31,branch0,branch0,shift31,branch0,branch0,reduceexpr_while,branch0,branch0,shift31,branch0,reduceexpr_list,shift31,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift31,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift31,branch0,shift31,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift31,reduceexpr_unary_plus,shift31,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,shift12,reduceparameter_id,reduceparameter_hint_id_id,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift95,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,reduceexpr_star_5_empty,shift37,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceexpr_star_7_empty,shift37,reduceparameter_star_3_empty,reduceparameter_id,branch0,reduceparameter_hint_quote_id,shift53,branch0,branch0,reduceinstr_throw,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,reduceinstrs_optional_2_instrs,branch0,branch0,branch0,reduceinstr_doc_expr,reduceblock,reduceinstrs_instr,reduceeoi_semi,reduceeoi_eol,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,reduceparameter_star_3_element,reduceparameter_star_3_through,branch0,reduceparameter_star_3_rec,branch0,reduceexpr_mthcall,branch0,reduceexpr_star_7_element,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,branch0,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,shift110,branch0,reduceparameter_plus_4_rec,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,reduceparameter_plus_4_element,branch0,branch0,branch0,branch0,shift121,branch0,branch0,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,shift130,reduceinstrs_optional_2_empty,shift132,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,reduceentry_star_10_empty,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,branch0,reduceexpr_list,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,branch0,reduceentry_star_10_element,reduceentry_star_10_through,branch0,reduceentry_star_10_rec,branch0,branch0,reduceentry,shift124,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceparameter_id,reduceparameter_hint_id_id,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,branch0,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_id,branch0,reduceparameter_hint_quote_id,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_star_3_element,shift78,branch0,reduceparameter_star_3_rec,branch0,reduceexpr_mthcall,branch0,reduceexpr_star_7_element,shift85,branch0,reduceexpr_star_7_rec,branch0,branch0,reduceexpr_funcall,branch0,reduceexpr_star_5_element,shift93,branch0,reduceexpr_star_5_rec,branch0,branch0,reduceexpr_while,shift99,branch0,reduceexpr_star_9_rec,branch0,reduceexpr_list,reduceexpr_star_9_element,branch0,reduceexpr_block,branch0,shift108,branch0,reduceparameter_plus_4_rec,branch0,branch0,reduceexpr_lambda,branch0,reduceexpr_parens,reduceparameter_plus_4_element,reduceentry_star_10_element,shift118,branch0,reduceentry_star_10_rec,branch0,branch0,reduceentry,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] atArray;
  @SuppressWarnings("unchecked")
  private void initatArray() {
    atArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift16,branch0,shift16,shift16,branch0,shift16,shift16,shift16,shift16,shift16,branch0,branch0,shift16,reducedoc_plus_1_element,shift16,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,shift16,branch0,shift16,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,shift16,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,shift16,branch0,branch0,branch0,shift16,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,shift16,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,branch0,shift16,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift18,branch0,shift18,shift18,branch0,shift18,shift18,shift18,shift18,shift18,branch0,branch0,shift18,reducedoc_plus_1_element,shift18,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,shift18,branch0,shift18,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,shift18,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,shift18,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,shift18,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] valueArray;
  @SuppressWarnings("unchecked")
  private void initvalueArray() {
    valueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift21,branch0,shift21,shift21,branch0,shift21,shift21,shift21,shift21,shift21,branch0,branch0,shift21,reducedoc_plus_1_element,shift21,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,shift21,branch0,shift21,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,shift21,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,shift21,branch0,branch0,branch0,shift21,reducedoc_plus_1_rec,branch0,branch0,branch0,reduceeoi_semi,reduceeoi_eol,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,shift21,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceexpr_quote,branch0,reduceexpr_field_access,branch0,branch0,reduceexpr_text,reduceexpr_value,shift60,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,branch0,branch0,branch0,shift60,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift60,branch0,branch0,branch0,branch0,branch0,branch0,shift60,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift60,branch0,branch0,shift60,branch0,branch0,reduceexpr_funcall,branch0,shift60,branch0,branch0,shift60,branch0,branch0,reduceexpr_while,branch0,branch0,shift60,branch0,reduceexpr_list,shift60,branch0,reduceexpr_block,reduceexpr_quote,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift60,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,shift60,branch0,shift60,branch0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,shift60,reduceexpr_unary_plus,shift60,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,error0,error0,error0,reduceexpr_var_access,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_quote,error0,reduceexpr_field_access,error0,error0,reduceexpr_text,reduceexpr_value,error0,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_ne,error0,reduceexpr_binary_add,error0,reduceexpr_binary_div,error0,reduceexpr_binary_ge,error0,reduceexpr_binary_sub,error0,error0,error0,error0,reduceinstr_return,error0,reduceexpr_binary_mul,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_throw,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_eq,error0,reduceexpr_binary_le,error0,reduceexpr_binary_mod,error0,error0,error0,error0,reduceinstr_doc_expr,error0,reduceinstrs_instr,reduceeoi_semi,reduceeoi_eol,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,error0,error0,error0,error0,error0,reduceexpr_mthcall,error0,error0,error0,error0,error0,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,error0,error0,reduceexpr_while,error0,error0,error0,error0,reduceexpr_list,error0,error0,reduceexpr_block,error0,error0,error0,error0,error0,error0,reduceexpr_lambda,error0,reduceexpr_parens,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_map,reduceexpr_unary_neg,reduceexpr_unary_not,reduceexpr_var_assignment,reduceexpr_unary_plus,error0,error0,error0,error0,error0,reduceexpr_ifelse,reduceexpr_if,reduceinstrs_optional_0_instrs,reducescript,exit,exit};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_neg;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_throw;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_eol;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_plus_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_plus_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_9_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_hint_id_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ifelse;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceselector_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_doc_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_map;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceselector_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_list;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_hint_quote_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr_eoi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceentry_star_10_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift72;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift124;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift112;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift135;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift89;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift44;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift108;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift118;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift121;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift67;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift54;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift132;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift106;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift78;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift114;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift48;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift134;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift93;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift105;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift102;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift81;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift62;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift130;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift110;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_2_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceeoi_eol;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_field_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reduceexpr_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_plus_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceselector_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_plus_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_plus_4_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_2_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_throw_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceexpr_map;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_star_10_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_6_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_metadata0reduceentry_star_10_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_plus_4_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceexpr_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_8_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_9_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0at_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0reduceexpr_list;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0value_metadata0reduceexpr_value;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceselector_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_star_10_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter_hint_id_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0selector_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_0_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_ifelse;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_0_metadata0reducescript;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter_hint_quote_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0entry_metadata0reduceentry_star_10_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
}
