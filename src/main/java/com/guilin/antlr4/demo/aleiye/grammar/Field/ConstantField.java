package com.guilin.antlr4.demo.aleiye.grammar.Field;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

public class ConstantField extends Node {

	private static final long serialVersionUID = -3585553126372241010L;

	public ConstantField(Node pre, String id) {
		super(pre, NodeType.CONSTANT, id);
	}

	public ConstantField(String id) {
		super(NodeType.CONSTANT, id);
	}
	
	public String getVal(){
		return getId();
	}
	
	


}
