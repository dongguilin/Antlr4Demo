package com.guilin.antlr4.demo.aleiye.grammar.stats.info;


/**
 * 时间报表语句封装
 * @author zhy
 *
 */
public class DateReportStatInfo extends ReportStatInfo{
	/*
	 * 周期（h、m、s、d）
	 */
	private String interval;
	/*
	 * 周期范围
	 */
	private int intervalNum;
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public int getIntervalNum() {
		return intervalNum;
	}
	public void setIntervalNum(int intervalNum) {
		this.intervalNum = intervalNum;
	}
}
