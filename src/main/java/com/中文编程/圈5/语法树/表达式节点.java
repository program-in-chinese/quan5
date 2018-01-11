package com.中文编程.圈5.语法树;

public class 表达式节点 extends 节点 {

  public String 运算符;

  @Override
  public Object 求值() {
    if (运算符.equals("+")) {
      return (int)(左子节点.求值()) + ((int)右子节点.求值());
    } else {
      return null;
    }
  }

}
