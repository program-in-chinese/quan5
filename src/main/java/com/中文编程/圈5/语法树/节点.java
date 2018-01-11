package com.中文编程.圈5.语法树;

public class 节点 {

  public String 原始文本;
  public 节点 左子节点;
  public 节点 右子节点;

  public 节点() {}

  public 节点(String 文本) {
    原始文本 = 文本;
  }
  
  public Object 求值() {
    return 原始文本;
  }
}
