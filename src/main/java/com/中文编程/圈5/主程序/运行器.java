package com.中文编程.圈5.主程序;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.中文编程.圈5.分析器.圈5Lexer;
import com.中文编程.圈5.分析器.圈5Parser;
import com.中文编程.圈5.分析器.定制访问器;
import com.中文编程.圈5.语法树.节点;
import com.中文编程.圈5.错误处理.词法错误监听器;
import com.中文编程.圈5.错误处理.语法错误监听器;

public class 运行器 {
  private static final 语法错误监听器 语法错误处理 = new 语法错误监听器();
  private static final 词法错误监听器 词法错误处理 = new 词法错误监听器();

  public static void main(String[] 参数) {
    CharStream 输入流;
    try {
      输入流 = CharStreams.fromFileName(参数[0]);
    } catch (IOException e) {
      System.out.println(参数[0] + "文件打开出错");
      return;
    }

    节点 语法树 = 语法分析(输入流);
    if (语法树 != null) {
      System.out.println(语法树.求值());
    }
  }

  public static 节点 语法分析(String 源码文本) {
    return 语法分析(CharStreams.fromString(源码文本));
  }

  public static 节点 语法分析(CharStream 源码输入流) {
    圈5Lexer 词法分析器 = new 圈5Lexer(源码输入流);
    词法分析器.removeErrorListeners();
    词法分析器.addErrorListener(词法错误处理);
    圈5Parser 语法分析器 = new 圈5Parser(new CommonTokenStream(词法分析器));
    语法分析器.removeErrorListeners();
    语法分析器.addErrorListener(语法错误处理);

    定制访问器 访问器 = new 定制访问器();
    return 访问器.visit(语法分析器.程序());
  }
}
