package com.中文编程.圈5.语法树;

import java.util.ArrayList;
import java.util.List;

public class 节点 {

  public String 原始文本;
  public List<节点> 子节点 = new ArrayList<>();
  
  public 节点() {}

  public 节点(String 文本) {
    原始文本 = 文本;
  }

}
