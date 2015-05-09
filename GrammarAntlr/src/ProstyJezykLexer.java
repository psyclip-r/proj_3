// Generated from /home/kuba/IdeaProjects/proj_3/GrammarAntlr/g4/ProstyJezyk.g4 by ANTLR 4.5
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VAR_NAME=7, NEWLINE=8, 
		INT=9, REAL=10, STRING=11, EQUAL=12, QUOTES=13, OP_BRACKET=14, CLO_BRACKET=15, 
		COMMA=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "VAR_NAME", "NEWLINE", 
		"INT", "REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", "CLO_BRACKET", 
		"COMMA", "ESC", "UNICODE", "HEX", "EXP", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bT\n\b"+
		"\r\b\16\bU\3\t\5\tY\n\t\3\t\3\t\3\n\6\n^\n\n\r\n\16\n_\3\13\6\13c\n\13"+
		"\r\13\16\13d\3\13\3\13\6\13i\n\13\r\13\16\13j\3\f\3\f\3\f\7\fp\n\f\f\f"+
		"\16\fs\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\5\22\u0084\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\5\25\u0090\n\25\3\25\3\25\3\26\3\26\5\26\u0096\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\7\27\u009e\n\27\f\27\16\27\u00a1\13\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u00a9\n\27\f\27\16\27\u00ac\13\27\5\27\u00ae"+
		"\n\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\2%\2\'\2)\2+\23-\2\3\2\t\4\2$$^^\n\2$$\61\61^"+
		"^ddhhppttvv\5\2\62;CHch\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2+\3\2\2\2\3/\3\2\2\2\5\66\3\2\2\2\7:\3\2\2\2\t?\3\2\2\2\13E\3\2\2"+
		"\2\rK\3\2\2\2\17S\3\2\2\2\21X\3\2\2\2\23]\3\2\2\2\25b\3\2\2\2\27l\3\2"+
		"\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0085\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u0095\3\2\2\2"+
		"-\u00ad\3\2\2\2/\60\7u\2\2\60\61\7v\2\2\61\62\7t\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64\65\7i\2\2\65\4\3\2\2\2\66\67\7k\2\2\678\7p\2\289\7v\2\29\6"+
		"\3\2\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=>\7n\2\2>\b\3\2\2\2?@\7c\2\2@A\7t"+
		"\2\2AB\7t\2\2BC\7c\2\2CD\7{\2\2D\n\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2"+
		"HI\7p\2\2IJ\7v\2\2J\f\3\2\2\2KL\7e\2\2LM\7|\2\2MN\7{\2\2NO\7v\2\2OP\7"+
		"c\2\2PQ\7l\2\2Q\16\3\2\2\2RT\4c|\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\20\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\f\2\2[\22"+
		"\3\2\2\2\\^\4\62;\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\24\3\2\2"+
		"\2ac\4\62;\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\60"+
		"\2\2gi\4\62;\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\26\3\2\2\2lq\5"+
		"\33\16\2mp\5#\22\2np\n\2\2\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\33\16\2u\30\3\2\2\2vw\7?\2\2w\32\3\2"+
		"\2\2xy\7$\2\2y\34\3\2\2\2z{\7]\2\2{\36\3\2\2\2|}\7_\2\2} \3\2\2\2~\177"+
		"\7.\2\2\177\"\3\2\2\2\u0080\u0083\7^\2\2\u0081\u0084\t\3\2\2\u0082\u0084"+
		"\5%\23\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084$\3\2\2\2\u0085"+
		"\u0086\7w\2\2\u0086\u0087\5\'\24\2\u0087\u0088\5\'\24\2\u0088\u0089\5"+
		"\'\24\2\u0089\u008a\5\'\24\2\u008a&\3\2\2\2\u008b\u008c\t\4\2\2\u008c"+
		"(\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u0090\t\6\2\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\23\n\2\u0092*\3"+
		"\2\2\2\u0093\u0096\t\7\2\2\u0094\u0096\5-\27\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\26\2\2\u0098,\3\2\2\2"+
		"\u0099\u009a\7\61\2\2\u009a\u009b\7,\2\2\u009b\u009f\3\2\2\2\u009c\u009e"+
		"\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3"+
		"\7,\2\2\u00a3\u00ae\7\61\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\61\2\2"+
		"\u00a6\u00aa\3\2\2\2\u00a7\u00a9\n\b\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u0099\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ae.\3\2\2\2"+
		"\20\2UX_djoq\u0083\u008f\u0095\u009f\u00aa\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}