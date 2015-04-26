// Generated from /home/kuba/IdeaProjects/proj_3/GrammarAntlr/g4/ProstyJezyk.g4 by ANTLR 4.5
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
	/**
	 * Enter a parse tree produced by the {@code assign_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull ProstyJezykParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull ProstyJezykParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull ProstyJezykParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull ProstyJezykParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ProstyJezykParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ProstyJezykParser.ValueContext ctx);
}