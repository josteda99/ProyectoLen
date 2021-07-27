// Generated from /mnt/Files/Unal_asignaturas/Len_progra2021-1/Ant-LR/ProyectoLen/proyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2

package proyectoLen.src.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PicalculusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Cap=5, Can=6, Var=7, Iff=8, Dot=9, Then=10, 
		Eq=11, Neq=12, Pd=13, Hat=14, Tao=15, Spam=16, Con=17, Plus=18, Crech=19, 
		Par=20, ParA=21, Colon=22, Ws=23, Bcom=24, Com=25, Empty=26, DoDot=27, 
		Type=28, Arrow=29, Int=30, String=31, SpamSetting=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Cap", "Can", "Var", "Iff", "Dot", "Then", 
			"Eq", "Neq", "Pd", "Hat", "Tao", "Spam", "Con", "Plus", "Crech", "Par", 
			"ParA", "Colon", "Ws", "Bcom", "Com", "Empty", "DoDot", "Type", "Arrow", 
			"Int", "String", "SpamSetting", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%state'", "'new'", "'run'", "'print'", null, null, null, "'if'", 
			"'.'", "'then'", "'=='", "'!='", "'::='", "'/'", "'&'", "'!'", "'|'", 
			"'+'", "'#'", null, null, "','", null, null, null, "'0'", "'::'", null, 
			"'->'", null, null, "'%spam'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Cap", "Can", "Var", "Iff", "Dot", "Then", 
			"Eq", "Neq", "Pd", "Hat", "Tao", "Spam", "Con", "Plus", "Crech", "Par", 
			"ParA", "Colon", "Ws", "Bcom", "Com", "Empty", "DoDot", "Type", "Arrow", 
			"Int", "String", "SpamSetting"
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


	public PicalculusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Picalculus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\6\7c\n"+
		"\7\r\7\16\7d\3\b\6\bh\n\b\r\b\16\bi\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\6\30\u0095\n\30\r\30\16\30\u0096\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u009f\n\31\f\31\16\31\u00a2\13\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u00ad\n\32\f\32\16\32\u00b0\13\32\3\32"+
		"\5\32\u00b3\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c8\n\35\3\36\3\36\3\36"+
		"\3\37\5\37\u00ce\n\37\3\37\6\37\u00d1\n\37\r\37\16\37\u00d2\3 \3 \3 \3"+
		" \7 \u00d9\n \f \16 \u00dc\13 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\u00a0"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C\2\3\2\13\3\2C\\\4\2C\\c|\4\2]]__\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\3\2\62;\4\2$$^^\6\2\f\f\17\17$$^^\3\2c|\2\u00f1\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\3E\3\2\2\2\5L\3\2\2\2\7P\3\2\2\2\tT\3\2\2\2\13"+
		"Z\3\2\2\2\rb\3\2\2\2\17g\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25r\3\2\2\2\27"+
		"w\3\2\2\2\31z\3\2\2\2\33}\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085"+
		"\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2"+
		"+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61\u009a\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c9\3\2\2"+
		"\2=\u00cd\3\2\2\2?\u00d4\3\2\2\2A\u00df\3\2\2\2C\u00e5\3\2\2\2EF\7\'\2"+
		"\2FG\7u\2\2GH\7v\2\2HI\7c\2\2IJ\7v\2\2JK\7g\2\2K\4\3\2\2\2LM\7p\2\2MN"+
		"\7g\2\2NO\7y\2\2O\6\3\2\2\2PQ\7t\2\2QR\7w\2\2RS\7p\2\2S\b\3\2\2\2TU\7"+
		"r\2\2UV\7t\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\n\3\2\2\2Z^\t\2\2\2[]\t\3\2"+
		"\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\f\3\2\2\2`^\3\2\2\2ac\5"+
		"C\"\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\16\3\2\2\2fh\5C\"\2gf\3"+
		"\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7)\2\2l\20\3\2\2\2mn"+
		"\7k\2\2no\7h\2\2o\22\3\2\2\2pq\7\60\2\2q\24\3\2\2\2rs\7v\2\2st\7j\2\2"+
		"tu\7g\2\2uv\7p\2\2v\26\3\2\2\2wx\7?\2\2xy\7?\2\2y\30\3\2\2\2z{\7#\2\2"+
		"{|\7?\2\2|\32\3\2\2\2}~\7<\2\2~\177\7<\2\2\177\u0080\7?\2\2\u0080\34\3"+
		"\2\2\2\u0081\u0082\7\61\2\2\u0082\36\3\2\2\2\u0083\u0084\7(\2\2\u0084"+
		" \3\2\2\2\u0085\u0086\7#\2\2\u0086\"\3\2\2\2\u0087\u0088\7~\2\2\u0088"+
		"$\3\2\2\2\u0089\u008a\7-\2\2\u008a&\3\2\2\2\u008b\u008c\7%\2\2\u008c("+
		"\3\2\2\2\u008d\u008e\t\4\2\2\u008e*\3\2\2\2\u008f\u0090\4*+\2\u0090,\3"+
		"\2\2\2\u0091\u0092\7.\2\2\u0092.\3\2\2\2\u0093\u0095\t\5\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\b\30\2\2\u0099\60\3\2\2\2\u009a\u009b\7\61"+
		"\2\2\u009b\u009c\7,\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4"+
		"\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\31\2\2\u00a7\62\3\2"+
		"\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2\2\2\u00ab"+
		"\u00ad\n\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\32\2\2\u00b7"+
		"\64\3\2\2\2\u00b8\u00b9\7\62\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb"+
		"\u00bc\7<\2\2\u00bc8\3\2\2\2\u00bd\u00c7\7\u0080\2\2\u00be\u00bf\7K\2"+
		"\2\u00bf\u00c0\7p\2\2\u00c0\u00c8\7v\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\u00c8\7i\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8:\3\2\2\2\u00c9"+
		"\u00ca\7/\2\2\u00ca\u00cb\7@\2\2\u00cb<\3\2\2\2\u00cc\u00ce\7/\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\t\7"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3>\3\2\2\2\u00d4\u00da\7$\2\2\u00d5\u00d6\7^\2\2\u00d6"+
		"\u00d9\t\b\2\2\u00d7\u00d9\n\t\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00de@\3\2\2\2\u00df"+
		"\u00e0\7\'\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7c\2"+
		"\2\u00e3\u00e4\7o\2\2\u00e4B\3\2\2\2\u00e5\u00e6\t\n\2\2\u00e6D\3\2\2"+
		"\2\17\2^di\u0096\u00a0\u00ae\u00b2\u00c7\u00cd\u00d2\u00d8\u00da\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}