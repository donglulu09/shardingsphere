// Generated from org/apache/shardingsphere/distsql/parser/autogen/DistSQLStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(DistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#createDataSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDataSources(DistSQLStatementParser.CreateDataSourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#createShardingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateShardingRule(DistSQLStatementParser.CreateShardingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRule(DistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#dataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSource(DistSQLStatementParser.DataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#dataSourceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSourceDefinition(DistSQLStatementParser.DataSourceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#tableRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRuleDefinition(DistSQLStatementParser.TableRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#strategyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategyType(DistSQLStatementParser.StrategyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#strategyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategyDefinition(DistSQLStatementParser.StrategyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#strategyProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategyProps(DistSQLStatementParser.StrategyPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#strategyProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategyProp(DistSQLStatementParser.StrategyPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#dataSourceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSourceName(DistSQLStatementParser.DataSourceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#columName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumName(DistSQLStatementParser.ColumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#hostName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostName(DistSQLStatementParser.HostNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp(DistSQLStatementParser.IpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(DistSQLStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbName(DistSQLStatementParser.DbNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(DistSQLStatementParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(DistSQLStatementParser.PasswordContext ctx);
}