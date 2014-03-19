package com.github.forax.smartass.rt;

class Utils {
  static String mangle(String text) {
    StringBuilder builder = null;  // lazy alloc
    for(int i=0; i<text.length(); i++) {
      char c = text.charAt(i);
      switch(c) {//     /2  %10
      case '\\': // 92  46    6
      case '.':  // 46  23    3   
      case '$':  // 36  18    8 
      case '<':  // 60  30    0
      case '>':  // 62  31    1
      case '[':  // 91  45    5
      case ';':  // 59  29    9
      case '"':  // 34  17    7   // escape symbol
        char replacement = (char)('0' + (c >>> 1) % 10);
        if (builder == null) {
          builder = new StringBuilder(text.length() + 20);
          builder.append(text, 0, i);
        }
        builder.append('"').append(replacement);
        continue;
      default:
        if (builder != null) {
          builder.append(c);
        }
      }
    }
    if (builder == null) {
      return text;
    }
    return builder.toString();
  }
  
  private static final char[] DECODED = {
    '<', '>', '?', '.', '?', '[', '\\', '"', '$', ';' };
  
  static String unmangle(String text) {
    StringBuilder builder = null;  // lazy alloc
    for(int i=0; i<text.length(); i++) {
      char c = text.charAt(i);
      if (c == '"') {  // escape symbol
        char replacement = DECODED[text.charAt(++i) - '0'];
        if (builder == null) {
          builder = new StringBuilder(text.length() + 20);
          builder.append(text, 0, i - 1);
        }
        builder.append(replacement);
        continue;
      }
      if (builder != null) {
        builder.append(c);
      }
    }
    if (builder == null) {
      return text;
    }
    return builder.toString();
  }
}
