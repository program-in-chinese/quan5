package com.中文编程.圈5.分析器;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.中文编程.圈5.分析器.圈5Parser.程序Context;
import com.中文编程.圈5.语法树.节点;

public class 定制访问器 extends 圈5BaseVisitor<节点> {

  @Override
  public 节点 visit程序(程序Context 上下文) {
    TerminalNode 解析节点 = 上下文.T数();
    return 解析节点 instanceof ErrorNode ? null : new 节点(解析节点.getText());
  }

}
