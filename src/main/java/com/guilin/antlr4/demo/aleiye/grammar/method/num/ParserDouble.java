package com.guilin.antlr4.demo.aleiye.grammar.method.num;


import com.guilin.antlr4.demo.aleiye.grammar.method.BaseMethod;

/**
 * long转换函数 longParser(field)
 * @author kongxp
 * @since 2014-03-20
 *
 */
public class ParserDouble extends BaseMethod {
	
	
	public ParserDouble(String id,Object... params) {
		super(id,params);
	}
	@Override
	public String toString() {
		return super.toString()+"parserdouble";
	}
	@Override
	public String mapping(String filedname) {
		return "cast("+filedname+" as double)";
	}
	
	

}
