// Generated from HotakaLangParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HotakaLangParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REAL=1, ENTERO=2, BOOL=3, STRING=4, MUESTRA=5, LEE=6, SUMA=7, RESTA=8, 
		MULT=9, DIV=10, MOD=11, AND=12, OR=13, NOT=14, MAYOR=15, MENOR=16, MAIG=17, 
		MEIG=18, IG=19, NIG=20, IF=21, ELSE=22, SWITCH=23, WHILE=24, FOR=25, ASIGN=26, 
		LLI=27, LLD=28, PI=29, PD=30, PCI=31, PCD=32, COM=33, PIP=34, DP=35, BEGIN=36, 
		END=37, CASE=38, DEFAULT=39, SQRT=40, FIB=41, SEN=42, PRIM=43, POT=44, 
		COS=45, NUM=46, FLOAT=47, SINO=48, STR=49, ID=50, WS=51;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_inicio = 2, RULE_finale = 3, RULE_sentencia = 4, 
		RULE_declaracionvar = 5, RULE_variable = 6, RULE_asignvar = 7, RULE_tipos = 8, 
		RULE_operaciones = 9, RULE_operador = 10, RULE_whiles = 11, RULE_bloque = 12, 
		RULE_sumas = 13, RULE_muestra = 14, RULE_leer = 15, RULE_fors = 16, RULE_condicional = 17, 
		RULE_bloque_condicional = 18, RULE_bloque_condicional_else = 19, RULE_switchz = 20, 
		RULE_casos_switch = 21;
	public static final String[] ruleNames = {
		"s", "programa", "inicio", "finale", "sentencia", "declaracionvar", "variable", 
		"asignvar", "tipos", "operaciones", "operador", "whiles", "bloque", "sumas", 
		"muestra", "leer", "fors", "condicional", "bloque_condicional", "bloque_condicional_else", 
		"switchz", "casos_switch"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'tau'", "'katoa'", "'engari'", "'mekameka'", "'tauira'", "'panui'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'a'", "'ranei'", "'kore'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'!='", "'ae'", "'aee'", "'huringa'", "'ahakoa'", 
		"'mo'", "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "'\"'", "'|'", 
		"':'", "'home'", "'mutunga'", null, "'mate'", "'pakiaka'", "'fiboo'", 
		"'pokapu'", "'teina'", "'mana'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", 
		"MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", 
		"IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "ASIGN", "LLI", "LLD", 
		"PI", "PD", "PCI", "PCD", "COM", "PIP", "DP", "BEGIN", "END", "CASE", 
		"DEFAULT", "SQRT", "FIB", "SEN", "PRIM", "POT", "COS", "NUM", "FLOAT", 
		"SINO", "STR", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "HotakaLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HotakaLangParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HotakaLangParserParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			sentencia();
			setState(45);
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

	public static class ProgramaContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public FinaleContext finale() {
			return getRuleContext(FinaleContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			inicio();
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				sentencia();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << PI) | (1L << NUM) | (1L << ID))) != 0) );
			setState(53);
			finale();
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(HotakaLangParserParser.BEGIN, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BEGIN);
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

	public static class FinaleContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(HotakaLangParserParser.END, 0); }
		public FinaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finale; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitFinale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinaleContext finale() throws RecognitionException {
		FinaleContext _localctx = new FinaleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(END);
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

	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionvarContext declaracionvar() {
			return getRuleContext(DeclaracionvarContext.class,0);
		}
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public MuestraContext muestra() {
			return getRuleContext(MuestraContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ForsContext fors() {
			return getRuleContext(ForsContext.class,0);
		}
		public SwitchzContext switchz() {
			return getRuleContext(SwitchzContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaracionvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				asignvar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				muestra();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				operaciones(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				fors();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				switchz();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				whiles();
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

	public static class DeclaracionvarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(HotakaLangParserParser.ID, 0); }
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public DeclaracionvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitDeclaracionvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionvarContext declaracionvar() throws RecognitionException {
		DeclaracionvarContext _localctx = new DeclaracionvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionvar);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				variable();
				setState(71);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				variable();
				setState(74);
				asignvar();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(HotakaLangParserParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(HotakaLangParserParser.BOOL, 0); }
		public TerminalNode ENTERO() { return getToken(HotakaLangParserParser.ENTERO, 0); }
		public TerminalNode STRING() { return getToken(HotakaLangParserParser.STRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AsignvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HotakaLangParserParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(HotakaLangParserParser.ASIGN, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public AsignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitAsignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignvarContext asignvar() throws RecognitionException {
		AsignvarContext _localctx = new AsignvarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignvar);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				setState(81);
				match(ASIGN);
				setState(82);
				tipos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ID);
				setState(84);
				match(ASIGN);
				setState(85);
				operaciones(0);
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(HotakaLangParserParser.NUM, 0); }
		public TerminalNode SINO() { return getToken(HotakaLangParserParser.SINO, 0); }
		public TerminalNode STR() { return getToken(HotakaLangParserParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(HotakaLangParserParser.FLOAT, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << FLOAT) | (1L << SINO) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HotakaLangParserParser.ID, 0); }
		public TerminalNode NUM() { return getToken(HotakaLangParserParser.NUM, 0); }
		public TerminalNode PI() { return getToken(HotakaLangParserParser.PI, 0); }
		public List<OperacionesContext> operaciones() {
			return getRuleContexts(OperacionesContext.class);
		}
		public OperacionesContext operaciones(int i) {
			return getRuleContext(OperacionesContext.class,i);
		}
		public TerminalNode PD() { return getToken(HotakaLangParserParser.PD, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		return operaciones(0);
	}

	private OperacionesContext operaciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionesContext _localctx = new OperacionesContext(_ctx, _parentState);
		OperacionesContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_operaciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(91);
				match(ID);
				}
				break;
			case NUM:
				{
				setState(92);
				match(NUM);
				}
				break;
			case PI:
				{
				setState(93);
				match(PI);
				setState(94);
				operaciones(0);
				setState(95);
				match(PD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operaciones);
					setState(99);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(100);
					operador();
					setState(101);
					operaciones(5);
					}
					} 
				}
				setState(107);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(HotakaLangParserParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(HotakaLangParserParser.MENOR, 0); }
		public TerminalNode MAIG() { return getToken(HotakaLangParserParser.MAIG, 0); }
		public TerminalNode MEIG() { return getToken(HotakaLangParserParser.MEIG, 0); }
		public TerminalNode IG() { return getToken(HotakaLangParserParser.IG, 0); }
		public TerminalNode NIG() { return getToken(HotakaLangParserParser.NIG, 0); }
		public TerminalNode SUMA() { return getToken(HotakaLangParserParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(HotakaLangParserParser.RESTA, 0); }
		public TerminalNode DIV() { return getToken(HotakaLangParserParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(HotakaLangParserParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(HotakaLangParserParser.MOD, 0); }
		public TerminalNode AND() { return getToken(HotakaLangParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(HotakaLangParserParser.OR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << AND) | (1L << OR) | (1L << MAYOR) | (1L << MENOR) | (1L << MAIG) | (1L << MEIG) | (1L << IG) | (1L << NIG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HotakaLangParserParser.WHILE, 0); }
		public TerminalNode PI() { return getToken(HotakaLangParserParser.PI, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PD() { return getToken(HotakaLangParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(HotakaLangParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(HotakaLangParserParser.LLD, 0); }
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitWhiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(WHILE);
			setState(111);
			match(PI);
			setState(112);
			operaciones(0);
			setState(113);
			match(PD);
			setState(114);
			match(LLI);
			setState(115);
			bloque();
			setState(116);
			match(LLD);
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

	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << PI) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				sentencia();
				}
				}
				setState(123);
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

	public static class SumasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HotakaLangParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HotakaLangParserParser.ID, i);
		}
		public TerminalNode SUMA() { return getToken(HotakaLangParserParser.SUMA, 0); }
		public List<TerminalNode> NUM() { return getTokens(HotakaLangParserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(HotakaLangParserParser.NUM, i);
		}
		public SumasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitSumas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumasContext sumas() throws RecognitionException {
		SumasContext _localctx = new SumasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sumas);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				setState(125);
				match(SUMA);
				setState(126);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				setState(128);
				match(SUMA);
				setState(129);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(NUM);
				setState(131);
				match(SUMA);
				setState(132);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(NUM);
				setState(134);
				match(SUMA);
				setState(135);
				match(NUM);
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

	public static class MuestraContext extends ParserRuleContext {
		public TerminalNode MUESTRA() { return getToken(HotakaLangParserParser.MUESTRA, 0); }
		public TerminalNode STR() { return getToken(HotakaLangParserParser.STR,0); }
		
		public List<TerminalNode> ID() { return getTokens(HotakaLangParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HotakaLangParserParser.ID, i);
		}
		public MuestraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muestra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitMuestra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuestraContext muestra() throws RecognitionException {
		MuestraContext _localctx = new MuestraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_muestra);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(MUESTRA);
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					_la = _input.LA(1);
					if ( !(_la==STR || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HotakaLangParserParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(HotakaLangParserParser.ASIGN, 0); }
		public TerminalNode LEE() { return getToken(HotakaLangParserParser.LEE, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(ASIGN);
			setState(146);
			match(LEE);
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

	public static class ForsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HotakaLangParserParser.FOR, 0); }
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public TerminalNode PIP() { return getToken(HotakaLangParserParser.PIP, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode LLI() { return getToken(HotakaLangParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(HotakaLangParserParser.LLD, 0); }
		public ForsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fors; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitFors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForsContext fors() throws RecognitionException {
		ForsContext _localctx = new ForsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOR);
			setState(149);
			asignvar();
			setState(150);
			match(PIP);
			setState(151);
			operaciones(0);
			setState(152);
			match(LLI);
			setState(153);
			bloque();
			setState(154);
			match(LLD);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HotakaLangParserParser.IF, 0); }
		public Bloque_condicionalContext bloque_condicional() {
			return getRuleContext(Bloque_condicionalContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(HotakaLangParserParser.ELSE, 0); }
		public Bloque_condicional_elseContext bloque_condicional_else() {
			return getRuleContext(Bloque_condicional_elseContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IF);
			setState(157);
			bloque_condicional();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(158);
				match(ELSE);
				setState(159);
				bloque_condicional_else();
				}
				break;
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(HotakaLangParserParser.PI, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PD() { return getToken(HotakaLangParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(HotakaLangParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(HotakaLangParserParser.LLD, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloque_condicional);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(PI);
				setState(163);
				operaciones(0);
				setState(164);
				match(PD);
				setState(165);
				match(LLI);
				setState(166);
				bloque();
				setState(167);
				match(LLD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(PI);
				setState(170);
				operaciones(0);
				setState(171);
				match(PD);
				setState(172);
				sentencia();
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

	public static class Bloque_condicional_elseContext extends ParserRuleContext {
		public TerminalNode LLI() { return getToken(HotakaLangParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(HotakaLangParserParser.LLD, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_condicional_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitBloque_condicional_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicional_elseContext bloque_condicional_else() throws RecognitionException {
		Bloque_condicional_elseContext _localctx = new Bloque_condicional_elseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloque_condicional_else);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLI:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(LLI);
				setState(177);
				bloque();
				setState(178);
				match(LLD);
				}
				break;
			case REAL:
			case ENTERO:
			case BOOL:
			case STRING:
			case MUESTRA:
			case IF:
			case SWITCH:
			case WHILE:
			case FOR:
			case PI:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				sentencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SwitchzContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(HotakaLangParserParser.SWITCH, 0); }
		public TerminalNode PI() { return getToken(HotakaLangParserParser.PI, 0); }
		public TerminalNode ID() { return getToken(HotakaLangParserParser.ID, 0); }
		public TerminalNode PD() { return getToken(HotakaLangParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(HotakaLangParserParser.LLI, 0); }
		public TerminalNode LLD() { return getToken(HotakaLangParserParser.LLD, 0); }
		public List<Casos_switchContext> casos_switch() {
			return getRuleContexts(Casos_switchContext.class);
		}
		public Casos_switchContext casos_switch(int i) {
			return getRuleContext(Casos_switchContext.class,i);
		}
		public SwitchzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitSwitchz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchzContext switchz() throws RecognitionException {
		SwitchzContext _localctx = new SwitchzContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SWITCH);
			setState(184);
			match(PI);
			setState(185);
			match(ID);
			setState(186);
			match(PD);
			setState(187);
			match(LLI);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				casos_switch();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(193);
			match(LLD);
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

	public static class Casos_switchContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(HotakaLangParserParser.CASE, 0); }
		public TerminalNode NUM() { return getToken(HotakaLangParserParser.NUM, 0); }
		public TerminalNode DP() { return getToken(HotakaLangParserParser.DP, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(HotakaLangParserParser.DEFAULT, 0); }
		public Casos_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos_switch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotakaLangParserVisitor ) return ((HotakaLangParserVisitor<? extends T>)visitor).visitCasos_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Casos_switchContext casos_switch() throws RecognitionException {
		Casos_switchContext _localctx = new Casos_switchContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_casos_switch);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(CASE);
				setState(196);
				match(NUM);
				setState(197);
				match(DP);
				setState(198);
				sentencia();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(DEFAULT);
				setState(200);
				match(DP);
				setState(201);
				sentencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return operaciones_sempred((OperacionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operaciones_sempred(OperacionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u00cf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\6\3\64\n\3\r\3\16\3\65\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13d\n\13\3\13\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\7\16z\n\16\f\16\16\16}\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17"+
		"\3\20\3\20\6\20\u008f\n\20\r\20\16\20\u0090\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00a3\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b1"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00b8\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\6\26\u00c0\n\26\r\26\16\26\u00c1\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u00cd\n\27\3\27\2\3\24\30\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,\2\6\3\2\3\6\3\2\60\63\4\2\t\17\21\26\3\2\63\64\u00d0"+
		"\2.\3\2\2\2\4\61\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\nF\3\2\2\2\fN\3\2\2\2\16"+
		"P\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24c\3\2\2\2\26n\3\2\2\2\30p\3\2\2\2"+
		"\32{\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u0092\3\2\2\2\"\u0096"+
		"\3\2\2\2$\u009e\3\2\2\2&\u00b0\3\2\2\2(\u00b7\3\2\2\2*\u00b9\3\2\2\2,"+
		"\u00cc\3\2\2\2./\5\n\6\2/\60\7\2\2\3\60\3\3\2\2\2\61\63\5\6\4\2\62\64"+
		"\5\n\6\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\3\2\2\2\678\5\b\5\28\5\3\2\2\29:\7&\2\2:\7\3\2\2\2;<\7\'\2\2<\t\3\2\2"+
		"\2=G\5\f\7\2>G\5\20\t\2?G\5\36\20\2@G\5 \21\2AG\5$\23\2BG\5\24\13\2CG"+
		"\5\"\22\2DG\5*\26\2EG\5\30\r\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2F@\3\2\2\2"+
		"FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\5\16"+
		"\b\2IJ\7\64\2\2JO\3\2\2\2KL\5\16\b\2LM\5\20\t\2MO\3\2\2\2NH\3\2\2\2NK"+
		"\3\2\2\2O\r\3\2\2\2PQ\t\2\2\2Q\17\3\2\2\2RS\7\64\2\2ST\7\34\2\2TY\5\22"+
		"\n\2UV\7\64\2\2VW\7\34\2\2WY\5\24\13\2XR\3\2\2\2XU\3\2\2\2Y\21\3\2\2\2"+
		"Z[\t\3\2\2[\23\3\2\2\2\\]\b\13\1\2]d\7\64\2\2^d\7\60\2\2_`\7\37\2\2`a"+
		"\5\24\13\2ab\7 \2\2bd\3\2\2\2c\\\3\2\2\2c^\3\2\2\2c_\3\2\2\2dk\3\2\2\2"+
		"ef\f\6\2\2fg\5\26\f\2gh\5\24\13\7hj\3\2\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2l\25\3\2\2\2mk\3\2\2\2no\t\4\2\2o\27\3\2\2\2pq\7\32\2\2"+
		"qr\7\37\2\2rs\5\24\13\2st\7 \2\2tu\7\35\2\2uv\5\32\16\2vw\7\36\2\2w\31"+
		"\3\2\2\2xz\5\n\6\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\33\3\2\2\2"+
		"}{\3\2\2\2~\177\7\64\2\2\177\u0080\7\t\2\2\u0080\u008b\7\64\2\2\u0081"+
		"\u0082\7\64\2\2\u0082\u0083\7\t\2\2\u0083\u008b\7\60\2\2\u0084\u0085\7"+
		"\60\2\2\u0085\u0086\7\t\2\2\u0086\u008b\7\64\2\2\u0087\u0088\7\60\2\2"+
		"\u0088\u0089\7\t\2\2\u0089\u008b\7\60\2\2\u008a~\3\2\2\2\u008a\u0081\3"+
		"\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\35\3\2\2\2\u008c"+
		"\u008e\7\7\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093"+
		"\7\64\2\2\u0093\u0094\7\34\2\2\u0094\u0095\7\b\2\2\u0095!\3\2\2\2\u0096"+
		"\u0097\7\33\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7$\2\2\u0099\u009a\5"+
		"\24\13\2\u009a\u009b\7\35\2\2\u009b\u009c\5\32\16\2\u009c\u009d\7\36\2"+
		"\2\u009d#\3\2\2\2\u009e\u009f\7\27\2\2\u009f\u00a2\5&\24\2\u00a0\u00a1"+
		"\7\30\2\2\u00a1\u00a3\5(\25\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3%\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7"+
		"\7 \2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7\36\2"+
		"\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00ae\7 \2\2\u00ae\u00af\5\n\6\2\u00af\u00b1\3\2\2\2\u00b0\u00a4\3\2"+
		"\2\2\u00b0\u00ab\3\2\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4"+
		"\5\32\16\2\u00b4\u00b5\7\36\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5\n\6"+
		"\2\u00b7\u00b2\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00ba"+
		"\7\31\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00bd\7 \2\2"+
		"\u00bd\u00bf\7\35\2\2\u00be\u00c0\5,\27\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\36\2\2\u00c4+\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6\u00c7\7\60\2\2"+
		"\u00c7\u00c8\7%\2\2\u00c8\u00cd\5\n\6\2\u00c9\u00ca\7)\2\2\u00ca\u00cb"+
		"\7%\2\2\u00cb\u00cd\5\n\6\2\u00cc\u00c5\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"-\3\2\2\2\20\65FNXck{\u008a\u0090\u00a2\u00b0\u00b7\u00c1\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}