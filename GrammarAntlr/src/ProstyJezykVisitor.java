// Generated from C:/Users/Kuba/IdeaProjects/proj_3/GrammarAntlr/g4\ProstyJezyk.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ProstyJezykParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#assigne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigne(@NotNull ProstyJezykParser.AssigneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wypisz}
	 * labeled alternative in {@link ProstyJezykParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisz(@NotNull ProstyJezykParser.WypiszContext ctx);
}