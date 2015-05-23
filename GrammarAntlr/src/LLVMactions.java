import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;

/**
 * Created by kuba on 26.04.15.
 */
public class LLVMactions extends ProstyJezykBaseListener{
    HashMap<String, Integer> int_memory = new HashMap<String, Integer>();
    HashMap<String, Double> real_memory = new HashMap<String, Double>();
    HashMap<String, String> string_memory = new HashMap<String, String>();

    Integer value;

    @Override public void enterProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.enterProg();
    }

    @Override public void exitProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.exitProg();
    }

    @Override public void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx) {
        //System.out.println(value);

        // LLVMGenerator.printInteger(value);
        if(ctx.value().INT() != null){
            Integer tmp = Integer.valueOf( ctx.value().INT().getText() );
            LLVMGenerator.printInteger(tmp);
        }
        if(ctx.value().REAL() != null){
            //not yet implemented
        }
        if(ctx.value().REAL() != null){
            //not yet implemented
        }

        if(ctx.value().NAME() != null){
            if( int_memory.get(ctx.value().NAME().getText()) != null ){
                LLVMGenerator.printInteger(int_memory.get(ctx.value().NAME().getText()));
            }
            if( real_memory.get(ctx.value().NAME().getText()) != null ){
                //not yet implemented
            }
            if( string_memory.get(ctx.value().NAME().getText()) != null ){
                // not yet implemented
            }

        }

    }

    // jak przypiszemy wartosc do zmiennej to zapisujemy
    // ja do tablicy pod okreslona nazwa
    @Override public void exitEnter_assign(@NotNull ProstyJezykParser.Enter_assignContext ctx) {
        if(ctx.var_type().getText().equalsIgnoreCase("int")){
            Integer tmp = Integer.valueOf( ctx.value().INT().getText() );
            int_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("real")){
            double tmp = Double.valueOf( ctx.value().REAL().getText() );
            real_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("string")){
            String tmp =  ctx.value().STRING().getText();
            string_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("array")){
            //not yet implemented
        }


    }

    // wiemy co drukowac dzieki funkcji exitValue
    // ktora zawsze przed wypisaniem sprawdza co jest do wypisania
    // - czy zmienna czy liczba -
    // a nastepnie umieszcza to w atrybucie value
    // stad kazde wywolanie exitPrint_action jest poprzedzone
    // wywolaniem exitValue


    // VALUE moze byc INT albo VARIABLE
    // jak INT to mamy do wyswietlenia liczbe - np. 32
    // a jak VARIABLE to zmienna - np. "a"
    @Override public void exitValue(@NotNull ProstyJezykParser.ValueContext ctx) {
        if( ctx.INT() == null ){
            // jak VARIABLE to nie null, to znaczy ze mamy do czynienia ze zmienna VARIABLE
            // zadeklarowana wczesniej, dlatego ja odczytujemy i wyswietlamy,
            // zmienna mamy w pamieci
            // przyklad kodu: "wyswietl x"
            value = int_memory.get(ctx.NAME().getText());
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

/*







*/

}
