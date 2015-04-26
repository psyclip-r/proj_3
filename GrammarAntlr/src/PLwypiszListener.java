// Generated from C:/Users/Kuba/IdeaProjects/proj_3/GrammarAntlr/g4\PLwypisz.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLwypiszParser}.
 */
public interface PLwypiszListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLwypiszParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PLwypiszParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLwypiszParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PLwypiszParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link PLwypiszParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull PLwypiszParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link PLwypiszParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull PLwypiszParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PLwypiszParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull PLwypiszParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PLwypiszParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull PLwypiszParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLwypiszParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull PLwypiszParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLwypiszParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull PLwypiszParser.ValueContext ctx);
}