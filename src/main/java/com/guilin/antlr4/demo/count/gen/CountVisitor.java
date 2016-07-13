// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Count.g4 by ANTLR 4.5.1

package com.guilin.antlr4.demo.count.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link com.guilin.antlr4.demo.count.gen.CountParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CountVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link com.guilin.antlr4.demo.count.gen.CountParser#list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitList(com.guilin.antlr4.demo.count.gen.CountParser.ListContext ctx);
}