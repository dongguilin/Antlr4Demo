/*
	Aleiye 的语法分析
 */
grammar Aleiye;
@header {
	import java.util.Map;
	import java.util.HashMap;
}

// explicitly define keyword token types to avoid implicit def warnings
tokens {
	STATS,
	BY,
	REPORT,
	DATEREPORT,
	OVER,
	ON,
	SPAN,
	LIMIT,
	COUNT,
	MAX,
	MIN,
	SUM,
	DCOUNT,
	AVG,
	TOP
}

@lexer::members {   // place this class member only in lexer
Map<String,Integer> keywords = new HashMap<String,Integer>() {{
	put("stats", AleiyeParser.STATS);
	put("by", AleiyeParser.BY);
	put("report", AleiyeParser.REPORT);
	put("datereport", AleiyeParser.DATEREPORT);
	put("over", AleiyeParser.OVER);
	put("on", AleiyeParser.ON);
	put("span", AleiyeParser.SPAN);
	put("limit", AleiyeParser.LIMIT);
	put("max",AleiyeParser.MAX);
	put("min",AleiyeParser.MIN);
	put("sum",AleiyeParser.SUM);
	put("count",AleiyeParser.COUNT);
	put("dcount",AleiyeParser.DCOUNT);
	put("avg",AleiyeParser.AVG);
	put("top", AleiyeParser.TOP);
}};
}

aleiye: expr NEWLINE?;

expr:
	|TOP topfun
	|REPORT reportfun
	|DATEREPORT  datereportfun
	|STATS statfun
	;

//top
topfun: (NUM)? ID;

//报表聚合统计
reportfun:  aggfun OVER ID (ON idsfun)? (limitexpression)? ;

//按时间粒度报表聚合统计
datereportfun: aggfun (ON idsfun)? spanexpression?;

//限制记录数
limitexpression: NUM;

//聚合统计
statfun: aggfun  (ON idsfun)? (limitexpression)?;

aggfun: statsexpression (',' statsexpression)*;

statsexpression: agg=(COUNT|MAX|MIN|SUM|AVG|DCOUNT) '('aggAttr')' ('as' aliasName)?;

spanexpression: SPAN '=' PERIOD;

byfun: BY idsfun;

idsfun: ID (',' ID)*;


//应用聚合函数的字段
aggAttr : ID;

//别名
aliasName:ID;

//字母、@、下划线开头的字符串
ID  :   [a-zA-Z@_][a-zA-Z0-9_\\-]*
		{
			if ( keywords.containsKey(getText()) ) {
				setType(keywords.get(getText())); //reset token type
			}
		}
;

//粒度
PERIOD :('0' | '1'..'9' '0'..'9'*)[yMwdhms];

LPAREN :'(';
RPAREN :')';

//整型
NUM :   '0' | '1'..'9' '0'..'9'* ;         // no leading zeros

//换行
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

STRING:'"'('""'|~'"')*'"';

WS  :   [ \t]+ -> skip ;