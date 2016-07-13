package com.guilin.antlr4.demo;

import com.guilin.antlr4.gen.ExprLexer;
import com.guilin.antlr4.gen.ExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by guilin1 on 16/3/23.
 */
public class ExprJoyRide {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        } else {
            inputFile = ExprJoyRide.class.getClassLoader().getResource("").getPath() + File.separator + "expr1.expr";
        }
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog(); // parse; start at prog System.out.println(tree.toStringTree(parser)); // print tree as text
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree }
    }

}
