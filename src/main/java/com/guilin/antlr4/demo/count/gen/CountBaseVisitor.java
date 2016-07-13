// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Count.g4 by ANTLR 4.5.1

package com.guilin.antlr4.demo.count.gen;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link com.guilin.antlr4.demo.count.gen.CountVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class CountBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements com.guilin.antlr4.demo.count.gen.CountVisitor<T> {
    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitList(com.guilin.antlr4.demo.count.gen.CountParser.ListContext ctx) {
        return visitChildren(ctx);
    }
}