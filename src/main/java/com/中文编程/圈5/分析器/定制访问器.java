package com.中文编程.圈5.分析器;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.中文编程.圈5.分析器.圈5Parser.加減Context;
import com.中文编程.圈5.分析器.圈5Parser.数Context;
import com.中文编程.圈5.语法树.数节点;
import com.中文编程.圈5.语法树.节点;
import com.中文编程.圈5.语法树.表达式节点;

public class 定制访问器 extends 圈5BaseVisitor<节点> {

  @Override
  public 节点 visit数(数Context 上下文) {
    TerminalNode 数 = 上下文.T数();
    return 数 instanceof ErrorNode ? null : new 数节点(数.getText());
  }

  @Override
  public 节点 visit加減(加減Context 上下文) {
    表达式节点 节点 = new 表达式节点();
    节点.运算符 = 上下文.运算符.getType() == 圈5Parser.T加 ? "+" : "-";
    节点.左子节点 = visit(上下文.表达式(0));
    节点.右子节点 = visit(上下文.表达式(1));
    return 节点;
  }

}
