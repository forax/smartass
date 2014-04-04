package com.github.forax.smartass.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.forax.smartass.grammar.lexer.RuleEnum;
import com.github.forax.smartass.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.minus,RuleEnum.gt,RuleEnum.ge,RuleEnum.lpar,RuleEnum.rcurl,RuleEnum.dot,RuleEnum.lopt,RuleEnum.lcurl,RuleEnum.at,RuleEnum._return,RuleEnum.comment,RuleEnum.plus,RuleEnum.le,RuleEnum._throw,RuleEnum.mod,RuleEnum.ropt,RuleEnum.value,RuleEnum.id,RuleEnum.sharp,RuleEnum.ne,RuleEnum._while,RuleEnum.comma,RuleEnum.rpar,RuleEnum.semicolon,RuleEnum.assign,RuleEnum.pipe,RuleEnum._if,RuleEnum.bang,RuleEnum.star,RuleEnum.colon,RuleEnum.eol,RuleEnum.doc,RuleEnum.text,RuleEnum.lt,RuleEnum.eq,RuleEnum.slash);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum._throw,TerminalEnum._throw);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.value,TerminalEnum.value);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.sharp,TerminalEnum.sharp);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.doc,TerminalEnum.doc);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}