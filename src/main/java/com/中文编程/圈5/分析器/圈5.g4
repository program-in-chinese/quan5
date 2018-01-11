grammar 圈5;
程序
 : 表达式
 ;

表达式
 : 表达式 '+' 表达式 		#加
   | T数					#数
 ;

T数
 : [0-9]+
 ;
T空白
 : [ \n\t]+ -> skip
 ;
T加 : '+';