// Generated from org/apache/shardingsphere/sql/parser/autogen/OracleStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OracleStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OracleStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(OracleStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(OracleStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#insertSingleTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSingleTable(OracleStatementParser.InsertSingleTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#insertMultiTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertMultiTable(OracleStatementParser.InsertMultiTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#multiTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiTableElement(OracleStatementParser.MultiTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#conditionalInsertClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalInsertClause(OracleStatementParser.ConditionalInsertClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#conditionalInsertWhenPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalInsertWhenPart(OracleStatementParser.ConditionalInsertWhenPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#conditionalInsertElsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalInsertElsePart(OracleStatementParser.ConditionalInsertElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#insertIntoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoClause(OracleStatementParser.InsertIntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(OracleStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(OracleStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#updateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification(OracleStatementParser.UpdateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(OracleStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(OracleStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(OracleStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(OracleStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(OracleStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification(OracleStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(OracleStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(OracleStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#multipleTableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTableNames(OracleStatementParser.MultipleTableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(OracleStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(OracleStatementParser.UnionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(OracleStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(OracleStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(OracleStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(OracleStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(OracleStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(OracleStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(OracleStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(OracleStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(OracleStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(OracleStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(OracleStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(OracleStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(OracleStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(OracleStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(OracleStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(OracleStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(OracleStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(OracleStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(OracleStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(OracleStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(OracleStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(OracleStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(OracleStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(OracleStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(OracleStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(OracleStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(OracleStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OracleStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(OracleStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(OracleStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(OracleStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(OracleStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(OracleStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(OracleStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(OracleStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(OracleStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(OracleStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#oracleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOracleId(OracleStatementParser.OracleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(OracleStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(OracleStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(OracleStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(OracleStatementParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(OracleStatementParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(OracleStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(OracleStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(OracleStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(OracleStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(OracleStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(OracleStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(OracleStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(OracleStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(OracleStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(OracleStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(OracleStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(OracleStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(OracleStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(OracleStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(OracleStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(OracleStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(OracleStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(OracleStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(OracleStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(OracleStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(OracleStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(OracleStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(OracleStatementParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTypeName(OracleStatementParser.IndexTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#simpleExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExprs(OracleStatementParser.SimpleExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#lobItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLobItem(OracleStatementParser.LobItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#lobItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLobItems(OracleStatementParser.LobItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#lobItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLobItemList(OracleStatementParser.LobItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(OracleStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#specialDatatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialDatatype(OracleStatementParser.SpecialDatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(OracleStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#datetimeTypeSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeTypeSuffix(OracleStatementParser.DatetimeTypeSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#treatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreatFunction(OracleStatementParser.TreatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#privateExprOfDb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateExprOfDb(OracleStatementParser.PrivateExprOfDbContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(OracleStatementParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#simpleCaseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCaseExpr(OracleStatementParser.SimpleCaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#searchedCaseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCaseExpr(OracleStatementParser.SearchedCaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(OracleStatementParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(OracleStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAccessExpression(OracleStatementParser.ObjectAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constructorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorExpr(OracleStatementParser.ConstructorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier(OracleStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers(OracleStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#matchNone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchNone(OracleStatementParser.MatchNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(OracleStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(OracleStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(OracleStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(OracleStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(OracleStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(OracleStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(OracleStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification(OracleStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tablespaceClauseWithParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceClauseWithParen(OracleStatementParser.TablespaceClauseWithParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tablespaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceClause(OracleStatementParser.TablespaceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#domainIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainIndexClause(OracleStatementParser.DomainIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(OracleStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#relationalProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalProperties(OracleStatementParser.RelationalPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#relationalProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalProperty(OracleStatementParser.RelationalPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(OracleStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#visibleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibleClause(OracleStatementParser.VisibleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#defaultNullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultNullClause(OracleStatementParser.DefaultNullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#identityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityClause(OracleStatementParser.IdentityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#identifyOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifyOptions(OracleStatementParser.IdentifyOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#identityOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityOption(OracleStatementParser.IdentityOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#encryptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptionSpecification(OracleStatementParser.EncryptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#inlineConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineConstraint(OracleStatementParser.InlineConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#referencesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencesClause(OracleStatementParser.ReferencesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constraintState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintState(OracleStatementParser.ConstraintStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#notDeferrable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotDeferrable(OracleStatementParser.NotDeferrableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#initiallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitiallyClause(OracleStatementParser.InitiallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#exceptionsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionsClause(OracleStatementParser.ExceptionsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#usingIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingIndexClause(OracleStatementParser.UsingIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexClause(OracleStatementParser.CreateIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#inlineRefConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineRefConstraint(OracleStatementParser.InlineRefConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#virtualColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualColumnDefinition(OracleStatementParser.VirtualColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#outOfLineConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutOfLineConstraint(OracleStatementParser.OutOfLineConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#outOfLineRefConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutOfLineRefConstraint(OracleStatementParser.OutOfLineRefConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification(OracleStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexClause(OracleStatementParser.TableIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpressions(OracleStatementParser.IndexExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(OracleStatementParser.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#bitmapJoinIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitmapJoinIndexClause(OracleStatementParser.BitmapJoinIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnSortsClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnSortsClause_(OracleStatementParser.ColumnSortsClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnSortClause_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnSortClause_(OracleStatementParser.ColumnSortClause_Context ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createIndexDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexDefinitionClause(OracleStatementParser.CreateIndexDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(OracleStatementParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(OracleStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterTableProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableProperties(OracleStatementParser.AlterTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableSpecification(OracleStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnClauses(OracleStatementParser.ColumnClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#operateColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateColumnClause(OracleStatementParser.OperateColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(OracleStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOrVirtualDefinitions(OracleStatementParser.ColumnOrVirtualDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnOrVirtualDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOrVirtualDefinition(OracleStatementParser.ColumnOrVirtualDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperties(OracleStatementParser.ColumnPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperty(OracleStatementParser.ColumnPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectTypeColProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeColProperties(OracleStatementParser.ObjectTypeColPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#substitutableColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutableColumnClause(OracleStatementParser.SubstitutableColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(OracleStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#modifyColProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColProperties(OracleStatementParser.ModifyColPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#modifyColSubstitutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColSubstitutable(OracleStatementParser.ModifyColSubstitutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnClause(OracleStatementParser.DropColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(OracleStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#columnOrColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOrColumnList(OracleStatementParser.ColumnOrColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#cascadeOrInvalidate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeOrInvalidate(OracleStatementParser.CascadeOrInvalidateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#checkpointNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckpointNumber(OracleStatementParser.CheckpointNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#renameColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumnClause(OracleStatementParser.RenameColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constraintClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClauses(OracleStatementParser.ConstraintClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(OracleStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#modifyConstraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyConstraintClause(OracleStatementParser.ModifyConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constraintWithName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintWithName(OracleStatementParser.ConstraintWithNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintOption(OracleStatementParser.ConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#constraintPrimaryOrUnique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintPrimaryOrUnique(OracleStatementParser.ConstraintPrimaryOrUniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#renameConstraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameConstraintClause(OracleStatementParser.RenameConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropConstraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintClause(OracleStatementParser.DropConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterExternalTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExternalTable(OracleStatementParser.AlterExternalTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperties(OracleStatementParser.ObjectPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(OracleStatementParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#renameIndexClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndexClause(OracleStatementParser.RenameIndexClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(OracleStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(OracleStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(OracleStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(OracleStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(OracleStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(OracleStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectPrivilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPrivilegeClause(OracleStatementParser.ObjectPrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#systemPrivilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemPrivilegeClause(OracleStatementParser.SystemPrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#roleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause(OracleStatementParser.RoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPrivileges(OracleStatementParser.ObjectPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#objectPrivilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPrivilegeType(OracleStatementParser.ObjectPrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(OracleStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#systemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemPrivilege(OracleStatementParser.SystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#systemPrivilegeOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemPrivilegeOperation(OracleStatementParser.SystemPrivilegeOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#advisorFrameworkSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdvisorFrameworkSystemPrivilege(OracleStatementParser.AdvisorFrameworkSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#clustersSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustersSystemPrivilege(OracleStatementParser.ClustersSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#contextsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextsSystemPrivilege(OracleStatementParser.ContextsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dataRedactionSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRedactionSystemPrivilege(OracleStatementParser.DataRedactionSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#databaseSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseSystemPrivilege(OracleStatementParser.DatabaseSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#databaseLinksSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseLinksSystemPrivilege(OracleStatementParser.DatabaseLinksSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#debuggingSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebuggingSystemPrivilege(OracleStatementParser.DebuggingSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dictionariesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionariesSystemPrivilege(OracleStatementParser.DictionariesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dimensionsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionsSystemPrivilege(OracleStatementParser.DimensionsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#directoriesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectoriesSystemPrivilege(OracleStatementParser.DirectoriesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#editionsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditionsSystemPrivilege(OracleStatementParser.EditionsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#flashbackDataArchivesPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashbackDataArchivesPrivilege(OracleStatementParser.FlashbackDataArchivesPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexesSystemPrivilege(OracleStatementParser.IndexesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#indexTypesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexTypesSystemPrivilege(OracleStatementParser.IndexTypesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#jobSchedulerObjectsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobSchedulerObjectsSystemPrivilege(OracleStatementParser.JobSchedulerObjectsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#keyManagementFrameworkSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyManagementFrameworkSystemPrivilege(OracleStatementParser.KeyManagementFrameworkSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#librariesFrameworkSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrariesFrameworkSystemPrivilege(OracleStatementParser.LibrariesFrameworkSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#logminerFrameworkSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogminerFrameworkSystemPrivilege(OracleStatementParser.LogminerFrameworkSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#materizlizedViewsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterizlizedViewsSystemPrivilege(OracleStatementParser.MaterizlizedViewsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#miningModelsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiningModelsSystemPrivilege(OracleStatementParser.MiningModelsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#olapCubesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapCubesSystemPrivilege(OracleStatementParser.OlapCubesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#olapCubeMeasureFoldersSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapCubeMeasureFoldersSystemPrivilege(OracleStatementParser.OlapCubeMeasureFoldersSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#olapCubeDiminsionsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapCubeDiminsionsSystemPrivilege(OracleStatementParser.OlapCubeDiminsionsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#olapCubeBuildProcessesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOlapCubeBuildProcessesSystemPrivilege(OracleStatementParser.OlapCubeBuildProcessesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#operatorsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorsSystemPrivilege(OracleStatementParser.OperatorsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#outlinesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutlinesSystemPrivilege(OracleStatementParser.OutlinesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#planManagementSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanManagementSystemPrivilege(OracleStatementParser.PlanManagementSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#pluggableDatabasesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluggableDatabasesSystemPrivilege(OracleStatementParser.PluggableDatabasesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#proceduresSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceduresSystemPrivilege(OracleStatementParser.ProceduresSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#profilesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfilesSystemPrivilege(OracleStatementParser.ProfilesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#rolesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolesSystemPrivilege(OracleStatementParser.RolesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#rollbackSegmentsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackSegmentsSystemPrivilege(OracleStatementParser.RollbackSegmentsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#sequencesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencesSystemPrivilege(OracleStatementParser.SequencesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#sessionsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSessionsSystemPrivilege(OracleStatementParser.SessionsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#sqlTranslationProfilesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlTranslationProfilesSystemPrivilege(OracleStatementParser.SqlTranslationProfilesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#synonymsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynonymsSystemPrivilege(OracleStatementParser.SynonymsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tablesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesSystemPrivilege(OracleStatementParser.TablesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#tablespacesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespacesSystemPrivilege(OracleStatementParser.TablespacesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#triggersSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggersSystemPrivilege(OracleStatementParser.TriggersSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#typesSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypesSystemPrivilege(OracleStatementParser.TypesSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#usersSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsersSystemPrivilege(OracleStatementParser.UsersSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#viewsSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewsSystemPrivilege(OracleStatementParser.ViewsSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#miscellaneousSystemPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiscellaneousSystemPrivilege(OracleStatementParser.MiscellaneousSystemPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(OracleStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(OracleStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(OracleStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(OracleStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(OracleStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(OracleStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(OracleStatementParser.CallContext ctx);
}