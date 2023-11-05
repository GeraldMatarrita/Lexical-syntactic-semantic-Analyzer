// Generated from .//miLenguaje.g4 by ANTLR 4.13.1

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, NUMBER=19, WS=20;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_declaraciones = 2, RULE_declaracion = 3, 
		RULE_declaracionVariable = 4, RULE_tipo = 5, RULE_declaracionFuncion = 6, 
		RULE_parametros = 7, RULE_parametro = 8, RULE_sentencias = 9, RULE_sentencia = 10, 
		RULE_asignacion = 11, RULE_ifDeclaracion = 12, RULE_whileDeclaracion = 13, 
		RULE_volverDeclaracion = 14, RULE_declaracionExpresion = 15, RULE_expresion = 16, 
		RULE_factor = 17, RULE_termino = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "declaraciones", "declaracion", "declaracionVariable", 
			"tipo", "declaracionFuncion", "parametros", "parametro", "sentencias", 
			"sentencia", "asignacion", "ifDeclaracion", "whileDeclaracion", "volverDeclaracion", 
			"declaracionExpresion", "expresion", "factor", "termino"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'entero'", "'caracter'", "'('", "')'", "'{'", "'}'", "','", 
			"'='", "'Puede'", "'Entonces'", "'Ciclo'", "'retornar'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "miLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  Map<String, Object> symbolTable = new HashMap<String, Object>();

	public miLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			declaraciones();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitDeclaraciones(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				declaracionFuncion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				declaracionVariable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitDeclaracionVariable(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			tipo();
			setState(49);
			((DeclaracionVariableContext)_localctx).ID = match(ID);
			setState(50);
			match(T__0);
			 symbolTable.put((((DeclaracionVariableContext)_localctx).ID!=null?((DeclaracionVariableContext)_localctx).ID.getText():null), 0); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterDeclaracionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitDeclaracionFuncion(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((DeclaracionFuncionContext)_localctx).tipo = tipo();
			setState(56);
			((DeclaracionFuncionContext)_localctx).ID = match(ID);
			setState(57);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(58);
				parametros();
				}
			}

			setState(61);
			match(T__4);
			setState(62);
			match(T__5);
			setState(63);
			declaraciones();
			setState(64);
			sentencias(0);
			setState(65);
			match(T__6);
			 symbolTable.put((((DeclaracionFuncionContext)_localctx).ID!=null?((DeclaracionFuncionContext)_localctx).ID.getText():null), (((DeclaracionFuncionContext)_localctx).tipo!=null?_input.getText(((DeclaracionFuncionContext)_localctx).tipo.start,((DeclaracionFuncionContext)_localctx).tipo.stop):null)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			parametro();
			setState(69);
			match(T__7);
			setState(70);
			parametro();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			tipo();
			setState(73);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciasContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		return sentencias(0);
	}

	private SentenciasContext sentencias(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenciasContext _localctx = new SentenciasContext(_ctx, _parentState);
		SentenciasContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_sentencias, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			sentencia();
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenciasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentencias);
					setState(78);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(79);
					sentencia();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IfDeclaracionContext ifDeclaracion() {
			return getRuleContext(IfDeclaracionContext.class,0);
		}
		public WhileDeclaracionContext whileDeclaracion() {
			return getRuleContext(WhileDeclaracionContext.class,0);
		}
		public VolverDeclaracionContext volverDeclaracion() {
			return getRuleContext(VolverDeclaracionContext.class,0);
		}
		public DeclaracionExpresionContext declaracionExpresion() {
			return getRuleContext(DeclaracionExpresionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentencia);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				ifDeclaracion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				whileDeclaracion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				volverDeclaracion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				declaracionExpresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(94);
			match(T__8);
			setState(95);
			((AsignacionContext)_localctx).expresion = expresion();
			setState(96);
			match(T__0);
			 symbolTable.put((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expresion.value); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfDeclaracionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public IfDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterIfDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitIfDeclaracion(this);
		}
	}

	public final IfDeclaracionContext ifDeclaracion() throws RecognitionException {
		IfDeclaracionContext _localctx = new IfDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__9);
			setState(100);
			match(T__3);
			setState(101);
			expresion();
			setState(102);
			match(T__4);
			setState(103);
			match(T__5);
			setState(104);
			sentencias(0);
			setState(105);
			match(T__6);
			setState(106);
			match(T__10);
			setState(107);
			match(T__5);
			setState(108);
			sentencias(0);
			setState(109);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDeclaracionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public WhileDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterWhileDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitWhileDeclaracion(this);
		}
	}

	public final WhileDeclaracionContext whileDeclaracion() throws RecognitionException {
		WhileDeclaracionContext _localctx = new WhileDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__11);
			setState(112);
			match(T__3);
			setState(113);
			expresion();
			setState(114);
			match(T__4);
			setState(115);
			match(T__5);
			setState(116);
			sentencias(0);
			setState(117);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VolverDeclaracionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public VolverDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volverDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterVolverDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitVolverDeclaracion(this);
		}
	}

	public final VolverDeclaracionContext volverDeclaracion() throws RecognitionException {
		VolverDeclaracionContext _localctx = new VolverDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_volverDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__12);
			setState(120);
			expresion();
			setState(121);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionExpresionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterDeclaracionExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitDeclaracionExpresion(this);
		}
	}

	public final DeclaracionExpresionContext declaracionExpresion() throws RecognitionException {
		DeclaracionExpresionContext _localctx = new DeclaracionExpresionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracionExpresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expresion();
			setState(124);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((ExpresionContext)_localctx).t1 = factor();
				 ((ExpresionContext)_localctx).value =  (int)((ExpresionContext)_localctx).t1.value; 
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(128);
					match(T__13);
					setState(129);
					((ExpresionContext)_localctx).t2 = factor();
					 ((ExpresionContext)_localctx).value =  (int)_localctx.value + (int)((ExpresionContext)_localctx).t2.value ;
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((ExpresionContext)_localctx).t1 = factor();
				 ((ExpresionContext)_localctx).value =  (int)((ExpresionContext)_localctx).t1.value; 
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(139);
					match(T__14);
					setState(140);
					((ExpresionContext)_localctx).t2 = factor();
					 ((ExpresionContext)_localctx).value =  (int)_localctx.value - (int)((ExpresionContext)_localctx).t2.value ;
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public TerminoContext t1;
		public TerminoContext t2;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((FactorContext)_localctx).t1 = termino();
				 ((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value; 
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(152);
					match(T__15);
					setState(153);
					((FactorContext)_localctx).t2 = termino();
					 ((FactorContext)_localctx).value =  (int)_localctx.value * (int)((FactorContext)_localctx).t2.value ;
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((FactorContext)_localctx).t1 = termino();
				 ((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value; 
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(163);
					match(T__16);
					setState(164);
					((FactorContext)_localctx).t2 = termino();
					 ((FactorContext)_localctx).value =  (int)_localctx.value / (int)((FactorContext)_localctx).t2.value ;
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode NUMBER() { return getToken(miLenguajeParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miLenguajeListener ) ((miLenguajeListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termino);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((TerminoContext)_localctx).NUMBER = match(NUMBER);
				 ((TerminoContext)_localctx).value =  Integer.parseInt((((TerminoContext)_localctx).NUMBER!=null?((TerminoContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((TerminoContext)_localctx).ID = match(ID);
				 ((TerminoContext)_localctx).value =  symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null)); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__3);
				setState(179);
				((TerminoContext)_localctx).expresion = expresion();
				((TerminoContext)_localctx).value =  ((TerminoContext)_localctx).expresion.value;
				setState(181);
				match(T__4);
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
			return sentencias_sempred((SentenciasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentencias_sempred(SentenciasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006<\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tQ\b\t\n\t\f\t"+
		"T\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\\\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0085\b\u0010\n\u0010\f\u0010\u0088"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0090\b\u0010\n\u0010\f\u0010\u0093\t\u0010\u0003\u0010"+
		"\u0095\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u009d\b\u0011\n\u0011\f\u0011\u00a0\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00a8\b\u0011\n\u0011\f\u0011\u00ab\t\u0011\u0003\u0011\u00ad\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b8\b\u0012\u0001"+
		"\u0012\u0000\u0001\u0012\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0001\u0000"+
		"\u0002\u0003\u00b6\u0000&\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u0004*\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b"+
		"0\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000\u0000"+
		"\u0000\u000eD\u0001\u0000\u0000\u0000\u0010H\u0001\u0000\u0000\u0000\u0012"+
		"K\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000\u0000\u0016]\u0001"+
		"\u0000\u0000\u0000\u0018c\u0001\u0000\u0000\u0000\u001ao\u0001\u0000\u0000"+
		"\u0000\u001cw\u0001\u0000\u0000\u0000\u001e{\u0001\u0000\u0000\u0000 "+
		"\u0094\u0001\u0000\u0000\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00b7"+
		"\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000\'\u0001\u0001\u0000"+
		"\u0000\u0000()\u0003\u0004\u0002\u0000)\u0003\u0001\u0000\u0000\u0000"+
		"*+\u0003\u0006\u0003\u0000+\u0005\u0001\u0000\u0000\u0000,/\u0003\f\u0006"+
		"\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0003\n\u0005\u000012\u0005\u0012"+
		"\u0000\u000023\u0005\u0001\u0000\u000034\u0006\u0004\uffff\uffff\u0000"+
		"4\t\u0001\u0000\u0000\u000056\u0007\u0000\u0000\u00006\u000b\u0001\u0000"+
		"\u0000\u000078\u0003\n\u0005\u000089\u0005\u0012\u0000\u00009;\u0005\u0004"+
		"\u0000\u0000:<\u0003\u000e\u0007\u0000;:\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0005\u0000\u0000"+
		">?\u0005\u0006\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0003\u0012\t\u0000"+
		"AB\u0005\u0007\u0000\u0000BC\u0006\u0006\uffff\uffff\u0000C\r\u0001\u0000"+
		"\u0000\u0000DE\u0003\u0010\b\u0000EF\u0005\b\u0000\u0000FG\u0003\u0010"+
		"\b\u0000G\u000f\u0001\u0000\u0000\u0000HI\u0003\n\u0005\u0000IJ\u0005"+
		"\u0012\u0000\u0000J\u0011\u0001\u0000\u0000\u0000KL\u0006\t\uffff\uffff"+
		"\u0000LM\u0003\u0014\n\u0000MR\u0001\u0000\u0000\u0000NO\n\u0001\u0000"+
		"\u0000OQ\u0003\u0014\n\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0013\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U\\\u0003\b\u0004\u0000V\\"+
		"\u0003\u0016\u000b\u0000W\\\u0003\u0018\f\u0000X\\\u0003\u001a\r\u0000"+
		"Y\\\u0003\u001c\u000e\u0000Z\\\u0003\u001e\u000f\u0000[U\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u0015"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0012\u0000\u0000^_\u0005\t\u0000\u0000"+
		"_`\u0003 \u0010\u0000`a\u0005\u0001\u0000\u0000ab\u0006\u000b\uffff\uffff"+
		"\u0000b\u0017\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000de\u0005\u0004"+
		"\u0000\u0000ef\u0003 \u0010\u0000fg\u0005\u0005\u0000\u0000gh\u0005\u0006"+
		"\u0000\u0000hi\u0003\u0012\t\u0000ij\u0005\u0007\u0000\u0000jk\u0005\u000b"+
		"\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u0003\u0012\t\u0000mn\u0005\u0007"+
		"\u0000\u0000n\u0019\u0001\u0000\u0000\u0000op\u0005\f\u0000\u0000pq\u0005"+
		"\u0004\u0000\u0000qr\u0003 \u0010\u0000rs\u0005\u0005\u0000\u0000st\u0005"+
		"\u0006\u0000\u0000tu\u0003\u0012\t\u0000uv\u0005\u0007\u0000\u0000v\u001b"+
		"\u0001\u0000\u0000\u0000wx\u0005\r\u0000\u0000xy\u0003 \u0010\u0000yz"+
		"\u0005\u0001\u0000\u0000z\u001d\u0001\u0000\u0000\u0000{|\u0003 \u0010"+
		"\u0000|}\u0005\u0001\u0000\u0000}\u001f\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\"\u0011\u0000\u007f\u0086\u0006\u0010\uffff\uffff\u0000\u0080\u0081"+
		"\u0005\u000e\u0000\u0000\u0081\u0082\u0003\"\u0011\u0000\u0082\u0083\u0006"+
		"\u0010\uffff\uffff\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0080"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0095"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0003\"\u0011\u0000\u008a\u0091\u0006\u0010\uffff\uffff\u0000\u008b\u008c"+
		"\u0005\u000f\u0000\u0000\u008c\u008d\u0003\"\u0011\u0000\u008d\u008e\u0006"+
		"\u0010\uffff\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008b"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094~\u0001"+
		"\u0000\u0000\u0000\u0094\u0089\u0001\u0000\u0000\u0000\u0095!\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003$\u0012\u0000\u0097\u009e\u0006\u0011\uffff"+
		"\uffff\u0000\u0098\u0099\u0005\u0010\u0000\u0000\u0099\u009a\u0003$\u0012"+
		"\u0000\u009a\u009b\u0006\u0011\uffff\uffff\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00ad\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0003$\u0012\u0000\u00a2\u00a9\u0006\u0011\uffff"+
		"\uffff\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4\u00a5\u0003$\u0012"+
		"\u0000\u00a5\u00a6\u0006\u0011\uffff\uffff\u0000\u00a6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u0096\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001\u0000"+
		"\u0000\u0000\u00ad#\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0013\u0000"+
		"\u0000\u00af\u00b8\u0006\u0012\uffff\uffff\u0000\u00b0\u00b1\u0005\u0012"+
		"\u0000\u0000\u00b1\u00b8\u0006\u0012\uffff\uffff\u0000\u00b2\u00b3\u0005"+
		"\u0004\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\u00b5\u0006\u0012"+
		"\uffff\uffff\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b8%\u0001\u0000"+
		"\u0000\u0000\u000b.;R[\u0086\u0091\u0094\u009e\u00a9\u00ac\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}