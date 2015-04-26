import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;

/**
 * Created by kuba on 26.04.15.
 */
public class LLVMactionsPJ extends ProstyJezykBaseListener{

    HashMap<String, Integer> memory = new HashMap<String, Integer>();
    Integer value;

    @Override public void enterProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGeneratorPJ.enterProg();
    }

    @Override public void exitProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGeneratorPJ.exitProg();
    }


    @Override public void exitAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx) {
        Integer tmp = Integer.valueOf( ctx.INT().getText() );
        memory.put(ctx.VARIABLE().getText(), tmp);
        //System.out.println(ctx.VARIABLE().getText() + " = " + tmp);
    }


    @Override public void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx) {
        //System.out.println(value);
        LLVMGeneratorPJ.printInteger(value);
    }

    @Override public void exitValue(@NotNull ProstyJezykParser.ValueContext ctx) {
        if( ctx.VARIABLE() != null ){
            value = memory.get(ctx.VARIABLE().getText());
        }
        if( ctx.INT() != null ){
            Integer tmp = Integer.valueOf (ctx.INT().getText() );
            value = tmp;
        }
    }


}
