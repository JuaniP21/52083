// Generated from c:/Users/juani/ssl-antlr-calculator/Lenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, PRINTF=3, RETURN=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		SEMI=9, CADENA=10, WS=11;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_salida = 3, 
		RULE_decision = 4, RULE_sentencia = 5, RULE_condicion = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "salida", "decision", "sentencia", 
			"condicion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'printf'", "'return'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "PRINTF", "RETURN", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "CADENA", "WS"
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
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			instrucciones();
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
	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				{
				setState(16);
				instruccion();
				}
				}
				setState(21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				salida();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				decision();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(LenguajeParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(LenguajeParser.LPAREN, 0); }
		public TerminalNode CADENA() { return getToken(LenguajeParser.CADENA, 0); }
		public TerminalNode RPAREN() { return getToken(LenguajeParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LenguajeParser.SEMI, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSalida(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(PRINTF);
			setState(28);
			match(LPAREN);
			setState(29);
			match(CADENA);
			setState(30);
			match(RPAREN);
			setState(31);
			match(SEMI);
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
	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LenguajeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LenguajeParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LenguajeParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(LenguajeParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(LenguajeParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(LenguajeParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(LenguajeParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(LenguajeParser.ELSE, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitDecision(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(IF);
			setState(34);
			match(LPAREN);
			setState(35);
			condicion();
			setState(36);
			match(RPAREN);
			setState(37);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				{
				setState(38);
				instruccion();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RBRACE);
			setState(45);
			match(ELSE);
			setState(46);
			match(LBRACE);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				{
				setState(47);
				instruccion();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RBRACE);
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
		public TerminalNode RETURN() { return getToken(LenguajeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(LenguajeParser.SEMI, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(RETURN);
			setState(56);
			match(SEMI);
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
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(LenguajeParser.CADENA, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeListener ) ((LenguajeListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(CADENA);
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
		"\u0004\u0001\u000b=\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004(\b\u0004"+
		"\n\u0004\f\u0004+\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u00041\b\u0004\n\u0004\f\u00044\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000:\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0019"+
		"\u0001\u0000\u0000\u0000\u0006\u001b\u0001\u0000\u0000\u0000\b!\u0001"+
		"\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000"+
		"\u0010\u0012\u0003\u0004\u0002\u0000\u0011\u0010\u0001\u0000\u0000\u0000"+
		"\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u001a\u0003\u0006\u0003\u0000"+
		"\u0017\u001a\u0003\b\u0004\u0000\u0018\u001a\u0003\n\u0005\u0000\u0019"+
		"\u0016\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0003\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d"+
		"\u001e\u0005\n\u0000\u0000\u001e\u001f\u0005\u0006\u0000\u0000\u001f "+
		"\u0005\t\u0000\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0005\u0005\u0000\u0000#$\u0003\f\u0006\u0000$%\u0005\u0006"+
		"\u0000\u0000%)\u0005\u0007\u0000\u0000&(\u0003\u0004\u0002\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005\b\u0000\u0000-.\u0005\u0002\u0000\u0000.2\u0005\u0007\u0000"+
		"\u0000/1\u0003\u0004\u0002\u00000/\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\b\u0000\u00006\t"+
		"\u0001\u0000\u0000\u000078\u0005\u0004\u0000\u000089\u0005\t\u0000\u0000"+
		"9\u000b\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;\r\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u0019)2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}