// Generated from Lenguaje.g4 by ANTLR 4.13.1
// jshint ignore: start
import antlr4 from 'antlr4';
import LenguajeVisitor from './LenguajeVisitor.js';

const serializedATN = [4,1,11,61,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,1,0,1,0,1,1,5,1,18,8,1,10,1,12,1,21,9,1,1,2,1,2,1,2,3,2,
26,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,5,4,40,8,4,10,4,12,
4,43,9,4,1,4,1,4,1,4,1,4,5,4,49,8,4,10,4,12,4,52,9,4,1,4,1,4,1,5,1,5,1,5,
1,6,1,6,1,6,0,0,7,0,2,4,6,8,10,12,0,0,58,0,14,1,0,0,0,2,19,1,0,0,0,4,25,
1,0,0,0,6,27,1,0,0,0,8,33,1,0,0,0,10,55,1,0,0,0,12,58,1,0,0,0,14,15,3,2,
1,0,15,1,1,0,0,0,16,18,3,4,2,0,17,16,1,0,0,0,18,21,1,0,0,0,19,17,1,0,0,0,
19,20,1,0,0,0,20,3,1,0,0,0,21,19,1,0,0,0,22,26,3,6,3,0,23,26,3,8,4,0,24,
26,3,10,5,0,25,22,1,0,0,0,25,23,1,0,0,0,25,24,1,0,0,0,26,5,1,0,0,0,27,28,
5,3,0,0,28,29,5,5,0,0,29,30,5,10,0,0,30,31,5,6,0,0,31,32,5,9,0,0,32,7,1,
0,0,0,33,34,5,1,0,0,34,35,5,5,0,0,35,36,3,12,6,0,36,37,5,6,0,0,37,41,5,7,
0,0,38,40,3,4,2,0,39,38,1,0,0,0,40,43,1,0,0,0,41,39,1,0,0,0,41,42,1,0,0,
0,42,44,1,0,0,0,43,41,1,0,0,0,44,45,5,8,0,0,45,46,5,2,0,0,46,50,5,7,0,0,
47,49,3,4,2,0,48,47,1,0,0,0,49,52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,
53,1,0,0,0,52,50,1,0,0,0,53,54,5,8,0,0,54,9,1,0,0,0,55,56,5,4,0,0,56,57,
5,9,0,0,57,11,1,0,0,0,58,59,5,10,0,0,59,13,1,0,0,0,4,19,25,41,50];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class LenguajeParser extends antlr4.Parser {

    static grammarFileName = "Lenguaje.g4";
    static literalNames = [ null, "'if'", "'else'", "'printf'", "'return'", 
                            "'('", "')'", "'{'", "'}'", "';'" ];
    static symbolicNames = [ null, "IF", "ELSE", "PRINTF", "RETURN", "LPAREN", 
                             "RPAREN", "LBRACE", "RBRACE", "SEMI", "CADENA", 
                             "WS" ];
    static ruleNames = [ "programa", "instrucciones", "instruccion", "salida", 
                         "decision", "sentencia", "condicion" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = LenguajeParser.ruleNames;
        this.literalNames = LenguajeParser.literalNames;
        this.symbolicNames = LenguajeParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, LenguajeParser.RULE_programa);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 14;
	        this.instrucciones();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instrucciones() {
	    let localctx = new InstruccionesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, LenguajeParser.RULE_instrucciones);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 26) !== 0)) {
	            this.state = 16;
	            this.instruccion();
	            this.state = 21;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, LenguajeParser.RULE_instruccion);
	    try {
	        this.state = 25;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 22;
	            this.salida();
	            break;
	        case 1:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 23;
	            this.decision();
	            break;
	        case 4:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 24;
	            this.sentencia();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, LenguajeParser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 27;
	        this.match(LenguajeParser.PRINTF);
	        this.state = 28;
	        this.match(LenguajeParser.LPAREN);
	        this.state = 29;
	        this.match(LenguajeParser.CADENA);
	        this.state = 30;
	        this.match(LenguajeParser.RPAREN);
	        this.state = 31;
	        this.match(LenguajeParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	decision() {
	    let localctx = new DecisionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, LenguajeParser.RULE_decision);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 33;
	        this.match(LenguajeParser.IF);
	        this.state = 34;
	        this.match(LenguajeParser.LPAREN);
	        this.state = 35;
	        this.condicion();
	        this.state = 36;
	        this.match(LenguajeParser.RPAREN);
	        this.state = 37;
	        this.match(LenguajeParser.LBRACE);
	        this.state = 41;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 26) !== 0)) {
	            this.state = 38;
	            this.instruccion();
	            this.state = 43;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 44;
	        this.match(LenguajeParser.RBRACE);
	        this.state = 45;
	        this.match(LenguajeParser.ELSE);
	        this.state = 46;
	        this.match(LenguajeParser.LBRACE);
	        this.state = 50;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 26) !== 0)) {
	            this.state = 47;
	            this.instruccion();
	            this.state = 52;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 53;
	        this.match(LenguajeParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, LenguajeParser.RULE_sentencia);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this.match(LenguajeParser.RETURN);
	        this.state = 56;
	        this.match(LenguajeParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, LenguajeParser.RULE_condicion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 58;
	        this.match(LenguajeParser.CADENA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

LenguajeParser.EOF = antlr4.Token.EOF;
LenguajeParser.IF = 1;
LenguajeParser.ELSE = 2;
LenguajeParser.PRINTF = 3;
LenguajeParser.RETURN = 4;
LenguajeParser.LPAREN = 5;
LenguajeParser.RPAREN = 6;
LenguajeParser.LBRACE = 7;
LenguajeParser.RBRACE = 8;
LenguajeParser.SEMI = 9;
LenguajeParser.CADENA = 10;
LenguajeParser.WS = 11;

LenguajeParser.RULE_programa = 0;
LenguajeParser.RULE_instrucciones = 1;
LenguajeParser.RULE_instruccion = 2;
LenguajeParser.RULE_salida = 3;
LenguajeParser.RULE_decision = 4;
LenguajeParser.RULE_sentencia = 5;
LenguajeParser.RULE_condicion = 6;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_programa;
    }

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_instrucciones;
    }

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_instruccion;
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	decision() {
	    return this.getTypedRuleContext(DecisionContext,0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_salida;
    }

	PRINTF() {
	    return this.getToken(LenguajeParser.PRINTF, 0);
	};

	LPAREN() {
	    return this.getToken(LenguajeParser.LPAREN, 0);
	};

	CADENA() {
	    return this.getToken(LenguajeParser.CADENA, 0);
	};

	RPAREN() {
	    return this.getToken(LenguajeParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(LenguajeParser.SEMI, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DecisionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_decision;
    }

	IF() {
	    return this.getToken(LenguajeParser.IF, 0);
	};

	LPAREN() {
	    return this.getToken(LenguajeParser.LPAREN, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	RPAREN() {
	    return this.getToken(LenguajeParser.RPAREN, 0);
	};

	LBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(LenguajeParser.LBRACE);
	    } else {
	        return this.getToken(LenguajeParser.LBRACE, i);
	    }
	};


	RBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(LenguajeParser.RBRACE);
	    } else {
	        return this.getToken(LenguajeParser.RBRACE, i);
	    }
	};


	ELSE() {
	    return this.getToken(LenguajeParser.ELSE, 0);
	};

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitDecision(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_sentencia;
    }

	RETURN() {
	    return this.getToken(LenguajeParser.RETURN, 0);
	};

	SEMI() {
	    return this.getToken(LenguajeParser.SEMI, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitSentencia(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = LenguajeParser.RULE_condicion;
    }

	CADENA() {
	    return this.getToken(LenguajeParser.CADENA, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof LenguajeVisitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




LenguajeParser.ProgramaContext = ProgramaContext; 
LenguajeParser.InstruccionesContext = InstruccionesContext; 
LenguajeParser.InstruccionContext = InstruccionContext; 
LenguajeParser.SalidaContext = SalidaContext; 
LenguajeParser.DecisionContext = DecisionContext; 
LenguajeParser.SentenciaContext = SentenciaContext; 
LenguajeParser.CondicionContext = CondicionContext; 
