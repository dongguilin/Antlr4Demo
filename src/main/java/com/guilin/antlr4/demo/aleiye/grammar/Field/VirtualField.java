package com.guilin.antlr4.demo.aleiye.grammar.Field;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

/**
 * 虚拟节点
 * 
 * @author kongxp
 * @since 2014-03-20
 */
public class VirtualField extends Node {

	private static final long serialVersionUID = 3255448055211108417L;

	public VirtualField(String id) {
		super(NodeType.VIRTUAL, id);
	}

	public VirtualField(Node pre, String id) {
		super(pre, NodeType.VIRTUAL, id);
	}

}
