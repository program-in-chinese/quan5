package com.中文编程.圈5.错误处理;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;

public class 词法错误监听器 extends BaseErrorListener {

  @Override
  public void syntaxError(Recognizer<?, ?> 识别器, Object 问题符号, int 行, int 字符在行中位置, String 信息,
      RecognitionException 例外) {
    Lexer 词法分析器 = (Lexer)识别器;
    
    // 摘自org.antlr.v4.runtime.Lexer.notifyListeners
    String 文本 = 词法分析器._input.getText(Interval.of(词法分析器._tokenStartCharIndex, 词法分析器._input.index()));
    String 错词 = 词法分析器.getErrorDisplay(文本);

    System.err.println("[词法错误] 行" + 行 + "列" + 字符在行中位置 + "错误词: " + 错词);
  }

}
