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
	 * Enter a parse tree produced by {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull ProstyJezykParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull ProstyJezykParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ProstyJezykParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ProstyJezykParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#funct_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunct_arg(@NotNull ProstyJezykParser.Funct_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#funct_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunct_arg(@NotNull ProstyJezykParser.Funct_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#funct_body}.
	 * @param ctx the parse tree
	 */
	void enterFunct_body(@NotNull ProstyJezykParser.Funct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#funct_body}.
	 * @param ctx the parse tree
	 */
	void exitFunct_body(@NotNull ProstyJezykParser.Funct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#if_definition}.
	 * @param ctx the parse tree
	 */
	void enterIf_definition(@NotNull ProstyJezykParser.If_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#if_definition}.
	 * @param ctx the parse tree
	 */
	void exitIf_definition(@NotNull ProstyJezykParser.If_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(@NotNull ProstyJezykParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(@NotNull ProstyJezykParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#else_definition}.
	 * @param ctx the parse tree
	 */
	void enterElse_definition(@NotNull ProstyJezykParser.Else_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#else_definition}.
	 * @param ctx the parse tree
	 */
	void exitElse_definition(@NotNull ProstyJezykParser.Else_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#else_body}.
	 * @param ctx the parse tree
	 */
	void enterElse_body(@NotNull ProstyJezykParser.Else_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#else_body}.
	 * @param ctx the parse tree
	 */
	void exitElse_body(@NotNull ProstyJezykParser.Else_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#compare_sign}.
	 * @param ctx the parse tree
	 */
	void enterCompare_sign(@NotNull ProstyJezykParser.Compare_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#compare_sign}.
	 * @param ctx the parse tree
	 */
	void exitCompare_sign(@NotNull ProstyJezykParser.Compare_signContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(@NotNull ProstyJezykParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(@NotNull ProstyJezykParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(@NotNull ProstyJezykParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(@NotNull ProstyJezykParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(@NotNull ProstyJezykParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(@NotNull ProstyJezykParser.AtomExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull ProstyJezykParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull ProstyJezykParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#el_in_array}.
	 * @param ctx the parse tree
	 */
	void enterEl_in_array(@NotNull ProstyJezykParser.El_in_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#el_in_array}.
	 * @param ctx the parse tree
	 */
	void exitEl_in_array(@NotNull ProstyJezykParser.El_in_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(@NotNull ProstyJezykParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(@NotNull ProstyJezykParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#t_STRING}.
	 * @param ctx the parse tree
	 */
	void enterT_STRING(@NotNull ProstyJezykParser.T_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#t_STRING}.
	 * @param ctx the parse tree
	 */
	void exitT_STRING(@NotNull ProstyJezykParser.T_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#t_INT}.
	 * @param ctx the parse tree
	 */
	void enterT_INT(@NotNull ProstyJezykParser.T_INTContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#t_INT}.
	 * @param ctx the parse tree
	 */
	void exitT_INT(@NotNull ProstyJezykParser.T_INTContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#t_REAL}.
	 * @param ctx the parse tree
	 */
	void enterT_REAL(@NotNull ProstyJezykParser.T_REALContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#t_REAL}.
	 * @param ctx the parse tree
	 */
	void exitT_REAL(@NotNull ProstyJezykParser.T_REALContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#t_ARRAY}.
	 * @param ctx the parse tree
	 */
	void enterT_ARRAY(@NotNull ProstyJezykParser.T_ARRAYContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#t_ARRAY}.
	 * @param ctx the parse tree
	 */
	void exitT_ARRAY(@NotNull ProstyJezykParser.T_ARRAYContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#t_VOID}.
	 * @param ctx the parse tree
	 */
	void enterT_VOID(@NotNull ProstyJezykParser.T_VOIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#t_VOID}.
	 * @param ctx the parse tree
	 */
	void exitT_VOID(@NotNull ProstyJezykParser.T_VOIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#f_PRINT}.
	 * @param ctx the parse tree
	 */
	void enterF_PRINT(@NotNull ProstyJezykParser.F_PRINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#f_PRINT}.
	 * @param ctx the parse tree
	 */
	void exitF_PRINT(@NotNull ProstyJezykParser.F_PRINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#f_READ}.
	 * @param ctx the parse tree
	 */
	void enterF_READ(@NotNull ProstyJezykParser.F_READContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#f_READ}.
	 * @param ctx the parse tree
	 */
	void exitF_READ(@NotNull ProstyJezykParser.F_READContext ctx);
}