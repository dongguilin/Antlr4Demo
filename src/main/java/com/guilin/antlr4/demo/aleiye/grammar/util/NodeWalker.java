package com.guilin.antlr4.demo.aleiye.grammar.util;

import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;
import com.guilin.antlr4.demo.aleiye.grammar.cal.Cal;
import com.guilin.antlr4.demo.aleiye.grammar.cal.CalNode;
import com.guilin.antlr4.demo.aleiye.grammar.method.BaseMethod;
import org.apache.commons.lang.StringUtils;

import java.util.List;


public class NodeWalker {
	
	private  List<Node> allFiedls;
	

	public NodeWalker(List<Node> allFiedls) {
		super();
		this.allFiedls = allFiedls;
	}
	
	public String fieldString(Node field){
		return fieldString(field,true,null);
	}
	public String fieldString(String id,boolean hasAlias,String aliasname) {
		return fieldString(findNode(id),hasAlias,aliasname);
	}


	/**
	 * 完成字段的转换 一般就两种情况，field情况还有就是别名情况。
	 * 
	 * @param field
	 * @param hasAlias 是否需要别名
	 * @return
	 */
	public  String fieldString(Node field,Boolean hasAlias,String alias) {
		StringBuffer result = new StringBuffer();
		
		if (field.type.equals(NodeType.FIELD)
				|| field.type.equals(NodeType.ALIAS)) {
			String str = bulidFiled(field.getPre());
			if(StringUtils.isNotBlank(str)){
				result.append(str);
				if(hasAlias){
					result.append(" as ");
					if(StringUtils.isNotBlank(alias)){
						result.append(alias).append("_");
					}else{
						result.append(field.getId()).append("_");
						
					}
				}
			}else{
				if(field.getId().startsWith("@")){
					result.append("0_").append(field.getId().substring(1)).append("_");
				}else{
					result.append(field.getId()).append("_");
				}
			}
		}
		return result.toString();
	}
	
	private  String bulidFiled(Node current) {
		//处理直接请求是字段的情况
		if(current==null){
			return null;
		}
		StringBuffer s = new StringBuffer();
		if (current.type.equals(NodeType.FIELD)) {
			s.append(current.getId()).append("_") ;
		}else if(current.type.equals(NodeType.ALIAS) ||current.type.equals(NodeType.VIRTUAL) ){
			s.append(bulidFiled(current.getPre()));
		}else if(current.type.equals(NodeType.METHOD)){
			BaseMethod m =  (BaseMethod) current;
			//method 有可能作为链头存在
			if(current.getPre()==null){
				s.append(m.mapping(""));
			}else{
				//此处的实现 有些繁琐，不够抽象。其实只需要调用maping方法就好，不需要关心前一个节点的内容。
				//但是如果不写到这，所有方法的实现就都需要walker。这个比较麻烦。所以说不够抽象。
				s.append(m.mapping(bulidFiled(current.getPre())));
			}
		}else if(current.type.equals(NodeType.CAL)){
			Cal cal = (Cal) current;
			CalNode n = cal.getFirst();
			while(n!=null){
				if(n.isNode()){
					s.append(bulidFiled(n.node));
				}else{
					s.append(n.op);
				}
				n = n.next;
			}
		}else if(current.type.equals(NodeType.CONSTANT)){
			s.append(current.getId());
		}
		
		return s.toString();
	}
	

	// 在现有的链中进行检索
		public Node findNode(String id) {
			for (Node start : allFiedls) {
				Node n = findNode(start, id);
				if (n != null) {
					return n;
				}
			}
			return null;

		}

		private Node findNode(Node start, String id) {
			if (start.getId().equals(id)) {
				return start;
			}
			List<Node> chlidren = start.getNexts();
			Node t = null;
			for (Node node : chlidren) {
				t = findNode(node, id);
				if (t != null) {
					return t;
				}
			}
			return t;
		}

		
	

}
