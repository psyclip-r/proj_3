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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LESS=9, 
		MORE=10, EQUAL_S=11, READ=12, PRINT=13, TOINT=14, TOREAL=15, ID_NAME=16, 
		ADD=17, MULT=18, SUBS=19, DIV=20, NAME=21, INT=22, REAL=23, STRING=24, 
		EQUAL=25, QUOTES=26, OP_BRACKET=27, CLO_BRACKET=28, COMMA=29, OP_BRACE=30, 
		CLO_BRACE=31, START_FUNCT=32, END_FUNCT=33, NEWLINE=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_function = 2, RULE_funct_arg = 3, 
		RULE_funct_body = 4, RULE_if_definition = 5, RULE_if_condition = 6, RULE_if_body = 7, 
		RULE_while_definition = 8, RULE_while_cond = 9, RULE_while_body = 10, 
		RULE_compare_first = 11, RULE_compare_second = 12, RULE_compare_sign = 13, 
		RULE_value = 14, RULE_array = 15, RULE_el_in_array = 16, RULE_var_type = 17, 
		RULE_ex_0 = 18, RULE_ex_1 = 19, RULE_ex_2 = 20, RULE_t_STRING = 21, RULE_t_INT = 22, 
		RULE_t_REAL = 23, RULE_t_ARRAY = 24, RULE_t_VOID = 25, RULE_f_PRINT = 26, 
		RULE_f_READ = 27;
	public static final String[] ruleNames = {
		"prog", "start", "function", "funct_arg", "funct_body", "if_definition", 
		"if_condition", "if_body", "while_definition", "while_cond", "while_body", 
		"compare_first", "compare_second", "compare_sign", "value", "array", "el_in_array", 
		"var_type", "ex_0", "ex_1", "ex_2", "t_STRING", "t_INT", "t_REAL", "t_ARRAY", 
		"t_VOID", "f_PRINT", "f_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'if'", "'while'", "'string'", "'int'", "'real'", "'array'", 
		"'void'", "'<'", "'>'", "'=='", "'read'", "'print'", "'(int)'", "'(real)'", 
		null, "'+'", "'*'", "'-'", "'/'", null, null, null, null, "'='", "'\"'", 
		"'['", "']'", "','", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "LESS", "MORE", 
		"EQUAL_S", "READ", "PRINT", "TOINT", "TOREAL", "ID_NAME", "ADD", "MULT", 
		"SUBS", "DIV", "NAME", "INT", "REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", 
		"CLO_BRACKET", "COMMA", "OP_BRACE", "CLO_BRACE", "START_FUNCT", "END_FUNCT", 
		"NEWLINE", "WS"
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME))) != 0)) {
					{
					setState(56); 
					start();
					}
				}

				setState(59); 
				match(NEWLINE);
				}
				}
				setState(64);
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
	public static class AssignValueContext extends StartContext {
		public TerminalNode ID_NAME() { return getToken(ProstyJezykParser.ID_NAME, 0); }
		public Ex_0Context ex_0() {
			return getRuleContext(Ex_0Context.class,0);
		}
		public AssignValueContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StartContext {
		public TerminalNode READ() { return getToken(ProstyJezykParser.READ, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID_NAME() { return getToken(ProstyJezykParser.ID_NAME, 0); }
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
	public static class PrintIDContext extends StartContext {
		public TerminalNode PRINT() { return getToken(ProstyJezykParser.PRINT, 0); }
		public TerminalNode ID_NAME() { return getToken(ProstyJezykParser.ID_NAME, 0); }
		public PrintIDContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterPrintID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitPrintID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitPrintID(this);
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
			setState(77);
			switch (_input.LA(1)) {
			case ID_NAME:
				_localctx = new AssignValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(65); 
				match(ID_NAME);
				setState(66); 
				match(EQUAL);
				setState(67); 
				ex_0();
				}
				}
				break;
			case T__0:
				_localctx = new Enter_funContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68); 
				function();
				}
				break;
			case PRINT:
				_localctx = new PrintIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69); 
				match(PRINT);
				setState(70); 
				match(ID_NAME);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71); 
				match(READ);
				setState(72); 
				var_type();
				setState(73); 
				match(ID_NAME);
				}
				break;
			case T__1:
				_localctx = new Enter_ifContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75); 
				if_definition();
				}
				break;
			case T__2:
				_localctx = new Enter_whileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76); 
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
			setState(79); 
			match(T__0);
			setState(80); 
			var_type();
			setState(81); 
			match(NAME);
			setState(82); 
			funct_arg();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(83); 
				match(NEWLINE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); 
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91); 
				match(OP_BRACE);
				setState(92); 
				var_type();
				setState(93); 
				match(NAME);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(94); 
					match(COMMA);
					setState(95); 
					var_type();
					setState(96); 
					match(NAME);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103); 
				match(CLO_BRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(105); 
				match(OP_BRACE);
				setState(106); 
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
			setState(109); 
			match(START_FUNCT);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(111);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME))) != 0)) {
					{
					setState(110); 
					start();
					}
				}

				setState(113); 
				match(NEWLINE);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); 
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
			setState(121); 
			if_condition();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(122); 
				match(NEWLINE);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128); 
			if_body();
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
			setState(130); 
			match(T__1);
			setState(131); 
			match(OP_BRACE);
			setState(132); 
			value();
			setState(133); 
			compare_sign();
			setState(134); 
			value();
			setState(135); 
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
			setState(137); 
			match(START_FUNCT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME))) != 0)) {
					{
					setState(138); 
					start();
					}
				}

				setState(141); 
				match(NEWLINE);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); 
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
		enterRule(_localctx, 16, RULE_while_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			while_cond();
			setState(150); 
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
		enterRule(_localctx, 18, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			match(T__2);
			setState(153); 
			match(OP_BRACE);
			setState(154); 
			compare_first();
			setState(155); 
			compare_sign();
			setState(156); 
			compare_second();
			setState(157); 
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
		enterRule(_localctx, 20, RULE_while_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			match(START_FUNCT);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << READ) | (1L << PRINT) | (1L << ID_NAME))) != 0)) {
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
		enterRule(_localctx, 22, RULE_compare_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
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
		enterRule(_localctx, 24, RULE_compare_second);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 26, RULE_compare_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		public TerminalNode ID_NAME() { return getToken(ProstyJezykParser.ID_NAME, 0); }
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
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); 
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); 
				match(REAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); 
				match(STRING);
				}
				break;
			case OP_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(180); 
				array();
				}
				break;
			case ID_NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(181); 
				match(ID_NAME);
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
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(184); 
				match(OP_BRACKET);
				setState(185); 
				value();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186); 
					match(COMMA);
					setState(187); 
					value();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193); 
				match(CLO_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(195); 
				match(OP_BRACKET);
				setState(196); 
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
		enterRule(_localctx, 32, RULE_el_in_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			match(NAME);
			setState(200); 
			match(OP_BRACKET);
			setState(201); 
			match(INT);
			setState(202); 
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
		enterRule(_localctx, 34, RULE_var_type);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); 
				t_STRING();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); 
				t_INT();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); 
				t_REAL();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(207); 
				t_ARRAY();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(208); 
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

	public static class Ex_0Context extends ParserRuleContext {
		public Ex_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex_0; }
	 
		public Ex_0Context() { }
		public void copyFrom(Ex_0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubstractContext extends Ex_0Context {
		public List<Ex_1Context> ex_1() {
			return getRuleContexts(Ex_1Context.class);
		}
		public Ex_1Context ex_1(int i) {
			return getRuleContext(Ex_1Context.class,i);
		}
		public TerminalNode SUBS() { return getToken(ProstyJezykParser.SUBS, 0); }
		public SubstractContext(Ex_0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterSubstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitSubstract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitSubstract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Blabla_1Context extends Ex_0Context {
		public Ex_1Context ex_1() {
			return getRuleContext(Ex_1Context.class,0);
		}
		public Blabla_1Context(Ex_0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterBlabla_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitBlabla_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitBlabla_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Ex_0Context {
		public List<Ex_1Context> ex_1() {
			return getRuleContexts(Ex_1Context.class);
		}
		public Ex_1Context ex_1(int i) {
			return getRuleContext(Ex_1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(ProstyJezykParser.ADD, 0); }
		public AddContext(Ex_0Context ctx) { copyFrom(ctx); }
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

	public final Ex_0Context ex_0() throws RecognitionException {
		Ex_0Context _localctx = new Ex_0Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_ex_0);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Blabla_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211); 
				ex_1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212); 
				ex_1();
				setState(213); 
				match(ADD);
				setState(214); 
				ex_1();
				}
				break;
			case 3:
				_localctx = new SubstractContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216); 
				ex_1();
				setState(217); 
				match(SUBS);
				setState(218); 
				ex_1();
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

	public static class Ex_1Context extends ParserRuleContext {
		public Ex_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex_1; }
	 
		public Ex_1Context() { }
		public void copyFrom(Ex_1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultContext extends Ex_1Context {
		public List<Ex_2Context> ex_2() {
			return getRuleContexts(Ex_2Context.class);
		}
		public Ex_2Context ex_2(int i) {
			return getRuleContext(Ex_2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(ProstyJezykParser.MULT, 0); }
		public MultContext(Ex_1Context ctx) { copyFrom(ctx); }
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
	public static class DivContext extends Ex_1Context {
		public List<Ex_2Context> ex_2() {
			return getRuleContexts(Ex_2Context.class);
		}
		public Ex_2Context ex_2(int i) {
			return getRuleContext(Ex_2Context.class,i);
		}
		public TerminalNode DIV() { return getToken(ProstyJezykParser.DIV, 0); }
		public DivContext(Ex_1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Blabla_2Context extends Ex_1Context {
		public Ex_2Context ex_2() {
			return getRuleContext(Ex_2Context.class,0);
		}
		public Blabla_2Context(Ex_1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterBlabla_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitBlabla_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitBlabla_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ex_1Context ex_1() throws RecognitionException {
		Ex_1Context _localctx = new Ex_1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_ex_1);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Blabla_2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222); 
				ex_2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223); 
				ex_2();
				setState(224); 
				match(MULT);
				setState(225); 
				ex_2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227); 
				ex_2();
				setState(228); 
				match(DIV);
				setState(229); 
				ex_2();
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

	public static class Ex_2Context extends ParserRuleContext {
		public Ex_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex_2; }
	 
		public Ex_2Context() { }
		public void copyFrom(Ex_2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends Ex_2Context {
		public Ex_0Context ex_0() {
			return getRuleContext(Ex_0Context.class,0);
		}
		public ParContext(Ex_2Context ctx) { copyFrom(ctx); }
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
	public static class RealContext extends Ex_2Context {
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public RealContext(Ex_2Context ctx) { copyFrom(ctx); }
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
	public static class TorealContext extends Ex_2Context {
		public TerminalNode TOREAL() { return getToken(ProstyJezykParser.TOREAL, 0); }
		public Ex_2Context ex_2() {
			return getRuleContext(Ex_2Context.class,0);
		}
		public TorealContext(Ex_2Context ctx) { copyFrom(ctx); }
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
	public static class Ex_id_nameContext extends Ex_2Context {
		public TerminalNode ID_NAME() { return getToken(ProstyJezykParser.ID_NAME, 0); }
		public Ex_id_nameContext(Ex_2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterEx_id_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitEx_id_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitEx_id_name(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Ex_2Context {
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public IntContext(Ex_2Context ctx) { copyFrom(ctx); }
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
	public static class TointContext extends Ex_2Context {
		public TerminalNode TOINT() { return getToken(ProstyJezykParser.TOINT, 0); }
		public Ex_2Context ex_2() {
			return getRuleContext(Ex_2Context.class,0);
		}
		public TointContext(Ex_2Context ctx) { copyFrom(ctx); }
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

	public final Ex_2Context ex_2() throws RecognitionException {
		Ex_2Context _localctx = new Ex_2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_ex_2);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); 
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234); 
				match(REAL);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235); 
				match(TOINT);
				setState(236); 
				ex_2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237); 
				match(TOREAL);
				setState(238); 
				ex_2();
				}
				break;
			case OP_BRACE:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239); 
				match(OP_BRACE);
				setState(240); 
				ex_0();
				setState(241); 
				match(CLO_BRACE);
				}
				break;
			case ID_NAME:
				_localctx = new Ex_id_nameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(243); 
				match(ID_NAME);
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
		enterRule(_localctx, 42, RULE_t_STRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); 
			match(T__3);
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
		enterRule(_localctx, 44, RULE_t_INT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
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
		enterRule(_localctx, 46, RULE_t_REAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
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
		enterRule(_localctx, 48, RULE_t_ARRAY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
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
		enterRule(_localctx, 50, RULE_t_VOID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
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
		enterRule(_localctx, 52, RULE_f_PRINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
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
		enterRule(_localctx, 54, RULE_f_READ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\5\6"+
		"r\n\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\3\6\3\7\3\7\7\7~\n\7\f\7\16\7\u0081"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u008e\n\t\3\t\7"+
		"\t\u0091\n\t\f\t\16\t\u0094\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a4\n\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa"+
		"\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00b9\n\20\3\21\3\21\3\21\3\21\7\21\u00bf\n\21\f\21\16\21\u00c2\13\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00c8\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00df\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00ea\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00f7\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668\2\4\3\2\27\31\3\2\13\r\u010e\2@\3\2\2\2\4O\3\2\2\2\6Q\3"+
		"\2\2\2\bm\3\2\2\2\no\3\2\2\2\f{\3\2\2\2\16\u0084\3\2\2\2\20\u008b\3\2"+
		"\2\2\22\u0097\3\2\2\2\24\u009a\3\2\2\2\26\u00a1\3\2\2\2\30\u00ad\3\2\2"+
		"\2\32\u00af\3\2\2\2\34\u00b1\3\2\2\2\36\u00b8\3\2\2\2 \u00c7\3\2\2\2\""+
		"\u00c9\3\2\2\2$\u00d3\3\2\2\2&\u00de\3\2\2\2(\u00e9\3\2\2\2*\u00f6\3\2"+
		"\2\2,\u00f8\3\2\2\2.\u00fa\3\2\2\2\60\u00fc\3\2\2\2\62\u00fe\3\2\2\2\64"+
		"\u0100\3\2\2\2\66\u0102\3\2\2\28\u0104\3\2\2\2:<\5\4\3\2;:\3\2\2\2;<\3"+
		"\2\2\2<=\3\2\2\2=?\7$\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3"+
		"\2\2\2B@\3\2\2\2CD\7\22\2\2DE\7\33\2\2EP\5&\24\2FP\5\6\4\2GH\7\17\2\2"+
		"HP\7\22\2\2IJ\7\16\2\2JK\5$\23\2KL\7\22\2\2LP\3\2\2\2MP\5\f\7\2NP\5\22"+
		"\n\2OC\3\2\2\2OF\3\2\2\2OG\3\2\2\2OI\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3"+
		"\2\2\2QR\7\3\2\2RS\5$\23\2ST\7\27\2\2TX\5\b\5\2UW\7$\2\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\n\6\2\\\7\3\2\2\2"+
		"]^\7 \2\2^_\5$\23\2_f\7\27\2\2`a\7\37\2\2ab\5$\23\2bc\7\27\2\2ce\3\2\2"+
		"\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7!\2"+
		"\2jn\3\2\2\2kl\7 \2\2ln\7!\2\2m]\3\2\2\2mk\3\2\2\2n\t\3\2\2\2ov\7\"\2"+
		"\2pr\5\4\3\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7$\2\2tq\3\2\2\2ux\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7#\2\2z\13\3\2\2\2{\177\5"+
		"\16\b\2|~\7$\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\20\t\2\u0083\r"+
		"\3\2\2\2\u0084\u0085\7\4\2\2\u0085\u0086\7 \2\2\u0086\u0087\5\36\20\2"+
		"\u0087\u0088\5\34\17\2\u0088\u0089\5\36\20\2\u0089\u008a\7!\2\2\u008a"+
		"\17\3\2\2\2\u008b\u0092\7\"\2\2\u008c\u008e\5\4\3\2\u008d\u008c\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7$\2\2\u0090\u008d"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7#\2\2\u0096\21\3\2\2\2"+
		"\u0097\u0098\5\24\13\2\u0098\u0099\5\26\f\2\u0099\23\3\2\2\2\u009a\u009b"+
		"\7\5\2\2\u009b\u009c\7 \2\2\u009c\u009d\5\30\r\2\u009d\u009e\5\34\17\2"+
		"\u009e\u009f\5\32\16\2\u009f\u00a0\7!\2\2\u00a0\25\3\2\2\2\u00a1\u00a8"+
		"\7\"\2\2\u00a2\u00a4\5\4\3\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\7$\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\7\27\2"+
		"\2\u00ae\31\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\t"+
		"\3\2\2\u00b2\35\3\2\2\2\u00b3\u00b9\7\30\2\2\u00b4\u00b9\7\31\2\2\u00b5"+
		"\u00b9\7\32\2\2\u00b6\u00b9\5 \21\2\u00b7\u00b9\7\22\2\2\u00b8\u00b3\3"+
		"\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00c0\5\36"+
		"\20\2\u00bc\u00bd\7\37\2\2\u00bd\u00bf\5\36\20\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c8\3\2\2\2\u00c5"+
		"\u00c6\7\35\2\2\u00c6\u00c8\7\36\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c8!\3\2\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\7\35\2\2\u00cb"+
		"\u00cc\7\30\2\2\u00cc\u00cd\7\36\2\2\u00cd#\3\2\2\2\u00ce\u00d4\5,\27"+
		"\2\u00cf\u00d4\5.\30\2\u00d0\u00d4\5\60\31\2\u00d1\u00d4\5\62\32\2\u00d2"+
		"\u00d4\5\64\33\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00df"+
		"\5(\25\2\u00d6\u00d7\5(\25\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\5(\25\2"+
		"\u00d9\u00df\3\2\2\2\u00da\u00db\5(\25\2\u00db\u00dc\7\25\2\2\u00dc\u00dd"+
		"\5(\25\2\u00dd\u00df\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00ea\5*\26\2\u00e1\u00e2\5*\26\2"+
		"\u00e2\u00e3\7\24\2\2\u00e3\u00e4\5*\26\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6"+
		"\5*\26\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8\5*\26\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00e0\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea)\3"+
		"\2\2\2\u00eb\u00f7\7\30\2\2\u00ec\u00f7\7\31\2\2\u00ed\u00ee\7\20\2\2"+
		"\u00ee\u00f7\5*\26\2\u00ef\u00f0\7\21\2\2\u00f0\u00f7\5*\26\2\u00f1\u00f2"+
		"\7 \2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7!\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f7\7\22\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ed\3"+
		"\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"+\3\2\2\2\u00f8\u00f9\7\6\2\2\u00f9-\3\2\2\2\u00fa\u00fb\7\7\2\2\u00fb"+
		"/\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd\61\3\2\2\2\u00fe\u00ff\7\t\2\2\u00ff"+
		"\63\3\2\2\2\u0100\u0101\7\n\2\2\u0101\65\3\2\2\2\u0102\u0103\7\17\2\2"+
		"\u0103\67\3\2\2\2\u0104\u0105\7\16\2\2\u01059\3\2\2\2\26;@OXfmqv\177\u008d"+
		"\u0092\u00a3\u00a8\u00b8\u00c0\u00c7\u00d3\u00de\u00e9\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}