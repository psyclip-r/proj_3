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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		LESS=10, MORE=11, EQUAL_S=12, READ=13, PRINT=14, TOINT=15, TOREAL=16, 
		ID_NAME=17, ADD=18, MULT=19, SUBS=20, NAME=21, INT=22, REAL=23, STRING=24, 
		EQUAL=25, QUOTES=26, OP_BRACKET=27, CLO_BRACKET=28, COMMA=29, OP_BRACE=30, 
		CLO_BRACE=31, START_FUNCT=32, END_FUNCT=33, NEWLINE=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"LESS", "MORE", "EQUAL_S", "READ", "PRINT", "TOINT", "TOREAL", "ID_NAME", 
		"ADD", "MULT", "SUBS", "NAME", "INT", "REAL", "STRING", "EQUAL", "QUOTES", 
		"OP_BRACKET", "CLO_BRACKET", "COMMA", "OP_BRACE", "CLO_BRACE", "START_FUNCT", 
		"END_FUNCT", "NEWLINE", "ESC", "UNICODE", "HEX", "EXP", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "'if'", "'else'", "'while'", "'string'", "'int'", "'real'", 
		"'array'", "'void'", "'<'", "'>'", "'=='", "'read'", "'print'", "'(int)'", 
		"'(real)'", null, "'+'", "'*'", "'-'", null, null, null, null, "'='", 
		"'\"'", "'['", "']'", "','", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "LESS", "MORE", 
		"EQUAL_S", "READ", "PRINT", "TOINT", "TOREAL", "ID_NAME", "ADD", "MULT", 
		"SUBS", "NAME", "INT", "REAL", "STRING", "EQUAL", "QUOTES", "OP_BRACKET", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00a1\n\22\r\22\16\22\u00a2"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u00ac\n\26\r\26\16\26\u00ad\3"+
		"\27\6\27\u00b1\n\27\r\27\16\27\u00b2\3\30\6\30\u00b6\n\30\r\30\16\30\u00b7"+
		"\3\30\3\30\6\30\u00bc\n\30\r\30\16\30\u00bd\3\31\3\31\3\31\7\31\u00c3"+
		"\n\31\f\31\16\31\u00c6\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\5#\u00dd\n#\3#\3#"+
		"\3$\3$\3$\5$\u00e4\n$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\5\'\u00f0\n\'\3"+
		"\'\3\'\3(\3(\5(\u00f6\n(\3(\3(\3)\3)\3)\3)\7)\u00fe\n)\f)\16)\u0101\13"+
		")\3)\3)\3)\3)\3)\3)\7)\u0109\n)\f)\16)\u010c\13)\5)\u010e\n)\2\2*\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G\2I\2K\2M\2O%Q\2\3\2\n\4\2C\\c|\4\2$$^^\n\2$$\61\61^^ddhhpptt"+
		"vv\5\2\62;CHch\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0117"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2O\3\2\2"+
		"\2\3S\3\2\2\2\5W\3\2\2\2\7Z\3\2\2\2\t_\3\2\2\2\13e\3\2\2\2\rl\3\2\2\2"+
		"\17p\3\2\2\2\21u\3\2\2\2\23{\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2"+
		"\31\u0084\3\2\2\2\33\u0087\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2!"+
		"\u0098\3\2\2\2#\u00a0\3\2\2\2%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3"+
		"\2\2\2+\u00ab\3\2\2\2-\u00b0\3\2\2\2/\u00b5\3\2\2\2\61\u00bf\3\2\2\2\63"+
		"\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2A\u00d7\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u00dc\3\2\2\2G\u00e0\3\2\2\2I\u00e5\3\2\2\2K\u00eb\3\2\2\2M\u00ed\3\2"+
		"\2\2O\u00f5\3\2\2\2Q\u010d\3\2\2\2ST\7h\2\2TU\7w\2\2UV\7p\2\2V\4\3\2\2"+
		"\2WX\7k\2\2XY\7h\2\2Y\6\3\2\2\2Z[\7g\2\2[\\\7n\2\2\\]\7u\2\2]^\7g\2\2"+
		"^\b\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g\2\2d\n\3\2\2\2ef"+
		"\7u\2\2fg\7v\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7i\2\2k\f\3\2\2\2lm\7k\2"+
		"\2mn\7p\2\2no\7v\2\2o\16\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7c\2\2st\7n\2\2t"+
		"\20\3\2\2\2uv\7c\2\2vw\7t\2\2wx\7t\2\2xy\7c\2\2yz\7{\2\2z\22\3\2\2\2{"+
		"|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177\24\3\2\2\2\u0080\u0081\7>\2"+
		"\2\u0081\26\3\2\2\2\u0082\u0083\7@\2\2\u0083\30\3\2\2\2\u0084\u0085\7"+
		"?\2\2\u0085\u0086\7?\2\2\u0086\32\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7r\2\2\u008d\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090"+
		"\u0091\7v\2\2\u0091\36\3\2\2\2\u0092\u0093\7*\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7+\2\2\u0097 \3\2\2\2\u0098"+
		"\u0099\7*\2\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7n\2\2\u009d\u009e\7+\2\2\u009e\"\3\2\2\2\u009f\u00a1\t\2"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5&\3\2\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9*\3\2\2\2\u00aa\u00ac"+
		"\4c|\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae,\3\2\2\2\u00af\u00b1\4\62;\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3.\3"+
		"\2\2\2\u00b4\u00b6\4\62;\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\60"+
		"\2\2\u00ba\u00bc\4\62;\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\60\3\2\2\2\u00bf\u00c4\5\65\33"+
		"\2\u00c0\u00c3\5G$\2\u00c1\u00c3\n\3\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5\65\33\2\u00c8\62\3\2"+
		"\2\2\u00c9\u00ca\7?\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\66\3"+
		"\2\2\2\u00cd\u00ce\7]\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7_\2\2\u00d0:\3\2"+
		"\2\2\u00d1\u00d2\7.\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4>\3\2\2"+
		"\2\u00d5\u00d6\7+\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7}\2\2\u00d8B\3\2\2\2"+
		"\u00d9\u00da\7\177\2\2\u00daD\3\2\2\2\u00db\u00dd\7\17\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\f\2\2\u00df"+
		"F\3\2\2\2\u00e0\u00e3\7^\2\2\u00e1\u00e4\t\4\2\2\u00e2\u00e4\5I%\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\5K&\2\u00e7\u00e8\5K&\2\u00e8\u00e9\5K&\2\u00e9\u00ea\5K&\2\u00ea"+
		"J\3\2\2\2\u00eb\u00ec\t\5\2\2\u00ecL\3\2\2\2\u00ed\u00ef\t\6\2\2\u00ee"+
		"\u00f0\t\7\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\5-\27\2\u00f2N\3\2\2\2\u00f3\u00f6\t\b\2\2\u00f4\u00f6"+
		"\5Q)\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\b(\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0103\7,\2\2\u0103\u010e\7\61\2\2\u0104\u0105\7\61"+
		"\2\2\u0105\u0106\7\61\2\2\u0106\u010a\3\2\2\2\u0107\u0109\n\t\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u00f9\3\2\2\2\u010d"+
		"\u0104\3\2\2\2\u010eR\3\2\2\2\21\2\u00a2\u00ad\u00b2\u00b7\u00bd\u00c2"+
		"\u00c4\u00dc\u00e3\u00ef\u00f5\u00ff\u010a\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}