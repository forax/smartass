package com.github.forax.smartass.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.forax.smartass.grammar.lexer.RuleEnum;
import com.github.forax.smartass.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.lt,RuleEnum.lpar,RuleEnum.le,RuleEnum.slash,RuleEnum.gt,RuleEnum.comment,RuleEnum.colon,RuleEnum.minus,RuleEnum.bang,RuleEnum.assign,RuleEnum.star,RuleEnum.eol,RuleEnum.at,RuleEnum.rpar,RuleEnum.value,RuleEnum.semicolon,RuleEnum.rcurl,RuleEnum.id,RuleEnum.pipe,RuleEnum._while,RuleEnum.dot,RuleEnum._if,RuleEnum.comma,RuleEnum.lopt,RuleEnum.text,RuleEnum.eq,RuleEnum.ropt,RuleEnum.mod,RuleEnum.ge,RuleEnum.lcurl,RuleEnum.ne,RuleEnum.plus);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.value,TerminalEnum.value);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}