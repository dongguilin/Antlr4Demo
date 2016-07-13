package com.guilin.antlr4.demo.aleiye.gen;// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Aleiye.g4 by ANTLR 4.5.1

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AleiyeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, PERIOD=5, LPAREN=6, RPAREN=7, NUM=8, NEWLINE=9, 
		STRING=10, WS=11, STATS=12, BY=13, REPORT=14, DATEREPORT=15, OVER=16, 
		ON=17, SPAN=18, LIMIT=19, COUNT=20, MAX=21, MIN=22, SUM=23, DCOUNT=24, 
		AVG=25, TOP=26;
	public static final int
		RULE_aleiye = 0, RULE_expr = 1, RULE_topfun = 2, RULE_reportfun = 3, RULE_datereportfun = 4, 
		RULE_limitexpression = 5, RULE_statfun = 6, RULE_aggfun = 7, RULE_statsexpression = 8, 
		RULE_spanexpression = 9, RULE_byfun = 10, RULE_idsfun = 11, RULE_aggAttr = 12, 
		RULE_aliasName = 13;
	public static final String[] ruleNames = {
		"aleiye", "expr", "topfun", "reportfun", "datereportfun", "limitexpression", 
		"statfun", "aggfun", "statsexpression", "spanexpression", "byfun", "idsfun", 
		"aggAttr", "aliasName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'as'", "'='", null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "PERIOD", "LPAREN", "RPAREN", "NUM", "NEWLINE", 
		"STRING", "WS", "STATS", "BY", "REPORT", "DATEREPORT", "OVER", "ON", "SPAN", 
		"LIMIT", "COUNT", "MAX", "MIN", "SUM", "DCOUNT", "AVG", "TOP"
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

	@Override
	public String getGrammarFileName() { return "Aleiye.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AleiyeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AleiyeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AleiyeParser.NEWLINE, 0); }
		public AleiyeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aleiye; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterAleiye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitAleiye(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitAleiye(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AleiyeContext aleiye() throws RecognitionException {
		AleiyeContext _localctx = new AleiyeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aleiye);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			expr();
			setState(30);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(29);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(AleiyeParser.TOP, 0); }
		public TopfunContext topfun() {
			return getRuleContext(TopfunContext.class,0);
		}
		public TerminalNode REPORT() { return getToken(AleiyeParser.REPORT, 0); }
		public ReportfunContext reportfun() {
			return getRuleContext(ReportfunContext.class,0);
		}
		public TerminalNode DATEREPORT() { return getToken(AleiyeParser.DATEREPORT, 0); }
		public DatereportfunContext datereportfun() {
			return getRuleContext(DatereportfunContext.class,0);
		}
		public TerminalNode STATS() { return getToken(AleiyeParser.STATS, 0); }
		public StatfunContext statfun() {
			return getRuleContext(StatfunContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case EOF:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(TOP);
				setState(34);
				topfun();
				}
				break;
			case REPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(REPORT);
				setState(36);
				reportfun();
				}
				break;
			case DATEREPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(DATEREPORT);
				setState(38);
				datereportfun();
				}
				break;
			case STATS:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(STATS);
				setState(40);
				statfun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopfunContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AleiyeParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AleiyeParser.NUM, 0); }
		public TopfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterTopfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitTopfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitTopfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopfunContext topfun() throws RecognitionException {
		TopfunContext _localctx = new TopfunContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(43);
				match(NUM);
				}
			}

			setState(46);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportfunContext extends ParserRuleContext {
		public AggfunContext aggfun() {
			return getRuleContext(AggfunContext.class,0);
		}
		public TerminalNode OVER() { return getToken(AleiyeParser.OVER, 0); }
		public TerminalNode ID() { return getToken(AleiyeParser.ID, 0); }
		public TerminalNode ON() { return getToken(AleiyeParser.ON, 0); }
		public IdsfunContext idsfun() {
			return getRuleContext(IdsfunContext.class,0);
		}
		public LimitexpressionContext limitexpression() {
			return getRuleContext(LimitexpressionContext.class,0);
		}
		public ReportfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterReportfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitReportfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitReportfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportfunContext reportfun() throws RecognitionException {
		ReportfunContext _localctx = new ReportfunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reportfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			aggfun();
			setState(49);
			match(OVER);
			setState(50);
			match(ID);
			setState(53);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(51);
				match(ON);
				setState(52);
				idsfun();
				}
			}

			setState(56);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(55);
				limitexpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatereportfunContext extends ParserRuleContext {
		public AggfunContext aggfun() {
			return getRuleContext(AggfunContext.class,0);
		}
		public TerminalNode ON() { return getToken(AleiyeParser.ON, 0); }
		public IdsfunContext idsfun() {
			return getRuleContext(IdsfunContext.class,0);
		}
		public SpanexpressionContext spanexpression() {
			return getRuleContext(SpanexpressionContext.class,0);
		}
		public DatereportfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datereportfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterDatereportfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitDatereportfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitDatereportfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatereportfunContext datereportfun() throws RecognitionException {
		DatereportfunContext _localctx = new DatereportfunContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datereportfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			aggfun();
			setState(61);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(59);
				match(ON);
				setState(60);
				idsfun();
				}
			}

			setState(64);
			_la = _input.LA(1);
			if (_la==SPAN) {
				{
				setState(63);
				spanexpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitexpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AleiyeParser.NUM, 0); }
		public LimitexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterLimitexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitLimitexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitLimitexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitexpressionContext limitexpression() throws RecognitionException {
		LimitexpressionContext _localctx = new LimitexpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limitexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatfunContext extends ParserRuleContext {
		public AggfunContext aggfun() {
			return getRuleContext(AggfunContext.class,0);
		}
		public TerminalNode ON() { return getToken(AleiyeParser.ON, 0); }
		public IdsfunContext idsfun() {
			return getRuleContext(IdsfunContext.class,0);
		}
		public LimitexpressionContext limitexpression() {
			return getRuleContext(LimitexpressionContext.class,0);
		}
		public StatfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterStatfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitStatfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitStatfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatfunContext statfun() throws RecognitionException {
		StatfunContext _localctx = new StatfunContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			aggfun();
			setState(71);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(69);
				match(ON);
				setState(70);
				idsfun();
				}
			}

			setState(74);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(73);
				limitexpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggfunContext extends ParserRuleContext {
		public List<StatsexpressionContext> statsexpression() {
			return getRuleContexts(StatsexpressionContext.class);
		}
		public StatsexpressionContext statsexpression(int i) {
			return getRuleContext(StatsexpressionContext.class,i);
		}
		public AggfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterAggfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitAggfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitAggfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggfunContext aggfun() throws RecognitionException {
		AggfunContext _localctx = new AggfunContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			statsexpression();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77);
				match(T__0);
				setState(78);
				statsexpression();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsexpressionContext extends ParserRuleContext {
		public Token agg;
		public AggAttrContext aggAttr() {
			return getRuleContext(AggAttrContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(AleiyeParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(AleiyeParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(AleiyeParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(AleiyeParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(AleiyeParser.AVG, 0); }
		public TerminalNode DCOUNT() { return getToken(AleiyeParser.DCOUNT, 0); }
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public StatsexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterStatsexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitStatsexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitStatsexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsexpressionContext statsexpression() throws RecognitionException {
		StatsexpressionContext _localctx = new StatsexpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statsexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((StatsexpressionContext)_localctx).agg = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << DCOUNT) | (1L << AVG))) != 0)) ) {
				((StatsexpressionContext)_localctx).agg = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(85);
			match(LPAREN);
			setState(86);
			aggAttr();
			setState(87);
			match(RPAREN);
			setState(90);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(88);
				match(T__1);
				setState(89);
				aliasName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpanexpressionContext extends ParserRuleContext {
		public TerminalNode SPAN() { return getToken(AleiyeParser.SPAN, 0); }
		public TerminalNode PERIOD() { return getToken(AleiyeParser.PERIOD, 0); }
		public SpanexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterSpanexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitSpanexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitSpanexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpanexpressionContext spanexpression() throws RecognitionException {
		SpanexpressionContext _localctx = new SpanexpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_spanexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SPAN);
			setState(93);
			match(T__2);
			setState(94);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByfunContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(AleiyeParser.BY, 0); }
		public IdsfunContext idsfun() {
			return getRuleContext(IdsfunContext.class,0);
		}
		public ByfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterByfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitByfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitByfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByfunContext byfun() throws RecognitionException {
		ByfunContext _localctx = new ByfunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_byfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(BY);
			setState(97);
			idsfun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsfunContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AleiyeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AleiyeParser.ID, i);
		}
		public IdsfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idsfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterIdsfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitIdsfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitIdsfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsfunContext idsfun() throws RecognitionException {
		IdsfunContext _localctx = new IdsfunContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idsfun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(100);
				match(T__0);
				setState(101);
				match(ID);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AleiyeParser.ID, 0); }
		public AggAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterAggAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitAggAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitAggAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggAttrContext aggAttr() throws RecognitionException {
		AggAttrContext _localctx = new AggAttrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AleiyeParser.ID, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AleiyeListener ) ((AleiyeListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AleiyeVisitor ) return ((AleiyeVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\5\4/\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\58\n\5\3\5\5\5;\n\5\3\6\3\6\3\6\5\6@\n\6\3\6\5\6C\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\5\bJ\n\b\3\b\5\bM\n\b\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\7\ri\n\r\f\r\16\rl\13\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\3\3\2\26\33r\2\36\3\2\2\2\4+\3\2\2\2\6.\3\2\2"+
		"\2\b\62\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20N\3\2\2\2\22V\3\2"+
		"\2\2\24^\3\2\2\2\26b\3\2\2\2\30e\3\2\2\2\32m\3\2\2\2\34o\3\2\2\2\36 \5"+
		"\4\3\2\37!\7\13\2\2 \37\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\",\3\2\2\2#$\7\34"+
		"\2\2$,\5\6\4\2%&\7\20\2\2&,\5\b\5\2\'(\7\21\2\2(,\5\n\6\2)*\7\16\2\2*"+
		",\5\16\b\2+\"\3\2\2\2+#\3\2\2\2+%\3\2\2\2+\'\3\2\2\2+)\3\2\2\2,\5\3\2"+
		"\2\2-/\7\n\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\6\2\2\61\7\3\2"+
		"\2\2\62\63\5\20\t\2\63\64\7\22\2\2\64\67\7\6\2\2\65\66\7\23\2\2\668\5"+
		"\30\r\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29;\5\f\7\2:9\3\2\2\2:;\3\2"+
		"\2\2;\t\3\2\2\2<?\5\20\t\2=>\7\23\2\2>@\5\30\r\2?=\3\2\2\2?@\3\2\2\2@"+
		"B\3\2\2\2AC\5\24\13\2BA\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DE\7\n\2\2E\r\3\2"+
		"\2\2FI\5\20\t\2GH\7\23\2\2HJ\5\30\r\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM"+
		"\5\f\7\2LK\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NS\5\22\n\2OP\7\3\2\2PR\5\22\n"+
		"\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2US\3\2\2\2VW\t\2"+
		"\2\2WX\7\b\2\2XY\5\32\16\2Y\\\7\t\2\2Z[\7\4\2\2[]\5\34\17\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]\23\3\2\2\2^_\7\24\2\2_`\7\5\2\2`a\7\7\2\2a\25\3\2\2\2bc\7"+
		"\17\2\2cd\5\30\r\2d\27\3\2\2\2ej\7\6\2\2fg\7\3\2\2gi\7\6\2\2hf\3\2\2\2"+
		"il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\31\3\2\2\2lj\3\2\2\2mn\7\6\2\2n\33\3\2"+
		"\2\2op\7\6\2\2p\35\3\2\2\2\16 +.\67:?BILS\\j";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}