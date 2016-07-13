package com.guilin.antlr4.demo.aleiye.grammar.Field;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

/**
 * 字段节点
 * @author kongxp
 * @since 2014-03-20
 */
public class EntityField extends Node {
	
	private static final long serialVersionUID = 5607811231628276224L;

	public EntityField(){};
	
	public EntityField(Node pre,String id ){
		super(pre, NodeType.FIELD,id);
	}
	
	
	
}
