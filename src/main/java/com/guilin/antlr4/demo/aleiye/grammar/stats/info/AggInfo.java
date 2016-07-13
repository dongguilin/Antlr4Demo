package com.guilin.antlr4.demo.aleiye.grammar.stats.info;

/**
 * 聚合函数信息封装
 * @author zhy
 *
 */
public class AggInfo {
	/*
	 * 聚合函数名称
	 */
	private String aggName;
	/*
	 * 聚合函数包含的变量名称或字段名称
	 */
	private FieldInfo aggAttrInfo;
	/*
	 * 聚合函数别名
	 */
	private String aliasName;
	
	public String getAggName() {
		return aggName;
	}
	public void setAggName(String aggName) {
		this.aggName = aggName;
	}
	
	public FieldInfo getAggAttrInfo() {
		return aggAttrInfo;
	}
	public void setAggAttrInfo(FieldInfo aggAttrInfo) {
		this.aggAttrInfo = aggAttrInfo;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

}
