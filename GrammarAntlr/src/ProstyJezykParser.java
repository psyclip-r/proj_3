// Generated from /home/kuba/IdeaProjects/proj_3/GrammarAntlr/g4/ProstyJezyk.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProstyJezykParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, LESS=16, MORE=17, 
		EQUAL_S=18, NEWLINE=19, NAME=20, INT=21, REAL=22, STRING=23, EQUAL=24, 
		QUOTES=25, OP_BRACKET=26, CLO_BRACKET=27, COMMA=28, OP_BRACE=29, CLO_BRACE=30, 
		START_FUNCT=31, END_FUNCT=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_function = 2, RULE_funct_arg = 3, 
		RULE_funct_body = 4, RULE_if_definition = 5, RULE_if_condition = 6, RULE_if_body = 7, 
		RULE_else_definition = 8, RULE_else_body = 9, RULE_while_definition = 10, 
		RULE_while_cond = 11, RULE_while_body = 12, RULE_compare_first = 13, RULE_compare_second = 14, 
		RULE_compare_sign = 15, RULE_value = 16, RULE_additionExp = 17, RULE_multiplyExp = 18, 
		RULE_atomExp = 19, RULE_array = 20, RULE_el_in_array = 21, RULE_var_type = 22, 
		RULE_t_STRING = 23, RULE_t_INT = 24, RULE_t_REAL = 25, RULE_t_ARRAY = 26, 
		RULE_t_VOID = 27, RULE_f_PRINT = 28, RULE_f_READ = 29;
	public static final String[] ruleNames = {
		"prog", "start", "function", "funct_arg", "funct_body", "if_definition", 
		"if_condition", "if_body", "else_definition", "else_body", "while_definition", 
		"while_cond", "while_body", "compare_first", "compare_second", "compare_sign", 
		"value", "additionExp", "multiplyExp", "atomExp", "array", "el_in_array", 
		"var_type", "t_STRING", "t_INT", "t_REAL", "t_ARRAY", "t_VOID", "f_PRINT", 
		"f_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'if'", "'else'", "'while'", "'+'", "'-'", "'*'", "'/'", 
		"'string'", "'int'", "'real'", "'array'", "'void'", "'print'", "'read'", 
		"'<'", "'>'", "'=='", null, null, null, null, null, "'='", "'\"'", "'['", 
		"']'", "','", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LESS", "MORE", "EQUAL_S", "NEWLINE", "NAME", 
		"INT", "REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", "CLO_BRACKET", 
		"COMMA", "OP_BRACE", "CLO_BRACE", "START_FUNCT", "END_FUNCT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProstyJezyk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProstyJezykParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(60); 
					start();
					}
				}

				setState(63); 
				match(NEWLINE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Enter_ifContext extends StartContext {
		public If_definitionContext if_definition() {
			return getRuleContext(If_definitionContext.class,0);
		}
		public Enter_ifContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEnter_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEnter_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEnter_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_actionContext extends StartContext {
		public F_PRINTContext f_PRINT() {
			return getRuleContext(F_PRINTContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Print_actionContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterPrint_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitPrint_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitPrint_action(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Enter_funContext extends StartContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Enter_funContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEnter_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEnter_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEnter_fun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Enter_readContext extends StartContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public F_READContext f_READ() {
			return getRuleContext(F_READContext.class,0);
		}
		public Enter_readContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEnter_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEnter_read(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEnter_read(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Enter_assignContext extends StartContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Enter_assignContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEnter_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEnter_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEnter_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Enter_whileContext extends StartContext {
		public While_definitionContext while_definition() {
			return getRuleContext(While_definitionContext.class,0);
		}
		public Enter_whileContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEnter_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEnter_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEnter_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Enter_assignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69); 
				var_type();
				setState(70); 
				match(NAME);
				setState(71); 
				match(EQUAL);
				setState(72); 
				value();
				}
				}
				break;
			case 2:
				_localctx = new Enter_funContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74); 
				function();
				}
				break;
			case 3:
				_localctx = new Print_actionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75); 
				f_PRINT();
				setState(76); 
				value();
				}
				break;
			case 4:
				_localctx = new Enter_readContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78); 
				var_type();
				setState(79); 
				match(NAME);
				setState(80); 
				match(EQUAL);
				setState(81); 
				f_READ();
				}
				break;
			case 5:
				_localctx = new Enter_ifContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83); 
				if_definition();
				}
				break;
			case 6:
				_localctx = new Enter_whileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84); 
				while_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public Funct_argContext funct_arg() {
			return getRuleContext(Funct_argContext.class,0);
		}
		public Funct_bodyContext funct_body() {
			return getRuleContext(Funct_bodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			match(T__0);
			setState(88); 
			var_type();
			setState(89); 
			match(NAME);
			setState(90); 
			funct_arg();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(91); 
				match(NEWLINE);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); 
			funct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funct_argContext extends ParserRuleContext {
		public TerminalNode OP_BRACE() { return getToken(ProstyJezykParser.OP_BRACE, 0); }
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(ProstyJezykParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ProstyJezykParser.NAME, i);
		}
		public TerminalNode CLO_BRACE() { return getToken(ProstyJezykParser.CLO_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProstyJezykParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProstyJezykParser.COMMA, i);
		}
		public Funct_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterFunct_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitFunct_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitFunct_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_argContext funct_arg() throws RecognitionException {
		Funct_argContext _localctx = new Funct_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funct_arg);
		int _la;
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(99); 
				match(OP_BRACE);
				setState(100); 
				var_type();
				setState(101); 
				match(NAME);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(102); 
					match(COMMA);
					setState(103); 
					var_type();
					setState(104); 
					match(NAME);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111); 
				match(CLO_BRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(113); 
				match(OP_BRACE);
				setState(114); 
				match(CLO_BRACE);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funct_bodyContext extends ParserRuleContext {
		public TerminalNode START_FUNCT() { return getToken(ProstyJezykParser.START_FUNCT, 0); }
		public TerminalNode END_FUNCT() { return getToken(ProstyJezykParser.END_FUNCT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public Funct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterFunct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitFunct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitFunct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funct_bodyContext funct_body() throws RecognitionException {
		Funct_bodyContext _localctx = new Funct_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			match(START_FUNCT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(119);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(118); 
					start();
					}
				}

				setState(121); 
				match(NEWLINE);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127); 
			match(END_FUNCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_definitionContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public Else_definitionContext else_definition() {
			return getRuleContext(Else_definitionContext.class,0);
		}
		public Else_bodyContext else_body() {
			return getRuleContext(Else_bodyContext.class,0);
		}
		public If_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterIf_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitIf_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitIf_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_definitionContext if_definition() throws RecognitionException {
		If_definitionContext _localctx = new If_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			if_condition();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(130); 
				match(NEWLINE);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); 
			if_body();
			setState(140);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(137); 
				else_definition();
				setState(138); 
				else_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode OP_BRACE() { return getToken(ProstyJezykParser.OP_BRACE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Compare_signContext compare_sign() {
			return getRuleContext(Compare_signContext.class,0);
		}
		public TerminalNode CLO_BRACE() { return getToken(ProstyJezykParser.CLO_BRACE, 0); }
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			match(T__1);
			setState(143); 
			match(OP_BRACE);
			setState(144); 
			value();
			setState(145); 
			compare_sign();
			setState(146); 
			value();
			setState(147); 
			match(CLO_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public TerminalNode START_FUNCT() { return getToken(ProstyJezykParser.START_FUNCT, 0); }
		public TerminalNode END_FUNCT() { return getToken(ProstyJezykParser.END_FUNCT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			match(START_FUNCT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(150); 
					start();
					}
				}

				setState(153); 
				match(NEWLINE);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); 
			match(END_FUNCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_definitionContext extends ParserRuleContext {
		public Else_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterElse_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitElse_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitElse_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_definitionContext else_definition() throws RecognitionException {
		Else_definitionContext _localctx = new Else_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_bodyContext extends ParserRuleContext {
		public TerminalNode START_FUNCT() { return getToken(ProstyJezykParser.START_FUNCT, 0); }
		public TerminalNode END_FUNCT() { return getToken(ProstyJezykParser.END_FUNCT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public Else_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterElse_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitElse_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitElse_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_bodyContext else_body() throws RecognitionException {
		Else_bodyContext _localctx = new Else_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			match(START_FUNCT);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(164); 
					start();
					}
				}

				setState(167); 
				match(NEWLINE);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); 
			match(END_FUNCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_definitionContext extends ParserRuleContext {
		public While_condContext while_cond() {
			return getRuleContext(While_condContext.class,0);
		}
		public While_bodyContext while_body() {
			return getRuleContext(While_bodyContext.class,0);
		}
		public While_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterWhile_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitWhile_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitWhile_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_definitionContext while_definition() throws RecognitionException {
		While_definitionContext _localctx = new While_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			while_cond();
			setState(176); 
			while_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_condContext extends ParserRuleContext {
		public TerminalNode OP_BRACE() { return getToken(ProstyJezykParser.OP_BRACE, 0); }
		public Compare_firstContext compare_first() {
			return getRuleContext(Compare_firstContext.class,0);
		}
		public Compare_signContext compare_sign() {
			return getRuleContext(Compare_signContext.class,0);
		}
		public Compare_secondContext compare_second() {
			return getRuleContext(Compare_secondContext.class,0);
		}
		public TerminalNode CLO_BRACE() { return getToken(ProstyJezykParser.CLO_BRACE, 0); }
		public While_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterWhile_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitWhile_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitWhile_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_condContext while_cond() throws RecognitionException {
		While_condContext _localctx = new While_condContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			match(T__3);
			setState(179); 
			match(OP_BRACE);
			setState(180); 
			compare_first();
			setState(181); 
			compare_sign();
			setState(182); 
			compare_second();
			setState(183); 
			match(CLO_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_bodyContext extends ParserRuleContext {
		public TerminalNode START_FUNCT() { return getToken(ProstyJezykParser.START_FUNCT, 0); }
		public TerminalNode END_FUNCT() { return getToken(ProstyJezykParser.END_FUNCT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ProstyJezykParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProstyJezykParser.NEWLINE, i);
		}
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public While_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterWhile_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitWhile_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitWhile_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_bodyContext while_body() throws RecognitionException {
		While_bodyContext _localctx = new While_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			match(START_FUNCT);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(186); 
					start();
					}
				}

				setState(189); 
				match(NEWLINE);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); 
			match(END_FUNCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_firstContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public Compare_firstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterCompare_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitCompare_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitCompare_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_firstContext compare_first() throws RecognitionException {
		Compare_firstContext _localctx = new Compare_firstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_secondContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public Compare_secondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterCompare_second(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitCompare_second(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitCompare_second(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_secondContext compare_second() throws RecognitionException {
		Compare_secondContext _localctx = new Compare_secondContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compare_second);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << INT) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compare_signContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(ProstyJezykParser.LESS, 0); }
		public TerminalNode MORE() { return getToken(ProstyJezykParser.MORE, 0); }
		public TerminalNode EQUAL_S() { return getToken(ProstyJezykParser.EQUAL_S, 0); }
		public Compare_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterCompare_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitCompare_sign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitCompare_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_signContext compare_sign() throws RecognitionException {
		Compare_signContext _localctx = new Compare_signContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compare_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << MORE) | (1L << EQUAL_S))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(ProstyJezykParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public El_in_arrayContext el_in_array() {
			return getRuleContext(El_in_arrayContext.class,0);
		}
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); 
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); 
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205); 
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); 
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207); 
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); 
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209); 
				el_in_array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(210); 
				additionExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionExpContext extends ParserRuleContext {
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAdditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAdditionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			multiplyExp();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				setState(218);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(214); 
					match(T__4);
					setState(215); 
					multiplyExp();
					}
					break;
				case T__5:
					{
					setState(216); 
					match(T__5);
					setState(217); 
					multiplyExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyExpContext extends ParserRuleContext {
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitMultiplyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitMultiplyExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			atomExp();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(228);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(224); 
					match(T__6);
					setState(225); 
					atomExp();
					}
					break;
				case T__7:
					{
					setState(226); 
					match(T__7);
					setState(227); 
					atomExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomExpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atomExp);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); 
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); 
				match(REAL);
				}
				break;
			case OP_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); 
				match(OP_BRACE);
				setState(236); 
				additionExp();
				setState(237); 
				match(CLO_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OP_BRACKET() { return getToken(ProstyJezykParser.OP_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CLO_BRACKET() { return getToken(ProstyJezykParser.CLO_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ProstyJezykParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProstyJezykParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(241); 
				match(OP_BRACKET);
				setState(242); 
				value();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(243); 
					match(COMMA);
					setState(244); 
					value();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250); 
				match(CLO_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(252); 
				match(OP_BRACKET);
				setState(253); 
				match(CLO_BRACKET);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class El_in_arrayContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ProstyJezykParser.NAME, 0); }
		public TerminalNode OP_BRACKET() { return getToken(ProstyJezykParser.OP_BRACKET, 0); }
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public TerminalNode CLO_BRACKET() { return getToken(ProstyJezykParser.CLO_BRACKET, 0); }
		public El_in_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el_in_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEl_in_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEl_in_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEl_in_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final El_in_arrayContext el_in_array() throws RecognitionException {
		El_in_arrayContext _localctx = new El_in_arrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_el_in_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			match(NAME);
			setState(257); 
			match(OP_BRACKET);
			setState(258); 
			match(INT);
			setState(259); 
			match(CLO_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public T_STRINGContext t_STRING() {
			return getRuleContext(T_STRINGContext.class,0);
		}
		public T_INTContext t_INT() {
			return getRuleContext(T_INTContext.class,0);
		}
		public T_REALContext t_REAL() {
			return getRuleContext(T_REALContext.class,0);
		}
		public T_ARRAYContext t_ARRAY() {
			return getRuleContext(T_ARRAYContext.class,0);
		}
		public T_VOIDContext t_VOID() {
			return getRuleContext(T_VOIDContext.class,0);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_type);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); 
				t_STRING();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(262); 
				t_INT();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); 
				t_REAL();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(264); 
				t_ARRAY();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(265); 
				t_VOID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_STRINGContext extends ParserRuleContext {
		public T_STRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_STRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterT_STRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitT_STRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitT_STRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_STRINGContext t_STRING() throws RecognitionException {
		T_STRINGContext _localctx = new T_STRINGContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_t_STRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_INTContext extends ParserRuleContext {
		public T_INTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_INT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterT_INT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitT_INT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitT_INT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_INTContext t_INT() throws RecognitionException {
		T_INTContext _localctx = new T_INTContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_t_INT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); 
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_REALContext extends ParserRuleContext {
		public T_REALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_REAL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterT_REAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitT_REAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitT_REAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_REALContext t_REAL() throws RecognitionException {
		T_REALContext _localctx = new T_REALContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_t_REAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_ARRAYContext extends ParserRuleContext {
		public T_ARRAYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_ARRAY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterT_ARRAY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitT_ARRAY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitT_ARRAY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_ARRAYContext t_ARRAY() throws RecognitionException {
		T_ARRAYContext _localctx = new T_ARRAYContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_t_ARRAY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_VOIDContext extends ParserRuleContext {
		public T_VOIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_VOID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterT_VOID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitT_VOID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitT_VOID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_VOIDContext t_VOID() throws RecognitionException {
		T_VOIDContext _localctx = new T_VOIDContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_t_VOID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_PRINTContext extends ParserRuleContext {
		public F_PRINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_PRINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterF_PRINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitF_PRINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitF_PRINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_PRINTContext f_PRINT() throws RecognitionException {
		F_PRINTContext _localctx = new F_PRINTContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_f_PRINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); 
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_READContext extends ParserRuleContext {
		public F_READContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_READ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterF_READ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitF_READ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitF_READ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_READContext f_READ() throws RecognitionException {
		F_READContext _localctx = new F_READContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_f_READ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16"+
		"\4b\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3"+
		"\5\3\5\3\5\3\5\5\5v\n\5\3\6\3\6\5\6z\n\6\3\6\7\6}\n\6\f\6\16\6\u0080\13"+
		"\6\3\6\3\6\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7\3\7\3\7\5"+
		"\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u009a\n\t\3\t\7\t"+
		"\u009d\n\t\f\t\16\t\u00a0\13\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00a8\n"+
		"\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00be\n\16\3\16\7\16\u00c1"+
		"\n\16\f\16\16\16\u00c4\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00e7\n\24\f\24\16\24\u00ea\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00f2\n\25\3\26\3\26\3\26\3\26\7\26\u00f8\n\26\f\26\16\26\u00fb"+
		"\13\26\3\26\3\26\3\26\3\26\5\26\u0101\n\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\26\30\3\2\22\24\u0125"+
		"\2D\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bu\3\2\2\2\nw\3\2\2\2\f\u0083\3\2\2"+
		"\2\16\u0090\3\2\2\2\20\u0097\3\2\2\2\22\u00a3\3\2\2\2\24\u00a5\3\2\2\2"+
		"\26\u00b1\3\2\2\2\30\u00b4\3\2\2\2\32\u00bb\3\2\2\2\34\u00c7\3\2\2\2\36"+
		"\u00c9\3\2\2\2 \u00cb\3\2\2\2\"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00e1\3"+
		"\2\2\2(\u00f1\3\2\2\2*\u0100\3\2\2\2,\u0102\3\2\2\2.\u010c\3\2\2\2\60"+
		"\u010e\3\2\2\2\62\u0110\3\2\2\2\64\u0112\3\2\2\2\66\u0114\3\2\2\28\u0116"+
		"\3\2\2\2:\u0118\3\2\2\2<\u011a\3\2\2\2>@\5\4\3\2?>\3\2\2\2?@\3\2\2\2@"+
		"A\3\2\2\2AC\7\25\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2"+
		"\2FD\3\2\2\2GH\5.\30\2HI\7\26\2\2IJ\7\32\2\2JK\5\"\22\2KX\3\2\2\2LX\5"+
		"\6\4\2MN\5:\36\2NO\5\"\22\2OX\3\2\2\2PQ\5.\30\2QR\7\26\2\2RS\7\32\2\2"+
		"ST\5<\37\2TX\3\2\2\2UX\5\f\7\2VX\5\26\f\2WG\3\2\2\2WL\3\2\2\2WM\3\2\2"+
		"\2WP\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\5\3\2\2\2YZ\7\3\2\2Z[\5.\30\2[\\\7\26"+
		"\2\2\\`\5\b\5\2]_\7\25\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b`\3\2\2\2cd\5\n\6\2d\7\3\2\2\2ef\7\37\2\2fg\5.\30\2gn\7\26\2\2"+
		"hi\7\36\2\2ij\5.\30\2jk\7\26\2\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7 \2\2rv\3\2\2\2st\7\37\2\2tv\7 \2"+
		"\2ue\3\2\2\2us\3\2\2\2v\t\3\2\2\2w~\7!\2\2xz\5\4\3\2yx\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{}\7\25\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\"\2\2\u0082\13\3\2\2"+
		"\2\u0083\u0087\5\16\b\2\u0084\u0086\7\25\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\20\t\2\u008b\u008c\5\22\n\2\u008c"+
		"\u008d\5\24\13\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0092\7\37\2\2\u0092"+
		"\u0093\5\"\22\2\u0093\u0094\5 \21\2\u0094\u0095\5\"\22\2\u0095\u0096\7"+
		" \2\2\u0096\17\3\2\2\2\u0097\u009e\7!\2\2\u0098\u009a\5\4\3\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\25\2\2"+
		"\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\"\2\2\u00a2"+
		"\21\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\23\3\2\2\2\u00a5\u00ac\7!\2\2\u00a6"+
		"\u00a8\5\4\3\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\7\25\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7\"\2\2\u00b0\25\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3"+
		"\5\32\16\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\37\2\2\u00b6"+
		"\u00b7\5\34\17\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba"+
		"\7 \2\2\u00ba\31\3\2\2\2\u00bb\u00c2\7!\2\2\u00bc\u00be\5\4\3\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\25"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\""+
		"\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\7\26\2\2\u00c8\35\3\2\2\2\u00c9\u00ca"+
		"\t\2\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc!\3\2\2\2\u00cd\u00d6"+
		"\7\27\2\2\u00ce\u00d6\7\30\2\2\u00cf\u00d6\7\31\2\2\u00d0\u00d6\5*\26"+
		"\2\u00d1\u00d6\7\26\2\2\u00d2\u00d6\5*\26\2\u00d3\u00d6\5,\27\2\u00d4"+
		"\u00d6\5$\23\2\u00d5\u00cd\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00cf\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00de\5&\24\2"+
		"\u00d8\u00d9\7\7\2\2\u00d9\u00dd\5&\24\2\u00da\u00db\7\b\2\2\u00db\u00dd"+
		"\5&\24\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e1\u00e8\5(\25\2\u00e2\u00e3\7\t\2\2\u00e3\u00e7\5(\25\2\u00e4\u00e5"+
		"\7\n\2\2\u00e5\u00e7\5(\25\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\'\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00f2\7\27\2\2\u00ec\u00f2\7\30\2\2\u00ed\u00ee"+
		"\7\37\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7 \2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2)\3\2\2\2"+
		"\u00f3\u00f4\7\34\2\2\u00f4\u00f9\5\"\22\2\u00f5\u00f6\7\36\2\2\u00f6"+
		"\u00f8\5\"\22\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7\35\2\2\u00fd\u0101\3\2\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0101\7"+
		"\35\2\2\u0100\u00f3\3\2\2\2\u0100\u00fe\3\2\2\2\u0101+\3\2\2\2\u0102\u0103"+
		"\7\26\2\2\u0103\u0104\7\34\2\2\u0104\u0105\7\27\2\2\u0105\u0106\7\35\2"+
		"\2\u0106-\3\2\2\2\u0107\u010d\5\60\31\2\u0108\u010d\5\62\32\2\u0109\u010d"+
		"\5\64\33\2\u010a\u010d\5\66\34\2\u010b\u010d\58\35\2\u010c\u0107\3\2\2"+
		"\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d/\3\2\2\2\u010e\u010f\7\13\2\2\u010f\61\3\2\2\2\u0110\u0111"+
		"\7\f\2\2\u0111\63\3\2\2\2\u0112\u0113\7\r\2\2\u0113\65\3\2\2\2\u0114\u0115"+
		"\7\16\2\2\u0115\67\3\2\2\2\u0116\u0117\7\17\2\2\u01179\3\2\2\2\u0118\u0119"+
		"\7\20\2\2\u0119;\3\2\2\2\u011a\u011b\7\21\2\2\u011b=\3\2\2\2\33?DW`nu"+
		"y~\u0087\u008e\u0099\u009e\u00a7\u00ac\u00bd\u00c2\u00d5\u00dc\u00de\u00e6"+
		"\u00e8\u00f1\u00f9\u0100\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}