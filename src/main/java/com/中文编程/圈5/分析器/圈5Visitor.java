// Generated from com/中文编程/圈5/分析器/圈5.g4 by ANTLR 4.7
package com.中文编程.圈5.分析器;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link 圈5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface 圈5Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#程序}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit程序(圈5Parser.程序Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 求值}
	 * labeled alternative in {@link 圈5Parser#声明}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit求值(圈5Parser.求值Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 赋值}
	 * labeled alternative in {@link 圈5Parser#声明}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit赋值(圈5Parser.赋值Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 空行}
	 * labeled alternative in {@link 圈5Parser#声明}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit空行(圈5Parser.空行Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit表达式(圈5Parser.表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#等同判断表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit等同判断表达式(圈5Parser.等同判断表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#比较表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit比较表达式(圈5Parser.比较表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#求和表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit求和表达式(圈5Parser.求和表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#求积表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit求积表达式(圈5Parser.求积表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#最小表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit最小表达式(圈5Parser.最小表达式Context ctx);
	/**
	 * Visit a parse tree produced by {@link 圈5Parser#字面量}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit字面量(圈5Parser.字面量Context ctx);
}