package com.guilin.antlr4.demo.aleiye.grammar.dm;

import java.util.HashMap;
import java.util.Map;

/**
 * MD语义解析的基本类，这个类定义了model的基本属性。
 * 在语义解析式构建不同的实现类
 * @author kongxp
 * @since 2014-04-03 14:45
 */
public abstract class BaseDMModel {
	
	
	//类型 如果预测、分类、聚类等 
	protected  String  type;
	
	//算法
	protected  String algorithm;
	
	//参数
	protected Map<String,String> params = new HashMap<>();
	
	//模型名称
	protected String modelName;
	
	//流程类型，训练模型0  使用模型1
	protected int wolkflow;
	
	
	
	private BaseDMModel(){};
	
	public BaseDMModel(String type){
		this.type = type;
	}
	public BaseDMModel(String type,int workflow){
		this(type);
		this.wolkflow = workflow;
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void addParam(String key ,String value){
		params.put(key, value);
	}
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "模型名称:"+modelName+",类型:"+type+"，算法："+algorithm+",参数"+params;
	}

	public int getWolkflow() {
		return wolkflow;
	}

	public void setWolkflow(int wolkflow) {
		this.wolkflow = wolkflow;
	}
	
	
}
