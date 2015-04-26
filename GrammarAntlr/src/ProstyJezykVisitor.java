// Generated from /home/kuba/IdeaProjects/proj_3/GrammarAntlr/g4/ProstyJezyk.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProstyJezykParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProstyJezykVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ProstyJezykParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_action(@NotNull ProstyJezykParser.Assign_actionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_action}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ProstyJezykParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull ProstyJezykParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ProstyJezykParser.ValueContext ctx);
}