grammar ProstyJezyk;

prog : start ;

start : assigne + print;

assigne : VARIABLE + EQUAL + INT;

print : SHOW_VAR + VARIABLE;

SHOW_VAR : 'drukuj';

EQUAL : '=' ;

VARIABLE : ('a'..'z'|'A'..'Z')+ ;

INT:   '0'..'9'+ ;




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
