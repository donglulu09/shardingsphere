// Generated from org/apache/shardingsphere/sql/parser/autogen/PostgreSQLStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(PostgreSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(PostgreSQLStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertTarget(PostgreSQLStatementParser.InsertTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertRest(PostgreSQLStatementParser.InsertRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#overrideKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrideKind(PostgreSQLStatementParser.OverrideKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnList(PostgreSQLStatementParser.InsertColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#insertColumnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnItem(PostgreSQLStatementParser.InsertColumnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optOnConflict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptOnConflict(PostgreSQLStatementParser.OptOnConflictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optConfExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConfExpr(PostgreSQLStatementParser.OptConfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(PostgreSQLStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClauseList(PostgreSQLStatementParser.SetClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(PostgreSQLStatementParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTarget(PostgreSQLStatementParser.SetTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setTargetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTargetList(PostgreSQLStatementParser.SetTargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#returningClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningClause(PostgreSQLStatementParser.ReturningClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(PostgreSQLStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#relationExprOptAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExprOptAlias(PostgreSQLStatementParser.RelationExprOptAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(PostgreSQLStatementParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(PostgreSQLStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectWithParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithParens(PostgreSQLStatementParser.SelectWithParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectNoParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectNoParens(PostgreSQLStatementParser.SelectNoParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectClauseN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClauseN(PostgreSQLStatementParser.SelectClauseNContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#simpleSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(PostgreSQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(PostgreSQLStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(PostgreSQLStatementParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optTempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTempTableName(PostgreSQLStatementParser.OptTempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cteList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteList(PostgreSQLStatementParser.CteListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commonTableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonTableExpr(PostgreSQLStatementParser.CommonTableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optMaterialized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptMaterialized(PostgreSQLStatementParser.OptMaterializedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptNameList(PostgreSQLStatementParser.OptNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#preparableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparableStmt(PostgreSQLStatementParser.PreparableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#forLockingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingClause(PostgreSQLStatementParser.ForLockingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#forLockingItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingItems(PostgreSQLStatementParser.ForLockingItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#forLockingItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingItem(PostgreSQLStatementParser.ForLockingItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nowaitOrSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowaitOrSkip(PostgreSQLStatementParser.NowaitOrSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#forLockingStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLockingStrength(PostgreSQLStatementParser.ForLockingStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#lockedRelsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRelsList(PostgreSQLStatementParser.LockedRelsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(PostgreSQLStatementParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(PostgreSQLStatementParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectLimit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLimit(PostgreSQLStatementParser.SelectLimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(PostgreSQLStatementParser.ValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(PostgreSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(PostgreSQLStatementParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectLimitValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLimitValue(PostgreSQLStatementParser.SelectLimitValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectOffsetValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOffsetValue(PostgreSQLStatementParser.SelectOffsetValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#selectFetchFirstValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFetchFirstValue(PostgreSQLStatementParser.SelectFetchFirstValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rowOrRows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowOrRows(PostgreSQLStatementParser.RowOrRowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#firstOrNext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrNext(PostgreSQLStatementParser.FirstOrNextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#targetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetList(PostgreSQLStatementParser.TargetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#targetEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetEl(PostgreSQLStatementParser.TargetElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#groupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(PostgreSQLStatementParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#groupByList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByList(PostgreSQLStatementParser.GroupByListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(PostgreSQLStatementParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#emptyGroupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyGroupingSet(PostgreSQLStatementParser.EmptyGroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rollupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollupClause(PostgreSQLStatementParser.RollupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cubeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCubeClause(PostgreSQLStatementParser.CubeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#groupingSetsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSetsClause(PostgreSQLStatementParser.GroupingSetsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(PostgreSQLStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinitionList(PostgreSQLStatementParser.WindowDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(PostgreSQLStatementParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(PostgreSQLStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#existingWindowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingWindowName(PostgreSQLStatementParser.ExistingWindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(PostgreSQLStatementParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(PostgreSQLStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameExtent(PostgreSQLStatementParser.FrameExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(PostgreSQLStatementParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optWindowExclusionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptWindowExclusionClause(PostgreSQLStatementParser.OptWindowExclusionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(PostgreSQLStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(PostgreSQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fromList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromList(PostgreSQLStatementParser.FromListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(PostgreSQLStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(PostgreSQLStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(PostgreSQLStatementParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinOuter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOuter(PostgreSQLStatementParser.JoinOuterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#joinQual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinQual(PostgreSQLStatementParser.JoinQualContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(PostgreSQLStatementParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PostgreSQLStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#whereOrCurrentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereOrCurrentClause(PostgreSQLStatementParser.WhereOrCurrentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(PostgreSQLStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(PostgreSQLStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmtOptList(PostgreSQLStatementParser.DostmtOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dostmtOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmtOptItem(PostgreSQLStatementParser.DostmtOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock(PostgreSQLStatementParser.LockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#lockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockType(PostgreSQLStatementParser.LockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#checkpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckpoint(PostgreSQLStatementParser.CheckpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy(PostgreSQLStatementParser.CopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptions(PostgreSQLStatementParser.CopyOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyGenericOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptList(PostgreSQLStatementParser.CopyGenericOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyGenericOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptElem(PostgreSQLStatementParser.CopyGenericOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyGenericOptArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArg(PostgreSQLStatementParser.CopyGenericOptArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyGenericOptArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArgList(PostgreSQLStatementParser.CopyGenericOptArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyGenericOptArgListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyGenericOptArgListItem(PostgreSQLStatementParser.CopyGenericOptArgListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptList(PostgreSQLStatementParser.CopyOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptItem(PostgreSQLStatementParser.CopyOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#copyDelimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyDelimiter(PostgreSQLStatementParser.CopyDelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#deallocate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate(PostgreSQLStatementParser.DeallocateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch(PostgreSQLStatementParser.FetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fetchArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchArgs(PostgreSQLStatementParser.FetchArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(PostgreSQLStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reservedKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedKeyword(PostgreSQLStatementParser.ReservedKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(PostgreSQLStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#literalsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralsType(PostgreSQLStatementParser.LiteralsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unicodeEscapes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeEscapes(PostgreSQLStatementParser.UnicodeEscapesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#uescape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUescape(PostgreSQLStatementParser.UescapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(PostgreSQLStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeFuncNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFuncNameKeyword(PostgreSQLStatementParser.TypeFuncNameKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(PostgreSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(PostgreSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(PostgreSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(PostgreSQLStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PostgreSQLStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(PostgreSQLStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(PostgreSQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(PostgreSQLStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(PostgreSQLStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(PostgreSQLStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(PostgreSQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PostgreSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(PostgreSQLStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAExpr(PostgreSQLStatementParser.AExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBExpr(PostgreSQLStatementParser.BExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCExpr(PostgreSQLStatementParser.CExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(PostgreSQLStatementParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optIndirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptIndirection(PostgreSQLStatementParser.OptIndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indirectionEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectionEl(PostgreSQLStatementParser.IndirectionElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sliceBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceBound(PostgreSQLStatementParser.SliceBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#inExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(PostgreSQLStatementParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(PostgreSQLStatementParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#whenClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClauseList(PostgreSQLStatementParser.WhenClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(PostgreSQLStatementParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseDefault(PostgreSQLStatementParser.CaseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#caseArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseArg(PostgreSQLStatementParser.CaseArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(PostgreSQLStatementParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#qualOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualOp(PostgreSQLStatementParser.QualOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#subqueryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryOp(PostgreSQLStatementParser.SubqueryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#allOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOp(PostgreSQLStatementParser.AllOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(PostgreSQLStatementParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(PostgreSQLStatementParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#qualAllOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualAllOp(PostgreSQLStatementParser.QualAllOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ascDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscDesc(PostgreSQLStatementParser.AscDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#anyOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyOperator(PostgreSQLStatementParser.AnyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowExclusionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowExclusionClause(PostgreSQLStatementParser.WindowExclusionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(PostgreSQLStatementParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explicitRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitRow(PostgreSQLStatementParser.ExplicitRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#implicitRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitRow(PostgreSQLStatementParser.ImplicitRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#subType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(PostgreSQLStatementParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(PostgreSQLStatementParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#arrayExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExprList(PostgreSQLStatementParser.ArrayExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgList(PostgreSQLStatementParser.FuncArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#paramName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamName(PostgreSQLStatementParser.ParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgExpr(PostgreSQLStatementParser.FuncArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(PostgreSQLStatementParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncApplication(PostgreSQLStatementParser.FuncApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(PostgreSQLStatementParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aexprConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprConst(PostgreSQLStatementParser.AexprConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColId(PostgreSQLStatementParser.ColIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionName(PostgreSQLStatementParser.TypeFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(PostgreSQLStatementParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTable(PostgreSQLStatementParser.XmlTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnList(PostgreSQLStatementParser.XmlTableColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnEl(PostgreSQLStatementParser.XmlTableColumnElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnOptionList(PostgreSQLStatementParser.XmlTableColumnOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlTableColumnOptionEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumnOptionEl(PostgreSQLStatementParser.XmlTableColumnOptionElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceList(PostgreSQLStatementParser.XmlNamespaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlNamespaceEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlNamespaceEl(PostgreSQLStatementParser.XmlNamespaceElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(PostgreSQLStatementParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#withinGroupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinGroupClause(PostgreSQLStatementParser.WithinGroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(PostgreSQLStatementParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionExprWindowless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExprWindowless(PostgreSQLStatementParser.FunctionExprWindowlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ordinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinality(PostgreSQLStatementParser.OrdinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionExprCommonSubexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExprCommonSubexpr(PostgreSQLStatementParser.FunctionExprCommonSubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(PostgreSQLStatementParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(PostgreSQLStatementParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(PostgreSQLStatementParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#extractList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractList(PostgreSQLStatementParser.ExtractListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#extractArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractArg(PostgreSQLStatementParser.ExtractArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(PostgreSQLStatementParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifiers(PostgreSQLStatementParser.TypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PostgreSQLStatementParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constDatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDatetime(PostgreSQLStatementParser.ConstDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(PostgreSQLStatementParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(PostgreSQLStatementParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#characterWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLength(PostgreSQLStatementParser.CharacterWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#characterWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithoutLength(PostgreSQLStatementParser.CharacterWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#characterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterClause(PostgreSQLStatementParser.CharacterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptFloat(PostgreSQLStatementParser.OptFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(PostgreSQLStatementParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(PostgreSQLStatementParser.AttrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colLable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLable(PostgreSQLStatementParser.ColLableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(PostgreSQLStatementParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bitWithLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithLength(PostgreSQLStatementParser.BitWithLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#bitWithoutLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitWithoutLength(PostgreSQLStatementParser.BitWithoutLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInterval(PostgreSQLStatementParser.ConstIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInterval(PostgreSQLStatementParser.OptIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optArrayBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptArrayBounds(PostgreSQLStatementParser.OptArrayBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#intervalSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalSecond(PostgreSQLStatementParser.IntervalSecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unicodeNormalForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicodeNormalForm(PostgreSQLStatementParser.UnicodeNormalFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#trimList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimList(PostgreSQLStatementParser.TrimListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#overlayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlayList(PostgreSQLStatementParser.OverlayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#overlayPlacing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlayPlacing(PostgreSQLStatementParser.OverlayPlacingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#substrFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFrom(PostgreSQLStatementParser.SubstrFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#substrFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFor(PostgreSQLStatementParser.SubstrForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#positionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionList(PostgreSQLStatementParser.PositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#substrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrList(PostgreSQLStatementParser.SubstrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributes(PostgreSQLStatementParser.XmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributeList(PostgreSQLStatementParser.XmlAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlAttributeEl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlAttributeEl(PostgreSQLStatementParser.XmlAttributeElContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlExistsArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlExistsArgument(PostgreSQLStatementParser.XmlExistsArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlPassingMech}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlPassingMech(PostgreSQLStatementParser.XmlPassingMechContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#documentOrContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentOrContent(PostgreSQLStatementParser.DocumentOrContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlWhitespaceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlWhitespaceOption(PostgreSQLStatementParser.XmlWhitespaceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlRootVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlRootVersion(PostgreSQLStatementParser.XmlRootVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#xmlRootStandalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlRootStandalone(PostgreSQLStatementParser.XmlRootStandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rowsFromItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsFromItem(PostgreSQLStatementParser.RowsFromItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rowsFromList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsFromList(PostgreSQLStatementParser.RowsFromListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefList(PostgreSQLStatementParser.ColumnDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElementList(PostgreSQLStatementParser.TableFuncElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncElement(PostgreSQLStatementParser.TableFuncElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(PostgreSQLStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#anyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyName(PostgreSQLStatementParser.AnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasClause(PostgreSQLStatementParser.AliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(PostgreSQLStatementParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcAliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAliasClause(PostgreSQLStatementParser.FuncAliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tablesampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesampleClause(PostgreSQLStatementParser.TablesampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#repeatableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatableClause(PostgreSQLStatementParser.RepeatableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#allOrDistinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrDistinct(PostgreSQLStatementParser.AllOrDistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sortClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortClause(PostgreSQLStatementParser.SortClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sortbyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortbyList(PostgreSQLStatementParser.SortbyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(PostgreSQLStatementParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nullsOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullsOrder(PostgreSQLStatementParser.NullsOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(PostgreSQLStatementParser.DistinctClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(PostgreSQLStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(PostgreSQLStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#windowName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowName(PostgreSQLStatementParser.WindowNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParams(PostgreSQLStatementParser.IndexParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexElemOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexElemOptions(PostgreSQLStatementParser.IndexElemOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexElem(PostgreSQLStatementParser.IndexElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(PostgreSQLStatementParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptClass(PostgreSQLStatementParser.OptClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(PostgreSQLStatementParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reloptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptionList(PostgreSQLStatementParser.ReloptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reloptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptionElem(PostgreSQLStatementParser.ReloptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefArg(PostgreSQLStatementParser.DefArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(PostgreSQLStatementParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PostgreSQLStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(PostgreSQLStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(PostgreSQLStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(PostgreSQLStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier(PostgreSQLStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ignoredIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifiers(PostgreSQLStatementParser.IgnoredIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#signedIconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedIconst(PostgreSQLStatementParser.SignedIconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#booleanOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrString(PostgreSQLStatementParser.BooleanOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedWord(PostgreSQLStatementParser.NonReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colNameKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColNameKeyword(PostgreSQLStatementParser.ColNameKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(PostgreSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#roleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleSpec(PostgreSQLStatementParser.RoleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(PostgreSQLStatementParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(PostgreSQLStatementParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#varValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(PostgreSQLStatementParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#zoneValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZoneValue(PostgreSQLStatementParser.ZoneValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#numericOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnly(PostgreSQLStatementParser.NumericOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#isoLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsoLevel(PostgreSQLStatementParser.IsoLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(PostgreSQLStatementParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colQualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColQualList(PostgreSQLStatementParser.ColQualListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(PostgreSQLStatementParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttr(PostgreSQLStatementParser.ConstraintAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraintElem(PostgreSQLStatementParser.ColConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#parenthesizedSeqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedSeqOptList(PostgreSQLStatementParser.ParenthesizedSeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#seqOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptList(PostgreSQLStatementParser.SeqOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#seqOptElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqOptElem(PostgreSQLStatementParser.SeqOptElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptColumnList(PostgreSQLStatementParser.OptColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(PostgreSQLStatementParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(PostgreSQLStatementParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#generatedWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedWhen(PostgreSQLStatementParser.GeneratedWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#noInherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoInherit(PostgreSQLStatementParser.NoInheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#consTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsTableSpace(PostgreSQLStatementParser.ConsTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PostgreSQLStatementParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefList(PostgreSQLStatementParser.DefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefElem(PostgreSQLStatementParser.DefElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(PostgreSQLStatementParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#keyActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyActions(PostgreSQLStatementParser.KeyActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#keyDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDelete(PostgreSQLStatementParser.KeyDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#keyUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyUpdate(PostgreSQLStatementParser.KeyUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#keyAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyAction(PostgreSQLStatementParser.KeyActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#keyMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyMatch(PostgreSQLStatementParser.KeyMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createGenericOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGenericOptions(PostgreSQLStatementParser.CreateGenericOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionList(PostgreSQLStatementParser.GenericOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionElem(PostgreSQLStatementParser.GenericOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionArg(PostgreSQLStatementParser.GenericOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericOptionName(PostgreSQLStatementParser.GenericOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#replicaIdentity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicaIdentity(PostgreSQLStatementParser.ReplicaIdentityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperArgtypes(PostgreSQLStatementParser.OperArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(PostgreSQLStatementParser.FuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#argClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgClass(PostgreSQLStatementParser.ArgClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsList(PostgreSQLStatementParser.FuncArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#nonReservedWordOrSconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReservedWordOrSconst(PostgreSQLStatementParser.NonReservedWordOrSconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(PostgreSQLStatementParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#roleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleList(PostgreSQLStatementParser.RoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResetClause(PostgreSQLStatementParser.SetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRest(PostgreSQLStatementParser.SetRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transactionModeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionModeList(PostgreSQLStatementParser.TransactionModeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transactionModeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionModeItem(PostgreSQLStatementParser.TransactionModeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setRestMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRestMore(PostgreSQLStatementParser.SetRestMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding(PostgreSQLStatementParser.EncodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSet(PostgreSQLStatementParser.GenericSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#variableResetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableResetStmt(PostgreSQLStatementParser.VariableResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#resetRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetRest(PostgreSQLStatementParser.ResetRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#genericReset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericReset(PostgreSQLStatementParser.GenericResetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#relationExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExprList(PostgreSQLStatementParser.RelationExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commonFuncOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonFuncOptItem(PostgreSQLStatementParser.CommonFuncOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionSetResetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSetResetClause(PostgreSQLStatementParser.FunctionSetResetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rowSecurityCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowSecurityCmd(PostgreSQLStatementParser.RowSecurityCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(PostgreSQLStatementParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typeNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameList(PostgreSQLStatementParser.TypeNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PostgreSQLStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#executeParamClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteParamClause(PostgreSQLStatementParser.ExecuteParamClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBoundSpec(PostgreSQLStatementParser.PartitionBoundSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#hashPartbound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashPartbound(PostgreSQLStatementParser.HashPartboundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#hashPartboundElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashPartboundElem(PostgreSQLStatementParser.HashPartboundElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typedTableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElementList(PostgreSQLStatementParser.TypedTableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#typedTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedTableElement(PostgreSQLStatementParser.TypedTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(PostgreSQLStatementParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#withData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithData(PostgreSQLStatementParser.WithDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSpace(PostgreSQLStatementParser.TableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#onCommitOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommitOption(PostgreSQLStatementParser.OnCommitOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#withOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithOption(PostgreSQLStatementParser.WithOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableAccessMethodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAccessMethodClause(PostgreSQLStatementParser.TableAccessMethodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#accessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMethod(PostgreSQLStatementParser.AccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(PostgreSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(PostgreSQLStatementParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexIncludingParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexIncludingParams(PostgreSQLStatementParser.IndexIncludingParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#accessMethodClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMethodClause(PostgreSQLStatementParser.AccessMethodClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(PostgreSQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(PostgreSQLStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(PostgreSQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDatabaseSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification(PostgreSQLStatementParser.CreateDatabaseSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptName(PostgreSQLStatementParser.CreatedbOptNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(PostgreSQLStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndex(PostgreSQLStatementParser.AlterIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(PostgreSQLStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTableOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableOpt(PostgreSQLStatementParser.DropTableOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(PostgreSQLStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropIndexOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndexOpt(PostgreSQLStatementParser.DropIndexOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(PostgreSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#restartSeqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestartSeqs(PostgreSQLStatementParser.RestartSeqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableSpecification(PostgreSQLStatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNotExistClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNotExistClause(PostgreSQLStatementParser.TableNotExistClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(PostgreSQLStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(PostgreSQLStatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(PostgreSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraint(PostgreSQLStatementParser.ColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClause(PostgreSQLStatementParser.ConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnConstraintOption(PostgreSQLStatementParser.ColumnConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#checkOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckOption(PostgreSQLStatementParser.CheckOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defaultExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpr(PostgreSQLStatementParser.DefaultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOptions(PostgreSQLStatementParser.SequenceOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#sequenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceOption(PostgreSQLStatementParser.SequenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParameters(PostgreSQLStatementParser.IndexParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PostgreSQLStatementParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintOptionalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintOptionalParam(PostgreSQLStatementParser.ConstraintOptionalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#likeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeOption(PostgreSQLStatementParser.LikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraint(PostgreSQLStatementParser.TableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintOption(PostgreSQLStatementParser.TableConstraintOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#exclusionWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionWhereClause(PostgreSQLStatementParser.ExclusionWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintList(PostgreSQLStatementParser.ExclusionConstraintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#exclusionConstraintElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionConstraintElem(PostgreSQLStatementParser.ExclusionConstraintElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#inheritClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritClause(PostgreSQLStatementParser.InheritClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(PostgreSQLStatementParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartParams(PostgreSQLStatementParser.PartParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartElem(PostgreSQLStatementParser.PartElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcExprWindowless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExprWindowless(PostgreSQLStatementParser.FuncExprWindowlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartStrategy(PostgreSQLStatementParser.PartStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexSpecification(PostgreSQLStatementParser.CreateIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#concurrentlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrentlyClause(PostgreSQLStatementParser.ConcurrentlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexNotExistClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNotExistClause(PostgreSQLStatementParser.IndexNotExistClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#onlyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyClause(PostgreSQLStatementParser.OnlyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableExistClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExistClause(PostgreSQLStatementParser.TableExistClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#asteriskClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskClause(PostgreSQLStatementParser.AsteriskClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(PostgreSQLStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#partitionCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionCmd(PostgreSQLStatementParser.PartitionCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDefinitionClause(PostgreSQLStatementParser.AlterIndexDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexPartitionCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexPartitionCmd(PostgreSQLStatementParser.IndexPartitionCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameIndexSpecification(PostgreSQLStatementParser.RenameIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexDependsOnExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexDependsOnExtension(PostgreSQLStatementParser.AlterIndexDependsOnExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIndexSetTableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexSetTableSpace(PostgreSQLStatementParser.AlterIndexSetTableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNamesClause(PostgreSQLStatementParser.TableNamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameClause(PostgreSQLStatementParser.TableNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActions(PostgreSQLStatementParser.AlterTableActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAction(PostgreSQLStatementParser.AlterTableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(PostgreSQLStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(PostgreSQLStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#columnExistClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExistClause(PostgreSQLStatementParser.ColumnExistClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(PostgreSQLStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(PostgreSQLStatementParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnSetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnSetOption(PostgreSQLStatementParser.AlterColumnSetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attributeOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOptions(PostgreSQLStatementParser.AttributeOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#attributeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOption(PostgreSQLStatementParser.AttributeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(PostgreSQLStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableConstraintUsingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstraintUsingIndex(PostgreSQLStatementParser.TableConstraintUsingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#storageParameterWithValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterWithValue(PostgreSQLStatementParser.StorageParameterWithValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#storageParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameter(PostgreSQLStatementParser.StorageParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumnSpecification(PostgreSQLStatementParser.RenameColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameConstraint(PostgreSQLStatementParser.RenameConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#renameTableSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableSpecification(PostgreSQLStatementParser.RenameTableSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexExistClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExistClause(PostgreSQLStatementParser.IndexExistClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#indexNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexNames(PostgreSQLStatementParser.IndexNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(PostgreSQLStatementParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDatabaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseClause(PostgreSQLStatementParser.AlterDatabaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptItems(PostgreSQLStatementParser.CreatedbOptItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createdbOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbOptItem(PostgreSQLStatementParser.CreatedbOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableCmds(PostgreSQLStatementParser.AlterTableCmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTableCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableCmd(PostgreSQLStatementParser.AlterTableCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeSpec(PostgreSQLStatementParser.ConstraintAttributeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintAttributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAttributeElem(PostgreSQLStatementParser.ConstraintAttributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptions(PostgreSQLStatementParser.AlterGenericOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptionList(PostgreSQLStatementParser.AlterGenericOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterGenericOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGenericOptionElem(PostgreSQLStatementParser.AlterGenericOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropBehavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBehavior(PostgreSQLStatementParser.DropBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUsing(PostgreSQLStatementParser.AlterUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetData(PostgreSQLStatementParser.SetDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIdentityColumnOptionList(PostgreSQLStatementParser.AlterIdentityColumnOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterIdentityColumnOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIdentityColumnOption(PostgreSQLStatementParser.AlterIdentityColumnOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterColumnDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnDefault(PostgreSQLStatementParser.AlterColumnDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperator(PostgreSQLStatementParser.AlterOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClass(PostgreSQLStatementParser.AlterOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClassClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClassClauses(PostgreSQLStatementParser.AlterOperatorClassClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorFamily(PostgreSQLStatementParser.AlterOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorFamilyClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorFamilyClauses(PostgreSQLStatementParser.AlterOperatorFamilyClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#opclassItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassItemList(PostgreSQLStatementParser.OpclassItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#opclassItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassItem(PostgreSQLStatementParser.OpclassItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#opclassPurpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclassPurpose(PostgreSQLStatementParser.OpclassPurposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOperatorClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClauses(PostgreSQLStatementParser.AlterOperatorClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefList(PostgreSQLStatementParser.OperatorDefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefElem(PostgreSQLStatementParser.OperatorDefElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operatorDefArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefArg(PostgreSQLStatementParser.OperatorDefArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorWithArgtypes(PostgreSQLStatementParser.OperatorWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAggregate(PostgreSQLStatementParser.AlterAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggregateSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateSignature(PostgreSQLStatementParser.AggregateSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggrArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArgs(PostgreSQLStatementParser.AggrArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggrArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArgsList(PostgreSQLStatementParser.AggrArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggrArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggrArg(PostgreSQLStatementParser.AggrArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterAggregateDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAggregateDefinitionClause(PostgreSQLStatementParser.AlterAggregateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCollation(PostgreSQLStatementParser.AlterCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterCollationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCollationClause(PostgreSQLStatementParser.AlterCollationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConversion(PostgreSQLStatementParser.AlterConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterConversionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConversionClause(PostgreSQLStatementParser.AlterConversionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivileges(PostgreSQLStatementParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defACLAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLAction(PostgreSQLStatementParser.DefACLActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#grantGrantOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantGrantOption(PostgreSQLStatementParser.GrantGrantOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#granteeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGranteeList(PostgreSQLStatementParser.GranteeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(PostgreSQLStatementParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defaclPrivilegeTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaclPrivilegeTarget(PostgreSQLStatementParser.DefaclPrivilegeTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(PostgreSQLStatementParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeList(PostgreSQLStatementParser.PrivilegeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(PostgreSQLStatementParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defACLOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOptionList(PostgreSQLStatementParser.DefACLOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#defACLOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefACLOption(PostgreSQLStatementParser.DefACLOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#schemaNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNameList(PostgreSQLStatementParser.SchemaNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomain(PostgreSQLStatementParser.AlterDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterDomainClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainClause(PostgreSQLStatementParser.AlterDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(PostgreSQLStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTrigger(PostgreSQLStatementParser.AlterEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterEventTriggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTriggerClause(PostgreSQLStatementParser.AlterEventTriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tiggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiggerName(PostgreSQLStatementParser.TiggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtension(PostgreSQLStatementParser.AlterExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionClauses(PostgreSQLStatementParser.AlterExtensionClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithArgtypes(PostgreSQLStatementParser.FunctionWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(PostgreSQLStatementParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWithArgtypes(PostgreSQLStatementParser.AggregateWithArgtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionOptList(PostgreSQLStatementParser.AlterExtensionOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterExtensionOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionOptItem(PostgreSQLStatementParser.AlterExtensionOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapper(PostgreSQLStatementParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignDataWrapperClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapperClauses(PostgreSQLStatementParser.AlterForeignDataWrapperClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fdwOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdwOptions(PostgreSQLStatementParser.FdwOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#fdwOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdwOption(PostgreSQLStatementParser.FdwOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#handlerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerName(PostgreSQLStatementParser.HandlerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroup(PostgreSQLStatementParser.AlterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterGroupClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupClauses(PostgreSQLStatementParser.AlterGroupClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLanguage(PostgreSQLStatementParser.AlterLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterLargeObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLargeObject(PostgreSQLStatementParser.AlterLargeObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaterializedView(PostgreSQLStatementParser.AlterMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterMaterializedViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMaterializedViewClauses(PostgreSQLStatementParser.AlterMaterializedViewClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(PostgreSQLStatementParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cursorOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOptions(PostgreSQLStatementParser.CursorOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cursorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOption(PostgreSQLStatementParser.CursorOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMaterializedView(PostgreSQLStatementParser.CreateMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createMvTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMvTarget(PostgreSQLStatementParser.CreateMvTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#refreshMatViewStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMatViewStmt(PostgreSQLStatementParser.RefreshMatViewStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPolicy(PostgreSQLStatementParser.AlterPolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterPolicyClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPolicyClauses(PostgreSQLStatementParser.AlterPolicyClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(PostgreSQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterProcedureClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedureClauses(PostgreSQLStatementParser.AlterProcedureClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterfuncOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfuncOptList(PostgreSQLStatementParser.AlterfuncOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(PostgreSQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterFunctionClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionClauses(PostgreSQLStatementParser.AlterFunctionClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPublication(PostgreSQLStatementParser.AlterPublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRoutine(PostgreSQLStatementParser.AlterRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRule(PostgreSQLStatementParser.AlterRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequence(PostgreSQLStatementParser.AlterSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterSequenceClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequenceClauses(PostgreSQLStatementParser.AlterSequenceClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(PostgreSQLStatementParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#foreignServerVersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignServerVersion(PostgreSQLStatementParser.ForeignServerVersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatistics(PostgreSQLStatementParser.AlterStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSubscription(PostgreSQLStatementParser.AlterSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#publicationNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationNameList(PostgreSQLStatementParser.PublicationNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#publicationNameItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationNameItem(PostgreSQLStatementParser.PublicationNameItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterSystem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSystem(PostgreSQLStatementParser.AlterSystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(PostgreSQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchConfiguration(PostgreSQLStatementParser.AlterTextSearchConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchConfigurationClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchConfigurationClauses(PostgreSQLStatementParser.AlterTextSearchConfigurationClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#anyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyNameList(PostgreSQLStatementParser.AnyNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchDictionary(PostgreSQLStatementParser.AlterTextSearchDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchParser(PostgreSQLStatementParser.AlterTextSearchParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTextSearchTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTextSearchTemplate(PostgreSQLStatementParser.AlterTextSearchTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrigger(PostgreSQLStatementParser.AlterTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterType(PostgreSQLStatementParser.AlterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeClauses(PostgreSQLStatementParser.AlterTypeClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeCmds(PostgreSQLStatementParser.AlterTypeCmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterTypeCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeCmd(PostgreSQLStatementParser.AlterTypeCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMapping(PostgreSQLStatementParser.AlterUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#authIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthIdent(PostgreSQLStatementParser.AuthIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(PostgreSQLStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterViewClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewClauses(PostgreSQLStatementParser.AlterViewClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(PostgreSQLStatementParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster(PostgreSQLStatementParser.ClusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#clusterIndexSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterIndexSpecification(PostgreSQLStatementParser.ClusterIndexSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PostgreSQLStatementParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commentClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentClauses(PostgreSQLStatementParser.CommentClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeNameOnAnyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeNameOnAnyName(PostgreSQLStatementParser.ObjectTypeNameOnAnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeName(PostgreSQLStatementParser.ObjectTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTypeName(PostgreSQLStatementParser.DropTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#objectTypeAnyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeAnyName(PostgreSQLStatementParser.ObjectTypeAnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commentText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentText(PostgreSQLStatementParser.CommentTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createAccessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAccessMethod(PostgreSQLStatementParser.CreateAccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAggregate(PostgreSQLStatementParser.CreateAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrDefinition(PostgreSQLStatementParser.OldAggrDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrList(PostgreSQLStatementParser.OldAggrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#oldAggrElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldAggrElem(PostgreSQLStatementParser.OldAggrElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCast(PostgreSQLStatementParser.CreateCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#castContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastContext(PostgreSQLStatementParser.CastContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCollation(PostgreSQLStatementParser.CreateCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversion(PostgreSQLStatementParser.CreateConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomain(PostgreSQLStatementParser.CreateDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEventTrigger(PostgreSQLStatementParser.CreateEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerWhenList(PostgreSQLStatementParser.EventTriggerWhenListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerWhenItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerWhenItem(PostgreSQLStatementParser.EventTriggerWhenItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#eventTriggerValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventTriggerValueList(PostgreSQLStatementParser.EventTriggerValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtension(PostgreSQLStatementParser.CreateExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionOptList(PostgreSQLStatementParser.CreateExtensionOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createExtensionOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionOptItem(PostgreSQLStatementParser.CreateExtensionOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignDataWrapper(PostgreSQLStatementParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTable(PostgreSQLStatementParser.CreateForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createForeignTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableClauses(PostgreSQLStatementParser.CreateForeignTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(PostgreSQLStatementParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(PostgreSQLStatementParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeClause(PostgreSQLStatementParser.TableLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOptionList(PostgreSQLStatementParser.TableLikeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableLikeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLikeOption(PostgreSQLStatementParser.TableLikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(PostgreSQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncColumnList(PostgreSQLStatementParser.TableFuncColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tableFuncColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFuncColumn(PostgreSQLStatementParser.TableFuncColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefuncOptList(PostgreSQLStatementParser.CreatefuncOptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createfuncOptItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefuncOptItem(PostgreSQLStatementParser.CreatefuncOptItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transformTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformTypeList(PostgreSQLStatementParser.TransformTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAs(PostgreSQLStatementParser.FuncAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturn(PostgreSQLStatementParser.FuncReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsWithDefaults(PostgreSQLStatementParser.FuncArgsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgsWithDefaultsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgsWithDefaultsList(PostgreSQLStatementParser.FuncArgsWithDefaultsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#funcArgWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgWithDefault(PostgreSQLStatementParser.FuncArgWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLanguage(PostgreSQLStatementParser.CreateLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transformElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformElementList(PostgreSQLStatementParser.TransformElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#validatorClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidatorClause(PostgreSQLStatementParser.ValidatorClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePolicy(PostgreSQLStatementParser.CreatePolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(PostgreSQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePublication(PostgreSQLStatementParser.CreatePublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#publicationForTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicationForTables(PostgreSQLStatementParser.PublicationForTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRule(PostgreSQLStatementParser.CreateRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionList(PostgreSQLStatementParser.RuleActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionStmt(PostgreSQLStatementParser.RuleActionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#ruleActionMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleActionMulti(PostgreSQLStatementParser.RuleActionMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(PostgreSQLStatementParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(PostgreSQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvents(PostgreSQLStatementParser.TriggerEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerOneEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOneEvent(PostgreSQLStatementParser.TriggerOneEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerActionTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerActionTime(PostgreSQLStatementParser.TriggerActionTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArgs(PostgreSQLStatementParser.TriggerFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerFuncArg(PostgreSQLStatementParser.TriggerFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWhen(PostgreSQLStatementParser.TriggerWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerForSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerForSpec(PostgreSQLStatementParser.TriggerForSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerReferencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerReferencing(PostgreSQLStatementParser.TriggerReferencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerTransitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTransitions(PostgreSQLStatementParser.TriggerTransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#triggerTransition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTransition(PostgreSQLStatementParser.TriggerTransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transitionRelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionRelName(PostgreSQLStatementParser.TransitionRelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transitionRowOrTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionRowOrTable(PostgreSQLStatementParser.TransitionRowOrTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#transitionOldOrNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionOldOrNew(PostgreSQLStatementParser.TransitionOldOrNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequence(PostgreSQLStatementParser.CreateSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#tempOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempOption(PostgreSQLStatementParser.TempOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(PostgreSQLStatementParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatistics(PostgreSQLStatementParser.CreateStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSubscription(PostgreSQLStatementParser.CreateSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespace(PostgreSQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTextSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTextSearch(PostgreSQLStatementParser.CreateTextSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTransform(PostgreSQLStatementParser.CreateTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateType(PostgreSQLStatementParser.CreateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createTypeClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeClauses(PostgreSQLStatementParser.CreateTypeClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#enumValList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValList(PostgreSQLStatementParser.EnumValListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMapping(PostgreSQLStatementParser.CreateUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#discard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscard(PostgreSQLStatementParser.DiscardContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropAccessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAccessMethod(PostgreSQLStatementParser.DropAccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropAggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropAggregate(PostgreSQLStatementParser.DropAggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#aggregateWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWithArgtypesList(PostgreSQLStatementParser.AggregateWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCast(PostgreSQLStatementParser.DropCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCollation(PostgreSQLStatementParser.DropCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConversion(PostgreSQLStatementParser.DropConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDomain(PostgreSQLStatementParser.DropDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEventTrigger(PostgreSQLStatementParser.DropEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropExtension(PostgreSQLStatementParser.DropExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignDataWrapper(PostgreSQLStatementParser.DropForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropForeignTable(PostgreSQLStatementParser.DropForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(PostgreSQLStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#functionWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithArgtypesList(PostgreSQLStatementParser.FunctionWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropLanguage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLanguage(PostgreSQLStatementParser.DropLanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMaterializedView(PostgreSQLStatementParser.DropMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperator(PostgreSQLStatementParser.DropOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#operatorWithArgtypesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorWithArgtypesList(PostgreSQLStatementParser.OperatorWithArgtypesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorClass(PostgreSQLStatementParser.DropOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorFamily(PostgreSQLStatementParser.DropOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropOwned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwned(PostgreSQLStatementParser.DropOwnedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropPolicy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPolicy(PostgreSQLStatementParser.DropPolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(PostgreSQLStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropPublication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPublication(PostgreSQLStatementParser.DropPublicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRoutine(PostgreSQLStatementParser.DropRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRule(PostgreSQLStatementParser.DropRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSequence(PostgreSQLStatementParser.DropSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(PostgreSQLStatementParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatistics(PostgreSQLStatementParser.DropStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropSubscription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSubscription(PostgreSQLStatementParser.DropSubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(PostgreSQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTextSearch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTextSearch(PostgreSQLStatementParser.DropTextSearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTransform(PostgreSQLStatementParser.DropTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(PostgreSQLStatementParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropType(PostgreSQLStatementParser.DropTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMapping(PostgreSQLStatementParser.DropUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(PostgreSQLStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#importForeignSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportForeignSchema(PostgreSQLStatementParser.ImportForeignSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#importQualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportQualification(PostgreSQLStatementParser.ImportQualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#importQualificationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportQualificationType(PostgreSQLStatementParser.ImportQualificationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#listen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListen(PostgreSQLStatementParser.ListenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(PostgreSQLStatementParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#prepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare(PostgreSQLStatementParser.PrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#prepTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepTypeClause(PostgreSQLStatementParser.PrepTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#refreshMaterializedView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshMaterializedView(PostgreSQLStatementParser.RefreshMaterializedViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReIndex(PostgreSQLStatementParser.ReIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reIndexClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReIndexClauses(PostgreSQLStatementParser.ReIndexClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexOptionList(PostgreSQLStatementParser.ReindexOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reindexOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexOptionElem(PostgreSQLStatementParser.ReindexOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetMultitable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexTargetMultitable(PostgreSQLStatementParser.ReindexTargetMultitableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reindexTargetType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexTargetType(PostgreSQLStatementParser.ReindexTargetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTable(PostgreSQLStatementParser.AlterForeignTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterForeignTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignTableClauses(PostgreSQLStatementParser.AlterForeignTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperator(PostgreSQLStatementParser.CreateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createOperatorClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorClass(PostgreSQLStatementParser.CreateOperatorClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createOperatorFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorFamily(PostgreSQLStatementParser.CreateOperatorFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#securityLabelStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabelStmt(PostgreSQLStatementParser.SecurityLabelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#securityLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabel(PostgreSQLStatementParser.SecurityLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#securityLabelClausces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabelClausces(PostgreSQLStatementParser.SecurityLabelClauscesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#unlisten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlisten(PostgreSQLStatementParser.UnlistenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(PostgreSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#beginTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginTransaction(PostgreSQLStatementParser.BeginTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(PostgreSQLStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(PostgreSQLStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#abort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort(PostgreSQLStatementParser.AbortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(PostgreSQLStatementParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(PostgreSQLStatementParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(PostgreSQLStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#releaseSavepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseSavepoint(PostgreSQLStatementParser.ReleaseSavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rollbackToSavepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackToSavepoint(PostgreSQLStatementParser.RollbackToSavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#prepareTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareTransaction(PostgreSQLStatementParser.PrepareTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#commitPrepared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitPrepared(PostgreSQLStatementParser.CommitPreparedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#rollbackPrepared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackPrepared(PostgreSQLStatementParser.RollbackPreparedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(PostgreSQLStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(PostgreSQLStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(PostgreSQLStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#roleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleClause(PostgreSQLStatementParser.RoleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#optionForClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionForClause(PostgreSQLStatementParser.OptionForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeTypes(PostgreSQLStatementParser.PrivilegeTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(PostgreSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(PostgreSQLStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeLevel(PostgreSQLStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(PostgreSQLStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#numericOnlyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericOnlyList(PostgreSQLStatementParser.NumericOnlyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(PostgreSQLStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOptRoleElem(PostgreSQLStatementParser.CreateOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleElem(PostgreSQLStatementParser.AlterOptRoleElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(PostgreSQLStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUser(PostgreSQLStatementParser.AlterUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterUserClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserClauses(PostgreSQLStatementParser.AlterUserClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterOptRoleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOptRoleList(PostgreSQLStatementParser.AlterOptRoleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(PostgreSQLStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRole(PostgreSQLStatementParser.DropRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRole(PostgreSQLStatementParser.AlterRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#alterSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSchema(PostgreSQLStatementParser.AlterSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroup(PostgreSQLStatementParser.CreateGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchema(PostgreSQLStatementParser.CreateSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#createSchemaClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaClauses(PostgreSQLStatementParser.CreateSchemaClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#schemaEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaEltList(PostgreSQLStatementParser.SchemaEltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#schemaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaStmt(PostgreSQLStatementParser.SchemaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropDroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDroup(PostgreSQLStatementParser.DropDroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#dropSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropSchema(PostgreSQLStatementParser.DropSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#reassignOwned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignOwned(PostgreSQLStatementParser.ReassignOwnedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(PostgreSQLStatementParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PostgreSQLStatementParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#runtimeScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntimeScope(PostgreSQLStatementParser.RuntimeScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#timeZoneClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneClause(PostgreSQLStatementParser.TimeZoneClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#configurationParameterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationParameterClause(PostgreSQLStatementParser.ConfigurationParameterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#resetParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetParameter(PostgreSQLStatementParser.ResetParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(PostgreSQLStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explainableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStmt(PostgreSQLStatementParser.ExplainableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionList(PostgreSQLStatementParser.ExplainOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionElem(PostgreSQLStatementParser.ExplainOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionArg(PostgreSQLStatementParser.ExplainOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#explainOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOptionName(PostgreSQLStatementParser.ExplainOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#analyzeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeKeyword(PostgreSQLStatementParser.AnalyzeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#setConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConstraints(PostgreSQLStatementParser.SetConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetMode(PostgreSQLStatementParser.ConstraintsSetModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#constraintsSetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsSetList(PostgreSQLStatementParser.ConstraintsSetListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#analyze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(PostgreSQLStatementParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumRelationList(PostgreSQLStatementParser.VacuumRelationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacuumRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumRelation(PostgreSQLStatementParser.VacuumRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionList(PostgreSQLStatementParser.VacAnalyzeOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionElem(PostgreSQLStatementParser.VacAnalyzeOptionElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionArg(PostgreSQLStatementParser.VacAnalyzeOptionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacAnalyzeOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacAnalyzeOptionName(PostgreSQLStatementParser.VacAnalyzeOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(PostgreSQLStatementParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#vacuum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum(PostgreSQLStatementParser.VacuumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(PostgreSQLStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLStatementParser#callClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallClauses(PostgreSQLStatementParser.CallClausesContext ctx);
}