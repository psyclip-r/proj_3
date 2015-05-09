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
	 * Visit a parse tree produced by {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ProstyJezykParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ProstyJezykParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#funct_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_arg(@NotNull ProstyJezykParser.Funct_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#funct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunct_body(@NotNull ProstyJezykParser.Funct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ProstyJezykParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull ProstyJezykParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#el_in_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl_in_array(@NotNull ProstyJezykParser.El_in_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(@NotNull ProstyJezykParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#t_STRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_STRING(@NotNull ProstyJezykParser.T_STRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#t_INT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_INT(@NotNull ProstyJezykParser.T_INTContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#t_REAL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_REAL(@NotNull ProstyJezykParser.T_REALContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#t_ARRAY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_ARRAY(@NotNull ProstyJezykParser.T_ARRAYContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#f_PRINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_PRINT(@NotNull ProstyJezykParser.F_PRINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#f_READ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_READ(@NotNull ProstyJezykParser.F_READContext ctx);
}