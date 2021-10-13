// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ID=26, FLOAT=27, ALPHA=28, NUM=29, WHITESPACE=30, COMMENT=31, 
		COMMENT2=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'for'", "'..'", "'if'", "'['", "']'", "'int'", "'bool'", "'*'", "'/'", 
			"'+'", "'-'", "'!='", "'=='", "'>'", "'<'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u008f\n\33\f\33\16\33\u0092\13\33\3\34\6\34\u0095\n\34\r\34\16\34\u0096"+
		"\3\34\3\34\6\34\u009b\n\34\r\34\16\34\u009c\5\34\u009f\n\34\3\35\3\35"+
		"\3\36\3\36\3\37\6\37\u00a6\n\37\r\37\16\37\u00a7\3\37\3\37\3 \3 \3 \3"+
		" \7 \u00b0\n \f \16 \u00b3\13 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u00bd\n!\f!"+
		"\16!\u00c0\13!\3!\3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\b\6\2C\\aac|\uffff\uffff"+
		"\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00ce\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2"+
		"\2\13K\3\2\2\2\rR\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25`\3\2"+
		"\2\2\27c\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37n\3\2\2\2!s\3\2"+
		"\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+~\3\2\2\2-\u0081\3\2\2\2"+
		"/\u0083\3\2\2\2\61\u0085\3\2\2\2\63\u0088\3\2\2\2\65\u008b\3\2\2\2\67"+
		"\u0094\3\2\2\29\u00a0\3\2\2\2;\u00a2\3\2\2\2=\u00a5\3\2\2\2?\u00ab\3\2"+
		"\2\2A\u00b6\3\2\2\2CD\7}\2\2D\4\3\2\2\2EF\7\177\2\2F\6\3\2\2\2GH\7?\2"+
		"\2H\b\3\2\2\2IJ\7=\2\2J\n\3\2\2\2KL\7q\2\2LM\7w\2\2MN\7v\2\2NO\7r\2\2"+
		"OP\7w\2\2PQ\7v\2\2Q\f\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7"+
		"g\2\2W\16\3\2\2\2XY\7*\2\2Y\20\3\2\2\2Z[\7+\2\2[\22\3\2\2\2\\]\7h\2\2"+
		"]^\7q\2\2^_\7t\2\2_\24\3\2\2\2`a\7\60\2\2ab\7\60\2\2b\26\3\2\2\2cd\7k"+
		"\2\2de\7h\2\2e\30\3\2\2\2fg\7]\2\2g\32\3\2\2\2hi\7_\2\2i\34\3\2\2\2jk"+
		"\7k\2\2kl\7p\2\2lm\7v\2\2m\36\3\2\2\2no\7d\2\2op\7q\2\2pq\7q\2\2qr\7n"+
		"\2\2r \3\2\2\2st\7,\2\2t\"\3\2\2\2uv\7\61\2\2v$\3\2\2\2wx\7-\2\2x&\3\2"+
		"\2\2yz\7/\2\2z(\3\2\2\2{|\7#\2\2|}\7?\2\2}*\3\2\2\2~\177\7?\2\2\177\u0080"+
		"\7?\2\2\u0080,\3\2\2\2\u0081\u0082\7@\2\2\u0082.\3\2\2\2\u0083\u0084\7"+
		">\2\2\u0084\60\3\2\2\2\u0085\u0086\7~\2\2\u0086\u0087\7~\2\2\u0087\62"+
		"\3\2\2\2\u0088\u0089\7(\2\2\u0089\u008a\7(\2\2\u008a\64\3\2\2\2\u008b"+
		"\u0090\59\35\2\u008c\u008f\59\35\2\u008d\u008f\5;\36\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\66\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5;\36"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u009a\7\60\2\2\u0099\u009b\5;\36\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"8\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1:\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3"+
		"<\3\2\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\b\37\2\2\u00aa>\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		"\u00b1\3\2\2\2\u00ae\u00b0\n\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\b \2\2\u00b5@\3\2\2\2\u00b6\u00b7\7\61\2\2"+
		"\u00b7\u00b8\7,\2\2\u00b8\u00be\3\2\2\2\u00b9\u00bd\n\6\2\2\u00ba\u00bb"+
		"\7,\2\2\u00bb\u00bd\n\7\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c3\7\61\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b!\2\2\u00c5B\3\2\2\2\f\2\u008e\u0090\u0096"+
		"\u009c\u009e\u00a7\u00b1\u00bc\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}