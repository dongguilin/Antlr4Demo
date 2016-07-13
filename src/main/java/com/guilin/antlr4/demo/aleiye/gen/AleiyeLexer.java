package com.guilin.antlr4.demo.aleiye.gen;// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Aleiye.g4 by ANTLR 4.5.1

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AleiyeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, PERIOD=5, LPAREN=6, RPAREN=7, NUM=8, NEWLINE=9, 
		STRING=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ID", "PERIOD", "LPAREN", "RPAREN", "NUM", "NEWLINE", 
		"STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", "'='", null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "PERIOD", "LPAREN", "RPAREN", "NUM", "NEWLINE", 
		"STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	   // place this class member only in lexer
	Map<String,Integer> keywords = new HashMap<String,Integer>() {{
		put("stats", AleiyeParser.STATS);
		put("by", AleiyeParser.BY);
		put("report", AleiyeParser.REPORT);
		put("datereport", AleiyeParser.DATEREPORT);
		put("over", AleiyeParser.OVER);
		put("on", AleiyeParser.ON);
		put("span", AleiyeParser.SPAN);
		put("limit", AleiyeParser.LIMIT);
		put("max",AleiyeParser.MAX);
		put("min",AleiyeParser.MIN);
		put("sum",AleiyeParser.SUM);
		put("count",AleiyeParser.COUNT);
		put("dcount",AleiyeParser.DCOUNT);
		put("avg",AleiyeParser.AVG);
		put("top", AleiyeParser.TOP);
	}};


	public AleiyeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aleiye.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

						if ( keywords.containsKey(getText()) ) {
							setType(keywords.get(getText())); //reset token type
						}
					
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5#\n\5\f\5\16\5&\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\5\6\62\n\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t=\n\t\f\t\16\t@\13\t\5\tB\n\t\3\n\5\nE\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13M\n\13\f\13\16\13P\13\13\3\13\3\13"+
		"\3\f\6\fU\n\f\r\f\16\fV\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\3\2\7\5\2B\\aac|\7\2//\62;C\\aac|\t\2OOffjjoouuyy{"+
		"{\3\2$$\4\2\13\13\"\"b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\36\3\2\2\2\t \3\2\2"+
		"\2\13\61\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25"+
		"H\3\2\2\2\27T\3\2\2\2\31\32\7.\2\2\32\4\3\2\2\2\33\34\7c\2\2\34\35\7u"+
		"\2\2\35\6\3\2\2\2\36\37\7?\2\2\37\b\3\2\2\2 $\t\2\2\2!#\t\3\2\2\"!\3\2"+
		"\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\5\2\2(\n"+
		"\3\2\2\2)\62\7\62\2\2*.\4\63;\2+-\4\62;\2,+\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61)\3\2\2\2\61*\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\t\4\2\2\64\f\3\2\2\2\65\66\7*\2\2\66\16\3\2\2\2\678\7+\2"+
		"\28\20\3\2\2\29B\7\62\2\2:>\4\63;\2;=\4\62;\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A9\3\2\2\2A:\3\2\2\2B\22\3\2\2\2C"+
		"E\7\17\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2\2G\24\3\2\2\2HN\7$\2"+
		"\2IJ\7$\2\2JM\7$\2\2KM\n\5\2\2LI\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7$\2\2R\26\3\2\2\2SU\t\6\2\2TS\3\2\2"+
		"\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\f\3\2Y\30\3\2\2\2\f\2$"+
		".\61>ADLNV\4\3\5\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}