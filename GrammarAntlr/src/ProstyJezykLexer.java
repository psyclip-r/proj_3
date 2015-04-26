// Generated from C:/Users/Kuba/IdeaProjects/proj_3/GrammarAntlr/g4\ProstyJezyk.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProstyJezykLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHOW_VAR=1, EQUAL=2, VARIABLE=3, INT=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SHOW_VAR", "EQUAL", "VARIABLE", "INT", "ESC", "UNICODE", "HEX", "EXP", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'drukuj'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SHOW_VAR", "EQUAL", "VARIABLE", "INT", "WS"
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


	public ProstyJezykLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProstyJezyk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4\"\n\4\r\4\16\4#\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\5\t:\n\t\3\t\3\t\3\n\3\n\5\n@\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\7\13H\n\13\f\13\16\13K\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13S\n"+
		"\13\f\13\16\13V\13\13\5\13X\n\13\2\2\f\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21"+
		"\2\23\7\25\2\3\2\t\4\2C\\c|\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\4\2GG"+
		"gg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17[\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\3\27\3\2\2\2\5\36\3\2\2\2\7!\3\2\2"+
		"\2\t&\3\2\2\2\13*\3\2\2\2\r/\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\23?\3"+
		"\2\2\2\25W\3\2\2\2\27\30\7f\2\2\30\31\7t\2\2\31\32\7w\2\2\32\33\7m\2\2"+
		"\33\34\7w\2\2\34\35\7l\2\2\35\4\3\2\2\2\36\37\7?\2\2\37\6\3\2\2\2 \"\t"+
		"\2\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\b\3\2\2\2%\'\4\62;\2"+
		"&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*-\7^\2\2+.\t\3\2"+
		"\2,.\5\r\7\2-+\3\2\2\2-,\3\2\2\2.\f\3\2\2\2/\60\7w\2\2\60\61\5\17\b\2"+
		"\61\62\5\17\b\2\62\63\5\17\b\2\63\64\5\17\b\2\64\16\3\2\2\2\65\66\t\4"+
		"\2\2\66\20\3\2\2\2\679\t\5\2\28:\t\6\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2"+
		";<\5\t\5\2<\22\3\2\2\2=@\t\7\2\2>@\5\25\13\2?=\3\2\2\2?>\3\2\2\2@A\3\2"+
		"\2\2AB\b\n\2\2B\24\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF"+
		"\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MX"+
		"\7\61\2\2NO\7\61\2\2OP\7\61\2\2PT\3\2\2\2QS\n\b\2\2RQ\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WC\3\2\2\2WN\3\2\2\2X\26\3\2"+
		"\2\2\13\2#(-9?ITW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}