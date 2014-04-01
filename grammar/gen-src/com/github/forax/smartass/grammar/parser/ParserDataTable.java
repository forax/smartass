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
    initblockGotoes();
    initinstrGotoes();
    initblock_paramGotoes();
    initexpr_star_7Gotoes();
    initnameGotoes();
    initdoc_plus_1Gotoes();
    initblock_param_optional_8Gotoes();
    initparameter_star_3_subGotoes();
    initparameterGotoes();
    initblock_param_optional_6Gotoes();
    initinstrs_optional_2Gotoes();
    initparameter_star_3Gotoes();
    initexpr_star_7_subGotoes();
    initexprGotoes();
    initinstrsGotoes();
    initinstrs_optional_0Gotoes();
    initparameter_plus_4Gotoes();
    initexpr_star_5_subGotoes();
    initeoiGotoes();
    initexpr_star_5Gotoes();
    initscriptGotoes();
    reduceexpr_star_5_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_element,1,expr_star_5_subGotoes);
    reduceparameter_plus_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_plus_4_rec,3,parameter_plus_4Gotoes);
    reducename_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_id,1,nameGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceeoi_eol = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_eol,1,eoiGotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,7,exprGotoes);
    reduceinstr_throw = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_throw,2,instrGotoes);
    reducedoc_plus_1_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_element,1,doc_plus_1Gotoes);
    reduceexpr_star_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_empty,0,expr_star_7Gotoes);
    reduceblock_param_optional_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_empty,0,block_param_optional_6Gotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceinstrs_instr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr,1,instrsGotoes);
    reduceinstrs_optional_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_empty,0,instrs_optional_2Gotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,2,exprGotoes);
    reduceblock_param_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_block,2,block_paramGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reducedoc_plus_1_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.doc_plus_1_rec,2,doc_plus_1Gotoes);
    reduceexpr_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_value,1,exprGotoes);
    reduceblock_param_optional_6_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_6_block_param,1,block_param_optional_6Gotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,5,exprGotoes);
    reduceinstrs_optional_2_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_2_instrs,1,instrs_optional_2Gotoes);
    reduceexpr_star_7_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_element,1,expr_star_7_subGotoes);
    reduceexpr_star_7_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_through,1,expr_star_7Gotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceexpr_star_5_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_through,1,expr_star_5Gotoes);
    reduceexpr_unary_neg = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_neg,2,exprGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,2,instrGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_star_7_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_7_rec,3,expr_star_7_subGotoes);
    reduceblock_param_optional_8_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_block_param,1,block_param_optional_8Gotoes);
    reduceparameter_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_id,1,parameterGotoes);
    reduceinstrs_optional_0_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_instrs,1,instrs_optional_0Gotoes);
    reduceinstrs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_rec,3,instrsGotoes);
    reduceparameter_star_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_empty,0,parameter_star_3Gotoes);
    reduceexpr_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda,5,exprGotoes);
    reduceblock_param_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_lambda,4,block_paramGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,6,exprGotoes);
    reduceinstrs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_empty,0,instrs_optional_0Gotoes);
    reducename_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_text,1,nameGotoes);
    reduceblock_param_optional_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_8_empty,0,block_param_optional_8Gotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,1,instrGotoes);
    reduceexpr_star_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_empty,0,expr_star_5Gotoes);
    reduceparameter_star_3_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_element,1,parameter_star_3_subGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceexpr_ifelse = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ifelse,8,exprGotoes);
    reduceexpr_unary_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceparameter_star_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_rec,3,parameter_star_3_subGotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceparameter_hint_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_hint_id,2,parameterGotoes);
    reduceparameter_plus_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_plus_4_element,1,parameter_plus_4Gotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceexpr_star_5_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_5_rec,3,expr_star_5_subGotoes);
    reduceinstr_doc_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_doc_expr,2,instrGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_block,4,exprGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceparameter_star_3_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parameter_star_3_through,1,parameter_star_3Gotoes);
    reduceinstrs_instr_eoi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr_eoi,2,instrsGotoes);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift52 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(52);
    shift48 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(48);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift75 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(75);
    shift54 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(54);
    shift105 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(105);
    shift107 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(107);
    shift96 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(96);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift110 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(110);
    shift112 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(112);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift103 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(103);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift64 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(64);
    shift94 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(94);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift70 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(70);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift91 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(91);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift98 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(98);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift80 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(80);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift109 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(109);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift44 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(44);
    shift78 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(78);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initgeArray();
    initpipeArray();
    initdocArray();
    inittextArray();
    initminusArray();
    init_returnArray();
    initeqArray();
    initdotArray();
    initidArray();
    initcolonArray();
    initsemicolonArray();
    initleArray();
    initstarArray();
    initbangArray();
    init_ifArray();
    initslashArray();
    initmodArray();
    initneArray();
    initeolArray();
    init__eof__Array();
    initcommaArray();
    initvalueArray();
    init_whileArray();
    initlparArray();
    initrparArray();
    initassignArray();
    initatArray();
    initplusArray();
    initgtArray();
    init_throwArray();
    initltArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.doc,docArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.value,valueArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.at,atArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum._throw,_throwArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),121,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0block_param_optional_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_6,null);
    metadata0expr_star_5_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5_sub,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0rpar_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_while);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0expr_star_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_5,null);
    metadata0id_metadata0reduceparameter_hint_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparameter_hint_id);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0block_param_metadata0reduceblock_param_optional_6_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_6_block_param);
    metadata0block_param_optional_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_8,null);
    metadata0expr_star_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7,null);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0eol_metadata0reduceeoi_eol = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceeoi_eol);
    metadata0parameter_star_3_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3_sub,null);
    metadata0parameter_metadata0reduceparameter_plus_4_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_plus_4_element);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0expr_star_7_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_7_sub,null);
    metadata0name_metadata0reduceexpr_var_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,reduceexpr_var_access);
    metadata0instrs_optional_2_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_2,reduceblock);
    metadata0instrs_metadata0reduceinstrs_optional_2_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_2_instrs);
    metadata0block_param_metadata0reduceblock_param_optional_8_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_8_block_param);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0instrs_metadata0reduceinstrs_optional_0_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_0_instrs);
    metadata0block_metadata0reduceblock_param_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_lambda);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0id_metadata0reducename_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducename_id);
    metadata0rpar_metadata0reduceexpr_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_block);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,null);
    metadata0doc_plus_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.doc_plus_1,null);
    metadata0parameter_metadata0reduceparameter_star_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_rec);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0instrs_optional_0_metadata0reducescript = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_0,reducescript);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0parameter_metadata0reduceparameter_star_3_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_star_3_element);
    metadata0doc_metadata0reducedoc_plus_1_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_rec);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0id_metadata0reduceexpr_field_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_field_access);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0eoi_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,null);
    metadata0rpar_metadata0reduceexpr_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_lambda);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0parameter_plus_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_plus_4,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0instrs_metadata0reduceinstrs_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_rec);
    metadata0text_metadata0reducename_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reducename_text);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0parameter_metadata0reduceparameter_plus_4_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter,reduceparameter_plus_4_rec);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0value_metadata0reduceexpr_value = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.value,reduceexpr_value);
    metadata0block_metadata0reduceblock_param_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_block);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0_throw_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._throw,null);
    metadata0instr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,null);
    metadata0parameter_star_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parameter_star_3,null);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0rpar_metadata0reduceexpr_ifelse = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_ifelse);
    metadata0at_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.at,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0doc_metadata0reducedoc_plus_1_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doc,reducedoc_plus_1_element);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0doc_metadata0reducedoc_plus_1_element,metadata0minus_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0at_metadata0null,metadata0id_metadata0reduceexpr_field_access,metadata0text_metadata0reducename_text,metadata0plus_metadata0null,metadata0bang_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0value_metadata0reduceexpr_value,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0colon_metadata0null,metadata0_return_metadata0null,metadata0name_metadata0reduceexpr_var_access,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0id_metadata0reducename_id,metadata0name_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_7_metadata0null,metadata0pipe_metadata0null,metadata0id_metadata0null,metadata0parameter_star_3_metadata0null,metadata0colon_metadata0null,metadata0_throw_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0expr_star_5_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_5_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0reduceblock_param_block,metadata0instrs_optional_2_metadata0reduceblock,metadata0instr_metadata0null,metadata0eol_metadata0reduceeoi_eol,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0null,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_rec,metadata0doc_plus_1_metadata0null,metadata0doc_metadata0reducedoc_plus_1_rec,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_optional_2_instrs,metadata0block_param_metadata0reduceblock_param_optional_6_block_param,metadata0block_param_optional_6_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0block_metadata0reduceblock_param_lambda,metadata0name_metadata0null,metadata0id_metadata0reduceparameter_hint_id,metadata0parameter_star_3_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_3_rec,metadata0parameter_metadata0reduceparameter_star_3_element,metadata0block_param_metadata0reduceblock_param_optional_8_block_param,metadata0block_param_optional_8_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0expr_star_7_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_block,metadata0name_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0parameter_plus_4_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_lambda,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_plus_4_rec,metadata0parameter_metadata0reduceparameter_plus_4_element,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_while,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_ifelse,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_optional_0_instrs,metadata0instrs_optional_0_metadata0reducescript,metadata0script_metadata0null,metadata0__eof___metadata0null};
  }

  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,90,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,76,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,61,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,97,-1,-1,-1,-1,-1,-1,104,-1,-1,-1,108,-1,-1,111,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,63,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_paramGotoes;

  private void initblock_paramGotoes() {
    block_paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7Gotoes;

  private void initexpr_star_7Gotoes() {
    expr_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] nameGotoes;

  private void initnameGotoes() {
    nameGotoes = 
      new int[]{19,-1,19,-1,19,-1,-1,-1,19,19,-1,19,-1,-1,19,92,-1,19,19,-1,-1,19,-1,19,-1,19,-1,29,-1,-1,19,-1,77,-1,-1,19,19,-1,19,-1,19,-1,19,-1,19,-1,19,-1,19,-1,19,-1,19,-1,19,-1,-1,19,-1,-1,19,-1,-1,-1,-1,-1,19,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,77,-1,-1,-1,-1,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,19,-1,-1,77,-1,-1,-1,19,-1,-1,-1,19,-1,-1,19,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] doc_plus_1Gotoes;

  private void initdoc_plus_1Gotoes() {
    doc_plus_1Gotoes = 
      new int[]{69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,69,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_8Gotoes;

  private void initblock_param_optional_8Gotoes() {
    block_param_optional_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3_subGotoes;

  private void initparameter_star_3_subGotoes() {
    parameter_star_3_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameterGotoes;

  private void initparameterGotoes() {
    parameterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,82,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,100,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_6Gotoes;

  private void initblock_param_optional_6Gotoes() {
    block_param_optional_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_2Gotoes;

  private void initinstrs_optional_2Gotoes() {
    instrs_optional_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,62,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_3Gotoes;

  private void initparameter_star_3Gotoes() {
    parameter_star_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,34,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_7_subGotoes;

  private void initexpr_star_7_subGotoes() {
    expr_star_7_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,86,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{67,-1,116,-1,115,-1,-1,-1,114,113,-1,106,-1,-1,102,93,-1,67,20,-1,-1,22,-1,24,-1,26,-1,-1,-1,-1,89,-1,-1,-1,-1,67,37,-1,39,-1,41,-1,43,-1,45,-1,47,-1,49,-1,51,-1,53,-1,55,-1,-1,58,-1,-1,67,-1,-1,-1,-1,-1,67,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,67,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrsGotoes;

  private void initinstrsGotoes() {
    instrsGotoes = 
      new int[]{117,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,68,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,72,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_0Gotoes;

  private void initinstrs_optional_0Gotoes() {
    instrs_optional_0Gotoes = 
      new int[]{118,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_plus_4Gotoes;

  private void initparameter_plus_4Gotoes() {
    parameter_plus_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,95,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5_subGotoes;

  private void initexpr_star_5_subGotoes() {
    expr_star_5_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_5Gotoes;

  private void initexpr_star_5Gotoes() {
    expr_star_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{119,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift21,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,shift21,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,shift21,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift21,shift21,branch0,reduceexpr_block,reduceexpr_var_access,shift21,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift21,branch0,branch0,reduceexpr_while,shift21,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift21,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,reduceexpr_star_7_empty,shift32,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_star_5_empty,reduceexpr_star_5_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,reduceexpr_star_7_element,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] docArray;
  @SuppressWarnings("unchecked")
  private void initdocArray() {
    docArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,reducedoc_plus_1_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift1,branch0,branch0,shift70,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,shift1,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift7,reducedoc_plus_1_element,shift7,branch0,shift7,branch0,branch0,branch0,shift7,shift7,branch0,shift7,branch0,branch0,shift7,shift7,branch0,shift7,shift7,branch0,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,branch0,shift7,branch0,shift7,branch0,branch0,shift7,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,shift7,branch0,branch0,shift7,branch0,branch0,shift7,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift7,branch0,branch0,shift7,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift7,branch0,branch0,branch0,branch0,branch0,branch0,shift7,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift7,branch0,branch0,shift7,branch0,branch0,branch0,shift7,branch0,branch0,branch0,shift7,branch0,branch0,shift7,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift2,reducedoc_plus_1_element,shift2,reducename_id,shift2,branch0,reduceexpr_field_access,reducename_text,shift2,shift2,branch0,shift2,reduceexpr_value,branch0,shift2,shift2,reducename_id,shift2,shift2,reduceexpr_var_access,shift23,shift2,shift23,shift2,reduceexpr_binary_sub,shift2,shift23,branch0,branch0,branch0,shift2,branch0,branch0,branch0,branch0,shift2,shift2,shift23,shift2,shift23,shift2,reduceexpr_binary_add,shift2,shift23,shift2,shift23,shift2,reduceexpr_binary_mul,shift2,reduceexpr_binary_div,shift2,reduceexpr_binary_mod,shift2,shift23,shift2,shift23,branch0,shift2,shift23,branch0,shift2,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift2,shift23,branch0,shift2,reducedoc_plus_1_rec,shift23,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift2,shift23,shift23,branch0,reduceexpr_block,reduceexpr_var_access,shift23,reduceexpr_parens,branch0,shift2,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift23,shift2,branch0,reduceexpr_while,shift23,shift2,branch0,reduceexpr_if,shift2,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift23,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift25,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,shift25,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,shift25,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift25,shift25,branch0,reduceexpr_block,reduceexpr_var_access,shift25,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift25,branch0,branch0,reduceexpr_while,shift25,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift25,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,shift27,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift27,shift27,branch0,reduceexpr_block,reduceexpr_var_access,shift27,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift27,branch0,branch0,reduceexpr_while,shift27,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,shift27,shift27,shift27,shift27,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift3,reducedoc_plus_1_element,shift3,branch0,shift3,shift6,branch0,reducename_text,shift3,shift3,branch0,shift3,branch0,branch0,shift3,shift16,reducename_id,shift3,shift3,branch0,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift28,branch0,branch0,shift3,branch0,shift33,reducename_id,branch0,shift3,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift3,branch0,branch0,shift3,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,shift78,branch0,branch0,shift33,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,shift78,branch0,branch0,branch0,shift3,branch0,branch0,shift33,branch0,branch0,branch0,shift3,branch0,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,shift17,reduceparameter_id,branch0,branch0,reduceexpr_var_access,reduceinstr_return,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,reduceexpr_star_7_empty,shift60,reduceparameter_star_3_empty,reduceparameter_id,shift35,branch0,branch0,reduceinstr_throw,reduceexpr_star_5_empty,reduceexpr_star_5_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,shift60,branch0,branch0,reduceblock,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstr_expr,reduceinstrs_rec,branch0,branch0,reduceinstr_doc_expr,reduceinstrs_optional_2_instrs,branch0,branch0,reduceexpr_funcall,branch0,branch0,reduceparameter_hint_id,reduceparameter_star_3_through,branch0,reduceparameter_star_3_rec,reduceparameter_star_3_element,branch0,branch0,reduceexpr_mthcall,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,reduceexpr_star_7_element,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,shift96,branch0,branch0,reduceexpr_lambda,branch0,reduceparameter_plus_4_rec,reduceparameter_plus_4_element,shift103,branch0,branch0,reduceexpr_while,shift107,reduceinstrs_optional_2_empty,shift110,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,reduceinstr_return,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift65,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift44,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,shift44,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift44,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,branch0,branch0,shift44,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift44,shift44,branch0,reduceexpr_block,reduceexpr_var_access,shift44,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift44,branch0,branch0,reduceexpr_while,shift44,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift44,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift46,branch0,shift46,branch0,branch0,shift46,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift46,branch0,branch0,branch0,shift46,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift46,shift46,branch0,reduceexpr_block,reduceexpr_var_access,shift46,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift46,branch0,branch0,reduceexpr_while,shift46,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift46,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift9,reducedoc_plus_1_element,shift9,branch0,shift9,branch0,branch0,branch0,shift9,shift9,branch0,shift9,branch0,branch0,shift9,shift9,branch0,shift9,shift9,branch0,branch0,shift9,branch0,shift9,branch0,shift9,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,shift9,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,shift9,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift9,branch0,branch0,shift9,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift10,reducedoc_plus_1_element,shift10,branch0,shift10,branch0,branch0,branch0,shift10,shift10,branch0,shift10,branch0,branch0,shift10,shift10,branch0,shift10,shift10,branch0,branch0,shift10,branch0,shift10,branch0,shift10,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,shift10,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,branch0,shift10,branch0,branch0,shift10,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift10,branch0,branch0,shift10,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,shift10,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift48,branch0,shift48,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,shift48,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift48,shift48,branch0,reduceexpr_block,reduceexpr_var_access,shift48,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift48,branch0,branch0,reduceexpr_while,shift48,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift48,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,shift50,branch0,shift50,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,shift50,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift50,shift50,branch0,reduceexpr_block,reduceexpr_var_access,shift50,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift50,branch0,branch0,reduceexpr_while,shift50,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift50,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift54,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,shift54,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift54,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift54,branch0,branch0,branch0,shift54,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift54,shift54,branch0,reduceexpr_block,reduceexpr_var_access,shift54,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift54,branch0,branch0,reduceexpr_while,shift54,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift54,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,reduceinstr_return,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift64,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,reduceinstr_return,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_throw,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstr_expr,reduceinstrs_rec,branch0,branch0,reduceinstr_doc_expr,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,reduceinstrs_optional_0_instrs,reducescript,accept,accept};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reduceparameter_id,branch0,branch0,reduceexpr_var_access,branch0,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_id,branch0,branch0,branch0,branch0,branch0,reduceexpr_star_5_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,shift57,branch0,reduceexpr_star_5_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,reduceparameter_hint_id,shift80,branch0,reduceparameter_star_3_rec,reduceparameter_star_3_element,branch0,branch0,reduceexpr_mthcall,shift87,branch0,reduceexpr_star_7_rec,reduceexpr_star_7_element,branch0,reduceexpr_block,branch0,branch0,reduceexpr_parens,shift99,branch0,branch0,reduceexpr_lambda,branch0,reduceparameter_plus_4_rec,reduceparameter_plus_4_element,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] valueArray;
  @SuppressWarnings("unchecked")
  private void initvalueArray() {
    valueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift12,reducedoc_plus_1_element,shift12,branch0,shift12,branch0,branch0,branch0,shift12,shift12,branch0,shift12,branch0,branch0,shift12,shift12,branch0,shift12,shift12,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,shift12,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift12,branch0,branch0,shift12,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift13,reducedoc_plus_1_element,shift13,branch0,shift13,branch0,branch0,branch0,shift13,shift13,branch0,shift13,branch0,branch0,shift13,shift13,branch0,shift13,shift13,branch0,branch0,shift13,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,shift13,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift13,branch0,branch0,shift13,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift15,reducedoc_plus_1_element,shift15,reducename_id,shift15,branch0,reduceexpr_field_access,reducename_text,shift15,shift15,shift11,shift15,reduceexpr_value,shift14,shift15,shift15,reducename_id,shift15,shift15,reduceexpr_var_access,shift38,shift15,shift38,shift15,shift38,shift15,shift38,branch0,reducename_id,shift30,shift15,branch0,branch0,branch0,branch0,shift15,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,shift15,shift38,branch0,shift15,shift38,branch0,shift15,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift15,shift38,branch0,shift15,reducedoc_plus_1_rec,shift38,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift15,shift38,shift38,branch0,reduceexpr_block,reduceexpr_var_access,shift38,reduceexpr_parens,branch0,shift15,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift38,shift15,branch0,reduceexpr_while,shift38,shift15,branch0,reduceexpr_if,shift15,branch0,reduceexpr_ifelse,shift38,shift38,shift38,shift38,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,reduceinstrs_optional_2_empty,branch0,reduceexpr_var_access,reduceinstr_return,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,reduceexpr_star_7_empty,reduceblock_param_optional_8_empty,branch0,branch0,branch0,reduceinstrs_optional_2_empty,branch0,reduceinstr_throw,reduceexpr_star_5_empty,reduceexpr_star_5_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,reduceexpr_star_5_through,branch0,reduceexpr_star_5_rec,reduceblock_param_optional_6_empty,reduceinstrs_optional_2_empty,reduceblock_param_block,reduceblock,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstr_expr,reduceinstrs_rec,branch0,branch0,reduceinstr_doc_expr,reduceinstrs_optional_2_instrs,reduceblock_param_optional_6_block_param,shift75,reduceexpr_funcall,reduceblock_param_lambda,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock_param_optional_8_block_param,shift85,reduceexpr_mthcall,reduceexpr_star_7_through,branch0,reduceexpr_star_7_rec,reduceexpr_star_7_element,shift91,reduceexpr_block,reduceexpr_var_access,shift94,reduceexpr_parens,branch0,reduceinstrs_optional_2_empty,shift98,reduceexpr_lambda,branch0,branch0,branch0,branch0,reduceinstrs_optional_2_empty,shift105,reduceexpr_while,branch0,reduceinstrs_optional_2_empty,shift109,reduceexpr_if,reduceinstrs_optional_2_empty,shift112,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] atArray;
  @SuppressWarnings("unchecked")
  private void initatArray() {
    atArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift5,reducedoc_plus_1_element,shift5,branch0,shift5,branch0,branch0,branch0,shift5,shift5,branch0,shift5,branch0,branch0,shift5,shift5,branch0,shift5,shift5,branch0,branch0,shift5,branch0,shift5,branch0,shift5,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,shift5,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift5,branch0,branch0,shift5,reducedoc_plus_1_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift8,reducedoc_plus_1_element,shift8,reducename_id,shift8,branch0,reduceexpr_field_access,reducename_text,shift8,shift8,branch0,shift8,reduceexpr_value,branch0,shift8,shift8,reducename_id,shift8,shift8,reduceexpr_var_access,shift40,shift8,shift40,shift8,reduceexpr_binary_sub,shift8,shift40,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,shift8,shift8,shift40,shift8,shift40,shift8,reduceexpr_binary_add,shift8,shift40,shift8,shift40,shift8,reduceexpr_binary_mul,shift8,reduceexpr_binary_div,shift8,reduceexpr_binary_mod,shift8,shift40,shift8,shift40,branch0,shift8,shift40,branch0,shift8,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift8,shift40,branch0,shift8,reducedoc_plus_1_rec,shift40,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,shift8,shift40,shift40,branch0,reduceexpr_block,reduceexpr_var_access,shift40,reduceexpr_parens,branch0,shift8,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift40,shift8,branch0,reduceexpr_while,shift40,shift8,branch0,reduceexpr_if,shift8,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift40,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift42,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,shift42,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,branch0,branch0,shift42,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift42,shift42,branch0,reduceexpr_block,reduceexpr_var_access,shift42,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift42,branch0,branch0,reduceexpr_while,shift42,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift42,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _throwArray;
  @SuppressWarnings("unchecked")
  private void init_throwArray() {
    _throwArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,shift36,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_field_access,reducename_text,branch0,branch0,branch0,branch0,reduceexpr_value,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_var_access,shift52,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift52,branch0,shift52,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ne,branch0,branch0,shift52,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift52,branch0,branch0,branch0,shift52,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,shift52,shift52,branch0,reduceexpr_block,reduceexpr_var_access,shift52,reduceexpr_parens,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,shift52,branch0,branch0,reduceexpr_while,shift52,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,shift52,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,error0,error0,reducename_id,error0,error0,reduceexpr_field_access,reducename_text,error0,error0,error0,error0,reduceexpr_value,error0,error0,error0,error0,error0,error0,reduceexpr_var_access,reduceinstr_return,error0,reduceexpr_binary_ge,error0,reduceexpr_binary_sub,error0,reduceexpr_binary_eq,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceinstr_throw,error0,error0,error0,reduceexpr_binary_add,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_le,error0,reduceexpr_binary_mul,error0,reduceexpr_binary_div,error0,reduceexpr_binary_mod,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_ne,error0,error0,error0,error0,error0,error0,error0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstr_expr,reduceinstrs_rec,error0,error0,reduceinstr_doc_expr,error0,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_mthcall,error0,error0,error0,error0,error0,reduceexpr_block,error0,error0,reduceexpr_parens,error0,error0,error0,reduceexpr_lambda,error0,error0,error0,error0,error0,error0,reduceexpr_while,error0,error0,error0,reduceexpr_if,error0,error0,reduceexpr_ifelse,reduceexpr_unary_not,reduceexpr_unary_plus,reduceexpr_var_assignment,reduceexpr_unary_neg,reduceinstrs_optional_0_instrs,reducescript,exit,exit};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_plus_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_eol;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_throw;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedoc_plus_1_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_6_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_2_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_neg;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_7_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ifelse;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_hint_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_plus_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_5_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_doc_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparameter_star_3_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr_eoi;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift52;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift48;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift75;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift54;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift105;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift107;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift96;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift110;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift112;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift103;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift64;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift94;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift70;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift91;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift98;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift80;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift109;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift44;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift78;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparameter_hint_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_6_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceeoi_eol;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_plus_4_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_7_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0reduceexpr_var_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_2_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_2_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_8_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_0_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducename_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_plus_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_0_metadata0reducescript;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_star_3_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_field_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_plus_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reducename_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_metadata0reduceparameter_plus_4_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0value_metadata0reduceexpr_value;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_throw_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parameter_star_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_ifelse;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0at_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doc_metadata0reducedoc_plus_1_element;
}
