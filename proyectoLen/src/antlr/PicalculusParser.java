// Generated from /home/josteda99/Documents/CompetiveCode/Lenguajes/ProyectoLen/proyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2

package proyectoLen.src.antlr;

import java.util.HashMap;
import java.util.Objects;
import proyectoLen.src.entity.Channel;
import proyectoLen.src.entity.Process;

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
		T__0=1, T__1=2, T__2=3, T__3=4, Cap=5, Can=6, Var=7, Iff=8, Dot=9, Then=10, 
		Eq=11, Neq=12, Pd=13, Hat=14, Tao=15, Spam=16, Con=17, Plus=18, Crech=19, 
		Par=20, ParA=21, Colon=22, Ws=23, Bcom=24, Com=25, Empty=26, DoDot=27, 
		Type=28, Arrow=29, Int=30, String=31, SpamSetting=32;
	public static final int
		RULE_prog = 0, RULE_settings = 1, RULE_stmt = 2, RULE_write = 3, RULE_read = 4, 
		RULE_createCh = 5, RULE_globalChan = 6, RULE_ifCond = 7, RULE_parameters = 8, 
		RULE_process = 9, RULE_run = 10, RULE_variables = 11, RULE_oper = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "settings", "stmt", "write", "read", "createCh", "globalChan", 
			"ifCond", "parameters", "process", "run", "variables", "oper"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'state'", "'new'", "'run'", "'print'", null, null, null, "'if'", 
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

	@Override
	public String getGrammarFileName() { return "Picalculus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public static boolean SEMANTIC_ERROR = false;
	/**
	 * @varScope indicara si una variable o canal estan libre o no  por medio de una bitmask
	 * 1 -> libre
	 * 2 -> binded
	**/
	protected static int FREE = 1;
	protected static int BINDED = 2;
	protected HashMap<String, Integer> chanScope = new HashMap<String, Integer>();
	protected HashMap<String, Integer> varScope = new HashMap<String, Integer>();
	protected HashMap<String, Process> processScope  = new HashMap<String, Process>();
	private static String aux = "";

	public PicalculusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public boolean showState;
		public Token state;
		public SettingsContext settings() {
			return getRuleContext(SettingsContext.class,0);
		}
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

				System.out.printf("######    ####      ####     ##     ####       ####   ##   ##  ####     ##   ##   #####\n");
		      System.out.printf(" ##  ##    ##      ##  ##   ####     ##       ##  ##  ##   ##   ##      ##   ##  ##   ##\n");
		      System.out.printf(" ##  ##    ##     ##       ##  ##    ##      ##       ##   ##   ##      ##   ##  #\n");
		      System.out.printf(" #####     ##     ##       ##  ##    ##      ##       ##   ##   ##      ##   ##   #####\n");
		      System.out.printf(" ##        ##     ##       ######    ##   #  ##       ##   ##   ##   #  ##   ##       ##\n");
		      System.out.printf(" ##        ##      ##  ##  ##  ##    ##  ##   ##  ##  ##   ##   ##  ##  ##   ##  ##   ##\n");
		      System.out.printf("####      ####      ####   ##  ##   #######    ####    #####   #######   #####    #####\n\n");
		      System.out.printf("-----------------------Developed by Julio Quintero and Johan Daza-----------------------\n");
		      System.out.printf("---------------------------------------Version 1.0--------------------------------------\n");
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SpamSetting) {
				{
				setState(26);
				settings();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Cap) | (1L << Can) | (1L << Iff) | (1L << Tao) | (1L << Spam) | (1L << Par) | (1L << ParA))) != 0)) {
				{
				{
				setState(29);
				stmt();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(35);
				((ProgContext)_localctx).state = match(T__0);
				}
			}


					((ProgContext)_localctx).showState =  ((ProgContext)_localctx).state != null;
				
			}
			_ctx.stop = _input.LT(-1);

					//Process.globalChannel.get("y").getPath().forEach(s -> System.out.println(s));
					if(_localctx.showState) Process.state();
			      
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

	public static class SettingsContext extends ParserRuleContext {
		public Token Int;
		public TerminalNode SpamSetting() { return getToken(PicalculusParser.SpamSetting, 0); }
		public TerminalNode Int() { return getToken(PicalculusParser.Int, 0); }
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SpamSetting);
			setState(41);
			((SettingsContext)_localctx).Int = match(Int);

					Process.spam = (((SettingsContext)_localctx).Int!=null?Integer.valueOf(((SettingsContext)_localctx).Int.getText()):0);
				
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
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public GlobalChanContext globalChan() {
			return getRuleContext(GlobalChanContext.class,0);
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
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				process();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				run();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				globalChan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				oper(0);
				setState(48);
				match(Dot);
				setState(49);
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
		enterRule(_localctx, 6, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((WriteContext)_localctx).Can = match(Can);
			setState(54);
			match(Hat);
			setState(55);
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
		enterRule(_localctx, 8, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((ReadContext)_localctx).Can = match(Can);
			setState(59);
			match(Par);
			setState(60);
			((ReadContext)_localctx).Var = match(Var);
			setState(61);
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
		public TerminalNode Arrow() { return getToken(PicalculusParser.Arrow, 0); }
		public TerminalNode Type() { return getToken(PicalculusParser.Type, 0); }
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
			setState(64);
			match(Par);
			setState(65);
			match(Crech);
			setState(66);
			((CreateChContext)_localctx).Can = match(Can);
			setState(67);
			match(Arrow);
			setState(68);
			match(Type);
			setState(69);
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

	public static class GlobalChanContext extends ParserRuleContext {
		public Token Can;
		public Token Type;
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public TerminalNode DoDot() { return getToken(PicalculusParser.DoDot, 0); }
		public TerminalNode Type() { return getToken(PicalculusParser.Type, 0); }
		public GlobalChanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalChan; }
	}

	public final GlobalChanContext globalChan() throws RecognitionException {
		GlobalChanContext _localctx = new GlobalChanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_globalChan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__1);
			setState(73);
			((GlobalChanContext)_localctx).Can = match(Can);
			setState(74);
			match(DoDot);
			setState(75);
			((GlobalChanContext)_localctx).Type = match(Type);

					/* Agregar a los canales globales */
					Process.globalChannel.putIfAbsent((((GlobalChanContext)_localctx).Can!=null?((GlobalChanContext)_localctx).Can.getText():null),new Channel((((GlobalChanContext)_localctx).Type!=null?((GlobalChanContext)_localctx).Type.getText():null).replace("~",""), (((GlobalChanContext)_localctx).Can!=null?((GlobalChanContext)_localctx).Can.getText():null)));
				
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
		enterRule(_localctx, 14, RULE_ifCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Iff);
			setState(79);
			((IfCondContext)_localctx).left = match(Var);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==Eq || _la==Neq) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			((IfCondContext)_localctx).right = match(Var);
			setState(82);
			match(Then);
			setState(83);
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
		public Token Var;
		public Token Type;
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public TerminalNode Var() { return getToken(PicalculusParser.Var, 0); }
		public TerminalNode Arrow() { return getToken(PicalculusParser.Arrow, 0); }
		public TerminalNode Type() { return getToken(PicalculusParser.Type, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PicalculusParser.Colon, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		return parameters(0);
	}

	private ParametersContext parameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametersContext _localctx = new ParametersContext(_ctx, _parentState);
		ParametersContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
				{
				setState(87);
				((ParametersContext)_localctx).Can = match(Can);
				chanScope.putIfAbsent((((ParametersContext)_localctx).Can!=null?((ParametersContext)_localctx).Can.getText():null), FREE); aux += (((ParametersContext)_localctx).Can!=null?((ParametersContext)_localctx).Can.getText():null) + ":";
				}
				break;
			case Var:
				{
				setState(89);
				((ParametersContext)_localctx).Var = match(Var);
				setState(90);
				match(Arrow);
				setState(91);
				((ParametersContext)_localctx).Type = match(Type);
				varScope.putIfAbsent((((ParametersContext)_localctx).Var!=null?((ParametersContext)_localctx).Var.getText():null), FREE); aux += (((ParametersContext)_localctx).Var!=null?((ParametersContext)_localctx).Var.getText():null) + (((ParametersContext)_localctx).Type!=null?((ParametersContext)_localctx).Type.getText():null) + ":";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameters);
					setState(95);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(96);
					match(Colon);
					setState(97);
					parameters(4);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ProcessContext extends ParserRuleContext {
		public String name;
		public String sec;
		public Token Cap;
		public OperContext oper;
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
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((ProcessContext)_localctx).Cap = match(Cap);
			setState(104);
			match(ParA);
			setState(105);
			parameters(0);
			setState(106);
			match(ParA);
			setState(107);
			match(Pd);
			setState(108);
			((ProcessContext)_localctx).oper = oper(0);

					if(!processScope.containsKey((((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null))) {
						((ProcessContext)_localctx).name =  (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null);
					} else {
						System.out.printf("Error in Line %d:%d -> Process %s already declared\n", (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getLine():0), (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getCharPositionInLine():0), (((ProcessContext)_localctx).Cap!=null?((ProcessContext)_localctx).Cap.getText():null));
						SEMANTIC_ERROR = true;
						throw new RuntimeException();
					}
					((ProcessContext)_localctx).sec =  (((ProcessContext)_localctx).oper!=null?_input.getText(((ProcessContext)_localctx).oper.start,((ProcessContext)_localctx).oper.stop):null);
				
			}
			_ctx.stop = _input.LT(-1);
			chanScope.clear();
						varScope.clear();
						processScope.putIfAbsent(_localctx.name, new Process(_localctx.sec ,aux.substring(0, aux.length() - 1)));
						aux = "";
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

	public static class RunContext extends ParserRuleContext {
		public Process pro;
		public Token c;
		public boolean toPrint;
		public Token Cap;
		public Token print;
		public TerminalNode Cap() { return getToken(PicalculusParser.Cap, 0); }
		public List<TerminalNode> ParA() { return getTokens(PicalculusParser.ParA); }
		public TerminalNode ParA(int i) {
			return getToken(PicalculusParser.ParA, i);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__2);
			setState(112);
			((RunContext)_localctx).Cap = match(Cap);
			setState(113);
			match(ParA);
			setState(114);
			variables(0);
			setState(115);
			match(ParA);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(116);
				((RunContext)_localctx).print = match(T__3);
				}
			}

				
			      if(!processScope.containsKey((((RunContext)_localctx).Cap!=null?((RunContext)_localctx).Cap.getText():null))) {
			         System.out.printf("Error in Line %d:%d -> Process %s no declared\n", (((RunContext)_localctx).Cap!=null?((RunContext)_localctx).Cap.getLine():0), (((RunContext)_localctx).Cap!=null?((RunContext)_localctx).Cap.getCharPositionInLine():0), (((RunContext)_localctx).Cap!=null?((RunContext)_localctx).Cap.getText():null));
			         SEMANTIC_ERROR = true;
			         throw new RuntimeException();
			      }
				  ((RunContext)_localctx).pro =  processScope.get((((RunContext)_localctx).Cap!=null?((RunContext)_localctx).Cap.getText():null));
				  ((RunContext)_localctx).c =  ((RunContext)_localctx).Cap;
				  ((RunContext)_localctx).toPrint =  ((RunContext)_localctx).print != null;
				
			}
			_ctx.stop = _input.LT(-1);

					if(!_localctx.pro.sameParameters(aux)) {
						System.out.printf("Error in Line %d:%d -> Parameters don't match\n", _localctx.c.getLine(), _localctx.c.getCharPositionInLine());
						SEMANTIC_ERROR = true;
						throw new RuntimeException();
					}
					System.out.printf("Running Process %s ...\n", _localctx.c.getText());
					_localctx.pro.run(aux, _localctx.toPrint);
					aux = "";
					
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

	public static class VariablesContext extends ParserRuleContext {
		public Token Can;
		public Token Int;
		public Token String;
		public TerminalNode Can() { return getToken(PicalculusParser.Can, 0); }
		public TerminalNode Int() { return getToken(PicalculusParser.Int, 0); }
		public TerminalNode String() { return getToken(PicalculusParser.String, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PicalculusParser.Colon, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		return variables(0);
	}

	private VariablesContext variables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariablesContext _localctx = new VariablesContext(_ctx, _parentState);
		VariablesContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
				{
				setState(122);
				((VariablesContext)_localctx).Can = match(Can);

					   if(!Process.globalChannel.containsKey((((VariablesContext)_localctx).Can!=null?((VariablesContext)_localctx).Can.getText():null))){
						   System.out.printf("Error in Line %d:%d -> Channel %s is not declared\n", (((VariablesContext)_localctx).Can!=null?((VariablesContext)_localctx).Can.getLine():0), (((VariablesContext)_localctx).Can!=null?((VariablesContext)_localctx).Can.getCharPositionInLine():0), (((VariablesContext)_localctx).Can!=null?((VariablesContext)_localctx).Can.getText():null));
						   SEMANTIC_ERROR = true;
						   throw new RuntimeException();
					    } else{
							aux += (((VariablesContext)_localctx).Can!=null?((VariablesContext)_localctx).Can.getText():null) + "+:";
				      }
				}
				break;
			case Int:
				{
				setState(124);
				((VariablesContext)_localctx).Int = match(Int);
				aux += (((VariablesContext)_localctx).Int!=null?Integer.valueOf(((VariablesContext)_localctx).Int.getText()):0) + ":";
				}
				break;
			case String:
				{
				setState(126);
				((VariablesContext)_localctx).String = match(String);
				aux += (((VariablesContext)_localctx).String!=null?((VariablesContext)_localctx).String.getText():null).substring(1, (((VariablesContext)_localctx).String!=null?((VariablesContext)_localctx).String.getText():null).length()-1) + ":";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(130);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(131);
					match(Colon);
					setState(132);
					variables(5);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_oper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Can:
			case Iff:
			case Par:
				{
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(139);
					write();
					}
					break;
				case 2:
					{
					setState(140);
					read();
					}
					break;
				case 3:
					{
					setState(141);
					createCh();
					}
					break;
				case 4:
					{
					setState(142);
					ifCond();
					}
					break;
				}
				}
				break;
			case ParA:
				{
				setState(145);
				match(ParA);
				setState(146);
				oper(0);
				setState(147);
				match(ParA);
				}
				break;
			case Spam:
				{
				setState(149);
				match(Spam);
				setState(150);
				oper(3);
				}
				break;
			case Cap:
				{
				setState(151);
				((OperContext)_localctx).Cap = match(Cap);

						if(!processScope.containsKey((((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getText():null))) {
							System.out.printf("Error line %d:%d -> Process %s not declared yet\n", (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getLine():0), (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getCharPositionInLine():0), (((OperContext)_localctx).Cap!=null?((OperContext)_localctx).Cap.getText():null));
							SEMANTIC_ERROR = true;
							throw new RuntimeException();
						}
				}
				break;
			case Tao:
				{
				setState(153);
				match(Tao);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						match(Dot);
						setState(158);
						oper(7);
						}
						break;
					case 2:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(Con);
						setState(161);
						oper(6);
						}
						break;
					case 3:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(Plus);
						setState(164);
						oper(5);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			return parameters_sempred((ParametersContext)_localctx, predIndex);
		case 11:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		case 12:
			return oper_sempred((OperContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean parameters_sempred(ParametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean variables_sempred(VariablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean oper_sempred(OperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\5\2\'\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\n\3\n\3\n\7\ne\n\n\f\n\16\n"+
		"h\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fx\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\r\3\r\3"+
		"\r\7\r\u0088\n\r\f\r\16\r\u008b\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u0092"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab"+
		"\13\16\3\16\2\5\22\30\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\r"+
		"\16\2\u00b5\2\35\3\2\2\2\4*\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n<\3\2\2"+
		"\2\fB\3\2\2\2\16J\3\2\2\2\20P\3\2\2\2\22_\3\2\2\2\24i\3\2\2\2\26q\3\2"+
		"\2\2\30\u0082\3\2\2\2\32\u009c\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35"+
		"\36\3\2\2\2\36\"\3\2\2\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2"+
		"\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\'\7\3\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3"+
		"\2\2\2()\b\2\1\2)\3\3\2\2\2*+\7\"\2\2+,\7 \2\2,-\b\3\1\2-\5\3\2\2\2.\66"+
		"\5\24\13\2/\66\5\26\f\2\60\66\5\16\b\2\61\62\5\32\16\2\62\63\7\13\2\2"+
		"\63\64\7\34\2\2\64\66\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65"+
		"\61\3\2\2\2\66\7\3\2\2\2\678\7\b\2\289\7\20\2\29:\7\t\2\2:;\b\5\1\2;\t"+
		"\3\2\2\2<=\7\b\2\2=>\7\26\2\2>?\7\t\2\2?@\7\26\2\2@A\b\6\1\2A\13\3\2\2"+
		"\2BC\7\26\2\2CD\7\25\2\2DE\7\b\2\2EF\7\37\2\2FG\7\36\2\2GH\7\26\2\2HI"+
		"\b\7\1\2I\r\3\2\2\2JK\7\4\2\2KL\7\b\2\2LM\7\35\2\2MN\7\36\2\2NO\b\b\1"+
		"\2O\17\3\2\2\2PQ\7\n\2\2QR\7\t\2\2RS\t\2\2\2ST\7\t\2\2TU\7\f\2\2UV\5\32"+
		"\16\2VW\b\t\1\2W\21\3\2\2\2XY\b\n\1\2YZ\7\b\2\2Z`\b\n\1\2[\\\7\t\2\2\\"+
		"]\7\37\2\2]^\7\36\2\2^`\b\n\1\2_X\3\2\2\2_[\3\2\2\2`f\3\2\2\2ab\f\5\2"+
		"\2bc\7\30\2\2ce\5\22\n\6da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\23\3"+
		"\2\2\2hf\3\2\2\2ij\7\7\2\2jk\7\27\2\2kl\5\22\n\2lm\7\27\2\2mn\7\17\2\2"+
		"no\5\32\16\2op\b\13\1\2p\25\3\2\2\2qr\7\5\2\2rs\7\7\2\2st\7\27\2\2tu\5"+
		"\30\r\2uw\7\27\2\2vx\7\6\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\f\1\2z"+
		"\27\3\2\2\2{|\b\r\1\2|}\7\b\2\2}\u0083\b\r\1\2~\177\7 \2\2\177\u0083\b"+
		"\r\1\2\u0080\u0081\7!\2\2\u0081\u0083\b\r\1\2\u0082{\3\2\2\2\u0082~\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0083\u0089\3\2\2\2\u0084\u0085\f\6\2\2\u0085"+
		"\u0086\7\30\2\2\u0086\u0088\5\30\r\7\u0087\u0084\3\2\2\2\u0088\u008b\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0091\b\16\1\2\u008d\u0092\5\b\5\2\u008e\u0092\5"+
		"\n\6\2\u008f\u0092\5\f\7\2\u0090\u0092\5\20\t\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u009d\3\2"+
		"\2\2\u0093\u0094\7\27\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\27\2\2\u0096"+
		"\u009d\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u009d\5\32\16\5\u0099\u009a"+
		"\7\7\2\2\u009a\u009d\b\16\1\2\u009b\u009d\7\21\2\2\u009c\u008c\3\2\2\2"+
		"\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a9\3\2\2\2\u009e\u009f\f\b\2\2\u009f\u00a0\7\13\2\2"+
		"\u00a0\u00a8\5\32\16\t\u00a1\u00a2\f\7\2\2\u00a2\u00a3\7\23\2\2\u00a3"+
		"\u00a8\5\32\16\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a8"+
		"\5\32\16\7\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2"+
		"\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\33"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\17\35\"&\65_fw\u0082\u0089\u0091\u009c\u00a7"+
		"\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}