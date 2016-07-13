package com.guilin.antlr4.demo.aleiye.grammar.stats;

import java.util.ArrayList;
import java.util.List;

public class ConverChain implements ConverSql{
	List<ConverSql> converSqlList = new ArrayList<>();
	int index = 0;
	public ConverChain addConverSql(ConverSql converSql){
		converSqlList.add(converSql);
		return this;
	}
	@Override
	public void doConver(String sql, ConverChain converChain) {
		if(index == converSqlList.size())
			return;
		index++;
		doConver(sql,converChain);
	}
}
