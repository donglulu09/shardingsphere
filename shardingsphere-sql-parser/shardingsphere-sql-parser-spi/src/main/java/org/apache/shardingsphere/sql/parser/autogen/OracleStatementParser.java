// Generated from org/apache/shardingsphere/sql/parser/autogen/OracleStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OracleStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND_=2, OR_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, AMPERSAND_=7, 
		SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, MOD_=11, COLON_=12, 
		PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, DOT_=18, 
		DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, GTE_=25, 
		LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, LBT_=33, 
		RBT_=34, COMMA_=35, DQ_=36, SQ_=37, BQ_=38, QUESTION_=39, AT_=40, SEMI_=41, 
		BLOCK_COMMENT=42, INLINE_COMMENT=43, WS=44, SELECT=45, INSERT=46, UPDATE=47, 
		DELETE=48, CREATE=49, ALTER=50, DROP=51, TRUNCATE=52, SCHEMA=53, GRANT=54, 
		REVOKE=55, ADD=56, SET=57, TABLE=58, COLUMN=59, INDEX=60, CONSTRAINT=61, 
		PRIMARY=62, UNIQUE=63, FOREIGN=64, KEY=65, POSITION=66, PRECISION=67, 
		FUNCTION=68, TRIGGER=69, PROCEDURE=70, VIEW=71, INTO=72, VALUES=73, WITH=74, 
		UNION=75, DISTINCT=76, CASE=77, WHEN=78, CAST=79, TRIM=80, SUBSTRING=81, 
		FROM=82, NATURAL=83, JOIN=84, FULL=85, INNER=86, OUTER=87, LEFT=88, RIGHT=89, 
		CROSS=90, USING=91, WHERE=92, AS=93, ON=94, IF=95, ELSE=96, THEN=97, FOR=98, 
		TO=99, AND=100, OR=101, IS=102, NOT=103, NULL=104, TRUE=105, FALSE=106, 
		EXISTS=107, BETWEEN=108, IN=109, ALL=110, ANY=111, LIKE=112, ORDER=113, 
		GROUP=114, BY=115, ASC=116, DESC=117, HAVING=118, LIMIT=119, OFFSET=120, 
		BEGIN=121, COMMIT=122, ROLLBACK=123, SAVEPOINT=124, BOOLEAN=125, DOUBLE=126, 
		CHAR=127, CHARACTER=128, ARRAY=129, INTERVAL=130, DATE=131, TIME=132, 
		TIMESTAMP=133, LOCALTIME=134, LOCALTIMESTAMP=135, YEAR=136, QUARTER=137, 
		MONTH=138, WEEK=139, DAY=140, HOUR=141, MINUTE=142, SECOND=143, MICROSECOND=144, 
		MAX=145, MIN=146, SUM=147, COUNT=148, AVG=149, DEFAULT=150, CURRENT=151, 
		ENABLE=152, DISABLE=153, CALL=154, INSTANCE=155, PRESERVE=156, DO=157, 
		DEFINER=158, CURRENT_USER=159, SQL=160, CASCADED=161, LOCAL=162, CLOSE=163, 
		OPEN=164, NEXT=165, NAME=166, COLLATION=167, NAMES=168, INTEGER=169, REAL=170, 
		DECIMAL=171, TYPE=172, INT=173, SMALLINT=174, NUMERIC=175, FLOAT=176, 
		FOR_GENERATOR=177, BINARY=178, ESCAPE=179, MOD=180, XOR=181, ROW=182, 
		ROWS=183, UNKNOWN=184, ALWAYS=185, CASCADE=186, CHECK=187, GENERATED=188, 
		PRIVILEGES=189, READ=190, WRITE=191, REFERENCES=192, START=193, TRANSACTION=194, 
		USER=195, ROLE=196, VISIBLE=197, INVISIBLE=198, EXECUTE=199, USE=200, 
		DEBUG=201, UNDER=202, FLASHBACK=203, ARCHIVE=204, REFRESH=205, QUERY=206, 
		REWRITE=207, KEEP=208, SEQUENCE=209, INHERIT=210, TRANSLATE=211, MERGE=212, 
		AT=213, BITMAP=214, CACHE=215, NOCACHE=216, CHECKPOINT=217, CONNECT=218, 
		CONSTRAINTS=219, CYCLE=220, NOCYCLE=221, DBTIMEZONE=222, ENCRYPT=223, 
		DECRYPT=224, DEFERRABLE=225, DEFERRED=226, DIRECTORY=227, EDITION=228, 
		ELEMENT=229, END=230, EXCEPTIONS=231, FORCE=232, GLOBAL=233, IDENTIFIED=234, 
		IDENTITY=235, IMMEDIATE=236, INCREMENT=237, INITIALLY=238, INVALIDATE=239, 
		JAVA=240, LEVELS=241, MAXVALUE=242, MINVALUE=243, NOMAXVALUE=244, NOMINVALUE=245, 
		MINING=246, MODEL=247, MODIFY=248, NATIONAL=249, NEW=250, NOORDER=251, 
		NORELY=252, OF=253, ONLY=254, PRIOR=255, PROFILE=256, REF=257, REKEY=258, 
		RELY=259, RENAME=260, REPLACE=261, RESOURCE=262, ROWID=263, SALT=264, 
		SCOPE=265, SORT=266, SOURCE=267, SUBSTITUTABLE=268, TABLESPACE=269, TEMPORARY=270, 
		TRANSLATION=271, TREAT=272, NO=273, UNUSED=274, VALIDATE=275, NOVALIDATE=276, 
		VALUE=277, VARYING=278, VIRTUAL=279, ZONE=280, PUBLIC=281, SESSION=282, 
		COMMENT=283, LOCK=284, ADVISOR=285, ADMINISTER=286, TUNING=287, MANAGE=288, 
		MANAGEMENT=289, OBJECT=290, CLUSTER=291, CONTEXT=292, EXEMPT=293, REDACTION=294, 
		POLICY=295, DATABASE=296, SYSTEM=297, AUDIT=298, LINK=299, ANALYZE=300, 
		DICTIONARY=301, DIMENSION=302, INDEXTYPE=303, EXTERNAL=304, JOB=305, CLASS=306, 
		PROGRAM=307, SCHEDULER=308, LIBRARY=309, LOGMINING=310, MATERIALIZED=311, 
		CUBE=312, MEASURE=313, FOLDER=314, BUILD=315, PROCESS=316, OPERATOR=317, 
		OUTLINE=318, PLUGGABLE=319, CONTAINER=320, SEGMENT=321, RESTRICTED=322, 
		COST=323, SYNONYM=324, BACKUP=325, UNLIMITED=326, BECOME=327, CHANGE=328, 
		NOTIFICATION=329, ACCESS=330, PRIVILEGE=331, PURGE=332, RESUMABLE=333, 
		SYSGUID=334, SYSBACKUP=335, SYSDBA=336, SYSDG=337, SYSKM=338, SYSOPER=339, 
		DBA_RECYCLEBIN=340, FIRST=341, NCHAR=342, RAW=343, VARCHAR=344, VARCHAR2=345, 
		NVARCHAR2=346, LONG=347, BLOB=348, CLOB=349, NCLOB=350, BINARY_FLOAT=351, 
		BINARY_DOUBLE=352, PLS_INTEGER=353, BINARY_INTEGER=354, NUMBER=355, NATURALN=356, 
		POSITIVE=357, POSITIVEN=358, SIGNTYPE=359, SIMPLE_INTEGER=360, BFILE=361, 
		MLSLABEL=362, UROWID=363, JSON=364, DEC=365, IDENTIFIER_=366, STRING_=367, 
		NUMBER_=368, HEX_DIGIT_=369, BIT_NUM_=370;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertSingleTable = 2, RULE_insertMultiTable = 3, 
		RULE_multiTableElement = 4, RULE_conditionalInsertClause = 5, RULE_conditionalInsertWhenPart = 6, 
		RULE_conditionalInsertElsePart = 7, RULE_insertIntoClause = 8, RULE_insertValuesClause = 9, 
		RULE_update = 10, RULE_updateSpecification = 11, RULE_assignment = 12, 
		RULE_setAssignmentsClause = 13, RULE_assignmentValues = 14, RULE_assignmentValue = 15, 
		RULE_delete = 16, RULE_deleteSpecification = 17, RULE_singleTableClause = 18, 
		RULE_multipleTablesClause = 19, RULE_multipleTableNames = 20, RULE_select = 21, 
		RULE_unionClause = 22, RULE_selectClause = 23, RULE_duplicateSpecification = 24, 
		RULE_projections = 25, RULE_projection = 26, RULE_alias = 27, RULE_unqualifiedShorthand = 28, 
		RULE_qualifiedShorthand = 29, RULE_fromClause = 30, RULE_tableReferences = 31, 
		RULE_tableReference = 32, RULE_tableFactor = 33, RULE_joinedTable = 34, 
		RULE_joinSpecification = 35, RULE_whereClause = 36, RULE_groupByClause = 37, 
		RULE_havingClause = 38, RULE_subquery = 39, RULE_lockClause = 40, RULE_parameterMarker = 41, 
		RULE_literals = 42, RULE_stringLiterals = 43, RULE_numberLiterals = 44, 
		RULE_dateTimeLiterals = 45, RULE_hexadecimalLiterals = 46, RULE_bitValueLiterals = 47, 
		RULE_booleanLiterals = 48, RULE_nullValueLiterals = 49, RULE_identifier = 50, 
		RULE_unreservedWord = 51, RULE_schemaName = 52, RULE_tableName = 53, RULE_columnName = 54, 
		RULE_owner = 55, RULE_name = 56, RULE_columnNames = 57, RULE_tableNames = 58, 
		RULE_indexName = 59, RULE_oracleId = 60, RULE_collationName = 61, RULE_dataTypeLength = 62, 
		RULE_primaryKey = 63, RULE_exprs = 64, RULE_exprList = 65, RULE_expr = 66, 
		RULE_logicalOperator = 67, RULE_notOperator = 68, RULE_booleanPrimary = 69, 
		RULE_comparisonOperator = 70, RULE_predicate = 71, RULE_bitExpr = 72, 
		RULE_simpleExpr = 73, RULE_functionCall = 74, RULE_aggregationFunction = 75, 
		RULE_aggregationFunctionName = 76, RULE_distinct = 77, RULE_specialFunction = 78, 
		RULE_castFunction = 79, RULE_charFunction = 80, RULE_regularFunction = 81, 
		RULE_regularFunctionName = 82, RULE_caseExpression = 83, RULE_caseWhen = 84, 
		RULE_caseElse = 85, RULE_orderByClause = 86, RULE_orderByItem = 87, RULE_attributeName = 88, 
		RULE_indexTypeName = 89, RULE_simpleExprs = 90, RULE_lobItem = 91, RULE_lobItems = 92, 
		RULE_lobItemList = 93, RULE_dataType = 94, RULE_specialDatatype = 95, 
		RULE_dataTypeName = 96, RULE_datetimeTypeSuffix = 97, RULE_treatFunction = 98, 
		RULE_privateExprOfDb = 99, RULE_caseExpr = 100, RULE_simpleCaseExpr = 101, 
		RULE_searchedCaseExpr = 102, RULE_elseClause = 103, RULE_intervalExpression = 104, 
		RULE_objectAccessExpression = 105, RULE_constructorExpr = 106, RULE_ignoredIdentifier = 107, 
		RULE_ignoredIdentifiers = 108, RULE_matchNone = 109, RULE_createTable = 110, 
		RULE_createIndex = 111, RULE_alterTable = 112, RULE_alterIndex = 113, 
		RULE_dropTable = 114, RULE_dropIndex = 115, RULE_truncateTable = 116, 
		RULE_createTableSpecification = 117, RULE_tablespaceClauseWithParen = 118, 
		RULE_tablespaceClause = 119, RULE_domainIndexClause = 120, RULE_createDefinitionClause = 121, 
		RULE_relationalProperties = 122, RULE_relationalProperty = 123, RULE_columnDefinition = 124, 
		RULE_visibleClause = 125, RULE_defaultNullClause = 126, RULE_identityClause = 127, 
		RULE_identifyOptions = 128, RULE_identityOption = 129, RULE_encryptionSpecification = 130, 
		RULE_inlineConstraint = 131, RULE_referencesClause = 132, RULE_constraintState = 133, 
		RULE_notDeferrable = 134, RULE_initiallyClause = 135, RULE_exceptionsClause = 136, 
		RULE_usingIndexClause = 137, RULE_createIndexClause = 138, RULE_inlineRefConstraint = 139, 
		RULE_virtualColumnDefinition = 140, RULE_outOfLineConstraint = 141, RULE_outOfLineRefConstraint = 142, 
		RULE_createIndexSpecification = 143, RULE_tableIndexClause = 144, RULE_indexExpressions = 145, 
		RULE_indexExpression = 146, RULE_bitmapJoinIndexClause = 147, RULE_columnSortsClause_ = 148, 
		RULE_columnSortClause_ = 149, RULE_createIndexDefinitionClause = 150, 
		RULE_tableAlias = 151, RULE_alterDefinitionClause = 152, RULE_alterTableProperties = 153, 
		RULE_renameTableSpecification = 154, RULE_columnClauses = 155, RULE_operateColumnClause = 156, 
		RULE_addColumnSpecification = 157, RULE_columnOrVirtualDefinitions = 158, 
		RULE_columnOrVirtualDefinition = 159, RULE_columnProperties = 160, RULE_columnProperty = 161, 
		RULE_objectTypeColProperties = 162, RULE_substitutableColumnClause = 163, 
		RULE_modifyColumnSpecification = 164, RULE_modifyColProperties = 165, 
		RULE_modifyColSubstitutable = 166, RULE_dropColumnClause = 167, RULE_dropColumnSpecification = 168, 
		RULE_columnOrColumnList = 169, RULE_cascadeOrInvalidate = 170, RULE_checkpointNumber = 171, 
		RULE_renameColumnClause = 172, RULE_constraintClauses = 173, RULE_addConstraintSpecification = 174, 
		RULE_modifyConstraintClause = 175, RULE_constraintWithName = 176, RULE_constraintOption = 177, 
		RULE_constraintPrimaryOrUnique = 178, RULE_renameConstraintClause = 179, 
		RULE_dropConstraintClause = 180, RULE_alterExternalTable = 181, RULE_objectProperties = 182, 
		RULE_objectProperty = 183, RULE_renameIndexClause = 184, RULE_setTransaction = 185, 
		RULE_commit = 186, RULE_rollback = 187, RULE_savepoint = 188, RULE_grant = 189, 
		RULE_revoke = 190, RULE_objectPrivilegeClause = 191, RULE_systemPrivilegeClause = 192, 
		RULE_roleClause = 193, RULE_objectPrivileges = 194, RULE_objectPrivilegeType = 195, 
		RULE_onObjectClause = 196, RULE_systemPrivilege = 197, RULE_systemPrivilegeOperation = 198, 
		RULE_advisorFrameworkSystemPrivilege = 199, RULE_clustersSystemPrivilege = 200, 
		RULE_contextsSystemPrivilege = 201, RULE_dataRedactionSystemPrivilege = 202, 
		RULE_databaseSystemPrivilege = 203, RULE_databaseLinksSystemPrivilege = 204, 
		RULE_debuggingSystemPrivilege = 205, RULE_dictionariesSystemPrivilege = 206, 
		RULE_dimensionsSystemPrivilege = 207, RULE_directoriesSystemPrivilege = 208, 
		RULE_editionsSystemPrivilege = 209, RULE_flashbackDataArchivesPrivilege = 210, 
		RULE_indexesSystemPrivilege = 211, RULE_indexTypesSystemPrivilege = 212, 
		RULE_jobSchedulerObjectsSystemPrivilege = 213, RULE_keyManagementFrameworkSystemPrivilege = 214, 
		RULE_librariesFrameworkSystemPrivilege = 215, RULE_logminerFrameworkSystemPrivilege = 216, 
		RULE_materizlizedViewsSystemPrivilege = 217, RULE_miningModelsSystemPrivilege = 218, 
		RULE_olapCubesSystemPrivilege = 219, RULE_olapCubeMeasureFoldersSystemPrivilege = 220, 
		RULE_olapCubeDiminsionsSystemPrivilege = 221, RULE_olapCubeBuildProcessesSystemPrivilege = 222, 
		RULE_operatorsSystemPrivilege = 223, RULE_outlinesSystemPrivilege = 224, 
		RULE_planManagementSystemPrivilege = 225, RULE_pluggableDatabasesSystemPrivilege = 226, 
		RULE_proceduresSystemPrivilege = 227, RULE_profilesSystemPrivilege = 228, 
		RULE_rolesSystemPrivilege = 229, RULE_rollbackSegmentsSystemPrivilege = 230, 
		RULE_sequencesSystemPrivilege = 231, RULE_sessionsSystemPrivilege = 232, 
		RULE_sqlTranslationProfilesSystemPrivilege = 233, RULE_synonymsSystemPrivilege = 234, 
		RULE_tablesSystemPrivilege = 235, RULE_tablespacesSystemPrivilege = 236, 
		RULE_triggersSystemPrivilege = 237, RULE_typesSystemPrivilege = 238, RULE_usersSystemPrivilege = 239, 
		RULE_viewsSystemPrivilege = 240, RULE_miscellaneousSystemPrivilege = 241, 
		RULE_createUser = 242, RULE_dropUser = 243, RULE_alterUser = 244, RULE_createRole = 245, 
		RULE_dropRole = 246, RULE_alterRole = 247, RULE_call = 248;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertSingleTable", "insertMultiTable", "multiTableElement", 
			"conditionalInsertClause", "conditionalInsertWhenPart", "conditionalInsertElsePart", 
			"insertIntoClause", "insertValuesClause", "update", "updateSpecification", 
			"assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
			"delete", "deleteSpecification", "singleTableClause", "multipleTablesClause", 
			"multipleTableNames", "select", "unionClause", "selectClause", "duplicateSpecification", 
			"projections", "projection", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
			"fromClause", "tableReferences", "tableReference", "tableFactor", "joinedTable", 
			"joinSpecification", "whereClause", "groupByClause", "havingClause", 
			"subquery", "lockClause", "parameterMarker", "literals", "stringLiterals", 
			"numberLiterals", "dateTimeLiterals", "hexadecimalLiterals", "bitValueLiterals", 
			"booleanLiterals", "nullValueLiterals", "identifier", "unreservedWord", 
			"schemaName", "tableName", "columnName", "owner", "name", "columnNames", 
			"tableNames", "indexName", "oracleId", "collationName", "dataTypeLength", 
			"primaryKey", "exprs", "exprList", "expr", "logicalOperator", "notOperator", 
			"booleanPrimary", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
			"functionCall", "aggregationFunction", "aggregationFunctionName", "distinct", 
			"specialFunction", "castFunction", "charFunction", "regularFunction", 
			"regularFunctionName", "caseExpression", "caseWhen", "caseElse", "orderByClause", 
			"orderByItem", "attributeName", "indexTypeName", "simpleExprs", "lobItem", 
			"lobItems", "lobItemList", "dataType", "specialDatatype", "dataTypeName", 
			"datetimeTypeSuffix", "treatFunction", "privateExprOfDb", "caseExpr", 
			"simpleCaseExpr", "searchedCaseExpr", "elseClause", "intervalExpression", 
			"objectAccessExpression", "constructorExpr", "ignoredIdentifier", "ignoredIdentifiers", 
			"matchNone", "createTable", "createIndex", "alterTable", "alterIndex", 
			"dropTable", "dropIndex", "truncateTable", "createTableSpecification", 
			"tablespaceClauseWithParen", "tablespaceClause", "domainIndexClause", 
			"createDefinitionClause", "relationalProperties", "relationalProperty", 
			"columnDefinition", "visibleClause", "defaultNullClause", "identityClause", 
			"identifyOptions", "identityOption", "encryptionSpecification", "inlineConstraint", 
			"referencesClause", "constraintState", "notDeferrable", "initiallyClause", 
			"exceptionsClause", "usingIndexClause", "createIndexClause", "inlineRefConstraint", 
			"virtualColumnDefinition", "outOfLineConstraint", "outOfLineRefConstraint", 
			"createIndexSpecification", "tableIndexClause", "indexExpressions", "indexExpression", 
			"bitmapJoinIndexClause", "columnSortsClause_", "columnSortClause_", "createIndexDefinitionClause", 
			"tableAlias", "alterDefinitionClause", "alterTableProperties", "renameTableSpecification", 
			"columnClauses", "operateColumnClause", "addColumnSpecification", "columnOrVirtualDefinitions", 
			"columnOrVirtualDefinition", "columnProperties", "columnProperty", "objectTypeColProperties", 
			"substitutableColumnClause", "modifyColumnSpecification", "modifyColProperties", 
			"modifyColSubstitutable", "dropColumnClause", "dropColumnSpecification", 
			"columnOrColumnList", "cascadeOrInvalidate", "checkpointNumber", "renameColumnClause", 
			"constraintClauses", "addConstraintSpecification", "modifyConstraintClause", 
			"constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
			"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
			"objectProperties", "objectProperty", "renameIndexClause", "setTransaction", 
			"commit", "rollback", "savepoint", "grant", "revoke", "objectPrivilegeClause", 
			"systemPrivilegeClause", "roleClause", "objectPrivileges", "objectPrivilegeType", 
			"onObjectClause", "systemPrivilege", "systemPrivilegeOperation", "advisorFrameworkSystemPrivilege", 
			"clustersSystemPrivilege", "contextsSystemPrivilege", "dataRedactionSystemPrivilege", 
			"databaseSystemPrivilege", "databaseLinksSystemPrivilege", "debuggingSystemPrivilege", 
			"dictionariesSystemPrivilege", "dimensionsSystemPrivilege", "directoriesSystemPrivilege", 
			"editionsSystemPrivilege", "flashbackDataArchivesPrivilege", "indexesSystemPrivilege", 
			"indexTypesSystemPrivilege", "jobSchedulerObjectsSystemPrivilege", "keyManagementFrameworkSystemPrivilege", 
			"librariesFrameworkSystemPrivilege", "logminerFrameworkSystemPrivilege", 
			"materizlizedViewsSystemPrivilege", "miningModelsSystemPrivilege", "olapCubesSystemPrivilege", 
			"olapCubeMeasureFoldersSystemPrivilege", "olapCubeDiminsionsSystemPrivilege", 
			"olapCubeBuildProcessesSystemPrivilege", "operatorsSystemPrivilege", 
			"outlinesSystemPrivilege", "planManagementSystemPrivilege", "pluggableDatabasesSystemPrivilege", 
			"proceduresSystemPrivilege", "profilesSystemPrivilege", "rolesSystemPrivilege", 
			"rollbackSegmentsSystemPrivilege", "sequencesSystemPrivilege", "sessionsSystemPrivilege", 
			"sqlTranslationProfilesSystemPrivilege", "synonymsSystemPrivilege", "tablesSystemPrivilege", 
			"tablespacesSystemPrivilege", "triggersSystemPrivilege", "typesSystemPrivilege", 
			"usersSystemPrivilege", "viewsSystemPrivilege", "miscellaneousSystemPrivilege", 
			"createUser", "dropUser", "alterUser", "createRole", "dropRole", "alterRole", 
			"call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Default does not match anything'", "'&&'", "'||'", "'!'", "'~'", 
			"'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", 
			"'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
			"'\"'", "'''", "'`'", "'?'", "'@'", "';'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "BLOCK_COMMENT", "INLINE_COMMENT", 
			"WS", "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", 
			"TRUNCATE", "SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", 
			"INDEX", "CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", 
			"PRECISION", "FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", 
			"WITH", "UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", 
			"FROM", "NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "RIGHT", 
			"CROSS", "USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", 
			"AND", "OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", 
			"IN", "ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", 
			"LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", 
			"DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", "TIME", "TIMESTAMP", 
			"LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", 
			"HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", 
			"AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", 
			"PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", 
			"CLOSE", "OPEN", "NEXT", "NAME", "COLLATION", "NAMES", "INTEGER", "REAL", 
			"DECIMAL", "TYPE", "INT", "SMALLINT", "NUMERIC", "FLOAT", "FOR_GENERATOR", 
			"BINARY", "ESCAPE", "MOD", "XOR", "ROW", "ROWS", "UNKNOWN", "ALWAYS", 
			"CASCADE", "CHECK", "GENERATED", "PRIVILEGES", "READ", "WRITE", "REFERENCES", 
			"START", "TRANSACTION", "USER", "ROLE", "VISIBLE", "INVISIBLE", "EXECUTE", 
			"USE", "DEBUG", "UNDER", "FLASHBACK", "ARCHIVE", "REFRESH", "QUERY", 
			"REWRITE", "KEEP", "SEQUENCE", "INHERIT", "TRANSLATE", "MERGE", "AT", 
			"BITMAP", "CACHE", "NOCACHE", "CHECKPOINT", "CONNECT", "CONSTRAINTS", 
			"CYCLE", "NOCYCLE", "DBTIMEZONE", "ENCRYPT", "DECRYPT", "DEFERRABLE", 
			"DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", "END", "EXCEPTIONS", "FORCE", 
			"GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", "INCREMENT", "INITIALLY", 
			"INVALIDATE", "JAVA", "LEVELS", "MAXVALUE", "MINVALUE", "NOMAXVALUE", 
			"NOMINVALUE", "MINING", "MODEL", "MODIFY", "NATIONAL", "NEW", "NOORDER", 
			"NORELY", "OF", "ONLY", "PRIOR", "PROFILE", "REF", "REKEY", "RELY", "RENAME", 
			"REPLACE", "RESOURCE", "ROWID", "SALT", "SCOPE", "SORT", "SOURCE", "SUBSTITUTABLE", 
			"TABLESPACE", "TEMPORARY", "TRANSLATION", "TREAT", "NO", "UNUSED", "VALIDATE", 
			"NOVALIDATE", "VALUE", "VARYING", "VIRTUAL", "ZONE", "PUBLIC", "SESSION", 
			"COMMENT", "LOCK", "ADVISOR", "ADMINISTER", "TUNING", "MANAGE", "MANAGEMENT", 
			"OBJECT", "CLUSTER", "CONTEXT", "EXEMPT", "REDACTION", "POLICY", "DATABASE", 
			"SYSTEM", "AUDIT", "LINK", "ANALYZE", "DICTIONARY", "DIMENSION", "INDEXTYPE", 
			"EXTERNAL", "JOB", "CLASS", "PROGRAM", "SCHEDULER", "LIBRARY", "LOGMINING", 
			"MATERIALIZED", "CUBE", "MEASURE", "FOLDER", "BUILD", "PROCESS", "OPERATOR", 
			"OUTLINE", "PLUGGABLE", "CONTAINER", "SEGMENT", "RESTRICTED", "COST", 
			"SYNONYM", "BACKUP", "UNLIMITED", "BECOME", "CHANGE", "NOTIFICATION", 
			"ACCESS", "PRIVILEGE", "PURGE", "RESUMABLE", "SYSGUID", "SYSBACKUP", 
			"SYSDBA", "SYSDG", "SYSKM", "SYSOPER", "DBA_RECYCLEBIN", "FIRST", "NCHAR", 
			"RAW", "VARCHAR", "VARCHAR2", "NVARCHAR2", "LONG", "BLOB", "CLOB", "NCLOB", 
			"BINARY_FLOAT", "BINARY_DOUBLE", "PLS_INTEGER", "BINARY_INTEGER", "NUMBER", 
			"NATURALN", "POSITIVE", "POSITIVEN", "SIGNTYPE", "SIMPLE_INTEGER", "BFILE", 
			"MLSLABEL", "UROWID", "JSON", "DEC", "IDENTIFIER_", "STRING_", "NUMBER_", 
			"HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(498);
				select();
				}
				break;
			case 2:
				{
				setState(499);
				insert();
				}
				break;
			case 3:
				{
				setState(500);
				update();
				}
				break;
			case 4:
				{
				setState(501);
				delete();
				}
				break;
			case 5:
				{
				setState(502);
				createTable();
				}
				break;
			case 6:
				{
				setState(503);
				alterTable();
				}
				break;
			case 7:
				{
				setState(504);
				dropTable();
				}
				break;
			case 8:
				{
				setState(505);
				truncateTable();
				}
				break;
			case 9:
				{
				setState(506);
				createIndex();
				}
				break;
			case 10:
				{
				setState(507);
				dropIndex();
				}
				break;
			case 11:
				{
				setState(508);
				alterIndex();
				}
				break;
			case 12:
				{
				setState(509);
				commit();
				}
				break;
			case 13:
				{
				setState(510);
				rollback();
				}
				break;
			case 14:
				{
				setState(511);
				setTransaction();
				}
				break;
			case 15:
				{
				setState(512);
				savepoint();
				}
				break;
			case 16:
				{
				setState(513);
				grant();
				}
				break;
			case 17:
				{
				setState(514);
				revoke();
				}
				break;
			case 18:
				{
				setState(515);
				createUser();
				}
				break;
			case 19:
				{
				setState(516);
				dropUser();
				}
				break;
			case 20:
				{
				setState(517);
				alterUser();
				}
				break;
			case 21:
				{
				setState(518);
				createRole();
				}
				break;
			case 22:
				{
				setState(519);
				dropRole();
				}
				break;
			case 23:
				{
				setState(520);
				alterRole();
				}
				break;
			case 24:
				{
				setState(521);
				call();
				}
				break;
			}
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(524);
				match(SEMI_);
				}
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public InsertSingleTableContext insertSingleTable() {
			return getRuleContext(InsertSingleTableContext.class,0);
		}
		public InsertMultiTableContext insertMultiTable() {
			return getRuleContext(InsertMultiTableContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(INSERT);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTO:
				{
				setState(528);
				insertSingleTable();
				}
				break;
			case WHEN:
			case ALL:
			case FIRST:
				{
				setState(529);
				insertMultiTable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InsertSingleTableContext extends ParserRuleContext {
		public InsertIntoClauseContext insertIntoClause() {
			return getRuleContext(InsertIntoClauseContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSingleTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSingleTableContext insertSingleTable() throws RecognitionException {
		InsertSingleTableContext _localctx = new InsertSingleTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertSingleTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			insertIntoClause();
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case VALUES:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				{
				setState(533);
				insertValuesClause();
				}
				break;
			case SELECT:
				{
				setState(534);
				select();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InsertMultiTableContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public ConditionalInsertClauseContext conditionalInsertClause() {
			return getRuleContext(ConditionalInsertClauseContext.class,0);
		}
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public InsertMultiTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertMultiTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertMultiTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertMultiTableContext insertMultiTable() throws RecognitionException {
		InsertMultiTableContext _localctx = new InsertMultiTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertMultiTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(537);
				match(ALL);
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(538);
					multiTableElement();
					}
					}
					setState(541); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTO );
				}
				break;
			case 2:
				{
				setState(543);
				conditionalInsertClause();
				}
				break;
			}
			setState(546);
			select();
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

	public static class MultiTableElementContext extends ParserRuleContext {
		public InsertIntoClauseContext insertIntoClause() {
			return getRuleContext(InsertIntoClauseContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public MultiTableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiTableElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultiTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiTableElementContext multiTableElement() throws RecognitionException {
		MultiTableElementContext _localctx = new MultiTableElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiTableElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			insertIntoClause();
			setState(549);
			insertValuesClause();
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

	public static class ConditionalInsertClauseContext extends ParserRuleContext {
		public List<ConditionalInsertWhenPartContext> conditionalInsertWhenPart() {
			return getRuleContexts(ConditionalInsertWhenPartContext.class);
		}
		public ConditionalInsertWhenPartContext conditionalInsertWhenPart(int i) {
			return getRuleContext(ConditionalInsertWhenPartContext.class,i);
		}
		public ConditionalInsertElsePartContext conditionalInsertElsePart() {
			return getRuleContext(ConditionalInsertElsePartContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(OracleStatementParser.FIRST, 0); }
		public ConditionalInsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertClauseContext conditionalInsertClause() throws RecognitionException {
		ConditionalInsertClauseContext _localctx = new ConditionalInsertClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionalInsertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==FIRST) {
				{
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==FIRST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				conditionalInsertWhenPart();
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(559);
				conditionalInsertElsePart();
				}
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

	public static class ConditionalInsertWhenPartContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public ConditionalInsertWhenPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertWhenPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertWhenPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertWhenPartContext conditionalInsertWhenPart() throws RecognitionException {
		ConditionalInsertWhenPartContext _localctx = new ConditionalInsertWhenPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalInsertWhenPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(WHEN);
			setState(563);
			expr(0);
			setState(564);
			match(THEN);
			setState(566); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(565);
				multiTableElement();
				}
				}
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTO );
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

	public static class ConditionalInsertElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public List<MultiTableElementContext> multiTableElement() {
			return getRuleContexts(MultiTableElementContext.class);
		}
		public MultiTableElementContext multiTableElement(int i) {
			return getRuleContext(MultiTableElementContext.class,i);
		}
		public ConditionalInsertElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalInsertElsePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConditionalInsertElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalInsertElsePartContext conditionalInsertElsePart() throws RecognitionException {
		ConditionalInsertElsePartContext _localctx = new ConditionalInsertElsePartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalInsertElsePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(ELSE);
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(571);
				multiTableElement();
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTO );
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

	public static class InsertIntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public InsertIntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertIntoClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoClauseContext insertIntoClause() throws RecognitionException {
		InsertIntoClauseContext _localctx = new InsertIntoClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(INTO);
			setState(577);
			tableName();
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(578);
					match(AS);
					}
				}

				setState(581);
				alias();
				}
				break;
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

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(OracleStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
				{
				setState(584);
				columnNames();
				}
			}

			setState(587);
			match(VALUES);
			setState(588);
			assignmentValues();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(589);
				match(COMMA_);
				setState(590);
				assignmentValues();
				}
				}
				setState(595);
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public UpdateSpecificationContext updateSpecification() {
			return getRuleContext(UpdateSpecificationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(UPDATE);
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(597);
				updateSpecification();
				}
				break;
			}
			setState(600);
			tableReferences();
			setState(601);
			setAssignmentsClause();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(602);
				whereClause();
				}
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

	public static class UpdateSpecificationContext extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public UpdateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUpdateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSpecificationContext updateSpecification() throws RecognitionException {
		UpdateSpecificationContext _localctx = new UpdateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_updateSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(ONLY);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			columnName();
			setState(608);
			match(EQ_);
			setState(609);
			assignmentValue();
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

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(SET);
			setState(612);
			assignment();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(613);
				match(COMMA_);
				setState(614);
				assignment();
				}
				}
				setState(619);
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

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentValues);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(LP_);
				setState(621);
				assignmentValue();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(622);
					match(COMMA_);
					setState(623);
					assignmentValue();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(LP_);
				setState(632);
				match(RP_);
				}
				break;
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

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentValue);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(DEFAULT);
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public MultipleTablesClauseContext multipleTablesClause() {
			return getRuleContext(MultipleTablesClauseContext.class,0);
		}
		public DeleteSpecificationContext deleteSpecification() {
			return getRuleContext(DeleteSpecificationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(DELETE);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(640);
				deleteSpecification();
				}
				break;
			}
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(643);
				singleTableClause();
				}
				break;
			case 2:
				{
				setState(644);
				multipleTablesClause();
				}
				break;
			}
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(647);
				whereClause();
				}
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

	public static class DeleteSpecificationContext extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public DeleteSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDeleteSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSpecificationContext deleteSpecification() throws RecognitionException {
		DeleteSpecificationContext _localctx = new DeleteSpecificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deleteSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(ONLY);
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

	public static class SingleTableClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(652);
				match(FROM);
				}
			}

			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(655);
				match(LP_);
				}
			}

			setState(658);
			tableName();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(659);
				match(RP_);
				}
			}

			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(662);
					match(AS);
					}
				}

				setState(665);
				alias();
				}
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

	public static class MultipleTablesClauseContext extends ParserRuleContext {
		public MultipleTableNamesContext multipleTableNames() {
			return getRuleContext(MultipleTableNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public MultipleTablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultipleTablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTablesClauseContext multipleTablesClause() throws RecognitionException {
		MultipleTablesClauseContext _localctx = new MultipleTablesClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipleTablesClause);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				multipleTableNames();
				setState(669);
				match(FROM);
				setState(670);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(FROM);
				setState(673);
				multipleTableNames();
				setState(674);
				match(USING);
				setState(675);
				tableReferences();
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

	public static class MultipleTableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(OracleStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(OracleStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public MultipleTableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMultipleTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTableNamesContext multipleTableNames() throws RecognitionException {
		MultipleTableNamesContext _localctx = new MultipleTableNamesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multipleTableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			tableName();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(680);
				match(DOT_ASTERISK_);
				}
			}

			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(683);
				match(COMMA_);
				setState(684);
				tableName();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(685);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(692);
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

	public static class SelectContext extends ParserRuleContext {
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			unionClause();
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

	public static class UnionClauseContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(OracleStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(OracleStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(OracleStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(OracleStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(OracleStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(OracleStatementParser.DISTINCT, i);
		}
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			selectClause();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(696);
				match(UNION);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(697);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(700);
				selectClause();
				}
				}
				setState(705);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LockClauseContext lockClause() {
			return getRuleContext(LockClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(SELECT);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(707);
				duplicateSpecification();
				}
			}

			setState(710);
			projections();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(711);
				fromClause();
				}
			}

			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(714);
				whereClause();
				}
			}

			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(717);
				groupByClause();
				}
			}

			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(720);
				havingClause();
				}
			}

			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(723);
				orderByClause();
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(726);
				lockClause();
				}
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

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProjectionsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<ProjectionContext> projection() {
			return getRuleContexts(ProjectionContext.class);
		}
		public ProjectionContext projection(int i) {
			return getRuleContext(ProjectionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(731);
				unqualifiedShorthand();
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(732);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(735);
				match(COMMA_);
				setState(736);
				projection();
				}
				}
				setState(741);
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

	public static class ProjectionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_projection);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(742);
					columnName();
					}
					break;
				case 2:
					{
					setState(743);
					expr(0);
					}
					break;
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (AS - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
					{
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(746);
						match(AS);
						}
					}

					setState(749);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				qualifiedShorthand();
				}
				break;
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

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alias);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(STRING_);
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

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(ASTERISK_);
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

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(OracleStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			identifier();
			setState(762);
			match(DOT_ASTERISK_);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(FROM);
			setState(765);
			tableReferences();
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

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			tableReference();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(768);
				match(COMMA_);
				setState(769);
				tableReference();
				}
				}
				setState(774);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			tableFactor();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
				{
				{
				setState(776);
				joinedTable();
				}
				}
				setState(781);
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

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableFactor);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				tableName();
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(783);
						match(AS);
						}
					}

					setState(786);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				subquery();
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(790);
					match(AS);
					}
				}

				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(793);
					alias();
					}
					break;
				}
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(796);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(LP_);
				setState(800);
				tableReferences();
				setState(801);
				match(RP_);
				}
				break;
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

	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinedTable);
		int _la;
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(805);
					match(NATURAL);
					}
				}

				{
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(811);
				match(JOIN);
				}
				setState(813);
				tableFactor();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(814);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(817);
					match(NATURAL);
					}
				}

				setState(820);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(821);
					match(OUTER);
					}
				}

				setState(824);
				match(JOIN);
				setState(825);
				tableFactor();
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(826);
					joinSpecification();
					}
				}

				}
				break;
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

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_joinSpecification);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(ON);
				setState(832);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(USING);
				setState(834);
				columnNames();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(WHERE);
			setState(838);
			expr(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(OracleStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(GROUP);
			setState(841);
			match(BY);
			setState(842);
			orderByItem();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(843);
				match(COMMA_);
				setState(844);
				orderByItem();
				}
				}
				setState(849);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(OracleStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(HAVING);
			setState(851);
			expr(0);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(LP_);
			setState(854);
			unionClause();
			setState(855);
			match(RP_);
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

	public static class LockClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public LockClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLockClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockClauseContext lockClause() throws RecognitionException {
		LockClauseContext _localctx = new LockClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lockClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(FOR);
			setState(858);
			match(UPDATE);
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

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(OracleStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(QUESTION_);
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

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literals);
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(866);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(867);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(868);
				nullValueLiterals();
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

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(STRING_);
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

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(873);
				match(MINUS_);
				}
			}

			setState(876);
			match(NUMBER_);
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

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(879);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(LBE_);
				setState(881);
				identifier();
				setState(882);
				match(STRING_);
				setState(883);
				match(RBE_);
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

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(OracleStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(HEX_DIGIT_);
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

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(OracleStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(BIT_NUM_);
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

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(NULL);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifier);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				unreservedWord();
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

	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(OracleStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode TRIM() { return getToken(OracleStatementParser.TRIM, 0); }
		public TerminalNode SUBSTRING() { return getToken(OracleStatementParser.SUBSTRING, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(OracleStatementParser.JOIN, 0); }
		public TerminalNode FULL() { return getToken(OracleStatementParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(OracleStatementParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(OracleStatementParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(OracleStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(OracleStatementParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(OracleStatementParser.CROSS, 0); }
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(OracleStatementParser.OFFSET, 0); }
		public TerminalNode BEGIN() { return getToken(OracleStatementParser.BEGIN, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleStatementParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode CHARACTER() { return getToken(OracleStatementParser.CHARACTER, 0); }
		public TerminalNode ARRAY() { return getToken(OracleStatementParser.ARRAY, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(OracleStatementParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(OracleStatementParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(OracleStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(OracleStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(OracleStatementParser.MICROSECOND, 0); }
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode REPLACE() { return getToken(OracleStatementParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode SCHEMA() { return getToken(OracleStatementParser.SCHEMA, 0); }
		public TerminalNode DO() { return getToken(OracleStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(OracleStatementParser.DEFINER, 0); }
		public TerminalNode CURRENT_USER() { return getToken(OracleStatementParser.CURRENT_USER, 0); }
		public TerminalNode CASCADED() { return getToken(OracleStatementParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(OracleStatementParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(OracleStatementParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(OracleStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(OracleStatementParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(OracleStatementParser.NAMES, 0); }
		public TerminalNode INTEGER() { return getToken(OracleStatementParser.INTEGER, 0); }
		public TerminalNode COLLATION() { return getToken(OracleStatementParser.COLLATION, 0); }
		public TerminalNode REAL() { return getToken(OracleStatementParser.REAL, 0); }
		public TerminalNode DECIMAL() { return getToken(OracleStatementParser.DECIMAL, 0); }
		public TerminalNode FIRST() { return getToken(OracleStatementParser.FIRST, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			identifier();
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

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(903);
				owner();
				setState(904);
				match(DOT_);
				}
				break;
			}
			setState(908);
			name();
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

	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(OracleStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(910);
				owner();
				setState(911);
				match(DOT_);
				}
				break;
			}
			setState(915);
			name();
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

	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			identifier();
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

	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			identifier();
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(921);
				match(LP_);
				}
			}

			setState(924);
			columnName();
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(925);
					match(COMMA_);
					setState(926);
					columnName();
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(932);
				match(RP_);
				}
				break;
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(935);
				match(LP_);
				}
			}

			setState(938);
			tableName();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(939);
				match(COMMA_);
				setState(940);
				tableName();
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(946);
				match(RP_);
				}
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

	public static class IndexNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			identifier();
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

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOracleId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_oracleId);
		try {
			int _alt;
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				match(IDENTIFIER_);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(952);
						match(STRING_);
						setState(953);
						match(DOT_);
						}
						} 
					}
					setState(958);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(959);
				match(STRING_);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(OracleStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(LP_);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(965);
				match(NUMBER_);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(966);
					match(COMMA_);
					setState(967);
					match(NUMBER_);
					}
				}

				}
			}

			setState(972);
			match(RP_);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(974);
				match(PRIMARY);
				}
			}

			setState(977);
			match(KEY);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			expr(0);
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(980);
				match(COMMA_);
				setState(981);
				expr(0);
				}
				}
				setState(986);
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(LP_);
			setState(988);
			exprs();
			setState(989);
			match(RP_);
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

	public static class ExprContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(992);
				notOperator();
				setState(993);
				expr(3);
				}
				break;
			case 2:
				{
				setState(995);
				match(LP_);
				setState(996);
				expr(0);
				setState(997);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(999);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(1002);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1003);
					logicalOperator();
					setState(1004);
					expr(5);
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==OR_ || _la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(OracleStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1016);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1036);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1018);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1019);
						match(IS);
						setState(1021);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1020);
							match(NOT);
							}
						}

						setState(1023);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NULL - 104)) | (1L << (TRUE - 104)) | (1L << (FALSE - 104)))) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1024);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1025);
						match(SAFE_EQ_);
						setState(1026);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1027);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1028);
						comparisonOperator();
						setState(1029);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1031);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1032);
						comparisonOperator();
						setState(1033);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1034);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(OracleStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(OracleStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(OracleStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(OracleStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(OracleStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_predicate);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				bitExpr(0);
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1044);
					match(NOT);
					}
				}

				setState(1047);
				match(IN);
				setState(1048);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				bitExpr(0);
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1051);
					match(NOT);
					}
				}

				setState(1054);
				match(IN);
				setState(1055);
				match(LP_);
				setState(1056);
				expr(0);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1057);
					match(COMMA_);
					setState(1058);
					expr(0);
					}
					}
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1064);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1066);
				bitExpr(0);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1067);
					match(NOT);
					}
				}

				setState(1070);
				match(BETWEEN);
				setState(1071);
				bitExpr(0);
				setState(1072);
				match(AND);
				setState(1073);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1075);
				bitExpr(0);
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1076);
					match(NOT);
					}
				}

				setState(1079);
				match(LIKE);
				setState(1080);
				simpleExpr(0);
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1081);
					match(ESCAPE);
					setState(1082);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1085);
				bitExpr(0);
				}
				break;
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

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(OracleStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(OracleStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(OracleStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(OracleStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1089);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1091);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1092);
						match(VERTICAL_BAR_);
						setState(1093);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1094);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1095);
						match(AMPERSAND_);
						setState(1096);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1097);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1098);
						match(SIGNED_LEFT_SHIFT_);
						setState(1099);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1100);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1101);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1102);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1103);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1104);
						match(PLUS_);
						setState(1105);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1107);
						match(MINUS_);
						setState(1108);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1110);
						match(ASTERISK_);
						setState(1111);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1113);
						match(SLASH_);
						setState(1114);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1116);
						match(MOD_);
						setState(1117);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1119);
						match(CARET_);
						setState(1120);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(OracleStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1127);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1128);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1129);
				literals();
				}
				break;
			case 4:
				{
				setState(1130);
				columnName();
				}
				break;
			case 5:
				{
				setState(1131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1132);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1133);
					match(ROW);
					}
				}

				setState(1136);
				match(LP_);
				setState(1137);
				expr(0);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1138);
					match(COMMA_);
					setState(1139);
					expr(0);
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1147);
					match(EXISTS);
					}
				}

				setState(1150);
				subquery();
				}
				break;
			case 8:
				{
				setState(1151);
				match(LBE_);
				setState(1152);
				identifier();
				setState(1153);
				expr(0);
				setState(1154);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1156);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(1157);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1160);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1161);
					match(OR_);
					setState(1162);
					simpleExpr(8);
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionCall);
		try {
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				regularFunction();
				}
				break;
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

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			aggregationFunctionName();
			setState(1174);
			match(LP_);
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1175);
				distinct();
				}
			}

			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1178);
				expr(0);
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1179);
					match(COMMA_);
					setState(1180);
					expr(0);
					}
					}
					setState(1185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1186);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1189);
			match(RP_);
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

	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(OracleStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(OracleStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(OracleStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(OracleStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(OracleStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAX - 145)) | (1L << (MIN - 145)) | (1L << (SUM - 145)) | (1L << (COUNT - 145)) | (1L << (AVG - 145)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(DISTINCT);
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

	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_specialFunction);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				castFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				charFunction();
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

	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(OracleStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(CAST);
			setState(1200);
			match(LP_);
			setState(1201);
			expr(0);
			setState(1202);
			match(AS);
			setState(1203);
			dataType();
			setState(1204);
			match(RP_);
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

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(CHAR);
			setState(1207);
			match(LP_);
			setState(1208);
			expr(0);
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1209);
				match(COMMA_);
				setState(1210);
				expr(0);
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1216);
				match(USING);
				setState(1217);
				ignoredIdentifier();
				}
			}

			setState(1220);
			match(RP_);
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

	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			regularFunctionName();
			setState(1223);
			match(LP_);
			setState(1233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1224);
				expr(0);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1225);
					match(COMMA_);
					setState(1226);
					expr(0);
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1232);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1235);
			match(RP_);
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

	public static class RegularFunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(OracleStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(OracleStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(OracleStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_regularFunctionName);
		try {
			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1239);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1241);
				match(INTERVAL);
				}
				break;
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhenContext> caseWhen() {
			return getRuleContexts(CaseWhenContext.class);
		}
		public CaseWhenContext caseWhen(int i) {
			return getRuleContext(CaseWhenContext.class,i);
		}
		public CaseElseContext caseElse() {
			return getRuleContext(CaseElseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_caseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(CASE);
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1245);
				simpleExpr(0);
				}
				break;
			}
			setState(1249); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1248);
					caseWhen();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1251); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1253);
				caseElse();
				}
				break;
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

	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(WHEN);
			setState(1257);
			expr(0);
			setState(1258);
			match(THEN);
			setState(1259);
			expr(0);
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

	public static class CaseElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(ELSE);
			setState(1262);
			expr(0);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(ORDER);
			setState(1265);
			match(BY);
			setState(1266);
			orderByItem();
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1267);
				match(COMMA_);
				setState(1268);
				orderByItem();
				}
				}
				setState(1273);
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

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1274);
				columnName();
				}
				break;
			case 2:
				{
				setState(1275);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1276);
				expr(0);
				}
				break;
			}
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1279);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			oracleId();
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

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(IDENTIFIER_);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			simpleExpr(0);
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1287);
				match(COMMA_);
				setState(1288);
				simpleExpr(0);
				}
				}
				setState(1293);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_lobItem);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				columnName();
				}
				break;
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			lobItem();
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1299);
				match(COMMA_);
				setState(1300);
				lobItem();
				}
				}
				setState(1305);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLobItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(LP_);
			setState(1307);
			lobItems();
			setState(1308);
			match(RP_);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_dataType);
		int _la;
		try {
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				dataTypeName();
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1311);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1315);
				dataTypeName();
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1316);
					dataTypeLength();
					}
				}

				setState(1319);
				datetimeTypeSuffix();
				}
				break;
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSpecialDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_specialDatatype);
		int _la;
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				dataTypeName();
				{
				setState(1324);
				match(LP_);
				setState(1325);
				match(NUMBER_);
				setState(1326);
				match(CHAR);
				setState(1327);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				match(NATIONAL);
				setState(1330);
				dataTypeName();
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1331);
					match(VARYING);
					}
				}

				setState(1334);
				match(LP_);
				setState(1335);
				match(NUMBER_);
				setState(1336);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1338);
				dataTypeName();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1339);
					match(LP_);
					}
				}

				setState(1342);
				columnName();
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1343);
					match(RP_);
					}
					break;
				}
				}
				break;
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

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(OracleStatementParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(OracleStatementParser.NCHAR, 0); }
		public TerminalNode RAW() { return getToken(OracleStatementParser.RAW, 0); }
		public TerminalNode VARCHAR() { return getToken(OracleStatementParser.VARCHAR, 0); }
		public TerminalNode VARCHAR2() { return getToken(OracleStatementParser.VARCHAR2, 0); }
		public TerminalNode NVARCHAR2() { return getToken(OracleStatementParser.NVARCHAR2, 0); }
		public TerminalNode LONG() { return getToken(OracleStatementParser.LONG, 0); }
		public TerminalNode BLOB() { return getToken(OracleStatementParser.BLOB, 0); }
		public TerminalNode CLOB() { return getToken(OracleStatementParser.CLOB, 0); }
		public TerminalNode NCLOB() { return getToken(OracleStatementParser.NCLOB, 0); }
		public TerminalNode BINARY_FLOAT() { return getToken(OracleStatementParser.BINARY_FLOAT, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(OracleStatementParser.BINARY_DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(OracleStatementParser.BOOLEAN, 0); }
		public TerminalNode PLS_INTEGER() { return getToken(OracleStatementParser.PLS_INTEGER, 0); }
		public TerminalNode BINARY_INTEGER() { return getToken(OracleStatementParser.BINARY_INTEGER, 0); }
		public TerminalNode INTEGER() { return getToken(OracleStatementParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(OracleStatementParser.NUMBER, 0); }
		public TerminalNode NATURAL() { return getToken(OracleStatementParser.NATURAL, 0); }
		public TerminalNode NATURALN() { return getToken(OracleStatementParser.NATURALN, 0); }
		public TerminalNode POSITIVE() { return getToken(OracleStatementParser.POSITIVE, 0); }
		public TerminalNode POSITIVEN() { return getToken(OracleStatementParser.POSITIVEN, 0); }
		public TerminalNode SIGNTYPE() { return getToken(OracleStatementParser.SIGNTYPE, 0); }
		public TerminalNode SIMPLE_INTEGER() { return getToken(OracleStatementParser.SIMPLE_INTEGER, 0); }
		public TerminalNode BFILE() { return getToken(OracleStatementParser.BFILE, 0); }
		public TerminalNode MLSLABEL() { return getToken(OracleStatementParser.MLSLABEL, 0); }
		public TerminalNode UROWID() { return getToken(OracleStatementParser.UROWID, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode INTERVAL() { return getToken(OracleStatementParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode JSON() { return getToken(OracleStatementParser.JSON, 0); }
		public TerminalNode FLOAT() { return getToken(OracleStatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(OracleStatementParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(OracleStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(OracleStatementParser.PRECISION, 0); }
		public TerminalNode INT() { return getToken(OracleStatementParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(OracleStatementParser.SMALLINT, 0); }
		public TerminalNode DECIMAL() { return getToken(OracleStatementParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(OracleStatementParser.NUMERIC, 0); }
		public TerminalNode DEC() { return getToken(OracleStatementParser.DEC, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_dataTypeName);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				match(NCHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1350);
				match(RAW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1351);
				match(VARCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1352);
				match(VARCHAR2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1353);
				match(NVARCHAR2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1354);
				match(LONG);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1355);
				match(LONG);
				setState(1356);
				match(RAW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1357);
				match(BLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1358);
				match(CLOB);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1359);
				match(NCLOB);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1360);
				match(BINARY_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1361);
				match(BINARY_DOUBLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1362);
				match(BOOLEAN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1363);
				match(PLS_INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1364);
				match(BINARY_INTEGER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1365);
				match(INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1366);
				match(NUMBER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1367);
				match(NATURAL);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1368);
				match(NATURALN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1369);
				match(POSITIVE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1370);
				match(POSITIVEN);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1371);
				match(SIGNTYPE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1372);
				match(SIMPLE_INTEGER);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1373);
				match(BFILE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1374);
				match(MLSLABEL);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1375);
				match(UROWID);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1376);
				match(DATE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1377);
				match(TIMESTAMP);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1378);
				match(TIMESTAMP);
				setState(1379);
				match(WITH);
				setState(1380);
				match(TIME);
				setState(1381);
				match(ZONE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1382);
				match(TIMESTAMP);
				setState(1383);
				match(WITH);
				setState(1384);
				match(LOCAL);
				setState(1385);
				match(TIME);
				setState(1386);
				match(ZONE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1387);
				match(INTERVAL);
				setState(1388);
				match(DAY);
				setState(1389);
				match(TO);
				setState(1390);
				match(SECOND);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1391);
				match(INTERVAL);
				setState(1392);
				match(YEAR);
				setState(1393);
				match(TO);
				setState(1394);
				match(MONTH);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1395);
				match(JSON);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1396);
				match(FLOAT);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1397);
				match(REAL);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1398);
				match(DOUBLE);
				setState(1399);
				match(PRECISION);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1400);
				match(INT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1401);
				match(SMALLINT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1402);
				match(DECIMAL);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1403);
				match(NUMERIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1404);
				match(DEC);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1405);
				match(IDENTIFIER_);
				}
				break;
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatetimeTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1408);
					match(WITH);
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1409);
						match(LOCAL);
						}
					}

					setState(1412);
					match(TIME);
					setState(1413);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				match(TO);
				setState(1417);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1418);
				match(TO);
				setState(1419);
				match(SECOND);
				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1420);
					match(LP_);
					setState(1421);
					match(NUMBER_);
					setState(1422);
					match(RP_);
					}
				}

				}
				break;
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTreatFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(TREAT);
			setState(1428);
			match(LP_);
			setState(1429);
			expr(0);
			setState(1430);
			match(AS);
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1431);
				match(REF);
				}
			}

			setState(1434);
			dataTypeName();
			setState(1435);
			match(RP_);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPrivateExprOfDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_privateExprOfDb);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1441);
				constructorExpr();
				}
				break;
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(CASE);
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1445);
				simpleCaseExpr();
				}
				break;
			case 2:
				{
				setState(1446);
				searchedCaseExpr();
				}
				break;
			}
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1449);
				elseClause();
				}
			}

			setState(1452);
			match(END);
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

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSimpleCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			expr(0);
			setState(1456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1455);
				searchedCaseExpr();
				}
				}
				setState(1458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
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

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSearchedCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(WHEN);
			setState(1461);
			expr(0);
			setState(1462);
			match(THEN);
			setState(1463);
			simpleExpr(0);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(ELSE);
			setState(1466);
			expr(0);
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(LP_);
			setState(1469);
			expr(0);
			setState(1470);
			match(MINUS_);
			setState(1471);
			expr(0);
			setState(1472);
			match(RP_);
			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1473);
				match(DAY);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1474);
					match(LP_);
					setState(1475);
					match(NUMBER_);
					setState(1476);
					match(RP_);
					}
				}

				setState(1479);
				match(TO);
				setState(1480);
				match(SECOND);
				setState(1484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1481);
					match(LP_);
					setState(1482);
					match(NUMBER_);
					setState(1483);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1486);
				match(YEAR);
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1487);
					match(LP_);
					setState(1488);
					match(NUMBER_);
					setState(1489);
					match(RP_);
					}
				}

				setState(1492);
				match(TO);
				setState(1493);
				match(MONTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1496);
				match(LP_);
				setState(1497);
				simpleExpr(0);
				setState(1498);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1500);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1503);
			match(DOT_);
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1504);
				attributeName();
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1505);
						match(DOT_);
						setState(1506);
						attributeName();
						}
						} 
					}
					setState(1511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1512);
					match(DOT_);
					setState(1513);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1516);
				functionCall();
				}
				break;
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstructorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(NEW);
			setState(1520);
			dataTypeName();
			setState(1521);
			exprList();
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

	public static class IgnoredIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifierContext ignoredIdentifier() throws RecognitionException {
		IgnoredIdentifierContext _localctx = new IgnoredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_ignoredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(IDENTIFIER_);
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

	public static class IgnoredIdentifiersContext extends ParserRuleContext {
		public List<IgnoredIdentifierContext> ignoredIdentifier() {
			return getRuleContexts(IgnoredIdentifierContext.class);
		}
		public IgnoredIdentifierContext ignoredIdentifier(int i) {
			return getRuleContext(IgnoredIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIgnoredIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiersContext ignoredIdentifiers() throws RecognitionException {
		IgnoredIdentifiersContext _localctx = new IgnoredIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_ignoredIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			ignoredIdentifier();
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1526);
				match(COMMA_);
				setState(1527);
				ignoredIdentifier();
				}
				}
				setState(1532);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMatchNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(T__0);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateTableSpecificationContext createTableSpecification() {
			return getRuleContext(CreateTableSpecificationContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(CREATE);
			setState(1536);
			createTableSpecification();
			setState(1537);
			match(TABLE);
			setState(1538);
			tableName();
			setState(1539);
			createDefinitionClause();
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public CreateIndexSpecificationContext createIndexSpecification() {
			return getRuleContext(CreateIndexSpecificationContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public CreateIndexDefinitionClauseContext createIndexDefinitionClause() {
			return getRuleContext(CreateIndexDefinitionClauseContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(CREATE);
			setState(1542);
			createIndexSpecification();
			setState(1543);
			match(INDEX);
			setState(1544);
			indexName();
			setState(1545);
			match(ON);
			setState(1546);
			createIndexDefinitionClause();
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

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterDefinitionClauseContext alterDefinitionClause() {
			return getRuleContext(AlterDefinitionClauseContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(ALTER);
			setState(1549);
			match(TABLE);
			setState(1550);
			tableName();
			setState(1551);
			alterDefinitionClause();
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClauseContext renameIndexClause() {
			return getRuleContext(RenameIndexClauseContext.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			match(ALTER);
			setState(1554);
			match(INDEX);
			setState(1555);
			indexName();
			setState(1556);
			renameIndexClause();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			match(DROP);
			setState(1559);
			match(TABLE);
			setState(1560);
			tableName();
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(DROP);
			setState(1563);
			match(INDEX);
			setState(1564);
			indexName();
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(TRUNCATE);
			setState(1567);
			match(TABLE);
			setState(1568);
			tableName();
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

	public static class CreateTableSpecificationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateTableSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableSpecificationContext createTableSpecification() throws RecognitionException {
		CreateTableSpecificationContext _localctx = new CreateTableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_createTableSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(1570);
				match(GLOBAL);
				setState(1571);
				match(TEMPORARY);
				}
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespaceClauseWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(LP_);
			setState(1575);
			tablespaceClause();
			setState(1576);
			match(RP_);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespaceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(TABLESPACE);
			setState(1579);
			ignoredIdentifier();
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

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDomainIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			indexTypeName();
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

	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1583);
				match(LP_);
				setState(1584);
				relationalProperties();
				setState(1585);
				match(RP_);
				}
			}

			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1589);
				match(ON);
				setState(1590);
				match(COMMIT);
				setState(1591);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1592);
				match(ROWS);
				}
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

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRelationalProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			relationalProperty();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1596);
				match(COMMA_);
				setState(1597);
				relationalProperty();
				}
				}
				setState(1602);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRelationalProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_relationalProperty);
		try {
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1605);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1606);
				outOfLineRefConstraint();
				}
				break;
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VisibleClauseContext visibleClause() {
			return getRuleContext(VisibleClauseContext.class,0);
		}
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public DefaultNullClauseContext defaultNullClause() {
			return getRuleContext(DefaultNullClauseContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecificationContext encryptionSpecification() {
			return getRuleContext(EncryptionSpecificationContext.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			columnName();
			setState(1610);
			dataType();
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1611);
				match(SORT);
				}
			}

			setState(1614);
			visibleClause();
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(1615);
				defaultNullClause();
				setState(1616);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(1618);
				identityClause();
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case COLUMN:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case WITH:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
				break;
			default:
				break;
			}
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(1621);
				match(ENCRYPT);
				setState(1622);
				encryptionSpecification();
				}
			}

			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1626); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1625);
					inlineConstraint();
					}
					}
					setState(1628); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES );
				}
				break;
			case 2:
				{
				setState(1630);
				inlineRefConstraint();
				}
				break;
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

	public static class VisibleClauseContext extends ParserRuleContext {
		public TerminalNode VISIBLE() { return getToken(OracleStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(OracleStatementParser.INVISIBLE, 0); }
		public VisibleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibleClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitVisibleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibleClauseContext visibleClause() throws RecognitionException {
		VisibleClauseContext _localctx = new VisibleClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_visibleClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VISIBLE || _la==INVISIBLE) {
				{
				setState(1633);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class DefaultNullClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public DefaultNullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNullClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDefaultNullClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultNullClauseContext defaultNullClause() throws RecognitionException {
		DefaultNullClauseContext _localctx = new DefaultNullClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_defaultNullClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(DEFAULT);
			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1637);
				match(ON);
				setState(1638);
				match(NULL);
				}
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public IdentifyOptionsContext identifyOptions() {
			return getRuleContext(IdentifyOptionsContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentityClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(GENERATED);
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(1642);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(1643);
				match(BY);
				setState(1644);
				match(DEFAULT);
				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1645);
					match(ON);
					setState(1646);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1651);
			match(AS);
			setState(1652);
			match(IDENTITY);
			setState(1653);
			identifyOptions();
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

	public static class IdentifyOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<IdentityOptionContext> identityOption() {
			return getRuleContexts(IdentityOptionContext.class);
		}
		public IdentityOptionContext identityOption(int i) {
			return getRuleContext(IdentityOptionContext.class,i);
		}
		public IdentifyOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifyOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentifyOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifyOptionsContext identifyOptions() throws RecognitionException {
		IdentifyOptionsContext _localctx = new IdentifyOptionsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_identifyOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1655);
				match(LP_);
				}
			}

			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (START - 193)) | (1L << (CACHE - 193)) | (1L << (NOCACHE - 193)) | (1L << (CYCLE - 193)) | (1L << (NOCYCLE - 193)) | (1L << (INCREMENT - 193)) | (1L << (MAXVALUE - 193)) | (1L << (MINVALUE - 193)) | (1L << (NOMAXVALUE - 193)) | (1L << (NOMINVALUE - 193)) | (1L << (NOORDER - 193)))) != 0)) {
				{
				setState(1659); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1658);
					identityOption();
					}
					}
					setState(1661); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORDER || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (START - 193)) | (1L << (CACHE - 193)) | (1L << (NOCACHE - 193)) | (1L << (CYCLE - 193)) | (1L << (NOCYCLE - 193)) | (1L << (INCREMENT - 193)) | (1L << (MAXVALUE - 193)) | (1L << (MINVALUE - 193)) | (1L << (NOMAXVALUE - 193)) | (1L << (NOMINVALUE - 193)) | (1L << (NOORDER - 193)))) != 0) );
				}
			}

			setState(1666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1665);
				match(RP_);
				}
				break;
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

	public static class IdentityOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIdentityOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityOptionContext identityOption() throws RecognitionException {
		IdentityOptionContext _localctx = new IdentityOptionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_identityOption);
		try {
			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				match(START);
				setState(1669);
				match(WITH);
				setState(1673);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_:
					{
					setState(1670);
					match(NUMBER_);
					}
					break;
				case LIMIT:
					{
					setState(1671);
					match(LIMIT);
					setState(1672);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				match(INCREMENT);
				setState(1676);
				match(BY);
				setState(1677);
				match(NUMBER_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1678);
				match(MAXVALUE);
				setState(1679);
				match(NUMBER_);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1680);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1681);
				match(MINVALUE);
				setState(1682);
				match(NUMBER_);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1683);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1684);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1685);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1686);
				match(CACHE);
				setState(1687);
				match(NUMBER_);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1688);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1689);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1690);
				match(NOORDER);
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

	public static class EncryptionSpecificationContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitEncryptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptionSpecificationContext encryptionSpecification() throws RecognitionException {
		EncryptionSpecificationContext _localctx = new EncryptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_encryptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1693);
				match(USING);
				setState(1694);
				match(STRING_);
				}
			}

			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(1697);
				match(IDENTIFIED);
				setState(1698);
				match(BY);
				setState(1699);
				match(STRING_);
				}
			}

			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(1702);
				match(STRING_);
				}
			}

			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALT || _la==NO) {
				{
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1705);
					match(NO);
					}
				}

				setState(1708);
				match(SALT);
				}
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInlineConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1711);
				match(CONSTRAINT);
				setState(1712);
				ignoredIdentifier();
				}
			}

			setState(1727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1715);
					match(NOT);
					}
				}

				setState(1718);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(1719);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1720);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(1721);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1722);
				match(CHECK);
				setState(1723);
				match(LP_);
				setState(1724);
				expr(0);
				setState(1725);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1729);
					constraintState();
					}
					} 
				}
				setState(1734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitReferencesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(REFERENCES);
			setState(1736);
			tableName();
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1737);
				columnNames();
				}
				break;
			}
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1740);
				match(ON);
				setState(1741);
				match(DELETE);
				setState(1745);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(1742);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(1743);
					match(SET);
					setState(1744);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_constraintState);
		try {
			setState(1759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1751);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1752);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1753);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1754);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1755);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1756);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1757);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1758);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitNotDeferrable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1761);
				match(NOT);
				}
			}

			setState(1764);
			match(DEFERRABLE);
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

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInitiallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(INITIALLY);
			setState(1767);
			_la = _input.LA(1);
			if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitExceptionsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			match(EXCEPTIONS);
			setState(1770);
			match(INTO);
			setState(1771);
			tableName();
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

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public CreateIndexClauseContext createIndexClause() {
			return getRuleContext(CreateIndexClauseContext.class,0);
		}
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUsingIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(USING);
			setState(1774);
			match(INDEX);
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1775);
				indexName();
				}
				break;
			case 2:
				{
				setState(1776);
				createIndexClause();
				}
				break;
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

	public static class CreateIndexClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public CreateIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexClauseContext createIndexClause() throws RecognitionException {
		CreateIndexClauseContext _localctx = new CreateIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_createIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(LP_);
			setState(1780);
			createIndex();
			setState(1781);
			match(RP_);
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitInlineRefConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(1799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(SCOPE);
				setState(1784);
				match(IS);
				setState(1785);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1786);
				match(WITH);
				setState(1787);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1788);
					match(CONSTRAINT);
					setState(1789);
					ignoredIdentifier();
					}
				}

				setState(1792);
				referencesClause();
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
					{
					{
					setState(1793);
					constraintState();
					}
					}
					setState(1798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitVirtualColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			columnName();
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (BOOLEAN - 83)) | (1L << (DOUBLE - 83)) | (1L << (CHAR - 83)) | (1L << (INTERVAL - 83)) | (1L << (DATE - 83)) | (1L << (TIMESTAMP - 83)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (INTEGER - 169)) | (1L << (REAL - 169)) | (1L << (DECIMAL - 169)) | (1L << (INT - 169)) | (1L << (SMALLINT - 169)) | (1L << (NUMERIC - 169)) | (1L << (FLOAT - 169)))) != 0) || _la==NATIONAL || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (NCHAR - 342)) | (1L << (RAW - 342)) | (1L << (VARCHAR - 342)) | (1L << (VARCHAR2 - 342)) | (1L << (NVARCHAR2 - 342)) | (1L << (LONG - 342)) | (1L << (BLOB - 342)) | (1L << (CLOB - 342)) | (1L << (NCLOB - 342)) | (1L << (BINARY_FLOAT - 342)) | (1L << (BINARY_DOUBLE - 342)) | (1L << (PLS_INTEGER - 342)) | (1L << (BINARY_INTEGER - 342)) | (1L << (NUMBER - 342)) | (1L << (NATURALN - 342)) | (1L << (POSITIVE - 342)) | (1L << (POSITIVEN - 342)) | (1L << (SIGNTYPE - 342)) | (1L << (SIMPLE_INTEGER - 342)) | (1L << (BFILE - 342)) | (1L << (MLSLABEL - 342)) | (1L << (UROWID - 342)) | (1L << (JSON - 342)) | (1L << (DEC - 342)) | (1L << (IDENTIFIER_ - 342)))) != 0)) {
				{
				setState(1802);
				dataType();
				}
			}

			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(1805);
				match(GENERATED);
				setState(1806);
				match(ALWAYS);
				}
			}

			setState(1809);
			match(AS);
			setState(1810);
			match(LP_);
			setState(1811);
			expr(0);
			setState(1812);
			match(RP_);
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1813);
				match(VIRTUAL);
				}
			}

			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(1816);
				inlineConstraint();
				}
				}
				setState(1821);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutOfLineConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1822);
				match(CONSTRAINT);
				setState(1823);
				ignoredIdentifier();
				}
			}

			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(1826);
				match(UNIQUE);
				setState(1827);
				columnNames();
				}
				break;
			case PRIMARY:
			case KEY:
				{
				setState(1828);
				primaryKey();
				setState(1829);
				columnNames();
				}
				break;
			case FOREIGN:
				{
				setState(1831);
				match(FOREIGN);
				setState(1832);
				match(KEY);
				setState(1833);
				columnNames();
				setState(1834);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(1836);
				match(CHECK);
				setState(1837);
				match(LP_);
				setState(1838);
				expr(0);
				setState(1839);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
				{
				{
				setState(1843);
				constraintState();
				}
				}
				setState(1848);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutOfLineRefConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(1878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				match(SCOPE);
				setState(1850);
				match(FOR);
				setState(1851);
				match(LP_);
				setState(1852);
				lobItem();
				setState(1853);
				match(RP_);
				setState(1854);
				match(IS);
				setState(1855);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				match(REF);
				setState(1858);
				match(LP_);
				setState(1859);
				lobItem();
				setState(1860);
				match(RP_);
				setState(1861);
				match(WITH);
				setState(1862);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1864);
					match(CONSTRAINT);
					setState(1865);
					ignoredIdentifier();
					}
				}

				setState(1868);
				match(FOREIGN);
				setState(1869);
				match(KEY);
				setState(1870);
				lobItemList();
				setState(1871);
				referencesClause();
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0)) {
					{
					{
					setState(1872);
					constraintState();
					}
					}
					setState(1877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CreateIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexSpecificationContext createIndexSpecification() throws RecognitionException {
		CreateIndexSpecificationContext _localctx = new CreateIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_createIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==BITMAP) {
				{
				setState(1880);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==BITMAP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class TableIndexClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexExpressionsContext indexExpressions() {
			return getRuleContext(IndexExpressionsContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexClauseContext tableIndexClause() throws RecognitionException {
		TableIndexClauseContext _localctx = new TableIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_tableIndexClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			tableName();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(1884);
				alias();
				}
			}

			setState(1887);
			indexExpressions();
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

	public static class IndexExpressionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExpressionContext> indexExpression() {
			return getRuleContexts(IndexExpressionContext.class);
		}
		public IndexExpressionContext indexExpression(int i) {
			return getRuleContext(IndexExpressionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IndexExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExpressionsContext indexExpressions() throws RecognitionException {
		IndexExpressionsContext _localctx = new IndexExpressionsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_indexExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			match(LP_);
			setState(1890);
			indexExpression();
			setState(1895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1891);
				match(COMMA_);
				setState(1892);
				indexExpression();
				}
				}
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1898);
			match(RP_);
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

	public static class IndexExpressionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexExpressionContext indexExpression() throws RecognitionException {
		IndexExpressionContext _localctx = new IndexExpressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_indexExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1900);
				columnName();
				}
				break;
			case 2:
				{
				setState(1901);
				expr(0);
				}
				break;
			}
			setState(1905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1904);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class BitmapJoinIndexClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnSortsClause_Context columnSortsClause_() {
			return getRuleContext(ColumnSortsClause_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BitmapJoinIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitBitmapJoinIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitmapJoinIndexClauseContext bitmapJoinIndexClause() throws RecognitionException {
		BitmapJoinIndexClauseContext _localctx = new BitmapJoinIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bitmapJoinIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			tableName();
			setState(1908);
			columnSortsClause_();
			setState(1909);
			match(FROM);
			setState(1910);
			tableAlias();
			setState(1911);
			match(WHERE);
			setState(1912);
			expr(0);
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

	public static class ColumnSortsClause_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClause_Context> columnSortClause_() {
			return getRuleContexts(ColumnSortClause_Context.class);
		}
		public ColumnSortClause_Context columnSortClause_(int i) {
			return getRuleContext(ColumnSortClause_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnSortsClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortsClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnSortsClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSortsClause_Context columnSortsClause_() throws RecognitionException {
		ColumnSortsClause_Context _localctx = new ColumnSortsClause_Context(_ctx, getState());
		enterRule(_localctx, 296, RULE_columnSortsClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(LP_);
			setState(1915);
			columnSortClause_();
			setState(1920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1916);
				match(COMMA_);
				setState(1917);
				columnSortClause_();
				}
				}
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1923);
			match(RP_);
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

	public static class ColumnSortClause_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnSortClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSortClause_Context columnSortClause_() throws RecognitionException {
		ColumnSortClause_Context _localctx = new ColumnSortClause_Context(_ctx, getState());
		enterRule(_localctx, 298, RULE_columnSortClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1925);
				tableName();
				}
				break;
			case 2:
				{
				setState(1926);
				alias();
				}
				break;
			}
			setState(1929);
			columnName();
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1930);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class CreateIndexDefinitionClauseContext extends ParserRuleContext {
		public TableIndexClauseContext tableIndexClause() {
			return getRuleContext(TableIndexClauseContext.class,0);
		}
		public BitmapJoinIndexClauseContext bitmapJoinIndexClause() {
			return getRuleContext(BitmapJoinIndexClauseContext.class,0);
		}
		public CreateIndexDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateIndexDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexDefinitionClauseContext createIndexDefinitionClause() throws RecognitionException {
		CreateIndexDefinitionClauseContext _localctx = new CreateIndexDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_createIndexDefinitionClause);
		try {
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1933);
				tableIndexClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				bitmapJoinIndexClause();
				}
				break;
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

	public static class TableAliasContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			tableName();
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
				{
				setState(1938);
				alias();
				}
			}

			setState(1948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1941);
				match(COMMA_);
				setState(1942);
				tableName();
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (SCHEMA - 52)) | (1L << (FUNCTION - 52)) | (1L << (PROCEDURE - 52)) | (1L << (CASE - 52)) | (1L << (WHEN - 52)) | (1L << (CAST - 52)) | (1L << (TRIM - 52)) | (1L << (SUBSTRING - 52)) | (1L << (NATURAL - 52)) | (1L << (JOIN - 52)) | (1L << (FULL - 52)) | (1L << (INNER - 52)) | (1L << (OUTER - 52)) | (1L << (LEFT - 52)) | (1L << (RIGHT - 52)) | (1L << (CROSS - 52)) | (1L << (USING - 52)) | (1L << (IF - 52)) | (1L << (TRUE - 52)) | (1L << (FALSE - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (BEGIN - 119)) | (1L << (COMMIT - 119)) | (1L << (ROLLBACK - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (DOUBLE - 119)) | (1L << (CHARACTER - 119)) | (1L << (ARRAY - 119)) | (1L << (INTERVAL - 119)) | (1L << (TIME - 119)) | (1L << (TIMESTAMP - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (YEAR - 119)) | (1L << (QUARTER - 119)) | (1L << (MONTH - 119)) | (1L << (WEEK - 119)) | (1L << (DAY - 119)) | (1L << (HOUR - 119)) | (1L << (MINUTE - 119)) | (1L << (SECOND - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (PRESERVE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (CURRENT_USER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (CLOSE - 119)) | (1L << (OPEN - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (COLLATION - 119)) | (1L << (NAMES - 119)) | (1L << (INTEGER - 119)) | (1L << (REAL - 119)) | (1L << (DECIMAL - 119)) | (1L << (TYPE - 119)) | (1L << (BINARY - 119)) | (1L << (ESCAPE - 119)) | (1L << (MOD - 119)) | (1L << (XOR - 119)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (UNKNOWN - 184)) | (1L << (ALWAYS - 184)) | (1L << (CASCADE - 184)) | (1L << (GENERATED - 184)) | (1L << (PRIVILEGES - 184)) | (1L << (READ - 184)) | (1L << (WRITE - 184)) | (1L << (REFERENCES - 184)) | (1L << (TRANSACTION - 184)) | (1L << (ROLE - 184)) | (1L << (VISIBLE - 184)) | (1L << (INVISIBLE - 184)) | (1L << (EXECUTE - 184)) | (1L << (USE - 184)) | (1L << (DEBUG - 184)) | (1L << (UNDER - 184)) | (1L << (FLASHBACK - 184)) | (1L << (ARCHIVE - 184)) | (1L << (REFRESH - 184)) | (1L << (QUERY - 184)) | (1L << (REWRITE - 184)) | (1L << (KEEP - 184)) | (1L << (SEQUENCE - 184)) | (1L << (INHERIT - 184)) | (1L << (TRANSLATE - 184)) | (1L << (MERGE - 184)) | (1L << (AT - 184)) | (1L << (BITMAP - 184)) | (1L << (CACHE - 184)) | (1L << (NOCACHE - 184)) | (1L << (CHECKPOINT - 184)) | (1L << (CONNECT - 184)) | (1L << (CONSTRAINTS - 184)) | (1L << (CYCLE - 184)) | (1L << (NOCYCLE - 184)) | (1L << (DBTIMEZONE - 184)) | (1L << (ENCRYPT - 184)) | (1L << (DECRYPT - 184)) | (1L << (DEFERRABLE - 184)) | (1L << (DEFERRED - 184)) | (1L << (EDITION - 184)) | (1L << (ELEMENT - 184)) | (1L << (END - 184)) | (1L << (EXCEPTIONS - 184)) | (1L << (FORCE - 184)) | (1L << (GLOBAL - 184)) | (1L << (IDENTITY - 184)) | (1L << (INITIALLY - 184)) | (1L << (INVALIDATE - 184)) | (1L << (JAVA - 184)) | (1L << (LEVELS - 184)) | (1L << (MAXVALUE - 184)) | (1L << (MINVALUE - 184)) | (1L << (NOMAXVALUE - 184)) | (1L << (NOMINVALUE - 184)) | (1L << (MINING - 184)) | (1L << (MODEL - 184)))) != 0) || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (NATIONAL - 249)) | (1L << (NEW - 249)) | (1L << (NOORDER - 249)) | (1L << (NORELY - 249)) | (1L << (ONLY - 249)) | (1L << (PROFILE - 249)) | (1L << (REF - 249)) | (1L << (REKEY - 249)) | (1L << (RELY - 249)) | (1L << (REPLACE - 249)) | (1L << (SALT - 249)) | (1L << (SCOPE - 249)) | (1L << (SORT - 249)) | (1L << (SOURCE - 249)) | (1L << (SUBSTITUTABLE - 249)) | (1L << (TABLESPACE - 249)) | (1L << (TEMPORARY - 249)) | (1L << (TRANSLATION - 249)) | (1L << (TREAT - 249)) | (1L << (NO - 249)) | (1L << (UNUSED - 249)) | (1L << (NOVALIDATE - 249)) | (1L << (VALUE - 249)) | (1L << (VARYING - 249)) | (1L << (VIRTUAL - 249)) | (1L << (ZONE - 249)) | (1L << (ADVISOR - 249)) | (1L << (ADMINISTER - 249)) | (1L << (TUNING - 249)) | (1L << (MANAGE - 249)) | (1L << (MANAGEMENT - 249)) | (1L << (OBJECT - 249)) | (1L << (CLUSTER - 249)) | (1L << (CONTEXT - 249)) | (1L << (EXEMPT - 249)) | (1L << (REDACTION - 249)) | (1L << (POLICY - 249)) | (1L << (DATABASE - 249)) | (1L << (SYSTEM - 249)) | (1L << (AUDIT - 249)) | (1L << (LINK - 249)) | (1L << (ANALYZE - 249)) | (1L << (DICTIONARY - 249)) | (1L << (DIMENSION - 249)) | (1L << (INDEXTYPE - 249)) | (1L << (EXTERNAL - 249)) | (1L << (JOB - 249)) | (1L << (CLASS - 249)) | (1L << (PROGRAM - 249)) | (1L << (SCHEDULER - 249)) | (1L << (LIBRARY - 249)) | (1L << (LOGMINING - 249)) | (1L << (MATERIALIZED - 249)) | (1L << (CUBE - 249)))) != 0) || ((((_la - 313)) & ~0x3f) == 0 && ((1L << (_la - 313)) & ((1L << (MEASURE - 313)) | (1L << (FOLDER - 313)) | (1L << (BUILD - 313)) | (1L << (PROCESS - 313)) | (1L << (OPERATOR - 313)) | (1L << (OUTLINE - 313)) | (1L << (PLUGGABLE - 313)) | (1L << (CONTAINER - 313)) | (1L << (SEGMENT - 313)) | (1L << (RESTRICTED - 313)) | (1L << (COST - 313)) | (1L << (SYNONYM - 313)) | (1L << (BACKUP - 313)) | (1L << (UNLIMITED - 313)) | (1L << (BECOME - 313)) | (1L << (CHANGE - 313)) | (1L << (NOTIFICATION - 313)) | (1L << (ACCESS - 313)) | (1L << (PRIVILEGE - 313)) | (1L << (PURGE - 313)) | (1L << (RESUMABLE - 313)) | (1L << (SYSGUID - 313)) | (1L << (SYSBACKUP - 313)) | (1L << (SYSDBA - 313)) | (1L << (SYSDG - 313)) | (1L << (SYSKM - 313)) | (1L << (SYSOPER - 313)) | (1L << (DBA_RECYCLEBIN - 313)) | (1L << (FIRST - 313)) | (1L << (IDENTIFIER_ - 313)) | (1L << (STRING_ - 313)))) != 0)) {
					{
					setState(1943);
					alias();
					}
				}

				}
				}
				setState(1950);
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

	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_alterDefinitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1951);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(1952);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(1953);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(1954);
				alterExternalTable();
				}
				break;
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableSpecificationContext renameTableSpecification() {
			return getRuleContext(RenameTableSpecificationContext.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecificationContext encryptionSpecification() {
			return getRuleContext(EncryptionSpecificationContext.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_alterTableProperties);
		try {
			setState(1960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				renameTableSpecification();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				match(REKEY);
				setState(1959);
				encryptionSpecification();
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

	public static class RenameTableSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameTableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameTableSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameTableSpecificationContext renameTableSpecification() throws RecognitionException {
		RenameTableSpecificationContext _localctx = new RenameTableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_renameTableSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(RENAME);
			setState(1963);
			match(TO);
			setState(1964);
			identifier();
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OperateColumnClauseContext> operateColumnClause() {
			return getRuleContexts(OperateColumnClauseContext.class);
		}
		public OperateColumnClauseContext operateColumnClause(int i) {
			return getRuleContext(OperateColumnClauseContext.class,i);
		}
		public RenameColumnClauseContext renameColumnClause() {
			return getRuleContext(RenameColumnClauseContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_columnClauses);
		int _la;
		try {
			setState(1972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DROP:
			case ADD:
			case SET:
			case MODIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1966);
					operateColumnClause();
					}
					}
					setState(1969); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DROP) | (1L << ADD) | (1L << SET))) != 0) || _la==MODIFY );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				renameColumnClause();
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

	public static class OperateColumnClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OperateColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOperateColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateColumnClauseContext operateColumnClause() throws RecognitionException {
		OperateColumnClauseContext _localctx = new OperateColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_operateColumnClause);
		try {
			setState(1977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				addColumnSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				modifyColumnSpecification();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1976);
				dropColumnClause();
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			match(ADD);
			setState(1980);
			columnOrVirtualDefinitions();
			setState(1982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1981);
				columnProperties();
				}
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrVirtualDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(1996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				match(LP_);
				setState(1985);
				columnOrVirtualDefinition();
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1986);
					match(COMMA_);
					setState(1987);
					columnOrVirtualDefinition();
					}
					}
					setState(1992);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1993);
				match(RP_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1995);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrVirtualDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_columnOrVirtualDefinition);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				virtualColumnDefinition();
				}
				break;
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2002);
				columnProperty();
				}
				}
				setState(2005); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
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

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			objectTypeColProperties();
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

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectTypeColProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			match(COLUMN);
			setState(2010);
			columnName();
			setState(2011);
			substitutableColumnClause();
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

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSubstitutableColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(2035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(2013);
					match(ELEMENT);
					}
				}

				setState(2016);
				match(IS);
				setState(2017);
				match(OF);
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(2018);
					match(TYPE);
					}
				}

				setState(2021);
				match(LP_);
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(2022);
					match(ONLY);
					}
				}

				setState(2025);
				dataTypeName();
				setState(2026);
				match(RP_);
				}
				break;
			case NOT:
			case SUBSTITUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2028);
					match(NOT);
					}
				}

				setState(2031);
				match(SUBSTITUTABLE);
				setState(2032);
				match(AT);
				setState(2033);
				match(ALL);
				setState(2034);
				match(LEVELS);
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			match(MODIFY);
			setState(2053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case INTEGER:
			case REAL:
			case DECIMAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONNECT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CLUSTER:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case AUDIT:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case SYNONYM:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case ACCESS:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case IDENTIFIER_:
				{
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2038);
					match(LP_);
					}
				}

				setState(2041);
				modifyColProperties();
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2042);
					match(COMMA_);
					setState(2043);
					modifyColProperties();
					}
					}
					setState(2048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(2049);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(2052);
				modifyColSubstitutable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecificationContext encryptionSpecification() {
			return getRuleContext(EncryptionSpecificationContext.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			columnName();
			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (BOOLEAN - 83)) | (1L << (DOUBLE - 83)) | (1L << (CHAR - 83)) | (1L << (INTERVAL - 83)) | (1L << (DATE - 83)) | (1L << (TIMESTAMP - 83)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (INTEGER - 169)) | (1L << (REAL - 169)) | (1L << (DECIMAL - 169)) | (1L << (INT - 169)) | (1L << (SMALLINT - 169)) | (1L << (NUMERIC - 169)) | (1L << (FLOAT - 169)))) != 0) || _la==NATIONAL || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (NCHAR - 342)) | (1L << (RAW - 342)) | (1L << (VARCHAR - 342)) | (1L << (VARCHAR2 - 342)) | (1L << (NVARCHAR2 - 342)) | (1L << (LONG - 342)) | (1L << (BLOB - 342)) | (1L << (CLOB - 342)) | (1L << (NCLOB - 342)) | (1L << (BINARY_FLOAT - 342)) | (1L << (BINARY_DOUBLE - 342)) | (1L << (PLS_INTEGER - 342)) | (1L << (BINARY_INTEGER - 342)) | (1L << (NUMBER - 342)) | (1L << (NATURALN - 342)) | (1L << (POSITIVE - 342)) | (1L << (POSITIVEN - 342)) | (1L << (SIGNTYPE - 342)) | (1L << (SIMPLE_INTEGER - 342)) | (1L << (BFILE - 342)) | (1L << (MLSLABEL - 342)) | (1L << (UROWID - 342)) | (1L << (JSON - 342)) | (1L << (DEC - 342)) | (1L << (IDENTIFIER_ - 342)))) != 0)) {
				{
				setState(2056);
				dataType();
				}
			}

			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2059);
				match(DEFAULT);
				setState(2060);
				expr(0);
				}
			}

			setState(2066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(2063);
				match(ENCRYPT);
				setState(2064);
				encryptionSpecification();
				}
				break;
			case DECRYPT:
				{
				setState(2065);
				match(DECRYPT);
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case DROP:
			case ADD:
			case SET:
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
			case KEY:
			case NOT:
			case NULL:
			case CHECK:
			case REFERENCES:
			case MODIFY:
				break;
			default:
				break;
			}
			setState(2071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				{
				setState(2068);
				inlineConstraint();
				}
				}
				setState(2073);
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyColSubstitutable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			match(COLUMN);
			setState(2075);
			columnName();
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2076);
				match(NOT);
				}
			}

			setState(2079);
			match(SUBSTITUTABLE);
			setState(2080);
			match(AT);
			setState(2081);
			match(ALL);
			setState(2082);
			match(LEVELS);
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(2083);
				match(FORCE);
				}
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_dropColumnClause);
		int _la;
		try {
			setState(2096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				match(SET);
				setState(2087);
				match(UNUSED);
				setState(2088);
				columnOrColumnList();
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASCADE || _la==INVALIDATE) {
					{
					{
					setState(2089);
					cascadeOrInvalidate();
					}
					}
					setState(2094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
				dropColumnSpecification();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			match(DROP);
			setState(2099);
			columnOrColumnList();
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==INVALIDATE) {
				{
				{
				setState(2100);
				cascadeOrInvalidate();
				}
				}
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(2106);
				checkpointNumber();
				}
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitColumnOrColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_columnOrColumnList);
		int _la;
		try {
			setState(2122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2109);
				match(COLUMN);
				setState(2110);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				match(LP_);
				setState(2112);
				columnName();
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2113);
					match(COMMA_);
					setState(2114);
					columnName();
					}
					}
					setState(2119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2120);
				match(RP_);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCascadeOrInvalidate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_cascadeOrInvalidate);
		try {
			setState(2127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				match(CASCADE);
				setState(2125);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCheckpointNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(CHECKPOINT);
			setState(2130);
			match(NUMBER_);
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

	public static class RenameColumnClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameColumnClauseContext renameColumnClause() throws RecognitionException {
		RenameColumnClauseContext _localctx = new RenameColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_renameColumnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(RENAME);
			setState(2133);
			match(COLUMN);
			setState(2134);
			columnName();
			setState(2135);
			match(TO);
			setState(2136);
			columnName();
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_constraintClauses);
		int _la;
		try {
			setState(2146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(2138);
				addConstraintSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(2140);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2141);
					dropConstraintClause();
					}
					}
					setState(2144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			match(ADD);
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2149);
					outOfLineConstraint();
					}
					}
					setState(2152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK );
				}
				break;
			case 2:
				{
				setState(2154);
				outOfLineRefConstraint();
				}
				break;
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitModifyConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(MODIFY);
			setState(2158);
			constraintOption();
			setState(2160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2159);
				constraintState();
				}
				}
				setState(2162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (USING - 91)) | (1L << (NOT - 91)) | (1L << (ENABLE - 91)) | (1L << (DISABLE - 91)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (DEFERRABLE - 225)) | (1L << (EXCEPTIONS - 225)) | (1L << (INITIALLY - 225)) | (1L << (NORELY - 225)) | (1L << (RELY - 225)) | (1L << (VALIDATE - 225)) | (1L << (NOVALIDATE - 225)))) != 0) );
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(2164);
				match(CASCADE);
				}
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintWithName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(CONSTRAINT);
			setState(2168);
			ignoredIdentifier();
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_constraintOption);
		try {
			setState(2172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				constraintWithName();
				}
				break;
			case PRIMARY:
			case UNIQUE:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitConstraintPrimaryOrUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_constraintPrimaryOrUnique);
		try {
			setState(2177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2174);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				match(UNIQUE);
				setState(2176);
				columnNames();
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			match(RENAME);
			setState(2180);
			constraintWithName();
			setState(2181);
			match(TO);
			setState(2182);
			ignoredIdentifier();
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(DROP);
			setState(2198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(2185);
				constraintPrimaryOrUnique();
				setState(2187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2186);
					match(CASCADE);
					}
				}

				setState(2191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2189);
					_la = _input.LA(1);
					if ( !(_la==DROP || _la==KEEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2190);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(2193);
				match(CONSTRAINT);
				setState(2194);
				ignoredIdentifier();
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(2195);
					match(CASCADE);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnSpecificationContext> addColumnSpecification() {
			return getRuleContexts(AddColumnSpecificationContext.class);
		}
		public AddColumnSpecificationContext addColumnSpecification(int i) {
			return getRuleContext(AddColumnSpecificationContext.class,i);
		}
		public List<ModifyColumnSpecificationContext> modifyColumnSpecification() {
			return getRuleContexts(ModifyColumnSpecificationContext.class);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification(int i) {
			return getRuleContext(ModifyColumnSpecificationContext.class,i);
		}
		public List<DropColumnSpecificationContext> dropColumnSpecification() {
			return getRuleContexts(DropColumnSpecificationContext.class);
		}
		public DropColumnSpecificationContext dropColumnSpecification(int i) {
			return getRuleContext(DropColumnSpecificationContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterExternalTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(2203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(2200);
					addColumnSpecification();
					}
					break;
				case MODIFY:
					{
					setState(2201);
					modifyColumnSpecification();
					}
					break;
				case DROP:
					{
					setState(2202);
					dropColumnSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DROP || _la==ADD || _la==MODIFY );
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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			objectProperty();
			setState(2212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2208);
				match(COMMA_);
				setState(2209);
				objectProperty();
				}
				}
				setState(2214);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_objectProperty);
		int _la;
		try {
			setState(2236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2215);
					columnName();
					}
					break;
				case 2:
					{
					setState(2216);
					attributeName();
					}
					break;
				}
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2219);
					match(DEFAULT);
					setState(2220);
					expr(0);
					}
				}

				setState(2232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (KEY - 61)) | (1L << (NOT - 61)) | (1L << (NULL - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
						{
						{
						setState(2223);
						inlineConstraint();
						}
						}
						setState(2228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CONSTRAINT || _la==WITH || _la==REFERENCES || _la==SCOPE) {
						{
						setState(2229);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2234);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2235);
				outOfLineRefConstraint();
				}
				break;
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

	public static class RenameIndexClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRenameIndexClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameIndexClauseContext renameIndexClause() throws RecognitionException {
		RenameIndexClauseContext _localctx = new RenameIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_renameIndexClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(2238);
				match(RENAME);
				setState(2239);
				match(TO);
				setState(2240);
				indexName();
				}
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

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(SET);
			setState(2244);
			match(TRANSACTION);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			match(COMMIT);
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

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			match(ROLLBACK);
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

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(SAVEPOINT);
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public ObjectPrivilegeClauseContext objectPrivilegeClause() {
			return getRuleContext(ObjectPrivilegeClauseContext.class,0);
		}
		public SystemPrivilegeClauseContext systemPrivilegeClause() {
			return getRuleContext(SystemPrivilegeClauseContext.class,0);
		}
		public RoleClauseContext roleClause() {
			return getRuleContext(RoleClauseContext.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			match(GRANT);
			setState(2256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2253);
				objectPrivilegeClause();
				}
				break;
			case 2:
				{
				setState(2254);
				systemPrivilegeClause();
				}
				break;
			case 3:
				{
				setState(2255);
				roleClause();
				}
				break;
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public ObjectPrivilegeClauseContext objectPrivilegeClause() {
			return getRuleContext(ObjectPrivilegeClauseContext.class,0);
		}
		public SystemPrivilegeClauseContext systemPrivilegeClause() {
			return getRuleContext(SystemPrivilegeClauseContext.class,0);
		}
		public RoleClauseContext roleClause() {
			return getRuleContext(RoleClauseContext.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			match(REVOKE);
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2259);
				objectPrivilegeClause();
				}
				break;
			case 2:
				{
				setState(2260);
				systemPrivilegeClause();
				}
				break;
			case 3:
				{
				setState(2261);
				roleClause();
				}
				break;
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

	public static class ObjectPrivilegeClauseContext extends ParserRuleContext {
		public ObjectPrivilegesContext objectPrivileges() {
			return getRuleContext(ObjectPrivilegesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public ObjectPrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivilegeClauseContext objectPrivilegeClause() throws RecognitionException {
		ObjectPrivilegeClauseContext _localctx = new ObjectPrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_objectPrivilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			objectPrivileges();
			setState(2265);
			match(ON);
			setState(2266);
			onObjectClause();
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

	public static class SystemPrivilegeClauseContext extends ParserRuleContext {
		public SystemPrivilegeContext systemPrivilege() {
			return getRuleContext(SystemPrivilegeContext.class,0);
		}
		public SystemPrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilegeClauseContext systemPrivilegeClause() throws RecognitionException {
		SystemPrivilegeClauseContext _localctx = new SystemPrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_systemPrivilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			systemPrivilege();
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

	public static class RoleClauseContext extends ParserRuleContext {
		public IgnoredIdentifiersContext ignoredIdentifiers() {
			return getRuleContext(IgnoredIdentifiersContext.class,0);
		}
		public RoleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRoleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleClauseContext roleClause() throws RecognitionException {
		RoleClauseContext _localctx = new RoleClauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_roleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			ignoredIdentifiers();
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

	public static class ObjectPrivilegesContext extends ParserRuleContext {
		public List<ObjectPrivilegeTypeContext> objectPrivilegeType() {
			return getRuleContexts(ObjectPrivilegeTypeContext.class);
		}
		public ObjectPrivilegeTypeContext objectPrivilegeType(int i) {
			return getRuleContext(ObjectPrivilegeTypeContext.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivileges; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivilegesContext objectPrivileges() throws RecognitionException {
		ObjectPrivilegesContext _localctx = new ObjectPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_objectPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			objectPrivilegeType();
			setState(2274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
				{
				setState(2273);
				columnNames();
				}
			}

			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2276);
				match(COMMA_);
				setState(2277);
				objectPrivilegeType();
				setState(2279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << TRUNCATE) | (1L << SCHEMA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (PROCEDURE - 68)) | (1L << (CASE - 68)) | (1L << (WHEN - 68)) | (1L << (CAST - 68)) | (1L << (TRIM - 68)) | (1L << (SUBSTRING - 68)) | (1L << (NATURAL - 68)) | (1L << (JOIN - 68)) | (1L << (FULL - 68)) | (1L << (INNER - 68)) | (1L << (OUTER - 68)) | (1L << (LEFT - 68)) | (1L << (RIGHT - 68)) | (1L << (CROSS - 68)) | (1L << (USING - 68)) | (1L << (IF - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (BEGIN - 68)) | (1L << (COMMIT - 68)) | (1L << (ROLLBACK - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (DOUBLE - 68)) | (1L << (CHARACTER - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (YEAR - 132)) | (1L << (QUARTER - 132)) | (1L << (MONTH - 132)) | (1L << (WEEK - 132)) | (1L << (DAY - 132)) | (1L << (HOUR - 132)) | (1L << (MINUTE - 132)) | (1L << (SECOND - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (PRESERVE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (CURRENT_USER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (CLOSE - 132)) | (1L << (OPEN - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (COLLATION - 132)) | (1L << (NAMES - 132)) | (1L << (INTEGER - 132)) | (1L << (REAL - 132)) | (1L << (DECIMAL - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (ESCAPE - 132)) | (1L << (MOD - 132)) | (1L << (XOR - 132)) | (1L << (UNKNOWN - 132)) | (1L << (ALWAYS - 132)) | (1L << (CASCADE - 132)) | (1L << (GENERATED - 132)) | (1L << (PRIVILEGES - 132)) | (1L << (READ - 132)) | (1L << (WRITE - 132)) | (1L << (REFERENCES - 132)) | (1L << (TRANSACTION - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ROLE - 196)) | (1L << (VISIBLE - 196)) | (1L << (INVISIBLE - 196)) | (1L << (EXECUTE - 196)) | (1L << (USE - 196)) | (1L << (DEBUG - 196)) | (1L << (UNDER - 196)) | (1L << (FLASHBACK - 196)) | (1L << (ARCHIVE - 196)) | (1L << (REFRESH - 196)) | (1L << (QUERY - 196)) | (1L << (REWRITE - 196)) | (1L << (KEEP - 196)) | (1L << (SEQUENCE - 196)) | (1L << (INHERIT - 196)) | (1L << (TRANSLATE - 196)) | (1L << (MERGE - 196)) | (1L << (AT - 196)) | (1L << (BITMAP - 196)) | (1L << (CACHE - 196)) | (1L << (NOCACHE - 196)) | (1L << (CHECKPOINT - 196)) | (1L << (CONNECT - 196)) | (1L << (CONSTRAINTS - 196)) | (1L << (CYCLE - 196)) | (1L << (NOCYCLE - 196)) | (1L << (DBTIMEZONE - 196)) | (1L << (ENCRYPT - 196)) | (1L << (DECRYPT - 196)) | (1L << (DEFERRABLE - 196)) | (1L << (DEFERRED - 196)) | (1L << (EDITION - 196)) | (1L << (ELEMENT - 196)) | (1L << (END - 196)) | (1L << (EXCEPTIONS - 196)) | (1L << (FORCE - 196)) | (1L << (GLOBAL - 196)) | (1L << (IDENTITY - 196)) | (1L << (INITIALLY - 196)) | (1L << (INVALIDATE - 196)) | (1L << (JAVA - 196)) | (1L << (LEVELS - 196)) | (1L << (MAXVALUE - 196)) | (1L << (MINVALUE - 196)) | (1L << (NOMAXVALUE - 196)) | (1L << (NOMINVALUE - 196)) | (1L << (MINING - 196)) | (1L << (MODEL - 196)) | (1L << (NATIONAL - 196)) | (1L << (NEW - 196)) | (1L << (NOORDER - 196)) | (1L << (NORELY - 196)) | (1L << (ONLY - 196)) | (1L << (PROFILE - 196)) | (1L << (REF - 196)) | (1L << (REKEY - 196)) | (1L << (RELY - 196)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REPLACE - 261)) | (1L << (SALT - 261)) | (1L << (SCOPE - 261)) | (1L << (SORT - 261)) | (1L << (SOURCE - 261)) | (1L << (SUBSTITUTABLE - 261)) | (1L << (TABLESPACE - 261)) | (1L << (TEMPORARY - 261)) | (1L << (TRANSLATION - 261)) | (1L << (TREAT - 261)) | (1L << (NO - 261)) | (1L << (UNUSED - 261)) | (1L << (NOVALIDATE - 261)) | (1L << (VALUE - 261)) | (1L << (VARYING - 261)) | (1L << (VIRTUAL - 261)) | (1L << (ZONE - 261)) | (1L << (ADVISOR - 261)) | (1L << (ADMINISTER - 261)) | (1L << (TUNING - 261)) | (1L << (MANAGE - 261)) | (1L << (MANAGEMENT - 261)) | (1L << (OBJECT - 261)) | (1L << (CLUSTER - 261)) | (1L << (CONTEXT - 261)) | (1L << (EXEMPT - 261)) | (1L << (REDACTION - 261)) | (1L << (POLICY - 261)) | (1L << (DATABASE - 261)) | (1L << (SYSTEM - 261)) | (1L << (AUDIT - 261)) | (1L << (LINK - 261)) | (1L << (ANALYZE - 261)) | (1L << (DICTIONARY - 261)) | (1L << (DIMENSION - 261)) | (1L << (INDEXTYPE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (JOB - 261)) | (1L << (CLASS - 261)) | (1L << (PROGRAM - 261)) | (1L << (SCHEDULER - 261)) | (1L << (LIBRARY - 261)) | (1L << (LOGMINING - 261)) | (1L << (MATERIALIZED - 261)) | (1L << (CUBE - 261)) | (1L << (MEASURE - 261)) | (1L << (FOLDER - 261)) | (1L << (BUILD - 261)) | (1L << (PROCESS - 261)) | (1L << (OPERATOR - 261)) | (1L << (OUTLINE - 261)) | (1L << (PLUGGABLE - 261)) | (1L << (CONTAINER - 261)) | (1L << (SEGMENT - 261)) | (1L << (RESTRICTED - 261)) | (1L << (COST - 261)) | (1L << (SYNONYM - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (BACKUP - 325)) | (1L << (UNLIMITED - 325)) | (1L << (BECOME - 325)) | (1L << (CHANGE - 325)) | (1L << (NOTIFICATION - 325)) | (1L << (ACCESS - 325)) | (1L << (PRIVILEGE - 325)) | (1L << (PURGE - 325)) | (1L << (RESUMABLE - 325)) | (1L << (SYSGUID - 325)) | (1L << (SYSBACKUP - 325)) | (1L << (SYSDBA - 325)) | (1L << (SYSDG - 325)) | (1L << (SYSKM - 325)) | (1L << (SYSOPER - 325)) | (1L << (DBA_RECYCLEBIN - 325)) | (1L << (FIRST - 325)) | (1L << (IDENTIFIER_ - 325)))) != 0)) {
					{
					setState(2278);
					columnNames();
					}
				}

				}
				}
				setState(2285);
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

	public static class ObjectPrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public ObjectPrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitObjectPrivilegeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPrivilegeTypeContext objectPrivilegeType() throws RecognitionException {
		ObjectPrivilegeTypeContext _localctx = new ObjectPrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_objectPrivilegeType);
		try {
			setState(2318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2286);
				match(ALL);
				setState(2288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2287);
					match(PRIVILEGES);
					}
					break;
				}
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2290);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2291);
				match(INSERT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2292);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2293);
				match(UPDATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(2294);
				match(ALTER);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(2295);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2296);
				match(WRITE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2297);
				match(EXECUTE);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2298);
				match(USE);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(2299);
				match(INDEX);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 12);
				{
				setState(2300);
				match(REFERENCES);
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 13);
				{
				setState(2301);
				match(DEBUG);
				}
				break;
			case UNDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(2302);
				match(UNDER);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 15);
				{
				setState(2303);
				match(FLASHBACK);
				setState(2304);
				match(ARCHIVE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 16);
				{
				setState(2305);
				match(ON);
				setState(2306);
				match(COMMIT);
				setState(2307);
				match(REFRESH);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 17);
				{
				setState(2308);
				match(QUERY);
				setState(2309);
				match(REWRITE);
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 18);
				{
				setState(2310);
				match(KEEP);
				setState(2311);
				match(SEQUENCE);
				}
				break;
			case INHERIT:
				enterOuterAlt(_localctx, 19);
				{
				setState(2312);
				match(INHERIT);
				setState(2313);
				match(PRIVILEGES);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(2314);
				match(TRANSLATE);
				setState(2315);
				match(SQL);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 21);
				{
				setState(2316);
				match(MERGE);
				setState(2317);
				match(VIEW);
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

	public static class OnObjectClauseContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_onObjectClause);
		int _la;
		try {
			setState(2332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2320);
				match(USER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2321);
				match(DIRECTORY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2322);
				match(EDITION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2323);
				match(MINING);
				setState(2324);
				match(MODEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2325);
				match(SQL);
				setState(2326);
				match(TRANSLATION);
				setState(2327);
				match(PROFILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2328);
				match(JAVA);
				setState(2329);
				_la = _input.LA(1);
				if ( !(_la==RESOURCE || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2330);
				tableName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2331);
				tableName();
				}
				break;
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

	public static class SystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public AdvisorFrameworkSystemPrivilegeContext advisorFrameworkSystemPrivilege() {
			return getRuleContext(AdvisorFrameworkSystemPrivilegeContext.class,0);
		}
		public ClustersSystemPrivilegeContext clustersSystemPrivilege() {
			return getRuleContext(ClustersSystemPrivilegeContext.class,0);
		}
		public ContextsSystemPrivilegeContext contextsSystemPrivilege() {
			return getRuleContext(ContextsSystemPrivilegeContext.class,0);
		}
		public DataRedactionSystemPrivilegeContext dataRedactionSystemPrivilege() {
			return getRuleContext(DataRedactionSystemPrivilegeContext.class,0);
		}
		public DatabaseSystemPrivilegeContext databaseSystemPrivilege() {
			return getRuleContext(DatabaseSystemPrivilegeContext.class,0);
		}
		public DatabaseLinksSystemPrivilegeContext databaseLinksSystemPrivilege() {
			return getRuleContext(DatabaseLinksSystemPrivilegeContext.class,0);
		}
		public DebuggingSystemPrivilegeContext debuggingSystemPrivilege() {
			return getRuleContext(DebuggingSystemPrivilegeContext.class,0);
		}
		public DictionariesSystemPrivilegeContext dictionariesSystemPrivilege() {
			return getRuleContext(DictionariesSystemPrivilegeContext.class,0);
		}
		public DimensionsSystemPrivilegeContext dimensionsSystemPrivilege() {
			return getRuleContext(DimensionsSystemPrivilegeContext.class,0);
		}
		public DirectoriesSystemPrivilegeContext directoriesSystemPrivilege() {
			return getRuleContext(DirectoriesSystemPrivilegeContext.class,0);
		}
		public EditionsSystemPrivilegeContext editionsSystemPrivilege() {
			return getRuleContext(EditionsSystemPrivilegeContext.class,0);
		}
		public FlashbackDataArchivesPrivilegeContext flashbackDataArchivesPrivilege() {
			return getRuleContext(FlashbackDataArchivesPrivilegeContext.class,0);
		}
		public IndexesSystemPrivilegeContext indexesSystemPrivilege() {
			return getRuleContext(IndexesSystemPrivilegeContext.class,0);
		}
		public IndexTypesSystemPrivilegeContext indexTypesSystemPrivilege() {
			return getRuleContext(IndexTypesSystemPrivilegeContext.class,0);
		}
		public JobSchedulerObjectsSystemPrivilegeContext jobSchedulerObjectsSystemPrivilege() {
			return getRuleContext(JobSchedulerObjectsSystemPrivilegeContext.class,0);
		}
		public KeyManagementFrameworkSystemPrivilegeContext keyManagementFrameworkSystemPrivilege() {
			return getRuleContext(KeyManagementFrameworkSystemPrivilegeContext.class,0);
		}
		public LibrariesFrameworkSystemPrivilegeContext librariesFrameworkSystemPrivilege() {
			return getRuleContext(LibrariesFrameworkSystemPrivilegeContext.class,0);
		}
		public LogminerFrameworkSystemPrivilegeContext logminerFrameworkSystemPrivilege() {
			return getRuleContext(LogminerFrameworkSystemPrivilegeContext.class,0);
		}
		public MaterizlizedViewsSystemPrivilegeContext materizlizedViewsSystemPrivilege() {
			return getRuleContext(MaterizlizedViewsSystemPrivilegeContext.class,0);
		}
		public MiningModelsSystemPrivilegeContext miningModelsSystemPrivilege() {
			return getRuleContext(MiningModelsSystemPrivilegeContext.class,0);
		}
		public OlapCubesSystemPrivilegeContext olapCubesSystemPrivilege() {
			return getRuleContext(OlapCubesSystemPrivilegeContext.class,0);
		}
		public OlapCubeMeasureFoldersSystemPrivilegeContext olapCubeMeasureFoldersSystemPrivilege() {
			return getRuleContext(OlapCubeMeasureFoldersSystemPrivilegeContext.class,0);
		}
		public OlapCubeDiminsionsSystemPrivilegeContext olapCubeDiminsionsSystemPrivilege() {
			return getRuleContext(OlapCubeDiminsionsSystemPrivilegeContext.class,0);
		}
		public OlapCubeBuildProcessesSystemPrivilegeContext olapCubeBuildProcessesSystemPrivilege() {
			return getRuleContext(OlapCubeBuildProcessesSystemPrivilegeContext.class,0);
		}
		public OperatorsSystemPrivilegeContext operatorsSystemPrivilege() {
			return getRuleContext(OperatorsSystemPrivilegeContext.class,0);
		}
		public OutlinesSystemPrivilegeContext outlinesSystemPrivilege() {
			return getRuleContext(OutlinesSystemPrivilegeContext.class,0);
		}
		public PlanManagementSystemPrivilegeContext planManagementSystemPrivilege() {
			return getRuleContext(PlanManagementSystemPrivilegeContext.class,0);
		}
		public PluggableDatabasesSystemPrivilegeContext pluggableDatabasesSystemPrivilege() {
			return getRuleContext(PluggableDatabasesSystemPrivilegeContext.class,0);
		}
		public ProceduresSystemPrivilegeContext proceduresSystemPrivilege() {
			return getRuleContext(ProceduresSystemPrivilegeContext.class,0);
		}
		public ProfilesSystemPrivilegeContext profilesSystemPrivilege() {
			return getRuleContext(ProfilesSystemPrivilegeContext.class,0);
		}
		public RolesSystemPrivilegeContext rolesSystemPrivilege() {
			return getRuleContext(RolesSystemPrivilegeContext.class,0);
		}
		public RollbackSegmentsSystemPrivilegeContext rollbackSegmentsSystemPrivilege() {
			return getRuleContext(RollbackSegmentsSystemPrivilegeContext.class,0);
		}
		public SequencesSystemPrivilegeContext sequencesSystemPrivilege() {
			return getRuleContext(SequencesSystemPrivilegeContext.class,0);
		}
		public SessionsSystemPrivilegeContext sessionsSystemPrivilege() {
			return getRuleContext(SessionsSystemPrivilegeContext.class,0);
		}
		public SqlTranslationProfilesSystemPrivilegeContext sqlTranslationProfilesSystemPrivilege() {
			return getRuleContext(SqlTranslationProfilesSystemPrivilegeContext.class,0);
		}
		public SynonymsSystemPrivilegeContext synonymsSystemPrivilege() {
			return getRuleContext(SynonymsSystemPrivilegeContext.class,0);
		}
		public TablesSystemPrivilegeContext tablesSystemPrivilege() {
			return getRuleContext(TablesSystemPrivilegeContext.class,0);
		}
		public TablespacesSystemPrivilegeContext tablespacesSystemPrivilege() {
			return getRuleContext(TablespacesSystemPrivilegeContext.class,0);
		}
		public TriggersSystemPrivilegeContext triggersSystemPrivilege() {
			return getRuleContext(TriggersSystemPrivilegeContext.class,0);
		}
		public TypesSystemPrivilegeContext typesSystemPrivilege() {
			return getRuleContext(TypesSystemPrivilegeContext.class,0);
		}
		public UsersSystemPrivilegeContext usersSystemPrivilege() {
			return getRuleContext(UsersSystemPrivilegeContext.class,0);
		}
		public ViewsSystemPrivilegeContext viewsSystemPrivilege() {
			return getRuleContext(ViewsSystemPrivilegeContext.class,0);
		}
		public MiscellaneousSystemPrivilegeContext miscellaneousSystemPrivilege() {
			return getRuleContext(MiscellaneousSystemPrivilegeContext.class,0);
		}
		public SystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilegeContext systemPrivilege() throws RecognitionException {
		SystemPrivilegeContext _localctx = new SystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_systemPrivilege);
		try {
			setState(2379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				match(ALL);
				setState(2335);
				match(PRIVILEGES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2336);
				advisorFrameworkSystemPrivilege();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2337);
				clustersSystemPrivilege();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2338);
				contextsSystemPrivilege();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2339);
				dataRedactionSystemPrivilege();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2340);
				databaseSystemPrivilege();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2341);
				databaseLinksSystemPrivilege();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2342);
				debuggingSystemPrivilege();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2343);
				dictionariesSystemPrivilege();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2344);
				dimensionsSystemPrivilege();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2345);
				directoriesSystemPrivilege();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2346);
				editionsSystemPrivilege();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2347);
				flashbackDataArchivesPrivilege();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2348);
				indexesSystemPrivilege();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2349);
				indexTypesSystemPrivilege();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2350);
				jobSchedulerObjectsSystemPrivilege();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2351);
				keyManagementFrameworkSystemPrivilege();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2352);
				librariesFrameworkSystemPrivilege();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2353);
				logminerFrameworkSystemPrivilege();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2354);
				materizlizedViewsSystemPrivilege();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2355);
				miningModelsSystemPrivilege();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2356);
				olapCubesSystemPrivilege();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2357);
				olapCubeMeasureFoldersSystemPrivilege();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2358);
				olapCubeDiminsionsSystemPrivilege();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2359);
				olapCubeBuildProcessesSystemPrivilege();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2360);
				operatorsSystemPrivilege();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2361);
				outlinesSystemPrivilege();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2362);
				planManagementSystemPrivilege();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2363);
				pluggableDatabasesSystemPrivilege();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2364);
				proceduresSystemPrivilege();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2365);
				profilesSystemPrivilege();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2366);
				rolesSystemPrivilege();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2367);
				rollbackSegmentsSystemPrivilege();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2368);
				sequencesSystemPrivilege();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2369);
				sessionsSystemPrivilege();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2370);
				sqlTranslationProfilesSystemPrivilege();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2371);
				synonymsSystemPrivilege();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2372);
				tablesSystemPrivilege();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2373);
				tablespacesSystemPrivilege();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2374);
				triggersSystemPrivilege();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2375);
				typesSystemPrivilege();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2376);
				usersSystemPrivilege();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2377);
				viewsSystemPrivilege();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2378);
				miscellaneousSystemPrivilege();
				}
				break;
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

	public static class SystemPrivilegeOperationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public SystemPrivilegeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSystemPrivilegeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemPrivilegeOperationContext systemPrivilegeOperation() throws RecognitionException {
		SystemPrivilegeOperationContext _localctx = new SystemPrivilegeOperationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_systemPrivilegeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY) {
				{
				setState(2382);
				match(ANY);
				}
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

	public static class AdvisorFrameworkSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode ADVISOR() { return getToken(OracleStatementParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(OracleStatementParser.TUNING, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public AdvisorFrameworkSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advisorFrameworkSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAdvisorFrameworkSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdvisorFrameworkSystemPrivilegeContext advisorFrameworkSystemPrivilege() throws RecognitionException {
		AdvisorFrameworkSystemPrivilegeContext _localctx = new AdvisorFrameworkSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_advisorFrameworkSystemPrivilege);
		int _la;
		try {
			setState(2402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case SQL:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << INSERT) | (1L << UPDATE) | (1L << DELETE) | (1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0) || _la==EXECUTE) {
					{
					setState(2385);
					systemPrivilegeOperation();
					}
				}

				setState(2388);
				match(SQL);
				setState(2389);
				match(PROFILE);
				}
				break;
			case ADVISOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2390);
				match(ADVISOR);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2391);
				match(ADMINISTER);
				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2392);
					match(ANY);
					}
				}

				setState(2395);
				match(SQL);
				setState(2400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TUNING:
					{
					setState(2396);
					match(TUNING);
					setState(2397);
					match(SET);
					}
					break;
				case MANAGEMENT:
					{
					setState(2398);
					match(MANAGEMENT);
					setState(2399);
					match(OBJECT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ClustersSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode CLUSTER() { return getToken(OracleStatementParser.CLUSTER, 0); }
		public ClustersSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustersSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitClustersSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClustersSystemPrivilegeContext clustersSystemPrivilege() throws RecognitionException {
		ClustersSystemPrivilegeContext _localctx = new ClustersSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_clustersSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			systemPrivilegeOperation();
			setState(2405);
			match(CLUSTER);
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

	public static class ContextsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode CONTEXT() { return getToken(OracleStatementParser.CONTEXT, 0); }
		public ContextsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitContextsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextsSystemPrivilegeContext contextsSystemPrivilege() throws RecognitionException {
		ContextsSystemPrivilegeContext _localctx = new ContextsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_contextsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			systemPrivilegeOperation();
			setState(2408);
			match(CONTEXT);
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

	public static class DataRedactionSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(OracleStatementParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public DataRedactionSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRedactionSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDataRedactionSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRedactionSystemPrivilegeContext dataRedactionSystemPrivilege() throws RecognitionException {
		DataRedactionSystemPrivilegeContext _localctx = new DataRedactionSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_dataRedactionSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(EXEMPT);
			setState(2411);
			match(REDACTION);
			setState(2412);
			match(POLICY);
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

	public static class DatabaseSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(OracleStatementParser.SYSTEM, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public DatabaseSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatabaseSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseSystemPrivilegeContext databaseSystemPrivilege() throws RecognitionException {
		DatabaseSystemPrivilegeContext _localctx = new DatabaseSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_databaseSystemPrivilege);
		int _la;
		try {
			setState(2418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2414);
				match(ALTER);
				setState(2415);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==SYSTEM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case AUDIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				match(AUDIT);
				setState(2417);
				match(SYSTEM);
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

	public static class DatabaseLinksSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode LINK() { return getToken(OracleStatementParser.LINK, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public DatabaseLinksSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseLinksSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDatabaseLinksSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseLinksSystemPrivilegeContext databaseLinksSystemPrivilege() throws RecognitionException {
		DatabaseLinksSystemPrivilegeContext _localctx = new DatabaseLinksSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_databaseLinksSystemPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << ALTER) | (1L << DROP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(2421);
				match(PUBLIC);
				}
			}

			setState(2424);
			match(DATABASE);
			setState(2425);
			match(LINK);
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

	public static class DebuggingSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode CONNECT() { return getToken(OracleStatementParser.CONNECT, 0); }
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public DebuggingSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggingSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDebuggingSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebuggingSystemPrivilegeContext debuggingSystemPrivilege() throws RecognitionException {
		DebuggingSystemPrivilegeContext _localctx = new DebuggingSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_debuggingSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			match(DEBUG);
			setState(2432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONNECT:
				{
				setState(2428);
				match(CONNECT);
				setState(2429);
				match(SESSION);
				}
				break;
			case ANY:
				{
				setState(2430);
				match(ANY);
				setState(2431);
				match(PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DictionariesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public DictionariesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionariesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDictionariesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictionariesSystemPrivilegeContext dictionariesSystemPrivilege() throws RecognitionException {
		DictionariesSystemPrivilegeContext _localctx = new DictionariesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dictionariesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			match(ANALYZE);
			setState(2435);
			match(ANY);
			setState(2436);
			match(DICTIONARY);
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

	public static class DimensionsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public DimensionsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDimensionsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionsSystemPrivilegeContext dimensionsSystemPrivilege() throws RecognitionException {
		DimensionsSystemPrivilegeContext _localctx = new DimensionsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_dimensionsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			systemPrivilegeOperation();
			setState(2439);
			match(DIMENSION);
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

	public static class DirectoriesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public DirectoriesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoriesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDirectoriesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoriesSystemPrivilegeContext directoriesSystemPrivilege() throws RecognitionException {
		DirectoriesSystemPrivilegeContext _localctx = new DirectoriesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_directoriesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			systemPrivilegeOperation();
			setState(2442);
			match(DIRECTORY);
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

	public static class EditionsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public EditionsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editionsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitEditionsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditionsSystemPrivilegeContext editionsSystemPrivilege() throws RecognitionException {
		EditionsSystemPrivilegeContext _localctx = new EditionsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_editionsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			systemPrivilegeOperation();
			setState(2445);
			match(EDITION);
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

	public static class FlashbackDataArchivesPrivilegeContext extends ParserRuleContext {
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public FlashbackDataArchivesPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashbackDataArchivesPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitFlashbackDataArchivesPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlashbackDataArchivesPrivilegeContext flashbackDataArchivesPrivilege() throws RecognitionException {
		FlashbackDataArchivesPrivilegeContext _localctx = new FlashbackDataArchivesPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_flashbackDataArchivesPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(FLASHBACK);
			setState(2448);
			match(ARCHIVE);
			setState(2449);
			match(ADMINISTER);
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

	public static class IndexesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesSystemPrivilegeContext indexesSystemPrivilege() throws RecognitionException {
		IndexesSystemPrivilegeContext _localctx = new IndexesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_indexesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			systemPrivilegeOperation();
			setState(2452);
			match(INDEX);
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

	public static class IndexTypesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode INDEXTYPE() { return getToken(OracleStatementParser.INDEXTYPE, 0); }
		public IndexTypesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitIndexTypesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypesSystemPrivilegeContext indexTypesSystemPrivilege() throws RecognitionException {
		IndexTypesSystemPrivilegeContext _localctx = new IndexTypesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_indexTypesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			systemPrivilegeOperation();
			setState(2455);
			match(INDEXTYPE);
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

	public static class JobSchedulerObjectsSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode JOB() { return getToken(OracleStatementParser.JOB, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode EXTERNAL() { return getToken(OracleStatementParser.EXTERNAL, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode CLASS() { return getToken(OracleStatementParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(OracleStatementParser.PROGRAM, 0); }
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode SCHEDULER() { return getToken(OracleStatementParser.SCHEDULER, 0); }
		public JobSchedulerObjectsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobSchedulerObjectsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitJobSchedulerObjectsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobSchedulerObjectsSystemPrivilegeContext jobSchedulerObjectsSystemPrivilege() throws RecognitionException {
		JobSchedulerObjectsSystemPrivilegeContext _localctx = new JobSchedulerObjectsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_jobSchedulerObjectsSystemPrivilege);
		int _la;
		try {
			setState(2467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457);
				match(CREATE);
				setState(2459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY || _la==EXTERNAL) {
					{
					setState(2458);
					_la = _input.LA(1);
					if ( !(_la==ANY || _la==EXTERNAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2461);
				match(JOB);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2462);
				match(EXECUTE);
				setState(2463);
				match(ANY);
				setState(2464);
				_la = _input.LA(1);
				if ( !(_la==CLASS || _la==PROGRAM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MANAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2465);
				match(MANAGE);
				setState(2466);
				match(SCHEDULER);
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

	public static class KeyManagementFrameworkSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public KeyManagementFrameworkSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyManagementFrameworkSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitKeyManagementFrameworkSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyManagementFrameworkSystemPrivilegeContext keyManagementFrameworkSystemPrivilege() throws RecognitionException {
		KeyManagementFrameworkSystemPrivilegeContext _localctx = new KeyManagementFrameworkSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_keyManagementFrameworkSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2469);
			match(ADMINISTER);
			setState(2470);
			match(KEY);
			setState(2471);
			match(MANAGEMENT);
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

	public static class LibrariesFrameworkSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode LIBRARY() { return getToken(OracleStatementParser.LIBRARY, 0); }
		public LibrariesFrameworkSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_librariesFrameworkSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLibrariesFrameworkSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibrariesFrameworkSystemPrivilegeContext librariesFrameworkSystemPrivilege() throws RecognitionException {
		LibrariesFrameworkSystemPrivilegeContext _localctx = new LibrariesFrameworkSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_librariesFrameworkSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			systemPrivilegeOperation();
			setState(2474);
			match(LIBRARY);
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

	public static class LogminerFrameworkSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode LOGMINING() { return getToken(OracleStatementParser.LOGMINING, 0); }
		public LogminerFrameworkSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logminerFrameworkSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitLogminerFrameworkSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogminerFrameworkSystemPrivilegeContext logminerFrameworkSystemPrivilege() throws RecognitionException {
		LogminerFrameworkSystemPrivilegeContext _localctx = new LogminerFrameworkSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_logminerFrameworkSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(LOGMINING);
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

	public static class MaterizlizedViewsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode MATERIALIZED() { return getToken(OracleStatementParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public MaterizlizedViewsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materizlizedViewsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMaterizlizedViewsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterizlizedViewsSystemPrivilegeContext materizlizedViewsSystemPrivilege() throws RecognitionException {
		MaterizlizedViewsSystemPrivilegeContext _localctx = new MaterizlizedViewsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_materizlizedViewsSystemPrivilege);
		int _la;
		try {
			setState(2493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2478);
				systemPrivilegeOperation();
				setState(2479);
				match(MATERIALIZED);
				setState(2480);
				match(VIEW);
				}
				break;
			case QUERY:
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(2482);
					match(GLOBAL);
					}
				}

				setState(2485);
				match(QUERY);
				setState(2486);
				match(REWRITE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 3);
				{
				setState(2487);
				match(ON);
				setState(2488);
				match(COMMIT);
				setState(2489);
				match(REFRESH);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2490);
				match(FLASHBACK);
				setState(2491);
				match(ANY);
				setState(2492);
				match(TABLE);
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

	public static class MiningModelsSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public MiningModelsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miningModelsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMiningModelsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiningModelsSystemPrivilegeContext miningModelsSystemPrivilege() throws RecognitionException {
		MiningModelsSystemPrivilegeContext _localctx = new MiningModelsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_miningModelsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2495);
				systemPrivilegeOperation();
				}
				break;
			case COMMENT:
				{
				setState(2496);
				match(COMMENT);
				setState(2497);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2500);
			match(MINING);
			setState(2501);
			match(MODEL);
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

	public static class OlapCubesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public OlapCubesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubesSystemPrivilegeContext olapCubesSystemPrivilege() throws RecognitionException {
		OlapCubesSystemPrivilegeContext _localctx = new OlapCubesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_olapCubesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2503);
			systemPrivilegeOperation();
			setState(2504);
			match(CUBE);
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

	public static class OlapCubeMeasureFoldersSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode MEASURE() { return getToken(OracleStatementParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(OracleStatementParser.FOLDER, 0); }
		public OlapCubeMeasureFoldersSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeMeasureFoldersSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeMeasureFoldersSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeMeasureFoldersSystemPrivilegeContext olapCubeMeasureFoldersSystemPrivilege() throws RecognitionException {
		OlapCubeMeasureFoldersSystemPrivilegeContext _localctx = new OlapCubeMeasureFoldersSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_olapCubeMeasureFoldersSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			systemPrivilegeOperation();
			setState(2507);
			match(MEASURE);
			setState(2508);
			match(FOLDER);
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

	public static class OlapCubeDiminsionsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode DIMENSION() { return getToken(OracleStatementParser.DIMENSION, 0); }
		public OlapCubeDiminsionsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeDiminsionsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeDiminsionsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeDiminsionsSystemPrivilegeContext olapCubeDiminsionsSystemPrivilege() throws RecognitionException {
		OlapCubeDiminsionsSystemPrivilegeContext _localctx = new OlapCubeDiminsionsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_olapCubeDiminsionsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			systemPrivilegeOperation();
			setState(2511);
			match(CUBE);
			setState(2512);
			match(DIMENSION);
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

	public static class OlapCubeBuildProcessesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode CUBE() { return getToken(OracleStatementParser.CUBE, 0); }
		public TerminalNode BUILD() { return getToken(OracleStatementParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(OracleStatementParser.PROCESS, 0); }
		public OlapCubeBuildProcessesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapCubeBuildProcessesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOlapCubeBuildProcessesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OlapCubeBuildProcessesSystemPrivilegeContext olapCubeBuildProcessesSystemPrivilege() throws RecognitionException {
		OlapCubeBuildProcessesSystemPrivilegeContext _localctx = new OlapCubeBuildProcessesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_olapCubeBuildProcessesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			systemPrivilegeOperation();
			setState(2515);
			match(CUBE);
			setState(2516);
			match(BUILD);
			setState(2517);
			match(PROCESS);
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

	public static class OperatorsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(OracleStatementParser.OPERATOR, 0); }
		public OperatorsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOperatorsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsSystemPrivilegeContext operatorsSystemPrivilege() throws RecognitionException {
		OperatorsSystemPrivilegeContext _localctx = new OperatorsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_operatorsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			systemPrivilegeOperation();
			setState(2520);
			match(OPERATOR);
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

	public static class OutlinesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode OUTLINE() { return getToken(OracleStatementParser.OUTLINE, 0); }
		public OutlinesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlinesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitOutlinesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutlinesSystemPrivilegeContext outlinesSystemPrivilege() throws RecognitionException {
		OutlinesSystemPrivilegeContext _localctx = new OutlinesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_outlinesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			systemPrivilegeOperation();
			setState(2523);
			match(OUTLINE);
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

	public static class PlanManagementSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MANAGEMENT() { return getToken(OracleStatementParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public PlanManagementSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planManagementSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPlanManagementSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanManagementSystemPrivilegeContext planManagementSystemPrivilege() throws RecognitionException {
		PlanManagementSystemPrivilegeContext _localctx = new PlanManagementSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_planManagementSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			match(ADMINISTER);
			setState(2526);
			match(SQL);
			setState(2527);
			match(MANAGEMENT);
			setState(2528);
			match(OBJECT);
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

	public static class PluggableDatabasesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(OracleStatementParser.PLUGGABLE, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode CONTAINER() { return getToken(OracleStatementParser.CONTAINER, 0); }
		public PluggableDatabasesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluggableDatabasesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitPluggableDatabasesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluggableDatabasesSystemPrivilegeContext pluggableDatabasesSystemPrivilege() throws RecognitionException {
		PluggableDatabasesSystemPrivilegeContext _localctx = new PluggableDatabasesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_pluggableDatabasesSystemPrivilege);
		try {
			setState(2535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2530);
				match(CREATE);
				setState(2531);
				match(PLUGGABLE);
				setState(2532);
				match(DATABASE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2533);
				match(SET);
				setState(2534);
				match(CONTAINER);
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

	public static class ProceduresSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(OracleStatementParser.PROCEDURE, 0); }
		public ProceduresSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceduresSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProceduresSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceduresSystemPrivilegeContext proceduresSystemPrivilege() throws RecognitionException {
		ProceduresSystemPrivilegeContext _localctx = new ProceduresSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_proceduresSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			systemPrivilegeOperation();
			setState(2538);
			match(PROCEDURE);
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

	public static class ProfilesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public ProfilesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profilesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitProfilesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProfilesSystemPrivilegeContext profilesSystemPrivilege() throws RecognitionException {
		ProfilesSystemPrivilegeContext _localctx = new ProfilesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_profilesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			systemPrivilegeOperation();
			setState(2541);
			match(PROFILE);
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

	public static class RolesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public RolesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRolesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesSystemPrivilegeContext rolesSystemPrivilege() throws RecognitionException {
		RolesSystemPrivilegeContext _localctx = new RolesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_rolesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2543);
				systemPrivilegeOperation();
				}
				break;
			case GRANT:
				{
				setState(2544);
				match(GRANT);
				setState(2545);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2548);
			match(ROLE);
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

	public static class RollbackSegmentsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public TerminalNode SEGMENT() { return getToken(OracleStatementParser.SEGMENT, 0); }
		public RollbackSegmentsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackSegmentsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitRollbackSegmentsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackSegmentsSystemPrivilegeContext rollbackSegmentsSystemPrivilege() throws RecognitionException {
		RollbackSegmentsSystemPrivilegeContext _localctx = new RollbackSegmentsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_rollbackSegmentsSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			systemPrivilegeOperation();
			setState(2551);
			match(ROLLBACK);
			setState(2552);
			match(SEGMENT);
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

	public static class SequencesSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public SequencesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSequencesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequencesSystemPrivilegeContext sequencesSystemPrivilege() throws RecognitionException {
		SequencesSystemPrivilegeContext _localctx = new SequencesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_sequencesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			systemPrivilegeOperation();
			setState(2555);
			match(SEQUENCE);
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

	public static class SessionsSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(OracleStatementParser.SESSION, 0); }
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode RESTRICTED() { return getToken(OracleStatementParser.RESTRICTED, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public TerminalNode COST() { return getToken(OracleStatementParser.COST, 0); }
		public SessionsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSessionsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionsSystemPrivilegeContext sessionsSystemPrivilege() throws RecognitionException {
		SessionsSystemPrivilegeContext _localctx = new SessionsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_sessionsSystemPrivilege);
		int _la;
		try {
			setState(2562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				_la = _input.LA(1);
				if ( !(_la==CREATE || _la==ALTER || _la==RESTRICTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2558);
				match(SESSION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2559);
				match(ALTER);
				setState(2560);
				match(RESOURCE);
				setState(2561);
				match(COST);
				}
				break;
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

	public static class SqlTranslationProfilesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public SqlTranslationProfilesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTranslationProfilesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSqlTranslationProfilesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTranslationProfilesSystemPrivilegeContext sqlTranslationProfilesSystemPrivilege() throws RecognitionException {
		SqlTranslationProfilesSystemPrivilegeContext _localctx = new SqlTranslationProfilesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_sqlTranslationProfilesSystemPrivilege);
		try {
			setState(2575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case INSERT:
				case UPDATE:
				case DELETE:
				case CREATE:
				case ALTER:
				case DROP:
				case EXECUTE:
					{
					setState(2564);
					systemPrivilegeOperation();
					}
					break;
				case USE:
					{
					setState(2565);
					match(USE);
					setState(2566);
					match(ANY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2569);
				match(SQL);
				setState(2570);
				match(TRANSLATION);
				setState(2571);
				match(PROFILE);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2572);
				match(TRANSLATE);
				setState(2573);
				match(ANY);
				setState(2574);
				match(SQL);
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

	public static class SynonymsSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode SYNONYM() { return getToken(OracleStatementParser.SYNONYM, 0); }
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode PUBLIC() { return getToken(OracleStatementParser.PUBLIC, 0); }
		public SynonymsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonymsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitSynonymsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynonymsSystemPrivilegeContext synonymsSystemPrivilege() throws RecognitionException {
		SynonymsSystemPrivilegeContext _localctx = new SynonymsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_synonymsSystemPrivilege);
		try {
			setState(2583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2577);
				systemPrivilegeOperation();
				setState(2578);
				match(SYNONYM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2580);
				match(DROP);
				setState(2581);
				match(PUBLIC);
				setState(2582);
				match(SYNONYM);
				}
				break;
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

	public static class TablesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode BACKUP() { return getToken(OracleStatementParser.BACKUP, 0); }
		public TerminalNode LOCK() { return getToken(OracleStatementParser.LOCK, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TablesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesSystemPrivilegeContext tablesSystemPrivilege() throws RecognitionException {
		TablesSystemPrivilegeContext _localctx = new TablesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_tablesSystemPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2585);
				systemPrivilegeOperation();
				}
				break;
			case READ:
			case FLASHBACK:
			case LOCK:
			case BACKUP:
				{
				setState(2586);
				_la = _input.LA(1);
				if ( !(_la==READ || _la==FLASHBACK || _la==LOCK || _la==BACKUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2587);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2590);
			match(TABLE);
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

	public static class TablespacesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode MANAGE() { return getToken(OracleStatementParser.MANAGE, 0); }
		public TerminalNode UNLIMITED() { return getToken(OracleStatementParser.UNLIMITED, 0); }
		public TablespacesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespacesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTablespacesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespacesSystemPrivilegeContext tablespacesSystemPrivilege() throws RecognitionException {
		TablespacesSystemPrivilegeContext _localctx = new TablespacesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_tablespacesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2592);
				systemPrivilegeOperation();
				}
				break;
			case MANAGE:
				{
				setState(2593);
				match(MANAGE);
				}
				break;
			case UNLIMITED:
				{
				setState(2594);
				match(UNLIMITED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2597);
			match(TABLESPACE);
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

	public static class TriggersSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode TRIGGER() { return getToken(OracleStatementParser.TRIGGER, 0); }
		public TerminalNode ADMINISTER() { return getToken(OracleStatementParser.ADMINISTER, 0); }
		public TerminalNode DATABASE() { return getToken(OracleStatementParser.DATABASE, 0); }
		public TriggersSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggersSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTriggersSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggersSystemPrivilegeContext triggersSystemPrivilege() throws RecognitionException {
		TriggersSystemPrivilegeContext _localctx = new TriggersSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_triggersSystemPrivilege);
		try {
			setState(2605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2599);
				systemPrivilegeOperation();
				setState(2600);
				match(TRIGGER);
				}
				break;
			case ADMINISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				match(ADMINISTER);
				setState(2603);
				match(DATABASE);
				setState(2604);
				match(TRIGGER);
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

	public static class TypesSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TypesSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitTypesSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesSystemPrivilegeContext typesSystemPrivilege() throws RecognitionException {
		TypesSystemPrivilegeContext _localctx = new TypesSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_typesSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2607);
				systemPrivilegeOperation();
				}
				break;
			case UNDER:
				{
				setState(2608);
				match(UNDER);
				setState(2609);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2612);
			match(TYPE);
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

	public static class UsersSystemPrivilegeContext extends ParserRuleContext {
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public UsersSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usersSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitUsersSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsersSystemPrivilegeContext usersSystemPrivilege() throws RecognitionException {
		UsersSystemPrivilegeContext _localctx = new UsersSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_usersSystemPrivilege);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			systemPrivilegeOperation();
			setState(2615);
			match(USER);
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

	public static class ViewsSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public SystemPrivilegeOperationContext systemPrivilegeOperation() {
			return getRuleContext(SystemPrivilegeOperationContext.class,0);
		}
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public ViewsSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewsSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitViewsSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewsSystemPrivilegeContext viewsSystemPrivilege() throws RecognitionException {
		ViewsSystemPrivilegeContext _localctx = new ViewsSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_viewsSystemPrivilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case EXECUTE:
				{
				setState(2617);
				systemPrivilegeOperation();
				}
				break;
			case UNDER:
			case MERGE:
				{
				setState(2618);
				_la = _input.LA(1);
				if ( !(_la==UNDER || _la==MERGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2619);
				match(ANY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2622);
			match(VIEW);
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

	public static class MiscellaneousSystemPrivilegeContext extends ParserRuleContext {
		public TerminalNode ANALYZE() { return getToken(OracleStatementParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
		public TerminalNode AUDIT() { return getToken(OracleStatementParser.AUDIT, 0); }
		public TerminalNode BECOME() { return getToken(OracleStatementParser.BECOME, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode CHANGE() { return getToken(OracleStatementParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(OracleStatementParser.NOTIFICATION, 0); }
		public TerminalNode COMMENT() { return getToken(OracleStatementParser.COMMENT, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TerminalNode EXEMPT() { return getToken(OracleStatementParser.EXEMPT, 0); }
		public TerminalNode ACCESS() { return getToken(OracleStatementParser.ACCESS, 0); }
		public TerminalNode POLICY() { return getToken(OracleStatementParser.POLICY, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public TerminalNode PRIVILEGE() { return getToken(OracleStatementParser.PRIVILEGE, 0); }
		public TerminalNode OBJECT() { return getToken(OracleStatementParser.OBJECT, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode SYSGUID() { return getToken(OracleStatementParser.SYSGUID, 0); }
		public TerminalNode PURGE() { return getToken(OracleStatementParser.PURGE, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(OracleStatementParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode RESUMABLE() { return getToken(OracleStatementParser.RESUMABLE, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode DICTIONARY() { return getToken(OracleStatementParser.DICTIONARY, 0); }
		public TerminalNode SYSBACKUP() { return getToken(OracleStatementParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(OracleStatementParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(OracleStatementParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(OracleStatementParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(OracleStatementParser.SYSOPER, 0); }
		public MiscellaneousSystemPrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miscellaneousSystemPrivilege; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitMiscellaneousSystemPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscellaneousSystemPrivilegeContext miscellaneousSystemPrivilege() throws RecognitionException {
		MiscellaneousSystemPrivilegeContext _localctx = new MiscellaneousSystemPrivilegeContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_miscellaneousSystemPrivilege);
		int _la;
		try {
			setState(2668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2624);
				match(ANALYZE);
				setState(2625);
				match(ANY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				match(AUDIT);
				setState(2627);
				match(ANY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2628);
				match(BECOME);
				setState(2629);
				match(USER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2630);
				match(CHANGE);
				setState(2631);
				match(NOTIFICATION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2632);
				match(COMMENT);
				setState(2633);
				match(ANY);
				setState(2634);
				match(TABLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2635);
				match(EXEMPT);
				setState(2636);
				match(ACCESS);
				setState(2637);
				match(POLICY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2638);
				match(FORCE);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2639);
					match(ANY);
					}
				}

				setState(2642);
				match(TRANSACTION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2643);
				match(GRANT);
				setState(2644);
				match(ANY);
				setState(2646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECT) {
					{
					setState(2645);
					match(OBJECT);
					}
				}

				setState(2648);
				match(PRIVILEGE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2649);
				match(INHERIT);
				setState(2650);
				match(ANY);
				setState(2651);
				match(PRIVILEGES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2652);
				match(KEEP);
				setState(2653);
				match(DATE);
				setState(2654);
				match(TIME);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2655);
				match(KEEP);
				setState(2656);
				match(SYSGUID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2657);
				match(PURGE);
				setState(2658);
				match(DBA_RECYCLEBIN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2659);
				match(RESUMABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2660);
				match(SELECT);
				setState(2661);
				match(ANY);
				setState(2662);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==DICTIONARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2663);
				match(SYSBACKUP);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2664);
				match(SYSDBA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2665);
				match(SYSDG);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2666);
				match(SYSKM);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2667);
				match(SYSOPER);
				}
				break;
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			match(CREATE);
			setState(2671);
			match(USER);
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

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2673);
			match(DROP);
			setState(2674);
			match(USER);
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

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			match(ALTER);
			setState(2677);
			match(USER);
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

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			match(CREATE);
			setState(2680);
			match(ROLE);
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

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
			match(DROP);
			setState(2683);
			match(ROLE);
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

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitAlterRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			match(ALTER);
			setState(2686);
			match(ROLE);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(OracleStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OracleStatementVisitor ) return ((OracleStatementVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
			match(CALL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 66:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 69:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 72:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 73:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 7);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0174\u0a85\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u020d\n\2\3\2\5\2\u0210\n\2\3\3"+
		"\3\3\3\3\5\3\u0215\n\3\3\4\3\4\3\4\5\4\u021a\n\4\3\5\3\5\6\5\u021e\n\5"+
		"\r\5\16\5\u021f\3\5\5\5\u0223\n\5\3\5\3\5\3\6\3\6\3\6\3\7\5\7\u022b\n"+
		"\7\3\7\6\7\u022e\n\7\r\7\16\7\u022f\3\7\5\7\u0233\n\7\3\b\3\b\3\b\3\b"+
		"\6\b\u0239\n\b\r\b\16\b\u023a\3\t\3\t\6\t\u023f\n\t\r\t\16\t\u0240\3\n"+
		"\3\n\3\n\5\n\u0246\n\n\3\n\5\n\u0249\n\n\3\13\5\13\u024c\n\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0252\n\13\f\13\16\13\u0255\13\13\3\f\3\f\5\f\u0259\n"+
		"\f\3\f\3\f\3\f\5\f\u025e\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17\u026a\n\17\f\17\16\17\u026d\13\17\3\20\3\20\3\20\3\20\7\20"+
		"\u0273\n\20\f\20\16\20\u0276\13\20\3\20\3\20\3\20\3\20\5\20\u027c\n\20"+
		"\3\21\3\21\5\21\u0280\n\21\3\22\3\22\5\22\u0284\n\22\3\22\3\22\5\22\u0288"+
		"\n\22\3\22\5\22\u028b\n\22\3\23\3\23\3\24\5\24\u0290\n\24\3\24\5\24\u0293"+
		"\n\24\3\24\3\24\5\24\u0297\n\24\3\24\5\24\u029a\n\24\3\24\5\24\u029d\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a8\n\25\3\26"+
		"\3\26\5\26\u02ac\n\26\3\26\3\26\3\26\5\26\u02b1\n\26\7\26\u02b3\n\26\f"+
		"\26\16\26\u02b6\13\26\3\27\3\27\3\30\3\30\3\30\5\30\u02bd\n\30\3\30\7"+
		"\30\u02c0\n\30\f\30\16\30\u02c3\13\30\3\31\3\31\5\31\u02c7\n\31\3\31\3"+
		"\31\5\31\u02cb\n\31\3\31\5\31\u02ce\n\31\3\31\5\31\u02d1\n\31\3\31\5\31"+
		"\u02d4\n\31\3\31\5\31\u02d7\n\31\3\31\5\31\u02da\n\31\3\32\3\32\3\33\3"+
		"\33\5\33\u02e0\n\33\3\33\3\33\7\33\u02e4\n\33\f\33\16\33\u02e7\13\33\3"+
		"\34\3\34\5\34\u02eb\n\34\3\34\5\34\u02ee\n\34\3\34\5\34\u02f1\n\34\3\34"+
		"\5\34\u02f4\n\34\3\35\3\35\5\35\u02f8\n\35\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\7!\u0305\n!\f!\16!\u0308\13!\3\"\3\"\7\"\u030c\n\"\f"+
		"\"\16\"\u030f\13\"\3#\3#\5#\u0313\n#\3#\5#\u0316\n#\3#\3#\5#\u031a\n#"+
		"\3#\5#\u031d\n#\3#\5#\u0320\n#\3#\3#\3#\3#\5#\u0326\n#\3$\5$\u0329\n$"+
		"\3$\5$\u032c\n$\3$\3$\3$\3$\5$\u0332\n$\3$\5$\u0335\n$\3$\3$\5$\u0339"+
		"\n$\3$\3$\3$\5$\u033e\n$\5$\u0340\n$\3%\3%\3%\3%\5%\u0346\n%\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u0350\n\'\f\'\16\'\u0353\13\'\3(\3(\3(\3)\3)"+
		"\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u0368\n,\3-\3-\3.\5.\u036d"+
		"\n.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u0378\n/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\5\64\u0384\n\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\3\67\5\67\u038d\n\67\3\67\3\67\38\38\38\58\u0394\n8\38\38\39\39\3:\3"+
		":\3;\5;\u039d\n;\3;\3;\3;\7;\u03a2\n;\f;\16;\u03a5\13;\3;\5;\u03a8\n;"+
		"\3<\5<\u03ab\n<\3<\3<\3<\7<\u03b0\n<\f<\16<\u03b3\13<\3<\5<\u03b6\n<\3"+
		"=\3=\3>\3>\3>\7>\u03bd\n>\f>\16>\u03c0\13>\3>\5>\u03c3\n>\3?\3?\3@\3@"+
		"\3@\3@\5@\u03cb\n@\5@\u03cd\n@\3@\3@\3A\5A\u03d2\nA\3A\3A\3B\3B\3B\7B"+
		"\u03d9\nB\fB\16B\u03dc\13B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03eb"+
		"\nD\3D\3D\3D\3D\7D\u03f1\nD\fD\16D\u03f4\13D\3E\3E\3F\3F\3G\3G\3G\3G\3"+
		"G\3G\5G\u0400\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u040f\nG\f"+
		"G\16G\u0412\13G\3H\3H\3I\3I\5I\u0418\nI\3I\3I\3I\3I\3I\5I\u041f\nI\3I"+
		"\3I\3I\3I\3I\7I\u0426\nI\fI\16I\u0429\13I\3I\3I\3I\3I\5I\u042f\nI\3I\3"+
		"I\3I\3I\3I\3I\3I\5I\u0438\nI\3I\3I\3I\3I\5I\u043e\nI\3I\5I\u0441\nI\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u0464\nJ\fJ\16J\u0467\13J\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\5K\u0471\nK\3K\3K\3K\3K\7K\u0477\nK\fK\16K\u047a\13K\3K\3"+
		"K\3K\5K\u047f\nK\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0489\nK\3K\3K\3K\7K\u048e"+
		"\nK\fK\16K\u0491\13K\3L\3L\3L\5L\u0496\nL\3M\3M\3M\5M\u049b\nM\3M\3M\3"+
		"M\7M\u04a0\nM\fM\16M\u04a3\13M\3M\5M\u04a6\nM\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\5P\u04b0\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u04be\nR\fR\16R\u04c1"+
		"\13R\3R\3R\5R\u04c5\nR\3R\3R\3S\3S\3S\3S\3S\7S\u04ce\nS\fS\16S\u04d1\13"+
		"S\3S\5S\u04d4\nS\3S\3S\3T\3T\3T\3T\3T\5T\u04dd\nT\3U\3U\5U\u04e1\nU\3"+
		"U\6U\u04e4\nU\rU\16U\u04e5\3U\5U\u04e9\nU\3V\3V\3V\3V\3V\3W\3W\3W\3X\3"+
		"X\3X\3X\3X\7X\u04f8\nX\fX\16X\u04fb\13X\3Y\3Y\3Y\5Y\u0500\nY\3Y\5Y\u0503"+
		"\nY\3Z\3Z\3[\3[\3\\\3\\\3\\\7\\\u050c\n\\\f\\\16\\\u050f\13\\\3]\3]\5"+
		"]\u0513\n]\3^\3^\3^\7^\u0518\n^\f^\16^\u051b\13^\3_\3_\3_\3_\3`\3`\5`"+
		"\u0523\n`\3`\3`\3`\5`\u0528\n`\3`\3`\5`\u052c\n`\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\5a\u0537\na\3a\3a\3a\3a\3a\3a\5a\u053f\na\3a\3a\5a\u0543\na\5a"+
		"\u0545\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0581\nb\3c\3c\5c\u0585"+
		"\nc\3c\3c\5c\u0589\nc\3c\3c\3c\3c\3c\3c\3c\5c\u0592\nc\5c\u0594\nc\3d"+
		"\3d\3d\3d\3d\5d\u059b\nd\3d\3d\3d\3e\3e\3e\3e\3e\5e\u05a5\ne\3f\3f\3f"+
		"\5f\u05aa\nf\3f\5f\u05ad\nf\3f\3f\3g\3g\6g\u05b3\ng\rg\16g\u05b4\3h\3"+
		"h\3h\3h\3h\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u05c8\nj\3j\3j\3j\3"+
		"j\3j\5j\u05cf\nj\3j\3j\3j\3j\5j\u05d5\nj\3j\3j\5j\u05d9\nj\3k\3k\3k\3"+
		"k\3k\5k\u05e0\nk\3k\3k\3k\3k\7k\u05e6\nk\fk\16k\u05e9\13k\3k\3k\5k\u05ed"+
		"\nk\3k\5k\u05f0\nk\3l\3l\3l\3l\3m\3m\3n\3n\3n\7n\u05fb\nn\fn\16n\u05fe"+
		"\13n\3o\3o\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3s\3"+
		"s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\3u\3v\3v\3v\3v\3w\3w\5w\u0627\nw\3x\3"+
		"x\3x\3x\3y\3y\3y\3z\3z\3{\3{\3{\3{\5{\u0636\n{\3{\3{\3{\3{\5{\u063c\n"+
		"{\3|\3|\3|\7|\u0641\n|\f|\16|\u0644\13|\3}\3}\3}\3}\5}\u064a\n}\3~\3~"+
		"\3~\5~\u064f\n~\3~\3~\3~\3~\3~\5~\u0656\n~\3~\3~\5~\u065a\n~\3~\6~\u065d"+
		"\n~\r~\16~\u065e\3~\5~\u0662\n~\3\177\5\177\u0665\n\177\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u066a\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0672\n\u0081\5\u0081\u0674\n\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0082\5\u0082\u067b\n\u0082\3\u0082\6\u0082\u067e\n\u0082"+
		"\r\u0082\16\u0082\u067f\5\u0082\u0682\n\u0082\3\u0082\5\u0082\u0685\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u068c\n\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u069e"+
		"\n\u0083\3\u0084\3\u0084\5\u0084\u06a2\n\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u06a7\n\u0084\3\u0084\5\u0084\u06aa\n\u0084\3\u0084\5\u0084\u06ad"+
		"\n\u0084\3\u0084\5\u0084\u06b0\n\u0084\3\u0085\3\u0085\5\u0085\u06b4\n"+
		"\u0085\3\u0085\5\u0085\u06b7\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06c2\n\u0085\3\u0085\7"+
		"\u0085\u06c5\n\u0085\f\u0085\16\u0085\u06c8\13\u0085\3\u0086\3\u0086\3"+
		"\u0086\5\u0086\u06cd\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5"+
		"\u0086\u06d4\n\u0086\5\u0086\u06d6\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06e2\n\u0087"+
		"\3\u0088\5\u0088\u06e5\n\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u06f4\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0701\n\u008d\3\u008d\3\u008d"+
		"\7\u008d\u0705\n\u008d\f\u008d\16\u008d\u0708\13\u008d\5\u008d\u070a\n"+
		"\u008d\3\u008e\3\u008e\5\u008e\u070e\n\u008e\3\u008e\3\u008e\5\u008e\u0712"+
		"\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0719\n\u008e"+
		"\3\u008e\7\u008e\u071c\n\u008e\f\u008e\16\u008e\u071f\13\u008e\3\u008f"+
		"\3\u008f\5\u008f\u0723\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0734\n\u008f\3\u008f\7\u008f\u0737\n\u008f\f\u008f\16"+
		"\u008f\u073a\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u074d\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\7\u0090\u0754\n\u0090\f\u0090\16\u0090\u0757\13\u0090\5\u0090"+
		"\u0759\n\u0090\3\u0091\5\u0091\u075c\n\u0091\3\u0092\3\u0092\5\u0092\u0760"+
		"\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\7\u0093\u0768"+
		"\n\u0093\f\u0093\16\u0093\u076b\13\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\5\u0094\u0771\n\u0094\3\u0094\5\u0094\u0774\n\u0094\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\7\u0096\u0781\n\u0096\f\u0096\16\u0096\u0784\13\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\5\u0097\u078a\n\u0097\3\u0097\3\u0097\5\u0097\u078e\n"+
		"\u0097\3\u0098\3\u0098\5\u0098\u0792\n\u0098\3\u0099\3\u0099\5\u0099\u0796"+
		"\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u079b\n\u0099\7\u0099\u079d\n"+
		"\u0099\f\u0099\16\u0099\u07a0\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u07a6\n\u009a\3\u009b\3\u009b\3\u009b\5\u009b\u07ab\n\u009b\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009d\6\u009d\u07b2\n\u009d\r\u009d\16"+
		"\u009d\u07b3\3\u009d\5\u009d\u07b7\n\u009d\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u07bc\n\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u07c1\n\u009f\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\7\u00a0\u07c7\n\u00a0\f\u00a0\16\u00a0\u07ca\13"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07cf\n\u00a0\3\u00a1\3\u00a1\5"+
		"\u00a1\u07d3\n\u00a1\3\u00a2\6\u00a2\u07d6\n\u00a2\r\u00a2\16\u00a2\u07d7"+
		"\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\5\u00a5\u07e1"+
		"\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u07e6\n\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u07ea\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u07f0\n"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u07f6\n\u00a5\3\u00a6\3"+
		"\u00a6\5\u00a6\u07fa\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u07ff\n\u00a6"+
		"\f\u00a6\16\u00a6\u0802\13\u00a6\3\u00a6\5\u00a6\u0805\n\u00a6\3\u00a6"+
		"\5\u00a6\u0808\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u080c\n\u00a7\3\u00a7\3"+
		"\u00a7\5\u00a7\u0810\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0815\n\u00a7"+
		"\3\u00a7\7\u00a7\u0818\n\u00a7\f\u00a7\16\u00a7\u081b\13\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\5\u00a8\u0820\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u0827\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u082d\n\u00a9\f\u00a9\16\u00a9\u0830\13\u00a9\3\u00a9\5\u00a9\u0833\n"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0838\n\u00aa\f\u00aa\16\u00aa"+
		"\u083b\13\u00aa\3\u00aa\5\u00aa\u083e\n\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0846\n\u00ab\f\u00ab\16\u00ab\u0849"+
		"\13\u00ab\3\u00ab\3\u00ab\5\u00ab\u084d\n\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u0852\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\6\u00af\u0861"+
		"\n\u00af\r\u00af\16\u00af\u0862\5\u00af\u0865\n\u00af\3\u00b0\3\u00b0"+
		"\6\u00b0\u0869\n\u00b0\r\u00b0\16\u00b0\u086a\3\u00b0\5\u00b0\u086e\n"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\6\u00b1\u0873\n\u00b1\r\u00b1\16\u00b1"+
		"\u0874\3\u00b1\5\u00b1\u0878\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3"+
		"\u00b3\5\u00b3\u087f\n\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0884\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u088e\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u0892\n\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u0897\n\u00b6\5\u00b6\u0899\n\u00b6\3\u00b7\3\u00b7\3\u00b7"+
		"\6\u00b7\u089e\n\u00b7\r\u00b7\16\u00b7\u089f\3\u00b8\3\u00b8\3\u00b8"+
		"\7\u00b8\u08a5\n\u00b8\f\u00b8\16\u00b8\u08a8\13\u00b8\3\u00b9\3\u00b9"+
		"\5\u00b9\u08ac\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u08b0\n\u00b9\3\u00b9\7"+
		"\u00b9\u08b3\n\u00b9\f\u00b9\16\u00b9\u08b6\13\u00b9\3\u00b9\5\u00b9\u08b9"+
		"\n\u00b9\5\u00b9\u08bb\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u08bf\n\u00b9\3"+
		"\u00ba\3\u00ba\3\u00ba\5\u00ba\u08c4\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3"+
		"\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u08d3\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u08d9\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c4\3\u00c4\5\u00c4\u08e5\n\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\5\u00c4\u08ea\n\u00c4\7\u00c4\u08ec\n\u00c4\f\u00c4\16\u00c4\u08ef\13"+
		"\u00c4\3\u00c5\3\u00c5\5\u00c5\u08f3\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0911"+
		"\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u091f\n\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u094e"+
		"\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u0952\n\u00c8\3\u00c9\5\u00c9\u0955\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u095c\n\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0963\n\u00c9\5\u00c9\u0965"+
		"\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0975\n\u00cd"+
		"\3\u00ce\3\u00ce\5\u00ce\u0979\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0983\n\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\5\u00d7\u099e\n\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09a6\n\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u09b6\n\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u09c0\n\u00db"+
		"\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u09c5\n\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u09ea\n\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7"+
		"\u09f5\n\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0a05"+
		"\n\u00ea\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0a0a\n\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0a12\n\u00eb\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a1a\n\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\5\u00ed\u0a1f\n\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee"+
		"\5\u00ee\u0a26\n\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\5\u00ef\u0a30\n\u00ef\3\u00f0\3\u00f0\3\u00f0\5\u00f0"+
		"\u0a35\n\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f2\5\u00f2\u0a3f\n\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u0a53\n\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\5\u00f3\u0a59\n\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u0a6f"+
		"\n\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00fa\3\u00fa\3\u00fa\2\6\u0086\u008c\u0092\u0094\u00fb\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\2!\4\2pp"+
		"\u0157\u0157\4\2NNpp\4\2XX\\\\\4\2WWZ[\3\2\u0085\u0087\3\2kl\35\2\66\67"+
		"FFHHOSU]aakly\u0080\u0082\u0084\u0086\u0097\u009a\u009b\u009e\u00ae\u00b4"+
		"\u00b7\u00ba\u00bc\u00be\u00c2\u00c4\u00c4\u00c6\u00e4\u00e6\u00eb\u00ed"+
		"\u00ed\u00f0\u00f9\u00fb\u00fe\u0100\u0100\u0102\u0105\u0107\u0107\u010a"+
		"\u0114\u0116\u011a\u011f\u0157\3\2\u0170\u0171\4\2\4\5fg\4\2\6\6ii\4\2"+
		"jl\u00ba\u00ba\3\2pq\3\2\30\35\5\2\6\7\17\20\u00b4\u00b4\3\2\u0093\u0097"+
		"\3\2vw\4\2\62\62\u009e\u009e\3\2\u00c7\u00c8\4\2\u00e4\u00e4\u00ee\u00ee"+
		"\4\2AA\u00d8\u00d8\4\2\65\65\u00d2\u00d2\4\2\u0108\u0108\u010d\u010d\4"+
		"\2/\65\u00c9\u00c9\3\2\u012a\u012b\3\2\63\65\4\2qq\u0132\u0132\3\2\u0134"+
		"\u0135\4\2\63\64\u0144\u0144\6\2\u00c0\u00c0\u00cd\u00cd\u011e\u011e\u0147"+
		"\u0147\4\2\u00cc\u00cc\u00d6\u00d6\4\2\u00c4\u00c4\u012f\u012f\2\u0b9f"+
		"\2\u020c\3\2\2\2\4\u0211\3\2\2\2\6\u0216\3\2\2\2\b\u0222\3\2\2\2\n\u0226"+
		"\3\2\2\2\f\u022a\3\2\2\2\16\u0234\3\2\2\2\20\u023c\3\2\2\2\22\u0242\3"+
		"\2\2\2\24\u024b\3\2\2\2\26\u0256\3\2\2\2\30\u025f\3\2\2\2\32\u0261\3\2"+
		"\2\2\34\u0265\3\2\2\2\36\u027b\3\2\2\2 \u027f\3\2\2\2\"\u0281\3\2\2\2"+
		"$\u028c\3\2\2\2&\u028f\3\2\2\2(\u02a7\3\2\2\2*\u02a9\3\2\2\2,\u02b7\3"+
		"\2\2\2.\u02b9\3\2\2\2\60\u02c4\3\2\2\2\62\u02db\3\2\2\2\64\u02df\3\2\2"+
		"\2\66\u02f3\3\2\2\28\u02f7\3\2\2\2:\u02f9\3\2\2\2<\u02fb\3\2\2\2>\u02fe"+
		"\3\2\2\2@\u0301\3\2\2\2B\u0309\3\2\2\2D\u0325\3\2\2\2F\u033f\3\2\2\2H"+
		"\u0345\3\2\2\2J\u0347\3\2\2\2L\u034a\3\2\2\2N\u0354\3\2\2\2P\u0357\3\2"+
		"\2\2R\u035b\3\2\2\2T\u035e\3\2\2\2V\u0367\3\2\2\2X\u0369\3\2\2\2Z\u036c"+
		"\3\2\2\2\\\u0377\3\2\2\2^\u0379\3\2\2\2`\u037b\3\2\2\2b\u037d\3\2\2\2"+
		"d\u037f\3\2\2\2f\u0383\3\2\2\2h\u0385\3\2\2\2j\u0387\3\2\2\2l\u038c\3"+
		"\2\2\2n\u0393\3\2\2\2p\u0397\3\2\2\2r\u0399\3\2\2\2t\u039c\3\2\2\2v\u03aa"+
		"\3\2\2\2x\u03b7\3\2\2\2z\u03c2\3\2\2\2|\u03c4\3\2\2\2~\u03c6\3\2\2\2\u0080"+
		"\u03d1\3\2\2\2\u0082\u03d5\3\2\2\2\u0084\u03dd\3\2\2\2\u0086\u03ea\3\2"+
		"\2\2\u0088\u03f5\3\2\2\2\u008a\u03f7\3\2\2\2\u008c\u03f9\3\2\2\2\u008e"+
		"\u0413\3\2\2\2\u0090\u0440\3\2\2\2\u0092\u0442\3\2\2\2\u0094\u0488\3\2"+
		"\2\2\u0096\u0495\3\2\2\2\u0098\u0497\3\2\2\2\u009a\u04a9\3\2\2\2\u009c"+
		"\u04ab\3\2\2\2\u009e\u04af\3\2\2\2\u00a0\u04b1\3\2\2\2\u00a2\u04b8\3\2"+
		"\2\2\u00a4\u04c8\3\2\2\2\u00a6\u04dc\3\2\2\2\u00a8\u04de\3\2\2\2\u00aa"+
		"\u04ea\3\2\2\2\u00ac\u04ef\3\2\2\2\u00ae\u04f2\3\2\2\2\u00b0\u04ff\3\2"+
		"\2\2\u00b2\u0504\3\2\2\2\u00b4\u0506\3\2\2\2\u00b6\u0508\3\2\2\2\u00b8"+
		"\u0512\3\2\2\2\u00ba\u0514\3\2\2\2\u00bc\u051c\3\2\2\2\u00be\u052b\3\2"+
		"\2\2\u00c0\u0544\3\2\2\2\u00c2\u0580\3\2\2\2\u00c4\u0593\3\2\2\2\u00c6"+
		"\u0595\3\2\2\2\u00c8\u05a4\3\2\2\2\u00ca\u05a6\3\2\2\2\u00cc\u05b0\3\2"+
		"\2\2\u00ce\u05b6\3\2\2\2\u00d0\u05bb\3\2\2\2\u00d2\u05be\3\2\2\2\u00d4"+
		"\u05df\3\2\2\2\u00d6\u05f1\3\2\2\2\u00d8\u05f5\3\2\2\2\u00da\u05f7\3\2"+
		"\2\2\u00dc\u05ff\3\2\2\2\u00de\u0601\3\2\2\2\u00e0\u0607\3\2\2\2\u00e2"+
		"\u060e\3\2\2\2\u00e4\u0613\3\2\2\2\u00e6\u0618\3\2\2\2\u00e8\u061c\3\2"+
		"\2\2\u00ea\u0620\3\2\2\2\u00ec\u0626\3\2\2\2\u00ee\u0628\3\2\2\2\u00f0"+
		"\u062c\3\2\2\2\u00f2\u062f\3\2\2\2\u00f4\u0635\3\2\2\2\u00f6\u063d\3\2"+
		"\2\2\u00f8\u0649\3\2\2\2\u00fa\u064b\3\2\2\2\u00fc\u0664\3\2\2\2\u00fe"+
		"\u0666\3\2\2\2\u0100\u066b\3\2\2\2\u0102\u067a\3\2\2\2\u0104\u069d\3\2"+
		"\2\2\u0106\u06a1\3\2\2\2\u0108\u06b3\3\2\2\2\u010a\u06c9\3\2\2\2\u010c"+
		"\u06e1\3\2\2\2\u010e\u06e4\3\2\2\2\u0110\u06e8\3\2\2\2\u0112\u06eb\3\2"+
		"\2\2\u0114\u06ef\3\2\2\2\u0116\u06f5\3\2\2\2\u0118\u0709\3\2\2\2\u011a"+
		"\u070b\3\2\2\2\u011c\u0722\3\2\2\2\u011e\u0758\3\2\2\2\u0120\u075b\3\2"+
		"\2\2\u0122\u075d\3\2\2\2\u0124\u0763\3\2\2\2\u0126\u0770\3\2\2\2\u0128"+
		"\u0775\3\2\2\2\u012a\u077c\3\2\2\2\u012c\u0789\3\2\2\2\u012e\u0791\3\2"+
		"\2\2\u0130\u0793\3\2\2\2\u0132\u07a5\3\2\2\2\u0134\u07aa\3\2\2\2\u0136"+
		"\u07ac\3\2\2\2\u0138\u07b6\3\2\2\2\u013a\u07bb\3\2\2\2\u013c\u07bd\3\2"+
		"\2\2\u013e\u07ce\3\2\2\2\u0140\u07d2\3\2\2\2\u0142\u07d5\3\2\2\2\u0144"+
		"\u07d9\3\2\2\2\u0146\u07db\3\2\2\2\u0148\u07f5\3\2\2\2\u014a\u07f7\3\2"+
		"\2\2\u014c\u0809\3\2\2\2\u014e\u081c\3\2\2\2\u0150\u0832\3\2\2\2\u0152"+
		"\u0834\3\2\2\2\u0154\u084c\3\2\2\2\u0156\u0851\3\2\2\2\u0158\u0853\3\2"+
		"\2\2\u015a\u0856\3\2\2\2\u015c\u0864\3\2\2\2\u015e\u0866\3\2\2\2\u0160"+
		"\u086f\3\2\2\2\u0162\u0879\3\2\2\2\u0164\u087e\3\2\2\2\u0166\u0883\3\2"+
		"\2\2\u0168\u0885\3\2\2\2\u016a\u088a\3\2\2\2\u016c\u089d\3\2\2\2\u016e"+
		"\u08a1\3\2\2\2\u0170\u08be\3\2\2\2\u0172\u08c3\3\2\2\2\u0174\u08c5\3\2"+
		"\2\2\u0176\u08c8\3\2\2\2\u0178\u08ca\3\2\2\2\u017a\u08cc\3\2\2\2\u017c"+
		"\u08ce\3\2\2\2\u017e\u08d4\3\2\2\2\u0180\u08da\3\2\2\2\u0182\u08de\3\2"+
		"\2\2\u0184\u08e0\3\2\2\2\u0186\u08e2\3\2\2\2\u0188\u0910\3\2\2\2\u018a"+
		"\u091e\3\2\2\2\u018c\u094d\3\2\2\2\u018e\u094f\3\2\2\2\u0190\u0964\3\2"+
		"\2\2\u0192\u0966\3\2\2\2\u0194\u0969\3\2\2\2\u0196\u096c\3\2\2\2\u0198"+
		"\u0974\3\2\2\2\u019a\u0976\3\2\2\2\u019c\u097d\3\2\2\2\u019e\u0984\3\2"+
		"\2\2\u01a0\u0988\3\2\2\2\u01a2\u098b\3\2\2\2\u01a4\u098e\3\2\2\2\u01a6"+
		"\u0991\3\2\2\2\u01a8\u0995\3\2\2\2\u01aa\u0998\3\2\2\2\u01ac\u09a5\3\2"+
		"\2\2\u01ae\u09a7\3\2\2\2\u01b0\u09ab\3\2\2\2\u01b2\u09ae\3\2\2\2\u01b4"+
		"\u09bf\3\2\2\2\u01b6\u09c4\3\2\2\2\u01b8\u09c9\3\2\2\2\u01ba\u09cc\3\2"+
		"\2\2\u01bc\u09d0\3\2\2\2\u01be\u09d4\3\2\2\2\u01c0\u09d9\3\2\2\2\u01c2"+
		"\u09dc\3\2\2\2\u01c4\u09df\3\2\2\2\u01c6\u09e9\3\2\2\2\u01c8\u09eb\3\2"+
		"\2\2\u01ca\u09ee\3\2\2\2\u01cc\u09f4\3\2\2\2\u01ce\u09f8\3\2\2\2\u01d0"+
		"\u09fc\3\2\2\2\u01d2\u0a04\3\2\2\2\u01d4\u0a11\3\2\2\2\u01d6\u0a19\3\2"+
		"\2\2\u01d8\u0a1e\3\2\2\2\u01da\u0a25\3\2\2\2\u01dc\u0a2f\3\2\2\2\u01de"+
		"\u0a34\3\2\2\2\u01e0\u0a38\3\2\2\2\u01e2\u0a3e\3\2\2\2\u01e4\u0a6e\3\2"+
		"\2\2\u01e6\u0a70\3\2\2\2\u01e8\u0a73\3\2\2\2\u01ea\u0a76\3\2\2\2\u01ec"+
		"\u0a79\3\2\2\2\u01ee\u0a7c\3\2\2\2\u01f0\u0a7f\3\2\2\2\u01f2\u0a82\3\2"+
		"\2\2\u01f4\u020d\5,\27\2\u01f5\u020d\5\4\3\2\u01f6\u020d\5\26\f\2\u01f7"+
		"\u020d\5\"\22\2\u01f8\u020d\5\u00dep\2\u01f9\u020d\5\u00e2r\2\u01fa\u020d"+
		"\5\u00e6t\2\u01fb\u020d\5\u00eav\2\u01fc\u020d\5\u00e0q\2\u01fd\u020d"+
		"\5\u00e8u\2\u01fe\u020d\5\u00e4s\2\u01ff\u020d\5\u0176\u00bc\2\u0200\u020d"+
		"\5\u0178\u00bd\2\u0201\u020d\5\u0174\u00bb\2\u0202\u020d\5\u017a\u00be"+
		"\2\u0203\u020d\5\u017c\u00bf\2\u0204\u020d\5\u017e\u00c0\2\u0205\u020d"+
		"\5\u01e6\u00f4\2\u0206\u020d\5\u01e8\u00f5\2\u0207\u020d\5\u01ea\u00f6"+
		"\2\u0208\u020d\5\u01ec\u00f7\2\u0209\u020d\5\u01ee\u00f8\2\u020a\u020d"+
		"\5\u01f0\u00f9\2\u020b\u020d\5\u01f2\u00fa\2\u020c\u01f4\3\2\2\2\u020c"+
		"\u01f5\3\2\2\2\u020c\u01f6\3\2\2\2\u020c\u01f7\3\2\2\2\u020c\u01f8\3\2"+
		"\2\2\u020c\u01f9\3\2\2\2\u020c\u01fa\3\2\2\2\u020c\u01fb\3\2\2\2\u020c"+
		"\u01fc\3\2\2\2\u020c\u01fd\3\2\2\2\u020c\u01fe\3\2\2\2\u020c\u01ff\3\2"+
		"\2\2\u020c\u0200\3\2\2\2\u020c\u0201\3\2\2\2\u020c\u0202\3\2\2\2\u020c"+
		"\u0203\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0205\3\2\2\2\u020c\u0206\3\2"+
		"\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\7+"+
		"\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\3\3\2\2\2\u0211\u0214"+
		"\7\60\2\2\u0212\u0215\5\6\4\2\u0213\u0215\5\b\5\2\u0214\u0212\3\2\2\2"+
		"\u0214\u0213\3\2\2\2\u0215\5\3\2\2\2\u0216\u0219\5\22\n\2\u0217\u021a"+
		"\5\24\13\2\u0218\u021a\5,\27\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2"+
		"\u021a\7\3\2\2\2\u021b\u021d\7p\2\2\u021c\u021e\5\n\6\2\u021d\u021c\3"+
		"\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u0223\5\f\7\2\u0222\u021b\3\2\2\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5,\27\2\u0225\t\3\2\2\2\u0226\u0227"+
		"\5\22\n\2\u0227\u0228\5\24\13\2\u0228\13\3\2\2\2\u0229\u022b\t\2\2\2\u022a"+
		"\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022e\5\16"+
		"\b\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0233\5\20\t\2\u0232\u0231\3"+
		"\2\2\2\u0232\u0233\3\2\2\2\u0233\r\3\2\2\2\u0234\u0235\7P\2\2\u0235\u0236"+
		"\5\u0086D\2\u0236\u0238\7c\2\2\u0237\u0239\5\n\6\2\u0238\u0237\3\2\2\2"+
		"\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\17"+
		"\3\2\2\2\u023c\u023e\7b\2\2\u023d\u023f\5\n\6\2\u023e\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\21\3\2\2"+
		"\2\u0242\u0243\7J\2\2\u0243\u0248\5l\67\2\u0244\u0246\7_\2\2\u0245\u0244"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\58\35\2\u0248"+
		"\u0245\3\2\2\2\u0248\u0249\3\2\2\2\u0249\23\3\2\2\2\u024a\u024c\5t;\2"+
		"\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e"+
		"\7K\2\2\u024e\u0253\5\36\20\2\u024f\u0250\7%\2\2\u0250\u0252\5\36\20\2"+
		"\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\25\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\7\61\2\2\u0257"+
		"\u0259\5\30\r\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3"+
		"\2\2\2\u025a\u025b\5@!\2\u025b\u025d\5\34\17\2\u025c\u025e\5J&\2\u025d"+
		"\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\27\3\2\2\2\u025f\u0260\7\u0100"+
		"\2\2\u0260\31\3\2\2\2\u0261\u0262\5n8\2\u0262\u0263\7\30\2\2\u0263\u0264"+
		"\5 \21\2\u0264\33\3\2\2\2\u0265\u0266\7;\2\2\u0266\u026b\5\32\16\2\u0267"+
		"\u0268\7%\2\2\u0268\u026a\5\32\16\2\u0269\u0267\3\2\2\2\u026a\u026d\3"+
		"\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\35\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u026f\7\37\2\2\u026f\u0274\5 \21\2\u0270\u0271\7"+
		"%\2\2\u0271\u0273\5 \21\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0277\u0278\7 \2\2\u0278\u027c\3\2\2\2\u0279\u027a\7\37\2\2\u027a"+
		"\u027c\7 \2\2\u027b\u026e\3\2\2\2\u027b\u0279\3\2\2\2\u027c\37\3\2\2\2"+
		"\u027d\u0280\5\u0086D\2\u027e\u0280\7\u0098\2\2\u027f\u027d\3\2\2\2\u027f"+
		"\u027e\3\2\2\2\u0280!\3\2\2\2\u0281\u0283\7\62\2\2\u0282\u0284\5$\23\2"+
		"\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0288"+
		"\5&\24\2\u0286\u0288\5(\25\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288"+
		"\u028a\3\2\2\2\u0289\u028b\5J&\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2"+
		"\2\u028b#\3\2\2\2\u028c\u028d\7\u0100\2\2\u028d%\3\2\2\2\u028e\u0290\7"+
		"T\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u0293\7\37\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3"+
		"\2\2\2\u0294\u0296\5l\67\2\u0295\u0297\7 \2\2\u0296\u0295\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u029c\3\2\2\2\u0298\u029a\7_\2\2\u0299\u0298\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\58\35\2\u029c"+
		"\u0299\3\2\2\2\u029c\u029d\3\2\2\2\u029d\'\3\2\2\2\u029e\u029f\5*\26\2"+
		"\u029f\u02a0\7T\2\2\u02a0\u02a1\5@!\2\u02a1\u02a8\3\2\2\2\u02a2\u02a3"+
		"\7T\2\2\u02a3\u02a4\5*\26\2\u02a4\u02a5\7]\2\2\u02a5\u02a6\5@!\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u029e\3\2\2\2\u02a7\u02a2\3\2\2\2\u02a8)\3\2\2\2"+
		"\u02a9\u02ab\5l\67\2\u02aa\u02ac\7\25\2\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02b4\3\2\2\2\u02ad\u02ae\7%\2\2\u02ae\u02b0\5l\67\2\u02af"+
		"\u02b1\7\25\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3"+
		"\2\2\2\u02b2\u02ad\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5+\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\5.\30\2"+
		"\u02b8-\3\2\2\2\u02b9\u02c1\5\60\31\2\u02ba\u02bc\7M\2\2\u02bb\u02bd\t"+
		"\3\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\5\60\31\2\u02bf\u02ba\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2/\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c6"+
		"\7/\2\2\u02c5\u02c7\5\62\32\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2"+
		"\u02c7\u02c8\3\2\2\2\u02c8\u02ca\5\64\33\2\u02c9\u02cb\5> \2\u02ca\u02c9"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5J&\2\u02cd"+
		"\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\5L"+
		"\'\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\3\2\2\2\u02d2"+
		"\u02d4\5N(\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2"+
		"\2\u02d5\u02d7\5\u00aeX\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d9\3\2\2\2\u02d8\u02da\5R*\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2"+
		"\2\u02da\61\3\2\2\2\u02db\u02dc\t\3\2\2\u02dc\63\3\2\2\2\u02dd\u02e0\5"+
		":\36\2\u02de\u02e0\5\66\34\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0"+
		"\u02e5\3\2\2\2\u02e1\u02e2\7%\2\2\u02e2\u02e4\5\66\34\2\u02e3\u02e1\3"+
		"\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\65\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\5n8\2\u02e9\u02eb\5\u0086"+
		"D\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\u02f0\3\2\2\2\u02ec"+
		"\u02ee\7_\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f1\58\35\2\u02f0\u02ed\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f4\3\2\2\2\u02f2\u02f4\5<\37\2\u02f3\u02ea\3\2\2\2\u02f3\u02f2\3\2"+
		"\2\2\u02f4\67\3\2\2\2\u02f5\u02f8\5f\64\2\u02f6\u02f8\7\u0171\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f89\3\2\2\2\u02f9\u02fa\7\21\2\2"+
		"\u02fa;\3\2\2\2\u02fb\u02fc\5f\64\2\u02fc\u02fd\7\25\2\2\u02fd=\3\2\2"+
		"\2\u02fe\u02ff\7T\2\2\u02ff\u0300\5@!\2\u0300?\3\2\2\2\u0301\u0306\5B"+
		"\"\2\u0302\u0303\7%\2\2\u0303\u0305\5B\"\2\u0304\u0302\3\2\2\2\u0305\u0308"+
		"\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307A\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0309\u030d\5D#\2\u030a\u030c\5F$\2\u030b\u030a\3\2\2\2"+
		"\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030eC\3"+
		"\2\2\2\u030f\u030d\3\2\2\2\u0310\u0315\5l\67\2\u0311\u0313\7_\2\2\u0312"+
		"\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\58"+
		"\35\2\u0315\u0312\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0326\3\2\2\2\u0317"+
		"\u0319\5P)\2\u0318\u031a\7_\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2"+
		"\2\u031a\u031c\3\2\2\2\u031b\u031d\58\35\2\u031c\u031b\3\2\2\2\u031c\u031d"+
		"\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0320\5t;\2\u031f\u031e\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0326\3\2\2\2\u0321\u0322\7\37\2\2\u0322\u0323\5"+
		"@!\2\u0323\u0324\7 \2\2\u0324\u0326\3\2\2\2\u0325\u0310\3\2\2\2\u0325"+
		"\u0317\3\2\2\2\u0325\u0321\3\2\2\2\u0326E\3\2\2\2\u0327\u0329\7U\2\2\u0328"+
		"\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u032c\t\4"+
		"\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032e\7V\2\2\u032e\u032f\3\2\2\2\u032f\u0331\5D#\2\u0330\u0332\5H%\2"+
		"\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0340\3\2\2\2\u0333\u0335"+
		"\7U\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0338\t\5\2\2\u0337\u0339\7Y\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2"+
		"\2\2\u0339\u033a\3\2\2\2\u033a\u033b\7V\2\2\u033b\u033d\5D#\2\u033c\u033e"+
		"\5H%\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f"+
		"\u0328\3\2\2\2\u033f\u0334\3\2\2\2\u0340G\3\2\2\2\u0341\u0342\7`\2\2\u0342"+
		"\u0346\5\u0086D\2\u0343\u0344\7]\2\2\u0344\u0346\5t;\2\u0345\u0341\3\2"+
		"\2\2\u0345\u0343\3\2\2\2\u0346I\3\2\2\2\u0347\u0348\7^\2\2\u0348\u0349"+
		"\5\u0086D\2\u0349K\3\2\2\2\u034a\u034b\7t\2\2\u034b\u034c\7u\2\2\u034c"+
		"\u0351\5\u00b0Y\2\u034d\u034e\7%\2\2\u034e\u0350\5\u00b0Y\2\u034f\u034d"+
		"\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"M\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355\7x\2\2\u0355\u0356\5\u0086D"+
		"\2\u0356O\3\2\2\2\u0357\u0358\7\37\2\2\u0358\u0359\5.\30\2\u0359\u035a"+
		"\7 \2\2\u035aQ\3\2\2\2\u035b\u035c\7d\2\2\u035c\u035d\7\61\2\2\u035dS"+
		"\3\2\2\2\u035e\u035f\7)\2\2\u035fU\3\2\2\2\u0360\u0368\5X-\2\u0361\u0368"+
		"\5Z.\2\u0362\u0368\5\\/\2\u0363\u0368\5^\60\2\u0364\u0368\5`\61\2\u0365"+
		"\u0368\5b\62\2\u0366\u0368\5d\63\2\u0367\u0360\3\2\2\2\u0367\u0361\3\2"+
		"\2\2\u0367\u0362\3\2\2\2\u0367\u0363\3\2\2\2\u0367\u0364\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368W\3\2\2\2\u0369\u036a\7\u0171"+
		"\2\2\u036aY\3\2\2\2\u036b\u036d\7\20\2\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\7\u0172\2\2\u036f[\3\2\2\2\u0370"+
		"\u0371\t\6\2\2\u0371\u0378\7\u0171\2\2\u0372\u0373\7!\2\2\u0373\u0374"+
		"\5f\64\2\u0374\u0375\7\u0171\2\2\u0375\u0376\7\"\2\2\u0376\u0378\3\2\2"+
		"\2\u0377\u0370\3\2\2\2\u0377\u0372\3\2\2\2\u0378]\3\2\2\2\u0379\u037a"+
		"\7\u0173\2\2\u037a_\3\2\2\2\u037b\u037c\7\u0174\2\2\u037ca\3\2\2\2\u037d"+
		"\u037e\t\7\2\2\u037ec\3\2\2\2\u037f\u0380\7j\2\2\u0380e\3\2\2\2\u0381"+
		"\u0384\7\u0170\2\2\u0382\u0384\5h\65\2\u0383\u0381\3\2\2\2\u0383\u0382"+
		"\3\2\2\2\u0384g\3\2\2\2\u0385\u0386\t\b\2\2\u0386i\3\2\2\2\u0387\u0388"+
		"\5f\64\2\u0388k\3\2\2\2\u0389\u038a\5p9\2\u038a\u038b\7\24\2\2\u038b\u038d"+
		"\3\2\2\2\u038c\u0389\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038f\5r:\2\u038fm\3\2\2\2\u0390\u0391\5p9\2\u0391\u0392\7\24\2\2\u0392"+
		"\u0394\3\2\2\2\u0393\u0390\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2"+
		"\2\2\u0395\u0396\5r:\2\u0396o\3\2\2\2\u0397\u0398\5f\64\2\u0398q\3\2\2"+
		"\2\u0399\u039a\5f\64\2\u039as\3\2\2\2\u039b\u039d\7\37\2\2\u039c\u039b"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a3\5n8\2\u039f"+
		"\u03a0\7%\2\2\u03a0\u03a2\5n8\2\u03a1\u039f\3\2\2\2\u03a2\u03a5\3\2\2"+
		"\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a6\u03a8\7 \2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"u\3\2\2\2\u03a9\u03ab\7\37\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2"+
		"\u03ab\u03ac\3\2\2\2\u03ac\u03b1\5l\67\2\u03ad\u03ae\7%\2\2\u03ae\u03b0"+
		"\5l\67\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\7 "+
		"\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6w\3\2\2\2\u03b7\u03b8"+
		"\5f\64\2\u03b8y\3\2\2\2\u03b9\u03c3\7\u0170\2\2\u03ba\u03bb\7\u0171\2"+
		"\2\u03bb\u03bd\7\24\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2"+
		"\2\2\u03c1\u03c3\7\u0171\2\2\u03c2\u03b9\3\2\2\2\u03c2\u03be\3\2\2\2\u03c3"+
		"{\3\2\2\2\u03c4\u03c5\t\t\2\2\u03c5}\3\2\2\2\u03c6\u03cc\7\37\2\2\u03c7"+
		"\u03ca\7\u0172\2\2\u03c8\u03c9\7%\2\2\u03c9\u03cb\7\u0172\2\2\u03ca\u03c8"+
		"\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03c7\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\7 \2\2\u03cf\177\3\2\2"+
		"\2\u03d0\u03d2\7@\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u03d4\7C\2\2\u03d4\u0081\3\2\2\2\u03d5\u03da\5\u0086D\2"+
		"\u03d6\u03d7\7%\2\2\u03d7\u03d9\5\u0086D\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u0083\3\2\2\2\u03dc"+
		"\u03da\3\2\2\2\u03dd\u03de\7\37\2\2\u03de\u03df\5\u0082B\2\u03df\u03e0"+
		"\7 \2\2\u03e0\u0085\3\2\2\2\u03e1\u03e2\bD\1\2\u03e2\u03e3\5\u008aF\2"+
		"\u03e3\u03e4\5\u0086D\5\u03e4\u03eb\3\2\2\2\u03e5\u03e6\7\37\2\2\u03e6"+
		"\u03e7\5\u0086D\2\u03e7\u03e8\7 \2\2\u03e8\u03eb\3\2\2\2\u03e9\u03eb\5"+
		"\u008cG\2\u03ea\u03e1\3\2\2\2\u03ea\u03e5\3\2\2\2\u03ea\u03e9\3\2\2\2"+
		"\u03eb\u03f2\3\2\2\2\u03ec\u03ed\f\6\2\2\u03ed\u03ee\5\u0088E\2\u03ee"+
		"\u03ef\5\u0086D\7\u03ef\u03f1\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f1\u03f4"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u0087\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f5\u03f6\t\n\2\2\u03f6\u0089\3\2\2\2\u03f7\u03f8\t\13"+
		"\2\2\u03f8\u008b\3\2\2\2\u03f9\u03fa\bG\1\2\u03fa\u03fb\5\u0090I\2\u03fb"+
		"\u0410\3\2\2\2\u03fc\u03fd\f\7\2\2\u03fd\u03ff\7h\2\2\u03fe\u0400\7i\2"+
		"\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040f"+
		"\t\f\2\2\u0402\u0403\f\6\2\2\u0403\u0404\7\26\2\2\u0404\u040f\5\u0090"+
		"I\2\u0405\u0406\f\5\2\2\u0406\u0407\5\u008eH\2\u0407\u0408\5\u0090I\2"+
		"\u0408\u040f\3\2\2\2\u0409\u040a\f\4\2\2\u040a\u040b\5\u008eH\2\u040b"+
		"\u040c\t\r\2\2\u040c\u040d\5P)\2\u040d\u040f\3\2\2\2\u040e\u03fc\3\2\2"+
		"\2\u040e\u0402\3\2\2\2\u040e\u0405\3\2\2\2\u040e\u0409\3\2\2\2\u040f\u0412"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u008d\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0413\u0414\t\16\2\2\u0414\u008f\3\2\2\2\u0415\u0417\5"+
		"\u0092J\2\u0416\u0418\7i\2\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041a\7o\2\2\u041a\u041b\5P)\2\u041b\u0441\3\2\2"+
		"\2\u041c\u041e\5\u0092J\2\u041d\u041f\7i\2\2\u041e\u041d\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\7o\2\2\u0421\u0422\7\37"+
		"\2\2\u0422\u0427\5\u0086D\2\u0423\u0424\7%\2\2\u0424\u0426\5\u0086D\2"+
		"\u0425\u0423\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u042a\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042b\7 \2\2\u042b"+
		"\u0441\3\2\2\2\u042c\u042e\5\u0092J\2\u042d\u042f\7i\2\2\u042e\u042d\3"+
		"\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\7n\2\2\u0431"+
		"\u0432\5\u0092J\2\u0432\u0433\7f\2\2\u0433\u0434\5\u0090I\2\u0434\u0441"+
		"\3\2\2\2\u0435\u0437\5\u0092J\2\u0436\u0438\7i\2\2\u0437\u0436\3\2\2\2"+
		"\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\7r\2\2\u043a\u043d"+
		"\5\u0094K\2\u043b\u043c\7\u00b5\2\2\u043c\u043e\5\u0094K\2\u043d\u043b"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u0441\5\u0092J"+
		"\2\u0440\u0415\3\2\2\2\u0440\u041c\3\2\2\2\u0440\u042c\3\2\2\2\u0440\u0435"+
		"\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u0091\3\2\2\2\u0442\u0443\bJ\1\2\u0443"+
		"\u0444\5\u0094K\2\u0444\u0465\3\2\2\2\u0445\u0446\f\r\2\2\u0446\u0447"+
		"\7\b\2\2\u0447\u0464\5\u0092J\16\u0448\u0449\f\f\2\2\u0449\u044a\7\t\2"+
		"\2\u044a\u0464\5\u0092J\r\u044b\u044c\f\13\2\2\u044c\u044d\7\n\2\2\u044d"+
		"\u0464\5\u0092J\f\u044e\u044f\f\n\2\2\u044f\u0450\7\13\2\2\u0450\u0464"+
		"\5\u0092J\13\u0451\u0452\f\t\2\2\u0452\u0453\7\17\2\2\u0453\u0464\5\u0092"+
		"J\n\u0454\u0455\f\b\2\2\u0455\u0456\7\20\2\2\u0456\u0464\5\u0092J\t\u0457"+
		"\u0458\f\7\2\2\u0458\u0459\7\21\2\2\u0459\u0464\5\u0092J\b\u045a\u045b"+
		"\f\6\2\2\u045b\u045c\7\22\2\2\u045c\u0464\5\u0092J\7\u045d\u045e\f\5\2"+
		"\2\u045e\u045f\7\r\2\2\u045f\u0464\5\u0092J\6\u0460\u0461\f\4\2\2\u0461"+
		"\u0462\7\f\2\2\u0462\u0464\5\u0092J\5\u0463\u0445\3\2\2\2\u0463\u0448"+
		"\3\2\2\2\u0463\u044b\3\2\2\2\u0463\u044e\3\2\2\2\u0463\u0451\3\2\2\2\u0463"+
		"\u0454\3\2\2\2\u0463\u0457\3\2\2\2\u0463\u045a\3\2\2\2\u0463\u045d\3\2"+
		"\2\2\u0463\u0460\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466\u0093\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0469\bK"+
		"\1\2\u0469\u0489\5\u0096L\2\u046a\u0489\5T+\2\u046b\u0489\5V,\2\u046c"+
		"\u0489\5n8\2\u046d\u046e\t\17\2\2\u046e\u0489\5\u0094K\b\u046f\u0471\7"+
		"\u00b8\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2"+
		"\u0472\u0473\7\37\2\2\u0473\u0478\5\u0086D\2\u0474\u0475\7%\2\2\u0475"+
		"\u0477\5\u0086D\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2\2\2\u047b"+
		"\u047c\7 \2\2\u047c\u0489\3\2\2\2\u047d\u047f\7m\2\2\u047e\u047d\3\2\2"+
		"\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0489\5P)\2\u0481\u0482"+
		"\7!\2\2\u0482\u0483\5f\64\2\u0483\u0484\5\u0086D\2\u0484\u0485\7\"\2\2"+
		"\u0485\u0489\3\2\2\2\u0486\u0489\5\u00a8U\2\u0487\u0489\5\u00c8e\2\u0488"+
		"\u0468\3\2\2\2\u0488\u046a\3\2\2\2\u0488\u046b\3\2\2\2\u0488\u046c\3\2"+
		"\2\2\u0488\u046d\3\2\2\2\u0488\u0470\3\2\2\2\u0488\u047e\3\2\2\2\u0488"+
		"\u0481\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u048f\3\2"+
		"\2\2\u048a\u048b\f\t\2\2\u048b\u048c\7\5\2\2\u048c\u048e\5\u0094K\n\u048d"+
		"\u048a\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0095\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0496\5\u0098M\2\u0493"+
		"\u0496\5\u009eP\2\u0494\u0496\5\u00a4S\2\u0495\u0492\3\2\2\2\u0495\u0493"+
		"\3\2\2\2\u0495\u0494\3\2\2\2\u0496\u0097\3\2\2\2\u0497\u0498\5\u009aN"+
		"\2\u0498\u049a\7\37\2\2\u0499\u049b\5\u009cO\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u04a5\3\2\2\2\u049c\u04a1\5\u0086D\2\u049d\u049e"+
		"\7%\2\2\u049e\u04a0\5\u0086D\2\u049f\u049d\3\2\2\2\u04a0\u04a3\3\2\2\2"+
		"\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a6\3\2\2\2\u04a3\u04a1"+
		"\3\2\2\2\u04a4\u04a6\7\21\2\2\u04a5\u049c\3\2\2\2\u04a5\u04a4\3\2\2\2"+
		"\u04a5\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\7 \2\2\u04a8\u0099"+
		"\3\2\2\2\u04a9\u04aa\t\20\2\2\u04aa\u009b\3\2\2\2\u04ab\u04ac\7N\2\2\u04ac"+
		"\u009d\3\2\2\2\u04ad\u04b0\5\u00a0Q\2\u04ae\u04b0\5\u00a2R\2\u04af\u04ad"+
		"\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u009f\3\2\2\2\u04b1\u04b2\7Q\2\2\u04b2"+
		"\u04b3\7\37\2\2\u04b3\u04b4\5\u0086D\2\u04b4\u04b5\7_\2\2\u04b5\u04b6"+
		"\5\u00be`\2\u04b6\u04b7\7 \2\2\u04b7\u00a1\3\2\2\2\u04b8\u04b9\7\u0081"+
		"\2\2\u04b9\u04ba\7\37\2\2\u04ba\u04bf\5\u0086D\2\u04bb\u04bc\7%\2\2\u04bc"+
		"\u04be\5\u0086D\2\u04bd\u04bb\3\2\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd"+
		"\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c4\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2"+
		"\u04c3\7]\2\2\u04c3\u04c5\5\u00d8m\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3"+
		"\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7 \2\2\u04c7\u00a3\3\2\2\2\u04c8"+
		"\u04c9\5\u00a6T\2\u04c9\u04d3\7\37\2\2\u04ca\u04cf\5\u0086D\2\u04cb\u04cc"+
		"\7%\2\2\u04cc\u04ce\5\u0086D\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2"+
		"\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d4\3\2\2\2\u04d1\u04cf"+
		"\3\2\2\2\u04d2\u04d4\7\21\2\2\u04d3\u04ca\3\2\2\2\u04d3\u04d2\3\2\2\2"+
		"\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7 \2\2\u04d6\u00a5"+
		"\3\2\2\2\u04d7\u04dd\5f\64\2\u04d8\u04dd\7a\2\2\u04d9\u04dd\7\u0088\2"+
		"\2\u04da\u04dd\7\u0089\2\2\u04db\u04dd\7\u0084\2\2\u04dc\u04d7\3\2\2\2"+
		"\u04dc\u04d8\3\2\2\2\u04dc\u04d9\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04db"+
		"\3\2\2\2\u04dd\u00a7\3\2\2\2\u04de\u04e0\7O\2\2\u04df\u04e1\5\u0094K\2"+
		"\u04e0\u04df\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e4"+
		"\5\u00aaV\2\u04e3\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e3\3\2\2"+
		"\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e9\5\u00acW\2\u04e8"+
		"\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00a9\3\2\2\2\u04ea\u04eb\7P"+
		"\2\2\u04eb\u04ec\5\u0086D\2\u04ec\u04ed\7c\2\2\u04ed\u04ee\5\u0086D\2"+
		"\u04ee\u00ab\3\2\2\2\u04ef\u04f0\7b\2\2\u04f0\u04f1\5\u0086D\2\u04f1\u00ad"+
		"\3\2\2\2\u04f2\u04f3\7s\2\2\u04f3\u04f4\7u\2\2\u04f4\u04f9\5\u00b0Y\2"+
		"\u04f5\u04f6\7%\2\2\u04f6\u04f8\5\u00b0Y\2\u04f7\u04f5\3\2\2\2\u04f8\u04fb"+
		"\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00af\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fc\u0500\5n8\2\u04fd\u0500\5Z.\2\u04fe\u0500\5\u0086"+
		"D\2\u04ff\u04fc\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u04fe\3\2\2\2\u0500"+
		"\u0502\3\2\2\2\u0501\u0503\t\21\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3"+
		"\2\2\2\u0503\u00b1\3\2\2\2\u0504\u0505\5z>\2\u0505\u00b3\3\2\2\2\u0506"+
		"\u0507\7\u0170\2\2\u0507\u00b5\3\2\2\2\u0508\u050d\5\u0094K\2\u0509\u050a"+
		"\7%\2\2\u050a\u050c\5\u0094K\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2\2"+
		"\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u00b7\3\2\2\2\u050f\u050d"+
		"\3\2\2\2\u0510\u0513\5\u00b2Z\2\u0511\u0513\5n8\2\u0512\u0510\3\2\2\2"+
		"\u0512\u0511\3\2\2\2\u0513\u00b9\3\2\2\2\u0514\u0519\5\u00b8]\2\u0515"+
		"\u0516\7%\2\2\u0516\u0518\5\u00b8]\2\u0517\u0515\3\2\2\2\u0518\u051b\3"+
		"\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u00bb\3\2\2\2\u051b"+
		"\u0519\3\2\2\2\u051c\u051d\7\37\2\2\u051d\u051e\5\u00ba^\2\u051e\u051f"+
		"\7 \2\2\u051f\u00bd\3\2\2\2\u0520\u0522\5\u00c2b\2\u0521\u0523\5~@\2\u0522"+
		"\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u052c\3\2\2\2\u0524\u052c\5\u00c0"+
		"a\2\u0525\u0527\5\u00c2b\2\u0526\u0528\5~@\2\u0527\u0526\3\2\2\2\u0527"+
		"\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\5\u00c4c\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0520\3\2\2\2\u052b\u0524\3\2\2\2\u052b\u0525\3\2\2\2\u052c"+
		"\u00bf\3\2\2\2\u052d\u052e\5\u00c2b\2\u052e\u052f\7\37\2\2\u052f\u0530"+
		"\7\u0172\2\2\u0530\u0531\7\u0081\2\2\u0531\u0532\7 \2\2\u0532\u0545\3"+
		"\2\2\2\u0533\u0534\7\u00fb\2\2\u0534\u0536\5\u00c2b\2\u0535\u0537\7\u0118"+
		"\2\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\7\37\2\2\u0539\u053a\7\u0172\2\2\u053a\u053b\7 \2\2\u053b\u0545"+
		"\3\2\2\2\u053c\u053e\5\u00c2b\2\u053d\u053f\7\37\2\2\u053e\u053d\3\2\2"+
		"\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\5n8\2\u0541\u0543"+
		"\7 \2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544"+
		"\u052d\3\2\2\2\u0544\u0533\3\2\2\2\u0544\u053c\3\2\2\2\u0545\u00c1\3\2"+
		"\2\2\u0546\u0581\7\u0081\2\2\u0547\u0581\7\u0158\2\2\u0548\u0581\7\u0159"+
		"\2\2\u0549\u0581\7\u015a\2\2\u054a\u0581\7\u015b\2\2\u054b\u0581\7\u015c"+
		"\2\2\u054c\u0581\7\u015d\2\2\u054d\u054e\7\u015d\2\2\u054e\u0581\7\u0159"+
		"\2\2\u054f\u0581\7\u015e\2\2\u0550\u0581\7\u015f\2\2\u0551\u0581\7\u0160"+
		"\2\2\u0552\u0581\7\u0161\2\2\u0553\u0581\7\u0162\2\2\u0554\u0581\7\177"+
		"\2\2\u0555\u0581\7\u0163\2\2\u0556\u0581\7\u0164\2\2\u0557\u0581\7\u00ab"+
		"\2\2\u0558\u0581\7\u0165\2\2\u0559\u0581\7U\2\2\u055a\u0581\7\u0166\2"+
		"\2\u055b\u0581\7\u0167\2\2\u055c\u0581\7\u0168\2\2\u055d\u0581\7\u0169"+
		"\2\2\u055e\u0581\7\u016a\2\2\u055f\u0581\7\u016b\2\2\u0560\u0581\7\u016c"+
		"\2\2\u0561\u0581\7\u016d\2\2\u0562\u0581\7\u0085\2\2\u0563\u0581\7\u0087"+
		"\2\2\u0564\u0565\7\u0087\2\2\u0565\u0566\7L\2\2\u0566\u0567\7\u0086\2"+
		"\2\u0567\u0581\7\u011a\2\2\u0568\u0569\7\u0087\2\2\u0569\u056a\7L\2\2"+
		"\u056a\u056b\7\u00a4\2\2\u056b\u056c\7\u0086\2\2\u056c\u0581\7\u011a\2"+
		"\2\u056d\u056e\7\u0084\2\2\u056e\u056f\7\u008e\2\2\u056f\u0570\7e\2\2"+
		"\u0570\u0581\7\u0091\2\2\u0571\u0572\7\u0084\2\2\u0572\u0573\7\u008a\2"+
		"\2\u0573\u0574\7e\2\2\u0574\u0581\7\u008c\2\2\u0575\u0581\7\u016e\2\2"+
		"\u0576\u0581\7\u00b2\2\2\u0577\u0581\7\u00ac\2\2\u0578\u0579\7\u0080\2"+
		"\2\u0579\u0581\7E\2\2\u057a\u0581\7\u00af\2\2\u057b\u0581\7\u00b0\2\2"+
		"\u057c\u0581\7\u00ad\2\2\u057d\u0581\7\u00b1\2\2\u057e\u0581\7\u016f\2"+
		"\2\u057f\u0581\7\u0170\2\2\u0580\u0546\3\2\2\2\u0580\u0547\3\2\2\2\u0580"+
		"\u0548\3\2\2\2\u0580\u0549\3\2\2\2\u0580\u054a\3\2\2\2\u0580\u054b\3\2"+
		"\2\2\u0580\u054c\3\2\2\2\u0580\u054d\3\2\2\2\u0580\u054f\3\2\2\2\u0580"+
		"\u0550\3\2\2\2\u0580\u0551\3\2\2\2\u0580\u0552\3\2\2\2\u0580\u0553\3\2"+
		"\2\2\u0580\u0554\3\2\2\2\u0580\u0555\3\2\2\2\u0580\u0556\3\2\2\2\u0580"+
		"\u0557\3\2\2\2\u0580\u0558\3\2\2\2\u0580\u0559\3\2\2\2\u0580\u055a\3\2"+
		"\2\2\u0580\u055b\3\2\2\2\u0580\u055c\3\2\2\2\u0580\u055d\3\2\2\2\u0580"+
		"\u055e\3\2\2\2\u0580\u055f\3\2\2\2\u0580\u0560\3\2\2\2\u0580\u0561\3\2"+
		"\2\2\u0580\u0562\3\2\2\2\u0580\u0563\3\2\2\2\u0580\u0564\3\2\2\2\u0580"+
		"\u0568\3\2\2\2\u0580\u056d\3\2\2\2\u0580\u0571\3\2\2\2\u0580\u0575\3\2"+
		"\2\2\u0580\u0576\3\2\2\2\u0580\u0577\3\2\2\2\u0580\u0578\3\2\2\2\u0580"+
		"\u057a\3\2\2\2\u0580\u057b\3\2\2\2\u0580\u057c\3\2\2\2\u0580\u057d\3\2"+
		"\2\2\u0580\u057e\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u00c3\3\2\2\2\u0582"+
		"\u0584\7L\2\2\u0583\u0585\7\u00a4\2\2\u0584\u0583\3\2\2\2\u0584\u0585"+
		"\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587\7\u0086\2\2\u0587\u0589\7\u011a"+
		"\2\2\u0588\u0582\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u0594\3\2\2\2\u058a"+
		"\u058b\7e\2\2\u058b\u0594\7\u008c\2\2\u058c\u058d\7e\2\2\u058d\u0591\7"+
		"\u0091\2\2\u058e\u058f\7\37\2\2\u058f\u0590\7\u0172\2\2\u0590\u0592\7"+
		" \2\2\u0591\u058e\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593"+
		"\u0588\3\2\2\2\u0593\u058a\3\2\2\2\u0593\u058c\3\2\2\2\u0594\u00c5\3\2"+
		"\2\2\u0595\u0596\7\u0112\2\2\u0596\u0597\7\37\2\2\u0597\u0598\5\u0086"+
		"D\2\u0598\u059a\7_\2\2\u0599\u059b\7\u0103\2\2\u059a\u0599\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\5\u00c2b\2\u059d\u059e"+
		"\7 \2\2\u059e\u00c7\3\2\2\2\u059f\u05a5\5\u00c6d\2\u05a0\u05a5\5\u00ca"+
		"f\2\u05a1\u05a5\5\u00d2j\2\u05a2\u05a5\5\u00d4k\2\u05a3\u05a5\5\u00d6"+
		"l\2\u05a4\u059f\3\2\2\2\u05a4\u05a0\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a4"+
		"\u05a2\3\2\2\2\u05a4\u05a3\3\2\2\2\u05a5\u00c9\3\2\2\2\u05a6\u05a9\7O"+
		"\2\2\u05a7\u05aa\5\u00ccg\2\u05a8\u05aa\5\u00ceh\2\u05a9\u05a7\3\2\2\2"+
		"\u05a9\u05a8\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05ad\5\u00d0i\2\u05ac"+
		"\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\7\u00e8"+
		"\2\2\u05af\u00cb\3\2\2\2\u05b0\u05b2\5\u0086D\2\u05b1\u05b3\5\u00ceh\2"+
		"\u05b2\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5"+
		"\3\2\2\2\u05b5\u00cd\3\2\2\2\u05b6\u05b7\7P\2\2\u05b7\u05b8\5\u0086D\2"+
		"\u05b8\u05b9\7c\2\2\u05b9\u05ba\5\u0094K\2\u05ba\u00cf\3\2\2\2\u05bb\u05bc"+
		"\7b\2\2\u05bc\u05bd\5\u0086D\2\u05bd\u00d1\3\2\2\2\u05be\u05bf\7\37\2"+
		"\2\u05bf\u05c0\5\u0086D\2\u05c0\u05c1\7\20\2\2\u05c1\u05c2\5\u0086D\2"+
		"\u05c2\u05d8\7 \2\2\u05c3\u05c7\7\u008e\2\2\u05c4\u05c5\7\37\2\2\u05c5"+
		"\u05c6\7\u0172\2\2\u05c6\u05c8\7 \2\2\u05c7\u05c4\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\7e\2\2\u05ca\u05ce\7\u0091\2"+
		"\2\u05cb\u05cc\7\37\2\2\u05cc\u05cd\7\u0172\2\2\u05cd\u05cf\7 \2\2\u05ce"+
		"\u05cb\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d9\3\2\2\2\u05d0\u05d4\7\u008a"+
		"\2\2\u05d1\u05d2\7\37\2\2\u05d2\u05d3\7\u0172\2\2\u05d3\u05d5\7 \2\2\u05d4"+
		"\u05d1\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\7e"+
		"\2\2\u05d7\u05d9\7\u008c\2\2\u05d8\u05c3\3\2\2\2\u05d8\u05d0\3\2\2\2\u05d9"+
		"\u00d3\3\2\2\2\u05da\u05db\7\37\2\2\u05db\u05dc\5\u0094K\2\u05dc\u05dd"+
		"\7 \2\2\u05dd\u05e0\3\2\2\2\u05de\u05e0\5\u00c6d\2\u05df\u05da\3\2\2\2"+
		"\u05df\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05ef\7\24\2\2\u05e2\u05e7"+
		"\5\u00b2Z\2\u05e3\u05e4\7\24\2\2\u05e4\u05e6\5\u00b2Z\2\u05e5\u05e3\3"+
		"\2\2\2\u05e6\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05ec\3\2\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\7\24\2\2\u05eb\u05ed\5"+
		"\u0096L\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f0\3\2\2\2"+
		"\u05ee\u05f0\5\u0096L\2\u05ef\u05e2\3\2\2\2\u05ef\u05ee\3\2\2\2\u05f0"+
		"\u00d5\3\2\2\2\u05f1\u05f2\7\u00fc\2\2\u05f2\u05f3\5\u00c2b\2\u05f3\u05f4"+
		"\5\u0084C\2\u05f4\u00d7\3\2\2\2\u05f5\u05f6\7\u0170\2\2\u05f6\u00d9\3"+
		"\2\2\2\u05f7\u05fc\5\u00d8m\2\u05f8\u05f9\7%\2\2\u05f9\u05fb\5\u00d8m"+
		"\2\u05fa\u05f8\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd"+
		"\3\2\2\2\u05fd\u00db\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7\3\2\2\u0600"+
		"\u00dd\3\2\2\2\u0601\u0602\7\63\2\2\u0602\u0603\5\u00ecw\2\u0603\u0604"+
		"\7<\2\2\u0604\u0605\5l\67\2\u0605\u0606\5\u00f4{\2\u0606\u00df\3\2\2\2"+
		"\u0607\u0608\7\63\2\2\u0608\u0609\5\u0120\u0091\2\u0609\u060a\7>\2\2\u060a"+
		"\u060b\5x=\2\u060b\u060c\7`\2\2\u060c\u060d\5\u012e\u0098\2\u060d\u00e1"+
		"\3\2\2\2\u060e\u060f\7\64\2\2\u060f\u0610\7<\2\2\u0610\u0611\5l\67\2\u0611"+
		"\u0612\5\u0132\u009a\2\u0612\u00e3\3\2\2\2\u0613\u0614\7\64\2\2\u0614"+
		"\u0615\7>\2\2\u0615\u0616\5x=\2\u0616\u0617\5\u0172\u00ba\2\u0617\u00e5"+
		"\3\2\2\2\u0618\u0619\7\65\2\2\u0619\u061a\7<\2\2\u061a\u061b\5l\67\2\u061b"+
		"\u00e7\3\2\2\2\u061c\u061d\7\65\2\2\u061d\u061e\7>\2\2\u061e\u061f\5x"+
		"=\2\u061f\u00e9\3\2\2\2\u0620\u0621\7\66\2\2\u0621\u0622\7<\2\2\u0622"+
		"\u0623\5l\67\2\u0623\u00eb\3\2\2\2\u0624\u0625\7\u00eb\2\2\u0625\u0627"+
		"\7\u0110\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u00ed\3\2\2"+
		"\2\u0628\u0629\7\37\2\2\u0629\u062a\5\u00f0y\2\u062a\u062b\7 \2\2\u062b"+
		"\u00ef\3\2\2\2\u062c\u062d\7\u010f\2\2\u062d\u062e\5\u00d8m\2\u062e\u00f1"+
		"\3\2\2\2\u062f\u0630\5\u00b4[\2\u0630\u00f3\3\2\2\2\u0631\u0632\7\37\2"+
		"\2\u0632\u0633\5\u00f6|\2\u0633\u0634\7 \2\2\u0634\u0636\3\2\2\2\u0635"+
		"\u0631\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u063b\3\2\2\2\u0637\u0638\7`"+
		"\2\2\u0638\u0639\7|\2\2\u0639\u063a\t\22\2\2\u063a\u063c\7\u00b9\2\2\u063b"+
		"\u0637\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u00f5\3\2\2\2\u063d\u0642\5\u00f8"+
		"}\2\u063e\u063f\7%\2\2\u063f\u0641\5\u00f8}\2\u0640\u063e\3\2\2\2\u0641"+
		"\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u00f7\3\2"+
		"\2\2\u0644\u0642\3\2\2\2\u0645\u064a\5\u00fa~\2\u0646\u064a\5\u011a\u008e"+
		"\2\u0647\u064a\5\u011c\u008f\2\u0648\u064a\5\u011e\u0090\2\u0649\u0645"+
		"\3\2\2\2\u0649\u0646\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u0648\3\2\2\2\u064a"+
		"\u00f9\3\2\2\2\u064b\u064c\5n8\2\u064c\u064e\5\u00be`\2\u064d\u064f\7"+
		"\u010c\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2"+
		"\u0650\u0655\5\u00fc\177\2\u0651\u0652\5\u00fe\u0080\2\u0652\u0653\5\u0086"+
		"D\2\u0653\u0656\3\2\2\2\u0654\u0656\5\u0100\u0081\2\u0655\u0651\3\2\2"+
		"\2\u0655\u0654\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0658"+
		"\7\u00e1\2\2\u0658\u065a\5\u0106\u0084\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u0661\3\2\2\2\u065b\u065d\5\u0108\u0085\2\u065c\u065b\3"+
		"\2\2\2\u065d\u065e\3\2\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u0662\3\2\2\2\u0660\u0662\5\u0118\u008d\2\u0661\u065c\3\2\2\2\u0661\u0660"+
		"\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u00fb\3\2\2\2\u0663\u0665\t\23\2\2"+
		"\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u00fd\3\2\2\2\u0666\u0669"+
		"\7\u0098\2\2\u0667\u0668\7`\2\2\u0668\u066a\7j\2\2\u0669\u0667\3\2\2\2"+
		"\u0669\u066a\3\2\2\2\u066a\u00ff\3\2\2\2\u066b\u0673\7\u00be\2\2\u066c"+
		"\u0674\7\u00bb\2\2\u066d\u066e\7u\2\2\u066e\u0671\7\u0098\2\2\u066f\u0670"+
		"\7`\2\2\u0670\u0672\7j\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672"+
		"\u0674\3\2\2\2\u0673\u066c\3\2\2\2\u0673\u066d\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675\u0676\7_\2\2\u0676\u0677\7\u00ed\2\2\u0677\u0678\5\u0102\u0082"+
		"\2\u0678\u0101\3\2\2\2\u0679\u067b\7\37\2\2\u067a\u0679\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u0681\3\2\2\2\u067c\u067e\5\u0104\u0083\2\u067d\u067c"+
		"\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0682\3\2\2\2\u0681\u067d\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0684\3\2"+
		"\2\2\u0683\u0685\7 \2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685"+
		"\u0103\3\2\2\2\u0686\u0687\7\u00c3\2\2\u0687\u068b\7L\2\2\u0688\u068c"+
		"\7\u0172\2\2\u0689\u068a\7y\2\2\u068a\u068c\7\u0117\2\2\u068b\u0688\3"+
		"\2\2\2\u068b\u0689\3\2\2\2\u068c\u069e\3\2\2\2\u068d\u068e\7\u00ef\2\2"+
		"\u068e\u068f\7u\2\2\u068f\u069e\7\u0172\2\2\u0690\u0691\7\u00f4\2\2\u0691"+
		"\u069e\7\u0172\2\2\u0692\u069e\7\u00f6\2\2\u0693\u0694\7\u00f5\2\2\u0694"+
		"\u069e\7\u0172\2\2\u0695\u069e\7\u00f7\2\2\u0696\u069e\7\u00de\2\2\u0697"+
		"\u069e\7\u00df\2\2\u0698\u0699\7\u00d9\2\2\u0699\u069e\7\u0172\2\2\u069a"+
		"\u069e\7\u00da\2\2\u069b\u069e\7s\2\2\u069c\u069e\7\u00fd\2\2\u069d\u0686"+
		"\3\2\2\2\u069d\u068d\3\2\2\2\u069d\u0690\3\2\2\2\u069d\u0692\3\2\2\2\u069d"+
		"\u0693\3\2\2\2\u069d\u0695\3\2\2\2\u069d\u0696\3\2\2\2\u069d\u0697\3\2"+
		"\2\2\u069d\u0698\3\2\2\2\u069d\u069a\3\2\2\2\u069d\u069b\3\2\2\2\u069d"+
		"\u069c\3\2\2\2\u069e\u0105\3\2\2\2\u069f\u06a0\7]\2\2\u06a0\u06a2\7\u0171"+
		"\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a6\3\2\2\2\u06a3"+
		"\u06a4\7\u00ec\2\2\u06a4\u06a5\7u\2\2\u06a5\u06a7\7\u0171\2\2\u06a6\u06a3"+
		"\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a9\3\2\2\2\u06a8\u06aa\7\u0171\2"+
		"\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06af\3\2\2\2\u06ab\u06ad"+
		"\7\u0113\2\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2"+
		"\2\u06ae\u06b0\7\u010a\2\2\u06af\u06ac\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0"+
		"\u0107\3\2\2\2\u06b1\u06b2\7?\2\2\u06b2\u06b4\5\u00d8m\2\u06b3\u06b1\3"+
		"\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06c1\3\2\2\2\u06b5\u06b7\7i\2\2\u06b6"+
		"\u06b5\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06c2\7j"+
		"\2\2\u06b9\u06c2\7A\2\2\u06ba\u06c2\5\u0080A\2\u06bb\u06c2\5\u010a\u0086"+
		"\2\u06bc\u06bd\7\u00bd\2\2\u06bd\u06be\7\37\2\2\u06be\u06bf\5\u0086D\2"+
		"\u06bf\u06c0\7 \2\2\u06c0\u06c2\3\2\2\2\u06c1\u06b6\3\2\2\2\u06c1\u06b9"+
		"\3\2\2\2\u06c1\u06ba\3\2\2\2\u06c1\u06bb\3\2\2\2\u06c1\u06bc\3\2\2\2\u06c2"+
		"\u06c6\3\2\2\2\u06c3\u06c5\5\u010c\u0087\2\u06c4\u06c3\3\2\2\2\u06c5\u06c8"+
		"\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u0109\3\2\2\2\u06c8"+
		"\u06c6\3\2\2\2\u06c9\u06ca\7\u00c2\2\2\u06ca\u06cc\5l\67\2\u06cb\u06cd"+
		"\5t;\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06d5\3\2\2\2\u06ce"+
		"\u06cf\7`\2\2\u06cf\u06d3\7\62\2\2\u06d0\u06d4\7\u00bc\2\2\u06d1\u06d2"+
		"\7;\2\2\u06d2\u06d4\7j\2\2\u06d3\u06d0\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4"+
		"\u06d6\3\2\2\2\u06d5\u06ce\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u010b\3\2"+
		"\2\2\u06d7\u06e2\5\u010e\u0088\2\u06d8\u06e2\5\u0110\u0089\2\u06d9\u06e2"+
		"\7\u0105\2\2\u06da\u06e2\7\u00fe\2\2\u06db\u06e2\5\u0114\u008b\2\u06dc"+
		"\u06e2\7\u009a\2\2\u06dd\u06e2\7\u009b\2\2\u06de\u06e2\7\u0115\2\2\u06df"+
		"\u06e2\7\u0116\2\2\u06e0\u06e2\5\u0112\u008a\2\u06e1\u06d7\3\2\2\2\u06e1"+
		"\u06d8\3\2\2\2\u06e1\u06d9\3\2\2\2\u06e1\u06da\3\2\2\2\u06e1\u06db\3\2"+
		"\2\2\u06e1\u06dc\3\2\2\2\u06e1\u06dd\3\2\2\2\u06e1\u06de\3\2\2\2\u06e1"+
		"\u06df\3\2\2\2\u06e1\u06e0\3\2\2\2\u06e2\u010d\3\2\2\2\u06e3\u06e5\7i"+
		"\2\2\u06e4\u06e3\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6"+
		"\u06e7\7\u00e3\2\2\u06e7\u010f\3\2\2\2\u06e8\u06e9\7\u00f0\2\2\u06e9\u06ea"+
		"\t\24\2\2\u06ea\u0111\3\2\2\2\u06eb\u06ec\7\u00e9\2\2\u06ec\u06ed\7J\2"+
		"\2\u06ed\u06ee\5l\67\2\u06ee\u0113\3\2\2\2\u06ef\u06f0\7]\2\2\u06f0\u06f3"+
		"\7>\2\2\u06f1\u06f4\5x=\2\u06f2\u06f4\5\u0116\u008c\2\u06f3\u06f1\3\2"+
		"\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u0115\3\2\2\2\u06f5"+
		"\u06f6\7\37\2\2\u06f6\u06f7\5\u00e0q\2\u06f7\u06f8\7 \2\2\u06f8\u0117"+
		"\3\2\2\2\u06f9\u06fa\7\u010b\2\2\u06fa\u06fb\7h\2\2\u06fb\u070a\5l\67"+
		"\2\u06fc\u06fd\7L\2\2\u06fd\u070a\7\u0109\2\2\u06fe\u06ff\7?\2\2\u06ff"+
		"\u0701\5\u00d8m\2\u0700\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0706\5\u010a\u0086\2\u0703\u0705\5\u010c\u0087\2\u0704"+
		"\u0703\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2"+
		"\2\2\u0707\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u06f9\3\2\2\2\u0709"+
		"\u06fc\3\2\2\2\u0709\u0700\3\2\2\2\u070a\u0119\3\2\2\2\u070b\u070d\5n"+
		"8\2\u070c\u070e\5\u00be`\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e"+
		"\u0711\3\2\2\2\u070f\u0710\7\u00be\2\2\u0710\u0712\7\u00bb\2\2\u0711\u070f"+
		"\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\7_\2\2\u0714"+
		"\u0715\7\37\2\2\u0715\u0716\5\u0086D\2\u0716\u0718\7 \2\2\u0717\u0719"+
		"\7\u0119\2\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071d\3\2\2"+
		"\2\u071a\u071c\5\u0108\u0085\2\u071b\u071a\3\2\2\2\u071c\u071f\3\2\2\2"+
		"\u071d\u071b\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u011b\3\2\2\2\u071f\u071d"+
		"\3\2\2\2\u0720\u0721\7?\2\2\u0721\u0723\5\u00d8m\2\u0722\u0720\3\2\2\2"+
		"\u0722\u0723\3\2\2\2\u0723\u0733\3\2\2\2\u0724\u0725\7A\2\2\u0725\u0734"+
		"\5t;\2\u0726\u0727\5\u0080A\2\u0727\u0728\5t;\2\u0728\u0734\3\2\2\2\u0729"+
		"\u072a\7B\2\2\u072a\u072b\7C\2\2\u072b\u072c\5t;\2\u072c\u072d\5\u010a"+
		"\u0086\2\u072d\u0734\3\2\2\2\u072e\u072f\7\u00bd\2\2\u072f\u0730\7\37"+
		"\2\2\u0730\u0731\5\u0086D\2\u0731\u0732\7 \2\2\u0732\u0734\3\2\2\2\u0733"+
		"\u0724\3\2\2\2\u0733\u0726\3\2\2\2\u0733\u0729\3\2\2\2\u0733\u072e\3\2"+
		"\2\2\u0734\u0738\3\2\2\2\u0735\u0737\5\u010c\u0087\2\u0736\u0735\3\2\2"+
		"\2\u0737\u073a\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u011d"+
		"\3\2\2\2\u073a\u0738\3\2\2\2\u073b\u073c\7\u010b\2\2\u073c\u073d\7d\2"+
		"\2\u073d\u073e\7\37\2\2\u073e\u073f\5\u00b8]\2\u073f\u0740\7 \2\2\u0740"+
		"\u0741\7h\2\2\u0741\u0742\5l\67\2\u0742\u0759\3\2\2\2\u0743\u0744\7\u0103"+
		"\2\2\u0744\u0745\7\37\2\2\u0745\u0746\5\u00b8]\2\u0746\u0747\7 \2\2\u0747"+
		"\u0748\7L\2\2\u0748\u0749\7\u0109\2\2\u0749\u0759\3\2\2\2\u074a\u074b"+
		"\7?\2\2\u074b\u074d\5\u00d8m\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2"+
		"\u074d\u074e\3\2\2\2\u074e\u074f\7B\2\2\u074f\u0750\7C\2\2\u0750\u0751"+
		"\5\u00bc_\2\u0751\u0755\5\u010a\u0086\2\u0752\u0754\5\u010c\u0087\2\u0753"+
		"\u0752\3\2\2\2\u0754\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2"+
		"\2\2\u0756\u0759\3\2\2\2\u0757\u0755\3\2\2\2\u0758\u073b\3\2\2\2\u0758"+
		"\u0743\3\2\2\2\u0758\u074c\3\2\2\2\u0759\u011f\3\2\2\2\u075a\u075c\t\25"+
		"\2\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u0121\3\2\2\2\u075d"+
		"\u075f\5l\67\2\u075e\u0760\58\35\2\u075f\u075e\3\2\2\2\u075f\u0760\3\2"+
		"\2\2\u0760\u0761\3\2\2\2\u0761\u0762\5\u0124\u0093\2\u0762\u0123\3\2\2"+
		"\2\u0763\u0764\7\37\2\2\u0764\u0769\5\u0126\u0094\2\u0765\u0766\7%\2\2"+
		"\u0766\u0768\5\u0126\u0094\2\u0767\u0765\3\2\2\2\u0768\u076b\3\2\2\2\u0769"+
		"\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c\3\2\2\2\u076b\u0769\3\2"+
		"\2\2\u076c\u076d\7 \2\2\u076d\u0125\3\2\2\2\u076e\u0771\5n8\2\u076f\u0771"+
		"\5\u0086D\2\u0770\u076e\3\2\2\2\u0770\u076f\3\2\2\2\u0771\u0773\3\2\2"+
		"\2\u0772\u0774\t\21\2\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774"+
		"\u0127\3\2\2\2\u0775\u0776\5l\67\2\u0776\u0777\5\u012a\u0096\2\u0777\u0778"+
		"\7T\2\2\u0778\u0779\5\u0130\u0099\2\u0779\u077a\7^\2\2\u077a\u077b\5\u0086"+
		"D\2\u077b\u0129\3\2\2\2\u077c\u077d\7\37\2\2\u077d\u0782\5\u012c\u0097"+
		"\2\u077e\u077f\7%\2\2\u077f\u0781\5\u012c\u0097\2\u0780\u077e\3\2\2\2"+
		"\u0781\u0784\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0785"+
		"\3\2\2\2\u0784\u0782\3\2\2\2\u0785\u0786\7 \2\2\u0786\u012b\3\2\2\2\u0787"+
		"\u078a\5l\67\2\u0788\u078a\58\35\2\u0789\u0787\3\2\2\2\u0789\u0788\3\2"+
		"\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078d\5n8\2\u078c\u078e"+
		"\t\21\2\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u012d\3\2\2\2"+
		"\u078f\u0792\5\u0122\u0092\2\u0790\u0792\5\u0128\u0095\2\u0791\u078f\3"+
		"\2\2\2\u0791\u0790\3\2\2\2\u0792\u012f\3\2\2\2\u0793\u0795\5l\67\2\u0794"+
		"\u0796\58\35\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079e\3\2"+
		"\2\2\u0797\u0798\7%\2\2\u0798\u079a\5l\67\2\u0799\u079b\58\35\2\u079a"+
		"\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079d\3\2\2\2\u079c\u0797\3\2"+
		"\2\2\u079d\u07a0\3\2\2\2\u079e\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u0131\3\2\2\2\u07a0\u079e\3\2\2\2\u07a1\u07a6\5\u0134\u009b\2\u07a2\u07a6"+
		"\5\u0138\u009d\2\u07a3\u07a6\5\u015c\u00af\2\u07a4\u07a6\5\u016c\u00b7"+
		"\2\u07a5\u07a1\3\2\2\2\u07a5\u07a2\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a4"+
		"\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u0133\3\2\2\2\u07a7\u07ab\5\u0136\u009c"+
		"\2\u07a8\u07a9\7\u0104\2\2\u07a9\u07ab\5\u0106\u0084\2\u07aa\u07a7\3\2"+
		"\2\2\u07aa\u07a8\3\2\2\2\u07ab\u0135\3\2\2\2\u07ac\u07ad\7\u0106\2\2\u07ad"+
		"\u07ae\7e\2\2\u07ae\u07af\5f\64\2\u07af\u0137\3\2\2\2\u07b0\u07b2\5\u013a"+
		"\u009e\2\u07b1\u07b0\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3"+
		"\u07b4\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b7\5\u015a\u00ae\2\u07b6\u07b1"+
		"\3\2\2\2\u07b6\u07b5\3\2\2\2\u07b7\u0139\3\2\2\2\u07b8\u07bc\5\u013c\u009f"+
		"\2\u07b9\u07bc\5\u014a\u00a6\2\u07ba\u07bc\5\u0150\u00a9\2\u07bb\u07b8"+
		"\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07ba\3\2\2\2\u07bc\u013b\3\2\2\2\u07bd"+
		"\u07be\7:\2\2\u07be\u07c0\5\u013e\u00a0\2\u07bf\u07c1\5\u0142\u00a2\2"+
		"\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u013d\3\2\2\2\u07c2\u07c3"+
		"\7\37\2\2\u07c3\u07c8\5\u0140\u00a1\2\u07c4\u07c5\7%\2\2\u07c5\u07c7\5"+
		"\u0140\u00a1\2\u07c6\u07c4\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2"+
		"\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb"+
		"\u07cc\7 \2\2\u07cc\u07cf\3\2\2\2\u07cd\u07cf\5\u0140\u00a1\2\u07ce\u07c2"+
		"\3\2\2\2\u07ce\u07cd\3\2\2\2\u07cf\u013f\3\2\2\2\u07d0\u07d3\5\u00fa~"+
		"\2\u07d1\u07d3\5\u011a\u008e\2\u07d2\u07d0\3\2\2\2\u07d2\u07d1\3\2\2\2"+
		"\u07d3\u0141\3\2\2\2\u07d4\u07d6\5\u0144\u00a3\2\u07d5\u07d4\3\2\2\2\u07d6"+
		"\u07d7\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u0143\3\2"+
		"\2\2\u07d9\u07da\5\u0146\u00a4\2\u07da\u0145\3\2\2\2\u07db\u07dc\7=\2"+
		"\2\u07dc\u07dd\5n8\2\u07dd\u07de\5\u0148\u00a5\2\u07de\u0147\3\2\2\2\u07df"+
		"\u07e1\7\u00e7\2\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2"+
		"\3\2\2\2\u07e2\u07e3\7h\2\2\u07e3\u07e5\7\u00ff\2\2\u07e4\u07e6\7\u00ae"+
		"\2\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7"+
		"\u07e9\7\37\2\2\u07e8\u07ea\7\u0100\2\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea"+
		"\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\5\u00c2b\2\u07ec\u07ed\7 \2\2"+
		"\u07ed\u07f6\3\2\2\2\u07ee\u07f0\7i\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\7\u010e\2\2\u07f2\u07f3\7\u00d7"+
		"\2\2\u07f3\u07f4\7p\2\2\u07f4\u07f6\7\u00f3\2\2\u07f5\u07e0\3\2\2\2\u07f5"+
		"\u07ef\3\2\2\2\u07f6\u0149\3\2\2\2\u07f7\u0807\7\u00fa\2\2\u07f8\u07fa"+
		"\7\37\2\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2"+
		"\u07fb\u0800\5\u014c\u00a7\2\u07fc\u07fd\7%\2\2\u07fd\u07ff\5\u014c\u00a7"+
		"\2\u07fe\u07fc\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801"+
		"\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u0805\7 \2\2\u0804"+
		"\u0803\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0808\3\2\2\2\u0806\u0808\5\u014e"+
		"\u00a8\2\u0807\u07f9\3\2\2\2\u0807\u0806\3\2\2\2\u0808\u014b\3\2\2\2\u0809"+
		"\u080b\5n8\2\u080a\u080c\5\u00be`\2\u080b\u080a\3\2\2\2\u080b\u080c\3"+
		"\2\2\2\u080c\u080f\3\2\2\2\u080d\u080e\7\u0098\2\2\u080e\u0810\5\u0086"+
		"D\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0814\3\2\2\2\u0811"+
		"\u0812\7\u00e1\2\2\u0812\u0815\5\u0106\u0084\2\u0813\u0815\7\u00e2\2\2"+
		"\u0814\u0811\3\2\2\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0819"+
		"\3\2\2\2\u0816\u0818\5\u0108\u0085\2\u0817\u0816\3\2\2\2\u0818\u081b\3"+
		"\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u014d\3\2\2\2\u081b"+
		"\u0819\3\2\2\2\u081c\u081d\7=\2\2\u081d\u081f\5n8\2\u081e\u0820\7i\2\2"+
		"\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822"+
		"\7\u010e\2\2\u0822\u0823\7\u00d7\2\2\u0823\u0824\7p\2\2\u0824\u0826\7"+
		"\u00f3\2\2\u0825\u0827\7\u00ea\2\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2"+
		"\2\2\u0827\u014f\3\2\2\2\u0828\u0829\7;\2\2\u0829\u082a\7\u0114\2\2\u082a"+
		"\u082e\5\u0154\u00ab\2\u082b\u082d\5\u0156\u00ac\2\u082c\u082b\3\2\2\2"+
		"\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0833"+
		"\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0833\5\u0152\u00aa\2\u0832\u0828\3"+
		"\2\2\2\u0832\u0831\3\2\2\2\u0833\u0151\3\2\2\2\u0834\u0835\7\65\2\2\u0835"+
		"\u0839\5\u0154\u00ab\2\u0836\u0838\5\u0156\u00ac\2\u0837\u0836\3\2\2\2"+
		"\u0838\u083b\3\2\2\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083d"+
		"\3\2\2\2\u083b\u0839\3\2\2\2\u083c\u083e\5\u0158\u00ad\2\u083d\u083c\3"+
		"\2\2\2\u083d\u083e\3\2\2\2\u083e\u0153\3\2\2\2\u083f\u0840\7=\2\2\u0840"+
		"\u084d\5n8\2\u0841\u0842\7\37\2\2\u0842\u0847\5n8\2\u0843\u0844\7%\2\2"+
		"\u0844\u0846\5n8\2\u0845\u0843\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0845"+
		"\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084a\3\2\2\2\u0849\u0847\3\2\2\2\u084a"+
		"\u084b\7 \2\2\u084b\u084d\3\2\2\2\u084c\u083f\3\2\2\2\u084c\u0841\3\2"+
		"\2\2\u084d\u0155\3\2\2\2\u084e\u084f\7\u00bc\2\2\u084f\u0852\7\u00dd\2"+
		"\2\u0850\u0852\7\u00f1\2\2\u0851\u084e\3\2\2\2\u0851\u0850\3\2\2\2\u0852"+
		"\u0157\3\2\2\2\u0853\u0854\7\u00db\2\2\u0854\u0855\7\u0172\2\2\u0855\u0159"+
		"\3\2\2\2\u0856\u0857\7\u0106\2\2\u0857\u0858\7=\2\2\u0858\u0859\5n8\2"+
		"\u0859\u085a\7e\2\2\u085a\u085b\5n8\2\u085b\u015b\3\2\2\2\u085c\u0865"+
		"\5\u015e\u00b0\2\u085d\u0865\5\u0160\u00b1\2\u085e\u0865\5\u0168\u00b5"+
		"\2\u085f\u0861\5\u016a\u00b6\2\u0860\u085f\3\2\2\2\u0861\u0862\3\2\2\2"+
		"\u0862\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0865\3\2\2\2\u0864\u085c"+
		"\3\2\2\2\u0864\u085d\3\2\2\2\u0864\u085e\3\2\2\2\u0864\u0860\3\2\2\2\u0865"+
		"\u015d\3\2\2\2\u0866\u086d\7:\2\2\u0867\u0869\5\u011c\u008f\2\u0868\u0867"+
		"\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b"+
		"\u086e\3\2\2\2\u086c\u086e\5\u011e\u0090\2\u086d\u0868\3\2\2\2\u086d\u086c"+
		"\3\2\2\2\u086e\u015f\3\2\2\2\u086f\u0870\7\u00fa\2\2\u0870\u0872\5\u0164"+
		"\u00b3\2\u0871\u0873\5\u010c\u0087\2\u0872\u0871\3\2\2\2\u0873\u0874\3"+
		"\2\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\3\2\2\2\u0876"+
		"\u0878\7\u00bc\2\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0161"+
		"\3\2\2\2\u0879\u087a\7?\2\2\u087a\u087b\5\u00d8m\2\u087b\u0163\3\2\2\2"+
		"\u087c\u087f\5\u0162\u00b2\2\u087d\u087f\5\u0166\u00b4\2\u087e\u087c\3"+
		"\2\2\2\u087e\u087d\3\2\2\2\u087f\u0165\3\2\2\2\u0880\u0884\5\u0080A\2"+
		"\u0881\u0882\7A\2\2\u0882\u0884\5t;\2\u0883\u0880\3\2\2\2\u0883\u0881"+
		"\3\2\2\2\u0884\u0167\3\2\2\2\u0885\u0886\7\u0106\2\2\u0886\u0887\5\u0162"+
		"\u00b2\2\u0887\u0888\7e\2\2\u0888\u0889\5\u00d8m\2\u0889\u0169\3\2\2\2"+
		"\u088a\u0898\7\65\2\2\u088b\u088d\5\u0166\u00b4\2\u088c\u088e\7\u00bc"+
		"\2\2\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0891\3\2\2\2\u088f"+
		"\u0890\t\26\2\2\u0890\u0892\7>\2\2\u0891\u088f\3\2\2\2\u0891\u0892\3\2"+
		"\2\2\u0892\u0899\3\2\2\2\u0893\u0894\7?\2\2\u0894\u0896\5\u00d8m\2\u0895"+
		"\u0897\7\u00bc\2\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899"+
		"\3\2\2\2\u0898\u088b\3\2\2\2\u0898\u0893\3\2\2\2\u0899\u016b\3\2\2\2\u089a"+
		"\u089e\5\u013c\u009f\2\u089b\u089e\5\u014a\u00a6\2\u089c\u089e\5\u0152"+
		"\u00aa\2\u089d\u089a\3\2\2\2\u089d\u089b\3\2\2\2\u089d\u089c\3\2\2\2\u089e"+
		"\u089f\3\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u016d\3\2"+
		"\2\2\u08a1\u08a6\5\u0170\u00b9\2\u08a2\u08a3\7%\2\2\u08a3\u08a5\5\u0170"+
		"\u00b9\2\u08a4\u08a2\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u016f\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08ac\5n"+
		"8\2\u08aa\u08ac\5\u00b2Z\2\u08ab\u08a9\3\2\2\2\u08ab\u08aa\3\2\2\2\u08ac"+
		"\u08af\3\2\2\2\u08ad\u08ae\7\u0098\2\2\u08ae\u08b0\5\u0086D\2\u08af\u08ad"+
		"\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08ba\3\2\2\2\u08b1\u08b3\5\u0108\u0085"+
		"\2\u08b2\u08b1\3\2\2\2\u08b3\u08b6\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b5"+
		"\3\2\2\2\u08b5\u08bb\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b7\u08b9\5\u0118\u008d"+
		"\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2\2\2\u08ba\u08b4"+
		"\3\2\2\2\u08ba\u08b8\3\2\2\2\u08bb\u08bf\3\2\2\2\u08bc\u08bf\5\u011c\u008f"+
		"\2\u08bd\u08bf\5\u011e\u0090\2\u08be\u08ab\3\2\2\2\u08be\u08bc\3\2\2\2"+
		"\u08be\u08bd\3\2\2\2\u08bf\u0171\3\2\2\2\u08c0\u08c1\7\u0106\2\2\u08c1"+
		"\u08c2\7e\2\2\u08c2\u08c4\5x=\2\u08c3\u08c0\3\2\2\2\u08c3\u08c4\3\2\2"+
		"\2\u08c4\u0173\3\2\2\2\u08c5\u08c6\7;\2\2\u08c6\u08c7\7\u00c4\2\2\u08c7"+
		"\u0175\3\2\2\2\u08c8\u08c9\7|\2\2\u08c9\u0177\3\2\2\2\u08ca\u08cb\7}\2"+
		"\2\u08cb\u0179\3\2\2\2\u08cc\u08cd\7~\2\2\u08cd\u017b\3\2\2\2\u08ce\u08d2"+
		"\78\2\2\u08cf\u08d3\5\u0180\u00c1\2\u08d0\u08d3\5\u0182\u00c2\2\u08d1"+
		"\u08d3\5\u0184\u00c3\2\u08d2\u08cf\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d2\u08d1"+
		"\3\2\2\2\u08d3\u017d\3\2\2\2\u08d4\u08d8\79\2\2\u08d5\u08d9\5\u0180\u00c1"+
		"\2\u08d6\u08d9\5\u0182\u00c2\2\u08d7\u08d9\5\u0184\u00c3\2\u08d8\u08d5"+
		"\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d8\u08d7\3\2\2\2\u08d9\u017f\3\2\2\2\u08da"+
		"\u08db\5\u0186\u00c4\2\u08db\u08dc\7`\2\2\u08dc\u08dd\5\u018a\u00c6\2"+
		"\u08dd\u0181\3\2\2\2\u08de\u08df\5\u018c\u00c7\2\u08df\u0183\3\2\2\2\u08e0"+
		"\u08e1\5\u00dan\2\u08e1\u0185\3\2\2\2\u08e2\u08e4\5\u0188\u00c5\2\u08e3"+
		"\u08e5\5t;\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08ed\3\2\2"+
		"\2\u08e6\u08e7\7%\2\2\u08e7\u08e9\5\u0188\u00c5\2\u08e8\u08ea\5t;\2\u08e9"+
		"\u08e8\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08ec\3\2\2\2\u08eb\u08e6\3\2"+
		"\2\2\u08ec\u08ef\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee"+
		"\u0187\3\2\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08f2\7p\2\2\u08f1\u08f3\7\u00bf"+
		"\2\2\u08f2\u08f1\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u0911\3\2\2\2\u08f4"+
		"\u0911\7/\2\2\u08f5\u0911\7\60\2\2\u08f6\u0911\7\62\2\2\u08f7\u0911\7"+
		"\61\2\2\u08f8\u0911\7\64\2\2\u08f9\u0911\7\u00c0\2\2\u08fa\u0911\7\u00c1"+
		"\2\2\u08fb\u0911\7\u00c9\2\2\u08fc\u0911\7\u00ca\2\2\u08fd\u0911\7>\2"+
		"\2\u08fe\u0911\7\u00c2\2\2\u08ff\u0911\7\u00cb\2\2\u0900\u0911\7\u00cc"+
		"\2\2\u0901\u0902\7\u00cd\2\2\u0902\u0911\7\u00ce\2\2\u0903\u0904\7`\2"+
		"\2\u0904\u0905\7|\2\2\u0905\u0911\7\u00cf\2\2\u0906\u0907\7\u00d0\2\2"+
		"\u0907\u0911\7\u00d1\2\2\u0908\u0909\7\u00d2\2\2\u0909\u0911\7\u00d3\2"+
		"\2\u090a\u090b\7\u00d4\2\2\u090b\u0911\7\u00bf\2\2\u090c\u090d\7\u00d5"+
		"\2\2\u090d\u0911\7\u00a2\2\2\u090e\u090f\7\u00d6\2\2\u090f\u0911\7I\2"+
		"\2\u0910\u08f0\3\2\2\2\u0910\u08f4\3\2\2\2\u0910\u08f5\3\2\2\2\u0910\u08f6"+
		"\3\2\2\2\u0910\u08f7\3\2\2\2\u0910\u08f8\3\2\2\2\u0910\u08f9\3\2\2\2\u0910"+
		"\u08fa\3\2\2\2\u0910\u08fb\3\2\2\2\u0910\u08fc\3\2\2\2\u0910\u08fd\3\2"+
		"\2\2\u0910\u08fe\3\2\2\2\u0910\u08ff\3\2\2\2\u0910\u0900\3\2\2\2\u0910"+
		"\u0901\3\2\2\2\u0910\u0903\3\2\2\2\u0910\u0906\3\2\2\2\u0910\u0908\3\2"+
		"\2\2\u0910\u090a\3\2\2\2\u0910\u090c\3\2\2\2\u0910\u090e\3\2\2\2\u0911"+
		"\u0189\3\2\2\2\u0912\u091f\7\u00c5\2\2\u0913\u091f\7\u00e5\2\2\u0914\u091f"+
		"\7\u00e6\2\2\u0915\u0916\7\u00f8\2\2\u0916\u091f\7\u00f9\2\2\u0917\u0918"+
		"\7\u00a2\2\2\u0918\u0919\7\u0111\2\2\u0919\u091f\7\u0102\2\2\u091a\u091b"+
		"\7\u00f2\2\2\u091b\u091c\t\27\2\2\u091c\u091f\5l\67\2\u091d\u091f\5l\67"+
		"\2\u091e\u0912\3\2\2\2\u091e\u0913\3\2\2\2\u091e\u0914\3\2\2\2\u091e\u0915"+
		"\3\2\2\2\u091e\u0917\3\2\2\2\u091e\u091a\3\2\2\2\u091e\u091d\3\2\2\2\u091f"+
		"\u018b\3\2\2\2\u0920\u0921\7p\2\2\u0921\u094e\7\u00bf\2\2\u0922\u094e"+
		"\5\u0190\u00c9\2\u0923\u094e\5\u0192\u00ca\2\u0924\u094e\5\u0194\u00cb"+
		"\2\u0925\u094e\5\u0196\u00cc\2\u0926\u094e\5\u0198\u00cd\2\u0927\u094e"+
		"\5\u019a\u00ce\2\u0928\u094e\5\u019c\u00cf\2\u0929\u094e\5\u019e\u00d0"+
		"\2\u092a\u094e\5\u01a0\u00d1\2\u092b\u094e\5\u01a2\u00d2\2\u092c\u094e"+
		"\5\u01a4\u00d3\2\u092d\u094e\5\u01a6\u00d4\2\u092e\u094e\5\u01a8\u00d5"+
		"\2\u092f\u094e\5\u01aa\u00d6\2\u0930\u094e\5\u01ac\u00d7\2\u0931\u094e"+
		"\5\u01ae\u00d8\2\u0932\u094e\5\u01b0\u00d9\2\u0933\u094e\5\u01b2\u00da"+
		"\2\u0934\u094e\5\u01b4\u00db\2\u0935\u094e\5\u01b6\u00dc\2\u0936\u094e"+
		"\5\u01b8\u00dd\2\u0937\u094e\5\u01ba\u00de\2\u0938\u094e\5\u01bc\u00df"+
		"\2\u0939\u094e\5\u01be\u00e0\2\u093a\u094e\5\u01c0\u00e1\2\u093b\u094e"+
		"\5\u01c2\u00e2\2\u093c\u094e\5\u01c4\u00e3\2\u093d\u094e\5\u01c6\u00e4"+
		"\2\u093e\u094e\5\u01c8\u00e5\2\u093f\u094e\5\u01ca\u00e6\2\u0940\u094e"+
		"\5\u01cc\u00e7\2\u0941\u094e\5\u01ce\u00e8\2\u0942\u094e\5\u01d0\u00e9"+
		"\2\u0943\u094e\5\u01d2\u00ea\2\u0944\u094e\5\u01d4\u00eb\2\u0945\u094e"+
		"\5\u01d6\u00ec\2\u0946\u094e\5\u01d8\u00ed\2\u0947\u094e\5\u01da\u00ee"+
		"\2\u0948\u094e\5\u01dc\u00ef\2\u0949\u094e\5\u01de\u00f0\2\u094a\u094e"+
		"\5\u01e0\u00f1\2\u094b\u094e\5\u01e2\u00f2\2\u094c\u094e\5\u01e4\u00f3"+
		"\2\u094d\u0920\3\2\2\2\u094d\u0922\3\2\2\2\u094d\u0923\3\2\2\2\u094d\u0924"+
		"\3\2\2\2\u094d\u0925\3\2\2\2\u094d\u0926\3\2\2\2\u094d\u0927\3\2\2\2\u094d"+
		"\u0928\3\2\2\2\u094d\u0929\3\2\2\2\u094d\u092a\3\2\2\2\u094d\u092b\3\2"+
		"\2\2\u094d\u092c\3\2\2\2\u094d\u092d\3\2\2\2\u094d\u092e\3\2\2\2\u094d"+
		"\u092f\3\2\2\2\u094d\u0930\3\2\2\2\u094d\u0931\3\2\2\2\u094d\u0932\3\2"+
		"\2\2\u094d\u0933\3\2\2\2\u094d\u0934\3\2\2\2\u094d\u0935\3\2\2\2\u094d"+
		"\u0936\3\2\2\2\u094d\u0937\3\2\2\2\u094d\u0938\3\2\2\2\u094d\u0939\3\2"+
		"\2\2\u094d\u093a\3\2\2\2\u094d\u093b\3\2\2\2\u094d\u093c\3\2\2\2\u094d"+
		"\u093d\3\2\2\2\u094d\u093e\3\2\2\2\u094d\u093f\3\2\2\2\u094d\u0940\3\2"+
		"\2\2\u094d\u0941\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u094d\u0942\3\2\2\2\u094d\u0943\3\2\2\2\u094d\u0944\3\2\2\2\u094d\u0945"+
		"\3\2\2\2\u094d\u0946\3\2\2\2\u094d\u0947\3\2\2\2\u094d\u0948\3\2\2\2\u094d"+
		"\u0949\3\2\2\2\u094d\u094a\3\2\2\2\u094d\u094b\3\2\2\2\u094d\u094c\3\2"+
		"\2\2\u094e\u018d\3\2\2\2\u094f\u0951\t\30\2\2\u0950\u0952\7q\2\2\u0951"+
		"\u0950\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u018f\3\2\2\2\u0953\u0955\5\u018e"+
		"\u00c8\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\3\2\2\2\u0956"+
		"\u0957\7\u00a2\2\2\u0957\u0965\7\u0102\2\2\u0958\u0965\7\u011f\2\2\u0959"+
		"\u095b\7\u0120\2\2\u095a\u095c\7q\2\2\u095b\u095a\3\2\2\2\u095b\u095c"+
		"\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u0962\7\u00a2\2\2\u095e\u095f\7\u0121"+
		"\2\2\u095f\u0963\7;\2\2\u0960\u0961\7\u0123\2\2\u0961\u0963\7\u0124\2"+
		"\2\u0962\u095e\3\2\2\2\u0962\u0960\3\2\2\2\u0963\u0965\3\2\2\2\u0964\u0954"+
		"\3\2\2\2\u0964\u0958\3\2\2\2\u0964\u0959\3\2\2\2\u0965\u0191\3\2\2\2\u0966"+
		"\u0967\5\u018e\u00c8\2\u0967\u0968\7\u0125\2\2\u0968\u0193\3\2\2\2\u0969"+
		"\u096a\5\u018e\u00c8\2\u096a\u096b\7\u0126\2\2\u096b\u0195\3\2\2\2\u096c"+
		"\u096d\7\u0127\2\2\u096d\u096e\7\u0128\2\2\u096e\u096f\7\u0129\2\2\u096f"+
		"\u0197\3\2\2\2\u0970\u0971\7\64\2\2\u0971\u0975\t\31\2\2\u0972\u0973\7"+
		"\u012c\2\2\u0973\u0975\7\u012b\2\2\u0974\u0970\3\2\2\2\u0974\u0972\3\2"+
		"\2\2\u0975\u0199\3\2\2\2\u0976\u0978\t\32\2\2\u0977\u0979\7\u011b\2\2"+
		"\u0978\u0977\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097b"+
		"\7\u012a\2\2\u097b\u097c\7\u012d\2\2\u097c\u019b\3\2\2\2\u097d\u0982\7"+
		"\u00cb\2\2\u097e\u097f\7\u00dc\2\2\u097f\u0983\7\u011c\2\2\u0980\u0981"+
		"\7q\2\2\u0981\u0983\7H\2\2\u0982\u097e\3\2\2\2\u0982\u0980\3\2\2\2\u0983"+
		"\u019d\3\2\2\2\u0984\u0985\7\u012e\2\2\u0985\u0986\7q\2\2\u0986\u0987"+
		"\7\u012f\2\2\u0987\u019f\3\2\2\2\u0988\u0989\5\u018e\u00c8\2\u0989\u098a"+
		"\7\u0130\2\2\u098a\u01a1\3\2\2\2\u098b\u098c\5\u018e\u00c8\2\u098c\u098d"+
		"\7\u00e5\2\2\u098d\u01a3\3\2\2\2\u098e\u098f\5\u018e\u00c8\2\u098f\u0990"+
		"\7\u00e6\2\2\u0990\u01a5\3\2\2\2\u0991\u0992\7\u00cd\2\2\u0992\u0993\7"+
		"\u00ce\2\2\u0993\u0994\7\u0120\2\2\u0994\u01a7\3\2\2\2\u0995\u0996\5\u018e"+
		"\u00c8\2\u0996\u0997\7>\2\2\u0997\u01a9\3\2\2\2\u0998\u0999\5\u018e\u00c8"+
		"\2\u0999\u099a\7\u0131\2\2\u099a\u01ab\3\2\2\2\u099b\u099d\7\63\2\2\u099c"+
		"\u099e\t\33\2\2\u099d\u099c\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u099f\3"+
		"\2\2\2\u099f\u09a6\7\u0133\2\2\u09a0\u09a1\7\u00c9\2\2\u09a1\u09a2\7q"+
		"\2\2\u09a2\u09a6\t\34\2\2\u09a3\u09a4\7\u0122\2\2\u09a4\u09a6\7\u0136"+
		"\2\2\u09a5\u099b\3\2\2\2\u09a5\u09a0\3\2\2\2\u09a5\u09a3\3\2\2\2\u09a6"+
		"\u01ad\3\2\2\2\u09a7\u09a8\7\u0120\2\2\u09a8\u09a9\7C\2\2\u09a9\u09aa"+
		"\7\u0123\2\2\u09aa\u01af\3\2\2\2\u09ab\u09ac\5\u018e\u00c8\2\u09ac\u09ad"+
		"\7\u0137\2\2\u09ad\u01b1\3\2\2\2\u09ae\u09af\7\u0138\2\2\u09af\u01b3\3"+
		"\2\2\2\u09b0\u09b1\5\u018e\u00c8\2\u09b1\u09b2\7\u0139\2\2\u09b2\u09b3"+
		"\7I\2\2\u09b3\u09c0\3\2\2\2\u09b4\u09b6\7\u00eb\2\2\u09b5\u09b4\3\2\2"+
		"\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\7\u00d0\2\2\u09b8"+
		"\u09c0\7\u00d1\2\2\u09b9\u09ba\7`\2\2\u09ba\u09bb\7|\2\2\u09bb\u09c0\7"+
		"\u00cf\2\2\u09bc\u09bd\7\u00cd\2\2\u09bd\u09be\7q\2\2\u09be\u09c0\7<\2"+
		"\2\u09bf\u09b0\3\2\2\2\u09bf\u09b5\3\2\2\2\u09bf\u09b9\3\2\2\2\u09bf\u09bc"+
		"\3\2\2\2\u09c0\u01b5\3\2\2\2\u09c1\u09c5\5\u018e\u00c8\2\u09c2\u09c3\7"+
		"\u011d\2\2\u09c3\u09c5\7q\2\2\u09c4\u09c1\3\2\2\2\u09c4\u09c2\3\2\2\2"+
		"\u09c5\u09c6\3\2\2\2\u09c6\u09c7\7\u00f8\2\2\u09c7\u09c8\7\u00f9\2\2\u09c8"+
		"\u01b7\3\2\2\2\u09c9\u09ca\5\u018e\u00c8\2\u09ca\u09cb\7\u013a\2\2\u09cb"+
		"\u01b9\3\2\2\2\u09cc\u09cd\5\u018e\u00c8\2\u09cd\u09ce\7\u013b\2\2\u09ce"+
		"\u09cf\7\u013c\2\2\u09cf\u01bb\3\2\2\2\u09d0\u09d1\5\u018e\u00c8\2\u09d1"+
		"\u09d2\7\u013a\2\2\u09d2\u09d3\7\u0130\2\2\u09d3\u01bd\3\2\2\2\u09d4\u09d5"+
		"\5\u018e\u00c8\2\u09d5\u09d6\7\u013a\2\2\u09d6\u09d7\7\u013d\2\2\u09d7"+
		"\u09d8\7\u013e\2\2\u09d8\u01bf\3\2\2\2\u09d9\u09da\5\u018e\u00c8\2\u09da"+
		"\u09db\7\u013f\2\2\u09db\u01c1\3\2\2\2\u09dc\u09dd\5\u018e\u00c8\2\u09dd"+
		"\u09de\7\u0140\2\2\u09de\u01c3\3\2\2\2\u09df\u09e0\7\u0120\2\2\u09e0\u09e1"+
		"\7\u00a2\2\2\u09e1\u09e2\7\u0123\2\2\u09e2\u09e3\7\u0124\2\2\u09e3\u01c5"+
		"\3\2\2\2\u09e4\u09e5\7\63\2\2\u09e5\u09e6\7\u0141\2\2\u09e6\u09ea\7\u012a"+
		"\2\2\u09e7\u09e8\7;\2\2\u09e8\u09ea\7\u0142\2\2\u09e9\u09e4\3\2\2\2\u09e9"+
		"\u09e7\3\2\2\2\u09ea\u01c7\3\2\2\2\u09eb\u09ec\5\u018e\u00c8\2\u09ec\u09ed"+
		"\7H\2\2\u09ed\u01c9\3\2\2\2\u09ee\u09ef\5\u018e\u00c8\2\u09ef\u09f0\7"+
		"\u0102\2\2\u09f0\u01cb\3\2\2\2\u09f1\u09f5\5\u018e\u00c8\2\u09f2\u09f3"+
		"\78\2\2\u09f3\u09f5\7q\2\2\u09f4\u09f1\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f5"+
		"\u09f6\3\2\2\2\u09f6\u09f7\7\u00c6\2\2\u09f7\u01cd\3\2\2\2\u09f8\u09f9"+
		"\5\u018e\u00c8\2\u09f9\u09fa\7}\2\2\u09fa\u09fb\7\u0143\2\2\u09fb\u01cf"+
		"\3\2\2\2\u09fc\u09fd\5\u018e\u00c8\2\u09fd\u09fe\7\u00d3\2\2\u09fe\u01d1"+
		"\3\2\2\2\u09ff\u0a00\t\35\2\2\u0a00\u0a05\7\u011c\2\2\u0a01\u0a02\7\64"+
		"\2\2\u0a02\u0a03\7\u0108\2\2\u0a03\u0a05\7\u0145\2\2\u0a04\u09ff\3\2\2"+
		"\2\u0a04\u0a01\3\2\2\2\u0a05\u01d3\3\2\2\2\u0a06\u0a0a\5\u018e\u00c8\2"+
		"\u0a07\u0a08\7\u00ca\2\2\u0a08\u0a0a\7q\2\2\u0a09\u0a06\3\2\2\2\u0a09"+
		"\u0a07\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\7\u00a2\2\2\u0a0c\u0a0d"+
		"\7\u0111\2\2\u0a0d\u0a12\7\u0102\2\2\u0a0e\u0a0f\7\u00d5\2\2\u0a0f\u0a10"+
		"\7q\2\2\u0a10\u0a12\7\u00a2\2\2\u0a11\u0a09\3\2\2\2\u0a11\u0a0e\3\2\2"+
		"\2\u0a12\u01d5\3\2\2\2\u0a13\u0a14\5\u018e\u00c8\2\u0a14\u0a15\7\u0146"+
		"\2\2\u0a15\u0a1a\3\2\2\2\u0a16\u0a17\7\65\2\2\u0a17\u0a18\7\u011b\2\2"+
		"\u0a18\u0a1a\7\u0146\2\2\u0a19\u0a13\3\2\2\2\u0a19\u0a16\3\2\2\2\u0a1a"+
		"\u01d7\3\2\2\2\u0a1b\u0a1f\5\u018e\u00c8\2\u0a1c\u0a1d\t\36\2\2\u0a1d"+
		"\u0a1f\7q\2\2\u0a1e\u0a1b\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f\u0a20\3\2"+
		"\2\2\u0a20\u0a21\7<\2\2\u0a21\u01d9\3\2\2\2\u0a22\u0a26\5\u018e\u00c8"+
		"\2\u0a23\u0a26\7\u0122\2\2\u0a24\u0a26\7\u0148\2\2\u0a25\u0a22\3\2\2\2"+
		"\u0a25\u0a23\3\2\2\2\u0a25\u0a24\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a28"+
		"\7\u010f\2\2\u0a28\u01db\3\2\2\2\u0a29\u0a2a\5\u018e\u00c8\2\u0a2a\u0a2b"+
		"\7G\2\2\u0a2b\u0a30\3\2\2\2\u0a2c\u0a2d\7\u0120\2\2\u0a2d\u0a2e\7\u012a"+
		"\2\2\u0a2e\u0a30\7G\2\2\u0a2f\u0a29\3\2\2\2\u0a2f\u0a2c\3\2\2\2\u0a30"+
		"\u01dd\3\2\2\2\u0a31\u0a35\5\u018e\u00c8\2\u0a32\u0a33\7\u00cc\2\2\u0a33"+
		"\u0a35\7q\2\2\u0a34\u0a31\3\2\2\2\u0a34\u0a32\3\2\2\2\u0a35\u0a36\3\2"+
		"\2\2\u0a36\u0a37\7\u00ae\2\2\u0a37\u01df\3\2\2\2\u0a38\u0a39\5\u018e\u00c8"+
		"\2\u0a39\u0a3a\7\u00c5\2\2\u0a3a\u01e1\3\2\2\2\u0a3b\u0a3f\5\u018e\u00c8"+
		"\2\u0a3c\u0a3d\t\37\2\2\u0a3d\u0a3f\7q\2\2\u0a3e\u0a3b\3\2\2\2\u0a3e\u0a3c"+
		"\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a41\7I\2\2\u0a41\u01e3\3\2\2\2\u0a42"+
		"\u0a43\7\u012e\2\2\u0a43\u0a6f\7q\2\2\u0a44\u0a45\7\u012c\2\2\u0a45\u0a6f"+
		"\7q\2\2\u0a46\u0a47\7\u0149\2\2\u0a47\u0a6f\7\u00c5\2\2\u0a48\u0a49\7"+
		"\u014a\2\2\u0a49\u0a6f\7\u014b\2\2\u0a4a\u0a4b\7\u011d\2\2\u0a4b\u0a4c"+
		"\7q\2\2\u0a4c\u0a6f\7<\2\2\u0a4d\u0a4e\7\u0127\2\2\u0a4e\u0a4f\7\u014c"+
		"\2\2\u0a4f\u0a6f\7\u0129\2\2\u0a50\u0a52\7\u00ea\2\2\u0a51\u0a53\7q\2"+
		"\2\u0a52\u0a51\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a6f"+
		"\7\u00c4\2\2\u0a55\u0a56\78\2\2\u0a56\u0a58\7q\2\2\u0a57\u0a59\7\u0124"+
		"\2\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a"+
		"\u0a6f\7\u014d\2\2\u0a5b\u0a5c\7\u00d4\2\2\u0a5c\u0a5d\7q\2\2\u0a5d\u0a6f"+
		"\7\u00bf\2\2\u0a5e\u0a5f\7\u00d2\2\2\u0a5f\u0a60\7\u0085\2\2\u0a60\u0a6f"+
		"\7\u0086\2\2\u0a61\u0a62\7\u00d2\2\2\u0a62\u0a6f\7\u0150\2\2\u0a63\u0a64"+
		"\7\u014e\2\2\u0a64\u0a6f\7\u0156\2\2\u0a65\u0a6f\7\u014f\2\2\u0a66\u0a67"+
		"\7/\2\2\u0a67\u0a68\7q\2\2\u0a68\u0a6f\t \2\2\u0a69\u0a6f\7\u0151\2\2"+
		"\u0a6a\u0a6f\7\u0152\2\2\u0a6b\u0a6f\7\u0153\2\2\u0a6c\u0a6f\7\u0154\2"+
		"\2\u0a6d\u0a6f\7\u0155\2\2\u0a6e\u0a42\3\2\2\2\u0a6e\u0a44\3\2\2\2\u0a6e"+
		"\u0a46\3\2\2\2\u0a6e\u0a48\3\2\2\2\u0a6e\u0a4a\3\2\2\2\u0a6e\u0a4d\3\2"+
		"\2\2\u0a6e\u0a50\3\2\2\2\u0a6e\u0a55\3\2\2\2\u0a6e\u0a5b\3\2\2\2\u0a6e"+
		"\u0a5e\3\2\2\2\u0a6e\u0a61\3\2\2\2\u0a6e\u0a63\3\2\2\2\u0a6e\u0a65\3\2"+
		"\2\2\u0a6e\u0a66\3\2\2\2\u0a6e\u0a69\3\2\2\2\u0a6e\u0a6a\3\2\2\2\u0a6e"+
		"\u0a6b\3\2\2\2\u0a6e\u0a6c\3\2\2\2\u0a6e\u0a6d\3\2\2\2\u0a6f\u01e5\3\2"+
		"\2\2\u0a70\u0a71\7\63\2\2\u0a71\u0a72\7\u00c5\2\2\u0a72\u01e7\3\2\2\2"+
		"\u0a73\u0a74\7\65\2\2\u0a74\u0a75\7\u00c5\2\2\u0a75\u01e9\3\2\2\2\u0a76"+
		"\u0a77\7\64\2\2\u0a77\u0a78\7\u00c5\2\2\u0a78\u01eb\3\2\2\2\u0a79\u0a7a"+
		"\7\63\2\2\u0a7a\u0a7b\7\u00c6\2\2\u0a7b\u01ed\3\2\2\2\u0a7c\u0a7d\7\65"+
		"\2\2\u0a7d\u0a7e\7\u00c6\2\2\u0a7e\u01ef\3\2\2\2\u0a7f\u0a80\7\64\2\2"+
		"\u0a80\u0a81\7\u00c6\2\2\u0a81\u01f1\3\2\2\2\u0a82\u0a83\7\u009c\2\2\u0a83"+
		"\u01f3\3\2\2\2\u012c\u020c\u020f\u0214\u0219\u021f\u0222\u022a\u022f\u0232"+
		"\u023a\u0240\u0245\u0248\u024b\u0253\u0258\u025d\u026b\u0274\u027b\u027f"+
		"\u0283\u0287\u028a\u028f\u0292\u0296\u0299\u029c\u02a7\u02ab\u02b0\u02b4"+
		"\u02bc\u02c1\u02c6\u02ca\u02cd\u02d0\u02d3\u02d6\u02d9\u02df\u02e5\u02ea"+
		"\u02ed\u02f0\u02f3\u02f7\u0306\u030d\u0312\u0315\u0319\u031c\u031f\u0325"+
		"\u0328\u032b\u0331\u0334\u0338\u033d\u033f\u0345\u0351\u0367\u036c\u0377"+
		"\u0383\u038c\u0393\u039c\u03a3\u03a7\u03aa\u03b1\u03b5\u03be\u03c2\u03ca"+
		"\u03cc\u03d1\u03da\u03ea\u03f2\u03ff\u040e\u0410\u0417\u041e\u0427\u042e"+
		"\u0437\u043d\u0440\u0463\u0465\u0470\u0478\u047e\u0488\u048f\u0495\u049a"+
		"\u04a1\u04a5\u04af\u04bf\u04c4\u04cf\u04d3\u04dc\u04e0\u04e5\u04e8\u04f9"+
		"\u04ff\u0502\u050d\u0512\u0519\u0522\u0527\u052b\u0536\u053e\u0542\u0544"+
		"\u0580\u0584\u0588\u0591\u0593\u059a\u05a4\u05a9\u05ac\u05b4\u05c7\u05ce"+
		"\u05d4\u05d8\u05df\u05e7\u05ec\u05ef\u05fc\u0626\u0635\u063b\u0642\u0649"+
		"\u064e\u0655\u0659\u065e\u0661\u0664\u0669\u0671\u0673\u067a\u067f\u0681"+
		"\u0684\u068b\u069d\u06a1\u06a6\u06a9\u06ac\u06af\u06b3\u06b6\u06c1\u06c6"+
		"\u06cc\u06d3\u06d5\u06e1\u06e4\u06f3\u0700\u0706\u0709\u070d\u0711\u0718"+
		"\u071d\u0722\u0733\u0738\u074c\u0755\u0758\u075b\u075f\u0769\u0770\u0773"+
		"\u0782\u0789\u078d\u0791\u0795\u079a\u079e\u07a5\u07aa\u07b3\u07b6\u07bb"+
		"\u07c0\u07c8\u07ce\u07d2\u07d7\u07e0\u07e5\u07e9\u07ef\u07f5\u07f9\u0800"+
		"\u0804\u0807\u080b\u080f\u0814\u0819\u081f\u0826\u082e\u0832\u0839\u083d"+
		"\u0847\u084c\u0851\u0862\u0864\u086a\u086d\u0874\u0877\u087e\u0883\u088d"+
		"\u0891\u0896\u0898\u089d\u089f\u08a6\u08ab\u08af\u08b4\u08b8\u08ba\u08be"+
		"\u08c3\u08d2\u08d8\u08e4\u08e9\u08ed\u08f2\u0910\u091e\u094d\u0951\u0954"+
		"\u095b\u0962\u0964\u0974\u0978\u0982\u099d\u09a5\u09b5\u09bf\u09c4\u09e9"+
		"\u09f4\u0a04\u0a09\u0a11\u0a19\u0a1e\u0a25\u0a2f\u0a34\u0a3e\u0a52\u0a58"+
		"\u0a6e";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}