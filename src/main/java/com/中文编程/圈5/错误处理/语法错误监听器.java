package com.中文编程.圈5.错误处理;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class 语法错误监听器 extends BaseErrorListener {

  @Override
  public void syntaxError(Recognizer<?, ?> 识别器, Object 问题符号, int 行, int 字符在行中位置, String 信息,
      RecognitionException 例外) {
    List<String> 规则栈 = ((Parser) 识别器).getRuleInvocationStack();
    Collections.reverse(规则栈);
    System.err.println("[语法错误] 规则栈: " + 规则栈);
    System.err.println("行" + 行 + "列" + 字符在行中位置 + "非法符号: " + 问题符号 + ". 原始原因:" + 信息);
  }

}
