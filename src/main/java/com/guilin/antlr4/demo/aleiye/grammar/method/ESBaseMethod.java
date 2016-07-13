package com.guilin.antlr4.demo.aleiye.grammar.method;

import com.alibaba.fastjson.JSON;
import com.guilin.antlr4.demo.aleiye.grammar.Node;
import com.guilin.antlr4.demo.aleiye.grammar.NodeType;

import java.util.Map;

/**
 * ES使用的method 与翻译method不同的是，过程不再是翻译，而是在使用过程中直接进行值得计算 
 * @author kongxp
 * @since 2014-04-23
 *
 */
public abstract class ESBaseMethod extends Node {
	private static final long serialVersionUID = 5310582260004974812L;
	protected Map<String ,Object> params;
	
	public Map<String, Object> getParams() {
		return params;
	}


	public ESBaseMethod(Node pre, String id, Map<String, Object> params){
		super(pre, NodeType.ESMETHOD,id);
		this.params = params;
	}
	
	public ESBaseMethod(String id, Map<String, Object> params){
			super( NodeType.ESMETHOD, id);
			this.params = params;
	}
	
	private ESBaseMethod(Node pre, NodeType type, String id) {
		super(pre, type, id);
	}
	
	
	
	@Override
	public String toString() {
		return getMethodName()+"->"+JSON.toJSONString(params);
	}

	protected abstract String getMethodName();

	/** 
	 * 计算值
	 * @param values 应该是es在script中 获取的字段值 具体的输入输出与算法，应该是有具体的实现类知道。
	 * @return
	 */
	public abstract Object coverValue(Object... values) throws Exception;

	public abstract Boolean isMutilField();

}
