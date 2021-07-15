// Generated from /mnt/Files/Unal_asignaturas/Len_progra2021-1/Ant-LR/ProyectoLen/ProyectoLen/Interpreter/Picalculus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PicalculusParser}.
 */
public interface PicalculusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(PicalculusParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(PicalculusParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PicalculusParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PicalculusParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(PicalculusParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(PicalculusParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PicalculusParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PicalculusParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#processOp}.
	 * @param ctx the parse tree
	 */
	void enterProcessOp(PicalculusParser.ProcessOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#processOp}.
	 * @param ctx the parse tree
	 */
	void exitProcessOp(PicalculusParser.ProcessOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#createCh}.
	 * @param ctx the parse tree
	 */
	void enterCreateCh(PicalculusParser.CreateChContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#createCh}.
	 * @param ctx the parse tree
	 */
	void exitCreateCh(PicalculusParser.CreateChContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(PicalculusParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(PicalculusParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#processInvoc}.
	 * @param ctx the parse tree
	 */
	void enterProcessInvoc(PicalculusParser.ProcessInvocContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#processInvoc}.
	 * @param ctx the parse tree
	 */
	void exitProcessInvoc(PicalculusParser.ProcessInvocContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PicalculusParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PicalculusParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#processDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcessDecl(PicalculusParser.ProcessDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#processDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcessDecl(PicalculusParser.ProcessDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PicalculusParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(PicalculusParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PicalculusParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(PicalculusParser.OperContext ctx);
}