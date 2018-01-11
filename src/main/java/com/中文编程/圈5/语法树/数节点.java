package com.中文编程.圈5.语法树;

public class 数节点 extends 节点 {

  int 值 = 0;
  
  public 数节点(String 文本) {
    super(文本);
    值 = Integer.parseInt(文本);
  }

  @Override
  public Object 求值() {
    return 值;
  }
  
}
