package com.guilin.antlr4.demo.aleiye.grammar.method;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * 用于es的参数使用.method是由method的json。
 * 
 * @author kongxp
 * 
 */
public class TranModel {

	String type;
	/*这个计算过程的需要的其他变量*/
	List<TranModel> ms = new ArrayList<TranModel>();
	private String field;
	private List<String> method;
	private Map<String,TranModel> calParams;
	
	//
	private Map<String,TranModel> ids = new LinkedHashMap<>();
	private Map<String,Object> kv = new HashMap<String, Object>();
	

	public Map<String, TranModel> getCalParams() {
		return calParams;
	}

	public void setCalParams(Map<String, TranModel> calParams) {
		this.calParams = calParams;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public List<String> getMethod() {
		return method;
	}

	public void setMethod(List<String> method) {
		this.method = method;
	}

	public List<TranModel> getMs() {
		return ms;
	}

	public void setMs(List<TranModel> ms) {
		this.ms = ms;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public Map<String, TranModel> getIds() {
		return ids;
	}

	public void setIds(Map<String, TranModel> ids) {
		this.ids = ids;
	}

	public Map<String, Object> getKv() {
		return kv;
	}

	public void setKv(Map<String, Object> kv) {
		this.kv = kv;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	
	

}
