package com.guilin.antlr4.demo.aleiye.grammar.dm;
/**
 * 预测训练使用的
 * @author kongxp
 *
 */
public class PredictTrain extends BaseDMModel {
	public PredictTrain() {
		super("predict",0);
	}

	//训练时间 输入core表达式
	String core;
	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}
	
}
