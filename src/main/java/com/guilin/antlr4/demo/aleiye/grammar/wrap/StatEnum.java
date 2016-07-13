package com.guilin.antlr4.demo.aleiye.grammar.wrap;

import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;
import com.guilin.antlr4.demo.aleiye.grammar.stats.info.*;
import com.guilin.antlr4.demo.aleiye.grammar.util.NodeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Map;


public enum StatEnum {

	TOP {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof TopStatInfo)
					return statInfo;
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList,NodeWalker walker, String tempStr,Map<String,String> dist) {
//			return new WrapSqlByTop(StatEnum.TOP.getStat(statList),walker,tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},REPORT {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof ReportStatInfo)
					return statInfo;
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr,Map<String,String> dist) {
//			return new WrapSqlByReport(StatEnum.REPORT.getStat(statList),walker,tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},DATEREPORT {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof DateReportStatInfo){
					//G4 嵌套设计所致
						return statInfo;
				}
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr,Map<String,String> dist) {
//			return new WrapSqlByDateReport(StatEnum.DATEREPORT.getStat(statList),walker,tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},SORT {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof SortStatInfo)
					return statInfo;
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr,Map<String,String> dist) {
//			return new WrapSqlBySort(StatEnum.SORT.getStat(statList), walker, tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},LIMIT {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof LimitStatInfo)
					return statInfo;
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr,Map<String,String> dist) {
//			return new WrapSqlByLimit(StatEnum.LIMIT.getStat(statList), walker, tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},STATS {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			for(BaseStat statInfo : statList){
				if(statInfo instanceof StatInfo)
					return statInfo;
			}
			return null;
		}

		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr,Map<String,String> dist) {
//			return new WrapSqlByStats(StatEnum.STATS.getStat(statList), walker, tempStr,dist).wrap();
			return null;
		}

		@Override
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList) {
			return null;
		}
	},FILTER {
		@Override
		public BaseStat getStat(List<BaseStat> statList) {
			return null;
		}
		public ParserRuleContext getCtx(List<ParserRuleContext> ctxList){
//			for(ParserRuleContext ctx : ctxList){
//				if(ctx instanceof AleiyeParser.WherefunContext)
//					return ctx;
//			}
			return null;
		}
		@Override
		public String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList, NodeWalker walker,
				String tempStr, Map<String, String> dist) {
//			return new WrapSqlByWhere(StatEnum.FILTER.getCtx(ctxList), walker, tempStr, dist).wrap();
			return null;
		}
	};
	public abstract BaseStat getStat(List<BaseStat> statList);
	public abstract String wrap(List<ParserRuleContext> ctxList,List<BaseStat> statList,NodeWalker walker,String tempStr,Map<String,String> dist);
	public abstract ParserRuleContext getCtx(List<ParserRuleContext> ctxList);
}
