package com.guilin.antlr4.demo.aleiye.grammar.cal;


import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

/**
 * 一种计算节点，这种计算节点 仅仅是要字符串，不同的地方那个是在生成串的同时需要寻找字段的来历 同时计算节点也可以作为一条链的节点使用。
 * 
 * @author kongxp
 * @since 2014-03-25
 */
public class Cal extends Node {
	private static final long serialVersionUID = 7702282314653916320L;
	// 持有第一个会最后一个节点。方便操作
	private CalNode first = null;
	private CalNode last = null;

	/**
	 * 构建节点时需要
	 * 
	 * @param pre
	 * @param id
	 * @param left
	 */
	public Cal(Node pre, String id, Node left) {
		super(pre, NodeType.CAL, id);
		first = new CalNode(left);
		last = first;
	}

	public Cal(String id, Node left) {
		super(NodeType.CAL, id);
		first = new CalNode(left);
		last = first;
	}

	/**
	 * 添加操作节点
	 * 
	 * @param a
	 * @param op
	 *            + - × /
	 * @param b
	 */
	public void addOper(String op, Node b) {
		if(op != null){
			CalNode cop = new CalNode(op);
			last.next = cop;
			cop.pre = last;
			last = cop;
		}
		CalNode nop = new CalNode(b);
		last.next = nop;
		nop.pre = last;
		last = nop;
	}

	// 添加左括号
	public void addLeftBracket() {
		CalNode left = new CalNode("(");
		first.pre = left;
		left.next = first;
		first = left;
		// 到了括号 fist 应该不为空
	}

	// 添加右括号
	public void addRightBracket() {
		CalNode right = new CalNode(")");
		// 左右括号 可能是匹配出现 所以last 这是必须存在
		last.next = right;
		right.pre = last;
		last = right;
	}

	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		CalNode n = first;
		while(n!=null){
			//小小的约定，在es-script 内部用于解析
			//因为在es的参数传递时居然调用的不是json对象而是调用了tostring方法。
			sb.append(n.toString()+"-->");
			n = n.next;
		}
		return sb.toString();
	}

	public CalNode getFirst() {
		return first;
	}
	
	
	
	
	
	
}
