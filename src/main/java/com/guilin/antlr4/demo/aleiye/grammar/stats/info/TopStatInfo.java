package com.guilin.antlr4.demo.aleiye.grammar.stats.info;



import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;

import java.util.List;


public class TopStatInfo extends BaseStat {
	/*
	 * 判断是按照DESC还是ASC排序
	 */
	private boolean rate;
	/*
	 * top 按count统计字段
	 */
	private List<FieldInfo> byBefore;
	/*
	 * top 分类统计字段
	 */
	private List<FieldInfo> byAfter;
	/*
	 * 聚合函数集合
	 */
	private List<AggInfo> listAggs;
	private int limit=0;
	
	public List<FieldInfo> getByBefore() {
		return byBefore;
	}
	public void setByBefore(List<FieldInfo> byBefore) {
		this.byBefore = byBefore;
	}
	public List<FieldInfo> getByAfter() {
		return byAfter;
	}
	public void setByAfter(List<FieldInfo> byAfter) {
		this.byAfter = byAfter;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public boolean isRate() {
		return rate;
	}
	public void setRate(boolean rate) {
		this.rate = rate;
	}
	public List<AggInfo> getListAggs() {
		return listAggs;
	}
	public void setListAggs(List<AggInfo> listAggs) {
		this.listAggs = listAggs;
	}
	
}
