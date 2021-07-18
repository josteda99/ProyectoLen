// Generated from /home/josteda99/Documents/CompetiveCode/Lenguajes/ProyectoLen/proyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2

package proyectoLen.src.antlr;

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
		Ws=19, Bcom=20, Com=21;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_write = 2, RULE_read = 3, RULE_processOp = 4, 
		RULE_createCh = 5, RULE_ifCond = 6, RULE_parameters = 7, RULE_process = 8, 
		RULE_oper = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "write", "read", "processOp", "createCh", "ifCond", "parameters", 
			"process", "oper"
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

	public PicalculusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PicalculusParser.EOF, 0); }
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Cap) | (1L << Can) | (1L << Iff) | (1L << Tao) | (1L << Spam) | (1L << Par) | (1L << ParA))) != 0)) {
				{
				{
				setState(20);
				stmt();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpContext extends StmtContext {
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public OpContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class OpraContext extends StmtContext {
		public ProcessOpContext processOp() {
			return getRuleContext(ProcessOpContext.class,0);
		}
		public OpraContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class DclaContext extends StmtContext {
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public DclaContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new OpraContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				processOp();
				}
				break;
			case 2:
				_localctx = new DclaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				process();
				}
				break;
			case 3:
				_localctx = new OpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				oper(0);
				}
				break;
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

	public static class WriteContext extends ParserRuleContext {
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
			setState(33);
			match(Can);
			setState(34);
			match(Hat);
			setState(35);
			match(Var);
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
			setState(37);
			match(Can);
			setState(38);
			match(Par);
			setState(39);
			match(Var);
			setState(40);
			match(Par);
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

	public static class ProcessOpContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public List<TerminalNode> Cap() { return getTokens(PicalculusParser.Cap); }
		public TerminalNode Cap(int i) {
			return getToken(PicalculusParser.Cap, i);
		}
		public TerminalNode Con() { return getToken(PicalculusParser.Con, 0); }
		public TerminalNode Plus() { return getToken(PicalculusParser.Plus, 0); }
		public ProcessOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processOp; }
	}

	public final ProcessOpContext processOp() throws RecognitionException {
		ProcessOpContext _localctx = new ProcessOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_processOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((ProcessOpContext)_localctx).left = match(Cap);
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==Con || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			((ProcessOpContext)_localctx).right = match(Cap);
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
		enterRule(_localctx, 10, RULE_createCh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Par);
			setState(47);
			match(Crech);
			setState(48);
			match(Can);
			setState(49);
			match(Par);
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
		public TerminalNode Iff() { return getToken(PicalculusParser.Iff, 0); }
		public List<TerminalNode> Var() { return getTokens(PicalculusParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PicalculusParser.Var, i);
		}
		public TerminalNode Then() { return getToken(PicalculusParser.Then, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
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
		enterRule(_localctx, 12, RULE_ifCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Iff);
			setState(52);
			match(Var);
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==Eq || _la==Neq) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(54);
			match(Var);
			setState(55);
			match(Then);
			setState(56);
			oper(0);
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
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==Can || _la==Var) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(59);
				match(Colon);
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==Can || _la==Var) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(65);
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

	public static class ProcessContext extends ParserRuleContext {
		public Token Cap;
		public Token Pd;
		public TerminalNode Cap() { return getToken(PicalculusParser.Cap, 0); }
		public List<TerminalNode> Par() { return getTokens(PicalculusParser.Par); }
		public TerminalNode Par(int i) {
			return getToken(PicalculusParser.Par, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Pd() { return getToken(PicalculusParser.Pd, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((ProcessContext)_localctx).Cap = match(Cap);
			setState(67);
			match(Par);
			setState(68);
			parameters();
			setState(69);
			match(Par);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pd) {
				{
				setState(70);
				((ProcessContext)_localctx).Pd = match(Pd);
				setState(71);
				oper(0);
				}
			}

			if((((ProcessContext)_localctx).Pd!=null?((ProcessContext)_localctx).Pd.getText():null) == null){
					if(!processScope.contains((((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null))){
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_oper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
			case Iff:
			case Par:
				{
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(77);
					write();
					}
					break;
				case 2:
					{
					setState(78);
					read();
					}
					break;
				case 3:
					{
					setState(79);
					createCh();
					}
					break;
				case 4:
					{
					setState(80);
					ifCond();
					}
					break;
				}
				}
				break;
			case ParA:
				{
				setState(83);
				match(ParA);
				setState(84);
				oper(0);
				setState(85);
				match(ParA);
				}
				break;
			case Spam:
				{
				setState(87);
				match(Spam);
				setState(88);
				oper(3);
				}
				break;
			case Cap:
				{
				setState(89);
				match(Cap);
				}
				break;
			case Tao:
				{
				setState(90);
				match(Tao);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper);
					setState(93);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(94);
					match(Dot);
					setState(95);
					oper(6);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 9:
			return oper_sempred((OperContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oper_sempred(OperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nK\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13T\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\13\3\13\3\13\7\13c\n\13"+
		"\f\13\16\13f\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\17\20"+
		"\3\2\t\n\3\2\4\5\2j\2\31\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b\'\3\2\2\2\n,"+
		"\3\2\2\2\f\60\3\2\2\2\16\65\3\2\2\2\20<\3\2\2\2\22D\3\2\2\2\24]\3\2\2"+
		"\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\"\5\n\6\2"+
		"\37\"\5\22\n\2 \"\5\24\13\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2"+
		"\2\2#$\7\4\2\2$%\7\f\2\2%&\7\5\2\2&\7\3\2\2\2\'(\7\4\2\2()\7\22\2\2)*"+
		"\7\5\2\2*+\7\22\2\2+\t\3\2\2\2,-\7\3\2\2-.\t\2\2\2./\7\3\2\2/\13\3\2\2"+
		"\2\60\61\7\22\2\2\61\62\7\21\2\2\62\63\7\4\2\2\63\64\7\22\2\2\64\r\3\2"+
		"\2\2\65\66\7\6\2\2\66\67\7\5\2\2\678\t\3\2\289\7\5\2\29:\7\b\2\2:;\5\24"+
		"\13\2;\17\3\2\2\2<A\t\4\2\2=>\7\24\2\2>@\t\4\2\2?=\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2B\21\3\2\2\2CA\3\2\2\2DE\7\3\2\2EF\7\22\2\2FG\5\20"+
		"\t\2GJ\7\22\2\2HI\7\13\2\2IK\5\24\13\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2L"+
		"M\b\n\1\2M\23\3\2\2\2NS\b\13\1\2OT\5\6\4\2PT\5\b\5\2QT\5\f\7\2RT\5\16"+
		"\b\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T^\3\2\2\2UV\7\23\2\2VW\5"+
		"\24\13\2WX\7\23\2\2X^\3\2\2\2YZ\7\16\2\2Z^\5\24\13\5[^\7\3\2\2\\^\7\r"+
		"\2\2]N\3\2\2\2]U\3\2\2\2]Y\3\2\2\2][\3\2\2\2]\\\3\2\2\2^d\3\2\2\2_`\f"+
		"\7\2\2`a\7\7\2\2ac\5\24\13\bb_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"\25\3\2\2\2fd\3\2\2\2\t\31!AJS]d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}