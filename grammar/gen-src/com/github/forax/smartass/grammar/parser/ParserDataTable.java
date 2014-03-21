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
    initinstrs_optional_1Gotoes();
    initeoiGotoes();
    initinstrsGotoes();
    initid_star_2_subGotoes();
    initblock_param_optional_5Gotoes();
    initid_plus_3Gotoes();
    initscriptGotoes();
    initexpr_star_6_subGotoes();
    initexprGotoes();
    initinstrs_optional_0Gotoes();
    initexpr_star_6Gotoes();
    initexpr_star_4Gotoes();
    initexpr_star_4_subGotoes();
    initid_star_2Gotoes();
    initinstrGotoes();
    initblock_paramGotoes();
    initblock_param_optional_7Gotoes();
    initblockGotoes();
    initnameGotoes();
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceinstrs_optional_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_1_empty,0,instrs_optional_1Gotoes);
    reduceid_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_rec,3,id_star_2_subGotoes);
    reduceexpr_star_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_empty,0,expr_star_4Gotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,2,exprGotoes);
    reduceinstrs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_empty,0,instrs_optional_0Gotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceinstrs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_rec,3,instrsGotoes);
    reduceid_star_2_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_element,1,id_star_2_subGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_star_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_rec,3,expr_star_4_subGotoes);
    reduceexpr_unary_neg = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_neg,2,exprGotoes);
    reduceexpr_ifelse = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ifelse,8,exprGotoes);
    reduceinstrs_optional_0_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_instrs,1,instrs_optional_0Gotoes);
    reduceexpr_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_value,1,exprGotoes);
    reduceid_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_empty,0,id_star_2Gotoes);
    reduceblock_param_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_block,2,block_paramGotoes);
    reduceexpr_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_block,4,exprGotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,1,instrGotoes);
    reduceeoi_eol = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_eol,1,eoiGotoes);
    reduceinstrs_optional_1_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_1_instrs,1,instrs_optional_1Gotoes);
    reduceexpr_star_6_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_rec,3,expr_star_6_subGotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceblock_param_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_lambda,4,block_paramGotoes);
    reduceblock_param_optional_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_7_empty,0,block_param_optional_7Gotoes);
    reduceid_plus_3_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_plus_3_element,1,id_plus_3Gotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceexpr_star_6_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_element,1,expr_star_6_subGotoes);
    reducename_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_text,1,nameGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceexpr_star_6_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_through,1,expr_star_6Gotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,7,exprGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceid_star_2_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_through,1,id_star_2Gotoes);
    reduceexpr_star_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_empty,0,expr_star_6Gotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,5,exprGotoes);
    reducename_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_id,1,nameGotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,6,exprGotoes);
    reduceblock_param_optional_5_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_5_block_param,1,block_param_optional_5Gotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceexpr_star_4_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_through,1,expr_star_4Gotoes);
    reduceexpr_star_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_element,1,expr_star_4_subGotoes);
    reduceinstrs_instr_eoi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr_eoi,2,instrsGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceid_plus_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_plus_3_rec,3,id_plus_3Gotoes);
    reduceinstrs_instr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_instr,1,instrsGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,2,instrGotoes);
    reduceexpr_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda,5,exprGotoes);
    reduceblock_param_optional_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_5_empty,0,block_param_optional_5Gotoes);
    reduceinstr_throw = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_throw,2,instrGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceblock_param_optional_7_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_7_block_param,1,block_param_optional_7Gotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    shift70 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(70);
    shift80 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(80);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift62 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(62);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift84 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(84);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift67 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(67);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift88 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(88);
    shift101 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(101);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift64 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(64);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift68 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(68);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift92 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(92);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift94 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(94);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift73 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(73);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift93 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(93);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift96 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(96);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift103 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(103);
    shift34 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(34);
    shift104 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(104);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initeolArray();
    init_ifArray();
    init_returnArray();
    initslashArray();
    initplusArray();
    initatArray();
    init_throwArray();
    initstarArray();
    initpipeArray();
    initlparArray();
    initleArray();
    initrparArray();
    inittextArray();
    initvalueArray();
    initassignArray();
    initgeArray();
    initcommaArray();
    initneArray();
    initminusArray();
    init__eof__Array();
    initeqArray();
    initmodArray();
    initidArray();
    initdotArray();
    initgtArray();
    initsemicolonArray();
    initcolonArray();
    initbangArray();
    init_whileArray();
    initltArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.at,atArray);
    tableMap.put(TerminalEnum._throw,_throwArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.value,valueArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),110,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0_throw_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._throw,null);
    metadata0id_metadata0reduceid_star_2_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_element);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0expr_star_4_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4_sub,null);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0name_metadata0reduceexpr_var_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,reduceexpr_var_access);
    metadata0instrs_metadata0reduceinstrs_optional_1_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_1_instrs);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0id_plus_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_plus_3,null);
    metadata0at_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.at,null);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0eoi_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0rpar_metadata0reduceexpr_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_lambda);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0block_metadata0reduceblock_param_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_lambda);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0block_param_metadata0reduceblock_param_optional_5_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_5_block_param);
    metadata0block_param_metadata0reduceblock_param_optional_7_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_7_block_param);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0id_metadata0reducename_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducename_id);
    metadata0block_param_optional_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_5,null);
    metadata0name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,null);
    metadata0id_metadata0reduceid_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_rec);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0expr_star_6_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6_sub,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0expr_star_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6,null);
    metadata0rpar_metadata0reduceexpr_ifelse = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_ifelse);
    metadata0instrs_optional_0_metadata0reducescript = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_0,reducescript);
    metadata0text_metadata0reducename_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reducename_text);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0instr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,null);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0expr_star_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4,null);
    metadata0value_metadata0reduceexpr_value = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.value,reduceexpr_value);
    metadata0id_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2,null);
    metadata0id_metadata0reduceexpr_field_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_field_access);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0id_star_2_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2_sub,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0rpar_metadata0reduceexpr_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_block);
    metadata0block_metadata0reduceblock_param_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_block);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0id_metadata0reduceid_plus_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_plus_3_rec);
    metadata0rpar_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_while);
    metadata0instrs_metadata0reduceinstrs_optional_0_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_0_instrs);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0eol_metadata0reduceeoi_eol = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceeoi_eol);
    metadata0instrs_optional_1_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_1,reduceblock);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0block_param_optional_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_7,null);
    metadata0instrs_metadata0reduceinstrs_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_rec);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0at_metadata0null,metadata0id_metadata0reduceexpr_field_access,metadata0minus_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0bang_metadata0null,metadata0lpar_metadata0null,metadata0colon_metadata0null,metadata0_throw_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0text_metadata0reducename_text,metadata0value_metadata0reduceexpr_value,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0id_metadata0reducename_id,metadata0name_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_6_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_4_metadata0null,metadata0colon_metadata0null,metadata0_return_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0name_metadata0reduceexpr_var_access,metadata0instrs_optional_1_metadata0reduceblock,metadata0instrs_metadata0reduceinstrs_optional_1_instrs,metadata0instr_metadata0null,metadata0eol_metadata0reduceeoi_eol,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0null,metadata0instrs_metadata0reduceinstrs_rec,metadata0expr_metadata0null,metadata0block_metadata0reduceblock_param_block,metadata0pipe_metadata0null,metadata0id_metadata0reduceid_star_2_element,metadata0id_star_2_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0reduceblock_param_lambda,metadata0id_star_2_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_2_rec,metadata0block_param_optional_5_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0block_param_metadata0reduceblock_param_optional_5_block_param,metadata0expr_star_4_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_star_6_metadata0null,metadata0block_param_metadata0reduceblock_param_optional_7_block_param,metadata0block_param_optional_7_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_while,metadata0expr_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_block,metadata0id_metadata0null,metadata0id_plus_3_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_lambda,metadata0comma_metadata0null,metadata0id_metadata0reduceid_plus_3_rec,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_ifelse,metadata0rpar_metadata0reduceexpr_if,metadata0expr_metadata0null,metadata0instrs_metadata0reduceinstrs_optional_0_instrs,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0instrs_optional_0_metadata0reducescript};
  }

  
  private int[] instrs_optional_1Gotoes;

  private void initinstrs_optional_1Gotoes() {
    instrs_optional_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,52,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrsGotoes;

  private void initinstrsGotoes() {
    instrsGotoes = 
      new int[]{106,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,53,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2_subGotoes;

  private void initid_star_2_subGotoes() {
    id_star_2_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_5Gotoes;

  private void initblock_param_optional_5Gotoes() {
    block_param_optional_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_plus_3Gotoes;

  private void initid_plus_3Gotoes() {
    id_plus_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,89,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6_subGotoes;

  private void initexpr_star_6_subGotoes() {
    expr_star_6_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{59,-1,-1,105,-1,98,97,95,59,85,-1,81,-1,16,-1,-1,-1,18,-1,20,-1,22,-1,24,-1,26,-1,28,-1,-1,-1,-1,76,-1,35,-1,37,-1,39,-1,75,-1,59,44,-1,46,-1,48,-1,50,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,59,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_0Gotoes;

  private void initinstrs_optional_0Gotoes() {
    instrs_optional_0Gotoes = 
      new int[]{109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6Gotoes;

  private void initexpr_star_6Gotoes() {
    expr_star_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_4Gotoes;

  private void initexpr_star_4Gotoes() {
    expr_star_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_4_subGotoes;

  private void initexpr_star_4_subGotoes() {
    expr_star_4_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,72,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2Gotoes;

  private void initid_star_2Gotoes() {
    id_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{54,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,54,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_paramGotoes;

  private void initblock_paramGotoes() {
    block_paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,78,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_7Gotoes;

  private void initblock_param_optional_7Gotoes() {
    block_param_optional_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,86,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,60,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,91,-1,-1,-1,-1,-1,-1,-1,-1,100,-1,102,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] nameGotoes;

  private void initnameGotoes() {
    nameGotoes = 
      new int[]{51,-1,-1,51,-1,51,51,51,51,51,-1,51,-1,51,-1,-1,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,31,-1,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,51,-1,51,-1,51,-1,51,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,51,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,shift55,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceexpr_while,reduceinstr_throw,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift4,branch0,branch0,shift4,branch0,shift4,shift4,shift4,shift4,shift4,branch0,shift4,branch0,shift4,branch0,branch0,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,branch0,branch0,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,shift4,shift4,branch0,shift4,branch0,shift4,branch0,shift4,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift4,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift4,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift43,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift25,branch0,shift25,branch0,shift25,branch0,shift25,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,shift25,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift25,branch0,shift25,branch0,shift25,branch0,shift25,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift25,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift25,shift25,shift25,branch0,branch0,branch0,reduceexpr_mthcall,shift25,branch0,branch0,reduceexpr_while,shift25,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift25,reduceexpr_parens,reduceexpr_unary_not,shift25,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift27,branch0,shift27,branch0,reduceexpr_binary_sub,branch0,shift27,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift27,branch0,shift27,branch0,shift27,branch0,shift27,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift27,shift27,shift27,branch0,branch0,branch0,reduceexpr_mthcall,shift27,branch0,branch0,reduceexpr_while,shift27,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift27,reduceexpr_parens,reduceexpr_unary_not,shift27,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] atArray;
  @SuppressWarnings("unchecked")
  private void initatArray() {
    atArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,branch0,branch0,shift1,branch0,shift1,shift1,shift1,shift1,shift1,branch0,shift1,branch0,shift1,branch0,branch0,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,branch0,branch0,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift1,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _throwArray;
  @SuppressWarnings("unchecked")
  private void init_throwArray() {
    _throwArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift38,branch0,shift38,branch0,shift38,branch0,shift38,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,shift38,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift38,branch0,shift38,branch0,shift38,branch0,shift38,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift38,shift38,shift38,branch0,branch0,branch0,reduceexpr_mthcall,shift38,branch0,branch0,reduceexpr_while,shift38,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift38,reduceexpr_parens,reduceexpr_unary_not,shift38,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,reduceexpr_star_4_empty,shift61,branch0,branch0,branch0,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_4_element,reduceexpr_star_6_element,shift61,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift7,branch0,reduceexpr_field_access,shift7,shift5,shift7,shift7,shift7,shift7,shift7,shift11,shift7,reducename_id,shift7,reducename_text,reduceexpr_value,shift40,shift7,shift40,shift7,shift40,shift7,shift40,shift7,shift40,shift7,shift40,shift7,shift40,branch0,reducename_id,shift32,shift7,branch0,shift7,shift40,shift7,shift40,shift7,shift40,shift7,branch0,shift7,shift7,shift40,shift7,shift40,shift7,shift40,shift7,shift40,reduceexpr_var_access,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift7,branch0,shift40,branch0,branch0,branch0,branch0,shift7,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,shift7,shift40,shift40,shift40,branch0,branch0,branch0,reduceexpr_mthcall,shift40,shift7,branch0,reduceexpr_while,shift40,branch0,reduceexpr_block,reducename_id,branch0,shift7,branch0,reduceexpr_lambda,branch0,branch0,shift40,reduceexpr_parens,shift40,shift40,shift7,branch0,shift7,branch0,reduceexpr_ifelse,reduceexpr_if,shift40,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift45,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift45,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift45,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift45,shift45,shift45,branch0,branch0,branch0,reduceexpr_mthcall,shift45,branch0,branch0,reduceexpr_while,shift45,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift45,reduceexpr_parens,reduceexpr_unary_not,shift45,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,reduceinstrs_optional_1_empty,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,reduceexpr_star_4_empty,reduceblock_param_optional_5_empty,reduceinstrs_optional_1_empty,branch0,reduceinstr_return,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,reduceblock,reduceinstrs_optional_1_instrs,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,reduceblock_param_block,branch0,branch0,branch0,reduceinstrs_optional_1_empty,reduceblock_param_lambda,branch0,branch0,branch0,shift70,reduceexpr_funcall,reduceblock_param_optional_5_block_param,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_4_element,reduceexpr_star_6_element,reduceblock_param_optional_7_empty,reduceblock_param_optional_7_block_param,shift80,reduceexpr_mthcall,branch0,reduceinstrs_optional_1_empty,shift84,reduceexpr_while,reduceinstr_throw,shift87,reduceexpr_block,reducename_id,branch0,reduceinstrs_optional_1_empty,shift92,reduceexpr_lambda,branch0,branch0,shift96,reduceexpr_parens,reduceexpr_unary_not,branch0,reduceinstrs_optional_1_empty,shift104,reduceinstrs_optional_1_empty,shift103,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift14,branch0,branch0,shift14,branch0,shift14,shift14,shift14,shift14,shift14,branch0,shift14,branch0,shift14,branch0,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift14,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] valueArray;
  @SuppressWarnings("unchecked")
  private void initvalueArray() {
    valueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift15,branch0,branch0,shift15,branch0,shift15,shift15,shift15,shift15,shift15,branch0,shift15,branch0,shift15,branch0,branch0,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,branch0,branch0,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,shift15,shift15,branch0,shift15,branch0,shift15,branch0,shift15,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift15,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift15,branch0,shift15,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift49,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift49,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift49,shift49,shift49,branch0,branch0,branch0,reduceexpr_mthcall,shift49,branch0,branch0,reduceexpr_while,shift49,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift49,reduceexpr_parens,reduceexpr_unary_not,shift49,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,shift34,branch0,reduceexpr_star_6_rec,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceid_star_2_element,branch0,branch0,branch0,shift67,branch0,reduceid_star_2_rec,branch0,reduceexpr_funcall,branch0,shift73,branch0,reduceexpr_star_4_rec,reduceexpr_star_4_element,reduceexpr_star_6_element,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,reduceexpr_block,reduceid_plus_3_element,shift93,branch0,branch0,reduceexpr_lambda,branch0,reduceid_plus_3_rec,branch0,reduceexpr_parens,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift17,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift17,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift17,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift17,shift17,shift17,branch0,branch0,branch0,reduceexpr_mthcall,shift17,branch0,branch0,reduceexpr_while,shift17,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift17,reduceexpr_parens,reduceexpr_unary_not,shift17,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift3,branch0,reduceexpr_field_access,shift3,branch0,shift3,shift3,shift3,shift3,shift3,branch0,shift3,reducename_id,shift3,reducename_text,reduceexpr_value,shift19,shift3,shift19,shift3,reduceexpr_binary_sub,shift3,shift19,shift3,reduceexpr_binary_mod,shift3,reduceexpr_binary_div,shift3,reduceexpr_binary_add,branch0,branch0,branch0,shift3,branch0,shift3,shift19,shift3,shift19,shift3,reduceexpr_binary_mul,shift3,branch0,shift3,shift3,shift19,shift3,shift19,shift3,shift19,shift3,shift19,reduceexpr_var_access,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift3,branch0,shift19,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,shift3,shift19,shift19,shift19,branch0,branch0,branch0,reduceexpr_mthcall,shift19,shift3,branch0,reduceexpr_while,shift19,branch0,reduceexpr_block,reducename_id,branch0,shift3,branch0,reduceexpr_lambda,branch0,branch0,shift19,reduceexpr_parens,reduceexpr_unary_not,shift19,shift3,branch0,shift3,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceexpr_while,reduceinstr_throw,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,reduceinstrs_optional_0_instrs,accept,accept,reducescript};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift21,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift21,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift21,shift21,shift21,branch0,branch0,branch0,reduceexpr_mthcall,shift21,branch0,branch0,reduceexpr_while,shift21,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift21,reduceexpr_parens,reduceexpr_unary_not,shift21,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift23,branch0,shift23,branch0,shift23,branch0,shift23,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,shift23,branch0,branch0,branch0,branch0,branch0,branch0,shift23,branch0,shift23,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift23,branch0,shift23,branch0,shift23,branch0,shift23,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift23,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift23,shift23,shift23,branch0,branch0,branch0,reduceexpr_mthcall,shift23,branch0,branch0,reduceexpr_while,shift23,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift23,reduceexpr_parens,reduceexpr_unary_not,shift23,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift12,shift2,branch0,shift12,branch0,shift12,shift12,shift88,shift12,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift30,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift12,branch0,branch0,branch0,shift62,branch0,branch0,shift12,branch0,branch0,shift68,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,shift94,branch0,branch0,branch0,branch0,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,branch0,branch0,branch0,shift29,branch0,shift29,branch0,shift29,branch0,shift29,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift29,shift29,shift29,branch0,branch0,branch0,reduceexpr_mthcall,shift29,branch0,branch0,reduceexpr_while,shift29,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift29,reduceexpr_parens,shift29,shift29,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,shift29,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift36,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift36,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift36,shift36,shift36,branch0,branch0,branch0,reduceexpr_mthcall,shift36,branch0,branch0,reduceexpr_while,shift36,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift36,reduceexpr_parens,reduceexpr_unary_not,shift36,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,shift56,branch0,branch0,branch0,branch0,reduceinstr_expr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceexpr_while,reduceinstr_throw,branch0,reduceexpr_block,branch0,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_unary_not,branch0,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,reduceexpr_star_4_empty,shift42,branch0,branch0,reduceinstr_return,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,reduceblock,reduceinstrs_optional_1_instrs,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,branch0,reduceid_star_2_empty,reduceid_star_2_element,shift64,branch0,branch0,reduceid_star_2_through,branch0,reduceid_star_2_rec,branch0,reduceexpr_funcall,branch0,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_4_element,reduceexpr_star_6_element,shift42,branch0,branch0,reduceexpr_mthcall,shift82,branch0,branch0,reduceexpr_while,reduceinstr_throw,branch0,reduceexpr_block,reduceid_plus_3_element,shift90,branch0,branch0,reduceexpr_lambda,branch0,reduceid_plus_3_rec,branch0,reduceexpr_parens,reduceexpr_unary_not,shift99,reduceinstrs_optional_1_empty,shift101,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift6,branch0,branch0,shift6,branch0,shift6,shift6,shift6,shift6,shift6,branch0,shift6,branch0,shift6,branch0,branch0,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,branch0,branch0,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,shift6,shift6,branch0,shift6,branch0,shift6,branch0,shift6,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift6,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift6,branch0,shift6,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift10,branch0,branch0,shift10,branch0,shift10,shift10,shift10,shift10,shift10,branch0,shift10,branch0,shift10,branch0,branch0,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,branch0,branch0,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,shift10,shift10,branch0,shift10,branch0,shift10,branch0,shift10,branch0,branch0,branch0,branch0,branch0,reduceeoi_eol,reduceeoi_semi,shift10,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reduceexpr_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,reducename_text,reduceexpr_value,shift47,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_eq,branch0,reduceexpr_binary_mod,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_add,branch0,branch0,branch0,branch0,branch0,branch0,shift47,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_mul,branch0,branch0,branch0,branch0,shift47,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_ge,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift47,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,shift47,shift47,shift47,branch0,branch0,branch0,reduceexpr_mthcall,shift47,branch0,branch0,reduceexpr_while,shift47,branch0,reduceexpr_block,reducename_id,branch0,branch0,branch0,reduceexpr_lambda,branch0,branch0,shift47,reduceexpr_parens,reduceexpr_unary_not,shift47,branch0,branch0,branch0,branch0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,error0,reduceexpr_field_access,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducename_id,error0,reducename_text,reduceexpr_value,reduceexpr_var_assignment,error0,reduceexpr_binary_ne,error0,reduceexpr_binary_sub,error0,reduceexpr_binary_eq,error0,reduceexpr_binary_mod,error0,reduceexpr_binary_div,error0,reduceexpr_binary_add,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_mul,error0,error0,error0,error0,reduceinstr_return,error0,reduceexpr_binary_le,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_ge,reduceexpr_var_access,error0,error0,reduceinstrs_instr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_instr_eoi,reduceinstrs_rec,reduceinstr_expr,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_mthcall,error0,error0,error0,reduceexpr_while,reduceinstr_throw,error0,reduceexpr_block,error0,error0,error0,error0,reduceexpr_lambda,error0,error0,error0,reduceexpr_parens,reduceexpr_unary_not,error0,error0,error0,error0,error0,reduceexpr_ifelse,reduceexpr_if,reduceexpr_unary_neg,reduceinstrs_optional_0_instrs,exit,exit,reducescript};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_neg;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ifelse;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_eol;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_1_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_plus_3_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_5_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr_eoi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_plus_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_instr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_throw;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_7_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift70;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift80;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift62;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift84;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift67;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift88;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift101;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift64;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift68;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift92;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift94;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift73;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift93;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift96;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift103;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift34;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift104;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_throw_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0reduceexpr_var_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_1_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_plus_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0at_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_5_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_7_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducename_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_ifelse;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_0_metadata0reducescript;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reducename_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0value_metadata0reduceexpr_value;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_field_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_plus_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_0_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceeoi_eol;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_1_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
}
