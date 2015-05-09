grammar OldProstyJezyk;

prog : ( start? NEWLINE )* ;

start : VARIABLE '=' INT #assign_action | SHOW_VAR value #print_action ;

// assign : VARIABLE + '=' + INT;

// print : SHOW_VAR + value ;

value : INT | REAL | VARIABLE ;

SHOW_VAR : 'wyswietl';

EQUAL : '=' ;

VARIABLE : 'a'..'z'+ ;

INT:   '0'..'9'+ ;

REAL: '0'..'9'+ '.' '0'..'9'+;

NEWLINE : '\r'? '\n' ;


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

