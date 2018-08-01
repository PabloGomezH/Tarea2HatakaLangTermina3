// Generated from HotakaLangParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HotakaLangParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HotakaLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(HotakaLangParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(HotakaLangParserParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(HotakaLangParserParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#finale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinale(HotakaLangParserParser.FinaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(HotakaLangParserParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#declaracionvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionvar(HotakaLangParserParser.DeclaracionvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HotakaLangParserParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#asignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignvar(HotakaLangParserParser.AsignvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(HotakaLangParserParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(HotakaLangParserParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(HotakaLangParserParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#whiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiles(HotakaLangParserParser.WhilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(HotakaLangParserParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#sumas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumas(HotakaLangParserParser.SumasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#muestra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuestra(HotakaLangParserParser.MuestraContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(HotakaLangParserParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#fors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFors(HotakaLangParserParser.ForsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(HotakaLangParserParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(HotakaLangParserParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#bloque_condicional_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional_else(HotakaLangParserParser.Bloque_condicional_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#switchz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchz(HotakaLangParserParser.SwitchzContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotakaLangParserParser#casos_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos_switch(HotakaLangParserParser.Casos_switchContext ctx);
}