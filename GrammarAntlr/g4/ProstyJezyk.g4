grammar ProstyJezyk;

prog : ( start? NEWLINE )* ;

start :
    ( ID_NAME '=' ex_0 ) #assignValue |
    function #enter_fun |
    PRINT ID_NAME #printID |
    READ var_type ID_NAME #read   |
    if_definition #enter_if |
    while_definition #enter_while |
    ID_NAME '++' #increase |
    ID_NAME '--' #decrease |
    'ffun' ID_NAME #run_fun
    ;

function : 'fun' var_type fname NEWLINE* funct_body;
//function : 'fun' var_type ID_NAME funct_arg NEWLINE* funct_body;
fname : ID_NAME;

funct_arg : ( OP_BRACE var_type NAME (COMMA var_type NAME)* CLO_BRACE ) | (OP_BRACE CLO_BRACE) ;
funct_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

if_definition :  if_condition NEWLINE* if_body;
if_condition : 'if' OP_BRACE value compare_sign value CLO_BRACE;
if_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;


while_definition : while_cond while_body;
// while_cond : 'loop' OP_BRACE compare_first compare_sign compare_second CLO_BRACE;
while_cond : 'while' OP_BRACE compare_first compare_sign compare_second CLO_BRACE;
while_body : START_FUNCT ( start? NEWLINE )* END_FUNCT;

compare_first : ID_NAME | INT | REAL;
compare_second : ID_NAME | INT | REAL;

compare_sign :
    LESS    |
    MORE    |
    EQUAL_S
    ;

value : INT | REAL | ID_NAME ;

var_type : t_INT    |
           t_REAL   |
           t_VOID;

ex_0:  ex_1			    #blabla_1
      | ex_1 ADD ex_1	#add
      | ex_1 SUBS ex_1  #substract;

ex_1:  ex_2			    #blabla_2
      | ex_2 MULT ex_2	#mult
      | ex_2 DIV ex_2   #div;

ex_2:   INT			    #int
       | REAL			#real
       | TOINT ex_2		#toint
       | TOREAL ex_2	#toreal
       | '(' ex_0 ')'	#par
       | ID_NAME        #ex_id_name
       ;


LESS : '<' ;
MORE : '>' ;
EQUAL_S: '==' ;
READ: 'read';
PRINT: 'print';
TOINT: '(int)';
TOREAL: '(real)';
ID_NAME:   ('a'..'z'|'A'..'Z')+;
ADD: '+';
MULT: '*';
SUBS: '-';
DIV: '/' ;
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

