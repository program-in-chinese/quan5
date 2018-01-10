package com.中文编程.圈5.主程序;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.中文编程.圈5.分析器.圈5Lexer;
import com.中文编程.圈5.分析器.圈5Parser;
import com.中文编程.圈5.分析器.定制访问器;
import com.中文编程.圈5.语法树.节点;

public class 运行器 {
  public static void main(String[] 参数) {
    try {
      CharStream 输入 = CharStreams.fromFileName(参数[0]);

      圈5Lexer 词法分析器 = new 圈5Lexer(输入);
      圈5Parser 语法分析器 = new 圈5Parser(new CommonTokenStream(词法分析器));

      定制访问器 访问器 = new 定制访问器();
      节点 语法树 = 访问器.visit(语法分析器.程序());
      System.out.println(语法树.get原始文本());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
