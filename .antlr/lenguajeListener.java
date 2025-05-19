// Generated from c:/Users/juani/ssl-antlr-calculator/Lenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeParser}.
 */
public interface LenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(LenguajeParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(LenguajeParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(LenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(LenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(LenguajeParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(LenguajeParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(LenguajeParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(LenguajeParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(LenguajeParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(LenguajeParser.CondicionContext ctx);
}