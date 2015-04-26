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
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7B\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4 \n\4\r\4\16\4!\3\5\6\5%\n\5\r\5\16"+
		"\5&\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t8"+
		"\n\t\3\t\3\t\3\n\6\n=\n\n\r\n\16\n>\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13"+
		"\2\r\2\17\2\21\2\23\7\3\2\b\4\2C\\c|\n\2$$\61\61^^ddhhppttvv\5\2\62;C"+
		"Hch\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"B\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\34\3\2\2\2\7\37\3\2\2\2"+
		"\t$\3\2\2\2\13(\3\2\2\2\r-\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23<\3\2"+
		"\2\2\25\26\7f\2\2\26\27\7t\2\2\27\30\7w\2\2\30\31\7m\2\2\31\32\7w\2\2"+
		"\32\33\7l\2\2\33\4\3\2\2\2\34\35\7?\2\2\35\6\3\2\2\2\36 \t\2\2\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\b\3\2\2\2#%\4\62;\2$#\3\2"+
		"\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\n\3\2\2\2(+\7^\2\2),\t\3\2\2*,\5"+
		"\r\7\2+)\3\2\2\2+*\3\2\2\2,\f\3\2\2\2-.\7w\2\2./\5\17\b\2/\60\5\17\b\2"+
		"\60\61\5\17\b\2\61\62\5\17\b\2\62\16\3\2\2\2\63\64\t\4\2\2\64\20\3\2\2"+
		"\2\65\67\t\5\2\2\668\t\6\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\t"+
		"\5\2:\22\3\2\2\2;=\t\7\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3"+
		"\2\2\2@A\b\n\2\2A\24\3\2\2\2\b\2!&+\67>\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}