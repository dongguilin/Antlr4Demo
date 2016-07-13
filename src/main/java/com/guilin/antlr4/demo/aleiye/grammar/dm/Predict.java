package com.guilin.antlr4.demo.aleiye.grammar.dm;
/**
 *  预测使用的
 * @author kongxp
 *
 */
public class Predict extends BaseDMModel {
	public Predict() {
		super("predict",1);
	}
	/**
	 * 预测时间
	 */
	private String lead;
	/**
	 * 执行周期
	 */
	private String span;
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	public String getSpan() {
		return span;
	}
	public void setSpan(String span) {
		this.span = span;
	}
	@Override
	public String toString() {
		return super.toString()+",预测周期"+lead+",时间间隔"+span;
	}
	
	
	
}
