package com.guilin.antlr4.demo.aleiye;

/**
 * Created by guilin1 on 16/3/26.
 */
public class ParserException extends RuntimeException {

    public ParserException() {
        super();
    }

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParserException(Throwable cause) {
        super(cause);
    }
}
