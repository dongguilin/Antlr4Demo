package com.guilin.antlr4.demo.aleiye.gen;// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Aleiye.g4 by ANTLR 4.5.1

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AleiyeParser}.
 */
public interface AleiyeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#aleiye}.
	 * @param ctx the parse tree
	 */
	void enterAleiye(AleiyeParser.AleiyeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#aleiye}.
	 * @param ctx the parse tree
	 */
	void exitAleiye(AleiyeParser.AleiyeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AleiyeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AleiyeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#topfun}.
	 * @param ctx the parse tree
	 */
	void enterTopfun(AleiyeParser.TopfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#topfun}.
	 * @param ctx the parse tree
	 */
	void exitTopfun(AleiyeParser.TopfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#reportfun}.
	 * @param ctx the parse tree
	 */
	void enterReportfun(AleiyeParser.ReportfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#reportfun}.
	 * @param ctx the parse tree
	 */
	void exitReportfun(AleiyeParser.ReportfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#datereportfun}.
	 * @param ctx the parse tree
	 */
	void enterDatereportfun(AleiyeParser.DatereportfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#datereportfun}.
	 * @param ctx the parse tree
	 */
	void exitDatereportfun(AleiyeParser.DatereportfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#limitexpression}.
	 * @param ctx the parse tree
	 */
	void enterLimitexpression(AleiyeParser.LimitexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#limitexpression}.
	 * @param ctx the parse tree
	 */
	void exitLimitexpression(AleiyeParser.LimitexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#statfun}.
	 * @param ctx the parse tree
	 */
	void enterStatfun(AleiyeParser.StatfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#statfun}.
	 * @param ctx the parse tree
	 */
	void exitStatfun(AleiyeParser.StatfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#aggfun}.
	 * @param ctx the parse tree
	 */
	void enterAggfun(AleiyeParser.AggfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#aggfun}.
	 * @param ctx the parse tree
	 */
	void exitAggfun(AleiyeParser.AggfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#statsexpression}.
	 * @param ctx the parse tree
	 */
	void enterStatsexpression(AleiyeParser.StatsexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#statsexpression}.
	 * @param ctx the parse tree
	 */
	void exitStatsexpression(AleiyeParser.StatsexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#spanexpression}.
	 * @param ctx the parse tree
	 */
	void enterSpanexpression(AleiyeParser.SpanexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#spanexpression}.
	 * @param ctx the parse tree
	 */
	void exitSpanexpression(AleiyeParser.SpanexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#byfun}.
	 * @param ctx the parse tree
	 */
	void enterByfun(AleiyeParser.ByfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#byfun}.
	 * @param ctx the parse tree
	 */
	void exitByfun(AleiyeParser.ByfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#idsfun}.
	 * @param ctx the parse tree
	 */
	void enterIdsfun(AleiyeParser.IdsfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#idsfun}.
	 * @param ctx the parse tree
	 */
	void exitIdsfun(AleiyeParser.IdsfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#aggAttr}.
	 * @param ctx the parse tree
	 */
	void enterAggAttr(AleiyeParser.AggAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#aggAttr}.
	 * @param ctx the parse tree
	 */
	void exitAggAttr(AleiyeParser.AggAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AleiyeParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(AleiyeParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AleiyeParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(AleiyeParser.AliasNameContext ctx);
}