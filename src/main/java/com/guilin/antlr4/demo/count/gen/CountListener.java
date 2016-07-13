// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Count.g4 by ANTLR 4.5.1

package com.guilin.antlr4.demo.count.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link com.guilin.antlr4.demo.count.gen.CountParser}.
 */
public interface CountListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link com.guilin.antlr4.demo.count.gen.CountParser#list}.
     *
     * @param ctx the parse tree
     */
    void enterList(com.guilin.antlr4.demo.count.gen.CountParser.ListContext ctx);

    /**
     * Exit a parse tree produced by {@link com.guilin.antlr4.demo.count.gen.CountParser#list}.
     *
     * @param ctx the parse tree
     */
    void exitList(com.guilin.antlr4.demo.count.gen.CountParser.ListContext ctx);
}