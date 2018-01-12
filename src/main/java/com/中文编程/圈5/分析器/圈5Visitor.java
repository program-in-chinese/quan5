// Generated from 圈5.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code 数}
	 * labeled alternative in {@link 圈5Parser#表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit数(圈5Parser.数Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 加減}
	 * labeled alternative in {@link 圈5Parser#表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit加減(圈5Parser.加減Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 乘除}
	 * labeled alternative in {@link 圈5Parser#表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit乘除(圈5Parser.乘除Context ctx);
	/**
	 * Visit a parse tree produced by the {@code 变量}
	 * labeled alternative in {@link 圈5Parser#表达式}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit变量(圈5Parser.变量Context ctx);
}