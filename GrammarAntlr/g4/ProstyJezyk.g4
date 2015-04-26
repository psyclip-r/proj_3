grammar ProstyJezyk;

prog : ( start? NEWLINE )* ;

start : assign #assign_action | print #print_action ;

assign : VARIABLE + EQUAL + INT;

print : SHOW_VAR + value ;

value : INT | VARIABLE ;

SHOW_VAR : 'wyswietl';

EQUAL : '=' ;

VARIABLE : ('a'..'z'|'A'..'Z')+ ;

INT:   '0'..'9'+ ;


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

