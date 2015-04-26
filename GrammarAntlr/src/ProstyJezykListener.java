// Generated from C:/Users/Kuba/IdeaProjects/proj_3/GrammarAntlr/g4\ProstyJezyk.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProstyJezykParser}.
 */
public interface ProstyJezykListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ProstyJezykParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ProstyJezykParser.ProgContext ctx);
}