import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

/**
 * Created by kuba on 26.04.15.
 */
public class LLVMactionsPJ extends ProstyJezykBaseListener{

    HashMap<String, Integer> memory = new HashMap<String, Integer>();
    int value;

    @Override public void enterProg(@NotNull ProstyJezykParser.ProgContext ctx) { }

    @Override public void exitAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx) {
        Integer tmp = Integer.valueOf( ctx.INT().getText() );
        memory.put(ctx.VARIABLE().getText(), tmp);
        System.out.println(ctx.VARIABLE().getText() + " = " +  tmp);
    }


    @Override public void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx) { }


}
