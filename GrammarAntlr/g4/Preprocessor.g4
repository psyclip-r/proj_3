grammar Preprocessor;

prog : include;

include : '#include ' file;

file : '$' FILENAME '$';

FILENAME : ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+ '.ll' ;

WS : [ \t\n\r]+ -> skip ;