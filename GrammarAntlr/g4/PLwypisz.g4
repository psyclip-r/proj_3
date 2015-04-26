grammar PLwypisz;

prog: ( stat? NEWLINE )*
    ;

stat:   PRINT value		#print
       |    ID '=' STRING       #assign
   ;

value: ID
       | STRING
   ;

PRINT:	'napisz'
   ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;
ID:   ('a'..'z'|'A'..'Z')+
   ;

INT:   '0'..'9'+
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
