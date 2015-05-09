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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VAR_NAME=7, NEWLINE=8, 
		INT=9, REAL=10, STRING=11, EQUAL=12, QUOTES=13, OP_BRACKET=14, CLO_BRACKET=15, 
		COMMA=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_value = 2, RULE_array = 3, RULE_el_in_array = 4, 
		RULE_var_type = 5, RULE_t_STRING = 6, RULE_t_INT = 7, RULE_t_REAL = 8, 
		RULE_t_ARRAY = 9, RULE_f_PRINT = 10, RULE_f_READ = 11;
	public static final String[] ruleNames = {
		"prog", "start", "value", "array", "el_in_array", "var_type", "t_STRING", 
		"t_INT", "t_REAL", "t_ARRAY", "f_PRINT", "f_READ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'string'", "'int'", "'real'", "'array'", "'print'", "'czytaj'", 
		null, null, null, null, null, "'='", "'\"'", "'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "VAR_NAME", "NEWLINE", "INT", 
		"REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", "CLO_BRACKET", "COMMA", 
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(25);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
					{
					setState(24); 
					start();
					}
				}

				setState(27); 
				match(NEWLINE);
				}
				}
				setState(32);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(ProstyJezykParser.VAR_NAME, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public F_PRINTContext f_PRINT() {
			return getRuleContext(F_PRINTContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33); 
				var_type();
				setState(34); 
				match(VAR_NAME);
				setState(35); 
				match(EQUAL);
				setState(36); 
				value();
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); 
				f_PRINT();
				setState(39); 
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ProstyJezykParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(ProstyJezykParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(ProstyJezykParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); 
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); 
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); 
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); 
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); 
				match(VAR_NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48); 
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49); 
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
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(52); 
				match(OP_BRACKET);
				setState(53); 
				value();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(54); 
					match(COMMA);
					setState(55); 
					value();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61); 
				match(CLO_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63); 
				match(OP_BRACKET);
				setState(64); 
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
		public TerminalNode VAR_NAME() { return getToken(ProstyJezykParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 8, RULE_el_in_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			match(VAR_NAME);
			setState(68); 
			match(OP_BRACKET);
			setState(69); 
			match(INT);
			setState(70); 
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
		enterRule(_localctx, 10, RULE_var_type);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); 
				t_STRING();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); 
				t_INT();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); 
				t_REAL();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); 
				t_ARRAY();
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
		enterRule(_localctx, 12, RULE_t_STRING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			match(T__0);
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
		enterRule(_localctx, 14, RULE_t_INT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			match(T__1);
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
		enterRule(_localctx, 16, RULE_t_REAL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
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
		enterRule(_localctx, 18, RULE_t_ARRAY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
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
		enterRule(_localctx, 20, RULE_f_PRINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
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
		enterRule(_localctx, 22, RULE_f_READ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4"+
		"\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2^\2"+
		" \3\2\2\2\4+\3\2\2\2\6\64\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fN\3\2\2\2\16"+
		"P\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26X\3\2\2\2\30Z\3\2\2\2"+
		"\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\37\7\n\2\2"+
		"\36\33\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2"+
		"\2#$\5\f\7\2$%\7\t\2\2%&\7\16\2\2&\'\5\6\4\2\',\3\2\2\2()\5\26\f\2)*\5"+
		"\6\4\2*,\3\2\2\2+#\3\2\2\2+(\3\2\2\2,\5\3\2\2\2-\65\7\13\2\2.\65\7\f\2"+
		"\2/\65\7\r\2\2\60\65\5\b\5\2\61\65\7\t\2\2\62\65\5\b\5\2\63\65\5\n\6\2"+
		"\64-\3\2\2\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62"+
		"\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\7\20\2\2\67<\5\6\4\289\7\22"+
		"\2\29;\5\6\4\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2"+
		"\2\2?@\7\21\2\2@D\3\2\2\2AB\7\20\2\2BD\7\21\2\2C\66\3\2\2\2CA\3\2\2\2"+
		"D\t\3\2\2\2EF\7\t\2\2FG\7\20\2\2GH\7\13\2\2HI\7\21\2\2I\13\3\2\2\2JO\5"+
		"\16\b\2KO\5\20\t\2LO\5\22\n\2MO\5\24\13\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2"+
		"\2NM\3\2\2\2O\r\3\2\2\2PQ\7\3\2\2Q\17\3\2\2\2RS\7\4\2\2S\21\3\2\2\2TU"+
		"\7\5\2\2U\23\3\2\2\2VW\7\6\2\2W\25\3\2\2\2XY\7\7\2\2Y\27\3\2\2\2Z[\7\b"+
		"\2\2[\31\3\2\2\2\t\33 +\64<CN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}