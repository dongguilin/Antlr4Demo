package com.guilin.antlr4.demo.aleiye.gen;// Generated from /Users/guilin1/workspace/IDEA/Antlr4Demo/g4/Aleiye.g4 by ANTLR 4.5.1

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AleiyeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AleiyeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#aleiye}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAleiye(AleiyeParser.AleiyeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AleiyeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#topfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopfun(AleiyeParser.TopfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#reportfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportfun(AleiyeParser.ReportfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#datereportfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatereportfun(AleiyeParser.DatereportfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#limitexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitexpression(AleiyeParser.LimitexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#statfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatfun(AleiyeParser.StatfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#aggfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggfun(AleiyeParser.AggfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#statsexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsexpression(AleiyeParser.StatsexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#spanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanexpression(AleiyeParser.SpanexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#byfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByfun(AleiyeParser.ByfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#idsfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsfun(AleiyeParser.IdsfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#aggAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggAttr(AleiyeParser.AggAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AleiyeParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(AleiyeParser.AliasNameContext ctx);
}