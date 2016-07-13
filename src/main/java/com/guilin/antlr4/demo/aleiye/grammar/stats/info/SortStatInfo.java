package com.guilin.antlr4.demo.aleiye.grammar.stats.info;


import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;

import java.util.List;
import java.util.Map;


/**
 * 排序语法信息封装
 * @author zhy
 *
 */
public class SortStatInfo extends BaseStat {
	/*
	 * 排序规则根据+、-分类
	 */
	private Map<String, List<FieldInfo>> sortFields;

	public Map<String, List<FieldInfo>> getSortFields() {
		return sortFields;
	}

	public void setSortFields(Map<String, List<FieldInfo>> sortFields) {
		this.sortFields = sortFields;
	}

	
	
}
