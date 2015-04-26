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
		SHOW_VAR=1, EQUAL=2, VARIABLE=3, INT=4, NEWLINE=5, WS=6;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_value = 2;
	public static final String[] ruleNames = {
		"prog", "start", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'wyswietl'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SHOW_VAR", "EQUAL", "VARIABLE", "INT", "NEWLINE", "WS"
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
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHOW_VAR) | (1L << VARIABLE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if (_la==SHOW_VAR || _la==VARIABLE) {
					{
					setState(6); 
					start();
					}
				}

				setState(9); 
				match(NEWLINE);
				}
				}
				setState(14);
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
	public static class Print_actionContext extends StartContext {
		public TerminalNode SHOW_VAR() { return getToken(ProstyJezykParser.SHOW_VAR, 0); }
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
	public static class Assign_actionContext extends StartContext {
		public TerminalNode VARIABLE() { return getToken(ProstyJezykParser.VARIABLE, 0); }
		public TerminalNode INT() { return getToken(ProstyJezykParser.INT, 0); }
		public Assign_actionContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).enterAssign_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProstyJezykListener ) ((ProstyJezykListener)listener).exitAssign_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProstyJezykVisitor ) return ((ProstyJezykVisitor<? extends T>)visitor).visitAssign_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(20);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new Assign_actionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15); 
				match(VARIABLE);
				setState(16); 
				match(EQUAL);
				setState(17); 
				match(INT);
				}
				break;
			case SHOW_VAR:
				_localctx = new Print_actionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18); 
				match(SHOW_VAR);
				setState(19); 
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
		public TerminalNode VARIABLE() { return getToken(ProstyJezykParser.VARIABLE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==INT) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\5\2\n\n\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\27\n\3\3\4\3\4\3\4\2\2\5\2\4\6\2\3\3\2\5\6\32\2\16\3\2\2"+
		"\2\4\26\3\2\2\2\6\30\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\t\n\3\2\2\2\n\13"+
		"\3\2\2\2\13\r\7\7\2\2\f\t\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2"+
		"\2\2\17\3\3\2\2\2\20\16\3\2\2\2\21\22\7\5\2\2\22\23\7\4\2\2\23\27\7\6"+
		"\2\2\24\25\7\3\2\2\25\27\5\6\4\2\26\21\3\2\2\2\26\24\3\2\2\2\27\5\3\2"+
		"\2\2\30\31\t\2\2\2\31\7\3\2\2\2\5\t\16\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}