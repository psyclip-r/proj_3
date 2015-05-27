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
	 * Visit a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(@NotNull ProstyJezykParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enter_fun}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnter_fun(@NotNull ProstyJezykParser.Enter_funContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printID}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintID(@NotNull ProstyJezykParser.PrintIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull ProstyJezykParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enter_if}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnter_if(@NotNull ProstyJezykParser.Enter_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enter_while}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnter_while(@NotNull ProstyJezykParser.Enter_whileContext ctx);
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
	 * Visit a parse tree produced by {@link ProstyJezykParser#if_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_definition(@NotNull ProstyJezykParser.If_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(@NotNull ProstyJezykParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#while_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_definition(@NotNull ProstyJezykParser.While_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#while_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cond(@NotNull ProstyJezykParser.While_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#while_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_body(@NotNull ProstyJezykParser.While_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#compare_first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_first(@NotNull ProstyJezykParser.Compare_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#compare_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_second(@NotNull ProstyJezykParser.Compare_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProstyJezykParser#compare_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_sign(@NotNull ProstyJezykParser.Compare_signContext ctx);
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
	 * Visit a parse tree produced by the {@code blabla_1}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlabla_1(@NotNull ProstyJezykParser.Blabla_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull ProstyJezykParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substract}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstract(@NotNull ProstyJezykParser.SubstractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blabla_2}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlabla_2(@NotNull ProstyJezykParser.Blabla_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull ProstyJezykParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull ProstyJezykParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ProstyJezykParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull ProstyJezykParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(@NotNull ProstyJezykParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(@NotNull ProstyJezykParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull ProstyJezykParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ex_id_name}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx_id_name(@NotNull ProstyJezykParser.Ex_id_nameContext ctx);
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
	 * Visit a parse tree produced by {@link ProstyJezykParser#t_VOID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_VOID(@NotNull ProstyJezykParser.T_VOIDContext ctx);
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