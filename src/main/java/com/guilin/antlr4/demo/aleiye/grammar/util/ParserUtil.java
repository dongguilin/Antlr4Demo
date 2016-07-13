package com.guilin.antlr4.demo.aleiye.grammar.util;

import org.apache.commons.lang.StringUtils;

public class ParserUtil {
	/**
	 * 中间结果表名
	 * @param table
	 * @return
	 */
	public static String convertTempTable(String table){
		if(StringUtils.isEmpty(table))
			return "table";
		else
			return "("+table+") "+MD5.md5(table)+"_";
	}
}
