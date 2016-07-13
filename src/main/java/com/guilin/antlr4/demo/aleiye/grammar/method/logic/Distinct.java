package com.guilin.antlr4.demo.aleiye.grammar.method.logic;


import com.guilin.antlr4.demo.aleiye.grammar.method.BaseMethod;

public class Distinct extends BaseMethod {

	public Distinct(String id, Object... params) {
		super(id, params);
	}

	@Override
	public String mapping(String filedname) {
		//DistinctfunContext conx =  (DistinctfunContext) params[0];
		StringBuffer sb = new StringBuffer();
		//sb.append(conx.method.getText()).append(" ");
		sb.append(filedname);
		return sb.toString();
	}

}
