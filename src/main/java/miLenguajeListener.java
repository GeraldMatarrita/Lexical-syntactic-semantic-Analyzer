// Generated from .//miLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miLenguajeParser}.
 */
public interface miLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(miLenguajeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(miLenguajeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(miLenguajeParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(miLenguajeParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(miLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(miLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(miLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(miLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(miLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(miLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(miLenguajeParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(miLenguajeParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(miLenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(miLenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(miLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(miLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#ifDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclaracion(miLenguajeParser.IfDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#ifDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclaracion(miLenguajeParser.IfDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#volverDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterVolverDeclaracion(miLenguajeParser.VolverDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#volverDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitVolverDeclaracion(miLenguajeParser.VolverDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(miLenguajeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(miLenguajeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(miLenguajeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(miLenguajeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miLenguajeParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(miLenguajeParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link miLenguajeParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(miLenguajeParser.TerminoContext ctx);
}