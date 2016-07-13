package com.guilin.antlr4.demo.aleiye.grammar.wrap;

import com.guilin.antlr4.demo.aleiye.grammar.stats.BaseStat;
import com.guilin.antlr4.demo.aleiye.grammar.stats.info.FieldInfo;
import com.guilin.antlr4.demo.aleiye.grammar.util.NodeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Map;


/**
 * SQL封装基类
 * @author zhy
 *
 */
public abstract class BaseWrapSql implements BaseWrap{

	protected BaseStat baseStat;
	
	protected NodeWalker walker;
	
	protected String tempSql;
	
	protected Map<String,String> dist;
	
	protected ParserRuleContext ctx;
	
	public BaseWrapSql(ParserRuleContext ctx,NodeWalker walker,String tempSql,Map<String,String> dist){
		this.ctx = ctx;
		this.walker = walker;
		this.tempSql = tempSql;
		this.dist = dist;
	}
	/**
	 * @param baseStat 统计实体函数集合
	 * @param fields 节点集合
	 */
	public BaseWrapSql(BaseStat baseStat,NodeWalker walker,String tempSql,Map<String,String> dist){
		this.baseStat = baseStat;
		this.walker = walker;
		this.tempSql = tempSql;
		this.dist = dist;
	}
	
	public String wrap(){
		return convertHiveSql();
	}
	/**
	 * SQL转换
	 * @return
	 */
	public abstract String convertHiveSql();
	
	/**
	 * 通过EVLA栈获取字段或者变量值
	 * @param sql
	 * @param fieldInfo
	 */
	protected void getFieldSql(StringBuffer sql, FieldInfo fieldInfo) {
		String sqlFeild = null;
		if(fieldInfo.getCursorEnable()){
			sqlFeild = walker.fieldString(fieldInfo.getFieldName(),false,null);
			sql.append(fieldInfo.getVarStr(sqlFeild)+" as "+fieldInfo.getFieldName()+fieldInfo.getCursor()+"_"+"," );
		}else{
			sqlFeild = walker.fieldString(fieldInfo.getFieldName(),true,fieldInfo.getFieldName());
			sql.append(sqlFeild+",");
		}
	}
}
