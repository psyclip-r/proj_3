grammar json;

// tutaj definicja produkcji
// zaczynamy od pojedynczego obiektu
// ktory z kolei moze miec inne obiekt, tablice, wartosci, itp.
prog : object ;

object : ( START_OBJ key_val (COMMA key_val)* END_OBJ ) | ( START_OBJ END_OBJ );
// obiekt -> para klucz-warto�� [0..*]
// obiekt jest w { }
// za epsilon s�u�y nam ()* - nie mo�emy w antlr zrobi� epsilona
// wi�c robimy to tak jak wida�
// dodatkowo mo�e by� pusty obiekt

key_val : STRING COLON val ;
// para klucz-warto�� jest zawsze oddzielona dwukropkiem
// warto�ci� mo�e by� napis, liczba, inny obiekt, tablica, itp.

val :
    STRING |
    NUMBER |
    object |
    array  |
    TRUE   |
    FALSE  |
    NULL
    ;
// warto�ci to string, number, inny obiekt, tablica, true, false i null
// warto�� zawsze musi by� niepusta, tzn. nie dopiszczalny
// jest zapis { "imie" : }

array : ( OP_BRACKET val (COMMA val)* CLO_BRACKET ) | (OP_BRACKET CLO_BRACKET) ;
// w tablicy mo�emy mie� warto�ci [0..*],  kt�re z kolei mog� by� obiektami - {...}
// tablicami - [...], napisami, itp. (to co wymieione w def. val)
// tablica te� mo�e by� pusta
// w odr�nieny od obiekt�w w tablicy nie przechowujemy
// par klucz-warto�� tylko same warto�ci

// tutaj definiujemy co to jest STRING i NUMBER
// czyli symbole terminalne
STRING :  QUOTES (ESC | ~["\\])* QUOTES ;
NUMBER :  [0-9]+  ;

// tutaj definicja kolejnych symboli terminalnych
// �eby kod �adniej wygl�da�
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