package com.github.forax.smartass.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.github.forax.smartass.grammar.lexer.RuleEnum;
import com.github.forax.smartass.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.plus,RuleEnum.assign,RuleEnum.comment,RuleEnum.mod,RuleEnum.text,RuleEnum.id,RuleEnum._while,RuleEnum._if,RuleEnum.at,RuleEnum.doc,RuleEnum.value,RuleEnum.bang,RuleEnum.lpar,RuleEnum.colon,RuleEnum._return,RuleEnum.minus,RuleEnum.dot,RuleEnum.eq,RuleEnum.gt,RuleEnum.rcurl,RuleEnum.slash,RuleEnum.rpar,RuleEnum.ropt,RuleEnum.ne,RuleEnum.pipe,RuleEnum.ge,RuleEnum.eol,RuleEnum._throw,RuleEnum.sharp,RuleEnum.lt,RuleEnum.le,RuleEnum.semicolon,RuleEnum.comma,RuleEnum.lcurl,RuleEnum.star,RuleEnum.lopt);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.mod,TerminalEnum.mod);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.at,TerminalEnum.at);
              terminal.put(RuleEnum.doc,TerminalEnum.doc);
              terminal.put(RuleEnum.value,TerminalEnum.value);
              terminal.put(RuleEnum.bang,TerminalEnum.bang);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum._throw,TerminalEnum._throw);
              terminal.put(RuleEnum.sharp,TerminalEnum.sharp);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}