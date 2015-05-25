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
		LESS=10, MORE=11, EQUAL_S=12, READ=13, PRINT=14, TOINT=15, TOREAL=16, 
		ID=17, ADD=18, MULT=19, SUBS=20, NAME=21, INT=22, REAL=23, STRING=24, 
		EQUAL=25, QUOTES=26, OP_BRACKET=27, CLO_BRACKET=28, COMMA=29, OP_BRACE=30, 
		CLO_BRACE=31, START_FUNCT=32, END_FUNCT=33, NEWLINE=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_function = 2, RULE_funct_arg = 3, 
		RULE_funct_body = 4, RULE_if_definition = 5, RULE_if_condition = 6, RULE_if_body = 7, 
		RULE_else_definition = 8, RULE_else_body = 9, RULE_while_definition = 10, 
		RULE_while_cond = 11, RULE_while_body = 12, RULE_compare_first = 13, RULE_compare_second = 14, 
		RULE_compare_sign = 15, RULE_value = 16, RULE_array = 17, RULE_el_in_array = 18, 
		RULE_var_type = 19, RULE_expr0 = 20, RULE_expr1 = 21, RULE_expr2 = 22, 
		RULE_t_STRING = 23, RULE_t_INT = 24, RULE_t_REAL = 25, RULE_t_ARRAY = 26, 
		RULE_t_VOID = 27, RULE_f_PRINT = 28, RULE_f_READ = 29;
	public static final String[] ruleNames = {
		"prog", "start", "function", "funct_arg", "funct_body", "if_definition", 
		"if_condition", "if_body", "else_definition", "else_body", "while_definition", 
		"while_cond", "while_body", "compare_first", "compare_second", "compare_sign", 
		"value", "array", "el_in_array", "var_type", "expr0", "expr1", "expr2", 
		"t_STRING", "t_INT", "t_REAL", "t_ARRAY", "t_VOID", "f_PRINT", "f_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'if'", "'else'", "'while'", "'string'", "'int'", "'real'", 
		"'array'", "'void'", "'<'", "'>'", "'=='", "'read'", "'print'", "'(int)'", 
		"'(real)'", null, "'+'", "'*'", "'-'", null, null, null, null, "'='", 
		"'\"'", "'['", "']'", "','", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "LESS", "MORE", 
		"EQUAL_S", "READ", "PRINT", "TOINT", "TOREAL", "ID", "ADD", "MULT", "SUBS", 
		"NAME", "INT", "REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", "CLO_BRACKET", 
		"COMMA", "OP_BRACE", "CLO_BRACE", "START_FUNCT", "END_FUNCT", "NEWLINE", 
		"WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
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
	public static class AssignContext extends StartContext {
		public TerminalNode ID() { return getToken(ProstyJezykParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StartContext {
		public TerminalNode READ() { return getToken(ProstyJezykParser.READ, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProstyJezykParser.ID, 0); }
		public ReadContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitRead(this);
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
	public static class PrintContext extends StartContext {
		public TerminalNode PRINT() { return getToken(ProstyJezykParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ProstyJezykParser.ID, 0); }
		public PrintContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69); 
				match(ID);
				setState(70); 
				match(EQUAL);
				setState(71); 
				expr0();
				}
				}
				break;
			case T__0:
				_localctx = new Enter_funContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72); 
				function();
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73); 
				match(PRINT);
				setState(74); 
				match(ID);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75); 
				match(READ);
				setState(76); 
				var_type();
				setState(77); 
				match(ID);
				}
				break;
			case T__1:
				_localctx = new Enter_ifContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79); 
				if_definition();
				}
				break;
			case T__3:
				_localctx = new Enter_whileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80); 
				while_definition();
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
			setState(83); 
			match(T__0);
			setState(84); 
			var_type();
			setState(85); 
			match(NAME);
			setState(86); 
			funct_arg();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(87); 
				match(NEWLINE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); 
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(95); 
				match(OP_BRACE);
				setState(96); 
				var_type();
				setState(97); 
				match(NAME);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98); 
					match(COMMA);
					setState(99); 
					var_type();
					setState(100); 
					match(NAME);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107); 
				match(CLO_BRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(109); 
				match(OP_BRACE);
				setState(110); 
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
			setState(113); 
			match(START_FUNCT);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(114); 
					start();
					}
				}

				setState(117); 
				match(NEWLINE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); 
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
			setState(125); 
			if_condition();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(126); 
				match(NEWLINE);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132); 
			if_body();
			setState(136);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(133); 
				else_definition();
				setState(134); 
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
			setState(138); 
			match(T__1);
			setState(139); 
			match(OP_BRACE);
			setState(140); 
			value();
			setState(141); 
			compare_sign();
			setState(142); 
			value();
			setState(143); 
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
			setState(145); 
			match(START_FUNCT);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(146); 
					start();
					}
				}

				setState(149); 
				match(NEWLINE);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); 
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
			setState(157); 
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
			setState(159); 
			match(START_FUNCT);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(160); 
					start();
					}
				}

				setState(163); 
				match(NEWLINE);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); 
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
			setState(171); 
			while_cond();
			setState(172); 
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
			setState(174); 
			match(T__3);
			setState(175); 
			match(OP_BRACE);
			setState(176); 
			compare_first();
			setState(177); 
			compare_sign();
			setState(178); 
			compare_second();
			setState(179); 
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
			setState(181); 
			match(START_FUNCT);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << READ) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(182); 
					start();
					}
				}

				setState(185); 
				match(NEWLINE);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191); 
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
			setState(193); 
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
			setState(195);
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
			setState(197);
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
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); 
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); 
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201); 
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202); 
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203); 
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204); 
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205); 
				el_in_array();
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
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(208); 
				match(OP_BRACKET);
				setState(209); 
				value();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210); 
					match(COMMA);
					setState(211); 
					value();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217); 
				match(CLO_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(219); 
				match(OP_BRACKET);
				setState(220); 
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
		enterRule(_localctx, 36, RULE_el_in_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			match(NAME);
			setState(224); 
			match(OP_BRACKET);
			setState(225); 
			match(INT);
			setState(226); 
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
		enterRule(_localctx, 38, RULE_var_type);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); 
				t_STRING();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); 
				t_INT();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); 
				t_REAL();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); 
				t_ARRAY();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); 
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitSingle0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitSingle0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(ProstyJezykParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr0);
		try {
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235); 
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); 
				expr1();
				setState(237); 
				match(ADD);
				setState(238); 
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(ProstyJezykParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitSingle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitSingle1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr1);
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242); 
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243); 
				expr2();
				setState(244); 
				match(MULT);
				setState(245); 
				expr2();
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(ProstyJezykParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitToreal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitToreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(ProstyJezykParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitToint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitToint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr2);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249); 
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); 
				match(REAL);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251); 
				match(TOINT);
				setState(252); 
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253); 
				match(TOREAL);
				setState(254); 
				expr2();
				}
				break;
			case OP_BRACE:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255); 
				match(OP_BRACE);
				setState(256); 
				expr0();
				setState(257); 
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
			setState(261); 
			match(T__4);
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
			setState(263); 
			match(T__5);
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
			setState(265); 
			match(T__6);
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
			setState(267); 
			match(T__7);
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
			setState(269); 
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
			setState(271); 
			match(PRINT);
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
			setState(273); 
			match(READ);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\5\3\5"+
		"\5\5r\n\5\3\6\3\6\5\6v\n\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\7\3\7"+
		"\7\7\u0082\n\7\f\7\16\7\u0085\13\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0096\n\t\3\t\7\t\u0099\n\t\f\t\16"+
		"\t\u009c\13\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00a4\n\13\3\13\7\13\u00a7"+
		"\n\13\f\13\16\13\u00aa\13\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u00ba\n\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0"+
		"\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00d1\n\22\3\23\3\23\3\23\3\23\7\23\u00d7\n\23\f\23\16"+
		"\23\u00da\13\23\3\23\3\23\3\23\3\23\5\23\u00e0\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ec\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f3\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0106\n\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\27"+
		"\31\3\2\f\16\u011d\2D\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2\bq\3\2\2\2\ns\3\2"+
		"\2\2\f\177\3\2\2\2\16\u008c\3\2\2\2\20\u0093\3\2\2\2\22\u009f\3\2\2\2"+
		"\24\u00a1\3\2\2\2\26\u00ad\3\2\2\2\30\u00b0\3\2\2\2\32\u00b7\3\2\2\2\34"+
		"\u00c3\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\"\u00d0\3\2\2\2$\u00df"+
		"\3\2\2\2&\u00e1\3\2\2\2(\u00eb\3\2\2\2*\u00f2\3\2\2\2,\u00f9\3\2\2\2."+
		"\u0105\3\2\2\2\60\u0107\3\2\2\2\62\u0109\3\2\2\2\64\u010b\3\2\2\2\66\u010d"+
		"\3\2\2\28\u010f\3\2\2\2:\u0111\3\2\2\2<\u0113\3\2\2\2>@\5\4\3\2?>\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AC\7$\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\3\3\2\2\2FD\3\2\2\2GH\7\23\2\2HI\7\33\2\2IT\5*\26\2JT\5\6\4\2KL"+
		"\7\20\2\2LT\7\23\2\2MN\7\17\2\2NO\5(\25\2OP\7\23\2\2PT\3\2\2\2QT\5\f\7"+
		"\2RT\5\26\f\2SG\3\2\2\2SJ\3\2\2\2SK\3\2\2\2SM\3\2\2\2SQ\3\2\2\2SR\3\2"+
		"\2\2T\5\3\2\2\2UV\7\3\2\2VW\5(\25\2WX\7\27\2\2X\\\5\b\5\2Y[\7$\2\2ZY\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\n\6\2"+
		"`\7\3\2\2\2ab\7 \2\2bc\5(\25\2cj\7\27\2\2de\7\37\2\2ef\5(\25\2fg\7\27"+
		"\2\2gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2"+
		"\2\2mn\7!\2\2nr\3\2\2\2op\7 \2\2pr\7!\2\2qa\3\2\2\2qo\3\2\2\2r\t\3\2\2"+
		"\2sz\7\"\2\2tv\5\4\3\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7$\2\2xu\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7#\2\2~\13\3\2"+
		"\2\2\177\u0083\5\16\b\2\u0080\u0082\7$\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008a\5\20\t\2\u0087\u0088\5\22\n\2\u0088\u0089\5"+
		"\24\13\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\r\3\2\2\2\u008c\u008d\7\4\2\2\u008d\u008e\7 \2\2\u008e\u008f\5\"\22\2"+
		"\u008f\u0090\5 \21\2\u0090\u0091\5\"\22\2\u0091\u0092\7!\2\2\u0092\17"+
		"\3\2\2\2\u0093\u009a\7\"\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7$\2\2\u0098\u0095\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7#\2\2\u009e\21\3\2\2\2"+
		"\u009f\u00a0\7\5\2\2\u00a0\23\3\2\2\2\u00a1\u00a8\7\"\2\2\u00a2\u00a4"+
		"\5\4\3\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\7$\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7#\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\5\32\16"+
		"\2\u00af\27\3\2\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\7 \2\2\u00b2\u00b3"+
		"\5\34\17\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6\7!\2"+
		"\2\u00b6\31\3\2\2\2\u00b7\u00be\7\"\2\2\u00b8\u00ba\5\4\3\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7$\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2"+
		"\33\3\2\2\2\u00c3\u00c4\7\27\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\t\2\2\2"+
		"\u00c6\37\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8!\3\2\2\2\u00c9\u00d1\7\30"+
		"\2\2\u00ca\u00d1\7\31\2\2\u00cb\u00d1\7\32\2\2\u00cc\u00d1\5$\23\2\u00cd"+
		"\u00d1\7\27\2\2\u00ce\u00d1\5$\23\2\u00cf\u00d1\5&\24\2\u00d0\u00c9\3"+
		"\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1#\3\2\2\2"+
		"\u00d2\u00d3\7\35\2\2\u00d3\u00d8\5\"\22\2\u00d4\u00d5\7\37\2\2\u00d5"+
		"\u00d7\5\"\22\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7\36\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de\7\35\2\2\u00de\u00e0\7"+
		"\36\2\2\u00df\u00d2\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0%\3\2\2\2\u00e1\u00e2"+
		"\7\27\2\2\u00e2\u00e3\7\35\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\36\2"+
		"\2\u00e5\'\3\2\2\2\u00e6\u00ec\5\60\31\2\u00e7\u00ec\5\62\32\2\u00e8\u00ec"+
		"\5\64\33\2\u00e9\u00ec\5\66\34\2\u00ea\u00ec\58\35\2\u00eb\u00e6\3\2\2"+
		"\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00f3\5,\27\2\u00ee\u00ef\5,\27\2\u00ef"+
		"\u00f0\7\24\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f3\3\2\2\2\u00f2\u00ed\3"+
		"\2\2\2\u00f2\u00ee\3\2\2\2\u00f3+\3\2\2\2\u00f4\u00fa\5.\30\2\u00f5\u00f6"+
		"\5.\30\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8\5.\30\2\u00f8\u00fa\3\2\2\2"+
		"\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa-\3\2\2\2\u00fb\u0106\7"+
		"\30\2\2\u00fc\u0106\7\31\2\2\u00fd\u00fe\7\21\2\2\u00fe\u0106\5.\30\2"+
		"\u00ff\u0100\7\22\2\2\u0100\u0106\5.\30\2\u0101\u0102\7 \2\2\u0102\u0103"+
		"\5*\26\2\u0103\u0104\7!\2\2\u0104\u0106\3\2\2\2\u0105\u00fb\3\2\2\2\u0105"+
		"\u00fc\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0101\3\2"+
		"\2\2\u0106/\3\2\2\2\u0107\u0108\7\7\2\2\u0108\61\3\2\2\2\u0109\u010a\7"+
		"\b\2\2\u010a\63\3\2\2\2\u010b\u010c\7\t\2\2\u010c\65\3\2\2\2\u010d\u010e"+
		"\7\n\2\2\u010e\67\3\2\2\2\u010f\u0110\7\13\2\2\u01109\3\2\2\2\u0111\u0112"+
		"\7\20\2\2\u0112;\3\2\2\2\u0113\u0114\7\17\2\2\u0114=\3\2\2\2\31?DS\\j"+
		"quz\u0083\u008a\u0095\u009a\u00a3\u00a8\u00b9\u00be\u00d0\u00d8\u00df"+
		"\u00eb\u00f2\u00f9\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}