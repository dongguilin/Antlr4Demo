package com.guilin.antlr4.demo.aleiye.util;

import java.util.ArrayList;

/**
 * 报表分为在处理数据时 分为两种，trem分组 和 stat 函数<br/>
 * 另外需要关心该节点时x轴还是y轴,整个node是个目录结构
 * @author kongxp
 *
 */
public class AggNode {
	
	private String name;
	private ArrayList<AggNode> kids = new ArrayList<>();
	private XY xy;
	private AggNodeType type;
	public AggNode() {
		super();
	}
	
	public AggNode(String name, AggNodeType type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<AggNode> getKids() {
		return kids;
	}
	public void setKids(ArrayList<AggNode> kids) {
		this.kids = kids;
	}
	public XY getXy() {
		return xy;
	}
	public void setXy(XY xy) {
		this.xy = xy;
	}
	public AggNodeType getType() {
		return type;
	}
	public void setType(AggNodeType type) {
		this.type = type;
	}
	
	public void addKid(AggNode kid){
		this.kids.add(kid);
	}

	@Override
	public String toString() {
		return name+":"+xy+":"+type+":"+kids.size();
	
	}
	
	
	
}
