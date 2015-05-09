grammar ProstyJezyk;

prog : ( start? NEWLINE )* ;

start : ( var_type VAR_NAME '=' value ) |  f_PRINT value;
value : INT | REAL | STRING | array | VAR_NAME | array | el_in_array ;

VAR_NAME : 'a'..'z'+ ;


array : ( OP_BRACKET value (COMMA value)* CLO_BRACKET ) | (OP_BRACKET CLO_BRACKET) ;
el_in_array : VAR_NAME OP_BRACKET INT CLO_BRACKET;

NEWLINE : '\r'? '\n' ;

var_type : t_STRING |
           t_INT    |
           t_REAL   |
           t_ARRAY
            ;


INT:   '0'..'9'+ ;
REAL: '0'..'9'+ '.' '0'..'9'+;
STRING :  QUOTES (ESC | ~["\\])* QUOTES ;

t_STRING: 'string' ;
t_INT : 'int' ;
t_REAL : 'real';
t_ARRAY : 'array';

f_PRINT : 'print';
f_READ : 'czytaj' ;

EQUAL : '=' ;
QUOTES : '"' ;
OP_BRACKET : '[' ;
CLO_BRACKET :']' ;
COMMA : ',' ;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

// fragment INT :   '0' | [1-9] [0-9]* ;

fragment EXP :   [Ee] [+\-]? INT ;

// tutaj omijamy wszystkie spacje, entery, itp.
WS  :   ( [ \t\r\n] | COMMENT) -> skip;
fragment COMMENT
: '/*'.*'*/' /*single comment*/
| '//'~('\r' | '\n')* /* multiple comment*/
;

