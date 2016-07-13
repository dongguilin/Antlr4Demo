package com.guilin.antlr4.demo.aleiye.grammar.Field;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

/**
 * 别名节点
 * @author kongxp
 * @since 2014-03-20
 */
public class AliasField extends Node {
	
	private static final long serialVersionUID = 4961425773820802146L;

	public AliasField(String id){
		super(NodeType.ALIAS, id);
	}
	
	public AliasField(Node pre,String id){
		super(pre,NodeType.ALIAS, id);
	}
	

}
