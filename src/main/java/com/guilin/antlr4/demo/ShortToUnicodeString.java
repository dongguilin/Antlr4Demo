package com.guilin.antlr4.demo;

import com.guilin.antlr4.gen.ArrayInitBaseListener;
import com.guilin.antlr4.gen.ArrayInitParser;

/**
 * Created by guilin1 on 16/3/23.
 * Convert short array inits like {1,2,3} to "\u0001\u0002\u0003"
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {

    /**
     * Translate { to "
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /**
     * Translate } to "
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /**
     * Translate integers to 4-digit hexadecimal strings prefixed with \\u
     */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        // Assumes no nested array initializers
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
