package com.中文编程.圈5.语法树;

public class 变量节点 extends 节点 {

  public 变量节点(String 名称) {
    super(名称);
  }
  
  public String 取变量名() {
    return 原始文本;
  }
}
