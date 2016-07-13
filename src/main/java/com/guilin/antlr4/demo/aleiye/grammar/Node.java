package com.guilin.antlr4.demo.aleiye.grammar;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 双向链表。用于构建语法
 * @author kongxp
 * @since 2014-03-20
 *
 */
public abstract class Node implements Serializable {
	private static final long serialVersionUID = -7347898225970507633L;

	private String id;
	private Node pre =null;
	private List<Node> nexts = new ArrayList<Node>();
	public NodeType type;
	
	public Node(){};
	
	public Node(Node pre, NodeType type,String id) {
		super();
		this.pre = pre;
		this.type = type;
		this.id =id;
	}
	
	public Node(NodeType type,String id) {
		super();
		this.type = type;
		this.id =id;
	}

	/**
	 * 向尾部添加一个节点
	 * @param otherNode
	 */
	public void AddNext(Node otherNode){
		otherNode.pre = this;
		nexts.add(otherNode);
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	@Override
	public boolean equals(Object obj) {
		Node other = (Node) obj;
		return id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return  id.hashCode();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Node getPre() {
		return pre;
	}
	public void setPre(Node pre) {
		this.pre = pre;
	}

	public List<Node> getNexts() {
		return nexts;
	}

	public void setNexts(List<Node> nexts) {
		this.nexts = nexts;
	}

	public NodeType getType() {
		return type;
	}

	public void setType(NodeType type) {
		this.type = type;
	}
	
	
}
