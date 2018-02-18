package com.中文编程.圈5.主程序;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.中文编程.圈5.分析器.圈5Lexer;
import com.中文编程.圈5.分析器.圈5Parser;
import com.中文编程.圈5.分析器.定制访问器;
import com.中文编程.圈5.语法树.变量节点;
import com.中文编程.圈5.语法树.数节点;
import com.中文编程.圈5.语法树.条件节点;
import com.中文编程.圈5.语法树.节点;
import com.中文编程.圈5.语法树.运算式节点;
import com.中文编程.圈5.语法树.运算符号;
import com.中文编程.圈5.错误处理.词法错误监听器;
import com.中文编程.圈5.错误处理.语法错误监听器;

public class 运行器 {
  private static final 语法错误监听器 语法错误处理 = new 语法错误监听器();
  private static final 词法错误监听器 词法错误处理 = new 词法错误监听器();

  private Map<String, Object> 变量值表 = new HashMap<>();
  private Object 返回值;

  public static void main(String[] 参数) {
    CharStream 输入流;
    try {
      输入流 = CharStreams.fromFileName(参数[0]);
    } catch (IOException e) {
      System.out.println(参数[0] + "文件打开出错");
      return;
    }

    节点 语法树 = 语法分析(输入流);

    运行器 运行器实例 = new 运行器();
    if (语法树 != null) {
      System.out.println(运行器实例.求值(语法树));
    }
  }

  public Object 求值(节点 节点) {
    if (节点 instanceof 运算式节点) {
      运算符号 运算符 = ((运算式节点)节点).运算符;
      Object 左结果 = 求值(((运算式节点)节点).左子节点);
      Object 右结果 = 求值(((运算式节点)节点).右子节点);
      switch(运算符) {
        case 加: return (int)左结果 + (int)右结果;
        case 減: return (int)左结果 - (int)右结果;
        case 乘: return (int)左结果 * (int)右结果;
        case 除: return (int)左结果 / (int)右结果;
        case 相等: return 左结果 == 右结果;
        case 不等: return 左结果 != 右结果;
        case 大于: return (int)左结果 > (int)右结果;
        case 小于: return (int)左结果 < (int)右结果;
        case 大于等于: return (int)左结果 >= (int)右结果;
        case 小于等于: return (int)左结果 <= (int)右结果;
        case 赋值:
          变量值表.put(((变量节点)((运算式节点)节点).左子节点).取变量名(), 右结果);
          // 顺延
        default:
          return null;
      }
    } else if (节点 instanceof 变量节点) {
      return 变量值表.get(((变量节点)节点).取变量名());
    } else if (节点 instanceof 数节点) {
      return ((数节点)节点).求值();
    } else if (节点 instanceof 条件节点) {
      Object 条件 = 求值(((条件节点) 节点).条件);
      if (条件 instanceof Boolean) {
        return (boolean)条件 ? 求值(((条件节点) 节点).条件为真分支) : null;
      } else {
        System.err.println("[运行时错误] 条件部分需为布尔值: " + ((条件节点) 节点).条件.原始文本);
        return null;
      }
    } else {
      for(节点 子节点 : 节点.子节点) {
        返回值 = 求值(子节点);
      }
      return 返回值;
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
