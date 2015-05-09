import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;

/**
 * Created by kuba on 26.04.15.
 */
public class LLVMactions extends ProstyJezykBaseListener{
/*
    HashMap<String, Integer> memory = new HashMap<String, Integer>();
    Integer value;

    @Override public void enterProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.enterProg();
    }

    @Override public void exitProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.exitProg();
    }

    // jak przypiszemy wartosc do zmiennej to zapisujemy
    // ja do tablicy pod okreslona nazwa
    @Override public void exitAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx) {
        Integer tmp = Integer.valueOf( ctx.INT().getText() );
        // do pamieci wkladamy zmienna za pomoca tablicy klucz-wartosc, np x=3 => klucz x, wartosc 3 => x=
        memory.put(ctx.VARIABLE().getText(), tmp);
        //System.out.println(ctx.VARIABLE().getText() + " = " + tmp);
    }

    // wiemy co drukowac dzieki funkcji exitValue
    // ktora zawsze przed wypisaniem sprawdza co jest do wypisania
    // - czy zmienna czy liczba -
    // a nastepnie umieszcza to w atrybucie value
    // stad kazde wywolanie exitPrint_action jest poprzedzone
    // wywolaniem exitValue
    @Override public void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx) {
        //System.out.println(value);
        LLVMGenerator.printInteger(value);
    }

    // VALUE moze byc INT albo VARIABLE
    // jak INT to mamy do wyswietlenia liczbe - np. 32
    // a jak VARIABLE to zmienna - np. "a"
    @Override public void exitValue(@NotNull ProstyJezykParser.ValueContext ctx) {
        if( ctx.VARIABLE() != null ){
            // jak VARIABLE to nie null, to znaczy ze mamy do czynienia ze zmienna VARIABLE
            // zadeklarowana wczesniej, dlatego ja odczytujemy i wyswietlamy,
            // zmienna mamy w pamieci
            // przyklad kodu: "wyswietl x"
            value = memory.get(ctx.VARIABLE().getText());
        }
        if( ctx.INT() != null ){
            // jak zmienna to INT
            // to znaczy ze mamy do wyswietlenia LIICZBE, a nie zmienna
            // czyli wyswietlamy to co tam uzytownik wpisal
            // przyklad kodu: "wyswietl 13"
            Integer tmp = Integer.valueOf (ctx.INT().getText() );
            value = tmp;
        }
    }
*/

}
