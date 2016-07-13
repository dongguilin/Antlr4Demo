package com.guilin.antlr4.demo.aleiye.grammar.method.num;


import com.guilin.antlr4.demo.aleiye.grammar.method.BaseMethod;

/**
 * long转换函数 longParser(field)
 * @author kongxp
 * @since 2014-03-20
 *
 */
public class ParserLong extends BaseMethod {
	
	
	public ParserLong(String id,Object... params) {
		super(id,params);
	}
	@Override
	public String toString() {
		return super.toString()+"parserLong";
	}
	@Override
	public String mapping(String filedname) {
		return "cast("+filedname+" as bigint)";
	}
	
	

}
