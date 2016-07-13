package com.guilin.antlr4.demo.aleiye.grammar.method;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

/**
 * 方法基类
 * @author kongxp
 *
 */
public abstract class BaseMethod extends Node {
	
	//参数
	protected Object[] params ;
	
	public BaseMethod(String id,final Object... params) {
		super(NodeType.METHOD,id);
		this.params = params;
	}



	/*方法翻译的过程的语句*/
	/**
	 * @param filedname  有可能是个字段名，也有可能是个字符串
	 * @return
	 */
	public abstract String mapping(String filedname);
	
}
