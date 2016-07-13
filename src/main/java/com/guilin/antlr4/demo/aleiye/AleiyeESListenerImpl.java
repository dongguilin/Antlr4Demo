package com.guilin.antlr4.demo.aleiye;

import com.guilin.antlr4.demo.aleiye.gen.AleiyeBaseListener;
import com.guilin.antlr4.demo.aleiye.gen.AleiyeParser;
import com.guilin.antlr4.demo.aleiye.gen.AleiyeParser.StatsexpressionContext;
import com.guilin.antlr4.demo.aleiye.grammar.util.SystemPam;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.histogram.DateHistogramBuilder;
import org.elasticsearch.search.aggregations.bucket.histogram.DateHistogramInterval;
import org.elasticsearch.search.aggregations.bucket.terms.TermsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilin1 on 16/3/25.
 */
public class AleiyeESListenerImpl extends AleiyeBaseListener {

    private final int onSize = 90;

    private List<AbstractAggregationBuilder> aggs = new ArrayList<>();

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDatereportfun(AleiyeParser.DatereportfunContext ctx) {
        //聚合统计agg
        List<AbstractAggregationBuilder> statAggs = buildStatAggs(ctx.aggfun().statsexpression());

        String span = "1d";
        if (ctx.spanexpression() != null) {
            span = ctx.spanexpression().PERIOD().getText();
        }

        //Date Historagram
        DateHistogramBuilder timeAgg = AggregationBuilders
                .dateHistogram("timestamp").timeZone("Asia/Shanghai").field(SystemPam.DFIELD + "timestamp")
                .interval(new DateHistogramInterval(span));

        if (ctx.ON() != null) {
            TermsBuilder onTermAgg = buildOnTermAgg(ctx.idsfun().ID(), statAggs);
            timeAgg.subAggregation(onTermAgg);
        } else {
            for (AbstractAggregationBuilder aag : statAggs) {
                timeAgg.subAggregation(aag);
            }
        }
        aggs.add(timeAgg);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitReportfun(AleiyeParser.ReportfunContext ctx) {

        //聚合统计agg
        List<AbstractAggregationBuilder> statAggs = buildStatAggs(ctx.aggfun().statsexpression());

        //x轴字段名称
        String xField = ctx.ID().getText();

        TermsBuilder overTermAgg = AggregationBuilders.terms(xField).field(xField);

        if (ctx.ON() != null) {
            overTermAgg.subAggregation(buildOnTermAgg(ctx.idsfun().ID(), statAggs));
        } else {
            for (AbstractAggregationBuilder aag : statAggs) {
                overTermAgg.subAggregation(aag);
            }
        }

        if (ctx.limitexpression() != null) {
            overTermAgg.size(Integer.parseInt(ctx.limitexpression().getText()));
        }

        aggs.add(overTermAgg);

    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatfun(AleiyeParser.StatfunContext ctx) {
        //聚合统计agg
        List<AbstractAggregationBuilder> statAggs = buildStatAggs(ctx.aggfun().statsexpression());

        if (ctx.ON() != null) {
            TermsBuilder onTermAgg = buildOnTermAgg(ctx.idsfun().ID(), statAggs);

            if (ctx.limitexpression() != null) {
                onTermAgg.size(Integer.parseInt(ctx.limitexpression().getText()));
            }

            aggs.add(onTermAgg);
        } else {
            for (AbstractAggregationBuilder aag : statAggs) {
                aggs.add(aag);
            }
        }
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTopfun(AleiyeParser.TopfunContext ctx) {

        //top数目，默认top 10
        int size = ctx.NUM() == null ? 10 : Integer.parseInt(ctx.NUM().getText());

        String name = ctx.ID().getText();

        TermsBuilder termsBuilder = AggregationBuilders.terms(name).field(name).size(size);

        aggs.add(termsBuilder);
    }

    /**
     * 构建聚合统计函数对象
     *
     * @param aggFunc 聚合统计函数名称
     * @param field   统计字段
     * @param alias   字段别名
     * @return
     */
    private AbstractAggregationBuilder buildStatagg(String aggFunc, String field, String alias) {
        AbstractAggregationBuilder agg = null;

        switch (aggFunc.toLowerCase()) {
            case "sum":
            case "avg":
            case "max":
            case "min":
                agg = AggregationBuilders.stats(alias).field(field);
                break;
            case "count":
                agg = AggregationBuilders.count(alias).field(field);
                break;
            case "dcount":
                agg = AggregationBuilders.cardinality(alias).field(field);
                break;
        }
        return agg;
    }

    /**
     * 构建term agg集
     *
     * @param onFields
     * @param statAggs
     * @return
     */
    private TermsBuilder buildOnTermAgg(List<TerminalNode> onFields, List<AbstractAggregationBuilder> statAggs) {
        TermsBuilder topTerm = null;//顶层

        TermsBuilder temp = null;//临时引用

        for (int i = 0; i < onFields.size(); i++) {
            TerminalNode onNode = onFields.get(i);
            String onField = onNode.getText();

            TermsBuilder onTerm = AggregationBuilders.terms(onField).field(onField);

            if (temp == null) {
                temp = onTerm;
            } else {
                temp.subAggregation(onTerm).size(onSize);
                temp = onTerm;
            }

            if (i == 0) {
                topTerm = onTerm;
            }

            for (AbstractAggregationBuilder statAgg : statAggs) {
                onTerm.subAggregation(statAgg).size(onSize);
            }

        }

        return topTerm;
    }

    /**
     * 构建聚合统计agg
     *
     * @param statExprList
     * @return
     */
    private List<AbstractAggregationBuilder> buildStatAggs(List<StatsexpressionContext> statExprList) {
        List<AbstractAggregationBuilder> statAggs = new ArrayList<>(statExprList.size());

        for (StatsexpressionContext statExpr : statExprList) {

            String aggFunc = statExpr.agg.getText();//聚合函数名称（COUNT|MAX|MIN|SUM|AVG|DCOUNT）

            String aggField = statExpr.aggAttr().getText();//统计字段

            String alias = aggField;//别名

            if (statExpr.aliasName() != null) {
                alias = statExpr.aliasName().getText();
            }

            statAggs.add(buildStatagg(aggFunc, aggField, alias));
        }
        return statAggs;
    }

}
