package com.中文编程.圈5.分析器;

import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.中文编程.圈5.分析器.圈5Parser.变量Context;
import com.中文编程.圈5.分析器.圈5Parser.声明Context;
import com.中文编程.圈5.分析器.圈5Parser.括号Context;
import com.中文编程.圈5.分析器.圈5Parser.数Context;
import com.中文编程.圈5.分析器.圈5Parser.求值Context;
import com.中文编程.圈5.分析器.圈5Parser.求积表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.程序Context;
import com.中文编程.圈5.分析器.圈5Parser.算术表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.赋值Context;
import com.中文编程.圈5.语法树.变量节点;
import com.中文编程.圈5.语法树.数节点;
import com.中文编程.圈5.语法树.节点;
import com.中文编程.圈5.语法树.运算式节点;
import com.中文编程.圈5.语法树.运算符号;

public class 定制访问器 extends 圈5BaseVisitor<节点> {

  @Override
  public 节点 visit程序(程序Context 上下文) {
    节点 根节点 = new 节点();
    for (声明Context 声明 : 上下文.声明()) {
      根节点.子节点.add(visit(声明));
    }
    return 根节点;
  }

  // 以下为声明部分

  @Override
  public 节点 visit赋值(赋值Context 上下文) {
    String 变量名 = 上下文.T变量名().getText();
    运算式节点 节点 = new 运算式节点();
    节点.运算符 = 运算符号.赋值;
    节点.左子节点 = new 变量节点(变量名);
    节点.右子节点 = visit(上下文.表达式());
    return 节点;
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
    return new 变量节点(变量名);
  }

  @Override
  public 节点 visit数(数Context 上下文) {
    TerminalNode 数 = 上下文.T数();
    return 数 instanceof ErrorNode ? null : new 数节点(数.getText());
  }
/*
  @Override
  public 二元表达式节点 visit加減(加減Context 上下文) {
    
  }

  @Override
  public 二元表达式节点 visit乘除(乘除Context 上下文) {
    运算式节点 节点 = new 运算式节点();
    int 运算符 = 上下文.运算符.getType();
    节点.运算符 = (运算符 == 圈5Parser.T乘 || 运算符 == 圈5Parser.T数乘) ? 运算符号.乘 : 运算符号.除;
    节点.左子节点 = visit(上下文.表达式(0));
    节点.右子节点 = visit(上下文.表达式(1));
    return 节点;
  }
*/
  @Override
  public 节点 visit算术表达式(算术表达式Context 上下文) {
    return 构建二叉树(上下文.children);
    
    /*节点.运算符 = 上下文.运算符.getType() == 圈5Parser.T加 ? 运算符号.加 : 运算符号.減;
    节点.左子节点 = visit(上下文.(0));
    节点.右子节点 = visit(上下文.表达式(1));*/
  }

  // 求积表达式 (+/- 求积表达式) ...
  private 节点 构建二叉树(List<ParseTree> 子节点) {
    if (子节点.isEmpty()) {
      return null;
    } else if (子节点.size() == 1) {
      return visit(子节点.get(0));
    } else {
      ParseTree 最后运算符节点 = 子节点.get(子节点.size() - 2);
      运算符号 运算符 = ((TerminalNodeImpl)最后运算符节点).symbol.getType() == 圈5Parser.T加 ? 运算符号.加 : 运算符号.減;
      运算式节点 节点 = new 运算式节点();
      节点.运算符 = 运算符;
      节点.左子节点 = 构建二叉树(子节点.subList(0, 子节点.size() - 2));
      节点.右子节点 = visit(子节点.get(子节点.size() - 1));
      return 节点;
    }
  }
  // 数 (*// 数) ...
  private 节点 构建求积二叉树(List<ParseTree> 子节点) {
    if (子节点.isEmpty()) {
      return null;
    } else if (子节点.size() == 1) {
      return 构建数节点(子节点.get(0));
    } else {
      ParseTree 最后运算符节点 = 子节点.get(子节点.size() - 2);
      int 最后运算符 = ((TerminalNodeImpl)最后运算符节点).symbol.getType();
      运算符号 运算符 = (最后运算符 == 圈5Parser.T乘 || 最后运算符 == 圈5Parser.T数乘) ? 运算符号.乘 : 运算符号.除;
      运算式节点 节点 = new 运算式节点();
      节点.运算符 = 运算符;
      节点.左子节点 = 构建求积二叉树(子节点.subList(0, 子节点.size() - 2));
      节点.右子节点 = 构建数节点(子节点.get(子节点.size() - 1));
      return 节点;
    }
  }

  private 数节点 构建数节点(ParseTree 原始节点) {
    TerminalNode 数 = (TerminalNode)原始节点;
    return 数 instanceof ErrorNode ? null : new 数节点(数.getText());
  }
  @Override
  public 节点 visit求积表达式(求积表达式Context 上下文) {
    return 构建求积二叉树(上下文.children);
  }

  @Override
  public 节点 visit括号(括号Context 上下文) {
    return visit(上下文.表达式());
  }

}
