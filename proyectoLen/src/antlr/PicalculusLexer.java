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
		Cap=1, Can=2, Var=3, Iff=4, Dot=5, Then=6, Eq=7, Neq=8, Pd=9, Hat=10, 
		Tao=11, Spam=12, Con=13, Plus=14, Crech=15, Par=16, ParA=17, Colon=18, 
		Ws=19, Bcom=20, Com=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", "Neq", "Pd", "Hat", 
			"Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", "Colon", "Ws", 
			"Bcom", "Com"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'if'", "'.'", "'then'", "'=='", "'!='", "'::='", 
			"'/'", "'&'", "'!'", "'|'", "'+'", "'#'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", "Neq", "Pd", "Hat", 
			"Tao", "Spam", "Con", "Plus", "Crech", "Par", "ParA", "Colon", "Ws", 
			"Bcom", "Com"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24_\n\24\r\24\16"+
		"\24`\3\24\3\24\3\25\3\25\3\25\3\25\7\25i\n\25\f\25\16\25l\13\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26w\n\26\f\26\16\26z\13\26\3"+
		"\26\5\26}\n\26\3\26\3\26\3\26\3\26\3j\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27\3\2\7\3\2C\\\3\2c|\4\2]]__\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0086"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3.\3\2\2\2\5\62\3\2"+
		"\2\2\7\64\3\2\2\2\t\67\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17A\3\2\2\2\21D"+
		"\3\2\2\2\23G\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35"+
		"S\3\2\2\2\37U\3\2\2\2!W\3\2\2\2#Y\3\2\2\2%[\3\2\2\2\'^\3\2\2\2)d\3\2\2"+
		"\2+r\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\4\3\2\2\2\62\63\t\3\2\2\63\6\3\2\2\2\64\65\t\3\2\2\65\66\7)\2\2\66"+
		"\b\3\2\2\2\678\7k\2\289\7h\2\29\n\3\2\2\2:;\7\60\2\2;\f\3\2\2\2<=\7v\2"+
		"\2=>\7j\2\2>?\7g\2\2?@\7p\2\2@\16\3\2\2\2AB\7?\2\2BC\7?\2\2C\20\3\2\2"+
		"\2DE\7#\2\2EF\7?\2\2F\22\3\2\2\2GH\7<\2\2HI\7<\2\2IJ\7?\2\2J\24\3\2\2"+
		"\2KL\7\61\2\2L\26\3\2\2\2MN\7(\2\2N\30\3\2\2\2OP\7#\2\2P\32\3\2\2\2QR"+
		"\7~\2\2R\34\3\2\2\2ST\7-\2\2T\36\3\2\2\2UV\7%\2\2V \3\2\2\2WX\4*+\2X\""+
		"\3\2\2\2YZ\t\4\2\2Z$\3\2\2\2[\\\7.\2\2\\&\3\2\2\2]_\t\5\2\2^]\3\2\2\2"+
		"_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\24\2\2c(\3\2\2\2de\7\61\2"+
		"\2ef\7,\2\2fj\3\2\2\2gi\13\2\2\2hg\3\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2"+
		"\2km\3\2\2\2lj\3\2\2\2mn\7,\2\2no\7\61\2\2op\3\2\2\2pq\b\25\2\2q*\3\2"+
		"\2\2rs\7\61\2\2st\7\61\2\2tx\3\2\2\2uw\n\6\2\2vu\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~"+
		"\3\2\2\2~\177\7\f\2\2\177\u0080\3\2\2\2\u0080\u0081\b\26\2\2\u0081,\3"+
		"\2\2\2\b\2\60`jx|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}