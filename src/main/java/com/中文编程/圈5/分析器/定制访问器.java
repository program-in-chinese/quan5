package com.中文编程.圈5.分析器;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.中文编程.圈5.分析器.圈5Parser.声明Context;
import com.中文编程.圈5.分析器.圈5Parser.字面量Context;
import com.中文编程.圈5.分析器.圈5Parser.最小表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.比较表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.求值Context;
import com.中文编程.圈5.分析器.圈5Parser.求和表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.求积表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.程序Context;
import com.中文编程.圈5.分析器.圈5Parser.等同判断表达式Context;
import com.中文编程.圈5.分析器.圈5Parser.表达式Context;
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
  public 节点 visit表达式(表达式Context 上下文) {
    return visit(上下文.等同判断表达式());
  }

  @Override
  public 节点 visit等同判断表达式(等同判断表达式Context 上下文) {
    return 以本身向右扩展为运算节点(上下文, 上下文.等同判断表达式(), 上下文.比较表达式());
  }

  @Override
  public 节点 visit比较表达式(比较表达式Context 上下文) {
    return 以本身向右扩展为运算节点(上下文, 上下文.比较表达式(), 上下文.求和表达式());
  }

  @Override
  public 节点 visit求和表达式(求和表达式Context 上下文) {
    return 以本身向右扩展为运算节点(上下文, 上下文.求和表达式(), 上下文.求积表达式());
  }

  @Override
  public 节点 visit求积表达式(求积表达式Context 上下文) {
    return 以本身向右扩展为运算节点(上下文, 上下文.求积表达式(), 上下文.最小表达式());
  }

  @Override
  public 节点 visit最小表达式(最小表达式Context 上下文) {
    return 上下文.字面量() != null ? visit(上下文.字面量()) : visit(上下文.表达式());
  }

  @Override
  public 节点 visit字面量(字面量Context 上下文) {
    TerminalNodeImpl 子节点 = (TerminalNodeImpl) (上下文.getChild(0));
    return 子节点 instanceof ErrorNode
        ? null
        : 子节点.symbol.getType() == 圈5Parser.T数 ? new 数节点(子节点.getText()) : new 变量节点(子节点.getText());
  }

  private 节点 以本身向右扩展为运算节点(ParserRuleContext 上下文, ParserRuleContext 本身子节点, ParserRuleContext 扩展子节点) {
    节点 比较节点 = visit(扩展子节点);
    if (本身子节点 == null) {
      return 比较节点;
    } else {
      return 构建运算节点(取运算符(上下文), 本身子节点, 比较节点);
    }
  }

  // 第二个子节点为运算符
  private 运算符号 取运算符(ParserRuleContext 原始表达式) {
    int 最后运算符 = ((TerminalNodeImpl) 原始表达式.getChild(1)).symbol.getType();
    switch (最后运算符) {
      case 圈5Parser.T加:
        return 运算符号.加;
      case 圈5Parser.T減: 
        return 运算符号.減;
      case 圈5Parser.T乘:
      case 圈5Parser.T数乘:
        return 运算符号.乘;
      case 圈5Parser.T除:
      case 圈5Parser.T数除:
        return 运算符号.除;
      case 圈5Parser.T相等:
      case 圈5Parser.T为:
        return 运算符号.相等;
      case 圈5Parser.T不等:
      case 圈5Parser.T数不等:
        return 运算符号.不等;
      case 圈5Parser.T大于:
        return 运算符号.大于;
      case 圈5Parser.T小于:
        return 运算符号.小于;
      case 圈5Parser.T小于等于:
      case 圈5Parser.T数小于等于:
        return 运算符号.小于等于;
      case 圈5Parser.T大于等于:
      case 圈5Parser.T数大于等于:
        return 运算符号.大于等于;
      default:
        return null;
    }
  }

  private 节点 构建运算节点(运算符号 运算符, ParserRuleContext 原始左节点, 节点 右节点) {
    运算式节点 节点 = new 运算式节点();
    节点.运算符 = 运算符;
    节点.左子节点 = visit(原始左节点);
    节点.右子节点 = 右节点;
    return 节点;
  }
}
