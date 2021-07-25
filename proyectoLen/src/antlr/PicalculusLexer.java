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
		T__0=1, T__1=2, T__2=3, Cap=4, Can=5, Var=6, Iff=7, Dot=8, Then=9, Eq=10, 
		Neq=11, Pd=12, Hat=13, Tao=14, Spam=15, Con=16, Plus=17, Crech=18, Par=19, 
		ParA=20, Colon=21, Ws=22, Bcom=23, Com=24, Empty=25, DoDot=26, Type=27, 
		Arrow=28, Int=29, String=30, SpamSetting=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", 
			"Neq", "Pd", "Hat", "Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", 
			"Colon", "Ws", "Bcom", "Com", "Empty", "DoDot", "Type", "Arrow", "Int", 
			"String", "SpamSetting", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'run'", "'print'", null, null, null, "'if'", "'.'", "'then'", 
			"'=='", "'!='", "'::='", "'/'", "'&'", "'!'", "'|'", "'+'", "'#'", null, 
			null, "','", null, null, null, "'0'", "'::'", null, "'->'", null, null, 
			"'%spam'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", 
			"Neq", "Pd", "Hat", "Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", 
			"Colon", "Ws", "Bcom", "Com", "Empty", "DoDot", "Type", "Arrow", "Int", 
			"String", "SpamSetting"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7"+
		"\5T\n\5\f\5\16\5W\13\5\3\6\6\6Z\n\6\r\6\16\6[\3\7\6\7_\n\7\r\7\16\7`\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u008c\n\27\r\27\16"+
		"\27\u008d\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0096\n\30\f\30\16\30\u0099"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a4\n\31\f"+
		"\31\16\31\u00a7\13\31\3\31\5\31\u00aa\n\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u00bf\n\34\3\35\3\35\3\35\3\36\5\36\u00c5\n\36\3\36\6\36\u00c8\n\36"+
		"\r\36\16\36\u00c9\3\37\3\37\3\37\3\37\7\37\u00d0\n\37\f\37\16\37\u00d3"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\u0097\2\"\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2\3\2\13\3\2"+
		"C\\\4\2C\\c|\4\2]]__\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\4\2$$^^"+
		"\6\2\f\f\17\17$$^^\3\2c|\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3C\3\2\2\2"+
		"\5G\3\2\2\2\7K\3\2\2\2\tQ\3\2\2\2\13Y\3\2\2\2\r^\3\2\2\2\17d\3\2\2\2\21"+
		"g\3\2\2\2\23i\3\2\2\2\25n\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33x\3\2\2\2"+
		"\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0084"+
		"\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008b\3\2\2\2/\u0091\3\2\2\2\61"+
		"\u009f\3\2\2\2\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b4\3\2\2\29\u00c0"+
		"\3\2\2\2;\u00c4\3\2\2\2=\u00cb\3\2\2\2?\u00d6\3\2\2\2A\u00dc\3\2\2\2C"+
		"D\7p\2\2DE\7g\2\2EF\7y\2\2F\4\3\2\2\2GH\7t\2\2HI\7w\2\2IJ\7p\2\2J\6\3"+
		"\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2P\b\3\2\2\2QU\t\2\2"+
		"\2RT\t\3\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\n\3\2\2\2WU\3\2"+
		"\2\2XZ\5A!\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\f\3\2\2\2]_\5"+
		"A!\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7)\2\2c\16\3"+
		"\2\2\2de\7k\2\2ef\7h\2\2f\20\3\2\2\2gh\7\60\2\2h\22\3\2\2\2ij\7v\2\2j"+
		"k\7j\2\2kl\7g\2\2lm\7p\2\2m\24\3\2\2\2no\7?\2\2op\7?\2\2p\26\3\2\2\2q"+
		"r\7#\2\2rs\7?\2\2s\30\3\2\2\2tu\7<\2\2uv\7<\2\2vw\7?\2\2w\32\3\2\2\2x"+
		"y\7\61\2\2y\34\3\2\2\2z{\7(\2\2{\36\3\2\2\2|}\7#\2\2} \3\2\2\2~\177\7"+
		"~\2\2\177\"\3\2\2\2\u0080\u0081\7-\2\2\u0081$\3\2\2\2\u0082\u0083\7%\2"+
		"\2\u0083&\3\2\2\2\u0084\u0085\t\4\2\2\u0085(\3\2\2\2\u0086\u0087\4*+\2"+
		"\u0087*\3\2\2\2\u0088\u0089\7.\2\2\u0089,\3\2\2\2\u008a\u008c\t\5\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\27\2\2\u0090.\3\2\2\2\u0091"+
		"\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096\13"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7,"+
		"\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\30\2\2\u009e"+
		"\60\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5\3\2"+
		"\2\2\u00a2\u00a4\n\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\31"+
		"\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7\62\2\2\u00b0\64\3\2\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\u00b3\7<\2\2\u00b3\66\3\2\2\2\u00b4\u00be\7\u0080\2\2\u00b5"+
		"\u00b6\7K\2\2\u00b6\u00b7\7p\2\2\u00b7\u00bf\7v\2\2\u00b8\u00b9\7U\2\2"+
		"\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00bf\7i\2\2\u00be\u00b5\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf"+
		"8\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\7@\2\2\u00c2:\3\2\2\2\u00c3\u00c5"+
		"\7/\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c8\t\7\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca<\3\2\2\2\u00cb\u00d1\7$\2\2\u00cc\u00cd"+
		"\7^\2\2\u00cd\u00d0\t\b\2\2\u00ce\u00d0\n\t\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5"+
		">\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7r\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7o\2\2\u00db@\3\2\2\2\u00dc\u00dd\t\n\2\2\u00dd"+
		"B\3\2\2\2\17\2U[`\u008d\u0097\u00a5\u00a9\u00be\u00c4\u00c9\u00cf\u00d1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}