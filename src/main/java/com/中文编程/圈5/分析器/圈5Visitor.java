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
}