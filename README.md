相关知乎专栏文章:
- [Antlr4的分析错误处理](https://zhuanlan.zhihu.com/p/32792684)
- [Antlr4实现数学四则运算](https://zhuanlan.zhihu.com/p/32864261)
- [Antlr4添加中文变量赋求值,括号,各种问题](https://zhuanlan.zhihu.com/p/32896571)
- [Antlr4实现简单语言之整数比较表达式](https://zhuanlan.zhihu.com/p/33047128)

antlr4生成分析器源码(Java)
```
$ cd src/main/java
$ java -cp "../../../lib/antlr-4.7-complete.jar:$CLASSPATH" org.antlr.v4.Tool -package com.中文编程.圈5.分析器 -visitor -no-listener 圈5.g4
```

命令行中使用生成的antlr4分析器分析测试程序:
```
$ javac -cp "../../../lib/antlr-4.7-complete.jar:$CLASSPATH" com/中文编程/圈5/分析器/圈5*.java
$ alias grun='java -cp "{path to antlr-4.7-complete.jar}:$CLASSPATH" org.antlr.v4.runtime.misc.TestRig'
$ grun com.中文编程.圈5.分析器.圈5 程序 -tree
```