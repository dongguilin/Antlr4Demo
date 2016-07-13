package com.guilin.antlr4.demo.aleiye.grammar.stats.info;


import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;

/**
 * limit函数封装
 * @author zhy
 *
 */
public class LimitStatInfo extends BaseStat {
	/*
	 * 限制记录数目
	 */
	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
}
