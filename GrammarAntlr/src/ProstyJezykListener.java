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
	 * Enter a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(@NotNull ProstyJezykParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignValue}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(@NotNull ProstyJezykParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enter_fun}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterEnter_fun(@NotNull ProstyJezykParser.Enter_funContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enter_fun}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitEnter_fun(@NotNull ProstyJezykParser.Enter_funContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printID}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterPrintID(@NotNull ProstyJezykParser.PrintIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printID}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitPrintID(@NotNull ProstyJezykParser.PrintIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull ProstyJezykParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull ProstyJezykParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enter_if}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterEnter_if(@NotNull ProstyJezykParser.Enter_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enter_if}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitEnter_if(@NotNull ProstyJezykParser.Enter_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enter_while}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void enterEnter_while(@NotNull ProstyJezykParser.Enter_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enter_while}
	 * labeled alternative in {@link ProstyJezykParser#start}.
	 * @param ctx the parse tree
	 */
	void exitEnter_while(@NotNull ProstyJezykParser.Enter_whileContext ctx);
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
	 * Enter a parse tree produced by {@link ProstyJezykParser#while_definition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_definition(@NotNull ProstyJezykParser.While_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#while_definition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_definition(@NotNull ProstyJezykParser.While_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cond(@NotNull ProstyJezykParser.While_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cond(@NotNull ProstyJezykParser.While_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#while_body}.
	 * @param ctx the parse tree
	 */
	void enterWhile_body(@NotNull ProstyJezykParser.While_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#while_body}.
	 * @param ctx the parse tree
	 */
	void exitWhile_body(@NotNull ProstyJezykParser.While_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#compare_first}.
	 * @param ctx the parse tree
	 */
	void enterCompare_first(@NotNull ProstyJezykParser.Compare_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#compare_first}.
	 * @param ctx the parse tree
	 */
	void exitCompare_first(@NotNull ProstyJezykParser.Compare_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProstyJezykParser#compare_second}.
	 * @param ctx the parse tree
	 */
	void enterCompare_second(@NotNull ProstyJezykParser.Compare_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProstyJezykParser#compare_second}.
	 * @param ctx the parse tree
	 */
	void exitCompare_second(@NotNull ProstyJezykParser.Compare_secondContext ctx);
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
	 * Enter a parse tree produced by the {@code blabla_1}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void enterBlabla_1(@NotNull ProstyJezykParser.Blabla_1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blabla_1}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void exitBlabla_1(@NotNull ProstyJezykParser.Blabla_1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull ProstyJezykParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull ProstyJezykParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substract}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void enterSubstract(@NotNull ProstyJezykParser.SubstractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substract}
	 * labeled alternative in {@link ProstyJezykParser#ex_0}.
	 * @param ctx the parse tree
	 */
	void exitSubstract(@NotNull ProstyJezykParser.SubstractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blabla_2}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void enterBlabla_2(@NotNull ProstyJezykParser.Blabla_2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blabla_2}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void exitBlabla_2(@NotNull ProstyJezykParser.Blabla_2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull ProstyJezykParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull ProstyJezykParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull ProstyJezykParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ProstyJezykParser#ex_1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull ProstyJezykParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ProstyJezykParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ProstyJezykParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull ProstyJezykParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull ProstyJezykParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void enterToint(@NotNull ProstyJezykParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void exitToint(@NotNull ProstyJezykParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(@NotNull ProstyJezykParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(@NotNull ProstyJezykParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull ProstyJezykParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link ProstyJezykParser#ex_2}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull ProstyJezykParser.ParContext ctx);
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