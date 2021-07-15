// Generated from picalculus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link picalculusParser}.
 */
public interface picalculusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link picalculusParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(picalculusParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(picalculusParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(picalculusParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(picalculusParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(picalculusParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(picalculusParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(picalculusParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(picalculusParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#process_op}.
	 * @param ctx the parse tree
	 */
	void enterProcess_op(picalculusParser.Process_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#process_op}.
	 * @param ctx the parse tree
	 */
	void exitProcess_op(picalculusParser.Process_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#create_ch}.
	 * @param ctx the parse tree
	 */
	void enterCreate_ch(picalculusParser.Create_chContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#create_ch}.
	 * @param ctx the parse tree
	 */
	void exitCreate_ch(picalculusParser.Create_chContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(picalculusParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(picalculusParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#process_invoc}.
	 * @param ctx the parse tree
	 */
	void enterProcess_invoc(picalculusParser.Process_invocContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#process_invoc}.
	 * @param ctx the parse tree
	 */
	void exitProcess_invoc(picalculusParser.Process_invocContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(picalculusParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(picalculusParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#process_decl}.
	 * @param ctx the parse tree
	 */
	void enterProcess_decl(picalculusParser.Process_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#process_decl}.
	 * @param ctx the parse tree
	 */
	void exitProcess_decl(picalculusParser.Process_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link picalculusParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(picalculusParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link picalculusParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(picalculusParser.OperContext ctx);
}