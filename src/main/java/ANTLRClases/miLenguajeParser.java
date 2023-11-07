package ANTLRClases;// Generated from .//miLenguaje.g4 by ANTLR 4.13.1

import java.util.Map;
import java.util.HashMap;
import InterpreterPattern.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TIPO=14, BOOLEAN=15, ID=16, NUMBER=17, 
		WS=18;
	public static final int
		RULE_start = 0, RULE_declaraciones = 1, RULE_declaracion = 2, RULE_declaracionVariable = 3, 
		RULE_declaracionFuncion = 4, RULE_sentencias = 5, RULE_sentencia = 6, 
		RULE_asignacion = 7, RULE_ifDeclaracion = 8, RULE_volverDeclaracion = 9, 
		RULE_expresion = 10, RULE_factor = 11, RULE_termino = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaraciones", "declaracion", "declaracionVariable", "declaracionFuncion", 
			"sentencias", "sentencia", "asignacion", "ifDeclaracion", "volverDeclaracion", 
			"expresion", "factor", "termino"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'='", "'Puede'", "'Entonces'", 
			"'retornar'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TIPO", "BOOLEAN", "ID", "NUMBER", "WS"
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


	public Map<String, Pair<String, Object>> symbolTable = new HashMap<String, Pair<String, Object>>();

	public miLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(miLenguajeParser.EOF, 0); }
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
			setState(26);
			declaraciones();
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public ASTNode node;
		public DeclaracionContext declaracion;
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
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((DeclaracionesContext)_localctx).declaracion = declaracion();
			((DeclaracionesContext)_localctx).node =  ((DeclaracionesContext)_localctx).declaracion.node;
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
		public ASTNode node;
		public DeclaracionFuncionContext declaracionFuncion;
		public DeclaracionesContext declaraciones;
		public DeclaracionVariableContext declaracionVariable;
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
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
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			int _alt;
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((DeclaracionContext)_localctx).declaracionFuncion = declaracionFuncion();
				((DeclaracionContext)_localctx).node =  ((DeclaracionContext)_localctx).declaracionFuncion.node; 
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(34);
						((DeclaracionContext)_localctx).declaraciones = declaraciones();
						((DeclaracionContext)_localctx).node =  ((DeclaracionContext)_localctx).declaraciones.node; 
						}
						} 
					}
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((DeclaracionContext)_localctx).declaracionVariable = declaracionVariable();
				((DeclaracionContext)_localctx).node =  ((DeclaracionContext)_localctx).declaracionVariable.node; 
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						((DeclaracionContext)_localctx).declaraciones = declaraciones();
						((DeclaracionContext)_localctx).node =  ((DeclaracionContext)_localctx).declaraciones.node; 
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public ASTNode node;
		public Token TIPO;
		public Token ID;
		public TerminalNode TIPO() { return getToken(miLenguajeParser.TIPO, 0); }
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
		enterRule(_localctx, 6, RULE_declaracionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((DeclaracionVariableContext)_localctx).TIPO = match(TIPO);
			setState(55);
			((DeclaracionVariableContext)_localctx).ID = match(ID);
			setState(56);
			match(T__0);
			 ((DeclaracionVariableContext)_localctx).node =  new VariableDeclaration((((DeclaracionVariableContext)_localctx).ID!=null?((DeclaracionVariableContext)_localctx).ID.getText():null), (((DeclaracionVariableContext)_localctx).TIPO!=null?((DeclaracionVariableContext)_localctx).TIPO.getText():null));
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
		public ASTNode node;
		public Token TIPO;
		public Token ID;
		public SentenciaContext sentencia;
		public TerminalNode TIPO() { return getToken(miLenguajeParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(miLenguajeParser.ID, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
		enterRule(_localctx, 8, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((DeclaracionFuncionContext)_localctx).TIPO = match(TIPO);
			setState(60);
			((DeclaracionFuncionContext)_localctx).ID = match(ID);
			setState(61);
			match(T__1);
			setState(62);
			match(T__2);
			setState(63);
			match(T__3);

			                    List<ASTNode> body = new ArrayList<ASTNode>();
			                    symbolTable.put("actualFunction", new Pair<>((((DeclaracionFuncionContext)_localctx).ID!=null?((DeclaracionFuncionContext)_localctx).ID.getText():null), (((DeclaracionFuncionContext)_localctx).TIPO!=null?((DeclaracionFuncionContext)_localctx).TIPO.getText():null)));
			                    symbolTable.put((((DeclaracionFuncionContext)_localctx).ID!=null?((DeclaracionFuncionContext)_localctx).ID.getText():null), new Pair<>((((DeclaracionFuncionContext)_localctx).TIPO!=null?((DeclaracionFuncionContext)_localctx).TIPO.getText():null), -1));
			                
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 82560L) != 0)) {
				{
				{
				setState(65);
				((DeclaracionFuncionContext)_localctx).sentencia = sentencia();
				body.add(((DeclaracionFuncionContext)_localctx).sentencia.node);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__4);

			                    for (ASTNode node : body) {
			                        node.execute(symbolTable);
			                    }
			                
			((DeclaracionFuncionContext)_localctx).node =  new FunctionDeclaration((((DeclaracionFuncionContext)_localctx).ID!=null?((DeclaracionFuncionContext)_localctx).ID.getText():null) , (((DeclaracionFuncionContext)_localctx).TIPO!=null?((DeclaracionFuncionContext)_localctx).TIPO.getText():null));
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
		public ASTNode node;
		public SentenciaContext sentencia;
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
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
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencias);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((SentenciasContext)_localctx).sentencia = sentencia();
			((SentenciasContext)_localctx).node =  ((SentenciasContext)_localctx).sentencia.node;
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					sentencias();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class SentenciaContext extends ParserRuleContext {
		public ASTNode node;
		public DeclaracionVariableContext declaracionVariable;
		public AsignacionContext asignacion;
		public IfDeclaracionContext ifDeclaracion;
		public VolverDeclaracionContext volverDeclaracion;
		public DeclaracionFuncionContext declaracionFuncion;
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IfDeclaracionContext ifDeclaracion() {
			return getRuleContext(IfDeclaracionContext.class,0);
		}
		public VolverDeclaracionContext volverDeclaracion() {
			return getRuleContext(VolverDeclaracionContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
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
		enterRule(_localctx, 12, RULE_sentencia);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((SentenciaContext)_localctx).declaracionVariable = declaracionVariable();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).declaracionVariable.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((SentenciaContext)_localctx).asignacion = asignacion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).asignacion.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((SentenciaContext)_localctx).ifDeclaracion = ifDeclaracion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).ifDeclaracion.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((SentenciaContext)_localctx).volverDeclaracion = volverDeclaracion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).volverDeclaracion.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				((SentenciaContext)_localctx).declaracionFuncion = declaracionFuncion();
				((SentenciaContext)_localctx).node =  ((SentenciaContext)_localctx).declaracionFuncion.node;
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
		public ASTNode node;
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
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(103);
			match(T__5);
			setState(104);
			((AsignacionContext)_localctx).expresion = expresion();
			setState(105);
			match(T__0);
			 ((AsignacionContext)_localctx).node =  new Assignment((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expresion.node);
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
		public ASTNode node;
		public TerminoContext termino;
		public SentenciaContext s1;
		public SentenciaContext s2;
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
		enterRule(_localctx, 16, RULE_ifDeclaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__6);
			setState(109);
			match(T__1);
			setState(110);
			((IfDeclaracionContext)_localctx).termino = termino();
			setState(111);
			match(T__2);

			                      List<ASTNode> body = new ArrayList<ASTNode>();
			                  
			setState(113);
			match(T__3);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 82560L) != 0)) {
				{
				{
				setState(114);
				((IfDeclaracionContext)_localctx).s1 = sentencia();
				 body.add(((IfDeclaracionContext)_localctx).s1.node);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__4);
			setState(123);
			match(T__7);

			                        List<ASTNode> elseBody = new ArrayList<ASTNode>();
			                  
			setState(125);
			match(T__3);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 82560L) != 0)) {
				{
				{
				setState(126);
				((IfDeclaracionContext)_localctx).s2 = sentencia();
				 elseBody.add(((IfDeclaracionContext)_localctx).s2.node);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__4);

			                        ((IfDeclaracionContext)_localctx).node =  new If(((IfDeclaracionContext)_localctx).termino.node, body, elseBody);
			                  
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
		public ASTNode node;
		public ExpresionContext expresion;
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
		enterRule(_localctx, 18, RULE_volverDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__8);
			setState(138);
			((VolverDeclaracionContext)_localctx).expresion = expresion();
			setState(139);
			match(T__0);
			((VolverDeclaracionContext)_localctx).node =  new Return(((VolverDeclaracionContext)_localctx).expresion.node);
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
		public ASTNode node;
		public FactorContext f1;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			int _alt;
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((ExpresionContext)_localctx).f1 = factor();
				((ExpresionContext)_localctx).node =  ((ExpresionContext)_localctx).f1.node;
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(144);
					match(T__9);
					setState(145);
					((ExpresionContext)_localctx).f2 = factor();
					((ExpresionContext)_localctx).node =  new Addition(_localctx.node, ((ExpresionContext)_localctx).f2.node);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(153);
						expresion();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((ExpresionContext)_localctx).f1 = factor();
				((ExpresionContext)_localctx).node =  ((ExpresionContext)_localctx).f1.node;
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(161);
					match(T__10);
					setState(162);
					((ExpresionContext)_localctx).f2 = factor();
					((ExpresionContext)_localctx).node =  new Subtraction(_localctx.node, ((ExpresionContext)_localctx).f2.node);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						expresion();
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public ASTNode node;
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
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((FactorContext)_localctx).t1 = termino();
				((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(180);
					match(T__11);
					setState(181);
					((FactorContext)_localctx).t2 = termino();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((FactorContext)_localctx).t1 = termino();
				((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(191);
					match(T__12);
					setState(192);
					((FactorContext)_localctx).t2 = termino();
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					}
					setState(199);
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
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode NUMBER() { return getToken(miLenguajeParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(miLenguajeParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 24, RULE_termino);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((TerminoContext)_localctx).NUMBER = match(NUMBER);
				((TerminoContext)_localctx).node =  new Constant(Integer.parseInt((((TerminoContext)_localctx).NUMBER!=null?((TerminoContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((TerminoContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TerminoContext)_localctx).node =  new Constant((((TerminoContext)_localctx).BOOLEAN!=null?((TerminoContext)_localctx).BOOLEAN.getText():null).equals("hecho") ? true : false);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				((TerminoContext)_localctx).ID = match(ID);
				 ((TerminoContext)_localctx).node =  new VariableReference((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null)); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(T__1);
				setState(209);
				((TerminoContext)_localctx).expresion = expresion();
				((TerminoContext)_localctx).node =  ((TerminoContext)_localctx).expresion.node; 
				setState(211);
				match(T__2);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00020\b\u0002\n\u0002"+
		"\f\u00023\t\u0002\u0003\u00025\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005Q\b\u0005"+
		"\n\u0005\f\u0005T\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bv\b\b\n\b\f\by\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0082\b\b\n\b\f\b\u0085\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0095\b\n\n\n\f\n\u0098\t\n\u0001\n"+
		"\u0005\n\u009b\b\n\n\n\f\n\u009e\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00a6\b\n\n\n\f\n\u00a9\t\n\u0001\n\u0005\n\u00ac\b"+
		"\n\n\n\f\n\u00af\t\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b9\b\u000b\n\u000b"+
		"\f\u000b\u00bc\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00c4\b\u000b\n\u000b\f\u000b\u00c7"+
		"\t\u000b\u0003\u000b\u00c9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0000\u00e0\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"\u001d\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u00066\u0001"+
		"\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010l\u0001"+
		"\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u00b0\u0001"+
		"\u0000\u0000\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00d5\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005"+
		"\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0003"+
		"\u0004\u0002\u0000\u001e\u001f\u0006\u0001\uffff\uffff\u0000\u001f\u0003"+
		"\u0001\u0000\u0000\u0000 !\u0003\b\u0004\u0000!\'\u0006\u0002\uffff\uffff"+
		"\u0000\"#\u0003\u0002\u0001\u0000#$\u0006\u0002\uffff\uffff\u0000$&\u0001"+
		"\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(5\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+1\u0006\u0002"+
		"\uffff\uffff\u0000,-\u0003\u0002\u0001\u0000-.\u0006\u0002\uffff\uffff"+
		"\u0000.0\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000\u000003\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u00004 \u0001\u0000\u0000\u0000"+
		"4*\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0005\u000e"+
		"\u0000\u000078\u0005\u0010\u0000\u000089\u0005\u0001\u0000\u00009:\u0006"+
		"\u0003\uffff\uffff\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005\u000e"+
		"\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005"+
		"\u0003\u0000\u0000?@\u0005\u0004\u0000\u0000@F\u0006\u0004\uffff\uffff"+
		"\u0000AB\u0003\f\u0006\u0000BC\u0006\u0004\uffff\uffff\u0000CE\u0001\u0000"+
		"\u0000\u0000DA\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IJ\u0005\u0005\u0000\u0000JK\u0006\u0004\uffff"+
		"\uffff\u0000KL\u0006\u0004\uffff\uffff\u0000L\t\u0001\u0000\u0000\u0000"+
		"MN\u0003\f\u0006\u0000NR\u0006\u0005\uffff\uffff\u0000OQ\u0003\n\u0005"+
		"\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0006\u0006\uffff"+
		"\uffff\u0000We\u0001\u0000\u0000\u0000XY\u0003\u000e\u0007\u0000YZ\u0006"+
		"\u0006\uffff\uffff\u0000Ze\u0001\u0000\u0000\u0000[\\\u0003\u0010\b\u0000"+
		"\\]\u0006\u0006\uffff\uffff\u0000]e\u0001\u0000\u0000\u0000^_\u0003\u0012"+
		"\t\u0000_`\u0006\u0006\uffff\uffff\u0000`e\u0001\u0000\u0000\u0000ab\u0003"+
		"\b\u0004\u0000bc\u0006\u0006\uffff\uffff\u0000ce\u0001\u0000\u0000\u0000"+
		"dU\u0001\u0000\u0000\u0000dX\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000"+
		"\u0000d^\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000e\r\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0010\u0000\u0000gh\u0005\u0006\u0000\u0000hi\u0003"+
		"\u0014\n\u0000ij\u0005\u0001\u0000\u0000jk\u0006\u0007\uffff\uffff\u0000"+
		"k\u000f\u0001\u0000\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0005\u0002"+
		"\u0000\u0000no\u0003\u0018\f\u0000op\u0005\u0003\u0000\u0000pq\u0006\b"+
		"\uffff\uffff\u0000qw\u0005\u0004\u0000\u0000rs\u0003\f\u0006\u0000st\u0006"+
		"\b\uffff\uffff\u0000tv\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0005"+
		"\u0000\u0000{|\u0005\b\u0000\u0000|}\u0006\b\uffff\uffff\u0000}\u0083"+
		"\u0005\u0004\u0000\u0000~\u007f\u0003\f\u0006\u0000\u007f\u0080\u0006"+
		"\b\uffff\uffff\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081~\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0005\u0000\u0000\u0087\u0088\u0006\b\uffff\uffff\u0000\u0088\u0011\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\t\u0000\u0000\u008a\u008b\u0003\u0014"+
		"\n\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0006\t\uffff"+
		"\uffff\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0016"+
		"\u000b\u0000\u008f\u0096\u0006\n\uffff\uffff\u0000\u0090\u0091\u0005\n"+
		"\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0093\u0006\n\uffff"+
		"\uffff\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009c\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0014"+
		"\n\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u00b1\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a7\u0006\n\uffff\uffff"+
		"\u0000\u00a1\u00a2\u0005\u000b\u0000\u0000\u00a2\u00a3\u0003\u0016\u000b"+
		"\u0000\u00a3\u00a4\u0006\n\uffff\uffff\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ad\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0014\n\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u008e\u0001\u0000\u0000\u0000"+
		"\u00b0\u009f\u0001\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0003\u0018\f\u0000\u00b3\u00ba\u0006\u000b\uffff\uffff\u0000"+
		"\u00b4\u00b5\u0005\f\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000\u00b6"+
		"\u00b7\u0006\u000b\uffff\uffff\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00c9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00c5\u0006\u000b\uffff\uffff\u0000"+
		"\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0003\u0018\f\u0000\u00c1"+
		"\u00c2\u0006\u000b\uffff\uffff\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b2\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000"+
		"\u00cb\u00d6\u0006\f\uffff\uffff\u0000\u00cc\u00cd\u0005\u000f\u0000\u0000"+
		"\u00cd\u00d6\u0006\f\uffff\uffff\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000"+
		"\u00cf\u00d6\u0006\f\uffff\uffff\u0000\u00d0\u00d1\u0005\u0002\u0000\u0000"+
		"\u00d1\u00d2\u0003\u0014\n\u0000\u00d2\u00d3\u0006\f\uffff\uffff\u0000"+
		"\u00d3\u00d4\u0005\u0003\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d6\u0019\u0001\u0000\u0000\u0000\u0011\'14FRdw\u0083\u0096\u009c\u00a7"+
		"\u00ad\u00b0\u00ba\u00c5\u00c8\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}