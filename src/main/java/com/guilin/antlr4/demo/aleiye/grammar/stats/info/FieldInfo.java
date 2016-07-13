package com.guilin.antlr4.demo.aleiye.grammar.stats.info;


import org.apache.commons.lang.StringUtils;

public class FieldInfo {
	private String fieldName;
	private String cursor;
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getCursor() {
		return cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
	
	/**
	 * 获取数组中的元素的表达式封装
	 * @return
	 */
	public String getField(){
		if(StringUtils.isEmpty(cursor))
			return fieldName;
		else
			return fieldName+"["+cursor+"]";
	}
	
	public String getVarStr(String var){
		if(StringUtils.isNotEmpty(cursor))
			return var+"["+cursor+"]";
		else
			return var;
	}
	public boolean getCursorEnable(){
		if(StringUtils.isNotEmpty(cursor))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "FieldInfo [fieldName=" + fieldName + ", cursor=" + cursor + "]";
	}
}
