grammar Expr;

// tutaj definicja produkcji
// zaczynamy od pojedynczego obiektu
// ktory z kolei moze miec inne obiekt, tablice, wartosci, itp.
prog : object ;

object : ( START_OBJ key_val (COMMA key_val)* END_OBJ ) | ( START_OBJ END_OBJ );
// obiekt -> para klucz-wartoœæ [0..*]
// obiekt jest w { }
// za epsilon s³u¿y nam ()* - nie mo¿emy w antlr zrobiæ epsilona
// wiêc robimy to tak jak widaæ
// dodatkowo mo¿e byæ pusty obiekt

key_val : STRING COLON val ;
// para klucz-wartoœæ jest zawsze oddzielona dwukropkiem
// wartoœci¹ mo¿e byæ napis, liczba, inny obiekt, tablica, itp.

val :
    STRING |
    NUMBER |
    object |
    array  |
    TRUE   |
    FALSE  |
    NULL
    ;
// wartoœci to string, number, inny obiekt, tablica, true, false i null
// wartoœæ zawsze musi byæ niepusta, tzn. nie dopiszczalny
// jest zapis { "imie" : }

array : ( OP_BRACKET val (COMMA val)* CLO_BRACKET ) | (OP_BRACKET CLO_BRACKET) ;
// w tablicy mo¿emy mieæ wartoœci [0..*],  które z kolei mog¹ byæ obiektami - {...}
// tablicami - [...], napisami, itp. (to co wymieione w def. val)
// tablica te¿ mo¿e byæ pusta
// w odró¿nieny od obiektów w tablicy nie przechowujemy
// par klucz-wartoœæ tylko same wartoœci

// tutaj definiujemy co to jest STRING i NUMBER
// czyli symbole terminalne
STRING :  QUOTES (ESC | ~["\\])* QUOTES ;
NUMBER :  [0-9]+  ;

// tutaj definicja kolejnych symboli terminalnych
// ¿eby kod ³adniej wygl¹da³
OP_BRACKET : '[' ;
CLO_BRACKET :']' ;
COLON: ':' ;
START_OBJ : '{';
END_OBJ : '}';
COMMA : ',' ;
TRUE : 'true' ;
FALSE : 'false' ;
NULL : 'null' ;
QUOTES : '"' ;

//tutaj
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;
fragment INT :   '0' | [1-9] [0-9]* ;
fragment EXP :   [Ee] [+\-]? INT ;

// tutaj omijamy wszystkie spacje, entery, itp.
WS : [ \t\n\r]+ -> skip ;