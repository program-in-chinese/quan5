package quan5;

import static com.github.program_in_chinese.junit4_in_chinese.断言.相等;

import org.junit.Test;

import com.中文编程.圈5.主程序.运行器;

public class 运行器测试 {

  @Test
  public void 四则运算() {
    检验源码求值("01", 1);
    检验源码求值("1+1", 2);
    检验源码求值("1+2+3+4", 10);
    检验源码求值("6*2", 12);
    检验源码求值("5-2", 3);
    检验源码求值("8/2", 4);
    检验源码求值("8/5", 1);
    检验源码求值("1-2+3-4", -2);
    检验源码求值("3*2+8/4-2*4", 0);
    检验源码求值("3×2+8÷4-2×4", 0);
  }

  private void 检验源码求值(String 源码, Object 值) {
    相等(运行器.语法分析(源码).求值(), 值);
  }
}
