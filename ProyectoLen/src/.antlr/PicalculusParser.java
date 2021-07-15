// Generated from /mnt/Files/Unal_asignaturas/Len_progra2021-1/Ant-LR/ProyectoLen/ProyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2
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
		RULE_r = 0, RULE_stmt = 1, RULE_write = 2, RULE_read = 3, RULE_processOp = 4, 
		RULE_createCh = 5, RULE_ifCond = 6, RULE_processInvoc = 7, RULE_parameters = 8, 
		RULE_processDecl = 9, RULE_oper = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "stmt", "write", "read", "processOp", "createCh", "ifCond", "processInvoc", 
			"parameters", "processDecl", "oper"
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

	String s = "";
	public PicalculusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PicalculusParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Cap) | (1L << Can) | (1L << Iff) | (1L << Tao) | (1L << Spam) | (1L << Par) | (1L << ParA))) != 0)) {
				{
				{
				setState(22);
				stmt();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
		public ProcessOpContext processOp() {
			return getRuleContext(ProcessOpContext.class,0);
		}
		public ProcessInvocContext processInvoc() {
			return getRuleContext(ProcessInvocContext.class,0);
		}
		public ProcessDeclContext processDecl() {
			return getRuleContext(ProcessDeclContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				processOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				processInvoc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				processDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Can);
			setState(37);
			match(Hat);
			setState(38);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(Can);
			setState(41);
			match(Par);
			setState(42);
			match(Var);
			setState(43);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterProcessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitProcessOp(this);
		}
	}

	public final ProcessOpContext processOp() throws RecognitionException {
		ProcessOpContext _localctx = new ProcessOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_processOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(Cap);
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==Con || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			match(Cap);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterCreateCh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitCreateCh(this);
		}
	}

	public final CreateChContext createCh() throws RecognitionException {
		CreateChContext _localctx = new CreateChContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createCh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Par);
			setState(50);
			match(Crech);
			setState(51);
			match(Can);
			setState(52);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterIfCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitIfCond(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Iff);
			setState(55);
			match(Var);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==Eq || _la==Neq) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			match(Var);
			setState(58);
			match(Then);
			setState(59);
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

	public static class ProcessInvocContext extends ParserRuleContext {
		public TerminalNode Cap() { return getToken(PicalculusParser.Cap, 0); }
		public List<TerminalNode> Par() { return getTokens(PicalculusParser.Par); }
		public TerminalNode Par(int i) {
			return getToken(PicalculusParser.Par, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ProcessInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processInvoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterProcessInvoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitProcessInvoc(this);
		}
	}

	public final ProcessInvocContext processInvoc() throws RecognitionException {
		ProcessInvocContext _localctx = new ProcessInvocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_processInvoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Cap);
			setState(62);
			match(Par);
			setState(63);
			parameters();
			setState(64);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> Can() { return getTokens(PicalculusParser.Can); }
		public TerminalNode Can(int i) {
			return getToken(PicalculusParser.Can, i);
		}
		public List<TerminalNode> Colon() { return getTokens(PicalculusParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PicalculusParser.Colon, i);
		}
		public List<TerminalNode> Var() { return getTokens(PicalculusParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PicalculusParser.Var, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Can || _la==Var) {
				{
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(66);
					match(Can);
					setState(67);
					match(Colon);
					}
					break;
				case 2:
					{
					setState(68);
					match(Var);
					setState(69);
					match(Colon);
					}
					break;
				case 3:
					{
					setState(70);
					match(Can);
					}
					break;
				case 4:
					{
					setState(71);
					match(Var);
					}
					break;
				}
				}
				setState(76);
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

	public static class ProcessDeclContext extends ParserRuleContext {
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
		public ProcessDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterProcessDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitProcessDecl(this);
		}
	}

	public final ProcessDeclContext processDecl() throws RecognitionException {
		ProcessDeclContext _localctx = new ProcessDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_processDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Cap);
			setState(78);
			match(Par);
			setState(79);
			parameters();
			setState(80);
			match(Par);
			setState(81);
			match(Pd);
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PicalculusListener ) ((PicalculusListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		return oper(0);
	}

	private OperContext oper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperContext _localctx = new OperContext(_ctx, _parentState);
		OperContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_oper, _p);
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
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(85);
					write();
					}
					break;
				case 2:
					{
					setState(86);
					read();
					}
					break;
				case 3:
					{
					setState(87);
					createCh();
					}
					break;
				case 4:
					{
					setState(88);
					ifCond();
					}
					break;
				}
				}
				break;
			case ParA:
				{
				setState(91);
				match(ParA);
				setState(92);
				oper(0);
				setState(93);
				match(ParA);
				}
				break;
			case Spam:
				{
				setState(95);
				match(Spam);
				setState(96);
				oper(3);
				}
				break;
			case Cap:
				{
				setState(97);
				match(Cap);
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
			setState(106);
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
					setState(101);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(102);
					match(Dot);
					setState(103);
					oper(6);
					}
					} 
				}
				setState(108);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\\\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\ff\n\f\3"+
		"\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\4\3\2\17\20\3\2\t\n\2t\2\33\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b*\3\2"+
		"\2\2\n/\3\2\2\2\f\63\3\2\2\2\168\3\2\2\2\20?\3\2\2\2\22L\3\2\2\2\24O\3"+
		"\2\2\2\26e\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2"+
		"\2\2 %\5\n\6\2!%\5\20\t\2\"%\5\24\13\2#%\5\26\f\2$ \3\2\2\2$!\3\2\2\2"+
		"$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\4\2\2\'(\7\f\2\2()\7\5\2\2)\7\3"+
		"\2\2\2*+\7\4\2\2+,\7\22\2\2,-\7\5\2\2-.\7\22\2\2.\t\3\2\2\2/\60\7\3\2"+
		"\2\60\61\t\2\2\2\61\62\7\3\2\2\62\13\3\2\2\2\63\64\7\22\2\2\64\65\7\21"+
		"\2\2\65\66\7\4\2\2\66\67\7\22\2\2\67\r\3\2\2\289\7\6\2\29:\7\5\2\2:;\t"+
		"\3\2\2;<\7\5\2\2<=\7\b\2\2=>\5\26\f\2>\17\3\2\2\2?@\7\3\2\2@A\7\22\2\2"+
		"AB\5\22\n\2BC\7\22\2\2C\21\3\2\2\2DE\7\4\2\2EK\7\24\2\2FG\7\5\2\2GK\7"+
		"\24\2\2HK\7\4\2\2IK\7\5\2\2JD\3\2\2\2JF\3\2\2\2JH\3\2\2\2JI\3\2\2\2KN"+
		"\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\23\3\2\2\2NL\3\2\2\2OP\7\3\2\2PQ\7\22\2"+
		"\2QR\5\22\n\2RS\7\22\2\2ST\7\13\2\2TU\5\26\f\2U\25\3\2\2\2V[\b\f\1\2W"+
		"\\\5\6\4\2X\\\5\b\5\2Y\\\5\f\7\2Z\\\5\16\b\2[W\3\2\2\2[X\3\2\2\2[Y\3\2"+
		"\2\2[Z\3\2\2\2\\f\3\2\2\2]^\7\23\2\2^_\5\26\f\2_`\7\23\2\2`f\3\2\2\2a"+
		"b\7\16\2\2bf\5\26\f\5cf\7\3\2\2df\7\r\2\2eV\3\2\2\2e]\3\2\2\2ea\3\2\2"+
		"\2ec\3\2\2\2ed\3\2\2\2fl\3\2\2\2gh\f\7\2\2hi\7\7\2\2ik\5\26\f\bjg\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\27\3\2\2\2nl\3\2\2\2\t\33$JL[el";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}