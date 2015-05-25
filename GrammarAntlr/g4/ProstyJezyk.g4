grammar ProstyJezyk;

prog : ( start? NEWLINE )* ;

start :
    ( ID '=' expr0 ) #assign |
    function #enter_fun |
    PRINT ID #print |
    READ var_type ID #read   |
    if_definition #enter_if |
    while_definition #enter_while ;

function : 'fun' var_type NAME funct_arg NEWLINE* funct_body;
funct_arg : ( OP_BRACE var_type NAME (COMMA var_type NAME)* CLO_BRACE ) | (OP_BRACE CLO_BRACE) ;
funct_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

if_definition :  if_condition NEWLINE* if_body (else_definition else_body)?;
if_condition : 'if' OP_BRACE value compare_sign value CLO_BRACE;
if_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;
else_definition : 'else' ;
else_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

while_definition : while_cond while_body;
while_cond : 'while' OP_BRACE compare_first compare_sign compare_second CLO_BRACE;
while_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

compare_first : NAME;
compare_second : NAME | INT | REAL;

compare_sign :
    LESS    |
    MORE    |
    EQUAL_S
    ;



LESS : '<' ;
MORE : '>' ;
EQUAL_S: '==' ;

value : INT | REAL | STRING | array | NAME | array | el_in_array ;

// tutaj startujemy

array : ( OP_BRACKET value (COMMA value)* CLO_BRACKET ) | (OP_BRACKET CLO_BRACKET) ;
el_in_array : NAME OP_BRACKET INT CLO_BRACKET;


var_type : t_STRING |
           t_INT    |
           t_REAL   |
           t_ARRAY  |
           t_VOID
            ;

// TUTAJ POCZATEK

expr0:  expr1			#single0
      | expr1 ADD expr1		#add
 //     | expr1 SUBS expr1     #substract
;

expr1:  expr2			#single1
      | expr2 MULT expr2	#mult
 //     | expr2 DIV expr2 #div

;

expr2:   INT			#int
       | REAL			#real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;


READ:   'read'
    ;

PRINT:	'print'
    ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;


ADD: '+'
    ;

MULT: '*'
    ;
SUBS: '-'
    ;

// TUTAJ KONIEC

NAME : 'a'..'z'+ ;


INT:   '0'..'9'+ ;
REAL: '0'..'9'+ '.' '0'..'9'+;
STRING :  QUOTES (ESC | ~["\\])* QUOTES ;

t_STRING: 'string' ;
t_INT : 'int' ;
t_REAL : 'real';
t_ARRAY : 'array';
t_VOID : 'void';

f_PRINT : 'print';
f_READ : 'read' ;

EQUAL : '=' ;
QUOTES : '"' ;
OP_BRACKET : '[' ;
CLO_BRACKET :']' ;
COMMA : ',' ;
OP_BRACE : '(' ;
CLO_BRACE : ')' ;
START_FUNCT : '{';
END_FUNCT : '}';

NEWLINE:	'\r'? '\n'
    ;

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

