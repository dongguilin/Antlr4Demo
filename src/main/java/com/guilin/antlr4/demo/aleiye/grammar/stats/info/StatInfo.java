package com.guilin.antlr4.demo.aleiye.grammar.stats.info;


import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;

import java.util.List;


/**
 * 统计函数信息封装
 * @author zhy
 *
 */
public class StatInfo extends BaseStat {
	/*
	 * 聚合函数集合
	 */
	private List<AggInfo> listAggs;
	/*
	 * over 变量或字段
	 */
	private FieldInfo overField = null;
	/*
	 * on 变量或字段集合
	 */
	private List<FieldInfo> onList = null;
	
	
	public List<AggInfo> getListAggs() {
		return listAggs;
	}
	public void setListAggs(List<AggInfo> listAggs) {
		this.listAggs = listAggs;
	}
	public FieldInfo getOverField() {
		return overField;
	}
	public void setOverField(FieldInfo overField) {
		this.overField = overField;
	}
	public List<FieldInfo> getOnList() {
		return onList;
	}
	public void setOnList(List<FieldInfo> onList) {
		this.onList = onList;
	}

}
