package com.guilin.antlr4.demo.aleiye;

import com.guilin.antlr4.demo.aleiye.gen.AleiyeLexer;
import com.guilin.antlr4.demo.aleiye.gen.AleiyeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by guilin1 on 16/3/25.
 */
public class AleiyeDemo {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        } else {
            inputFile = AleiyeDemo.class.getClassLoader().getResource("").getPath() + File.separator + "aleiye.txt";
        }
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        AleiyeLexer lexer = new AleiyeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AleiyeParser parser = new AleiyeParser(tokens);
        ParseTree tree = parser.aleiye();
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree }
    }
}
