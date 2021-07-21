// Generated from /home/josteda99/Documents/CompetiveCode/Lenguajes/ProyectoLen/proyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2

package proyectoLen.src.antlr;

import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PicalculusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Cap=1, Can=2, Var=3, Iff=4, Dot=5, Then=6, Eq=7, Neq=8, Pd=9, Hat=10, 
		Tao=11, Spam=12, Con=13, Plus=14, Crech=15, Par=16, ParA=17, Colon=18, 
		Ws=19, Bcom=20, Com=21, Empty=22;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_write = 2, RULE_read = 3, RULE_createCh = 4, 
		RULE_ifCond = 5, RULE_parameters = 6, RULE_process = 7, RULE_oper = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "write", "read", "createCh", "ifCond", "parameters", 
			"process", "oper"
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

	@Override
	public String getGrammarFileName() { return "Picalculus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public static boolean SEMANTIC_ERROR = false;
	protected ArrayList<String> processScope = new ArrayList<String>();
	/**
	 * @varScope indicara si una variable o canal estan libre o no  por medio de una bitmask
	 * 1 -> libre
	 * 2 -> binded
	**/
	protected static int FREE = 1;
	protected static int BINDED = 2;
	protected HashMap<String, Integer> chanScope = new HashMap<String, Integer>();
	protected HashMap<String, Integer> varScope = new HashMap<String, Integer>();

	public PicalculusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Cap) | (1L << Can) | (1L << Iff) | (1L << Tao) | (1L << Spam) | (1L << Par) | (1L << ParA))) != 0)) {
				{
				{
				setState(18);
				stmt();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PicalculusParser.Dot, 0); }
		public TerminalNode Empty() { return getToken(PicalculusParser.Empty, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				process();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				oper(0);
				setState(26);
				match(Dot);
				setState(27);
				match(Empty);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

					varScope.forEach((k, v) -> System.out.println(k + " -> " + v));
					varScope.replaceAll((k,v) -> FREE);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public Token Can;
		public Token Var;
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public TerminalNode Hat() { return getToken(PicalculusParser.Hat, 0); }
		public TerminalNode Var() { return getToken(PicalculusParser.Var, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((WriteContext)_localctx).Can = match(Can);
			setState(32);
			match(Hat);
			setState(33);
			((WriteContext)_localctx).Var = match(Var);
			if(!chanScope.containsKey((((WriteContext)_localctx).Can!=null?((WriteContext)_localctx).Can.getText():null))) {
					System.out.printf("Error in Line %d:%d -> Channel %s no declared\n", (((WriteContext)_localctx).Can!=null?((WriteContext)_localctx).Can.getLine():0), (((WriteContext)_localctx).Can!=null?((WriteContext)_localctx).Can.getCharPositionInLine():0), (((WriteContext)_localctx).Can!=null?((WriteContext)_localctx).Can.getText():null));
					SEMANTIC_ERROR = true;
					throw new RuntimeException();
				}
				int value = varScope.getOrDefault((((WriteContext)_localctx).Var!=null?((WriteContext)_localctx).Var.getText():null), -1);
				if(value == -1) {
					varScope.putIfAbsent((((WriteContext)_localctx).Var!=null?((WriteContext)_localctx).Var.getText():null), FREE);
				}
				// Usa la variable y luego la libera
				varScope.compute((((WriteContext)_localctx).Var!=null?((WriteContext)_localctx).Var.getText():null), (k, v) -> v = FREE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public Token Can;
		public Token Var;
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public List<TerminalNode> Par() { return getTokens(PicalculusParser.Par); }
		public TerminalNode Par(int i) {
			return getToken(PicalculusParser.Par, i);
		}
		public TerminalNode Var() { return getToken(PicalculusParser.Var, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((ReadContext)_localctx).Can = match(Can);
			setState(37);
			match(Par);
			setState(38);
			((ReadContext)_localctx).Var = match(Var);
			setState(39);
			match(Par);
			if(!chanScope.containsKey((((ReadContext)_localctx).Can!=null?((ReadContext)_localctx).Can.getText():null))) {
					System.out.printf("Error in Line %d:%d -> Channel %s no declared\n", (((ReadContext)_localctx).Can!=null?((ReadContext)_localctx).Can.getLine():0), (((ReadContext)_localctx).Can!=null?((ReadContext)_localctx).Can.getCharPositionInLine():0), (((ReadContext)_localctx).Can!=null?((ReadContext)_localctx).Can.getText():null));
					SEMANTIC_ERROR = true;
					throw new RuntimeException();
				}
				int value = varScope.getOrDefault((((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getText():null), -1);
				if(value == -1) {
					varScope.putIfAbsent((((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getText():null), FREE);
				} else if((value & FREE) != FREE) {
					System.out.printf("Error in Line %d:%d -> Variable %s is not free\n", (((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getLine():0), (((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getCharPositionInLine():0), (((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getText():null));
					SEMANTIC_ERROR = true;
					throw new RuntimeException();
				}
				// Leé la variable y la bindea
				varScope.compute((((ReadContext)_localctx).Var!=null?((ReadContext)_localctx).Var.getText():null), (k, v) -> v = BINDED);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateChContext extends ParserRuleContext {
		public Token Can;
		public List<TerminalNode> Par() { return getTokens(PicalculusParser.Par); }
		public TerminalNode Par(int i) {
			return getToken(PicalculusParser.Par, i);
		}
		public TerminalNode Crech() { return getToken(PicalculusParser.Crech, 0); }
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public CreateChContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCh; }
	}

	public final CreateChContext createCh() throws RecognitionException {
		CreateChContext _localctx = new CreateChContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createCh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(Par);
			setState(43);
			match(Crech);
			setState(44);
			((CreateChContext)_localctx).Can = match(Can);
			setState(45);
			match(Par);

					chanScope.putIfAbsent((((CreateChContext)_localctx).Can!=null?((CreateChContext)_localctx).Can.getText():null), FREE);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCondContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode Iff() { return getToken(PicalculusParser.Iff, 0); }
		public TerminalNode Then() { return getToken(PicalculusParser.Then, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public List<TerminalNode> Var() { return getTokens(PicalculusParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PicalculusParser.Var, i);
		}
		public TerminalNode Eq() { return getToken(PicalculusParser.Eq, 0); }
		public TerminalNode Neq() { return getToken(PicalculusParser.Neq, 0); }
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(Iff);
			setState(49);
			((IfCondContext)_localctx).left = match(Var);
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==Eq || _la==Neq) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			((IfCondContext)_localctx).right = match(Var);
			setState(52);
			match(Then);
			setState(53);
			oper(0);
			int value = varScope.getOrDefault((((IfCondContext)_localctx).left!=null?((IfCondContext)_localctx).left.getText():null), -1);
				if(value == -1 || (value & FREE) == FREE) {
			      	System.out.printf("Error in Line %d:%d -> Variable %s is not free or not exist\n", (((IfCondContext)_localctx).left!=null?((IfCondContext)_localctx).left.getLine():0), (((IfCondContext)_localctx).left!=null?((IfCondContext)_localctx).left.getCharPositionInLine():0), (((IfCondContext)_localctx).left!=null?((IfCondContext)_localctx).left.getText():null));
					SEMANTIC_ERROR = true;
					throw new RuntimeException();
				}
				value = varScope.getOrDefault((((IfCondContext)_localctx).right!=null?((IfCondContext)_localctx).right.getText():null), -1);
				if(value == -1 || (value & FREE) == FREE) {
					System.out.printf("Error in Line %d:%d -> Variable %s is not free or not exist\n", (((IfCondContext)_localctx).right!=null?((IfCondContext)_localctx).right.getLine():0), (((IfCondContext)_localctx).right!=null?((IfCondContext)_localctx).right.getCharPositionInLine():0), (((IfCondContext)_localctx).right!=null?((IfCondContext)_localctx).right.getText():null));
					SEMANTIC_ERROR = true;
					throw new RuntimeException();
				}
				// se puede hacer comprobacion del if
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public Token Can;
		public List<Token> cha = new ArrayList<Token>();
		public Token Var;
		public List<Token> var = new ArrayList<Token>();
		public List<TerminalNode> Can() { return getTokens(PicalculusParser.Can); }
		public TerminalNode Can(int i) {
			return getToken(PicalculusParser.Can, i);
		}
		public List<TerminalNode> Var() { return getTokens(PicalculusParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PicalculusParser.Var, i);
		}
		public List<TerminalNode> Colon() { return getTokens(PicalculusParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PicalculusParser.Colon, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
				{
				setState(56);
				((ParametersContext)_localctx).Can = match(Can);
				((ParametersContext)_localctx).cha.add(((ParametersContext)_localctx).Can);
				}
				break;
			case Var:
				{
				setState(57);
				((ParametersContext)_localctx).Var = match(Var);
				((ParametersContext)_localctx).var.add(((ParametersContext)_localctx).Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(60);
				match(Colon);
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Can:
					{
					setState(61);
					((ParametersContext)_localctx).Can = match(Can);
					((ParametersContext)_localctx).cha.add(((ParametersContext)_localctx).Can);
					}
					break;
				case Var:
					{
					setState(62);
					((ParametersContext)_localctx).Var = match(Var);
					((ParametersContext)_localctx).var.add(((ParametersContext)_localctx).Var);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			((ParametersContext)_localctx).var.forEach(x -> varScope.putIfAbsent(x.getText(), FREE));
						((ParametersContext)_localctx).cha.forEach(x -> chanScope.putIfAbsent(x.getText(), FREE));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public Token Cap;
		public Token Pd;
		public TerminalNode Cap() { return getToken(PicalculusParser.Cap, 0); }
		public List<TerminalNode> ParA() { return getTokens(PicalculusParser.ParA); }
		public TerminalNode ParA(int i) {
			return getToken(PicalculusParser.ParA, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Pd() { return getToken(PicalculusParser.Pd, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TerminalNode Dot() { return getToken(PicalculusParser.Dot, 0); }
		public TerminalNode Empty() { return getToken(PicalculusParser.Empty, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((ProcessContext)_localctx).Cap = match(Cap);
			setState(71);
			match(ParA);
			setState(72);
			parameters();
			setState(73);
			match(ParA);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pd) {
				{
				setState(74);
				((ProcessContext)_localctx).Pd = match(Pd);
				setState(75);
				oper(0);
				setState(76);
				match(Dot);
				setState(77);
				match(Empty);
				}
			}

			if((((ProcessContext)_localctx).Pd!=null?((ProcessContext)_localctx).Pd.getText():null) == null) {
					if(!processScope.contains((((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null))) {
						System.out.printf("Error line %d:%d -> Process %s not declared yet\n", (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getLine():0), (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getCharPositionInLine():0), (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null));
						SEMANTIC_ERROR = true;
					}
				} else {
					if(!processScope.contains((((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null))) processScope.add((((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null));
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperContext extends ParserRuleContext {
		public Token Cap;
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public CreateChContext createCh() {
			return getRuleContext(CreateChContext.class,0);
		}
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public List<TerminalNode> ParA() { return getTokens(PicalculusParser.ParA); }
		public TerminalNode ParA(int i) {
			return getToken(PicalculusParser.ParA, i);
		}
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode Spam() { return getToken(PicalculusParser.Spam, 0); }
		public TerminalNode Cap() { return getToken(PicalculusParser.Cap, 0); }
		public TerminalNode Tao() { return getToken(PicalculusParser.Tao, 0); }
		public TerminalNode Dot() { return getToken(PicalculusParser.Dot, 0); }
		public TerminalNode Con() { return getToken(PicalculusParser.Con, 0); }
		public TerminalNode Plus() { return getToken(PicalculusParser.Plus, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
	}

	public final OperContext oper() throws RecognitionException {
		return oper(0);
	}

	private OperContext oper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperContext _localctx = new OperContext(_ctx, _parentState);
		OperContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_oper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
			case Iff:
			case Par:
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(84);
					write();
					}
					break;
				case 2:
					{
					setState(85);
					read();
					}
					break;
				case 3:
					{
					setState(86);
					createCh();
					}
					break;
				case 4:
					{
					setState(87);
					ifCond();
					}
					break;
				}
				}
				break;
			case ParA:
				{
				setState(90);
				match(ParA);
				setState(91);
				oper(0);
				setState(92);
				match(ParA);
				}
				break;
			case Spam:
				{
				setState(94);
				match(Spam);
				setState(95);
				oper(3);
				}
				break;
			case Cap:
				{
				setState(96);
				((OperContext)_localctx).Cap = match(Cap);

						if(!processScope.contains((((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getText():null))) {
							System.out.printf("Error line %d:%d -> Process %s not declared yet\n", (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getLine():0), (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getCharPositionInLine():0), (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getText():null));
							SEMANTIC_ERROR = true;
							throw new RuntimeException();
						}
				}
				break;
			case Tao:
				{
				setState(98);
				match(Tao);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						match(Dot);
						setState(103);
						oper(7);
						}
						break;
					case 2:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						match(Con);
						setState(106);
						oper(6);
						}
						break;
					case 3:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						match(Plus);
						setState(109);
						oper(5);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return oper_sempred((OperContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oper_sempred(OperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\5\b=\n\b\3\b\3\b\3\b\5\bB\n\b\7\bD\n\b\f\b\16\bG\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\n[\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\n\2\3\22\13\2\4\6"+
		"\b\n\f\16\20\22\2\3\3\2\t\n\2|\2\27\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b"+
		"&\3\2\2\2\n,\3\2\2\2\f\62\3\2\2\2\16<\3\2\2\2\20H\3\2\2\2\22e\3\2\2\2"+
		"\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\3\3\2\2\2\31\27\3\2\2\2\32 \5\20\t\2\33\34\5\22\n\2\34\35\7\7\2\2"+
		"\35\36\7\30\2\2\36 \3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2 \5\3\2\2\2!\""+
		"\7\4\2\2\"#\7\f\2\2#$\7\5\2\2$%\b\4\1\2%\7\3\2\2\2&\'\7\4\2\2\'(\7\22"+
		"\2\2()\7\5\2\2)*\7\22\2\2*+\b\5\1\2+\t\3\2\2\2,-\7\22\2\2-.\7\21\2\2."+
		"/\7\4\2\2/\60\7\22\2\2\60\61\b\6\1\2\61\13\3\2\2\2\62\63\7\6\2\2\63\64"+
		"\7\5\2\2\64\65\t\2\2\2\65\66\7\5\2\2\66\67\7\b\2\2\678\5\22\n\289\b\7"+
		"\1\29\r\3\2\2\2:=\7\4\2\2;=\7\5\2\2<:\3\2\2\2<;\3\2\2\2=E\3\2\2\2>A\7"+
		"\24\2\2?B\7\4\2\2@B\7\5\2\2A?\3\2\2\2A@\3\2\2\2BD\3\2\2\2C>\3\2\2\2DG"+
		"\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GE\3\2\2\2HI\7\3\2\2IJ\7\23\2"+
		"\2JK\5\16\b\2KQ\7\23\2\2LM\7\13\2\2MN\5\22\n\2NO\7\7\2\2OP\7\30\2\2PR"+
		"\3\2\2\2QL\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\t\1\2T\21\3\2\2\2UZ\b\n\1\2"+
		"V[\5\6\4\2W[\5\b\5\2X[\5\n\6\2Y[\5\f\7\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2"+
		"ZY\3\2\2\2[f\3\2\2\2\\]\7\23\2\2]^\5\22\n\2^_\7\23\2\2_f\3\2\2\2`a\7\16"+
		"\2\2af\5\22\n\5bc\7\3\2\2cf\b\n\1\2df\7\r\2\2eU\3\2\2\2e\\\3\2\2\2e`\3"+
		"\2\2\2eb\3\2\2\2ed\3\2\2\2fr\3\2\2\2gh\f\b\2\2hi\7\7\2\2iq\5\22\n\tjk"+
		"\f\7\2\2kl\7\17\2\2lq\5\22\n\bmn\f\6\2\2no\7\20\2\2oq\5\22\n\7pg\3\2\2"+
		"\2pj\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tr\3\2"+
		"\2\2\f\27\37<AEQZepr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}