package com.guilin.antlr4.demo.aleiye.grammar.cal;


import com.guilin.antlr4.demo.aleiye.grammar.Node;

/**
	 * calnode 如 (a+2)*c 每一个点都是数据. 有可能有三种形式，字段 常量或是操作符号（（）+ - × /）。 <br>
	 * 其中字段和常量，数遍历时以node方式存在
	 * 
	 * @author kongxp
	 * @since 2014-03-25
	 * 
	 */
	public class CalNode {
		public Node node;
		public String op;

		public CalNode(Node node) {
			this.node = node;
		}

		public CalNode(String op) {
			this.op = op;
		}

		public CalNode next;
		public CalNode pre;

		@Override
		public String toString() {
			return node!=null? node.toString():op;
		}

		public boolean isNode() {
			return node!=null;
		}
		
		

	}