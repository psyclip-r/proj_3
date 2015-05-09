grammar ProstyJezyk;

prog : ( start? NEWLINE )* ;

start : ( var_type NAME '=' value ) | function | (f_PRINT value)  ;

function : NAME funct_arg NEWLINE* funct_body;

funct_arg : ( OP_BRACE var_type NAME (COMMA var_type NAME)* CLO_BRACE ) | (OP_BRACE CLO_BRACE) ;

funct_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

value : INT | REAL | STRING | array | NAME | array | el_in_array ;




array : ( OP_BRACKET value (COMMA value)* CLO_BRACKET ) | (OP_BRACKET CLO_BRACKET) ;
el_in_array : NAME OP_BRACKET INT CLO_BRACKET;

NEWLINE : '\r'? '\n' ;

var_type : t_STRING |
           t_INT    |
           t_REAL   |
           t_ARRAY
            ;

NAME : 'a'..'z'+ ;

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
OP_BRACE : '(' ;
CLO_BRACE : ')' ;
START_FUNCT : '{';
END_FUNCT : '}';



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

