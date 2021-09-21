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
		ID=18, FLOAT=19, ALPHA=20, NUM=21, WHITESPACE=22, COMMENT=23, COMMENT2=24;
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
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'if'", "'+'", "'*'", "'/'", "'-'", "'!='", "'=='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", 
			"COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\7\23e\n\23\f\23\16\23h\13\23\3\24\5\24k\n\24\3\24\6\24n\n\24"+
		"\r\24\16\24o\3\24\3\24\6\24t\n\24\r\24\16\24u\5\24x\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\6\27\177\n\27\r\27\16\27\u0080\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\7\30\u0089\n\30\f\30\16\30\u008c\13\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u0096\n\31\f\31\16\31\u0099\13\31\3\31\3\31\3\31\3\31"+
		"\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\6\2C\\"+
		"aac|\uffff\uffff\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2"+
		"\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2"+
		"\2\13;\3\2\2\2\rB\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25O\3\2"+
		"\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Z\3\2\2\2!]\3\2"+
		"\2\2#_\3\2\2\2%a\3\2\2\2\'j\3\2\2\2)y\3\2\2\2+{\3\2\2\2-~\3\2\2\2/\u0084"+
		"\3\2\2\2\61\u008f\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\177\2\2\66"+
		"\6\3\2\2\2\678\7?\2\28\b\3\2\2\29:\7=\2\2:\n\3\2\2\2;<\7q\2\2<=\7w\2\2"+
		"=>\7v\2\2>?\7r\2\2?@\7w\2\2@A\7v\2\2A\f\3\2\2\2BC\7y\2\2CD\7j\2\2DE\7"+
		"k\2\2EF\7n\2\2FG\7g\2\2G\16\3\2\2\2HI\7*\2\2I\20\3\2\2\2JK\7+\2\2K\22"+
		"\3\2\2\2LM\7k\2\2MN\7h\2\2N\24\3\2\2\2OP\7-\2\2P\26\3\2\2\2QR\7,\2\2R"+
		"\30\3\2\2\2ST\7\61\2\2T\32\3\2\2\2UV\7/\2\2V\34\3\2\2\2WX\7#\2\2XY\7?"+
		"\2\2Y\36\3\2\2\2Z[\7?\2\2[\\\7?\2\2\\ \3\2\2\2]^\7@\2\2^\"\3\2\2\2_`\7"+
		">\2\2`$\3\2\2\2af\5)\25\2be\5)\25\2ce\5+\26\2db\3\2\2\2dc\3\2\2\2eh\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2g&\3\2\2\2hf\3\2\2\2ik\7/\2\2ji\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2ln\5+\26\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pw\3"+
		"\2\2\2qs\7\60\2\2rt\5+\26\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx"+
		"\3\2\2\2wq\3\2\2\2wx\3\2\2\2x(\3\2\2\2yz\t\2\2\2z*\3\2\2\2{|\t\3\2\2|"+
		",\3\2\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\27\2\2\u0083.\3\2\2\2"+
		"\u0084\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2\2\2\u0087\u0089"+
		"\n\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\30"+
		"\2\2\u008e\60\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0097"+
		"\3\2\2\2\u0092\u0096\n\6\2\2\u0093\u0094\7,\2\2\u0094\u0096\n\7\2\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7,\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\31"+
		"\2\2\u009e\62\3\2\2\2\r\2dfjouw\u0080\u008a\u0095\u0097\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}