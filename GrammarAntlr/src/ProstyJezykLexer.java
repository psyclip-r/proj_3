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
		ID_NAME=17, ADD=18, MULT=19, SUBS=20, DIV=21, NAME=22, INT=23, REAL=24, 
		STRING=25, EQUAL=26, QUOTES=27, OP_BRACKET=28, CLO_BRACKET=29, COMMA=30, 
		OP_BRACE=31, CLO_BRACE=32, START_FUNCT=33, END_FUNCT=34, NEWLINE=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"LESS", "MORE", "EQUAL_S", "READ", "PRINT", "TOINT", "TOREAL", "ID_NAME", 
		"ADD", "MULT", "SUBS", "DIV", "NAME", "INT", "REAL", "STRING", "EQUAL", 
		"QUOTES", "OP_BRACKET", "CLO_BRACKET", "COMMA", "OP_BRACE", "CLO_BRACE", 
		"START_FUNCT", "END_FUNCT", "NEWLINE", "ESC", "UNICODE", "HEX", "EXP", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'++'", "'fun'", "'if'", "'loop'", "'string'", "'int'", "'real'", 
		"'array'", "'void'", "'<'", "'>'", "'=='", "'read'", "'print'", "'(int)'", 
		"'(real)'", null, "'+'", "'*'", "'-'", "'/'", null, null, null, null, 
		"'='", "'\"'", "'['", "']'", "','", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "LESS", "MORE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00a0\n\22\r\22\16\22\u00a1\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00ad\n\27\r\27\16\27"+
		"\u00ae\3\30\6\30\u00b2\n\30\r\30\16\30\u00b3\3\31\6\31\u00b7\n\31\r\31"+
		"\16\31\u00b8\3\31\3\31\6\31\u00bd\n\31\r\31\16\31\u00be\3\32\3\32\3\32"+
		"\7\32\u00c4\n\32\f\32\16\32\u00c7\13\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\5$\u00de\n"+
		"$\3$\3$\3%\3%\3%\5%\u00e5\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\5(\u00f1"+
		"\n(\3(\3(\3)\3)\5)\u00f7\n)\3)\3)\3*\3*\3*\3*\7*\u00ff\n*\f*\16*\u0102"+
		"\13*\3*\3*\3*\3*\3*\3*\7*\u010a\n*\f*\16*\u010d\13*\5*\u010f\n*\2\2+\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I\2K\2M\2O\2Q&S\2\3\2\n\4\2C\\c|\4\2$$^^\n\2$$\61\61^^ddh"+
		"hppttvv\5\2\62;CHch\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0118"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2Q\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7\\\3\2\2\2\t_\3\2\2\2\13d\3\2\2\2"+
		"\rk\3\2\2\2\17o\3\2\2\2\21t\3\2\2\2\23z\3\2\2\2\25\177\3\2\2\2\27\u0081"+
		"\3\2\2\2\31\u0083\3\2\2\2\33\u0086\3\2\2\2\35\u008b\3\2\2\2\37\u0091\3"+
		"\2\2\2!\u0097\3\2\2\2#\u009f\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7"+
		"\3\2\2\2+\u00a9\3\2\2\2-\u00ac\3\2\2\2/\u00b1\3\2\2\2\61\u00b6\3\2\2\2"+
		"\63\u00c0\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00ce\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d2\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00d8\3\2\2\2E"+
		"\u00da\3\2\2\2G\u00dd\3\2\2\2I\u00e1\3\2\2\2K\u00e6\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00ee\3\2\2\2Q\u00f6\3\2\2\2S\u010e\3\2\2\2UV\7-\2\2VW\7-\2\2W\4"+
		"\3\2\2\2XY\7h\2\2YZ\7w\2\2Z[\7p\2\2[\6\3\2\2\2\\]\7k\2\2]^\7h\2\2^\b\3"+
		"\2\2\2_`\7n\2\2`a\7q\2\2ab\7q\2\2bc\7r\2\2c\n\3\2\2\2de\7u\2\2ef\7v\2"+
		"\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7i\2\2j\f\3\2\2\2kl\7k\2\2lm\7p\2\2mn"+
		"\7v\2\2n\16\3\2\2\2op\7t\2\2pq\7g\2\2qr\7c\2\2rs\7n\2\2s\20\3\2\2\2tu"+
		"\7c\2\2uv\7t\2\2vw\7t\2\2wx\7c\2\2xy\7{\2\2y\22\3\2\2\2z{\7x\2\2{|\7q"+
		"\2\2|}\7k\2\2}~\7f\2\2~\24\3\2\2\2\177\u0080\7>\2\2\u0080\26\3\2\2\2\u0081"+
		"\u0082\7@\2\2\u0082\30\3\2\2\2\u0083\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085"+
		"\32\3\2\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7f\2\2\u008a\34\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7*\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7+\2\2\u0096 \3\2\2\2\u0097\u0098\7*\2\2\u0098\u0099\7t\2"+
		"\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d"+
		"\7+\2\2\u009d\"\3\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2$\3\2\2\2"+
		"\u00a3\u00a4\7-\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6(\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa,\3\2\2\2\u00ab"+
		"\u00ad\4c|\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af.\3\2\2\2\u00b0\u00b2\4\62;\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\60\3\2\2\2\u00b5\u00b7\4\62;\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\7\60\2\2\u00bb\u00bd\4\62;\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\62\3\2\2\2\u00c0\u00c5"+
		"\5\67\34\2\u00c1\u00c4\5I%\2\u00c2\u00c4\n\3\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\67\34\2\u00c9"+
		"\64\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00cf\7]\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1<"+
		"\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5@\3"+
		"\2\2\2\u00d6\u00d7\7+\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9D\3\2"+
		"\2\2\u00da\u00db\7\177\2\2\u00dbF\3\2\2\2\u00dc\u00de\7\17\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0"+
		"H\3\2\2\2\u00e1\u00e4\7^\2\2\u00e2\u00e5\t\4\2\2\u00e3\u00e5\5K&\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5J\3\2\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e8\5M\'\2\u00e8\u00e9\5M\'\2\u00e9\u00ea\5M\'\2\u00ea\u00eb\5M\'\2"+
		"\u00ebL\3\2\2\2\u00ec\u00ed\t\5\2\2\u00edN\3\2\2\2\u00ee\u00f0\t\6\2\2"+
		"\u00ef\u00f1\t\7\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\5/\30\2\u00f3P\3\2\2\2\u00f4\u00f7\t\b\2\2\u00f5"+
		"\u00f7\5S*\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2"+
		"\2\u00f8\u00f9\b)\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc"+
		"\7,\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7,\2\2\u0104\u010f\7\61\2\2\u0105"+
		"\u0106\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u010b\3\2\2\2\u0108\u010a\n"+
		"\t\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u00fa\3\2"+
		"\2\2\u010e\u0105\3\2\2\2\u010fT\3\2\2\2\21\2\u00a1\u00ae\u00b3\u00b8\u00be"+
		"\u00c3\u00c5\u00dd\u00e4\u00f0\u00f6\u0100\u010b\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}