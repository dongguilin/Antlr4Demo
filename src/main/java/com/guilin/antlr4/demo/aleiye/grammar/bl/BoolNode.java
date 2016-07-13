package com.guilin.antlr4.demo.aleiye.grammar.bl;


import com.alibaba.fastjson.JSONObject;
import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

import java.util.*;

public class BoolNode extends Node {
	private static final long serialVersionUID = -7899468790020407342L;

	public BoolNode(String id, Node left) {
		super(NodeType.ESBOOLEAN, id);
	}

	// 所有的字段
	private List<String> fields = new ArrayList<>();

	// 字符串对应关系
	// key为数据字符串。key为boolean的判断字符串 vlaue为该数据对应的值
	private Map<String, Object> kvs = new LinkedHashMap<>();

	public void addField(String field) {
		fields.add(field);
	}

	public void addKvs(String booleanStr, Object value) {
		kvs.put(booleanStr, value);
	}
	
	public void addAllField(Collection<String> coll){
		fields.addAll(coll);
	}

	
	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public Map<String, Object> getKvs() {
		return kvs;
	}

	public void setKvs(Map<String, Object> kvs) {
		this.kvs = kvs;
	}
	
	
}
