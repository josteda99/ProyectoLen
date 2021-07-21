// Generated from /home/josteda99/Documents/CompetiveCode/Lenguajes/ProyectoLen/proyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2

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
		Ws=19, Bcom=20, Com=21, Empty=22;
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
			"Bcom", "Com", "Empty"
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
			null, "Cap", "Can", "Var", "Iff", "Dot", "Then", "Eq", "Neq", "Pd", "Hat", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\6\24c\n\24\r\24\16\24d\3\24\3\24\3\25\3\25\3\25\3\25\7\25m\n\25\f"+
		"\25\16\25p\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26{\n"+
		"\26\f\26\16\26~\13\26\3\26\5\26\u0081\n\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3n\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\3\2C\\\4\2C\\c|\3\2"+
		"c|\4\2]]__\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u008c\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3\2\2\2\78\3"+
		"\2\2\2\t;\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23K\3"+
		"\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37"+
		"Y\3\2\2\2![\3\2\2\2#]\3\2\2\2%_\3\2\2\2\'b\3\2\2\2)h\3\2\2\2+v\3\2\2\2"+
		"-\u0086\3\2\2\2/\63\t\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\4\3\2\2\2\65\63\3\2\2\2\66\67\t\4\2\2"+
		"\67\6\3\2\2\289\t\4\2\29:\7)\2\2:\b\3\2\2\2;<\7k\2\2<=\7h\2\2=\n\3\2\2"+
		"\2>?\7\60\2\2?\f\3\2\2\2@A\7v\2\2AB\7j\2\2BC\7g\2\2CD\7p\2\2D\16\3\2\2"+
		"\2EF\7?\2\2FG\7?\2\2G\20\3\2\2\2HI\7#\2\2IJ\7?\2\2J\22\3\2\2\2KL\7<\2"+
		"\2LM\7<\2\2MN\7?\2\2N\24\3\2\2\2OP\7\61\2\2P\26\3\2\2\2QR\7(\2\2R\30\3"+
		"\2\2\2ST\7#\2\2T\32\3\2\2\2UV\7~\2\2V\34\3\2\2\2WX\7-\2\2X\36\3\2\2\2"+
		"YZ\7%\2\2Z \3\2\2\2[\\\t\5\2\2\\\"\3\2\2\2]^\4*+\2^$\3\2\2\2_`\7.\2\2"+
		"`&\3\2\2\2ac\t\6\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2"+
		"fg\b\24\2\2g(\3\2\2\2hi\7\61\2\2ij\7,\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2"+
		"\2mp\3\2\2\2no\3\2\2\2nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7,\2\2rs\7\61\2"+
		"\2st\3\2\2\2tu\b\25\2\2u*\3\2\2\2vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\n"+
		"\7\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\26\2\2"+
		"\u0085,\3\2\2\2\u0086\u0087\7\62\2\2\u0087.\3\2\2\2\b\2\63dn|\u0080\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}