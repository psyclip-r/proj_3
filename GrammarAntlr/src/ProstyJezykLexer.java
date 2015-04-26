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
		SHOW_VAR=1, EQUAL=2, VARIABLE=3, INT=4, NEWLINE=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SHOW_VAR", "EQUAL", "VARIABLE", "INT", "NEWLINE", "ESC", "UNICODE", "HEX", 
		"EXP", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bb\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4&\n\4\r"+
		"\4\16\4\'\3\5\6\5+\n\5\r\5\16\5,\3\6\5\6\60\n\6\3\6\3\6\3\7\3\7\3\7\5"+
		"\7\67\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\nC\n\n\3\n\3\n\3\13"+
		"\3\13\5\13I\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fQ\n\f\f\f\16\fT\13\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\\\n\f\f\f\16\f_\13\f\5\fa\n\f\2\2\r\3\3\5\4\7"+
		"\5\t\6\13\7\r\2\17\2\21\2\23\2\25\b\27\2\3\2\t\4\2C\\c|\n\2$$\61\61^^"+
		"ddhhppttvv\5\2\62;CHch\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\25\3"+
		"\2\2\2\3\31\3\2\2\2\5\"\3\2\2\2\7%\3\2\2\2\t*\3\2\2\2\13/\3\2\2\2\r\63"+
		"\3\2\2\2\178\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25H\3\2\2\2\27`\3\2\2\2\31"+
		"\32\7y\2\2\32\33\7{\2\2\33\34\7u\2\2\34\35\7y\2\2\35\36\7k\2\2\36\37\7"+
		"g\2\2\37 \7v\2\2 !\7n\2\2!\4\3\2\2\2\"#\7?\2\2#\6\3\2\2\2$&\t\2\2\2%$"+
		"\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\b\3\2\2\2)+\4\62;\2*)\3\2\2"+
		"\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\n\3\2\2\2.\60\7\17\2\2/.\3\2\2\2/\60"+
		"\3\2\2\2\60\61\3\2\2\2\61\62\7\f\2\2\62\f\3\2\2\2\63\66\7^\2\2\64\67\t"+
		"\3\2\2\65\67\5\17\b\2\66\64\3\2\2\2\66\65\3\2\2\2\67\16\3\2\2\289\7w\2"+
		"\29:\5\21\t\2:;\5\21\t\2;<\5\21\t\2<=\5\21\t\2=\20\3\2\2\2>?\t\4\2\2?"+
		"\22\3\2\2\2@B\t\5\2\2AC\t\6\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\t\5"+
		"\2E\24\3\2\2\2FI\t\7\2\2GI\5\27\f\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\b"+
		"\13\2\2K\26\3\2\2\2LM\7\61\2\2MN\7,\2\2NR\3\2\2\2OQ\13\2\2\2PO\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7,\2\2Va\7\61\2\2"+
		"WX\7\61\2\2XY\7\61\2\2Y]\3\2\2\2Z\\\n\b\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`L\3\2\2\2`W\3\2\2\2a\30\3\2\2\2\f\2"+
		"\',/\66BHR]`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}