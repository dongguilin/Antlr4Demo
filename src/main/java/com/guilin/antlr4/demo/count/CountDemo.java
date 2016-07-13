package com.guilin.antlr4.demo.count;

import com.guilin.antlr4.demo.count.gen.CountBaseListener;
import com.guilin.antlr4.demo.count.gen.CountLexer;
import com.guilin.antlr4.demo.count.gen.CountParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by guilin1 on 16/3/25.
 */
public class CountDemo {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        CountLexer lexer = new CountLexer(new ANTLRInputStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        final CountParser parser = new CountParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.list();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new CountBaseListener() {
            @Override
            public void exitList(com.guilin.antlr4.demo.count.gen.CountParser.ListContext ctx) {
                System.out.println("rule index:" + ctx.getRuleIndex());
            }
        }, tree);
    }

}
