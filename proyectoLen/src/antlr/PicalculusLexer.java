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
		Cap=1, Can=2, Var=3, Iff=4, Dot=5, Then=6, Eq=7, Neq=8, Pd=9, Bar=10, 
		Tao=11, Spam=12, Con=13, Plus=14, Crech=15, Par=16, ParA=17, Colon=18, 
		Ws=19, Bcom=20, Com=21, Empty=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Cap", "Can", "Letter", "Var", "Iff", "Dot", "Then", "Eq", "Neq", "Pd", 
			"Bar", "Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", "Colon", 
			"Ws", "Bcom", "Com", "Empty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'if'", "'.'", "'then'", "'=='", "'!='", "'::='", 
			"'/'", "'&'", "'!'", "'|'", "'+'", "'#'", null, null, "','", null, null, 
			null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", "Neq", "Pd", "Bar", 
			"Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", "Colon", "Ws", 
			"Bcom", "Com", "Empty"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\5\6"+
		"\5A\n\5\r\5\16\5B\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25n\n\25"+
		"\r\25\16\25o\3\25\3\25\3\26\3\26\3\26\3\26\7\26x\n\26\f\26\16\26{\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0086\n\27\f\27\16"+
		"\27\u0089\13\27\3\27\5\27\u008c\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3y"+
		"\2\31\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35"+
		"\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\3\2\b\3\2C\\\4\2C\\c|\3\2c"+
		"|\4\2]]__\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0098\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\59\3\2\2\2\7=\3\2"+
		"\2\2\t@\3\2\2\2\13F\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21P\3\2\2\2\23S\3\2"+
		"\2\2\25V\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b"+
		"\3\2\2\2!d\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)m\3\2\2\2+s\3\2\2\2"+
		"-\u0081\3\2\2\2/\u0091\3\2\2\2\61\65\t\2\2\2\62\64\t\3\2\2\63\62\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\4\3\2\2\2\67\65\3\2\2"+
		"\28:\5\7\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\6\3\2\2\2=>\t\4"+
		"\2\2>\b\3\2\2\2?A\5\7\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3"+
		"\2\2\2DE\7)\2\2E\n\3\2\2\2FG\7k\2\2GH\7h\2\2H\f\3\2\2\2IJ\7\60\2\2J\16"+
		"\3\2\2\2KL\7v\2\2LM\7j\2\2MN\7g\2\2NO\7p\2\2O\20\3\2\2\2PQ\7?\2\2QR\7"+
		"?\2\2R\22\3\2\2\2ST\7#\2\2TU\7?\2\2U\24\3\2\2\2VW\7<\2\2WX\7<\2\2XY\7"+
		"?\2\2Y\26\3\2\2\2Z[\7\61\2\2[\30\3\2\2\2\\]\7(\2\2]\32\3\2\2\2^_\7#\2"+
		"\2_\34\3\2\2\2`a\7~\2\2a\36\3\2\2\2bc\7-\2\2c \3\2\2\2de\7%\2\2e\"\3\2"+
		"\2\2fg\t\5\2\2g$\3\2\2\2hi\4*+\2i&\3\2\2\2jk\7.\2\2k(\3\2\2\2ln\t\6\2"+
		"\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\25\2\2r*\3\2"+
		"\2\2st\7\61\2\2tu\7,\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3"+
		"\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177\3\2\2\2"+
		"\177\u0080\b\26\2\2\u0080,\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7"+
		"\61\2\2\u0083\u0087\3\2\2\2\u0084\u0086\n\7\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7\17\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\b\27\2\2\u0090.\3\2\2\2\u0091\u0092\7\62\2\2\u0092\60"+
		"\3\2\2\2\n\2\65;Boy\u0087\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}