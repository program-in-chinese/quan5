package com.中文编程.圈5.分析器;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.中文编程.圈5.分析器.圈5Parser.乘除Context;
import com.中文编程.圈5.分析器.圈5Parser.加減Context;
import com.中文编程.圈5.分析器.圈5Parser.变量Context;
import com.中文编程.圈5.分析器.圈5Parser.括号Context;
import com.中文编程.圈5.分析器.圈5Parser.数Context;
import com.中文编程.圈5.分析器.圈5Parser.求值Context;
import com.中文编程.圈5.分析器.圈5Parser.赋值Context;
import com.中文编程.圈5.语法树.数节点;
import com.中文编程.圈5.语法树.节点;
import com.中文编程.圈5.语法树.表达式节点;
import com.中文编程.圈5.语法树.运算符号;

public class 定制访问器 extends 圈5BaseVisitor<节点> {

  private static Map<String, 节点> 变量值表 = new HashMap<>();

  // 以下为声明部分

  @Override
  public 节点 visit赋值(赋值Context 上下文) {
    String 变量名 = 上下文.T变量名().getText();
    变量值表.put(变量名, visit(上下文.表达式()));
    return null;
  }

  @Override
  public 节点 visit求值(求值Context 上下文) {
    return visit(上下文.表达式());
  }

  // 以下为表达式部分

  @Override
  public 节点 visit变量(变量Context 上下文) {
    String 变量名 = 上下文.T变量名().getText();
    
    // TODO: 添加变量检查
    return 变量值表.get(变量名);
  }

  @Override
  public 节点 visit数(数Context 上下文) {
    TerminalNode 数 = 上下文.T数();
    return 数 instanceof ErrorNode ? null : new 数节点(数.getText());
  }

  @Override
  public 节点 visit加減(加減Context 上下文) {
    表达式节点 节点 = new 表达式节点();
    节点.运算符 = 上下文.运算符.getType() == 圈5Parser.T加 ? 运算符号.加 : 运算符号.減;
    节点.左子节点 = visit(上下文.表达式(0));
    节点.右子节点 = visit(上下文.表达式(1));
    return 节点;
  }

  @Override
  public 节点 visit乘除(乘除Context 上下文) {
    表达式节点 节点 = new 表达式节点();
    int 运算符 = 上下文.运算符.getType();
    节点.运算符 = (运算符 == 圈5Parser.T乘 || 运算符 == 圈5Parser.T数乘) ? 运算符号.乘 : 运算符号.除;
    节点.左子节点 = visit(上下文.表达式(0));
    节点.右子节点 = visit(上下文.表达式(1));
    return 节点;
  }

  @Override
  public 节点 visit括号(括号Context 上下文) {
    return visit(上下文.表达式());
  }

}
