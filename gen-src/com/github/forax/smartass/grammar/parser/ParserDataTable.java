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
    initexpr_star_4Gotoes();
    initexprGotoes();
    initblockGotoes();
    initblock_param_optional_7Gotoes();
    initblock_paramGotoes();
    initid_star_2_subGotoes();
    initinstrsGotoes();
    initinstrs_optional_0Gotoes();
    initid_plus_3Gotoes();
    initinstrs_optional_1Gotoes();
    initexpr_star_6_subGotoes();
    initblock_param_optional_5Gotoes();
    initid_star_2Gotoes();
    initscriptGotoes();
    initexpr_star_6Gotoes();
    initexpr_star_4_subGotoes();
    initnameGotoes();
    initeoiGotoes();
    reduceexpr_var_assignment = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_assignment,3,exprGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceexpr_star_6_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_through,1,expr_star_6Gotoes);
    reduceexpr_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda,5,exprGotoes);
    reduceeoi_eol = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_eol,1,eoiGotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,7,exprGotoes);
    reduceexpr_unary_neg = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_neg,2,exprGotoes);
    reduceinstrs_optional_0_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_instrs,1,instrs_optional_0Gotoes);
    reduceinstrs_optional_1_instrs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_1_instrs,1,instrs_optional_1Gotoes);
    reducename_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_id,1,nameGotoes);
    reduceexpr_binary_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_eq,3,exprGotoes);
    reduceexpr_binary_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_le,3,exprGotoes);
    reduceid_star_2_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_through,1,id_star_2Gotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,5,exprGotoes);
    reduceexpr_binary_mod = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mod,3,exprGotoes);
    reduceexpr_star_4_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_rec,3,expr_star_4_subGotoes);
    reduceexpr_field_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_field_access,2,exprGotoes);
    reduceexpr_binary_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ne,3,exprGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_star_4_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_element,1,expr_star_4_subGotoes);
    reduceexpr_binary_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_sub,3,exprGotoes);
    reduceblock_param_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_block,2,block_paramGotoes);
    reduceexpr_star_6_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_rec,3,expr_star_6_subGotoes);
    reduceexpr_binary_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_ge,3,exprGotoes);
    reduceexpr_var_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_var_access,1,exprGotoes);
    reduceexpr_binary_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_lt,3,exprGotoes);
    reduceblock_param_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_lambda,4,block_paramGotoes);
    reduceblock_param_optional_5_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_5_block_param,1,block_param_optional_5Gotoes);
    reduceexpr_binary_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_div,3,exprGotoes);
    reduceexpr_star_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_empty,0,expr_star_6Gotoes);
    reduceinstrs_expr_eoi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_expr_eoi,2,instrsGotoes);
    reduceid_plus_3_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_plus_3_element,1,id_plus_3Gotoes);
    reduceexpr_star_4_through = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_through,1,expr_star_4Gotoes);
    reduceblock = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block,1,blockGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceexpr_binary_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_gt,3,exprGotoes);
    reduceexpr_block = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_block,4,exprGotoes);
    reduceexpr_binary_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_add,3,exprGotoes);
    reduceblock_param_optional_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_5_empty,0,block_param_optional_5Gotoes);
    reduceexpr_unary_not = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_unary_not,2,exprGotoes);
    reduceblock_param_optional_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_7_empty,0,block_param_optional_7Gotoes);
    reduceexpr_star_6_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_6_element,1,expr_star_6_subGotoes);
    reduceexpr_value = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_value,1,exprGotoes);
    reduceinstrs_optional_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_1_empty,0,instrs_optional_1Gotoes);
    reduceinstrs_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_expr,1,instrsGotoes);
    reduceexpr_ifelse = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ifelse,8,exprGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_binary_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_binary_mul,3,exprGotoes);
    reduceid_star_2_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_rec,3,id_star_2_subGotoes);
    reduceinstrs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_rec,3,instrsGotoes);
    reduceexpr_star_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_star_4_empty,0,expr_star_4Gotoes);
    reduceblock_param_optional_7_block_param = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_param_optional_7_block_param,1,block_param_optional_7Gotoes);
    reduceid_star_2_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_element,1,id_star_2_subGotoes);
    reduceinstrs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instrs_optional_0_empty,0,instrs_optional_0Gotoes);
    reducename_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_text,1,nameGotoes);
    reduceid_star_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_star_2_empty,0,id_star_2Gotoes);
    reduceid_plus_3_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.id_plus_3_rec,3,id_plus_3Gotoes);
    reduceexpr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_while,6,exprGotoes);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift84 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(84);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift77 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(77);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift93 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(93);
    shift83 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(83);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift98 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(98);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift79 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(79);
    shift91 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(91);
    shift59 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(59);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift68 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(68);
    shift81 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(81);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift48 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(48);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift76 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(76);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift100 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(100);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initatArray();
    initcommaArray();
    initdotArray();
    initassignArray();
    initbangArray();
    initcolonArray();
    initpipeArray();
    init_ifArray();
    init_whileArray();
    initeolArray();
    initrparArray();
    initminusArray();
    initstarArray();
    initltArray();
    initleArray();
    initvalueArray();
    initlparArray();
    initneArray();
    initslashArray();
    initmodArray();
    init__eof__Array();
    initplusArray();
    initgtArray();
    initidArray();
    initgeArray();
    inittextArray();
    initeqArray();
    initsemicolonArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.at,atArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.bang,bangArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.value,valueArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.mod,modArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),105,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0id_star_2_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2_sub,null);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0rpar_metadata0reduceexpr_ifelse = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_ifelse);
    metadata0value_metadata0reduceexpr_value = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.value,reduceexpr_value);
    metadata0eoi_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,null);
    metadata0block_metadata0reduceblock_param_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_lambda);
    metadata0id_metadata0reduceid_star_2_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_element);
    metadata0block_param_metadata0reduceblock_param_optional_7_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_7_block_param);
    metadata0block_param_optional_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_5,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0at_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.at,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0id_plus_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_plus_3,null);
    metadata0block_metadata0reduceblock_param_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,reduceblock_param_block);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0id_metadata0reduceid_plus_3_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_plus_3_rec);
    metadata0expr_star_6_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6_sub,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0instrs_metadata0reduceinstrs_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_rec);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0id_metadata0reduceid_star_2_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceid_star_2_rec);
    metadata0bang_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.bang,null);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0expr_star_4_sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4_sub,null);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0text_metadata0reducename_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reducename_text);
    metadata0plus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,null);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0eol_metadata0reduceeoi_eol = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceeoi_eol);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0mod_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mod,null);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0id_metadata0reducename_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducename_id);
    metadata0instrs_metadata0reduceinstrs_optional_1_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_1_instrs);
    metadata0id_star_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.id_star_2,null);
    metadata0rpar_metadata0reduceexpr_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_lambda);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0expr_star_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_6,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0instrs_optional_0_metadata0reducescript = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_0,reducescript);
    metadata0rpar_metadata0reduceexpr_block = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_block);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0instrs_optional_1_metadata0reduceblock = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs_optional_1,reduceblock);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0block_param_metadata0reduceblock_param_optional_5_block_param = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param,reduceblock_param_optional_5_block_param);
    metadata0instrs_metadata0reduceinstrs_optional_0_instrs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instrs,reduceinstrs_optional_0_instrs);
    metadata0star_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,null);
    metadata0expr_star_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr_star_4,null);
    metadata0id_metadata0reduceexpr_field_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceexpr_field_access);
    metadata0name_metadata0reduceexpr_var_access = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,reduceexpr_var_access);
    metadata0rpar_metadata0reduceexpr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_while);
    metadata0block_param_optional_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block_param_optional_7,null);
    metadata0name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0at_metadata0null,metadata0id_metadata0reduceexpr_field_access,metadata0minus_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0bang_metadata0null,metadata0value_metadata0reduceexpr_value,metadata0text_metadata0reducename_text,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0id_metadata0reducename_id,metadata0name_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_4_metadata0null,metadata0colon_metadata0null,metadata0expr_metadata0null,metadata0eol_metadata0reduceeoi_eol,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0null,metadata0instrs_metadata0reduceinstrs_rec,metadata0name_metadata0reduceexpr_var_access,metadata0instrs_metadata0reduceinstrs_optional_1_instrs,metadata0block_metadata0reduceblock_param_block,metadata0instrs_optional_1_metadata0reduceblock,metadata0pipe_metadata0null,metadata0id_metadata0reduceid_star_2_element,metadata0id_star_2_sub_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_star_2_rec,metadata0id_star_2_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0reduceblock_param_lambda,metadata0block_param_metadata0reduceblock_param_optional_5_block_param,metadata0block_param_optional_5_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0expr_metadata0null,metadata0expr_star_4_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_6_sub_metadata0null,metadata0comma_metadata0null,metadata0expr_metadata0null,metadata0expr_star_6_metadata0null,metadata0block_param_metadata0reduceblock_param_optional_7_block_param,metadata0block_param_optional_7_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_block,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0id_plus_3_metadata0null,metadata0comma_metadata0null,metadata0id_metadata0reduceid_plus_3_rec,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_lambda,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_while,metadata0expr_metadata0null,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0colon_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_ifelse,metadata0instrs_metadata0reduceinstrs_optional_0_instrs,metadata0instrs_optional_0_metadata0reducescript,metadata0script_metadata0null,metadata0__eof___metadata0null};
  }

  
  private int[] expr_star_4Gotoes;

  private void initexpr_star_4Gotoes() {
    expr_star_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,44,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{46,-1,94,-1,90,-1,-1,89,-1,88,80,-1,15,-1,-1,-1,17,-1,19,-1,21,-1,-1,-1,-1,26,-1,28,-1,30,-1,32,-1,34,-1,36,-1,38,-1,40,-1,42,-1,66,-1,46,-1,-1,-1,46,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,46,-1,-1,-1,-1,-1,-1,69,-1,-1,72,-1,-1,-1,-1,-1,46,-1,-1,-1,-1,-1,-1,-1,46,-1,-1,-1,-1,-1,46,-1,-1,-1,46,-1,-1,46,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,62,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,78,-1,-1,-1,-1,-1,-1,-1,86,-1,-1,-1,-1,-1,92,-1,-1,-1,96,-1,-1,99,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_7Gotoes;

  private void initblock_param_optional_7Gotoes() {
    block_param_optional_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_paramGotoes;

  private void initblock_paramGotoes() {
    block_paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2_subGotoes;

  private void initid_star_2_subGotoes() {
    id_star_2_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrsGotoes;

  private void initinstrsGotoes() {
    instrsGotoes = 
      new int[]{101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,52,-1,-1,-1,52,-1,-1,52,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_0Gotoes;

  private void initinstrs_optional_0Gotoes() {
    instrs_optional_0Gotoes = 
      new int[]{102,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_plus_3Gotoes;

  private void initid_plus_3Gotoes() {
    id_plus_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,82,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrs_optional_1Gotoes;

  private void initinstrs_optional_1Gotoes() {
    instrs_optional_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,54,-1,-1,-1,54,-1,-1,54,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6_subGotoes;

  private void initexpr_star_6_subGotoes() {
    expr_star_6_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] block_param_optional_5Gotoes;

  private void initblock_param_optional_5Gotoes() {
    block_param_optional_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_star_2Gotoes;

  private void initid_star_2Gotoes() {
    id_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,60,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{103,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6Gotoes;

  private void initexpr_star_6Gotoes() {
    expr_star_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_4_subGotoes;

  private void initexpr_star_4_subGotoes() {
    expr_star_4_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] nameGotoes;

  private void initnameGotoes() {
    nameGotoes = 
      new int[]{51,-1,51,-1,51,-1,-1,51,-1,51,51,-1,51,-1,-1,-1,51,-1,51,-1,51,-1,24,-1,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,51,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,51,-1,-1,51,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,51,-1,-1,-1,51,-1,-1,51,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] atArray;
  @SuppressWarnings("unchecked")
  private void initatArray() {
    atArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift5,branch0,shift5,branch0,shift5,branch0,branch0,shift5,branch0,shift5,shift5,branch0,shift5,branch0,branch0,branch0,shift5,branch0,shift5,branch0,shift5,branch0,branch0,branch0,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,shift5,branch0,reduceeoi_eol,reduceeoi_semi,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,shift5,branch0,branch0,branch0,shift5,branch0,branch0,shift5,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reduceid_plus_3_element,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,reduceexpr_star_6_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,reduceid_star_2_element,shift58,branch0,reduceid_star_2_rec,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,reduceexpr_star_4_element,shift68,branch0,reduceexpr_star_4_rec,shift71,branch0,reduceexpr_star_6_rec,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,shift83,branch0,reduceid_plus_3_rec,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,branch0,branch0,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,shift22,branch0,branch0,branch0,shift22,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift22,branch0,branch0,shift22,branch0,branch0,shift22,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift22,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift22,shift22,shift22,branch0,branch0,reduceexpr_while,shift22,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift12,branch0,shift12,branch0,shift12,branch0,branch0,shift12,branch0,shift12,shift12,branch0,shift12,branch0,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,branch0,branch0,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,shift12,branch0,reduceeoi_eol,reduceeoi_semi,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,shift12,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,shift77,reduceid_plus_3_element,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,reduceexpr_star_4_empty,shift45,branch0,reduceinstrs_expr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_expr_eoi,reduceinstrs_rec,reduceexpr_var_access,reduceinstrs_optional_1_instrs,branch0,reduceblock,reduceid_star_2_empty,reduceid_star_2_element,reduceid_star_2_through,branch0,reduceid_star_2_rec,shift61,branch0,branch0,branch0,branch0,reduceexpr_funcall,reduceexpr_star_4_element,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,shift45,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,shift85,branch0,reduceid_plus_3_rec,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,shift91,branch0,branch0,reduceexpr_while,shift95,reduceinstrs_optional_1_empty,shift98,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,branch0,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,reduceexpr_star_4_empty,shift55,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,reduceexpr_star_4_element,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,shift55,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,branch0,shift1,branch0,shift1,branch0,branch0,shift1,branch0,shift1,shift1,branch0,shift1,branch0,branch0,branch0,shift1,branch0,shift1,branch0,shift1,branch0,branch0,branch0,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,shift1,branch0,reduceeoi_eol,reduceeoi_semi,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,shift1,branch0,branch0,branch0,shift1,branch0,branch0,shift1,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift3,branch0,shift3,branch0,shift3,branch0,branch0,shift3,branch0,shift3,shift3,branch0,shift3,branch0,branch0,branch0,shift3,branch0,shift3,branch0,shift3,branch0,branch0,branch0,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,shift3,branch0,reduceeoi_eol,reduceeoi_semi,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,shift3,branch0,branch0,branch0,shift3,branch0,branch0,shift3,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,branch0,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift47,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,reduceexpr_star_6_empty,reduceexpr_star_6_element,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,reduceexpr_star_4_empty,reduceblock_param_optional_5_empty,reduceinstrs_optional_1_empty,reduceinstrs_expr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_expr_eoi,reduceinstrs_rec,reduceexpr_var_access,reduceinstrs_optional_1_instrs,reduceblock_param_block,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstrs_optional_1_empty,reduceblock_param_lambda,reduceblock_param_optional_5_block_param,shift65,reduceexpr_funcall,reduceexpr_star_4_element,reduceexpr_star_4_through,branch0,reduceexpr_star_4_rec,reduceexpr_star_6_through,branch0,reduceexpr_star_6_rec,reduceblock_param_optional_7_empty,reduceblock_param_optional_7_block_param,shift76,reduceexpr_mthcall,reduceinstrs_optional_1_empty,shift79,reduceexpr_block,shift81,reduceexpr_parens,branch0,branch0,branch0,reduceinstrs_optional_1_empty,shift87,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,reduceinstrs_optional_1_empty,shift93,reduceexpr_while,branch0,reduceinstrs_optional_1_empty,shift97,reduceexpr_if,reduceinstrs_optional_1_empty,shift100,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift7,branch0,shift7,branch0,shift7,branch0,reduceexpr_field_access,shift7,reducename_id,shift7,shift7,reducename_id,shift7,reduceexpr_value,reducename_text,reduceexpr_unary_not,shift7,shift33,shift7,reduceexpr_binary_div,shift7,reduceexpr_binary_mod,branch0,branch0,branch0,shift7,shift33,shift7,reduceexpr_binary_add,shift7,shift33,shift7,shift33,shift7,reduceexpr_binary_sub,shift7,reduceexpr_binary_mul,shift7,shift33,shift7,shift33,shift7,shift33,shift7,branch0,shift7,shift33,reduceeoi_eol,reduceeoi_semi,shift7,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift7,branch0,branch0,branch0,reduceexpr_funcall,shift33,branch0,shift7,shift33,branch0,shift7,shift33,branch0,branch0,branch0,reduceexpr_mthcall,shift7,branch0,reduceexpr_block,shift33,reduceexpr_parens,branch0,branch0,branch0,shift7,branch0,reduceexpr_lambda,shift33,reduceexpr_unary_neg,shift33,shift7,branch0,reduceexpr_while,shift33,shift7,branch0,reduceexpr_if,shift7,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,shift35,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,shift35,branch0,reduceexpr_binary_mul,branch0,shift35,branch0,shift35,branch0,shift35,branch0,branch0,branch0,shift35,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift35,branch0,branch0,shift35,branch0,branch0,shift35,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift35,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift35,reduceexpr_unary_neg,shift35,branch0,branch0,reduceexpr_while,shift35,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift37,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift37,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift37,branch0,branch0,shift37,branch0,branch0,shift37,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift37,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift37,reduceexpr_unary_neg,shift37,branch0,branch0,reduceexpr_while,shift37,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift39,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift39,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift39,branch0,branch0,shift39,branch0,branch0,shift39,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift39,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift39,reduceexpr_unary_neg,shift39,branch0,branch0,reduceexpr_while,shift39,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] valueArray;
  @SuppressWarnings("unchecked")
  private void initvalueArray() {
    valueArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift13,branch0,shift13,branch0,shift13,branch0,branch0,shift13,branch0,shift13,shift13,branch0,shift13,branch0,branch0,branch0,shift13,branch0,shift13,branch0,shift13,branch0,branch0,branch0,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,shift13,branch0,reduceeoi_eol,reduceeoi_semi,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,shift13,branch0,branch0,branch0,shift13,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift10,shift2,shift10,shift4,shift10,branch0,reduceexpr_field_access,shift10,reducename_id,shift10,shift10,reducename_id,shift10,reduceexpr_value,reducename_text,shift43,shift10,shift43,shift10,shift43,shift10,shift43,branch0,reducename_id,shift25,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,shift43,shift10,branch0,shift10,shift43,reduceeoi_eol,reduceeoi_semi,shift10,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,reduceexpr_funcall,shift43,branch0,shift10,shift43,branch0,shift10,shift43,branch0,branch0,branch0,reduceexpr_mthcall,shift10,branch0,reduceexpr_block,shift43,reduceexpr_parens,branch0,branch0,branch0,shift10,branch0,reduceexpr_lambda,shift43,shift43,shift43,shift10,branch0,reduceexpr_while,shift43,shift10,branch0,reduceexpr_if,shift10,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift16,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift16,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift16,branch0,branch0,shift16,branch0,branch0,shift16,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift16,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift16,reduceexpr_unary_neg,shift16,branch0,branch0,reduceexpr_while,shift16,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,shift18,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,shift18,branch0,reduceexpr_binary_mul,branch0,shift18,branch0,shift18,branch0,shift18,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift18,branch0,branch0,shift18,branch0,branch0,shift18,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift18,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift18,reduceexpr_unary_neg,shift18,branch0,branch0,reduceexpr_while,shift18,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,shift20,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,shift20,branch0,reduceexpr_binary_mul,branch0,shift20,branch0,shift20,branch0,shift20,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift20,branch0,branch0,shift20,branch0,branch0,shift20,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift20,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift20,reduceexpr_unary_neg,shift20,branch0,branch0,reduceexpr_while,shift20,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,branch0,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,reduceinstrs_expr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_expr_eoi,reduceinstrs_rec,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,reduceinstrs_optional_0_instrs,reducescript,accept,accept};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,shift27,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift27,branch0,reduceexpr_binary_add,branch0,shift27,branch0,shift27,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,shift27,branch0,shift27,branch0,shift27,branch0,branch0,branch0,shift27,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift27,branch0,branch0,shift27,branch0,branch0,shift27,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift27,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift27,reduceexpr_unary_neg,shift27,branch0,branch0,reduceexpr_while,shift27,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift29,branch0,branch0,shift29,branch0,branch0,shift29,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift29,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift29,reduceexpr_unary_neg,shift29,branch0,branch0,reduceexpr_while,shift29,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift8,branch0,shift8,branch0,shift8,shift6,branch0,shift8,branch0,shift8,shift11,branch0,shift8,branch0,branch0,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift23,branch0,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,shift8,branch0,reduceeoi_eol,reduceeoi_semi,shift8,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,shift59,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift84,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift31,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift31,branch0,branch0,shift31,branch0,branch0,shift31,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift31,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift31,reduceexpr_unary_neg,shift31,branch0,branch0,reduceexpr_while,shift31,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift14,branch0,shift14,branch0,shift14,branch0,branch0,shift14,branch0,shift14,shift14,branch0,shift14,branch0,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,shift14,branch0,reduceeoi_eol,reduceeoi_semi,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,shift14,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,reducename_id,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,shift41,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift41,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,shift41,branch0,branch0,shift41,branch0,branch0,shift41,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,shift41,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,shift41,reduceexpr_unary_neg,shift41,branch0,branch0,reduceexpr_while,shift41,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_field_access,branch0,reducename_id,branch0,branch0,branch0,branch0,reduceexpr_value,reducename_text,reduceexpr_unary_not,branch0,reduceexpr_binary_ne,branch0,reduceexpr_binary_div,branch0,reduceexpr_binary_mod,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_binary_add,branch0,reduceexpr_binary_gt,branch0,reduceexpr_binary_ge,branch0,reduceexpr_binary_sub,branch0,reduceexpr_binary_mul,branch0,reduceexpr_binary_lt,branch0,reduceexpr_binary_le,branch0,reduceexpr_binary_eq,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,reduceexpr_var_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_block,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,branch0,branch0,branch0,reduceexpr_while,branch0,branch0,branch0,reduceexpr_if,branch0,branch0,reduceexpr_ifelse,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceinstrs_optional_0_empty,error0,error0,error0,error0,error0,reduceexpr_field_access,error0,reducename_id,error0,error0,error0,error0,reduceexpr_value,reducename_text,reduceexpr_unary_not,error0,reduceexpr_binary_ne,error0,reduceexpr_binary_div,error0,reduceexpr_binary_mod,error0,error0,error0,error0,error0,error0,reduceexpr_binary_add,error0,reduceexpr_binary_gt,error0,reduceexpr_binary_ge,error0,reduceexpr_binary_sub,error0,reduceexpr_binary_mul,error0,reduceexpr_binary_lt,error0,reduceexpr_binary_le,error0,reduceexpr_binary_eq,error0,error0,error0,reduceinstrs_expr,reduceeoi_eol,reduceeoi_semi,reduceinstrs_expr_eoi,reduceinstrs_rec,reduceexpr_var_access,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_mthcall,error0,error0,reduceexpr_block,error0,reduceexpr_parens,error0,error0,error0,error0,error0,reduceexpr_lambda,reduceexpr_var_assignment,reduceexpr_unary_neg,error0,error0,error0,reduceexpr_while,error0,error0,error0,reduceexpr_if,error0,error0,reduceexpr_ifelse,reduceinstrs_optional_0_instrs,reducescript,exit,exit};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_assignment;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_eol;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_neg;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_1_instrs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mod;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_field_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_var_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_5_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_expr_eoi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_plus_3_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_through;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_block;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_unary_not;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_6_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_value;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ifelse;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_binary_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_star_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_param_optional_7_block_param;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstrs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_star_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceid_plus_3_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_while;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift84;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift77;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift93;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift83;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift98;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift79;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift91;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift59;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift68;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift81;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift48;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift76;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift100;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_ifelse;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0value_metadata0reduceexpr_value;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_7_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0at_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_plus_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0reduceblock_param_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_plus_3_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceid_star_2_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0bang_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reducename_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceeoi_eol;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mod_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducename_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_1_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_star_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_0_metadata0reducescript;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_block;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_optional_1_metadata0reduceblock;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_metadata0reduceblock_param_optional_5_block_param;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instrs_metadata0reduceinstrs_optional_0_instrs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_star_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceexpr_field_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0reduceexpr_var_access;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_param_optional_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
}
