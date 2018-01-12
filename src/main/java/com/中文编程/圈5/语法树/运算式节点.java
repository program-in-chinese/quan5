package com.中文编程.圈5.语法树;

public class 运算式节点 extends 二元表达式节点 {

  public 运算符号 运算符;

  @Override
  public Object 求值() {
    if (运算符.equals(运算符号.加)) {
      return (int)(左子节点.求值()) + ((int)右子节点.求值());
    } else if (运算符.equals(运算符号.減)) {
      return (int)(左子节点.求值()) - ((int)右子节点.求值());
    } else if (运算符.equals(运算符号.乘)) {
      return (int)(左子节点.求值()) * ((int)右子节点.求值());
    } else if (运算符.equals(运算符号.除)) {
      return (int)(左子节点.求值()) / ((int)右子节点.求值());
    } else {
      return null;
    }
  }

}
