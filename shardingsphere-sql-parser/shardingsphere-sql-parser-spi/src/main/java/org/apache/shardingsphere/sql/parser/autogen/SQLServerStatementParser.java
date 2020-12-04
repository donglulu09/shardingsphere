// Generated from org/apache/shardingsphere/sql/parser/autogen/SQLServerStatement.g4 by ANTLR 4.7.2
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
public class SQLServerStatementParser extends Parser {
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
		DECIMAL=171, TYPE=172, BIT=173, SMALLINT=174, INT=175, TINYINT=176, NUMERIC=177, 
		FLOAT=178, BIGINT=179, TEXT=180, VARCHAR=181, PERCENT=182, TIES=183, EXCEPT=184, 
		INTERSECT=185, FOR_GENERATOR=186, BINARY=187, ESCAPE=188, HIDDEN_=189, 
		MOD=190, PARTITION=191, PARTITIONS=192, TOP=193, ROW=194, ROWS=195, UNKNOWN=196, 
		XOR=197, ALWAYS=198, CASCADE=199, CHECK=200, GENERATED=201, NO=202, OPTION=203, 
		PRIVILEGES=204, REFERENCES=205, USER=206, ROLE=207, START=208, TRANSACTION=209, 
		ACTION=210, ALGORITHM=211, AUTO=212, BLOCKERS=213, CLUSTERED=214, NONCLUSTERED=215, 
		COLLATE=216, COLUMNSTORE=217, CONTENT=218, CONVERT=219, DATABASE=220, 
		YEARS=221, MONTHS=222, WEEKS=223, DAYS=224, MINUTES=225, DENY=226, DETERMINISTIC=227, 
		DISTRIBUTION=228, DOCUMENT=229, DURABILITY=230, ENCRYPTED=231, END=232, 
		FILESTREAM=233, FILETABLE=234, FILLFACTOR=235, FOLLOWING=236, HASH=237, 
		HEAP=238, IDENTITY=239, INBOUND=240, OUTBOUND=241, UNBOUNDED=242, INFINITE=243, 
		LOGIN=244, MASKED=245, MAXDOP=246, MOVE=247, NOCHECK=248, NONE=249, OBJECT=250, 
		OFF=251, ONLINE=252, OVER=253, PAGE=254, PAUSED=255, PERIOD=256, PERSISTED=257, 
		PRECEDING=258, RANDOMIZED=259, RANGE=260, REBUILD=261, REPLICATE=262, 
		REPLICATION=263, RESUMABLE=264, ROWGUIDCOL=265, SAVE=266, SELF=267, SPARSE=268, 
		SWITCH=269, TRAN=270, TRANCOUNT=271, ZONE=272, EXECUTE=273, SESSION=274, 
		CONNECT=275, CONNECTION=276, CATALOG=277, CONTROL=278, TAKE=279, OWNERSHIP=280, 
		DEFINITION=281, APPLICATION=282, ASSEMBLY=283, SYMMETRIC=284, ASYMMETRIC=285, 
		SERVER=286, RECEIVE=287, CHANGE=288, TRACE=289, TRACKING=290, RESOURCES=291, 
		SETTINGS=292, STATE=293, AVAILABILITY=294, CREDENTIAL=295, ENDPOINT=296, 
		EVENT=297, NOTIFICATION=298, LINKED=299, AUDIT=300, DDL=301, XML=302, 
		IMPERSONATE=303, SECURABLES=304, AUTHENTICATE=305, EXTERNAL=306, ACCESS=307, 
		ADMINISTER=308, BULK=309, OPERATIONS=310, UNSAFE=311, SHUTDOWN=312, SCOPED=313, 
		CONFIGURATION=314, DATASPACE=315, SERVICE=316, CERTIFICATE=317, CONTRACT=318, 
		ENCRYPTION=319, MASTER=320, DATA=321, SOURCE=322, FILE=323, FORMAT=324, 
		LIBRARY=325, FULLTEXT=326, MASK=327, UNMASK=328, MESSAGE=329, REMOTE=330, 
		BINDING=331, ROUTE=332, SECURITY=333, POLICY=334, AGGREGATE=335, QUEUE=336, 
		RULE=337, SYNONYM=338, COLLECTION=339, SCRIPT=340, KILL=341, BACKUP=342, 
		LOG=343, SHOWPLAN=344, SUBSCRIBE=345, QUERY=346, NOTIFICATIONS=347, CHECKPOINT=348, 
		SEQUENCE=349, ABORT_AFTER_WAIT=350, ALLOW_PAGE_LOCKS=351, ALLOW_ROW_LOCKS=352, 
		ALL_SPARSE_COLUMNS=353, BUCKET_COUNT=354, COLUMNSTORE_ARCHIVE=355, COLUMN_ENCRYPTION_KEY=356, 
		COLUMN_SET=357, COMPRESSION_DELAY=358, DATABASE_DEAULT=359, DATA_COMPRESSION=360, 
		DATA_CONSISTENCY_CHECK=361, ENCRYPTION_TYPE=362, SYSTEM_TIME=363, SYSTEM_VERSIONING=364, 
		TEXTIMAGE_ON=365, WAIT_AT_LOW_PRIORITY=366, STATISTICS_INCREMENTAL=367, 
		STATISTICS_NORECOMPUTE=368, ROUND_ROBIN=369, SCHEMA_AND_DATA=370, SCHEMA_ONLY=371, 
		SORT_IN_TEMPDB=372, IGNORE_DUP_KEY=373, IMPLICIT_TRANSACTIONS=374, MAX_DURATION=375, 
		MEMORY_OPTIMIZED=376, MIGRATION_STATE=377, PAD_INDEX=378, REMOTE_DATA_ARCHIVE=379, 
		FILESTREAM_ON=380, FILETABLE_COLLATE_FILENAME=381, FILETABLE_DIRECTORY=382, 
		FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME=383, FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME=384, 
		FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME=385, FILTER_PREDICATE=386, HISTORY_RETENTION_PERIOD=387, 
		HISTORY_TABLE=388, LOCK_ESCALATION=389, DROP_EXISTING=390, ROW_NUMBER=391, 
		FETCH=392, FIRST=393, ONLY=394, MONEY=395, SMALLMONEY=396, DATETIMEOFFSET=397, 
		DATETIME=398, DATETIME2=399, SMALLDATETIME=400, NCHAR=401, NVARCHAR=402, 
		NTEXT=403, VARBINARY=404, IMAGE=405, SQL_VARIANT=406, UNIQUEIDENTIFIER=407, 
		HIERARCHYID=408, GEOMETRY=409, GEOGRAPHY=410, OUTPUT=411, INSERTED=412, 
		DELETED=413, IDENTIFIER_=414, STRING_=415, NUMBER_=416, HEX_DIGIT_=417, 
		BIT_NUM_=418;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertDefaultValue = 2, RULE_insertValuesClause = 3, 
		RULE_insertSelectClause = 4, RULE_update = 5, RULE_assignment = 6, RULE_setAssignmentsClause = 7, 
		RULE_assignmentValues = 8, RULE_assignmentValue = 9, RULE_delete = 10, 
		RULE_singleTableClause = 11, RULE_multipleTablesClause = 12, RULE_multipleTableNames = 13, 
		RULE_select = 14, RULE_aggregationClause = 15, RULE_selectClause = 16, 
		RULE_duplicateSpecification = 17, RULE_projections = 18, RULE_projection = 19, 
		RULE_top = 20, RULE_topNum = 21, RULE_alias = 22, RULE_unqualifiedShorthand = 23, 
		RULE_qualifiedShorthand = 24, RULE_fromClause = 25, RULE_tableReferences = 26, 
		RULE_tableReference = 27, RULE_tableFactor = 28, RULE_joinedTable = 29, 
		RULE_joinSpecification = 30, RULE_whereClause = 31, RULE_groupByClause = 32, 
		RULE_havingClause = 33, RULE_subquery = 34, RULE_withClause = 35, RULE_cteClause = 36, 
		RULE_outputClause = 37, RULE_outputWithColumns = 38, RULE_outputWithColumn = 39, 
		RULE_outputWithAaterisk = 40, RULE_outputTableName = 41, RULE_parameterMarker = 42, 
		RULE_literals = 43, RULE_stringLiterals = 44, RULE_numberLiterals = 45, 
		RULE_dateTimeLiterals = 46, RULE_hexadecimalLiterals = 47, RULE_bitValueLiterals = 48, 
		RULE_booleanLiterals = 49, RULE_nullValueLiterals = 50, RULE_identifier = 51, 
		RULE_unreservedWord = 52, RULE_schemaName = 53, RULE_tableName = 54, RULE_columnName = 55, 
		RULE_owner = 56, RULE_name = 57, RULE_columnNames = 58, RULE_columnNamesWithSort = 59, 
		RULE_tableNames = 60, RULE_indexName = 61, RULE_collationName = 62, RULE_dataTypeLength = 63, 
		RULE_primaryKey = 64, RULE_expr = 65, RULE_logicalOperator = 66, RULE_notOperator = 67, 
		RULE_booleanPrimary = 68, RULE_comparisonOperator = 69, RULE_predicate = 70, 
		RULE_bitExpr = 71, RULE_simpleExpr = 72, RULE_functionCall = 73, RULE_aggregationFunction = 74, 
		RULE_aggregationFunctionName = 75, RULE_distinct = 76, RULE_specialFunction = 77, 
		RULE_castFunction = 78, RULE_charFunction = 79, RULE_regularFunction = 80, 
		RULE_regularFunctionName = 81, RULE_caseExpression = 82, RULE_caseWhen = 83, 
		RULE_caseElse = 84, RULE_privateExprOfDb = 85, RULE_orderByClause = 86, 
		RULE_orderByItem = 87, RULE_dataType = 88, RULE_dataTypeName = 89, RULE_atTimeZoneExpr = 90, 
		RULE_castExpr = 91, RULE_convertExpr = 92, RULE_windowedFunction = 93, 
		RULE_overClause = 94, RULE_partitionByClause = 95, RULE_rowRangeClause = 96, 
		RULE_windowFrameExtent = 97, RULE_windowFrameBetween = 98, RULE_windowFrameBound = 99, 
		RULE_windowFramePreceding = 100, RULE_windowFrameFollowing = 101, RULE_columnNameWithSort = 102, 
		RULE_indexOption = 103, RULE_compressionOption = 104, RULE_eqTime = 105, 
		RULE_eqOnOffOption = 106, RULE_eqKey = 107, RULE_eqOnOff = 108, RULE_onPartitionClause = 109, 
		RULE_partitionExpressions = 110, RULE_partitionExpression = 111, RULE_numberRange = 112, 
		RULE_lowPriorityLockWait = 113, RULE_onLowPriorLockWait = 114, RULE_ignoredIdentifier = 115, 
		RULE_ignoredIdentifiers = 116, RULE_matchNone = 117, RULE_createTable = 118, 
		RULE_createIndex = 119, RULE_alterTable = 120, RULE_alterIndex = 121, 
		RULE_dropTable = 122, RULE_dropIndex = 123, RULE_truncateTable = 124, 
		RULE_fileTableClause = 125, RULE_createDefinitionClause = 126, RULE_createTableDefinitions = 127, 
		RULE_createTableDefinition = 128, RULE_columnDefinition = 129, RULE_columnDefinitionOption = 130, 
		RULE_encryptedOptions = 131, RULE_columnConstraint = 132, RULE_primaryKeyConstraint = 133, 
		RULE_diskTablePrimaryKeyConstraintOption = 134, RULE_clusterOption = 135, 
		RULE_primaryKeyWithClause = 136, RULE_primaryKeyOnClause = 137, RULE_onSchemaColumn = 138, 
		RULE_onFileGroup = 139, RULE_onString = 140, RULE_memoryTablePrimaryKeyConstraintOption = 141, 
		RULE_withBucket = 142, RULE_columnForeignKeyConstraint = 143, RULE_foreignKeyOnAction = 144, 
		RULE_foreignKeyOn = 145, RULE_checkConstraint = 146, RULE_columnIndex = 147, 
		RULE_withIndexOption = 148, RULE_indexOnClause = 149, RULE_onDefault = 150, 
		RULE_fileStreamOn = 151, RULE_columnConstraints = 152, RULE_computedColumnDefinition = 153, 
		RULE_columnSetDefinition = 154, RULE_tableConstraint = 155, RULE_tablePrimaryConstraint = 156, 
		RULE_primaryKeyUnique = 157, RULE_diskTablePrimaryConstraintOption = 158, 
		RULE_memoryTablePrimaryConstraintOption = 159, RULE_hashWithBucket = 160, 
		RULE_tableForeignKeyConstraint = 161, RULE_tableIndex = 162, RULE_indexNameOption = 163, 
		RULE_indexOptions = 164, RULE_periodClause = 165, RULE_partitionScheme = 166, 
		RULE_fileGroup = 167, RULE_tableOptions = 168, RULE_tableOption = 169, 
		RULE_tableStretchOptions = 170, RULE_tableStretchOption = 171, RULE_migrationState_ = 172, 
		RULE_tableOperationOption = 173, RULE_distributionOption = 174, RULE_dataWareHouseTableOption = 175, 
		RULE_dataWareHousePartitionOption = 176, RULE_createIndexSpecification = 177, 
		RULE_alterDefinitionClause = 178, RULE_addColumnSpecification = 179, RULE_modifyColumnSpecification = 180, 
		RULE_alterColumnOperation = 181, RULE_alterColumnAddOptions = 182, RULE_alterColumnAddOption = 183, 
		RULE_constraintForColumn = 184, RULE_generatedColumnNamesClause = 185, 
		RULE_generatedColumnNameClause = 186, RULE_generatedColumnName = 187, 
		RULE_alterDrop = 188, RULE_alterTableDropConstraint = 189, RULE_dropConstraintName = 190, 
		RULE_dropConstraintWithClause = 191, RULE_dropConstraintOption = 192, 
		RULE_onOffOption = 193, RULE_dropColumnSpecification = 194, RULE_dropIndexSpecification = 195, 
		RULE_alterCheckConstraint = 196, RULE_alterTrigger = 197, RULE_alterSwitch = 198, 
		RULE_alterSet = 199, RULE_setFileStreamClause = 200, RULE_setSystemVersionClause = 201, 
		RULE_alterSetOnClause = 202, RULE_dataConsistencyCheckClause = 203, RULE_historyRetentionPeriodClause = 204, 
		RULE_historyRetentionPeriod = 205, RULE_alterTableTableIndex = 206, RULE_indexWithName = 207, 
		RULE_indexNonClusterClause = 208, RULE_alterTableIndexOnClause = 209, 
		RULE_indexClusterClause = 210, RULE_alterTableOption = 211, RULE_onHistoryTableClause = 212, 
		RULE_ifExist = 213, RULE_setTransaction = 214, RULE_setImplicitTransactions = 215, 
		RULE_implicitTransactionsValue = 216, RULE_beginTransaction = 217, RULE_commit = 218, 
		RULE_rollback = 219, RULE_savepoint = 220, RULE_grant = 221, RULE_revoke = 222, 
		RULE_deny = 223, RULE_classPrivilegesClause = 224, RULE_classTypePrivilegesClause = 225, 
		RULE_optionForClause = 226, RULE_classPrivileges = 227, RULE_onClassClause = 228, 
		RULE_classTypePrivileges = 229, RULE_onClassTypeClause = 230, RULE_privilegeType = 231, 
		RULE_basicPermission = 232, RULE_objectPermission = 233, RULE_serverPermission = 234, 
		RULE_serverPrincipalPermission = 235, RULE_databasePermission = 236, RULE_databasePrincipalPermission = 237, 
		RULE_schemaPermission = 238, RULE_serviceBrokerPermission = 239, RULE_endpointPermission = 240, 
		RULE_certificatePermission = 241, RULE_symmetricKeyPermission = 242, RULE_asymmetricKeyPermission = 243, 
		RULE_assemblyPermission = 244, RULE_availabilityGroupPermission = 245, 
		RULE_fullTextPermission = 246, RULE_class_ = 247, RULE_classType = 248, 
		RULE_roleClause = 249, RULE_createUser = 250, RULE_dropUser = 251, RULE_alterUser = 252, 
		RULE_createRole = 253, RULE_dropRole = 254, RULE_alterRole = 255, RULE_createLogin = 256, 
		RULE_dropLogin = 257, RULE_alterLogin = 258, RULE_call = 259;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "insert", "insertDefaultValue", "insertValuesClause", "insertSelectClause", 
			"update", "assignment", "setAssignmentsClause", "assignmentValues", "assignmentValue", 
			"delete", "singleTableClause", "multipleTablesClause", "multipleTableNames", 
			"select", "aggregationClause", "selectClause", "duplicateSpecification", 
			"projections", "projection", "top", "topNum", "alias", "unqualifiedShorthand", 
			"qualifiedShorthand", "fromClause", "tableReferences", "tableReference", 
			"tableFactor", "joinedTable", "joinSpecification", "whereClause", "groupByClause", 
			"havingClause", "subquery", "withClause", "cteClause", "outputClause", 
			"outputWithColumns", "outputWithColumn", "outputWithAaterisk", "outputTableName", 
			"parameterMarker", "literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", 
			"hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", "nullValueLiterals", 
			"identifier", "unreservedWord", "schemaName", "tableName", "columnName", 
			"owner", "name", "columnNames", "columnNamesWithSort", "tableNames", 
			"indexName", "collationName", "dataTypeLength", "primaryKey", "expr", 
			"logicalOperator", "notOperator", "booleanPrimary", "comparisonOperator", 
			"predicate", "bitExpr", "simpleExpr", "functionCall", "aggregationFunction", 
			"aggregationFunctionName", "distinct", "specialFunction", "castFunction", 
			"charFunction", "regularFunction", "regularFunctionName", "caseExpression", 
			"caseWhen", "caseElse", "privateExprOfDb", "orderByClause", "orderByItem", 
			"dataType", "dataTypeName", "atTimeZoneExpr", "castExpr", "convertExpr", 
			"windowedFunction", "overClause", "partitionByClause", "rowRangeClause", 
			"windowFrameExtent", "windowFrameBetween", "windowFrameBound", "windowFramePreceding", 
			"windowFrameFollowing", "columnNameWithSort", "indexOption", "compressionOption", 
			"eqTime", "eqOnOffOption", "eqKey", "eqOnOff", "onPartitionClause", "partitionExpressions", 
			"partitionExpression", "numberRange", "lowPriorityLockWait", "onLowPriorLockWait", 
			"ignoredIdentifier", "ignoredIdentifiers", "matchNone", "createTable", 
			"createIndex", "alterTable", "alterIndex", "dropTable", "dropIndex", 
			"truncateTable", "fileTableClause", "createDefinitionClause", "createTableDefinitions", 
			"createTableDefinition", "columnDefinition", "columnDefinitionOption", 
			"encryptedOptions", "columnConstraint", "primaryKeyConstraint", "diskTablePrimaryKeyConstraintOption", 
			"clusterOption", "primaryKeyWithClause", "primaryKeyOnClause", "onSchemaColumn", 
			"onFileGroup", "onString", "memoryTablePrimaryKeyConstraintOption", "withBucket", 
			"columnForeignKeyConstraint", "foreignKeyOnAction", "foreignKeyOn", "checkConstraint", 
			"columnIndex", "withIndexOption", "indexOnClause", "onDefault", "fileStreamOn", 
			"columnConstraints", "computedColumnDefinition", "columnSetDefinition", 
			"tableConstraint", "tablePrimaryConstraint", "primaryKeyUnique", "diskTablePrimaryConstraintOption", 
			"memoryTablePrimaryConstraintOption", "hashWithBucket", "tableForeignKeyConstraint", 
			"tableIndex", "indexNameOption", "indexOptions", "periodClause", "partitionScheme", 
			"fileGroup", "tableOptions", "tableOption", "tableStretchOptions", "tableStretchOption", 
			"migrationState_", "tableOperationOption", "distributionOption", "dataWareHouseTableOption", 
			"dataWareHousePartitionOption", "createIndexSpecification", "alterDefinitionClause", 
			"addColumnSpecification", "modifyColumnSpecification", "alterColumnOperation", 
			"alterColumnAddOptions", "alterColumnAddOption", "constraintForColumn", 
			"generatedColumnNamesClause", "generatedColumnNameClause", "generatedColumnName", 
			"alterDrop", "alterTableDropConstraint", "dropConstraintName", "dropConstraintWithClause", 
			"dropConstraintOption", "onOffOption", "dropColumnSpecification", "dropIndexSpecification", 
			"alterCheckConstraint", "alterTrigger", "alterSwitch", "alterSet", "setFileStreamClause", 
			"setSystemVersionClause", "alterSetOnClause", "dataConsistencyCheckClause", 
			"historyRetentionPeriodClause", "historyRetentionPeriod", "alterTableTableIndex", 
			"indexWithName", "indexNonClusterClause", "alterTableIndexOnClause", 
			"indexClusterClause", "alterTableOption", "onHistoryTableClause", "ifExist", 
			"setTransaction", "setImplicitTransactions", "implicitTransactionsValue", 
			"beginTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
			"deny", "classPrivilegesClause", "classTypePrivilegesClause", "optionForClause", 
			"classPrivileges", "onClassClause", "classTypePrivileges", "onClassTypeClause", 
			"privilegeType", "basicPermission", "objectPermission", "serverPermission", 
			"serverPrincipalPermission", "databasePermission", "databasePrincipalPermission", 
			"schemaPermission", "serviceBrokerPermission", "endpointPermission", 
			"certificatePermission", "symmetricKeyPermission", "asymmetricKeyPermission", 
			"assemblyPermission", "availabilityGroupPermission", "fullTextPermission", 
			"class_", "classType", "roleClause", "createUser", "dropUser", "alterUser", 
			"createRole", "dropRole", "alterRole", "createLogin", "dropLogin", "alterLogin", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
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
			"DECIMAL", "TYPE", "BIT", "SMALLINT", "INT", "TINYINT", "NUMERIC", "FLOAT", 
			"BIGINT", "TEXT", "VARCHAR", "PERCENT", "TIES", "EXCEPT", "INTERSECT", 
			"FOR_GENERATOR", "BINARY", "ESCAPE", "HIDDEN_", "MOD", "PARTITION", "PARTITIONS", 
			"TOP", "ROW", "ROWS", "UNKNOWN", "XOR", "ALWAYS", "CASCADE", "CHECK", 
			"GENERATED", "NO", "OPTION", "PRIVILEGES", "REFERENCES", "USER", "ROLE", 
			"START", "TRANSACTION", "ACTION", "ALGORITHM", "AUTO", "BLOCKERS", "CLUSTERED", 
			"NONCLUSTERED", "COLLATE", "COLUMNSTORE", "CONTENT", "CONVERT", "DATABASE", 
			"YEARS", "MONTHS", "WEEKS", "DAYS", "MINUTES", "DENY", "DETERMINISTIC", 
			"DISTRIBUTION", "DOCUMENT", "DURABILITY", "ENCRYPTED", "END", "FILESTREAM", 
			"FILETABLE", "FILLFACTOR", "FOLLOWING", "HASH", "HEAP", "IDENTITY", "INBOUND", 
			"OUTBOUND", "UNBOUNDED", "INFINITE", "LOGIN", "MASKED", "MAXDOP", "MOVE", 
			"NOCHECK", "NONE", "OBJECT", "OFF", "ONLINE", "OVER", "PAGE", "PAUSED", 
			"PERIOD", "PERSISTED", "PRECEDING", "RANDOMIZED", "RANGE", "REBUILD", 
			"REPLICATE", "REPLICATION", "RESUMABLE", "ROWGUIDCOL", "SAVE", "SELF", 
			"SPARSE", "SWITCH", "TRAN", "TRANCOUNT", "ZONE", "EXECUTE", "SESSION", 
			"CONNECT", "CONNECTION", "CATALOG", "CONTROL", "TAKE", "OWNERSHIP", "DEFINITION", 
			"APPLICATION", "ASSEMBLY", "SYMMETRIC", "ASYMMETRIC", "SERVER", "RECEIVE", 
			"CHANGE", "TRACE", "TRACKING", "RESOURCES", "SETTINGS", "STATE", "AVAILABILITY", 
			"CREDENTIAL", "ENDPOINT", "EVENT", "NOTIFICATION", "LINKED", "AUDIT", 
			"DDL", "XML", "IMPERSONATE", "SECURABLES", "AUTHENTICATE", "EXTERNAL", 
			"ACCESS", "ADMINISTER", "BULK", "OPERATIONS", "UNSAFE", "SHUTDOWN", "SCOPED", 
			"CONFIGURATION", "DATASPACE", "SERVICE", "CERTIFICATE", "CONTRACT", "ENCRYPTION", 
			"MASTER", "DATA", "SOURCE", "FILE", "FORMAT", "LIBRARY", "FULLTEXT", 
			"MASK", "UNMASK", "MESSAGE", "REMOTE", "BINDING", "ROUTE", "SECURITY", 
			"POLICY", "AGGREGATE", "QUEUE", "RULE", "SYNONYM", "COLLECTION", "SCRIPT", 
			"KILL", "BACKUP", "LOG", "SHOWPLAN", "SUBSCRIBE", "QUERY", "NOTIFICATIONS", 
			"CHECKPOINT", "SEQUENCE", "ABORT_AFTER_WAIT", "ALLOW_PAGE_LOCKS", "ALLOW_ROW_LOCKS", 
			"ALL_SPARSE_COLUMNS", "BUCKET_COUNT", "COLUMNSTORE_ARCHIVE", "COLUMN_ENCRYPTION_KEY", 
			"COLUMN_SET", "COMPRESSION_DELAY", "DATABASE_DEAULT", "DATA_COMPRESSION", 
			"DATA_CONSISTENCY_CHECK", "ENCRYPTION_TYPE", "SYSTEM_TIME", "SYSTEM_VERSIONING", 
			"TEXTIMAGE_ON", "WAIT_AT_LOW_PRIORITY", "STATISTICS_INCREMENTAL", "STATISTICS_NORECOMPUTE", 
			"ROUND_ROBIN", "SCHEMA_AND_DATA", "SCHEMA_ONLY", "SORT_IN_TEMPDB", "IGNORE_DUP_KEY", 
			"IMPLICIT_TRANSACTIONS", "MAX_DURATION", "MEMORY_OPTIMIZED", "MIGRATION_STATE", 
			"PAD_INDEX", "REMOTE_DATA_ARCHIVE", "FILESTREAM_ON", "FILETABLE_COLLATE_FILENAME", 
			"FILETABLE_DIRECTORY", "FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME", "FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME", 
			"FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME", "FILTER_PREDICATE", "HISTORY_RETENTION_PERIOD", 
			"HISTORY_TABLE", "LOCK_ESCALATION", "DROP_EXISTING", "ROW_NUMBER", "FETCH", 
			"FIRST", "ONLY", "MONEY", "SMALLMONEY", "DATETIMEOFFSET", "DATETIME", 
			"DATETIME2", "SMALLDATETIME", "NCHAR", "NVARCHAR", "NTEXT", "VARBINARY", 
			"IMAGE", "SQL_VARIANT", "UNIQUEIDENTIFIER", "HIERARCHYID", "GEOMETRY", 
			"GEOGRAPHY", "OUTPUT", "INSERTED", "DELETED", "IDENTIFIER_", "STRING_", 
			"NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "SQLServerStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLServerStatementParser(TokenStream input) {
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
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
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
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public SetImplicitTransactionsContext setImplicitTransactions() {
			return getRuleContext(SetImplicitTransactionsContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
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
		public DenyContext deny() {
			return getRuleContext(DenyContext.class,0);
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
		public CreateLoginContext createLogin() {
			return getRuleContext(CreateLoginContext.class,0);
		}
		public DropLoginContext dropLogin() {
			return getRuleContext(DropLoginContext.class,0);
		}
		public AlterLoginContext alterLogin() {
			return getRuleContext(AlterLoginContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(SQLServerStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(520);
				select();
				}
				break;
			case 2:
				{
				setState(521);
				insert();
				}
				break;
			case 3:
				{
				setState(522);
				update();
				}
				break;
			case 4:
				{
				setState(523);
				delete();
				}
				break;
			case 5:
				{
				setState(524);
				createIndex();
				}
				break;
			case 6:
				{
				setState(525);
				alterIndex();
				}
				break;
			case 7:
				{
				setState(526);
				dropIndex();
				}
				break;
			case 8:
				{
				setState(527);
				createTable();
				}
				break;
			case 9:
				{
				setState(528);
				alterTable();
				}
				break;
			case 10:
				{
				setState(529);
				dropTable();
				}
				break;
			case 11:
				{
				setState(530);
				truncateTable();
				}
				break;
			case 12:
				{
				setState(531);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(532);
				beginTransaction();
				}
				break;
			case 14:
				{
				setState(533);
				setImplicitTransactions();
				}
				break;
			case 15:
				{
				setState(534);
				commit();
				}
				break;
			case 16:
				{
				setState(535);
				rollback();
				}
				break;
			case 17:
				{
				setState(536);
				savepoint();
				}
				break;
			case 18:
				{
				setState(537);
				grant();
				}
				break;
			case 19:
				{
				setState(538);
				revoke();
				}
				break;
			case 20:
				{
				setState(539);
				deny();
				}
				break;
			case 21:
				{
				setState(540);
				createUser();
				}
				break;
			case 22:
				{
				setState(541);
				dropUser();
				}
				break;
			case 23:
				{
				setState(542);
				alterUser();
				}
				break;
			case 24:
				{
				setState(543);
				createRole();
				}
				break;
			case 25:
				{
				setState(544);
				dropRole();
				}
				break;
			case 26:
				{
				setState(545);
				alterRole();
				}
				break;
			case 27:
				{
				setState(546);
				createLogin();
				}
				break;
			case 28:
				{
				setState(547);
				dropLogin();
				}
				break;
			case 29:
				{
				setState(548);
				alterLogin();
				}
				break;
			case 30:
				{
				setState(549);
				call();
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(552);
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
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertDefaultValueContext insertDefaultValue() {
			return getRuleContext(InsertDefaultValueContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQLServerStatementParser.INTO, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(555);
				withClause();
				}
			}

			setState(558);
			match(INSERT);
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(559);
				top();
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(562);
				match(INTO);
				}
			}

			setState(565);
			tableName();
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(566);
					match(AS);
					}
				}

				setState(569);
				alias();
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(572);
				insertDefaultValue();
				}
				break;
			case 2:
				{
				setState(573);
				insertValuesClause();
				}
				break;
			case 3:
				{
				setState(574);
				insertSelectClause();
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

	public static class InsertDefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public OutputClauseContext outputClause() {
			return getRuleContext(OutputClauseContext.class,0);
		}
		public InsertDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertDefaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsertDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertDefaultValueContext insertDefaultValue() throws RecognitionException {
		InsertDefaultValueContext _localctx = new InsertDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertDefaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(577);
				columnNames();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(580);
				outputClause();
				}
			}

			setState(583);
			match(DEFAULT);
			setState(584);
			match(VALUES);
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
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public OutputClauseContext outputClause() {
			return getRuleContext(OutputClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(586);
				columnNames();
				}
			}

			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(589);
				outputClause();
				}
			}

			setState(592);
			match(VALUES);
			setState(593);
			assignmentValues();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(594);
				match(COMMA_);
				setState(595);
				assignmentValues();
				}
				}
				setState(600);
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

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public OutputClauseContext outputClause() {
			return getRuleContext(OutputClauseContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(601);
				columnNames();
				}
			}

			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(604);
				outputClause();
				}
			}

			setState(607);
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(UPDATE);
			setState(610);
			tableReferences();
			setState(611);
			setAssignmentsClause();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(612);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			columnName();
			setState(616);
			match(EQ_);
			setState(617);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(SET);
			setState(620);
			assignment();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(621);
				match(COMMA_);
				setState(622);
				assignment();
				}
				}
				setState(627);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentValues);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(LP_);
				setState(629);
				assignmentValue();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(630);
					match(COMMA_);
					setState(631);
					assignmentValue();
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(LP_);
				setState(640);
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
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentValue);
		try {
			setState(645);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
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
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public MultipleTablesClauseContext multipleTablesClause() {
			return getRuleContext(MultipleTablesClauseContext.class,0);
		}
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public OutputClauseContext outputClause() {
			return getRuleContext(OutputClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(DELETE);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(648);
				top();
				}
				break;
			}
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(651);
				singleTableClause();
				}
				break;
			case 2:
				{
				setState(652);
				multipleTablesClause();
				}
				break;
			}
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(655);
				outputClause();
				}
			}

			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(658);
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

	public static class SingleTableClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(661);
				match(FROM);
				}
			}

			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(664);
				match(LP_);
				}
			}

			setState(667);
			tableName();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(668);
				match(RP_);
				}
			}

			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(671);
					match(AS);
					}
				}

				setState(674);
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

	public static class MultipleTablesClauseContext extends ParserRuleContext {
		public MultipleTableNamesContext multipleTableNames() {
			return getRuleContext(MultipleTableNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public MultipleTablesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMultipleTablesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTablesClauseContext multipleTablesClause() throws RecognitionException {
		MultipleTablesClauseContext _localctx = new MultipleTablesClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleTablesClause);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				multipleTableNames();
				setState(678);
				match(FROM);
				setState(679);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(FROM);
				setState(682);
				multipleTableNames();
				setState(683);
				match(USING);
				setState(684);
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
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(SQLServerStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(SQLServerStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public MultipleTableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMultipleTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleTableNamesContext multipleTableNames() throws RecognitionException {
		MultipleTableNamesContext _localctx = new MultipleTableNamesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleTableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			tableName();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(689);
				match(DOT_ASTERISK_);
				}
			}

			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(692);
				match(COMMA_);
				setState(693);
				tableName();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(694);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(701);
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
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			aggregationClause();
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SQLServerStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SQLServerStatementParser.UNION, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(SQLServerStatementParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(SQLServerStatementParser.EXCEPT, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(SQLServerStatementParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(SQLServerStatementParser.INTERSECT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SQLServerStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SQLServerStatementParser.ALL, i);
		}
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aggregationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			selectClause();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION || _la==EXCEPT || _la==INTERSECT) {
				{
				{
				setState(711);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION:
					{
					setState(705);
					match(UNION);
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL) {
						{
						setState(706);
						match(ALL);
						}
					}

					}
					break;
				case EXCEPT:
					{
					setState(709);
					match(EXCEPT);
					}
					break;
				case INTERSECT:
					{
					setState(710);
					match(INTERSECT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(713);
				selectClause();
				}
				}
				setState(718);
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
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
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
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(SELECT);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(720);
				duplicateSpecification();
				}
			}

			setState(723);
			projections();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(724);
				fromClause();
				}
			}

			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(727);
				whereClause();
				}
			}

			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(730);
				groupByClause();
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(733);
				havingClause();
				}
			}

			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(736);
				orderByClause();
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
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(741);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(742);
				projection();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(745);
				match(COMMA_);
				setState(746);
				projection();
				}
				}
				setState(751);
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
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_projection);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(752);
					top();
					}
					break;
				case 2:
					{
					setState(753);
					columnName();
					}
					break;
				case 3:
					{
					setState(754);
					expr(0);
					}
					break;
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (BINARY - 187)) | (1L << (HIDDEN_ - 187)) | (1L << (MOD - 187)) | (1L << (PARTITION - 187)) | (1L << (PARTITIONS - 187)) | (1L << (TOP - 187)) | (1L << (ROW - 187)) | (1L << (XOR - 187)) | (1L << (ALWAYS - 187)) | (1L << (ROLE - 187)) | (1L << (START - 187)) | (1L << (ALGORITHM - 187)) | (1L << (AUTO - 187)) | (1L << (BLOCKERS - 187)) | (1L << (CLUSTERED - 187)) | (1L << (NONCLUSTERED - 187)) | (1L << (COLUMNSTORE - 187)) | (1L << (CONTENT - 187)) | (1L << (DATABASE - 187)) | (1L << (YEARS - 187)) | (1L << (MONTHS - 187)) | (1L << (WEEKS - 187)) | (1L << (DAYS - 187)) | (1L << (MINUTES - 187)) | (1L << (DENY - 187)) | (1L << (DETERMINISTIC - 187)) | (1L << (DISTRIBUTION - 187)) | (1L << (DOCUMENT - 187)) | (1L << (DURABILITY - 187)) | (1L << (ENCRYPTED - 187)) | (1L << (FILESTREAM - 187)) | (1L << (FILETABLE - 187)) | (1L << (FILLFACTOR - 187)) | (1L << (FOLLOWING - 187)) | (1L << (HASH - 187)) | (1L << (HEAP - 187)) | (1L << (INBOUND - 187)) | (1L << (OUTBOUND - 187)) | (1L << (UNBOUNDED - 187)) | (1L << (INFINITE - 187)) | (1L << (LOGIN - 187)) | (1L << (MASKED - 187)) | (1L << (MAXDOP - 187)) | (1L << (MOVE - 187)) | (1L << (NOCHECK - 187)) | (1L << (OBJECT - 187)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (OFF - 251)) | (1L << (ONLINE - 251)) | (1L << (OVER - 251)) | (1L << (PAGE - 251)) | (1L << (PAUSED - 251)) | (1L << (PERIOD - 251)) | (1L << (PERSISTED - 251)) | (1L << (PRECEDING - 251)) | (1L << (RANDOMIZED - 251)) | (1L << (RANGE - 251)) | (1L << (REBUILD - 251)) | (1L << (REPLICATE - 251)) | (1L << (REPLICATION - 251)) | (1L << (RESUMABLE - 251)) | (1L << (ROWGUIDCOL - 251)) | (1L << (SAVE - 251)) | (1L << (SELF - 251)) | (1L << (SPARSE - 251)) | (1L << (SWITCH - 251)) | (1L << (TRAN - 251)) | (1L << (TRANCOUNT - 251)) | (1L << (CONTROL - 251)) | (1L << (TAKE - 251)) | (1L << (OWNERSHIP - 251)) | (1L << (DEFINITION - 251)) | (1L << (APPLICATION - 251)) | (1L << (ASSEMBLY - 251)) | (1L << (SYMMETRIC - 251)) | (1L << (ASYMMETRIC - 251)) | (1L << (SERVER - 251)) | (1L << (RECEIVE - 251)) | (1L << (CHANGE - 251)) | (1L << (TRACE - 251)) | (1L << (TRACKING - 251)) | (1L << (RESOURCES - 251)) | (1L << (SETTINGS - 251)) | (1L << (STATE - 251)) | (1L << (AVAILABILITY - 251)) | (1L << (CREDENTIAL - 251)) | (1L << (ENDPOINT - 251)) | (1L << (EVENT - 251)) | (1L << (NOTIFICATION - 251)) | (1L << (LINKED - 251)) | (1L << (AUDIT - 251)) | (1L << (DDL - 251)) | (1L << (XML - 251)) | (1L << (IMPERSONATE - 251)) | (1L << (SECURABLES - 251)) | (1L << (AUTHENTICATE - 251)) | (1L << (EXTERNAL - 251)) | (1L << (ACCESS - 251)) | (1L << (ADMINISTER - 251)) | (1L << (BULK - 251)) | (1L << (OPERATIONS - 251)) | (1L << (UNSAFE - 251)) | (1L << (SHUTDOWN - 251)) | (1L << (SCOPED - 251)) | (1L << (CONFIGURATION - 251)))) != 0) || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (DATASPACE - 315)) | (1L << (SERVICE - 315)) | (1L << (CERTIFICATE - 315)) | (1L << (CONTRACT - 315)) | (1L << (ENCRYPTION - 315)) | (1L << (MASTER - 315)) | (1L << (DATA - 315)) | (1L << (SOURCE - 315)) | (1L << (FILE - 315)) | (1L << (FORMAT - 315)) | (1L << (LIBRARY - 315)) | (1L << (FULLTEXT - 315)) | (1L << (MASK - 315)) | (1L << (UNMASK - 315)) | (1L << (MESSAGE - 315)) | (1L << (REMOTE - 315)) | (1L << (BINDING - 315)) | (1L << (ROUTE - 315)) | (1L << (SECURITY - 315)) | (1L << (POLICY - 315)) | (1L << (AGGREGATE - 315)) | (1L << (QUEUE - 315)) | (1L << (RULE - 315)) | (1L << (SYNONYM - 315)) | (1L << (COLLECTION - 315)) | (1L << (SCRIPT - 315)) | (1L << (KILL - 315)) | (1L << (BACKUP - 315)) | (1L << (LOG - 315)) | (1L << (SHOWPLAN - 315)) | (1L << (SUBSCRIBE - 315)) | (1L << (QUERY - 315)) | (1L << (NOTIFICATIONS - 315)) | (1L << (CHECKPOINT - 315)) | (1L << (SEQUENCE - 315)) | (1L << (ABORT_AFTER_WAIT - 315)) | (1L << (ALLOW_PAGE_LOCKS - 315)) | (1L << (ALLOW_ROW_LOCKS - 315)) | (1L << (ALL_SPARSE_COLUMNS - 315)) | (1L << (BUCKET_COUNT - 315)) | (1L << (COLUMNSTORE_ARCHIVE - 315)) | (1L << (COLUMN_ENCRYPTION_KEY - 315)) | (1L << (COLUMN_SET - 315)) | (1L << (COMPRESSION_DELAY - 315)) | (1L << (DATABASE_DEAULT - 315)) | (1L << (DATA_COMPRESSION - 315)) | (1L << (DATA_CONSISTENCY_CHECK - 315)) | (1L << (ENCRYPTION_TYPE - 315)) | (1L << (SYSTEM_TIME - 315)) | (1L << (SYSTEM_VERSIONING - 315)) | (1L << (TEXTIMAGE_ON - 315)) | (1L << (WAIT_AT_LOW_PRIORITY - 315)) | (1L << (STATISTICS_INCREMENTAL - 315)) | (1L << (STATISTICS_NORECOMPUTE - 315)) | (1L << (ROUND_ROBIN - 315)) | (1L << (SCHEMA_AND_DATA - 315)) | (1L << (SCHEMA_ONLY - 315)) | (1L << (SORT_IN_TEMPDB - 315)) | (1L << (IGNORE_DUP_KEY - 315)) | (1L << (IMPLICIT_TRANSACTIONS - 315)) | (1L << (MAX_DURATION - 315)) | (1L << (MEMORY_OPTIMIZED - 315)) | (1L << (MIGRATION_STATE - 315)) | (1L << (PAD_INDEX - 315)))) != 0) || ((((_la - 379)) & ~0x3f) == 0 && ((1L << (_la - 379)) & ((1L << (REMOTE_DATA_ARCHIVE - 379)) | (1L << (FILESTREAM_ON - 379)) | (1L << (FILETABLE_COLLATE_FILENAME - 379)) | (1L << (FILETABLE_DIRECTORY - 379)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILTER_PREDICATE - 379)) | (1L << (HISTORY_RETENTION_PERIOD - 379)) | (1L << (HISTORY_TABLE - 379)) | (1L << (LOCK_ESCALATION - 379)) | (1L << (DROP_EXISTING - 379)) | (1L << (ROW_NUMBER - 379)) | (1L << (FIRST - 379)) | (1L << (DATETIME2 - 379)) | (1L << (OUTPUT - 379)) | (1L << (INSERTED - 379)) | (1L << (DELETED - 379)) | (1L << (IDENTIFIER_ - 379)) | (1L << (STRING_ - 379)))) != 0)) {
					{
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(757);
						match(AS);
						}
					}

					setState(760);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
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

	public static class TopContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public TopNumContext topNum() {
			return getRuleContext(TopNumContext.class,0);
		}
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode PERCENT() { return getToken(SQLServerStatementParser.PERCENT, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(SQLServerStatementParser.TIES, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_top);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(TOP);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(767);
				match(LP_);
				}
			}

			setState(770);
			topNum();
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(771);
				match(RP_);
				}
				break;
			}
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(774);
				match(PERCENT);
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(777);
				match(WITH);
				setState(778);
				match(TIES);
				}
			}

			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(781);
				match(ROW_NUMBER);
				setState(782);
				match(LP_);
				setState(783);
				match(RP_);
				setState(784);
				match(OVER);
				setState(785);
				match(LP_);
				setState(786);
				orderByClause();
				setState(787);
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

	public static class TopNumContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public TopNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTopNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopNumContext topNum() throws RecognitionException {
		TopNumContext _localctx = new TopNumContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_topNum);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				parameterMarker();
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

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alias);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
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
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
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
		public TerminalNode DOT_ASTERISK_() { return getToken(SQLServerStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			identifier();
			setState(802);
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
		public TerminalNode FROM() { return getToken(SQLServerStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(FROM);
			setState(805);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			tableReference();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(808);
				match(COMMA_);
				setState(809);
				tableReference();
				}
				}
				setState(814);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			tableFactor();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (NATURAL - 83)) | (1L << (JOIN - 83)) | (1L << (FULL - 83)) | (1L << (INNER - 83)) | (1L << (LEFT - 83)) | (1L << (RIGHT - 83)) | (1L << (CROSS - 83)))) != 0)) {
				{
				{
				setState(816);
				joinedTable();
				}
				}
				setState(821);
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
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableFactor);
		int _la;
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				tableName();
				setState(827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(823);
						match(AS);
						}
					}

					setState(826);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				subquery();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(830);
					match(AS);
					}
				}

				setState(833);
				alias();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(834);
					columnNames();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				match(LP_);
				setState(838);
				tableReferences();
				setState(839);
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
		public TerminalNode JOIN() { return getToken(SQLServerStatementParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(SQLServerStatementParser.NATURAL, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLServerStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SQLServerStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SQLServerStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SQLServerStatementParser.OUTER, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_joinedTable);
		int _la;
		try {
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(843);
					match(NATURAL);
					}
				}

				{
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(846);
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

				setState(849);
				match(JOIN);
				}
				setState(851);
				tableFactor();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(852);
					joinSpecification();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL) {
					{
					setState(855);
					match(NATURAL);
					}
				}

				setState(858);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (FULL - 85)) | (1L << (LEFT - 85)) | (1L << (RIGHT - 85)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(859);
					match(OUTER);
					}
				}

				setState(862);
				match(JOIN);
				setState(863);
				tableFactor();
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(864);
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
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_joinSpecification);
		try {
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(ON);
				setState(870);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				match(USING);
				setState(872);
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
		public TerminalNode WHERE() { return getToken(SQLServerStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(WHERE);
			setState(876);
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
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(GROUP);
			setState(879);
			match(BY);
			setState(880);
			orderByItem();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(881);
				match(COMMA_);
				setState(882);
				orderByItem();
				}
				}
				setState(887);
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
		public TerminalNode HAVING() { return getToken(SQLServerStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(HAVING);
			setState(889);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(LP_);
			setState(892);
			aggregationClause();
			setState(893);
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public List<CteClauseContext> cteClause() {
			return getRuleContexts(CteClauseContext.class);
		}
		public CteClauseContext cteClause(int i) {
			return getRuleContext(CteClauseContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(WITH);
			setState(896);
			cteClause();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(897);
				match(COMMA_);
				setState(898);
				cteClause();
				}
				}
				setState(903);
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

	public static class CteClauseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteClauseContext cteClause() throws RecognitionException {
		CteClauseContext _localctx = new CteClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			identifier();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(905);
				columnNames();
				}
			}

			setState(908);
			match(AS);
			setState(909);
			subquery();
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

	public static class OutputClauseContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SQLServerStatementParser.OUTPUT, 0); }
		public OutputWithColumnsContext outputWithColumns() {
			return getRuleContext(OutputWithColumnsContext.class,0);
		}
		public OutputWithAateriskContext outputWithAaterisk() {
			return getRuleContext(OutputWithAateriskContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQLServerStatementParser.INTO, 0); }
		public OutputTableNameContext outputTableName() {
			return getRuleContext(OutputTableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public OutputClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOutputClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputClauseContext outputClause() throws RecognitionException {
		OutputClauseContext _localctx = new OutputClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_outputClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(OUTPUT);
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(912);
				outputWithColumns();
				}
				break;
			case 2:
				{
				setState(913);
				outputWithAaterisk();
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(916);
				match(INTO);
				setState(917);
				outputTableName();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(918);
					columnNames();
					}
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

	public static class OutputWithColumnsContext extends ParserRuleContext {
		public List<OutputWithColumnContext> outputWithColumn() {
			return getRuleContexts(OutputWithColumnContext.class);
		}
		public OutputWithColumnContext outputWithColumn(int i) {
			return getRuleContext(OutputWithColumnContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public OutputWithColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputWithColumns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOutputWithColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputWithColumnsContext outputWithColumns() throws RecognitionException {
		OutputWithColumnsContext _localctx = new OutputWithColumnsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_outputWithColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			outputWithColumn();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(924);
				match(COMMA_);
				setState(925);
				outputWithColumn();
				}
				}
				setState(930);
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

	public static class OutputWithColumnContext extends ParserRuleContext {
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INSERTED() { return getToken(SQLServerStatementParser.INSERTED, 0); }
		public TerminalNode DELETED() { return getToken(SQLServerStatementParser.DELETED, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public OutputWithColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputWithColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOutputWithColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputWithColumnContext outputWithColumn() throws RecognitionException {
		OutputWithColumnContext _localctx = new OutputWithColumnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_outputWithColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_la = _input.LA(1);
			if ( !(_la==INSERTED || _la==DELETED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(932);
			match(DOT_);
			setState(933);
			name();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)) | (1L << (AS - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (BINARY - 187)) | (1L << (HIDDEN_ - 187)) | (1L << (MOD - 187)) | (1L << (PARTITION - 187)) | (1L << (PARTITIONS - 187)) | (1L << (TOP - 187)) | (1L << (ROW - 187)) | (1L << (XOR - 187)) | (1L << (ALWAYS - 187)) | (1L << (ROLE - 187)) | (1L << (START - 187)) | (1L << (ALGORITHM - 187)) | (1L << (AUTO - 187)) | (1L << (BLOCKERS - 187)) | (1L << (CLUSTERED - 187)) | (1L << (NONCLUSTERED - 187)) | (1L << (COLUMNSTORE - 187)) | (1L << (CONTENT - 187)) | (1L << (DATABASE - 187)) | (1L << (YEARS - 187)) | (1L << (MONTHS - 187)) | (1L << (WEEKS - 187)) | (1L << (DAYS - 187)) | (1L << (MINUTES - 187)) | (1L << (DENY - 187)) | (1L << (DETERMINISTIC - 187)) | (1L << (DISTRIBUTION - 187)) | (1L << (DOCUMENT - 187)) | (1L << (DURABILITY - 187)) | (1L << (ENCRYPTED - 187)) | (1L << (FILESTREAM - 187)) | (1L << (FILETABLE - 187)) | (1L << (FILLFACTOR - 187)) | (1L << (FOLLOWING - 187)) | (1L << (HASH - 187)) | (1L << (HEAP - 187)) | (1L << (INBOUND - 187)) | (1L << (OUTBOUND - 187)) | (1L << (UNBOUNDED - 187)) | (1L << (INFINITE - 187)) | (1L << (LOGIN - 187)) | (1L << (MASKED - 187)) | (1L << (MAXDOP - 187)) | (1L << (MOVE - 187)) | (1L << (NOCHECK - 187)) | (1L << (OBJECT - 187)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (OFF - 251)) | (1L << (ONLINE - 251)) | (1L << (OVER - 251)) | (1L << (PAGE - 251)) | (1L << (PAUSED - 251)) | (1L << (PERIOD - 251)) | (1L << (PERSISTED - 251)) | (1L << (PRECEDING - 251)) | (1L << (RANDOMIZED - 251)) | (1L << (RANGE - 251)) | (1L << (REBUILD - 251)) | (1L << (REPLICATE - 251)) | (1L << (REPLICATION - 251)) | (1L << (RESUMABLE - 251)) | (1L << (ROWGUIDCOL - 251)) | (1L << (SAVE - 251)) | (1L << (SELF - 251)) | (1L << (SPARSE - 251)) | (1L << (SWITCH - 251)) | (1L << (TRAN - 251)) | (1L << (TRANCOUNT - 251)) | (1L << (CONTROL - 251)) | (1L << (TAKE - 251)) | (1L << (OWNERSHIP - 251)) | (1L << (DEFINITION - 251)) | (1L << (APPLICATION - 251)) | (1L << (ASSEMBLY - 251)) | (1L << (SYMMETRIC - 251)) | (1L << (ASYMMETRIC - 251)) | (1L << (SERVER - 251)) | (1L << (RECEIVE - 251)) | (1L << (CHANGE - 251)) | (1L << (TRACE - 251)) | (1L << (TRACKING - 251)) | (1L << (RESOURCES - 251)) | (1L << (SETTINGS - 251)) | (1L << (STATE - 251)) | (1L << (AVAILABILITY - 251)) | (1L << (CREDENTIAL - 251)) | (1L << (ENDPOINT - 251)) | (1L << (EVENT - 251)) | (1L << (NOTIFICATION - 251)) | (1L << (LINKED - 251)) | (1L << (AUDIT - 251)) | (1L << (DDL - 251)) | (1L << (XML - 251)) | (1L << (IMPERSONATE - 251)) | (1L << (SECURABLES - 251)) | (1L << (AUTHENTICATE - 251)) | (1L << (EXTERNAL - 251)) | (1L << (ACCESS - 251)) | (1L << (ADMINISTER - 251)) | (1L << (BULK - 251)) | (1L << (OPERATIONS - 251)) | (1L << (UNSAFE - 251)) | (1L << (SHUTDOWN - 251)) | (1L << (SCOPED - 251)) | (1L << (CONFIGURATION - 251)))) != 0) || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (DATASPACE - 315)) | (1L << (SERVICE - 315)) | (1L << (CERTIFICATE - 315)) | (1L << (CONTRACT - 315)) | (1L << (ENCRYPTION - 315)) | (1L << (MASTER - 315)) | (1L << (DATA - 315)) | (1L << (SOURCE - 315)) | (1L << (FILE - 315)) | (1L << (FORMAT - 315)) | (1L << (LIBRARY - 315)) | (1L << (FULLTEXT - 315)) | (1L << (MASK - 315)) | (1L << (UNMASK - 315)) | (1L << (MESSAGE - 315)) | (1L << (REMOTE - 315)) | (1L << (BINDING - 315)) | (1L << (ROUTE - 315)) | (1L << (SECURITY - 315)) | (1L << (POLICY - 315)) | (1L << (AGGREGATE - 315)) | (1L << (QUEUE - 315)) | (1L << (RULE - 315)) | (1L << (SYNONYM - 315)) | (1L << (COLLECTION - 315)) | (1L << (SCRIPT - 315)) | (1L << (KILL - 315)) | (1L << (BACKUP - 315)) | (1L << (LOG - 315)) | (1L << (SHOWPLAN - 315)) | (1L << (SUBSCRIBE - 315)) | (1L << (QUERY - 315)) | (1L << (NOTIFICATIONS - 315)) | (1L << (CHECKPOINT - 315)) | (1L << (SEQUENCE - 315)) | (1L << (ABORT_AFTER_WAIT - 315)) | (1L << (ALLOW_PAGE_LOCKS - 315)) | (1L << (ALLOW_ROW_LOCKS - 315)) | (1L << (ALL_SPARSE_COLUMNS - 315)) | (1L << (BUCKET_COUNT - 315)) | (1L << (COLUMNSTORE_ARCHIVE - 315)) | (1L << (COLUMN_ENCRYPTION_KEY - 315)) | (1L << (COLUMN_SET - 315)) | (1L << (COMPRESSION_DELAY - 315)) | (1L << (DATABASE_DEAULT - 315)) | (1L << (DATA_COMPRESSION - 315)) | (1L << (DATA_CONSISTENCY_CHECK - 315)) | (1L << (ENCRYPTION_TYPE - 315)) | (1L << (SYSTEM_TIME - 315)) | (1L << (SYSTEM_VERSIONING - 315)) | (1L << (TEXTIMAGE_ON - 315)) | (1L << (WAIT_AT_LOW_PRIORITY - 315)) | (1L << (STATISTICS_INCREMENTAL - 315)) | (1L << (STATISTICS_NORECOMPUTE - 315)) | (1L << (ROUND_ROBIN - 315)) | (1L << (SCHEMA_AND_DATA - 315)) | (1L << (SCHEMA_ONLY - 315)) | (1L << (SORT_IN_TEMPDB - 315)) | (1L << (IGNORE_DUP_KEY - 315)) | (1L << (IMPLICIT_TRANSACTIONS - 315)) | (1L << (MAX_DURATION - 315)) | (1L << (MEMORY_OPTIMIZED - 315)) | (1L << (MIGRATION_STATE - 315)) | (1L << (PAD_INDEX - 315)))) != 0) || ((((_la - 379)) & ~0x3f) == 0 && ((1L << (_la - 379)) & ((1L << (REMOTE_DATA_ARCHIVE - 379)) | (1L << (FILESTREAM_ON - 379)) | (1L << (FILETABLE_COLLATE_FILENAME - 379)) | (1L << (FILETABLE_DIRECTORY - 379)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILTER_PREDICATE - 379)) | (1L << (HISTORY_RETENTION_PERIOD - 379)) | (1L << (HISTORY_TABLE - 379)) | (1L << (LOCK_ESCALATION - 379)) | (1L << (DROP_EXISTING - 379)) | (1L << (ROW_NUMBER - 379)) | (1L << (FIRST - 379)) | (1L << (DATETIME2 - 379)) | (1L << (OUTPUT - 379)) | (1L << (INSERTED - 379)) | (1L << (DELETED - 379)) | (1L << (IDENTIFIER_ - 379)) | (1L << (STRING_ - 379)))) != 0)) {
				{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(934);
					match(AS);
					}
				}

				setState(937);
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

	public static class OutputWithAateriskContext extends ParserRuleContext {
		public TerminalNode DOT_ASTERISK_() { return getToken(SQLServerStatementParser.DOT_ASTERISK_, 0); }
		public TerminalNode INSERTED() { return getToken(SQLServerStatementParser.INSERTED, 0); }
		public TerminalNode DELETED() { return getToken(SQLServerStatementParser.DELETED, 0); }
		public OutputWithAateriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputWithAaterisk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOutputWithAaterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputWithAateriskContext outputWithAaterisk() throws RecognitionException {
		OutputWithAateriskContext _localctx = new OutputWithAateriskContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_outputWithAaterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_la = _input.LA(1);
			if ( !(_la==INSERTED || _la==DELETED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(941);
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

	public static class OutputTableNameContext extends ParserRuleContext {
		public TerminalNode AT_() { return getToken(SQLServerStatementParser.AT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public OutputTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputTableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOutputTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputTableNameContext outputTableName() throws RecognitionException {
		OutputTableNameContext _localctx = new OutputTableNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_outputTableName);
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(943);
				match(AT_);
				setState(944);
				name();
				}
				}
				break;
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				tableName();
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

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(SQLServerStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literals);
		try {
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				stringLiterals();
				}
				break;
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(954);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(955);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(956);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
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
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS_) {
				{
				setState(961);
				match(MINUS_);
				}
			}

			setState(964);
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
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLServerStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(967);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(LBE_);
				setState(969);
				identifier();
				setState(970);
				match(STRING_);
				setState(971);
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
		public TerminalNode HEX_DIGIT_() { return getToken(SQLServerStatementParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
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
		public TerminalNode BIT_NUM_() { return getToken(SQLServerStatementParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
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
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
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
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifier);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
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
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode LIMIT() { return getToken(SQLServerStatementParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public TerminalNode SAVEPOINT() { return getToken(SQLServerStatementParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLServerStatementParser.BOOLEAN, 0); }
		public TerminalNode ARRAY() { return getToken(SQLServerStatementParser.ARRAY, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode QUARTER() { return getToken(SQLServerStatementParser.QUARTER, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode MICROSECOND() { return getToken(SQLServerStatementParser.MICROSECOND, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode MOD() { return getToken(SQLServerStatementParser.MOD, 0); }
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode TOP() { return getToken(SQLServerStatementParser.TOP, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode XOR() { return getToken(SQLServerStatementParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLServerStatementParser.ROW_NUMBER, 0); }
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode INSTANCE() { return getToken(SQLServerStatementParser.INSTANCE, 0); }
		public TerminalNode DO() { return getToken(SQLServerStatementParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(SQLServerStatementParser.DEFINER, 0); }
		public TerminalNode LOCAL() { return getToken(SQLServerStatementParser.LOCAL, 0); }
		public TerminalNode CASCADED() { return getToken(SQLServerStatementParser.CASCADED, 0); }
		public TerminalNode NEXT() { return getToken(SQLServerStatementParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(SQLServerStatementParser.NAME, 0); }
		public TerminalNode INTEGER() { return getToken(SQLServerStatementParser.INTEGER, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLServerStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLServerStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLServerStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQLServerStatementParser.AVG, 0); }
		public TerminalNode FIRST() { return getToken(SQLServerStatementParser.FIRST, 0); }
		public TerminalNode DATETIME2() { return getToken(SQLServerStatementParser.DATETIME2, 0); }
		public TerminalNode OUTPUT() { return getToken(SQLServerStatementParser.OUTPUT, 0); }
		public TerminalNode INSERTED() { return getToken(SQLServerStatementParser.INSERTED, 0); }
		public TerminalNode DELETED() { return getToken(SQLServerStatementParser.DELETED, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (TRUNCATE - 52)) | (1L << (FUNCTION - 52)) | (1L << (TRIGGER - 52)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (LIMIT - 119)) | (1L << (OFFSET - 119)) | (1L << (SAVEPOINT - 119)) | (1L << (BOOLEAN - 119)) | (1L << (ARRAY - 119)) | (1L << (LOCALTIME - 119)) | (1L << (LOCALTIMESTAMP - 119)) | (1L << (QUARTER - 119)) | (1L << (WEEK - 119)) | (1L << (MICROSECOND - 119)) | (1L << (MAX - 119)) | (1L << (MIN - 119)) | (1L << (SUM - 119)) | (1L << (COUNT - 119)) | (1L << (AVG - 119)) | (1L << (ENABLE - 119)) | (1L << (DISABLE - 119)) | (1L << (INSTANCE - 119)) | (1L << (DO - 119)) | (1L << (DEFINER - 119)) | (1L << (SQL - 119)) | (1L << (CASCADED - 119)) | (1L << (LOCAL - 119)) | (1L << (NEXT - 119)) | (1L << (NAME - 119)) | (1L << (INTEGER - 119)) | (1L << (TYPE - 119)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (BINARY - 187)) | (1L << (HIDDEN_ - 187)) | (1L << (MOD - 187)) | (1L << (PARTITION - 187)) | (1L << (PARTITIONS - 187)) | (1L << (TOP - 187)) | (1L << (ROW - 187)) | (1L << (XOR - 187)) | (1L << (ALWAYS - 187)) | (1L << (ROLE - 187)) | (1L << (START - 187)) | (1L << (ALGORITHM - 187)) | (1L << (AUTO - 187)) | (1L << (BLOCKERS - 187)) | (1L << (CLUSTERED - 187)) | (1L << (NONCLUSTERED - 187)) | (1L << (COLUMNSTORE - 187)) | (1L << (CONTENT - 187)) | (1L << (DATABASE - 187)) | (1L << (YEARS - 187)) | (1L << (MONTHS - 187)) | (1L << (WEEKS - 187)) | (1L << (DAYS - 187)) | (1L << (MINUTES - 187)) | (1L << (DENY - 187)) | (1L << (DETERMINISTIC - 187)) | (1L << (DISTRIBUTION - 187)) | (1L << (DOCUMENT - 187)) | (1L << (DURABILITY - 187)) | (1L << (ENCRYPTED - 187)) | (1L << (FILESTREAM - 187)) | (1L << (FILETABLE - 187)) | (1L << (FILLFACTOR - 187)) | (1L << (FOLLOWING - 187)) | (1L << (HASH - 187)) | (1L << (HEAP - 187)) | (1L << (INBOUND - 187)) | (1L << (OUTBOUND - 187)) | (1L << (UNBOUNDED - 187)) | (1L << (INFINITE - 187)) | (1L << (LOGIN - 187)) | (1L << (MASKED - 187)) | (1L << (MAXDOP - 187)) | (1L << (MOVE - 187)) | (1L << (NOCHECK - 187)) | (1L << (OBJECT - 187)))) != 0) || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (OFF - 251)) | (1L << (ONLINE - 251)) | (1L << (OVER - 251)) | (1L << (PAGE - 251)) | (1L << (PAUSED - 251)) | (1L << (PERIOD - 251)) | (1L << (PERSISTED - 251)) | (1L << (PRECEDING - 251)) | (1L << (RANDOMIZED - 251)) | (1L << (RANGE - 251)) | (1L << (REBUILD - 251)) | (1L << (REPLICATE - 251)) | (1L << (REPLICATION - 251)) | (1L << (RESUMABLE - 251)) | (1L << (ROWGUIDCOL - 251)) | (1L << (SAVE - 251)) | (1L << (SELF - 251)) | (1L << (SPARSE - 251)) | (1L << (SWITCH - 251)) | (1L << (TRAN - 251)) | (1L << (TRANCOUNT - 251)) | (1L << (CONTROL - 251)) | (1L << (TAKE - 251)) | (1L << (OWNERSHIP - 251)) | (1L << (DEFINITION - 251)) | (1L << (APPLICATION - 251)) | (1L << (ASSEMBLY - 251)) | (1L << (SYMMETRIC - 251)) | (1L << (ASYMMETRIC - 251)) | (1L << (SERVER - 251)) | (1L << (RECEIVE - 251)) | (1L << (CHANGE - 251)) | (1L << (TRACE - 251)) | (1L << (TRACKING - 251)) | (1L << (RESOURCES - 251)) | (1L << (SETTINGS - 251)) | (1L << (STATE - 251)) | (1L << (AVAILABILITY - 251)) | (1L << (CREDENTIAL - 251)) | (1L << (ENDPOINT - 251)) | (1L << (EVENT - 251)) | (1L << (NOTIFICATION - 251)) | (1L << (LINKED - 251)) | (1L << (AUDIT - 251)) | (1L << (DDL - 251)) | (1L << (XML - 251)) | (1L << (IMPERSONATE - 251)) | (1L << (SECURABLES - 251)) | (1L << (AUTHENTICATE - 251)) | (1L << (EXTERNAL - 251)) | (1L << (ACCESS - 251)) | (1L << (ADMINISTER - 251)) | (1L << (BULK - 251)) | (1L << (OPERATIONS - 251)) | (1L << (UNSAFE - 251)) | (1L << (SHUTDOWN - 251)) | (1L << (SCOPED - 251)) | (1L << (CONFIGURATION - 251)))) != 0) || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (DATASPACE - 315)) | (1L << (SERVICE - 315)) | (1L << (CERTIFICATE - 315)) | (1L << (CONTRACT - 315)) | (1L << (ENCRYPTION - 315)) | (1L << (MASTER - 315)) | (1L << (DATA - 315)) | (1L << (SOURCE - 315)) | (1L << (FILE - 315)) | (1L << (FORMAT - 315)) | (1L << (LIBRARY - 315)) | (1L << (FULLTEXT - 315)) | (1L << (MASK - 315)) | (1L << (UNMASK - 315)) | (1L << (MESSAGE - 315)) | (1L << (REMOTE - 315)) | (1L << (BINDING - 315)) | (1L << (ROUTE - 315)) | (1L << (SECURITY - 315)) | (1L << (POLICY - 315)) | (1L << (AGGREGATE - 315)) | (1L << (QUEUE - 315)) | (1L << (RULE - 315)) | (1L << (SYNONYM - 315)) | (1L << (COLLECTION - 315)) | (1L << (SCRIPT - 315)) | (1L << (KILL - 315)) | (1L << (BACKUP - 315)) | (1L << (LOG - 315)) | (1L << (SHOWPLAN - 315)) | (1L << (SUBSCRIBE - 315)) | (1L << (QUERY - 315)) | (1L << (NOTIFICATIONS - 315)) | (1L << (CHECKPOINT - 315)) | (1L << (SEQUENCE - 315)) | (1L << (ABORT_AFTER_WAIT - 315)) | (1L << (ALLOW_PAGE_LOCKS - 315)) | (1L << (ALLOW_ROW_LOCKS - 315)) | (1L << (ALL_SPARSE_COLUMNS - 315)) | (1L << (BUCKET_COUNT - 315)) | (1L << (COLUMNSTORE_ARCHIVE - 315)) | (1L << (COLUMN_ENCRYPTION_KEY - 315)) | (1L << (COLUMN_SET - 315)) | (1L << (COMPRESSION_DELAY - 315)) | (1L << (DATABASE_DEAULT - 315)) | (1L << (DATA_COMPRESSION - 315)) | (1L << (DATA_CONSISTENCY_CHECK - 315)) | (1L << (ENCRYPTION_TYPE - 315)) | (1L << (SYSTEM_TIME - 315)) | (1L << (SYSTEM_VERSIONING - 315)) | (1L << (TEXTIMAGE_ON - 315)) | (1L << (WAIT_AT_LOW_PRIORITY - 315)) | (1L << (STATISTICS_INCREMENTAL - 315)) | (1L << (STATISTICS_NORECOMPUTE - 315)) | (1L << (ROUND_ROBIN - 315)) | (1L << (SCHEMA_AND_DATA - 315)) | (1L << (SCHEMA_ONLY - 315)) | (1L << (SORT_IN_TEMPDB - 315)) | (1L << (IGNORE_DUP_KEY - 315)) | (1L << (IMPLICIT_TRANSACTIONS - 315)) | (1L << (MAX_DURATION - 315)) | (1L << (MEMORY_OPTIMIZED - 315)) | (1L << (MIGRATION_STATE - 315)) | (1L << (PAD_INDEX - 315)))) != 0) || ((((_la - 379)) & ~0x3f) == 0 && ((1L << (_la - 379)) & ((1L << (REMOTE_DATA_ARCHIVE - 379)) | (1L << (FILESTREAM_ON - 379)) | (1L << (FILETABLE_COLLATE_FILENAME - 379)) | (1L << (FILETABLE_DIRECTORY - 379)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 379)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 379)) | (1L << (FILTER_PREDICATE - 379)) | (1L << (HISTORY_RETENTION_PERIOD - 379)) | (1L << (HISTORY_TABLE - 379)) | (1L << (LOCK_ESCALATION - 379)) | (1L << (DROP_EXISTING - 379)) | (1L << (ROW_NUMBER - 379)) | (1L << (FIRST - 379)) | (1L << (DATETIME2 - 379)) | (1L << (OUTPUT - 379)) | (1L << (INSERTED - 379)) | (1L << (DELETED - 379)))) != 0)) ) {
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(991);
				owner();
				setState(992);
				match(DOT_);
				}
				break;
			}
			setState(996);
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
		public TerminalNode DOT_() { return getToken(SQLServerStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(998);
				owner();
				setState(999);
				match(DOT_);
				}
				break;
			}
			setState(1003);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(LP_);
			setState(1010);
			columnName();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1011);
				match(COMMA_);
				setState(1012);
				columnName();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
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

	public static class ColumnNamesWithSortContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameWithSortContext> columnNameWithSort() {
			return getRuleContexts(ColumnNameWithSortContext.class);
		}
		public ColumnNameWithSortContext columnNameWithSort(int i) {
			return getRuleContext(ColumnNameWithSortContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnNamesWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesWithSort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNamesWithSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesWithSortContext columnNamesWithSort() throws RecognitionException {
		ColumnNamesWithSortContext _localctx = new ColumnNamesWithSortContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_columnNamesWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(LP_);
			setState(1021);
			columnNameWithSort();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1022);
				match(COMMA_);
				setState(1023);
				columnNameWithSort();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029);
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

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1031);
				match(LP_);
				}
			}

			setState(1034);
			tableName();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1035);
				match(COMMA_);
				setState(1036);
				tableName();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(1042);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(LP_);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(1050);
				match(NUMBER_);
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1051);
					match(COMMA_);
					setState(1052);
					match(NUMBER_);
					}
				}

				}
			}

			setState(1057);
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
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(SQLServerStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1059);
				match(PRIMARY);
				}
			}

			setState(1062);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1065);
				notOperator();
				setState(1066);
				expr(3);
				}
				break;
			case 2:
				{
				setState(1068);
				match(LP_);
				setState(1069);
				expr(0);
				setState(1070);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1072);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(1075);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1076);
					logicalOperator();
					setState(1077);
					expr(5);
					}
					} 
				}
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		public TerminalNode OR() { return getToken(SQLServerStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(SQLServerStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
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
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
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
		public TerminalNode IS() { return getToken(SQLServerStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLServerStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLServerStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SQLServerStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(SQLServerStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1089);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1091);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1092);
						match(IS);
						setState(1094);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1093);
							match(NOT);
							}
						}

						setState(1096);
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
						setState(1097);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1098);
						match(SAFE_EQ_);
						setState(1099);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1101);
						comparisonOperator();
						setState(1102);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1105);
						comparisonOperator();
						setState(1106);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1107);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(SQLServerStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(SQLServerStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(SQLServerStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(SQLServerStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
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
		public TerminalNode IN() { return getToken(SQLServerStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SQLServerStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SQLServerStatementParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_predicate);
		int _la;
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				bitExpr(0);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1117);
					match(NOT);
					}
				}

				setState(1120);
				match(IN);
				setState(1121);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				bitExpr(0);
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1124);
					match(NOT);
					}
				}

				setState(1127);
				match(IN);
				setState(1128);
				match(LP_);
				setState(1129);
				expr(0);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1130);
					match(COMMA_);
					setState(1131);
					expr(0);
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1137);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				bitExpr(0);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1140);
					match(NOT);
					}
				}

				setState(1143);
				match(BETWEEN);
				setState(1144);
				bitExpr(0);
				setState(1145);
				match(AND);
				setState(1146);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1148);
				bitExpr(0);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1149);
					match(NOT);
					}
				}

				setState(1152);
				match(LIKE);
				setState(1153);
				simpleExpr(0);
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1154);
					match(ESCAPE);
					setState(1155);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1158);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(SQLServerStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(SQLServerStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(SQLServerStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(SQLServerStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(SQLServerStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(SQLServerStatementParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBitExpr(this);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1162);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1164);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1165);
						match(VERTICAL_BAR_);
						setState(1166);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1167);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1168);
						match(AMPERSAND_);
						setState(1169);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1170);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1171);
						match(SIGNED_LEFT_SHIFT_);
						setState(1172);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1173);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1174);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1175);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1176);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1177);
						match(PLUS_);
						setState(1178);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1179);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1180);
						match(MINUS_);
						setState(1181);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1182);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1183);
						match(ASTERISK_);
						setState(1184);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1186);
						match(SLASH_);
						setState(1187);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1189);
						match(MOD_);
						setState(1190);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1192);
						match(CARET_);
						setState(1193);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(1198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		public TerminalNode PLUS_() { return getToken(SQLServerStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(SQLServerStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(SQLServerStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(SQLServerStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(SQLServerStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(SQLServerStatementParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLServerStatementParser.OR_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1200);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1201);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1202);
				literals();
				}
				break;
			case 4:
				{
				setState(1203);
				columnName();
				}
				break;
			case 5:
				{
				setState(1204);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1205);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1206);
					match(ROW);
					}
				}

				setState(1209);
				match(LP_);
				setState(1210);
				expr(0);
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1211);
					match(COMMA_);
					setState(1212);
					expr(0);
					}
					}
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1218);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1220);
					match(EXISTS);
					}
				}

				setState(1223);
				subquery();
				}
				break;
			case 8:
				{
				setState(1224);
				match(LBE_);
				setState(1225);
				identifier();
				setState(1226);
				expr(0);
				setState(1227);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(1229);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(1230);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(1233);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(1234);
					match(OR_);
					setState(1235);
					simpleExpr(8);
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionCall);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			aggregationFunctionName();
			setState(1247);
			match(LP_);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1248);
				distinct();
				}
			}

			setState(1260);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1251);
				expr(0);
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1252);
					match(COMMA_);
					setState(1253);
					expr(0);
					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1259);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1262);
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
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLServerStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLServerStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(SQLServerStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(SQLServerStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
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
		public TerminalNode DISTINCT() { return getToken(SQLServerStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_specialFunction);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1268);
				castFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
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
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(CAST);
			setState(1273);
			match(LP_);
			setState(1274);
			expr(0);
			setState(1275);
			match(AS);
			setState(1276);
			dataType();
			setState(1277);
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
		public TerminalNode CHAR() { return getToken(SQLServerStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(SQLServerStatementParser.USING, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(CHAR);
			setState(1280);
			match(LP_);
			setState(1281);
			expr(0);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1282);
				match(COMMA_);
				setState(1283);
				expr(0);
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1289);
				match(USING);
				setState(1290);
				ignoredIdentifier();
				}
			}

			setState(1293);
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
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(SQLServerStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			regularFunctionName();
			setState(1296);
			match(LP_);
			setState(1306);
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
			case FUNCTION:
			case TRIGGER:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case CHAR:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case CONVERT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1297);
				expr(0);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1298);
					match(COMMA_);
					setState(1299);
					expr(0);
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1305);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
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

	public static class RegularFunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLServerStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLServerStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SQLServerStatementParser.INTERVAL, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_regularFunctionName);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1313);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1314);
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
		public TerminalNode CASE() { return getToken(SQLServerStatementParser.CASE, 0); }
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_caseExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(CASE);
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << LBE_) | (1L << QUESTION_) | (1L << TRUNCATE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (FUNCTION - 68)) | (1L << (TRIGGER - 68)) | (1L << (CASE - 68)) | (1L << (CAST - 68)) | (1L << (IF - 68)) | (1L << (NULL - 68)) | (1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (EXISTS - 68)) | (1L << (LIMIT - 68)) | (1L << (OFFSET - 68)) | (1L << (SAVEPOINT - 68)) | (1L << (BOOLEAN - 68)) | (1L << (CHAR - 68)) | (1L << (ARRAY - 68)) | (1L << (INTERVAL - 68)) | (1L << (DATE - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (TIME - 132)) | (1L << (TIMESTAMP - 132)) | (1L << (LOCALTIME - 132)) | (1L << (LOCALTIMESTAMP - 132)) | (1L << (QUARTER - 132)) | (1L << (WEEK - 132)) | (1L << (MICROSECOND - 132)) | (1L << (MAX - 132)) | (1L << (MIN - 132)) | (1L << (SUM - 132)) | (1L << (COUNT - 132)) | (1L << (AVG - 132)) | (1L << (ENABLE - 132)) | (1L << (DISABLE - 132)) | (1L << (INSTANCE - 132)) | (1L << (DO - 132)) | (1L << (DEFINER - 132)) | (1L << (SQL - 132)) | (1L << (CASCADED - 132)) | (1L << (LOCAL - 132)) | (1L << (NEXT - 132)) | (1L << (NAME - 132)) | (1L << (INTEGER - 132)) | (1L << (TYPE - 132)) | (1L << (BINARY - 132)) | (1L << (HIDDEN_ - 132)) | (1L << (MOD - 132)) | (1L << (PARTITION - 132)) | (1L << (PARTITIONS - 132)) | (1L << (TOP - 132)) | (1L << (ROW - 132)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (XOR - 197)) | (1L << (ALWAYS - 197)) | (1L << (ROLE - 197)) | (1L << (START - 197)) | (1L << (ALGORITHM - 197)) | (1L << (AUTO - 197)) | (1L << (BLOCKERS - 197)) | (1L << (CLUSTERED - 197)) | (1L << (NONCLUSTERED - 197)) | (1L << (COLUMNSTORE - 197)) | (1L << (CONTENT - 197)) | (1L << (CONVERT - 197)) | (1L << (DATABASE - 197)) | (1L << (YEARS - 197)) | (1L << (MONTHS - 197)) | (1L << (WEEKS - 197)) | (1L << (DAYS - 197)) | (1L << (MINUTES - 197)) | (1L << (DENY - 197)) | (1L << (DETERMINISTIC - 197)) | (1L << (DISTRIBUTION - 197)) | (1L << (DOCUMENT - 197)) | (1L << (DURABILITY - 197)) | (1L << (ENCRYPTED - 197)) | (1L << (FILESTREAM - 197)) | (1L << (FILETABLE - 197)) | (1L << (FILLFACTOR - 197)) | (1L << (FOLLOWING - 197)) | (1L << (HASH - 197)) | (1L << (HEAP - 197)) | (1L << (INBOUND - 197)) | (1L << (OUTBOUND - 197)) | (1L << (UNBOUNDED - 197)) | (1L << (INFINITE - 197)) | (1L << (LOGIN - 197)) | (1L << (MASKED - 197)) | (1L << (MAXDOP - 197)) | (1L << (MOVE - 197)) | (1L << (NOCHECK - 197)) | (1L << (OBJECT - 197)) | (1L << (OFF - 197)) | (1L << (ONLINE - 197)) | (1L << (OVER - 197)) | (1L << (PAGE - 197)) | (1L << (PAUSED - 197)) | (1L << (PERIOD - 197)) | (1L << (PERSISTED - 197)) | (1L << (PRECEDING - 197)) | (1L << (RANDOMIZED - 197)) | (1L << (RANGE - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (REBUILD - 261)) | (1L << (REPLICATE - 261)) | (1L << (REPLICATION - 261)) | (1L << (RESUMABLE - 261)) | (1L << (ROWGUIDCOL - 261)) | (1L << (SAVE - 261)) | (1L << (SELF - 261)) | (1L << (SPARSE - 261)) | (1L << (SWITCH - 261)) | (1L << (TRAN - 261)) | (1L << (TRANCOUNT - 261)) | (1L << (CONTROL - 261)) | (1L << (TAKE - 261)) | (1L << (OWNERSHIP - 261)) | (1L << (DEFINITION - 261)) | (1L << (APPLICATION - 261)) | (1L << (ASSEMBLY - 261)) | (1L << (SYMMETRIC - 261)) | (1L << (ASYMMETRIC - 261)) | (1L << (SERVER - 261)) | (1L << (RECEIVE - 261)) | (1L << (CHANGE - 261)) | (1L << (TRACE - 261)) | (1L << (TRACKING - 261)) | (1L << (RESOURCES - 261)) | (1L << (SETTINGS - 261)) | (1L << (STATE - 261)) | (1L << (AVAILABILITY - 261)) | (1L << (CREDENTIAL - 261)) | (1L << (ENDPOINT - 261)) | (1L << (EVENT - 261)) | (1L << (NOTIFICATION - 261)) | (1L << (LINKED - 261)) | (1L << (AUDIT - 261)) | (1L << (DDL - 261)) | (1L << (XML - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (SECURABLES - 261)) | (1L << (AUTHENTICATE - 261)) | (1L << (EXTERNAL - 261)) | (1L << (ACCESS - 261)) | (1L << (ADMINISTER - 261)) | (1L << (BULK - 261)) | (1L << (OPERATIONS - 261)) | (1L << (UNSAFE - 261)) | (1L << (SHUTDOWN - 261)) | (1L << (SCOPED - 261)) | (1L << (CONFIGURATION - 261)) | (1L << (DATASPACE - 261)) | (1L << (SERVICE - 261)) | (1L << (CERTIFICATE - 261)) | (1L << (CONTRACT - 261)) | (1L << (ENCRYPTION - 261)) | (1L << (MASTER - 261)) | (1L << (DATA - 261)) | (1L << (SOURCE - 261)) | (1L << (FILE - 261)) | (1L << (FORMAT - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (LIBRARY - 325)) | (1L << (FULLTEXT - 325)) | (1L << (MASK - 325)) | (1L << (UNMASK - 325)) | (1L << (MESSAGE - 325)) | (1L << (REMOTE - 325)) | (1L << (BINDING - 325)) | (1L << (ROUTE - 325)) | (1L << (SECURITY - 325)) | (1L << (POLICY - 325)) | (1L << (AGGREGATE - 325)) | (1L << (QUEUE - 325)) | (1L << (RULE - 325)) | (1L << (SYNONYM - 325)) | (1L << (COLLECTION - 325)) | (1L << (SCRIPT - 325)) | (1L << (KILL - 325)) | (1L << (BACKUP - 325)) | (1L << (LOG - 325)) | (1L << (SHOWPLAN - 325)) | (1L << (SUBSCRIBE - 325)) | (1L << (QUERY - 325)) | (1L << (NOTIFICATIONS - 325)) | (1L << (CHECKPOINT - 325)) | (1L << (SEQUENCE - 325)) | (1L << (ABORT_AFTER_WAIT - 325)) | (1L << (ALLOW_PAGE_LOCKS - 325)) | (1L << (ALLOW_ROW_LOCKS - 325)) | (1L << (ALL_SPARSE_COLUMNS - 325)) | (1L << (BUCKET_COUNT - 325)) | (1L << (COLUMNSTORE_ARCHIVE - 325)) | (1L << (COLUMN_ENCRYPTION_KEY - 325)) | (1L << (COLUMN_SET - 325)) | (1L << (COMPRESSION_DELAY - 325)) | (1L << (DATABASE_DEAULT - 325)) | (1L << (DATA_COMPRESSION - 325)) | (1L << (DATA_CONSISTENCY_CHECK - 325)) | (1L << (ENCRYPTION_TYPE - 325)) | (1L << (SYSTEM_TIME - 325)) | (1L << (SYSTEM_VERSIONING - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (WAIT_AT_LOW_PRIORITY - 325)) | (1L << (STATISTICS_INCREMENTAL - 325)) | (1L << (STATISTICS_NORECOMPUTE - 325)) | (1L << (ROUND_ROBIN - 325)) | (1L << (SCHEMA_AND_DATA - 325)) | (1L << (SCHEMA_ONLY - 325)) | (1L << (SORT_IN_TEMPDB - 325)) | (1L << (IGNORE_DUP_KEY - 325)) | (1L << (IMPLICIT_TRANSACTIONS - 325)) | (1L << (MAX_DURATION - 325)) | (1L << (MEMORY_OPTIMIZED - 325)) | (1L << (MIGRATION_STATE - 325)) | (1L << (PAD_INDEX - 325)) | (1L << (REMOTE_DATA_ARCHIVE - 325)) | (1L << (FILESTREAM_ON - 325)) | (1L << (FILETABLE_COLLATE_FILENAME - 325)) | (1L << (FILETABLE_DIRECTORY - 325)) | (1L << (FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME - 325)) | (1L << (FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME - 325)) | (1L << (FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME - 325)) | (1L << (FILTER_PREDICATE - 325)) | (1L << (HISTORY_RETENTION_PERIOD - 325)) | (1L << (HISTORY_TABLE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (LOCK_ESCALATION - 389)) | (1L << (DROP_EXISTING - 389)) | (1L << (ROW_NUMBER - 389)) | (1L << (FIRST - 389)) | (1L << (DATETIME2 - 389)) | (1L << (OUTPUT - 389)) | (1L << (INSERTED - 389)) | (1L << (DELETED - 389)) | (1L << (IDENTIFIER_ - 389)) | (1L << (STRING_ - 389)) | (1L << (NUMBER_ - 389)) | (1L << (HEX_DIGIT_ - 389)) | (1L << (BIT_NUM_ - 389)))) != 0)) {
				{
				setState(1318);
				simpleExpr(0);
				}
			}

			setState(1322); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1321);
					caseWhen();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1324); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1326);
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
		public TerminalNode WHEN() { return getToken(SQLServerStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SQLServerStatementParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(WHEN);
			setState(1330);
			expr(0);
			setState(1331);
			match(THEN);
			setState(1332);
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
		public TerminalNode ELSE() { return getToken(SQLServerStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(ELSE);
			setState(1335);
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public WindowedFunctionContext windowedFunction() {
			return getRuleContext(WindowedFunctionContext.class,0);
		}
		public AtTimeZoneExprContext atTimeZoneExpr() {
			return getRuleContext(AtTimeZoneExprContext.class,0);
		}
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public ConvertExprContext convertExpr() {
			return getRuleContext(ConvertExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrivateExprOfDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_privateExprOfDb);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				windowedFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				atTimeZoneExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
				castExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340);
				convertExpr();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLServerStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode OFFSET() { return getToken(SQLServerStatementParser.OFFSET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ROW() { return getTokens(SQLServerStatementParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(SQLServerStatementParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(SQLServerStatementParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(SQLServerStatementParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(SQLServerStatementParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(SQLServerStatementParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(SQLServerStatementParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(SQLServerStatementParser.NEXT, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
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
			setState(1343);
			match(ORDER);
			setState(1344);
			match(BY);
			setState(1345);
			orderByItem();
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1346);
				match(COMMA_);
				setState(1347);
				orderByItem();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1353);
				match(OFFSET);
				setState(1354);
				expr(0);
				setState(1355);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FETCH) {
					{
					setState(1356);
					match(FETCH);
					setState(1357);
					_la = _input.LA(1);
					if ( !(_la==NEXT || _la==FIRST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1358);
					expr(0);
					setState(1359);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1360);
					match(ONLY);
					}
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
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
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
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1366);
				columnName();
				}
				break;
			case 2:
				{
				setState(1367);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1368);
				expr(0);
				}
				break;
			}
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1371);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX() { return getToken(SQLServerStatementParser.MAX, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode CONTENT() { return getToken(SQLServerStatementParser.CONTENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(SQLServerStatementParser.DOCUMENT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			dataTypeName();
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1375);
				dataTypeLength();
				}
				break;
			case 2:
				{
				setState(1376);
				match(LP_);
				setState(1377);
				match(MAX);
				setState(1378);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(1379);
				match(LP_);
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONTENT || _la==DOCUMENT) {
					{
					setState(1380);
					_la = _input.LA(1);
					if ( !(_la==CONTENT || _la==DOCUMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1383);
				ignoredIdentifier();
				setState(1384);
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

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(SQLServerStatementParser.BIGINT, 0); }
		public TerminalNode NUMERIC() { return getToken(SQLServerStatementParser.NUMERIC, 0); }
		public TerminalNode BIT() { return getToken(SQLServerStatementParser.BIT, 0); }
		public TerminalNode SMALLINT() { return getToken(SQLServerStatementParser.SMALLINT, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLServerStatementParser.DECIMAL, 0); }
		public TerminalNode SMALLMONEY() { return getToken(SQLServerStatementParser.SMALLMONEY, 0); }
		public TerminalNode INT() { return getToken(SQLServerStatementParser.INT, 0); }
		public TerminalNode TINYINT() { return getToken(SQLServerStatementParser.TINYINT, 0); }
		public TerminalNode MONEY() { return getToken(SQLServerStatementParser.MONEY, 0); }
		public TerminalNode FLOAT() { return getToken(SQLServerStatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SQLServerStatementParser.REAL, 0); }
		public TerminalNode DATE() { return getToken(SQLServerStatementParser.DATE, 0); }
		public TerminalNode DATETIMEOFFSET() { return getToken(SQLServerStatementParser.DATETIMEOFFSET, 0); }
		public TerminalNode SMALLDATETIME() { return getToken(SQLServerStatementParser.SMALLDATETIME, 0); }
		public TerminalNode DATETIME() { return getToken(SQLServerStatementParser.DATETIME, 0); }
		public TerminalNode DATETIME2() { return getToken(SQLServerStatementParser.DATETIME2, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode CHAR() { return getToken(SQLServerStatementParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLServerStatementParser.VARCHAR, 0); }
		public TerminalNode TEXT() { return getToken(SQLServerStatementParser.TEXT, 0); }
		public TerminalNode NCHAR() { return getToken(SQLServerStatementParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(SQLServerStatementParser.NVARCHAR, 0); }
		public TerminalNode NTEXT() { return getToken(SQLServerStatementParser.NTEXT, 0); }
		public TerminalNode BINARY() { return getToken(SQLServerStatementParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(SQLServerStatementParser.VARBINARY, 0); }
		public TerminalNode IMAGE() { return getToken(SQLServerStatementParser.IMAGE, 0); }
		public TerminalNode SQL_VARIANT() { return getToken(SQLServerStatementParser.SQL_VARIANT, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode UNIQUEIDENTIFIER() { return getToken(SQLServerStatementParser.UNIQUEIDENTIFIER, 0); }
		public TerminalNode HIERARCHYID() { return getToken(SQLServerStatementParser.HIERARCHYID, 0); }
		public TerminalNode GEOMETRY() { return getToken(SQLServerStatementParser.GEOMETRY, 0); }
		public TerminalNode GEOGRAPHY() { return getToken(SQLServerStatementParser.GEOGRAPHY, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_dataTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (CHAR - 127)) | (1L << (DATE - 127)) | (1L << (TIME - 127)) | (1L << (REAL - 127)) | (1L << (DECIMAL - 127)) | (1L << (BIT - 127)) | (1L << (SMALLINT - 127)) | (1L << (INT - 127)) | (1L << (TINYINT - 127)) | (1L << (NUMERIC - 127)) | (1L << (FLOAT - 127)) | (1L << (BIGINT - 127)) | (1L << (TEXT - 127)) | (1L << (VARCHAR - 127)) | (1L << (BINARY - 127)))) != 0) || _la==XML || ((((_la - 395)) & ~0x3f) == 0 && ((1L << (_la - 395)) & ((1L << (MONEY - 395)) | (1L << (SMALLMONEY - 395)) | (1L << (DATETIMEOFFSET - 395)) | (1L << (DATETIME - 395)) | (1L << (DATETIME2 - 395)) | (1L << (SMALLDATETIME - 395)) | (1L << (NCHAR - 395)) | (1L << (NVARCHAR - 395)) | (1L << (NTEXT - 395)) | (1L << (VARBINARY - 395)) | (1L << (IMAGE - 395)) | (1L << (SQL_VARIANT - 395)) | (1L << (UNIQUEIDENTIFIER - 395)) | (1L << (HIERARCHYID - 395)) | (1L << (GEOMETRY - 395)) | (1L << (GEOGRAPHY - 395)) | (1L << (IDENTIFIER_ - 395)))) != 0)) ) {
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

	public static class AtTimeZoneExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(SQLServerStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SQLServerStatementParser.ZONE, 0); }
		public AtTimeZoneExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atTimeZoneExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAtTimeZoneExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtTimeZoneExprContext atTimeZoneExpr() throws RecognitionException {
		AtTimeZoneExprContext _localctx = new AtTimeZoneExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_atTimeZoneExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(IDENTIFIER_);
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1391);
				match(WITH);
				setState(1392);
				match(TIME);
				setState(1393);
				match(ZONE);
				}
			}

			setState(1396);
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SQLServerStatementParser.CAST, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_castExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(CAST);
			setState(1399);
			match(LP_);
			setState(1400);
			expr(0);
			setState(1401);
			match(AS);
			setState(1402);
			dataType();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1403);
				match(LP_);
				setState(1404);
				match(NUMBER_);
				setState(1405);
				match(RP_);
				}
			}

			setState(1408);
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

	public static class ConvertExprContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(SQLServerStatementParser.CONVERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public ConvertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitConvertExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertExprContext convertExpr() throws RecognitionException {
		ConvertExprContext _localctx = new ConvertExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_convertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(CONVERT);
			{
			setState(1411);
			dataType();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1412);
				match(LP_);
				setState(1413);
				match(NUMBER_);
				setState(1414);
				match(RP_);
				}
			}

			setState(1417);
			match(COMMA_);
			setState(1418);
			expr(0);
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1419);
				match(COMMA_);
				setState(1420);
				match(NUMBER_);
				}
				break;
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

	public static class WindowedFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public WindowedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowedFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowedFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowedFunctionContext windowedFunction() throws RecognitionException {
		WindowedFunctionContext _localctx = new WindowedFunctionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowedFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			functionCall();
			setState(1424);
			overClause();
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

	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SQLServerStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public RowRangeClauseContext rowRangeClause() {
			return getRuleContext(RowRangeClauseContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOverClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(OVER);
			setState(1427);
			match(LP_);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1428);
				partitionByClause();
				}
			}

			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1431);
				orderByClause();
				}
			}

			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1434);
				rowRangeClause();
				}
			}

			setState(1437);
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

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLServerStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_partitionByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(PARTITION);
			setState(1440);
			match(BY);
			setState(1441);
			expr(0);
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1442);
				match(COMMA_);
				setState(1443);
				expr(0);
				}
				}
				setState(1448);
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

	public static class RowRangeClauseContext extends ParserRuleContext {
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SQLServerStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public RowRangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowRangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRowRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowRangeClauseContext rowRangeClause() throws RecognitionException {
		RowRangeClauseContext _localctx = new RowRangeClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_rowRangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1450);
			windowFrameExtent();
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

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameExtent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_windowFrameExtent);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT:
			case UNBOUNDED:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				windowFramePreceding();
				}
				break;
			case BETWEEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				windowFrameBetween();
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

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLServerStatementParser.BETWEEN, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND() { return getToken(SQLServerStatementParser.AND, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(BETWEEN);
			setState(1457);
			windowFrameBound();
			setState(1458);
			match(AND);
			setState(1459);
			windowFrameBound();
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

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFramePrecedingContext windowFramePreceding() {
			return getRuleContext(WindowFramePrecedingContext.class,0);
		}
		public WindowFrameFollowingContext windowFrameFollowing() {
			return getRuleContext(WindowFrameFollowingContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_windowFrameBound);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				windowFramePreceding();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				windowFrameFollowing();
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

	public static class WindowFramePrecedingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SQLServerStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFramePrecedingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFramePreceding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFramePreceding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFramePrecedingContext windowFramePreceding() throws RecognitionException {
		WindowFramePrecedingContext _localctx = new WindowFramePrecedingContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_windowFramePreceding);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(UNBOUNDED);
				setState(1466);
				match(PRECEDING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				match(NUMBER_);
				setState(1468);
				match(PRECEDING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469);
				match(CURRENT);
				setState(1470);
				match(ROW);
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

	public static class WindowFrameFollowingContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(SQLServerStatementParser.UNBOUNDED, 0); }
		public TerminalNode FOLLOWING() { return getToken(SQLServerStatementParser.FOLLOWING, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(SQLServerStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public WindowFrameFollowingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameFollowing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWindowFrameFollowing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameFollowingContext windowFrameFollowing() throws RecognitionException {
		WindowFrameFollowingContext _localctx = new WindowFrameFollowingContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_windowFrameFollowing);
		try {
			setState(1479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(UNBOUNDED);
				setState(1474);
				match(FOLLOWING);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(NUMBER_);
				setState(1476);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				match(CURRENT);
				setState(1478);
				match(ROW);
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

	public static class ColumnNameWithSortContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLServerStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLServerStatementParser.DESC, 0); }
		public ColumnNameWithSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameWithSort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnNameWithSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameWithSortContext columnNameWithSort() throws RecognitionException {
		ColumnNameWithSortContext _localctx = new ColumnNameWithSortContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_columnNameWithSort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			columnName();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1482);
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

	public static class IndexOptionContext extends ParserRuleContext {
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public EqOnOffOptionContext eqOnOffOption() {
			return getRuleContext(EqOnOffOptionContext.class,0);
		}
		public EqTimeContext eqTime() {
			return getRuleContext(EqTimeContext.class,0);
		}
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public CompressionOptionContext compressionOption() {
			return getRuleContext(CompressionOptionContext.class,0);
		}
		public OnPartitionClauseContext onPartitionClause() {
			return getRuleContext(OnPartitionClauseContext.class,0);
		}
		public IndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionContext indexOption() throws RecognitionException {
		IndexOptionContext _localctx = new IndexOptionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_indexOption);
		int _la;
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				match(FILLFACTOR);
				setState(1486);
				match(EQ_);
				setState(1487);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				eqOnOffOption();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1489);
				_la = _input.LA(1);
				if ( !(_la==COMPRESSION_DELAY || _la==MAX_DURATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1490);
				eqTime();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1491);
				match(MAXDOP);
				setState(1492);
				match(EQ_);
				setState(1493);
				match(NUMBER_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1494);
				compressionOption();
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1495);
					onPartitionClause();
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

	public static class CompressionOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode COLUMNSTORE_ARCHIVE() { return getToken(SQLServerStatementParser.COLUMNSTORE_ARCHIVE, 0); }
		public CompressionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compressionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCompressionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompressionOptionContext compressionOption() throws RecognitionException {
		CompressionOptionContext _localctx = new CompressionOptionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_compressionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			match(DATA_COMPRESSION);
			setState(1501);
			match(EQ_);
			setState(1502);
			_la = _input.LA(1);
			if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ROW - 194)) | (1L << (COLUMNSTORE - 194)) | (1L << (NONE - 194)) | (1L << (PAGE - 194)))) != 0) || _la==COLUMNSTORE_ARCHIVE) ) {
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

	public static class EqTimeContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public EqTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqTimeContext eqTime() throws RecognitionException {
		EqTimeContext _localctx = new EqTimeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_eqTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(EQ_);
			setState(1505);
			match(NUMBER_);
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1506);
				match(MINUTES);
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

	public static class EqOnOffOptionContext extends ParserRuleContext {
		public EqKeyContext eqKey() {
			return getRuleContext(EqKeyContext.class,0);
		}
		public EqOnOffContext eqOnOff() {
			return getRuleContext(EqOnOffContext.class,0);
		}
		public EqOnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOffOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqOnOffOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOnOffOptionContext eqOnOffOption() throws RecognitionException {
		EqOnOffOptionContext _localctx = new EqOnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_eqOnOffOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			eqKey();
			setState(1510);
			eqOnOff();
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

	public static class EqKeyContext extends ParserRuleContext {
		public TerminalNode PAD_INDEX() { return getToken(SQLServerStatementParser.PAD_INDEX, 0); }
		public TerminalNode SORT_IN_TEMPDB() { return getToken(SQLServerStatementParser.SORT_IN_TEMPDB, 0); }
		public TerminalNode IGNORE_DUP_KEY() { return getToken(SQLServerStatementParser.IGNORE_DUP_KEY, 0); }
		public TerminalNode STATISTICS_NORECOMPUTE() { return getToken(SQLServerStatementParser.STATISTICS_NORECOMPUTE, 0); }
		public TerminalNode STATISTICS_INCREMENTAL() { return getToken(SQLServerStatementParser.STATISTICS_INCREMENTAL, 0); }
		public TerminalNode DROP_EXISTING() { return getToken(SQLServerStatementParser.DROP_EXISTING, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public TerminalNode RESUMABLE() { return getToken(SQLServerStatementParser.RESUMABLE, 0); }
		public TerminalNode ALLOW_ROW_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_ROW_LOCKS, 0); }
		public TerminalNode ALLOW_PAGE_LOCKS() { return getToken(SQLServerStatementParser.ALLOW_PAGE_LOCKS, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public EqKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqKeyContext eqKey() throws RecognitionException {
		EqKeyContext _localctx = new EqKeyContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_eqKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_la = _input.LA(1);
			if ( !(_la==ONLINE || _la==RESUMABLE || ((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (ALLOW_PAGE_LOCKS - 351)) | (1L << (ALLOW_ROW_LOCKS - 351)) | (1L << (COMPRESSION_DELAY - 351)) | (1L << (STATISTICS_INCREMENTAL - 351)) | (1L << (STATISTICS_NORECOMPUTE - 351)) | (1L << (SORT_IN_TEMPDB - 351)) | (1L << (IGNORE_DUP_KEY - 351)) | (1L << (PAD_INDEX - 351)) | (1L << (DROP_EXISTING - 351)))) != 0)) ) {
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

	public static class EqOnOffContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public EqOnOffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOnOff; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEqOnOff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOnOffContext eqOnOff() throws RecognitionException {
		EqOnOffContext _localctx = new EqOnOffContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_eqOnOff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(EQ_);
			setState(1515);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class OnPartitionClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnPartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPartitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPartitionClauseContext onPartitionClause() throws RecognitionException {
		OnPartitionClauseContext _localctx = new OnPartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_onPartitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(ON);
			setState(1518);
			match(PARTITIONS);
			setState(1519);
			match(LP_);
			setState(1520);
			partitionExpressions();
			setState(1521);
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

	public static class PartitionExpressionsContext extends ParserRuleContext {
		public List<PartitionExpressionContext> partitionExpression() {
			return getRuleContexts(PartitionExpressionContext.class);
		}
		public PartitionExpressionContext partitionExpression(int i) {
			return getRuleContext(PartitionExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PartitionExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionsContext partitionExpressions() throws RecognitionException {
		PartitionExpressionsContext _localctx = new PartitionExpressionsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_partitionExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			partitionExpression();
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1524);
				match(COMMA_);
				setState(1525);
				partitionExpression();
				}
				}
				setState(1530);
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

	public static class PartitionExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public NumberRangeContext numberRange() {
			return getRuleContext(NumberRangeContext.class,0);
		}
		public PartitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionExpressionContext partitionExpression() throws RecognitionException {
		PartitionExpressionContext _localctx = new PartitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_partitionExpression);
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				numberRange();
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

	public static class NumberRangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public NumberRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberRange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitNumberRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberRangeContext numberRange() throws RecognitionException {
		NumberRangeContext _localctx = new NumberRangeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_numberRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(NUMBER_);
			setState(1536);
			match(TO);
			setState(1537);
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

	public static class LowPriorityLockWaitContext extends ParserRuleContext {
		public TerminalNode WAIT_AT_LOW_PRIORITY() { return getToken(SQLServerStatementParser.WAIT_AT_LOW_PRIORITY, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MAX_DURATION() { return getToken(SQLServerStatementParser.MAX_DURATION, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode ABORT_AFTER_WAIT() { return getToken(SQLServerStatementParser.ABORT_AFTER_WAIT, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode SELF() { return getToken(SQLServerStatementParser.SELF, 0); }
		public TerminalNode BLOCKERS() { return getToken(SQLServerStatementParser.BLOCKERS, 0); }
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public LowPriorityLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPriorityLockWait; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitLowPriorityLockWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowPriorityLockWaitContext lowPriorityLockWait() throws RecognitionException {
		LowPriorityLockWaitContext _localctx = new LowPriorityLockWaitContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_lowPriorityLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(WAIT_AT_LOW_PRIORITY);
			setState(1540);
			match(LP_);
			setState(1541);
			match(MAX_DURATION);
			setState(1542);
			match(EQ_);
			setState(1543);
			match(NUMBER_);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUTES) {
				{
				setState(1544);
				match(MINUTES);
				}
			}

			setState(1547);
			match(COMMA_);
			setState(1548);
			match(ABORT_AFTER_WAIT);
			setState(1549);
			match(EQ_);
			setState(1550);
			_la = _input.LA(1);
			if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (BLOCKERS - 213)) | (1L << (NONE - 213)) | (1L << (SELF - 213)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1551);
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

	public static class OnLowPriorLockWaitContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnLowPriorLockWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onLowPriorLockWait; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnLowPriorLockWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnLowPriorLockWaitContext onLowPriorLockWait() throws RecognitionException {
		OnLowPriorLockWaitContext _localctx = new OnLowPriorLockWaitContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_onLowPriorLockWait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			match(ON);
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1554);
				match(LP_);
				setState(1555);
				lowPriorityLockWait();
				setState(1556);
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

	public static class IgnoredIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifierContext ignoredIdentifier() throws RecognitionException {
		IgnoredIdentifierContext _localctx = new IgnoredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_ignoredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
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
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIgnoredIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiersContext ignoredIdentifiers() throws RecognitionException {
		IgnoredIdentifiersContext _localctx = new IgnoredIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_ignoredIdentifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			ignoredIdentifier();
			setState(1567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1563);
					match(COMMA_);
					setState(1564);
					ignoredIdentifier();
					}
					} 
				}
				setState(1569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMatchNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public FileTableClauseContext fileTableClause() {
			return getRuleContext(FileTableClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_createTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(CREATE);
			setState(1573);
			match(TABLE);
			setState(1574);
			tableName();
			setState(1575);
			fileTableClause();
			setState(1576);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public CreateIndexSpecificationContext createIndexSpecification() {
			return getRuleContext(CreateIndexSpecificationContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesWithSortContext columnNamesWithSort() {
			return getRuleContext(ColumnNamesWithSortContext.class,0);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(CREATE);
			setState(1579);
			createIndexSpecification();
			setState(1580);
			match(INDEX);
			setState(1581);
			indexName();
			setState(1582);
			match(ON);
			setState(1583);
			tableName();
			setState(1584);
			columnNamesWithSort();
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<AlterDefinitionClauseContext> alterDefinitionClause() {
			return getRuleContexts(AlterDefinitionClauseContext.class);
		}
		public AlterDefinitionClauseContext alterDefinitionClause(int i) {
			return getRuleContext(AlterDefinitionClauseContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(ALTER);
			setState(1587);
			match(TABLE);
			setState(1588);
			tableName();
			setState(1589);
			alterDefinitionClause();
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1590);
				match(COMMA_);
				setState(1591);
				alterDefinitionClause();
				}
				}
				setState(1596);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_alterIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(ALTER);
			setState(1598);
			match(INDEX);
			setState(1601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case FUNCTION:
			case TRIGGER:
			case LIMIT:
			case OFFSET:
			case SAVEPOINT:
			case BOOLEAN:
			case ARRAY:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case QUARTER:
			case WEEK:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case INSTANCE:
			case DO:
			case DEFINER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case NEXT:
			case NAME:
			case INTEGER:
			case TYPE:
			case BINARY:
			case HIDDEN_:
			case MOD:
			case PARTITION:
			case PARTITIONS:
			case TOP:
			case ROW:
			case XOR:
			case ALWAYS:
			case ROLE:
			case START:
			case ALGORITHM:
			case AUTO:
			case BLOCKERS:
			case CLUSTERED:
			case NONCLUSTERED:
			case COLUMNSTORE:
			case CONTENT:
			case DATABASE:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case MINUTES:
			case DENY:
			case DETERMINISTIC:
			case DISTRIBUTION:
			case DOCUMENT:
			case DURABILITY:
			case ENCRYPTED:
			case FILESTREAM:
			case FILETABLE:
			case FILLFACTOR:
			case FOLLOWING:
			case HASH:
			case HEAP:
			case INBOUND:
			case OUTBOUND:
			case UNBOUNDED:
			case INFINITE:
			case LOGIN:
			case MASKED:
			case MAXDOP:
			case MOVE:
			case NOCHECK:
			case OBJECT:
			case OFF:
			case ONLINE:
			case OVER:
			case PAGE:
			case PAUSED:
			case PERIOD:
			case PERSISTED:
			case PRECEDING:
			case RANDOMIZED:
			case RANGE:
			case REBUILD:
			case REPLICATE:
			case REPLICATION:
			case RESUMABLE:
			case ROWGUIDCOL:
			case SAVE:
			case SELF:
			case SPARSE:
			case SWITCH:
			case TRAN:
			case TRANCOUNT:
			case CONTROL:
			case TAKE:
			case OWNERSHIP:
			case DEFINITION:
			case APPLICATION:
			case ASSEMBLY:
			case SYMMETRIC:
			case ASYMMETRIC:
			case SERVER:
			case RECEIVE:
			case CHANGE:
			case TRACE:
			case TRACKING:
			case RESOURCES:
			case SETTINGS:
			case STATE:
			case AVAILABILITY:
			case CREDENTIAL:
			case ENDPOINT:
			case EVENT:
			case NOTIFICATION:
			case LINKED:
			case AUDIT:
			case DDL:
			case XML:
			case IMPERSONATE:
			case SECURABLES:
			case AUTHENTICATE:
			case EXTERNAL:
			case ACCESS:
			case ADMINISTER:
			case BULK:
			case OPERATIONS:
			case UNSAFE:
			case SHUTDOWN:
			case SCOPED:
			case CONFIGURATION:
			case DATASPACE:
			case SERVICE:
			case CERTIFICATE:
			case CONTRACT:
			case ENCRYPTION:
			case MASTER:
			case DATA:
			case SOURCE:
			case FILE:
			case FORMAT:
			case LIBRARY:
			case FULLTEXT:
			case MASK:
			case UNMASK:
			case MESSAGE:
			case REMOTE:
			case BINDING:
			case ROUTE:
			case SECURITY:
			case POLICY:
			case AGGREGATE:
			case QUEUE:
			case RULE:
			case SYNONYM:
			case COLLECTION:
			case SCRIPT:
			case KILL:
			case BACKUP:
			case LOG:
			case SHOWPLAN:
			case SUBSCRIBE:
			case QUERY:
			case NOTIFICATIONS:
			case CHECKPOINT:
			case SEQUENCE:
			case ABORT_AFTER_WAIT:
			case ALLOW_PAGE_LOCKS:
			case ALLOW_ROW_LOCKS:
			case ALL_SPARSE_COLUMNS:
			case BUCKET_COUNT:
			case COLUMNSTORE_ARCHIVE:
			case COLUMN_ENCRYPTION_KEY:
			case COLUMN_SET:
			case COMPRESSION_DELAY:
			case DATABASE_DEAULT:
			case DATA_COMPRESSION:
			case DATA_CONSISTENCY_CHECK:
			case ENCRYPTION_TYPE:
			case SYSTEM_TIME:
			case SYSTEM_VERSIONING:
			case TEXTIMAGE_ON:
			case WAIT_AT_LOW_PRIORITY:
			case STATISTICS_INCREMENTAL:
			case STATISTICS_NORECOMPUTE:
			case ROUND_ROBIN:
			case SCHEMA_AND_DATA:
			case SCHEMA_ONLY:
			case SORT_IN_TEMPDB:
			case IGNORE_DUP_KEY:
			case IMPLICIT_TRANSACTIONS:
			case MAX_DURATION:
			case MEMORY_OPTIMIZED:
			case MIGRATION_STATE:
			case PAD_INDEX:
			case REMOTE_DATA_ARCHIVE:
			case FILESTREAM_ON:
			case FILETABLE_COLLATE_FILENAME:
			case FILETABLE_DIRECTORY:
			case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
			case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
			case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
			case FILTER_PREDICATE:
			case HISTORY_RETENTION_PERIOD:
			case HISTORY_TABLE:
			case LOCK_ESCALATION:
			case DROP_EXISTING:
			case ROW_NUMBER:
			case FIRST:
			case DATETIME2:
			case OUTPUT:
			case INSERTED:
			case DELETED:
			case IDENTIFIER_:
				{
				setState(1599);
				indexName();
				}
				break;
			case ALL:
				{
				setState(1600);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1603);
			match(ON);
			setState(1604);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(DROP);
			setState(1607);
			match(TABLE);
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1608);
				ifExist();
				}
			}

			setState(1611);
			tableNames();
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(DROP);
			setState(1614);
			match(INDEX);
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1615);
				ifExist();
				}
			}

			setState(1618);
			indexName();
			setState(1619);
			match(ON);
			setState(1620);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SQLServerStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(TRUNCATE);
			setState(1623);
			match(TABLE);
			setState(1624);
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

	public static class FileTableClauseContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode FILETABLE() { return getToken(SQLServerStatementParser.FILETABLE, 0); }
		public FileTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTableClauseContext fileTableClause() throws RecognitionException {
		FileTableClauseContext _localctx = new FileTableClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_fileTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1626);
				match(AS);
				setState(1627);
				match(FILETABLE);
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

	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public CreateTableDefinitionsContext createTableDefinitions() {
			return getRuleContext(CreateTableDefinitionsContext.class,0);
		}
		public PartitionSchemeContext partitionScheme() {
			return getRuleContext(PartitionSchemeContext.class,0);
		}
		public FileGroupContext fileGroup() {
			return getRuleContext(FileGroupContext.class,0);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_createDefinitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			createTableDefinitions();
			setState(1631);
			partitionScheme();
			setState(1632);
			fileGroup();
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

	public static class CreateTableDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<CreateTableDefinitionContext> createTableDefinition() {
			return getRuleContexts(CreateTableDefinitionContext.class);
		}
		public CreateTableDefinitionContext createTableDefinition(int i) {
			return getRuleContext(CreateTableDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public CreateTableDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTableDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableDefinitionsContext createTableDefinitions() throws RecognitionException {
		CreateTableDefinitionsContext _localctx = new CreateTableDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_createTableDefinitions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(LP_);
			setState(1635);
			createTableDefinition();
			setState(1640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1636);
					match(COMMA_);
					setState(1637);
					createTableDefinition();
					}
					} 
				}
				setState(1642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1643);
				match(COMMA_);
				setState(1644);
				periodClause();
				}
			}

			setState(1647);
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

	public static class CreateTableDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableIndexContext tableIndex() {
			return getRuleContext(TableIndexContext.class,0);
		}
		public CreateTableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableDefinitionContext createTableDefinition() throws RecognitionException {
		CreateTableDefinitionContext _localctx = new CreateTableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_createTableDefinition);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1652);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1653);
				tableIndex();
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
		public ColumnConstraintsContext columnConstraints() {
			return getRuleContext(ColumnConstraintsContext.class,0);
		}
		public List<ColumnDefinitionOptionContext> columnDefinitionOption() {
			return getRuleContexts(ColumnDefinitionOptionContext.class);
		}
		public ColumnDefinitionOptionContext columnDefinitionOption(int i) {
			return getRuleContext(ColumnDefinitionOptionContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_columnDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			columnName();
			setState(1657);
			dataType();
			setState(1661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1658);
					columnDefinitionOption();
					}
					} 
				}
				setState(1663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(1664);
			columnConstraints();
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(1665);
				columnIndex();
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

	public static class ColumnDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode FILESTREAM() { return getToken(SQLServerStatementParser.FILESTREAM, 0); }
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public TerminalNode MASKED() { return getToken(SQLServerStatementParser.MASKED, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(SQLServerStatementParser.IDENTITY, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(SQLServerStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(SQLServerStatementParser.NUMBER_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode ROWGUIDCOL() { return getToken(SQLServerStatementParser.ROWGUIDCOL, 0); }
		public TerminalNode ENCRYPTED() { return getToken(SQLServerStatementParser.ENCRYPTED, 0); }
		public EncryptedOptionsContext encryptedOptions() {
			return getRuleContext(EncryptedOptionsContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public ColumnDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinitionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnDefinitionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionOptionContext columnDefinitionOption() throws RecognitionException {
		ColumnDefinitionOptionContext _localctx = new ColumnDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_columnDefinitionOption);
		int _la;
		try {
			int _alt;
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				match(FILESTREAM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				match(COLLATE);
				setState(1670);
				collationName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1671);
				match(SPARSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1672);
				match(MASKED);
				setState(1673);
				match(WITH);
				setState(1674);
				match(LP_);
				setState(1675);
				match(FUNCTION);
				setState(1676);
				match(EQ_);
				setState(1677);
				match(STRING_);
				setState(1678);
				match(RP_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(1679);
					match(CONSTRAINT);
					setState(1680);
					ignoredIdentifier();
					}
				}

				setState(1683);
				match(DEFAULT);
				setState(1684);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1685);
				match(IDENTITY);
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1686);
					match(LP_);
					setState(1687);
					match(NUMBER_);
					setState(1688);
					match(COMMA_);
					setState(1689);
					match(NUMBER_);
					setState(1690);
					match(RP_);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1693);
				match(NOT);
				setState(1694);
				match(FOR);
				setState(1695);
				match(REPLICATION);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1696);
				match(GENERATED);
				setState(1697);
				match(ALWAYS);
				setState(1698);
				match(AS);
				setState(1699);
				match(ROW);
				setState(1700);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIDDEN_) {
					{
					setState(1701);
					match(HIDDEN_);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1704);
					match(NOT);
					}
				}

				setState(1707);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1708);
				match(ROWGUIDCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1709);
				match(ENCRYPTED);
				setState(1710);
				match(WITH);
				setState(1711);
				encryptedOptions();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1712);
				columnConstraint();
				setState(1717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1713);
						match(COMMA_);
						setState(1714);
						columnConstraint();
						}
						} 
					}
					setState(1719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1720);
				columnIndex();
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

	public static class EncryptedOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode COLUMN_ENCRYPTION_KEY() { return getToken(SQLServerStatementParser.COLUMN_ENCRYPTION_KEY, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode ENCRYPTION_TYPE() { return getToken(SQLServerStatementParser.ENCRYPTION_TYPE, 0); }
		public TerminalNode ALGORITHM() { return getToken(SQLServerStatementParser.ALGORITHM, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SQLServerStatementParser.DETERMINISTIC, 0); }
		public TerminalNode RANDOMIZED() { return getToken(SQLServerStatementParser.RANDOMIZED, 0); }
		public EncryptedOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptedOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEncryptedOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncryptedOptionsContext encryptedOptions() throws RecognitionException {
		EncryptedOptionsContext _localctx = new EncryptedOptionsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_encryptedOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(LP_);
			setState(1724);
			match(COLUMN_ENCRYPTION_KEY);
			setState(1725);
			match(EQ_);
			setState(1726);
			ignoredIdentifier();
			setState(1727);
			match(COMMA_);
			setState(1728);
			match(ENCRYPTION_TYPE);
			setState(1729);
			match(EQ_);
			setState(1730);
			_la = _input.LA(1);
			if ( !(_la==DETERMINISTIC || _la==RANDOMIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1731);
			match(COMMA_);
			setState(1732);
			match(ALGORITHM);
			setState(1733);
			match(EQ_);
			setState(1734);
			match(STRING_);
			setState(1735);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public PrimaryKeyConstraintContext primaryKeyConstraint() {
			return getRuleContext(PrimaryKeyConstraintContext.class,0);
		}
		public ColumnForeignKeyConstraintContext columnForeignKeyConstraint() {
			return getRuleContext(ColumnForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1737);
				match(CONSTRAINT);
				setState(1738);
				ignoredIdentifier();
				}
			}

			setState(1744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1741);
				primaryKeyConstraint();
				}
				break;
			case FOREIGN:
			case REFERENCES:
				{
				setState(1742);
				columnForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1743);
				checkConstraint();
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

	public static class PrimaryKeyConstraintContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() {
			return getRuleContext(DiskTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() {
			return getRuleContext(MemoryTablePrimaryKeyConstraintOptionContext.class,0);
		}
		public PrimaryKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyConstraintContext primaryKeyConstraint() throws RecognitionException {
		PrimaryKeyConstraintContext _localctx = new PrimaryKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_primaryKeyConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				{
				setState(1746);
				primaryKey();
				}
				break;
			case UNIQUE:
				{
				setState(1747);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1750);
				diskTablePrimaryKeyConstraintOption();
				}
				break;
			case 2:
				{
				setState(1751);
				memoryTablePrimaryKeyConstraintOption();
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

	public static class DiskTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public ClusterOptionContext clusterOption() {
			return getRuleContext(ClusterOptionContext.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryKeyConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDiskTablePrimaryKeyConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiskTablePrimaryKeyConstraintOptionContext diskTablePrimaryKeyConstraintOption() throws RecognitionException {
		DiskTablePrimaryKeyConstraintOptionContext _localctx = new DiskTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_diskTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1754);
				clusterOption();
				}
			}

			setState(1758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1757);
				primaryKeyWithClause();
				}
			}

			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1760);
				primaryKeyOnClause();
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

	public static class ClusterOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ClusterOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClusterOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterOptionContext clusterOption() throws RecognitionException {
		ClusterOptionContext _localctx = new ClusterOptionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_clusterOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
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

	public static class PrimaryKeyWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode FILLFACTOR() { return getToken(SQLServerStatementParser.FILLFACTOR, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public PrimaryKeyWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyWithClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyWithClauseContext primaryKeyWithClause() throws RecognitionException {
		PrimaryKeyWithClauseContext _localctx = new PrimaryKeyWithClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_primaryKeyWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			match(WITH);
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLFACTOR:
				{
				setState(1766);
				match(FILLFACTOR);
				setState(1767);
				match(EQ_);
				setState(1768);
				match(NUMBER_);
				}
				break;
			case LP_:
				{
				setState(1769);
				match(LP_);
				setState(1770);
				indexOption();
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1771);
					match(COMMA_);
					setState(1772);
					indexOption();
					}
					}
					setState(1777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1778);
				match(RP_);
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

	public static class PrimaryKeyOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnStringContext onString() {
			return getRuleContext(OnStringContext.class,0);
		}
		public PrimaryKeyOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOnClauseContext primaryKeyOnClause() throws RecognitionException {
		PrimaryKeyOnClauseContext _localctx = new PrimaryKeyOnClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_primaryKeyOnClause);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1784);
				onString();
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

	public static class OnSchemaColumnContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public OnSchemaColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSchemaColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnSchemaColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSchemaColumnContext onSchemaColumn() throws RecognitionException {
		OnSchemaColumnContext _localctx = new OnSchemaColumnContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_onSchemaColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(ON);
			setState(1788);
			schemaName();
			setState(1789);
			match(LP_);
			setState(1790);
			columnName();
			setState(1791);
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

	public static class OnFileGroupContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public OnFileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFileGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnFileGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnFileGroupContext onFileGroup() throws RecognitionException {
		OnFileGroupContext _localctx = new OnFileGroupContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_onFileGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			match(ON);
			setState(1794);
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

	public static class OnStringContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public OnStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnStringContext onString() throws RecognitionException {
		OnStringContext _localctx = new OnStringContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_onString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(ON);
			setState(1797);
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

	public static class MemoryTablePrimaryKeyConstraintOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public MemoryTablePrimaryKeyConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryKeyConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMemoryTablePrimaryKeyConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryTablePrimaryKeyConstraintOptionContext memoryTablePrimaryKeyConstraintOption() throws RecognitionException {
		MemoryTablePrimaryKeyConstraintOptionContext _localctx = new MemoryTablePrimaryKeyConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_memoryTablePrimaryKeyConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(CLUSTERED);
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1800);
				withBucket();
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

	public static class WithBucketContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode BUCKET_COUNT() { return getToken(SQLServerStatementParser.BUCKET_COUNT, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public WithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBucket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWithBucket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithBucketContext withBucket() throws RecognitionException {
		WithBucketContext _localctx = new WithBucketContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_withBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(WITH);
			setState(1804);
			match(LP_);
			setState(1805);
			match(BUCKET_COUNT);
			setState(1806);
			match(EQ_);
			setState(1807);
			match(NUMBER_);
			setState(1808);
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

	public static class ColumnForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnForeignKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnForeignKeyConstraintContext columnForeignKeyConstraint() throws RecognitionException {
		ColumnForeignKeyConstraintContext _localctx = new ColumnForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_columnForeignKeyConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1810);
				match(FOREIGN);
				setState(1811);
				match(KEY);
				}
			}

			setState(1814);
			match(REFERENCES);
			setState(1815);
			tableName();
			setState(1816);
			match(LP_);
			setState(1817);
			columnName();
			setState(1818);
			match(RP_);
			setState(1822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1819);
					foreignKeyOnAction();
					}
					} 
				}
				setState(1824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitForeignKeyOnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_foreignKeyOnAction);
		int _la;
		try {
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				match(ON);
				setState(1826);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1827);
				foreignKeyOn();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1828);
				match(NOT);
				setState(1829);
				match(FOR);
				setState(1830);
				match(REPLICATION);
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(SQLServerStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(SQLServerStatementParser.ACTION, 0); }
		public TerminalNode CASCADE() { return getToken(SQLServerStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitForeignKeyOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_foreignKeyOn);
		int _la;
		try {
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				match(NO);
				setState(1834);
				match(ACTION);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				match(SET);
				setState(1837);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class CheckConstraintContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public CheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintContext checkConstraint() throws RecognitionException {
		CheckConstraintContext _localctx = new CheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_checkConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(CHECK);
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1841);
				match(NOT);
				setState(1842);
				match(FOR);
				setState(1843);
				match(REPLICATION);
				}
			}

			setState(1846);
			match(LP_);
			setState(1847);
			expr(0);
			setState(1848);
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

	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ClusterOptionContext clusterOption() {
			return getRuleContext(ClusterOptionContext.class,0);
		}
		public WithIndexOptionContext withIndexOption() {
			return getRuleContext(WithIndexOptionContext.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOnContext fileStreamOn() {
			return getRuleContext(FileStreamOnContext.class,0);
		}
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_columnIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(INDEX);
			setState(1851);
			indexName();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1852);
				clusterOption();
				}
			}

			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1855);
				withIndexOption();
				}
			}

			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1858);
				indexOnClause();
				}
			}

			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1861);
				fileStreamOn();
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

	public static class WithIndexOptionContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public WithIndexOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withIndexOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitWithIndexOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithIndexOptionContext withIndexOption() throws RecognitionException {
		WithIndexOptionContext _localctx = new WithIndexOptionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_withIndexOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			match(WITH);
			setState(1865);
			match(LP_);
			setState(1866);
			indexOption();
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1867);
				match(COMMA_);
				setState(1868);
				indexOption();
				}
				}
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1874);
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

	public static class IndexOnClauseContext extends ParserRuleContext {
		public OnSchemaColumnContext onSchemaColumn() {
			return getRuleContext(OnSchemaColumnContext.class,0);
		}
		public OnFileGroupContext onFileGroup() {
			return getRuleContext(OnFileGroupContext.class,0);
		}
		public OnDefaultContext onDefault() {
			return getRuleContext(OnDefaultContext.class,0);
		}
		public IndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOnClauseContext indexOnClause() throws RecognitionException {
		IndexOnClauseContext _localctx = new IndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_indexOnClause);
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1876);
				onSchemaColumn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				onFileGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				onDefault();
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

	public static class OnDefaultContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public OnDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDefaultContext onDefault() throws RecognitionException {
		OnDefaultContext _localctx = new OnDefaultContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_onDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			match(ON);
			setState(1882);
			match(DEFAULT);
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

	public static class FileStreamOnContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public FileStreamOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileStreamOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileStreamOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileStreamOnContext fileStreamOn() throws RecognitionException {
		FileStreamOnContext _localctx = new FileStreamOnContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_fileStreamOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(FILESTREAM_ON);
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1885);
				ignoredIdentifier();
				}
				break;
			case 2:
				{
				setState(1886);
				schemaName();
				}
				break;
			case 3:
				{
				setState(1887);
				match(STRING_);
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

	public static class ColumnConstraintsContext extends ParserRuleContext {
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ColumnConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraints; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintsContext columnConstraints() throws RecognitionException {
		ColumnConstraintsContext _localctx = new ColumnConstraintsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_columnConstraints);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1890);
				columnConstraint();
				setState(1895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1891);
						match(COMMA_);
						setState(1892);
						columnConstraint();
						}
						} 
					}
					setState(1897);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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

	public static class ComputedColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PERSISTED() { return getToken(SQLServerStatementParser.PERSISTED, 0); }
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public ComputedColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedColumnDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitComputedColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedColumnDefinitionContext computedColumnDefinition() throws RecognitionException {
		ComputedColumnDefinitionContext _localctx = new ComputedColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_computedColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			columnName();
			setState(1901);
			match(AS);
			setState(1902);
			expr(0);
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERSISTED) {
				{
				setState(1903);
				match(PERSISTED);
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1904);
					match(NOT);
					setState(1905);
					match(NULL);
					}
				}

				}
			}

			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (CONSTRAINT - 61)) | (1L << (PRIMARY - 61)) | (1L << (UNIQUE - 61)) | (1L << (FOREIGN - 61)) | (1L << (KEY - 61)))) != 0) || _la==CHECK || _la==REFERENCES) {
				{
				setState(1910);
				columnConstraint();
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

	public static class ColumnSetDefinitionContext extends ParserRuleContext {
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public TerminalNode COLUMN_SET() { return getToken(SQLServerStatementParser.COLUMN_SET, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode ALL_SPARSE_COLUMNS() { return getToken(SQLServerStatementParser.ALL_SPARSE_COLUMNS, 0); }
		public ColumnSetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSetDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitColumnSetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnSetDefinitionContext columnSetDefinition() throws RecognitionException {
		ColumnSetDefinitionContext _localctx = new ColumnSetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_columnSetDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			ignoredIdentifier();
			setState(1914);
			match(IDENTIFIER_);
			setState(1915);
			match(COLUMN_SET);
			setState(1916);
			match(FOR);
			setState(1917);
			match(ALL_SPARSE_COLUMNS);
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TablePrimaryConstraintContext tablePrimaryConstraint() {
			return getRuleContext(TablePrimaryConstraintContext.class,0);
		}
		public TableForeignKeyConstraintContext tableForeignKeyConstraint() {
			return getRuleContext(TableForeignKeyConstraintContext.class,0);
		}
		public CheckConstraintContext checkConstraint() {
			return getRuleContext(CheckConstraintContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1919);
				match(CONSTRAINT);
				setState(1920);
				ignoredIdentifier();
				}
			}

			setState(1926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case UNIQUE:
			case KEY:
				{
				setState(1923);
				tablePrimaryConstraint();
				}
				break;
			case LP_:
			case FOREIGN:
				{
				setState(1924);
				tableForeignKeyConstraint();
				}
				break;
			case CHECK:
				{
				setState(1925);
				checkConstraint();
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

	public static class TablePrimaryConstraintContext extends ParserRuleContext {
		public PrimaryKeyUniqueContext primaryKeyUnique() {
			return getRuleContext(PrimaryKeyUniqueContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() {
			return getRuleContext(DiskTablePrimaryConstraintOptionContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() {
			return getRuleContext(MemoryTablePrimaryConstraintOptionContext.class,0);
		}
		public TablePrimaryConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrimaryConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTablePrimaryConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePrimaryConstraintContext tablePrimaryConstraint() throws RecognitionException {
		TablePrimaryConstraintContext _localctx = new TablePrimaryConstraintContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_tablePrimaryConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			primaryKeyUnique();
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1929);
				diskTablePrimaryConstraintOption();
				}
				break;
			case 2:
				{
				setState(1930);
				memoryTablePrimaryConstraintOption();
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

	public static class PrimaryKeyUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public PrimaryKeyUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyUnique; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrimaryKeyUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyUniqueContext primaryKeyUnique() throws RecognitionException {
		PrimaryKeyUniqueContext _localctx = new PrimaryKeyUniqueContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_primaryKeyUnique);
		try {
			setState(1935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1933);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				match(UNIQUE);
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

	public static class DiskTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOptionContext clusterOption() {
			return getRuleContext(ClusterOptionContext.class,0);
		}
		public PrimaryKeyWithClauseContext primaryKeyWithClause() {
			return getRuleContext(PrimaryKeyWithClauseContext.class,0);
		}
		public PrimaryKeyOnClauseContext primaryKeyOnClause() {
			return getRuleContext(PrimaryKeyOnClauseContext.class,0);
		}
		public DiskTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskTablePrimaryConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDiskTablePrimaryConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiskTablePrimaryConstraintOptionContext diskTablePrimaryConstraintOption() throws RecognitionException {
		DiskTablePrimaryConstraintOptionContext _localctx = new DiskTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_diskTablePrimaryConstraintOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(1937);
				clusterOption();
				}
			}

			setState(1940);
			columnNames();
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1941);
				primaryKeyWithClause();
				}
			}

			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1944);
				primaryKeyOnClause();
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

	public static class MemoryTablePrimaryConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public MemoryTablePrimaryConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryTablePrimaryConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMemoryTablePrimaryConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryTablePrimaryConstraintOptionContext memoryTablePrimaryConstraintOption() throws RecognitionException {
		MemoryTablePrimaryConstraintOptionContext _localctx = new MemoryTablePrimaryConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_memoryTablePrimaryConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(NONCLUSTERED);
			setState(1950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1948);
				columnNames();
				}
				break;
			case HASH:
				{
				setState(1949);
				hashWithBucket();
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

	public static class HashWithBucketContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public WithBucketContext withBucket() {
			return getRuleContext(WithBucketContext.class,0);
		}
		public HashWithBucketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashWithBucket; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHashWithBucket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashWithBucketContext hashWithBucket() throws RecognitionException {
		HashWithBucketContext _localctx = new HashWithBucketContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_hashWithBucket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(HASH);
			setState(1953);
			columnNames();
			setState(1954);
			withBucket();
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

	public static class TableForeignKeyConstraintContext extends ParserRuleContext {
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SQLServerStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableForeignKeyConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableForeignKeyConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableForeignKeyConstraintContext tableForeignKeyConstraint() throws RecognitionException {
		TableForeignKeyConstraintContext _localctx = new TableForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tableForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(1956);
				match(FOREIGN);
				setState(1957);
				match(KEY);
				}
			}

			setState(1960);
			columnNames();
			setState(1961);
			match(REFERENCES);
			setState(1962);
			tableName();
			setState(1963);
			columnNames();
			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON || _la==NOT) {
				{
				{
				setState(1964);
				foreignKeyOnAction();
				}
				}
				setState(1969);
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

	public static class TableIndexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexNameOptionContext indexNameOption() {
			return getRuleContext(IndexNameOptionContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public IndexOptionsContext indexOptions() {
			return getRuleContext(IndexOptionsContext.class,0);
		}
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public FileStreamOnContext fileStreamOn() {
			return getRuleContext(FileStreamOnContext.class,0);
		}
		public TableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIndexContext tableIndex() throws RecognitionException {
		TableIndexContext _localctx = new TableIndexContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_tableIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			match(INDEX);
			setState(1971);
			indexName();
			setState(1972);
			indexNameOption();
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1973);
				match(WITH);
				setState(1974);
				indexOptions();
				}
			}

			setState(1978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1977);
				indexOnClause();
				}
			}

			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON) {
				{
				setState(1980);
				fileStreamOn();
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

	public static class IndexNameOptionContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ClusterOptionContext clusterOption() {
			return getRuleContext(ClusterOptionContext.class,0);
		}
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public IndexNameOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNameOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexNameOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameOptionContext indexNameOption() throws RecognitionException {
		IndexNameOptionContext _localctx = new IndexNameOptionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_indexNameOption);
		int _la;
		try {
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(1983);
					clusterOption();
					}
				}

				setState(1986);
				columnNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				match(CLUSTERED);
				setState(1988);
				match(COLUMNSTORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED) {
					{
					setState(1989);
					match(NONCLUSTERED);
					}
				}

				setState(1992);
				match(COLUMNSTORE);
				setState(1993);
				columnNames();
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

	public static class IndexOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<IndexOptionContext> indexOption() {
			return getRuleContexts(IndexOptionContext.class);
		}
		public IndexOptionContext indexOption(int i) {
			return getRuleContext(IndexOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public IndexOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexOptionsContext indexOptions() throws RecognitionException {
		IndexOptionsContext _localctx = new IndexOptionsContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_indexOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(LP_);
			setState(1997);
			indexOption();
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1998);
				match(COMMA_);
				setState(1999);
				indexOption();
				}
				}
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2005);
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

	public static class PeriodClauseContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public PeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPeriodClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodClauseContext periodClause() throws RecognitionException {
		PeriodClauseContext _localctx = new PeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_periodClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			match(PERIOD);
			setState(2008);
			match(FOR);
			setState(2009);
			match(SYSTEM_TIME);
			setState(2010);
			match(LP_);
			setState(2011);
			columnName();
			setState(2012);
			match(COMMA_);
			setState(2013);
			columnName();
			setState(2014);
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

	public static class PartitionSchemeContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public PartitionSchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionScheme; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPartitionScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSchemeContext partitionScheme() throws RecognitionException {
		PartitionSchemeContext _localctx = new PartitionSchemeContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_partitionScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2016);
				match(ON);
				setState(2024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(2017);
					schemaName();
					setState(2018);
					match(LP_);
					setState(2019);
					columnName();
					setState(2020);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(2022);
					ignoredIdentifier();
					}
					break;
				case 3:
					{
					setState(2023);
					match(STRING_);
					}
					break;
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

	public static class FileGroupContext extends ParserRuleContext {
		public TerminalNode TEXTIMAGE_ON() { return getToken(SQLServerStatementParser.TEXTIMAGE_ON, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public List<IgnoredIdentifierContext> ignoredIdentifier() {
			return getRuleContexts(IgnoredIdentifierContext.class);
		}
		public IgnoredIdentifierContext ignoredIdentifier(int i) {
			return getRuleContext(IgnoredIdentifierContext.class,i);
		}
		public List<TerminalNode> STRING_() { return getTokens(SQLServerStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(SQLServerStatementParser.STRING_, i);
		}
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public FileGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFileGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileGroupContext fileGroup() throws RecognitionException {
		FileGroupContext _localctx = new FileGroupContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fileGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTIMAGE_ON) {
				{
				setState(2028);
				match(TEXTIMAGE_ON);
				setState(2031);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(2029);
					ignoredIdentifier();
					}
					break;
				case STRING_:
					{
					setState(2030);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILESTREAM_ON || _la==IDENTIFIER_) {
				{
				setState(2040);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILESTREAM_ON:
					{
					setState(2035);
					match(FILESTREAM_ON);
					{
					setState(2036);
					schemaName();
					}
					}
					break;
				case IDENTIFIER_:
					{
					setState(2037);
					ignoredIdentifier();
					setState(2038);
					match(STRING_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2044);
				match(WITH);
				setState(2045);
				tableOptions();
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

	public static class TableOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableOptionContext> tableOption() {
			return getRuleContexts(TableOptionContext.class);
		}
		public TableOptionContext tableOption(int i) {
			return getRuleContext(TableOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(LP_);
			setState(2049);
			tableOption();
			setState(2054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2050);
				match(COMMA_);
				setState(2051);
				tableOption();
				}
				}
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2057);
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

	public static class TableOptionContext extends ParserRuleContext {
		public TerminalNode DATA_COMPRESSION() { return getToken(SQLServerStatementParser.DATA_COMPRESSION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NONE() { return getToken(SQLServerStatementParser.NONE, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode PAGE() { return getToken(SQLServerStatementParser.PAGE, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode PARTITIONS() { return getToken(SQLServerStatementParser.PARTITIONS, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public PartitionExpressionsContext partitionExpressions() {
			return getRuleContext(PartitionExpressionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode FILETABLE_DIRECTORY() { return getToken(SQLServerStatementParser.FILETABLE_DIRECTORY, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode FILETABLE_COLLATE_FILENAME() { return getToken(SQLServerStatementParser.FILETABLE_COLLATE_FILENAME, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DATABASE_DEAULT() { return getToken(SQLServerStatementParser.DATABASE_DEAULT, 0); }
		public TerminalNode FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME() { return getToken(SQLServerStatementParser.FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TerminalNode REMOTE_DATA_ARCHIVE() { return getToken(SQLServerStatementParser.REMOTE_DATA_ARCHIVE, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public MigrationState_Context migrationState_() {
			return getRuleContext(MigrationState_Context.class,0);
		}
		public TableStretchOptionsContext tableStretchOptions() {
			return getRuleContext(TableStretchOptionsContext.class,0);
		}
		public TableOperationOptionContext tableOperationOption() {
			return getRuleContext(TableOperationOptionContext.class,0);
		}
		public DistributionOptionContext distributionOption() {
			return getRuleContext(DistributionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext dataWareHouseTableOption() {
			return getRuleContext(DataWareHouseTableOptionContext.class,0);
		}
		public TableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOptionContext tableOption() throws RecognitionException {
		TableOptionContext _localctx = new TableOptionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_tableOption);
		int _la;
		try {
			setState(2107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				match(DATA_COMPRESSION);
				setState(2060);
				match(EQ_);
				setState(2061);
				_la = _input.LA(1);
				if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ROW - 194)) | (1L << (NONE - 194)) | (1L << (PAGE - 194)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2062);
					match(ON);
					setState(2063);
					match(PARTITIONS);
					setState(2064);
					match(LP_);
					setState(2065);
					partitionExpressions();
					setState(2066);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2070);
				match(FILETABLE_DIRECTORY);
				setState(2071);
				match(EQ_);
				setState(2072);
				ignoredIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2073);
				match(FILETABLE_COLLATE_FILENAME);
				setState(2074);
				match(EQ_);
				setState(2077);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
				case STRING_:
					{
					setState(2075);
					collationName();
					}
					break;
				case DATABASE_DEAULT:
					{
					setState(2076);
					match(DATABASE_DEAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2079);
				match(FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME);
				setState(2080);
				match(EQ_);
				setState(2081);
				ignoredIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2082);
				match(FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME);
				setState(2083);
				match(EQ_);
				setState(2084);
				ignoredIdentifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2085);
				match(FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME);
				setState(2086);
				match(EQ_);
				setState(2087);
				ignoredIdentifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2088);
				match(SYSTEM_VERSIONING);
				setState(2089);
				match(EQ_);
				setState(2090);
				match(ON);
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2091);
					onHistoryTableClause();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2094);
				match(REMOTE_DATA_ARCHIVE);
				setState(2095);
				match(EQ_);
				setState(2102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(2096);
					match(ON);
					setState(2098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP_) {
						{
						setState(2097);
						tableStretchOptions();
						}
					}

					}
					break;
				case OFF:
					{
					setState(2100);
					match(OFF);
					setState(2101);
					migrationState_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2104);
				tableOperationOption();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2105);
				distributionOption();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2106);
				dataWareHouseTableOption();
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

	public static class TableStretchOptionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<TableStretchOptionsContext> tableStretchOptions() {
			return getRuleContexts(TableStretchOptionsContext.class);
		}
		public TableStretchOptionsContext tableStretchOptions(int i) {
			return getRuleContext(TableStretchOptionsContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TableStretchOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableStretchOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStretchOptionsContext tableStretchOptions() throws RecognitionException {
		TableStretchOptionsContext _localctx = new TableStretchOptionsContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_tableStretchOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			match(LP_);
			setState(2110);
			tableStretchOptions();
			setState(2115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2111);
				match(COMMA_);
				setState(2112);
				tableStretchOptions();
				}
				}
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2118);
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

	public static class TableStretchOptionContext extends ParserRuleContext {
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TerminalNode OUTBOUND() { return getToken(SQLServerStatementParser.OUTBOUND, 0); }
		public TerminalNode INBOUND() { return getToken(SQLServerStatementParser.INBOUND, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode FILTER_PREDICATE() { return getToken(SQLServerStatementParser.FILTER_PREDICATE, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TableStretchOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStretchOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableStretchOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStretchOptionContext tableStretchOption() throws RecognitionException {
		TableStretchOptionContext _localctx = new TableStretchOptionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_tableStretchOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_PREDICATE) {
				{
				setState(2120);
				match(FILTER_PREDICATE);
				setState(2121);
				match(EQ_);
				setState(2124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NULL:
					{
					setState(2122);
					match(NULL);
					}
					break;
				case TRUNCATE:
				case FUNCTION:
				case TRIGGER:
				case CAST:
				case IF:
				case LIMIT:
				case OFFSET:
				case SAVEPOINT:
				case BOOLEAN:
				case CHAR:
				case ARRAY:
				case INTERVAL:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case QUARTER:
				case WEEK:
				case MICROSECOND:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case ENABLE:
				case DISABLE:
				case INSTANCE:
				case DO:
				case DEFINER:
				case SQL:
				case CASCADED:
				case LOCAL:
				case NEXT:
				case NAME:
				case INTEGER:
				case TYPE:
				case BINARY:
				case HIDDEN_:
				case MOD:
				case PARTITION:
				case PARTITIONS:
				case TOP:
				case ROW:
				case XOR:
				case ALWAYS:
				case ROLE:
				case START:
				case ALGORITHM:
				case AUTO:
				case BLOCKERS:
				case CLUSTERED:
				case NONCLUSTERED:
				case COLUMNSTORE:
				case CONTENT:
				case DATABASE:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case MINUTES:
				case DENY:
				case DETERMINISTIC:
				case DISTRIBUTION:
				case DOCUMENT:
				case DURABILITY:
				case ENCRYPTED:
				case FILESTREAM:
				case FILETABLE:
				case FILLFACTOR:
				case FOLLOWING:
				case HASH:
				case HEAP:
				case INBOUND:
				case OUTBOUND:
				case UNBOUNDED:
				case INFINITE:
				case LOGIN:
				case MASKED:
				case MAXDOP:
				case MOVE:
				case NOCHECK:
				case OBJECT:
				case OFF:
				case ONLINE:
				case OVER:
				case PAGE:
				case PAUSED:
				case PERIOD:
				case PERSISTED:
				case PRECEDING:
				case RANDOMIZED:
				case RANGE:
				case REBUILD:
				case REPLICATE:
				case REPLICATION:
				case RESUMABLE:
				case ROWGUIDCOL:
				case SAVE:
				case SELF:
				case SPARSE:
				case SWITCH:
				case TRAN:
				case TRANCOUNT:
				case CONTROL:
				case TAKE:
				case OWNERSHIP:
				case DEFINITION:
				case APPLICATION:
				case ASSEMBLY:
				case SYMMETRIC:
				case ASYMMETRIC:
				case SERVER:
				case RECEIVE:
				case CHANGE:
				case TRACE:
				case TRACKING:
				case RESOURCES:
				case SETTINGS:
				case STATE:
				case AVAILABILITY:
				case CREDENTIAL:
				case ENDPOINT:
				case EVENT:
				case NOTIFICATION:
				case LINKED:
				case AUDIT:
				case DDL:
				case XML:
				case IMPERSONATE:
				case SECURABLES:
				case AUTHENTICATE:
				case EXTERNAL:
				case ACCESS:
				case ADMINISTER:
				case BULK:
				case OPERATIONS:
				case UNSAFE:
				case SHUTDOWN:
				case SCOPED:
				case CONFIGURATION:
				case DATASPACE:
				case SERVICE:
				case CERTIFICATE:
				case CONTRACT:
				case ENCRYPTION:
				case MASTER:
				case DATA:
				case SOURCE:
				case FILE:
				case FORMAT:
				case LIBRARY:
				case FULLTEXT:
				case MASK:
				case UNMASK:
				case MESSAGE:
				case REMOTE:
				case BINDING:
				case ROUTE:
				case SECURITY:
				case POLICY:
				case AGGREGATE:
				case QUEUE:
				case RULE:
				case SYNONYM:
				case COLLECTION:
				case SCRIPT:
				case KILL:
				case BACKUP:
				case LOG:
				case SHOWPLAN:
				case SUBSCRIBE:
				case QUERY:
				case NOTIFICATIONS:
				case CHECKPOINT:
				case SEQUENCE:
				case ABORT_AFTER_WAIT:
				case ALLOW_PAGE_LOCKS:
				case ALLOW_ROW_LOCKS:
				case ALL_SPARSE_COLUMNS:
				case BUCKET_COUNT:
				case COLUMNSTORE_ARCHIVE:
				case COLUMN_ENCRYPTION_KEY:
				case COLUMN_SET:
				case COMPRESSION_DELAY:
				case DATABASE_DEAULT:
				case DATA_COMPRESSION:
				case DATA_CONSISTENCY_CHECK:
				case ENCRYPTION_TYPE:
				case SYSTEM_TIME:
				case SYSTEM_VERSIONING:
				case TEXTIMAGE_ON:
				case WAIT_AT_LOW_PRIORITY:
				case STATISTICS_INCREMENTAL:
				case STATISTICS_NORECOMPUTE:
				case ROUND_ROBIN:
				case SCHEMA_AND_DATA:
				case SCHEMA_ONLY:
				case SORT_IN_TEMPDB:
				case IGNORE_DUP_KEY:
				case IMPLICIT_TRANSACTIONS:
				case MAX_DURATION:
				case MEMORY_OPTIMIZED:
				case MIGRATION_STATE:
				case PAD_INDEX:
				case REMOTE_DATA_ARCHIVE:
				case FILESTREAM_ON:
				case FILETABLE_COLLATE_FILENAME:
				case FILETABLE_DIRECTORY:
				case FILETABLE_FULLPATH_UNIQUE_CONSTRAINT_NAME:
				case FILETABLE_PRIMARY_KEY_CONSTRAINT_NAME:
				case FILETABLE_STREAMID_UNIQUE_CONSTRAINT_NAME:
				case FILTER_PREDICATE:
				case HISTORY_RETENTION_PERIOD:
				case HISTORY_TABLE:
				case LOCK_ESCALATION:
				case DROP_EXISTING:
				case ROW_NUMBER:
				case FIRST:
				case DATETIME2:
				case OUTPUT:
				case INSERTED:
				case DELETED:
				case IDENTIFIER_:
					{
					setState(2123);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2126);
				match(COMMA_);
				}
			}

			setState(2129);
			match(MIGRATION_STATE);
			setState(2130);
			match(EQ_);
			setState(2131);
			_la = _input.LA(1);
			if ( !(((((_la - 240)) & ~0x3f) == 0 && ((1L << (_la - 240)) & ((1L << (INBOUND - 240)) | (1L << (OUTBOUND - 240)) | (1L << (PAUSED - 240)))) != 0)) ) {
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

	public static class MigrationState_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode MIGRATION_STATE() { return getToken(SQLServerStatementParser.MIGRATION_STATE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode PAUSED() { return getToken(SQLServerStatementParser.PAUSED, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public MigrationState_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_migrationState_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitMigrationState_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MigrationState_Context migrationState_() throws RecognitionException {
		MigrationState_Context _localctx = new MigrationState_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_migrationState_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			match(LP_);
			setState(2134);
			match(MIGRATION_STATE);
			setState(2135);
			match(EQ_);
			setState(2136);
			match(PAUSED);
			setState(2137);
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

	public static class TableOperationOptionContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public TableOperationOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOperationOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitTableOperationOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOperationOptionContext tableOperationOption() throws RecognitionException {
		TableOperationOptionContext _localctx = new TableOperationOptionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tableOperationOption);
		int _la;
		try {
			setState(2151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2139);
				match(MEMORY_OPTIMIZED);
				setState(2140);
				match(EQ_);
				setState(2141);
				match(ON);
				}
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2142);
				match(DURABILITY);
				setState(2143);
				match(EQ_);
				setState(2144);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2145);
				match(SYSTEM_VERSIONING);
				setState(2146);
				match(EQ_);
				setState(2147);
				match(ON);
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2148);
					onHistoryTableClause();
					}
				}

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

	public static class DistributionOptionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(SQLServerStatementParser.DISTRIBUTION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode HASH() { return getToken(SQLServerStatementParser.HASH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode ROUND_ROBIN() { return getToken(SQLServerStatementParser.ROUND_ROBIN, 0); }
		public TerminalNode REPLICATE() { return getToken(SQLServerStatementParser.REPLICATE, 0); }
		public DistributionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDistributionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributionOptionContext distributionOption() throws RecognitionException {
		DistributionOptionContext _localctx = new DistributionOptionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_distributionOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			match(DISTRIBUTION);
			setState(2154);
			match(EQ_);
			setState(2162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2155);
				match(HASH);
				setState(2156);
				match(LP_);
				setState(2157);
				columnName();
				setState(2158);
				match(RP_);
				}
				break;
			case ROUND_ROBIN:
				{
				setState(2160);
				match(ROUND_ROBIN);
				}
				break;
			case REPLICATE:
				{
				setState(2161);
				match(REPLICATE);
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

	public static class DataWareHouseTableOptionContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public TerminalNode HEAP() { return getToken(SQLServerStatementParser.HEAP, 0); }
		public DataWareHousePartitionOptionContext dataWareHousePartitionOption() {
			return getRuleContext(DataWareHousePartitionOptionContext.class,0);
		}
		public DataWareHouseTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHouseTableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataWareHouseTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataWareHouseTableOptionContext dataWareHouseTableOption() throws RecognitionException {
		DataWareHouseTableOptionContext _localctx = new DataWareHouseTableOptionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_dataWareHouseTableOption);
		try {
			setState(2169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLUSTERED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				match(CLUSTERED);
				setState(2165);
				match(COLUMNSTORE);
				setState(2166);
				match(INDEX);
				}
				break;
			case HEAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167);
				match(HEAP);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2168);
				dataWareHousePartitionOption();
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

	public static class DataWareHousePartitionOptionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SQLServerStatementParser.PARTITION, 0); }
		public List<TerminalNode> LP_() { return getTokens(SQLServerStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(SQLServerStatementParser.LP_, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(SQLServerStatementParser.RANGE, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(SQLServerStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(SQLServerStatementParser.RP_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public TerminalNode LEFT() { return getToken(SQLServerStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLServerStatementParser.RIGHT, 0); }
		public DataWareHousePartitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWareHousePartitionOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataWareHousePartitionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataWareHousePartitionOptionContext dataWareHousePartitionOption() throws RecognitionException {
		DataWareHousePartitionOptionContext _localctx = new DataWareHousePartitionOptionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_dataWareHousePartitionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2171);
			match(PARTITION);
			setState(2172);
			match(LP_);
			setState(2173);
			columnName();
			setState(2174);
			match(RANGE);
			setState(2176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(2175);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2178);
			match(FOR);
			setState(2179);
			match(VALUES);
			setState(2180);
			match(LP_);
			setState(2181);
			simpleExpr(0);
			setState(2186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2182);
				match(COMMA_);
				setState(2183);
				simpleExpr(0);
				}
				}
				setState(2188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2189);
			match(RP_);
			setState(2190);
			match(RP_);
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

	public static class CreateIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(SQLServerStatementParser.UNIQUE, 0); }
		public ClusterOptionContext clusterOption() {
			return getRuleContext(ClusterOptionContext.class,0);
		}
		public CreateIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateIndexSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexSpecificationContext createIndexSpecification() throws RecognitionException {
		CreateIndexSpecificationContext _localctx = new CreateIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_createIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(2192);
				match(UNIQUE);
				}
			}

			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(2195);
				clusterOption();
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

	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AlterDropContext alterDrop() {
			return getRuleContext(AlterDropContext.class,0);
		}
		public AlterCheckConstraintContext alterCheckConstraint() {
			return getRuleContext(AlterCheckConstraintContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public AlterSwitchContext alterSwitch() {
			return getRuleContext(AlterSwitchContext.class,0);
		}
		public AlterSetContext alterSet() {
			return getRuleContext(AlterSetContext.class,0);
		}
		public AlterTableOptionContext alterTableOption() {
			return getRuleContext(AlterTableOptionContext.class,0);
		}
		public TerminalNode REBUILD() { return getToken(SQLServerStatementParser.REBUILD, 0); }
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_alterDefinitionClause);
		try {
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2199);
				modifyColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2200);
				alterDrop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2201);
				alterCheckConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2202);
				alterTrigger();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2203);
				alterSwitch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2204);
				alterSet();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2205);
				alterTableOption();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2206);
				match(REBUILD);
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

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SQLServerStatementParser.ADD, 0); }
		public AlterColumnAddOptionsContext alterColumnAddOptions() {
			return getRuleContext(AlterColumnAddOptionsContext.class,0);
		}
		public GeneratedColumnNamesClauseContext generatedColumnNamesClause() {
			return getRuleContext(GeneratedColumnNamesClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2209);
				match(WITH);
				setState(2210);
				_la = _input.LA(1);
				if ( !(_la==CHECK || _la==NOCHECK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2213);
			match(ADD);
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2214);
				alterColumnAddOptions();
				}
				break;
			case 2:
				{
				setState(2215);
				generatedColumnNamesClause();
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public AlterColumnOperationContext alterColumnOperation() {
			return getRuleContext(AlterColumnOperationContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(SQLServerStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode SPARSE() { return getToken(SQLServerStatementParser.SPARSE, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			alterColumnOperation();
			setState(2219);
			dataType();
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(2220);
				match(COLLATE);
				setState(2221);
				collationName();
				}
			}

			setState(2227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(2224);
				match(NULL);
				}
				break;
			case NOT:
				{
				setState(2225);
				match(NOT);
				setState(2226);
				match(NULL);
				}
				break;
			case EOF:
			case COMMA_:
			case SEMI_:
			case SPARSE:
				break;
			default:
				break;
			}
			setState(2230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPARSE) {
				{
				setState(2229);
				match(SPARSE);
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

	public static class AlterColumnOperationContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterColumnOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnOperationContext alterColumnOperation() throws RecognitionException {
		AlterColumnOperationContext _localctx = new AlterColumnOperationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_alterColumnOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			match(ALTER);
			setState(2233);
			match(COLUMN);
			setState(2234);
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

	public static class AlterColumnAddOptionsContext extends ParserRuleContext {
		public List<AlterColumnAddOptionContext> alterColumnAddOption() {
			return getRuleContexts(AlterColumnAddOptionContext.class);
		}
		public AlterColumnAddOptionContext alterColumnAddOption(int i) {
			return getRuleContext(AlterColumnAddOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterColumnAddOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnAddOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnAddOptionsContext alterColumnAddOptions() throws RecognitionException {
		AlterColumnAddOptionsContext _localctx = new AlterColumnAddOptionsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_alterColumnAddOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			alterColumnAddOption();
			setState(2241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2237);
					match(COMMA_);
					setState(2238);
					alterColumnAddOption();
					}
					} 
				}
				setState(2243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
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

	public static class AlterColumnAddOptionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ComputedColumnDefinitionContext computedColumnDefinition() {
			return getRuleContext(ComputedColumnDefinitionContext.class,0);
		}
		public ColumnSetDefinitionContext columnSetDefinition() {
			return getRuleContext(ColumnSetDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public AlterTableTableIndexContext alterTableTableIndex() {
			return getRuleContext(AlterTableTableIndexContext.class,0);
		}
		public ConstraintForColumnContext constraintForColumn() {
			return getRuleContext(ConstraintForColumnContext.class,0);
		}
		public AlterColumnAddOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAddOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterColumnAddOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnAddOptionContext alterColumnAddOption() throws RecognitionException {
		AlterColumnAddOptionContext _localctx = new AlterColumnAddOptionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_alterColumnAddOption);
		try {
			setState(2250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				computedColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2246);
				columnSetDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2247);
				tableConstraint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2248);
				alterTableTableIndex();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2249);
				constraintForColumn();
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

	public static class ConstraintForColumnContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public ConstraintForColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintForColumn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitConstraintForColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintForColumnContext constraintForColumn() throws RecognitionException {
		ConstraintForColumnContext _localctx = new ConstraintForColumnContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_constraintForColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2252);
				match(CONSTRAINT);
				setState(2253);
				ignoredIdentifier();
				}
			}

			setState(2256);
			match(DEFAULT);
			setState(2257);
			simpleExpr(0);
			setState(2258);
			match(FOR);
			setState(2259);
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

	public static class GeneratedColumnNamesClauseContext extends ParserRuleContext {
		public GeneratedColumnNameClauseContext generatedColumnNameClause() {
			return getRuleContext(GeneratedColumnNameClauseContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public PeriodClauseContext periodClause() {
			return getRuleContext(PeriodClauseContext.class,0);
		}
		public GeneratedColumnNamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNamesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnNamesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNamesClauseContext generatedColumnNamesClause() throws RecognitionException {
		GeneratedColumnNamesClauseContext _localctx = new GeneratedColumnNamesClauseContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_generatedColumnNamesClause);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				generatedColumnNameClause();
				setState(2262);
				match(COMMA_);
				setState(2263);
				periodClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265);
				periodClause();
				setState(2266);
				match(COMMA_);
				setState(2267);
				generatedColumnNameClause();
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

	public static class GeneratedColumnNameClauseContext extends ParserRuleContext {
		public List<GeneratedColumnNameContext> generatedColumnName() {
			return getRuleContexts(GeneratedColumnNameContext.class);
		}
		public GeneratedColumnNameContext generatedColumnName(int i) {
			return getRuleContext(GeneratedColumnNameContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode VALUES() { return getToken(SQLServerStatementParser.VALUES, 0); }
		public GeneratedColumnNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnNameClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNameClauseContext generatedColumnNameClause() throws RecognitionException {
		GeneratedColumnNameClauseContext _localctx = new GeneratedColumnNameClauseContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_generatedColumnNameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			generatedColumnName();
			setState(2272);
			match(DEFAULT);
			setState(2273);
			simpleExpr(0);
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2274);
				match(WITH);
				setState(2275);
				match(VALUES);
				}
			}

			setState(2278);
			match(COMMA_);
			setState(2279);
			generatedColumnName();
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

	public static class GeneratedColumnNameContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(SQLServerStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(SQLServerStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(SQLServerStatementParser.AS, 0); }
		public TerminalNode ROW() { return getToken(SQLServerStatementParser.ROW, 0); }
		public TerminalNode HIDDEN_() { return getToken(SQLServerStatementParser.HIDDEN_, 0); }
		public TerminalNode NOT() { return getToken(SQLServerStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLServerStatementParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode START() { return getToken(SQLServerStatementParser.START, 0); }
		public TerminalNode END() { return getToken(SQLServerStatementParser.END, 0); }
		public GeneratedColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedColumnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGeneratedColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratedColumnNameContext generatedColumnName() throws RecognitionException {
		GeneratedColumnNameContext _localctx = new GeneratedColumnNameContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_generatedColumnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			columnName();
			setState(2282);
			dataTypeName();
			setState(2283);
			match(GENERATED);
			setState(2284);
			match(ALWAYS);
			setState(2285);
			match(AS);
			setState(2286);
			match(ROW);
			setState(2288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START || _la==END) {
				{
				setState(2287);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HIDDEN_) {
				{
				setState(2290);
				match(HIDDEN_);
				}
			}

			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2293);
				match(NOT);
				setState(2294);
				match(NULL);
				}
			}

			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2297);
				match(CONSTRAINT);
				setState(2298);
				ignoredIdentifier();
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

	public static class AlterDropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public AlterTableDropConstraintContext alterTableDropConstraint() {
			return getRuleContext(AlterTableDropConstraintContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SQLServerStatementParser.PERIOD, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SQLServerStatementParser.SYSTEM_TIME, 0); }
		public AlterDropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDrop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDropContext alterDrop() throws RecognitionException {
		AlterDropContext _localctx = new AlterDropContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_alterDrop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(DROP);
			setState(2308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
			case IF:
			case IDENTIFIER_:
				{
				setState(2302);
				alterTableDropConstraint();
				}
				break;
			case COLUMN:
				{
				setState(2303);
				dropColumnSpecification();
				}
				break;
			case INDEX:
				{
				setState(2304);
				dropIndexSpecification();
				}
				break;
			case PERIOD:
				{
				setState(2305);
				match(PERIOD);
				setState(2306);
				match(FOR);
				setState(2307);
				match(SYSTEM_TIME);
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

	public static class AlterTableDropConstraintContext extends ParserRuleContext {
		public List<DropConstraintNameContext> dropConstraintName() {
			return getRuleContexts(DropConstraintNameContext.class);
		}
		public DropConstraintNameContext dropConstraintName(int i) {
			return getRuleContext(DropConstraintNameContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public AlterTableDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableDropConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableDropConstraintContext alterTableDropConstraint() throws RecognitionException {
		AlterTableDropConstraintContext _localctx = new AlterTableDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_alterTableDropConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(2310);
				match(CONSTRAINT);
				}
			}

			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2313);
				ifExist();
				}
			}

			setState(2316);
			dropConstraintName();
			setState(2321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2317);
					match(COMMA_);
					setState(2318);
					dropConstraintName();
					}
					} 
				}
				setState(2323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class DropConstraintNameContext extends ParserRuleContext {
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public DropConstraintWithClauseContext dropConstraintWithClause() {
			return getRuleContext(DropConstraintWithClauseContext.class,0);
		}
		public DropConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintNameContext dropConstraintName() throws RecognitionException {
		DropConstraintNameContext _localctx = new DropConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_dropConstraintName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			ignoredIdentifier();
			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2325);
				dropConstraintWithClause();
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

	public static class DropConstraintWithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public List<DropConstraintOptionContext> dropConstraintOption() {
			return getRuleContexts(DropConstraintOptionContext.class);
		}
		public DropConstraintOptionContext dropConstraintOption(int i) {
			return getRuleContext(DropConstraintOptionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropConstraintWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintWithClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintWithClauseContext dropConstraintWithClause() throws RecognitionException {
		DropConstraintWithClauseContext _localctx = new DropConstraintWithClauseContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_dropConstraintWithClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(WITH);
			setState(2329);
			match(LP_);
			setState(2330);
			dropConstraintOption();
			setState(2335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2331);
				match(COMMA_);
				setState(2332);
				dropConstraintOption();
				}
				}
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2338);
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

	public static class DropConstraintOptionContext extends ParserRuleContext {
		public TerminalNode MAXDOP() { return getToken(SQLServerStatementParser.MAXDOP, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode ONLINE() { return getToken(SQLServerStatementParser.ONLINE, 0); }
		public OnOffOptionContext onOffOption() {
			return getRuleContext(OnOffOptionContext.class,0);
		}
		public TerminalNode MOVE() { return getToken(SQLServerStatementParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public DropConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropConstraintOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintOptionContext dropConstraintOption() throws RecognitionException {
		DropConstraintOptionContext _localctx = new DropConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_dropConstraintOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXDOP:
				{
				setState(2340);
				match(MAXDOP);
				setState(2341);
				match(EQ_);
				setState(2342);
				match(NUMBER_);
				}
				break;
			case ONLINE:
				{
				setState(2343);
				match(ONLINE);
				setState(2344);
				match(EQ_);
				setState(2345);
				onOffOption();
				}
				break;
			case MOVE:
				{
				setState(2346);
				match(MOVE);
				setState(2347);
				match(TO);
				setState(2355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2348);
					schemaName();
					setState(2349);
					match(LP_);
					setState(2350);
					columnName();
					setState(2351);
					match(RP_);
					}
					break;
				case 2:
					{
					setState(2353);
					ignoredIdentifier();
					}
					break;
				case 3:
					{
					setState(2354);
					match(STRING_);
					}
					break;
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

	public static class OnOffOptionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public OnOffOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onOffOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnOffOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnOffOptionContext onOffOption() throws RecognitionException {
		OnOffOptionContext _localctx = new OnOffOptionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_onOffOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_dropColumnSpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(COLUMN);
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2362);
				ifExist();
				}
			}

			setState(2365);
			columnName();
			setState(2370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2366);
					match(COMMA_);
					setState(2367);
					columnName();
					}
					} 
				}
				setState(2372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public IfExistContext ifExist() {
			return getRuleContext(IfExistContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropIndexSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dropIndexSpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			match(INDEX);
			setState(2375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2374);
				ifExist();
				}
			}

			setState(2377);
			indexName();
			setState(2382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2378);
					match(COMMA_);
					setState(2379);
					indexName();
					}
					} 
				}
				setState(2384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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

	public static class AlterCheckConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SQLServerStatementParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(SQLServerStatementParser.CHECK, 0); }
		public TerminalNode NOCHECK() { return getToken(SQLServerStatementParser.NOCHECK, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiersContext ignoredIdentifiers() {
			return getRuleContext(IgnoredIdentifiersContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public AlterCheckConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterCheckConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterCheckConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterCheckConstraintContext alterCheckConstraint() throws RecognitionException {
		AlterCheckConstraintContext _localctx = new AlterCheckConstraintContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_alterCheckConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2385);
				match(WITH);
				}
			}

			setState(2388);
			_la = _input.LA(1);
			if ( !(_la==CHECK || _la==NOCHECK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2389);
			match(CONSTRAINT);
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2390);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2391);
				ignoredIdentifiers();
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

	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode ENABLE() { return getToken(SQLServerStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public IgnoredIdentifiersContext ignoredIdentifiers() {
			return getRuleContext(IgnoredIdentifiersContext.class,0);
		}
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			_la = _input.LA(1);
			if ( !(_la==ENABLE || _la==DISABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2395);
			match(TRIGGER);
			setState(2398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2396);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(2397);
				ignoredIdentifiers();
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

	public static class AlterSwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(SQLServerStatementParser.SWITCH, 0); }
		public TerminalNode TO() { return getToken(SQLServerStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> PARTITION() { return getTokens(SQLServerStatementParser.PARTITION); }
		public TerminalNode PARTITION(int i) {
			return getToken(SQLServerStatementParser.PARTITION, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public LowPriorityLockWaitContext lowPriorityLockWait() {
			return getRuleContext(LowPriorityLockWaitContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public AlterSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSwitch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSwitchContext alterSwitch() throws RecognitionException {
		AlterSwitchContext _localctx = new AlterSwitchContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_alterSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(SWITCH);
			setState(2403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2401);
				match(PARTITION);
				setState(2402);
				expr(0);
				}
			}

			setState(2405);
			match(TO);
			setState(2406);
			tableName();
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2407);
				match(PARTITION);
				setState(2408);
				expr(0);
				}
			}

			setState(2416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2411);
				match(WITH);
				setState(2412);
				match(LP_);
				setState(2413);
				lowPriorityLockWait();
				setState(2414);
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

	public static class AlterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public SetFileStreamClauseContext setFileStreamClause() {
			return getRuleContext(SetFileStreamClauseContext.class,0);
		}
		public SetSystemVersionClauseContext setSystemVersionClause() {
			return getRuleContext(SetSystemVersionClauseContext.class,0);
		}
		public AlterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSetContext alterSet() throws RecognitionException {
		AlterSetContext _localctx = new AlterSetContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_alterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(SET);
			setState(2419);
			match(LP_);
			setState(2422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILESTREAM_ON:
				{
				setState(2420);
				setFileStreamClause();
				}
				break;
			case SYSTEM_VERSIONING:
				{
				setState(2421);
				setSystemVersionClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2424);
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

	public static class SetFileStreamClauseContext extends ParserRuleContext {
		public TerminalNode FILESTREAM_ON() { return getToken(SQLServerStatementParser.FILESTREAM_ON, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(SQLServerStatementParser.STRING_, 0); }
		public SetFileStreamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFileStreamClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetFileStreamClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetFileStreamClauseContext setFileStreamClause() throws RecognitionException {
		SetFileStreamClauseContext _localctx = new SetFileStreamClauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_setFileStreamClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			match(FILESTREAM_ON);
			setState(2427);
			match(EQ_);
			setState(2431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2428);
				schemaName();
				}
				break;
			case 2:
				{
				setState(2429);
				ignoredIdentifier();
				}
				break;
			case 3:
				{
				setState(2430);
				match(STRING_);
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

	public static class SetSystemVersionClauseContext extends ParserRuleContext {
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public AlterSetOnClauseContext alterSetOnClause() {
			return getRuleContext(AlterSetOnClauseContext.class,0);
		}
		public SetSystemVersionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVersionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetSystemVersionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetSystemVersionClauseContext setSystemVersionClause() throws RecognitionException {
		SetSystemVersionClauseContext _localctx = new SetSystemVersionClauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_setSystemVersionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(SYSTEM_VERSIONING);
			setState(2434);
			match(EQ_);
			setState(2440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OFF:
				{
				setState(2435);
				match(OFF);
				}
				break;
			case ON:
				{
				setState(2436);
				match(ON);
				setState(2438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2437);
					alterSetOnClause();
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

	public static class AlterSetOnClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DataConsistencyCheckClauseContext dataConsistencyCheckClause() {
			return getRuleContext(DataConsistencyCheckClauseContext.class,0);
		}
		public HistoryRetentionPeriodClauseContext historyRetentionPeriodClause() {
			return getRuleContext(HistoryRetentionPeriodClauseContext.class,0);
		}
		public AlterSetOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSetOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterSetOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSetOnClauseContext alterSetOnClause() throws RecognitionException {
		AlterSetOnClauseContext _localctx = new AlterSetOnClauseContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_alterSetOnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2442);
			match(LP_);
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HISTORY_TABLE) {
				{
				setState(2443);
				match(HISTORY_TABLE);
				setState(2444);
				match(EQ_);
				setState(2445);
				tableName();
				}
			}

			setState(2449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2448);
				dataConsistencyCheckClause();
				}
				break;
			}
			setState(2452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_ || _la==HISTORY_RETENTION_PERIOD) {
				{
				setState(2451);
				historyRetentionPeriodClause();
				}
			}

			setState(2454);
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

	public static class DataConsistencyCheckClauseContext extends ParserRuleContext {
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public OnOffOptionContext onOffOption() {
			return getRuleContext(OnOffOptionContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public DataConsistencyCheckClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataConsistencyCheckClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDataConsistencyCheckClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataConsistencyCheckClauseContext dataConsistencyCheckClause() throws RecognitionException {
		DataConsistencyCheckClauseContext _localctx = new DataConsistencyCheckClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_dataConsistencyCheckClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2456);
				match(COMMA_);
				}
			}

			setState(2459);
			match(DATA_CONSISTENCY_CHECK);
			setState(2460);
			match(EQ_);
			setState(2461);
			onOffOption();
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

	public static class HistoryRetentionPeriodClauseContext extends ParserRuleContext {
		public TerminalNode HISTORY_RETENTION_PERIOD() { return getToken(SQLServerStatementParser.HISTORY_RETENTION_PERIOD, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public HistoryRetentionPeriodContext historyRetentionPeriod() {
			return getRuleContext(HistoryRetentionPeriodContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public HistoryRetentionPeriodClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriodClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHistoryRetentionPeriodClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryRetentionPeriodClauseContext historyRetentionPeriodClause() throws RecognitionException {
		HistoryRetentionPeriodClauseContext _localctx = new HistoryRetentionPeriodClauseContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_historyRetentionPeriodClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2463);
				match(COMMA_);
				}
			}

			setState(2466);
			match(HISTORY_RETENTION_PERIOD);
			setState(2467);
			match(EQ_);
			setState(2468);
			historyRetentionPeriod();
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

	public static class HistoryRetentionPeriodContext extends ParserRuleContext {
		public TerminalNode INFINITE() { return getToken(SQLServerStatementParser.INFINITE, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode DAY() { return getToken(SQLServerStatementParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SQLServerStatementParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SQLServerStatementParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SQLServerStatementParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SQLServerStatementParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SQLServerStatementParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SQLServerStatementParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SQLServerStatementParser.YEARS, 0); }
		public HistoryRetentionPeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historyRetentionPeriod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitHistoryRetentionPeriod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoryRetentionPeriodContext historyRetentionPeriod() throws RecognitionException {
		HistoryRetentionPeriodContext _localctx = new HistoryRetentionPeriodContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_historyRetentionPeriod);
		int _la;
		try {
			setState(2473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFINITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2470);
				match(INFINITE);
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2471);
				match(NUMBER_);
				setState(2472);
				_la = _input.LA(1);
				if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (WEEK - 136)) | (1L << (DAY - 136)))) != 0) || ((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (YEARS - 221)) | (1L << (MONTHS - 221)) | (1L << (WEEKS - 221)) | (1L << (DAYS - 221)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class AlterTableTableIndexContext extends ParserRuleContext {
		public IndexWithNameContext indexWithName() {
			return getRuleContext(IndexWithNameContext.class,0);
		}
		public IndexNonClusterClauseContext indexNonClusterClause() {
			return getRuleContext(IndexNonClusterClauseContext.class,0);
		}
		public IndexClusterClauseContext indexClusterClause() {
			return getRuleContext(IndexClusterClauseContext.class,0);
		}
		public AlterTableTableIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableTableIndex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableTableIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableTableIndexContext alterTableTableIndex() throws RecognitionException {
		AlterTableTableIndexContext _localctx = new AlterTableTableIndexContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_alterTableTableIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			indexWithName();
			setState(2478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONCLUSTERED:
				{
				setState(2476);
				indexNonClusterClause();
				}
				break;
			case CLUSTERED:
				{
				setState(2477);
				indexClusterClause();
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

	public static class IndexWithNameContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(SQLServerStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexWithName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexWithName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexWithNameContext indexWithName() throws RecognitionException {
		IndexWithNameContext _localctx = new IndexWithNameContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_indexWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480);
			match(INDEX);
			setState(2481);
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

	public static class IndexNonClusterClauseContext extends ParserRuleContext {
		public TerminalNode NONCLUSTERED() { return getToken(SQLServerStatementParser.NONCLUSTERED, 0); }
		public HashWithBucketContext hashWithBucket() {
			return getRuleContext(HashWithBucketContext.class,0);
		}
		public ColumnNamesWithSortContext columnNamesWithSort() {
			return getRuleContext(ColumnNamesWithSortContext.class,0);
		}
		public AlterTableIndexOnClauseContext alterTableIndexOnClause() {
			return getRuleContext(AlterTableIndexOnClauseContext.class,0);
		}
		public IndexNonClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexNonClusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexNonClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNonClusterClauseContext indexNonClusterClause() throws RecognitionException {
		IndexNonClusterClauseContext _localctx = new IndexNonClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_indexNonClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(NONCLUSTERED);
			setState(2489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(2484);
				hashWithBucket();
				}
				break;
			case LP_:
				{
				setState(2485);
				columnNamesWithSort();
				setState(2487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON || _la==DEFAULT) {
					{
					setState(2486);
					alterTableIndexOnClause();
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

	public static class AlterTableIndexOnClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public AlterTableIndexOnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableIndexOnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableIndexOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableIndexOnClauseContext alterTableIndexOnClause() throws RecognitionException {
		AlterTableIndexOnClauseContext _localctx = new AlterTableIndexOnClauseContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_alterTableIndexOnClause);
		try {
			setState(2494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2491);
				match(ON);
				setState(2492);
				ignoredIdentifier();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2493);
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

	public static class IndexClusterClauseContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SQLServerStatementParser.CLUSTERED, 0); }
		public TerminalNode COLUMNSTORE() { return getToken(SQLServerStatementParser.COLUMNSTORE, 0); }
		public TerminalNode WITH() { return getToken(SQLServerStatementParser.WITH, 0); }
		public TerminalNode COMPRESSION_DELAY() { return getToken(SQLServerStatementParser.COMPRESSION_DELAY, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public IndexOnClauseContext indexOnClause() {
			return getRuleContext(IndexOnClauseContext.class,0);
		}
		public TerminalNode MINUTES() { return getToken(SQLServerStatementParser.MINUTES, 0); }
		public IndexClusterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexClusterClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIndexClusterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexClusterClauseContext indexClusterClause() throws RecognitionException {
		IndexClusterClauseContext _localctx = new IndexClusterClauseContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_indexClusterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			match(CLUSTERED);
			setState(2497);
			match(COLUMNSTORE);
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2498);
				match(WITH);
				setState(2499);
				match(COMPRESSION_DELAY);
				setState(2500);
				match(EQ_);
				setState(2501);
				match(NUMBER_);
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUTES) {
					{
					setState(2502);
					match(MINUTES);
					}
				}

				}
			}

			setState(2508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2507);
				indexOnClause();
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

	public static class AlterTableOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(SQLServerStatementParser.LOCK_ESCALATION, 0); }
		public TerminalNode EQ_() { return getToken(SQLServerStatementParser.EQ_, 0); }
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode AUTO() { return getToken(SQLServerStatementParser.AUTO, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode DISABLE() { return getToken(SQLServerStatementParser.DISABLE, 0); }
		public TerminalNode MEMORY_OPTIMIZED() { return getToken(SQLServerStatementParser.MEMORY_OPTIMIZED, 0); }
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode DURABILITY() { return getToken(SQLServerStatementParser.DURABILITY, 0); }
		public TerminalNode SCHEMA_ONLY() { return getToken(SQLServerStatementParser.SCHEMA_ONLY, 0); }
		public TerminalNode SCHEMA_AND_DATA() { return getToken(SQLServerStatementParser.SCHEMA_AND_DATA, 0); }
		public TerminalNode SYSTEM_VERSIONING() { return getToken(SQLServerStatementParser.SYSTEM_VERSIONING, 0); }
		public OnHistoryTableClauseContext onHistoryTableClause() {
			return getRuleContext(OnHistoryTableClauseContext.class,0);
		}
		public AlterTableOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableOption; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterTableOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableOptionContext alterTableOption() throws RecognitionException {
		AlterTableOptionContext _localctx = new AlterTableOptionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_alterTableOption);
		int _la;
		try {
			setState(2528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(2510);
				match(SET);
				setState(2511);
				match(LP_);
				setState(2512);
				match(LOCK_ESCALATION);
				setState(2513);
				match(EQ_);
				setState(2514);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==DISABLE || _la==AUTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2515);
				match(RP_);
				}
				break;
			case MEMORY_OPTIMIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2516);
				match(MEMORY_OPTIMIZED);
				setState(2517);
				match(EQ_);
				setState(2518);
				match(ON);
				}
				break;
			case DURABILITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(2519);
				match(DURABILITY);
				setState(2520);
				match(EQ_);
				setState(2521);
				_la = _input.LA(1);
				if ( !(_la==SCHEMA_AND_DATA || _la==SCHEMA_ONLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SYSTEM_VERSIONING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2522);
				match(SYSTEM_VERSIONING);
				setState(2523);
				match(EQ_);
				setState(2524);
				match(ON);
				setState(2526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2525);
					onHistoryTableClause();
					}
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

	public static class OnHistoryTableClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLServerStatementParser.LP_, 0); }
		public TerminalNode HISTORY_TABLE() { return getToken(SQLServerStatementParser.HISTORY_TABLE, 0); }
		public List<TerminalNode> EQ_() { return getTokens(SQLServerStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(SQLServerStatementParser.EQ_, i);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(SQLServerStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(SQLServerStatementParser.COMMA_, 0); }
		public TerminalNode DATA_CONSISTENCY_CHECK() { return getToken(SQLServerStatementParser.DATA_CONSISTENCY_CHECK, 0); }
		public OnOffOptionContext onOffOption() {
			return getRuleContext(OnOffOptionContext.class,0);
		}
		public OnHistoryTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onHistoryTableClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnHistoryTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnHistoryTableClauseContext onHistoryTableClause() throws RecognitionException {
		OnHistoryTableClauseContext _localctx = new OnHistoryTableClauseContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_onHistoryTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2530);
			match(LP_);
			setState(2531);
			match(HISTORY_TABLE);
			setState(2532);
			match(EQ_);
			setState(2533);
			tableName();
			setState(2538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2534);
				match(COMMA_);
				setState(2535);
				match(DATA_CONSISTENCY_CHECK);
				setState(2536);
				match(EQ_);
				setState(2537);
				onOffOption();
				}
			}

			setState(2540);
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

	public static class IfExistContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SQLServerStatementParser.EXISTS, 0); }
		public IfExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitIfExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistContext ifExist() throws RecognitionException {
		IfExistContext _localctx = new IfExistContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_ifExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			match(IF);
			setState(2543);
			match(EXISTS);
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
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(SET);
			setState(2546);
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

	public static class SetImplicitTransactionsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SQLServerStatementParser.SET, 0); }
		public TerminalNode IMPLICIT_TRANSACTIONS() { return getToken(SQLServerStatementParser.IMPLICIT_TRANSACTIONS, 0); }
		public ImplicitTransactionsValueContext implicitTransactionsValue() {
			return getRuleContext(ImplicitTransactionsValueContext.class,0);
		}
		public TerminalNode IF() { return getToken(SQLServerStatementParser.IF, 0); }
		public List<TerminalNode> AT_() { return getTokens(SQLServerStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(SQLServerStatementParser.AT_, i);
		}
		public TerminalNode TRANCOUNT() { return getToken(SQLServerStatementParser.TRANCOUNT, 0); }
		public TerminalNode GT_() { return getToken(SQLServerStatementParser.GT_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLServerStatementParser.NUMBER_, 0); }
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public SetImplicitTransactionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImplicitTransactions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSetImplicitTransactions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetImplicitTransactionsContext setImplicitTransactions() throws RecognitionException {
		SetImplicitTransactionsContext _localctx = new SetImplicitTransactionsContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_setImplicitTransactions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2548);
				match(IF);
				setState(2549);
				match(AT_);
				setState(2550);
				match(AT_);
				setState(2551);
				match(TRANCOUNT);
				setState(2552);
				match(GT_);
				setState(2553);
				match(NUMBER_);
				setState(2554);
				match(COMMIT);
				setState(2555);
				match(TRAN);
				}
			}

			setState(2558);
			match(SET);
			setState(2559);
			match(IMPLICIT_TRANSACTIONS);
			setState(2560);
			implicitTransactionsValue();
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

	public static class ImplicitTransactionsValueContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public TerminalNode OFF() { return getToken(SQLServerStatementParser.OFF, 0); }
		public ImplicitTransactionsValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitTransactionsValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitImplicitTransactionsValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicitTransactionsValueContext implicitTransactionsValue() throws RecognitionException {
		ImplicitTransactionsValueContext _localctx = new ImplicitTransactionsValueContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_implicitTransactionsValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SQLServerStatementParser.BEGIN, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBeginTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_beginTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			match(BEGIN);
			setState(2565);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(SQLServerStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
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
		public TerminalNode ROLLBACK() { return getToken(SQLServerStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2569);
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
		public TerminalNode SAVE() { return getToken(SQLServerStatementParser.SAVE, 0); }
		public TerminalNode TRAN() { return getToken(SQLServerStatementParser.TRAN, 0); }
		public TerminalNode TRANSACTION() { return getToken(SQLServerStatementParser.TRANSACTION, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_savepoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			match(SAVE);
			setState(2572);
			_la = _input.LA(1);
			if ( !(_la==TRANSACTION || _la==TRAN) ) {
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

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2574);
			match(GRANT);
			setState(2578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2575);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2576);
				classTypePrivilegesClause();
				}
				break;
			case 3:
				{
				setState(2577);
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
		public TerminalNode REVOKE() { return getToken(SQLServerStatementParser.REVOKE, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
		}
		public RoleClauseContext roleClause() {
			return getRuleContext(RoleClauseContext.class,0);
		}
		public OptionForClauseContext optionForClause() {
			return getRuleContext(OptionForClauseContext.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2580);
			match(REVOKE);
			setState(2587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(2581);
					optionForClause();
					}
				}

				setState(2584);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2585);
				classTypePrivilegesClause();
				}
				break;
			case 3:
				{
				setState(2586);
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

	public static class DenyContext extends ParserRuleContext {
		public TerminalNode DENY() { return getToken(SQLServerStatementParser.DENY, 0); }
		public ClassPrivilegesClauseContext classPrivilegesClause() {
			return getRuleContext(ClassPrivilegesClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext classTypePrivilegesClause() {
			return getRuleContext(ClassTypePrivilegesClauseContext.class,0);
		}
		public DenyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deny; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDeny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DenyContext deny() throws RecognitionException {
		DenyContext _localctx = new DenyContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_deny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(DENY);
			setState(2592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2590);
				classPrivilegesClause();
				}
				break;
			case 2:
				{
				setState(2591);
				classTypePrivilegesClause();
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

	public static class ClassPrivilegesClauseContext extends ParserRuleContext {
		public ClassPrivilegesContext classPrivileges() {
			return getRuleContext(ClassPrivilegesContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassClauseContext onClassClause() {
			return getRuleContext(OnClassClauseContext.class,0);
		}
		public ClassPrivilegesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivilegesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassPrivilegesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPrivilegesClauseContext classPrivilegesClause() throws RecognitionException {
		ClassPrivilegesClauseContext _localctx = new ClassPrivilegesClauseContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_classPrivilegesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			classPrivileges();
			setState(2597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2595);
				match(ON);
				setState(2596);
				onClassClause();
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

	public static class ClassTypePrivilegesClauseContext extends ParserRuleContext {
		public ClassTypePrivilegesContext classTypePrivileges() {
			return getRuleContext(ClassTypePrivilegesContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLServerStatementParser.ON, 0); }
		public OnClassTypeClauseContext onClassTypeClause() {
			return getRuleContext(OnClassTypeClauseContext.class,0);
		}
		public ClassTypePrivilegesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivilegesClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassTypePrivilegesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypePrivilegesClauseContext classTypePrivilegesClause() throws RecognitionException {
		ClassTypePrivilegesClauseContext _localctx = new ClassTypePrivilegesClauseContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_classTypePrivilegesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			classTypePrivileges();
			setState(2602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2600);
				match(ON);
				setState(2601);
				onClassTypeClause();
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

	public static class OptionForClauseContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLServerStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SQLServerStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SQLServerStatementParser.FOR, 0); }
		public OptionForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOptionForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionForClauseContext optionForClause() throws RecognitionException {
		OptionForClauseContext _localctx = new OptionForClauseContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_optionForClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2604);
			match(GRANT);
			setState(2605);
			match(OPTION);
			setState(2606);
			match(FOR);
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

	public static class ClassPrivilegesContext extends ParserRuleContext {
		public List<PrivilegeTypeContext> privilegeType() {
			return getRuleContexts(PrivilegeTypeContext.class);
		}
		public PrivilegeTypeContext privilegeType(int i) {
			return getRuleContext(PrivilegeTypeContext.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPrivileges; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPrivilegesContext classPrivileges() throws RecognitionException {
		ClassPrivilegesContext _localctx = new ClassPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_classPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2608);
			privilegeType();
			setState(2610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2609);
				columnNames();
				}
			}

			setState(2619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2612);
				match(COMMA_);
				setState(2613);
				privilegeType();
				setState(2615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2614);
					columnNames();
					}
				}

				}
				}
				setState(2621);
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

	public static class OnClassClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public OnClassClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnClassClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClassClauseContext onClassClause() throws RecognitionException {
		OnClassClauseContext _localctx = new OnClassClauseContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_onClassClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2622);
				class_();
				}
				break;
			}
			setState(2625);
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

	public static class ClassTypePrivilegesContext extends ParserRuleContext {
		public List<PrivilegeTypeContext> privilegeType() {
			return getRuleContexts(PrivilegeTypeContext.class);
		}
		public PrivilegeTypeContext privilegeType(int i) {
			return getRuleContext(PrivilegeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(SQLServerStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLServerStatementParser.COMMA_, i);
		}
		public ClassTypePrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypePrivileges; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassTypePrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypePrivilegesContext classTypePrivileges() throws RecognitionException {
		ClassTypePrivilegesContext _localctx = new ClassTypePrivilegesContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_classTypePrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			privilegeType();
			setState(2632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2628);
				match(COMMA_);
				setState(2629);
				privilegeType();
				}
				}
				setState(2634);
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

	public static class OnClassTypeClauseContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public OnClassTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClassTypeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitOnClassTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClassTypeClauseContext onClassTypeClause() throws RecognitionException {
		OnClassTypeClauseContext _localctx = new OnClassTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_onClassTypeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2635);
				classType();
				}
				break;
			}
			setState(2638);
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

	public static class PrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SQLServerStatementParser.PRIVILEGES, 0); }
		public BasicPermissionContext basicPermission() {
			return getRuleContext(BasicPermissionContext.class,0);
		}
		public ObjectPermissionContext objectPermission() {
			return getRuleContext(ObjectPermissionContext.class,0);
		}
		public ServerPermissionContext serverPermission() {
			return getRuleContext(ServerPermissionContext.class,0);
		}
		public ServerPrincipalPermissionContext serverPrincipalPermission() {
			return getRuleContext(ServerPrincipalPermissionContext.class,0);
		}
		public DatabasePermissionContext databasePermission() {
			return getRuleContext(DatabasePermissionContext.class,0);
		}
		public DatabasePrincipalPermissionContext databasePrincipalPermission() {
			return getRuleContext(DatabasePrincipalPermissionContext.class,0);
		}
		public SchemaPermissionContext schemaPermission() {
			return getRuleContext(SchemaPermissionContext.class,0);
		}
		public ServiceBrokerPermissionContext serviceBrokerPermission() {
			return getRuleContext(ServiceBrokerPermissionContext.class,0);
		}
		public EndpointPermissionContext endpointPermission() {
			return getRuleContext(EndpointPermissionContext.class,0);
		}
		public CertificatePermissionContext certificatePermission() {
			return getRuleContext(CertificatePermissionContext.class,0);
		}
		public SymmetricKeyPermissionContext symmetricKeyPermission() {
			return getRuleContext(SymmetricKeyPermissionContext.class,0);
		}
		public AsymmetricKeyPermissionContext asymmetricKeyPermission() {
			return getRuleContext(AsymmetricKeyPermissionContext.class,0);
		}
		public AssemblyPermissionContext assemblyPermission() {
			return getRuleContext(AssemblyPermissionContext.class,0);
		}
		public AvailabilityGroupPermissionContext availabilityGroupPermission() {
			return getRuleContext(AvailabilityGroupPermissionContext.class,0);
		}
		public FullTextPermissionContext fullTextPermission() {
			return getRuleContext(FullTextPermissionContext.class,0);
		}
		public PrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitPrivilegeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeTypeContext privilegeType() throws RecognitionException {
		PrivilegeTypeContext _localctx = new PrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_privilegeType);
		int _la;
		try {
			setState(2659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2640);
				match(ALL);
				setState(2642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2641);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2644);
				basicPermission();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2645);
				objectPermission();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2646);
				serverPermission();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2647);
				serverPrincipalPermission();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2648);
				databasePermission();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2649);
				databasePrincipalPermission();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2650);
				schemaPermission();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2651);
				serviceBrokerPermission();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2652);
				endpointPermission();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2653);
				certificatePermission();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2654);
				symmetricKeyPermission();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2655);
				asymmetricKeyPermission();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2656);
				assemblyPermission();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2657);
				availabilityGroupPermission();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2658);
				fullTextPermission();
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

	public static class BasicPermissionContext extends ParserRuleContext {
		public TerminalNode CONTROL() { return getToken(SQLServerStatementParser.CONTROL, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode TAKE() { return getToken(SQLServerStatementParser.TAKE, 0); }
		public TerminalNode OWNERSHIP() { return getToken(SQLServerStatementParser.OWNERSHIP, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode REFERENCES() { return getToken(SQLServerStatementParser.REFERENCES, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(SQLServerStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQLServerStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(SQLServerStatementParser.DELETE, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode RECEIVE() { return getToken(SQLServerStatementParser.RECEIVE, 0); }
		public BasicPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitBasicPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicPermissionContext basicPermission() throws RecognitionException {
		BasicPermissionContext _localctx = new BasicPermissionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_basicPermission);
		int _la;
		try {
			setState(2680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTROL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				match(CONTROL);
				setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2662);
					match(SERVER);
					}
				}

				}
				break;
			case TAKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				match(TAKE);
				setState(2666);
				match(OWNERSHIP);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2667);
				match(ALTER);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(2668);
				match(VIEW);
				setState(2670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(2669);
					match(ANY);
					}
				}

				setState(2672);
				match(DEFINITION);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(2673);
				match(REFERENCES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2674);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2675);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2676);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2677);
				match(DELETE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(2678);
				match(EXECUTE);
				}
				break;
			case RECEIVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2679);
				match(RECEIVE);
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

	public static class ObjectPermissionContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public ObjectPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitObjectPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPermissionContext objectPermission() throws RecognitionException {
		ObjectPermissionContext _localctx = new ObjectPermissionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_objectPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2682);
			match(VIEW);
			setState(2683);
			match(CHANGE);
			setState(2684);
			match(TRACKING);
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

	public static class ServerPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode RESOURCES() { return getToken(SQLServerStatementParser.RESOURCES, 0); }
		public TerminalNode SETTINGS() { return getToken(SQLServerStatementParser.SETTINGS, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode CREDENTIAL() { return getToken(SQLServerStatementParser.CREDENTIAL, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode LINKED() { return getToken(SQLServerStatementParser.LINKED, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode SQL() { return getToken(SQLServerStatementParser.SQL, 0); }
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode SELECT() { return getToken(SQLServerStatementParser.SELECT, 0); }
		public TerminalNode ALL() { return getToken(SQLServerStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode SECURABLES() { return getToken(SQLServerStatementParser.SECURABLES, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode ACCESS() { return getToken(SQLServerStatementParser.ACCESS, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public TerminalNode UNSAFE() { return getToken(SQLServerStatementParser.UNSAFE, 0); }
		public TerminalNode SHUTDOWN() { return getToken(SQLServerStatementParser.SHUTDOWN, 0); }
		public ServerPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServerPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerPermissionContext serverPermission() throws RecognitionException {
		ServerPermissionContext _localctx = new ServerPermissionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_serverPermission);
		int _la;
		try {
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2686);
				match(ALTER);
				setState(2692);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RESOURCES:
					{
					setState(2687);
					match(RESOURCES);
					}
					break;
				case SETTINGS:
					{
					setState(2688);
					match(SETTINGS);
					}
					break;
				case TRACE:
					{
					setState(2689);
					match(TRACE);
					}
					break;
				case SERVER:
					{
					setState(2690);
					match(SERVER);
					setState(2691);
					match(STATE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2694);
				match(ALTER);
				setState(2695);
				match(ANY);
				setState(2713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2696);
					match(AVAILABILITY);
					setState(2697);
					match(GROUP);
					}
					break;
				case 2:
					{
					setState(2698);
					match(CONNECTION);
					}
					break;
				case 3:
					{
					setState(2699);
					match(CREDENTIAL);
					}
					break;
				case 4:
					{
					setState(2700);
					match(DATABASE);
					}
					break;
				case 5:
					{
					setState(2701);
					match(ENDPOINT);
					}
					break;
				case 6:
					{
					setState(2702);
					match(EVENT);
					setState(2703);
					match(NOTIFICATION);
					}
					break;
				case 7:
					{
					setState(2704);
					match(EVENT);
					setState(2705);
					match(SESSION);
					}
					break;
				case 8:
					{
					setState(2706);
					match(LINKED);
					setState(2707);
					match(SERVER);
					}
					break;
				case 9:
					{
					setState(2708);
					match(LOGIN);
					}
					break;
				case 10:
					{
					setState(2709);
					match(SERVER);
					setState(2710);
					match(AUDIT);
					}
					break;
				case 11:
					{
					setState(2711);
					match(SERVER);
					setState(2712);
					match(ROLE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2715);
				match(CREATE);
				setState(2727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AVAILABILITY:
					{
					setState(2716);
					match(AVAILABILITY);
					setState(2717);
					match(GROUP);
					}
					break;
				case DDL:
					{
					setState(2718);
					match(DDL);
					setState(2719);
					match(EVENT);
					setState(2720);
					match(NOTIFICATION);
					}
					break;
				case ENDPOINT:
					{
					setState(2721);
					match(ENDPOINT);
					}
					break;
				case SERVER:
					{
					setState(2722);
					match(SERVER);
					setState(2723);
					match(ROLE);
					}
					break;
				case TRACE:
					{
					setState(2724);
					match(TRACE);
					setState(2725);
					match(EVENT);
					setState(2726);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2729);
				match(CREATE);
				setState(2730);
				match(ANY);
				setState(2731);
				match(DATABASE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2732);
				match(VIEW);
				setState(2733);
				match(SERVER);
				setState(2734);
				match(STATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2735);
				match(VIEW);
				setState(2736);
				match(ANY);
				setState(2737);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==DEFINITION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2738);
				match(CONNECT);
				setState(2739);
				match(ANY);
				setState(2740);
				match(DATABASE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2741);
				match(CONNECT);
				setState(2742);
				match(SQL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2743);
				match(IMPERSONATE);
				setState(2744);
				match(ANY);
				setState(2745);
				match(LOGIN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2746);
				match(SELECT);
				setState(2747);
				match(ALL);
				setState(2748);
				match(USER);
				setState(2749);
				match(SECURABLES);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2750);
				match(AUTHENTICATE);
				setState(2751);
				match(SERVER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2752);
				match(EXTERNAL);
				setState(2753);
				match(ACCESS);
				setState(2754);
				match(ASSEMBLY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2755);
				match(ADMINISTER);
				setState(2756);
				match(BULK);
				setState(2757);
				match(OPERATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2758);
				match(UNSAFE);
				setState(2759);
				match(ASSEMBLY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2760);
				match(SHUTDOWN);
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

	public static class ServerPrincipalPermissionContext extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public ServerPrincipalPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverPrincipalPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServerPrincipalPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerPrincipalPermissionContext serverPrincipalPermission() throws RecognitionException {
		ServerPrincipalPermissionContext _localctx = new ServerPrincipalPermissionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_serverPrincipalPermission);
		try {
			setState(2771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2763);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2764);
				match(ALTER);
				setState(2765);
				match(ANY);
				setState(2769);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOGIN:
					{
					setState(2766);
					match(LOGIN);
					}
					break;
				case SERVER:
					{
					setState(2767);
					match(SERVER);
					setState(2768);
					match(ROLE);
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

	public static class DatabasePermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode TRACE() { return getToken(SQLServerStatementParser.TRACE, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode DATASPACE() { return getToken(SQLServerStatementParser.DATASPACE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public TerminalNode CONNECTION() { return getToken(SQLServerStatementParser.CONNECTION, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public TerminalNode COLUMN() { return getToken(SQLServerStatementParser.COLUMN, 0); }
		public TerminalNode MASTER() { return getToken(SQLServerStatementParser.MASTER, 0); }
		public TerminalNode DEFINITION() { return getToken(SQLServerStatementParser.DEFINITION, 0); }
		public TerminalNode EXTERNAL() { return getToken(SQLServerStatementParser.EXTERNAL, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public TerminalNode MASK() { return getToken(SQLServerStatementParser.MASK, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public TerminalNode EVENT() { return getToken(SQLServerStatementParser.EVENT, 0); }
		public TerminalNode SESSION() { return getToken(SQLServerStatementParser.SESSION, 0); }
		public TerminalNode SECURITY() { return getToken(SQLServerStatementParser.SECURITY, 0); }
		public TerminalNode POLICY() { return getToken(SQLServerStatementParser.POLICY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(SQLServerStatementParser.ENCRYPTION, 0); }
		public TerminalNode DATA() { return getToken(SQLServerStatementParser.DATA, 0); }
		public TerminalNode SOURCE() { return getToken(SQLServerStatementParser.SOURCE, 0); }
		public TerminalNode FILE() { return getToken(SQLServerStatementParser.FILE, 0); }
		public TerminalNode FORMAT() { return getToken(SQLServerStatementParser.FORMAT, 0); }
		public TerminalNode LIBRARY() { return getToken(SQLServerStatementParser.LIBRARY, 0); }
		public TerminalNode AUDIT() { return getToken(SQLServerStatementParser.AUDIT, 0); }
		public TerminalNode DDL() { return getToken(SQLServerStatementParser.DDL, 0); }
		public TerminalNode TRIGGER() { return getToken(SQLServerStatementParser.TRIGGER, 0); }
		public TerminalNode NOTIFICATION() { return getToken(SQLServerStatementParser.NOTIFICATION, 0); }
		public TerminalNode SCOPED() { return getToken(SQLServerStatementParser.SCOPED, 0); }
		public TerminalNode CONFIGURATION() { return getToken(SQLServerStatementParser.CONFIGURATION, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLServerStatementParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode DEFAULT() { return getToken(SQLServerStatementParser.DEFAULT, 0); }
		public TerminalNode AGGREGATE() { return getToken(SQLServerStatementParser.AGGREGATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SQLServerStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(SQLServerStatementParser.PROCEDURE, 0); }
		public TerminalNode QUEUE() { return getToken(SQLServerStatementParser.QUEUE, 0); }
		public TerminalNode RULE() { return getToken(SQLServerStatementParser.RULE, 0); }
		public TerminalNode SYNONYM() { return getToken(SQLServerStatementParser.SYNONYM, 0); }
		public TerminalNode XML() { return getToken(SQLServerStatementParser.XML, 0); }
		public TerminalNode COLLECTION() { return getToken(SQLServerStatementParser.COLLECTION, 0); }
		public TerminalNode STATE() { return getToken(SQLServerStatementParser.STATE, 0); }
		public TerminalNode SERVER() { return getToken(SQLServerStatementParser.SERVER, 0); }
		public TerminalNode EXECUTE() { return getToken(SQLServerStatementParser.EXECUTE, 0); }
		public TerminalNode SCRIPT() { return getToken(SQLServerStatementParser.SCRIPT, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public TerminalNode REPLICATION() { return getToken(SQLServerStatementParser.REPLICATION, 0); }
		public TerminalNode KILL() { return getToken(SQLServerStatementParser.KILL, 0); }
		public TerminalNode BACKUP() { return getToken(SQLServerStatementParser.BACKUP, 0); }
		public TerminalNode LOG() { return getToken(SQLServerStatementParser.LOG, 0); }
		public TerminalNode AUTHENTICATE() { return getToken(SQLServerStatementParser.AUTHENTICATE, 0); }
		public TerminalNode SHOWPLAN() { return getToken(SQLServerStatementParser.SHOWPLAN, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(SQLServerStatementParser.SUBSCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SQLServerStatementParser.QUERY, 0); }
		public TerminalNode NOTIFICATIONS() { return getToken(SQLServerStatementParser.NOTIFICATIONS, 0); }
		public TerminalNode UNMASK() { return getToken(SQLServerStatementParser.UNMASK, 0); }
		public TerminalNode CHECKPOINT() { return getToken(SQLServerStatementParser.CHECKPOINT, 0); }
		public TerminalNode ADMINISTER() { return getToken(SQLServerStatementParser.ADMINISTER, 0); }
		public TerminalNode BULK() { return getToken(SQLServerStatementParser.BULK, 0); }
		public TerminalNode OPERATIONS() { return getToken(SQLServerStatementParser.OPERATIONS, 0); }
		public DatabasePermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDatabasePermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePermissionContext databasePermission() throws RecognitionException {
		DatabasePermissionContext _localctx = new DatabasePermissionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_databasePermission);
		int _la;
		try {
			setState(2926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2773);
				match(ALTER);
				setState(2774);
				match(TRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2775);
				match(ALTER);
				setState(2776);
				match(ANY);
				setState(2836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2777);
					match(DATABASE);
					setState(2787);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						setState(2778);
						match(AUDIT);
						}
						break;
					case 2:
						{
						setState(2779);
						match(DDL);
						setState(2780);
						match(TRIGGER);
						}
						break;
					case 3:
						{
						setState(2781);
						match(EVENT);
						setState(2782);
						match(NOTIFICATION);
						}
						break;
					case 4:
						{
						setState(2783);
						match(EVENT);
						setState(2784);
						match(SESSION);
						}
						break;
					case 5:
						{
						setState(2785);
						match(SCOPED);
						setState(2786);
						match(CONFIGURATION);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(2789);
					match(DATASPACE);
					}
					break;
				case 3:
					{
					setState(2790);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2791);
					match(SERVICE);
					setState(2793);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUDIT) {
						{
						setState(2792);
						match(AUDIT);
						}
					}

					}
					break;
				case 5:
					{
					setState(2795);
					match(USER);
					}
					break;
				case 6:
					{
					setState(2797);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2796);
						match(APPLICATION);
						}
					}

					setState(2799);
					match(ROLE);
					}
					break;
				case 7:
					{
					setState(2800);
					match(CERTIFICATE);
					}
					break;
				case 8:
					{
					setState(2801);
					match(CONTRACT);
					}
					break;
				case 9:
					{
					setState(2802);
					match(ASSEMBLY);
					}
					break;
				case 10:
					{
					setState(2803);
					match(CONNECTION);
					}
					break;
				case 11:
					{
					setState(2808);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMMETRIC:
						{
						setState(2804);
						match(SYMMETRIC);
						}
						break;
					case ASYMMETRIC:
						{
						setState(2805);
						match(ASYMMETRIC);
						}
						break;
					case COLUMN:
						{
						setState(2806);
						match(COLUMN);
						setState(2807);
						match(ENCRYPTION);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2810);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2811);
					match(COLUMN);
					setState(2812);
					match(MASTER);
					setState(2813);
					match(KEY);
					setState(2814);
					match(DEFINITION);
					}
					break;
				case 13:
					{
					setState(2815);
					match(EXTERNAL);
					setState(2821);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DATA:
						{
						setState(2816);
						match(DATA);
						setState(2817);
						match(SOURCE);
						}
						break;
					case FILE:
						{
						setState(2818);
						match(FILE);
						setState(2819);
						match(FORMAT);
						}
						break;
					case LIBRARY:
						{
						setState(2820);
						match(LIBRARY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 14:
					{
					setState(2823);
					match(FULLTEXT);
					setState(2824);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2825);
					match(MASK);
					}
					break;
				case 16:
					{
					setState(2826);
					match(MESSAGE);
					setState(2827);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2828);
					match(REMOTE);
					setState(2829);
					match(SERVICE);
					setState(2830);
					match(BINDING);
					}
					break;
				case 18:
					{
					setState(2831);
					match(ROUTE);
					}
					break;
				case 19:
					{
					setState(2832);
					match(EVENT);
					setState(2833);
					match(SESSION);
					}
					break;
				case 20:
					{
					setState(2834);
					match(SECURITY);
					setState(2835);
					match(POLICY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2838);
				match(CREATE);
				setState(2873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2839);
					match(DATABASE);
					}
					break;
				case 2:
					{
					setState(2840);
					match(DATABASE);
					setState(2841);
					match(DDL);
					setState(2842);
					match(EVENT);
					setState(2843);
					match(NOTIFICATION);
					}
					break;
				case 3:
					{
					setState(2844);
					match(SCHEMA);
					}
					break;
				case 4:
					{
					setState(2845);
					match(TABLE);
					}
					break;
				case 5:
					{
					setState(2846);
					match(VIEW);
					}
					break;
				case 6:
					{
					setState(2847);
					match(SERVICE);
					}
					break;
				case 7:
					{
					setState(2848);
					match(TYPE);
					}
					break;
				case 8:
					{
					setState(2849);
					match(DEFAULT);
					}
					break;
				case 9:
					{
					setState(2850);
					match(AGGREGATE);
					}
					break;
				case 10:
					{
					setState(2851);
					match(ASSEMBLY);
					}
					break;
				case 11:
					{
					setState(2852);
					_la = _input.LA(1);
					if ( !(_la==SYMMETRIC || _la==ASYMMETRIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2853);
					match(KEY);
					}
					break;
				case 12:
					{
					setState(2854);
					match(CERTIFICATE);
					}
					break;
				case 13:
					{
					setState(2855);
					match(CONTRACT);
					}
					break;
				case 14:
					{
					setState(2856);
					match(FULLTEXT);
					setState(2857);
					match(CATALOG);
					}
					break;
				case 15:
					{
					setState(2858);
					match(FUNCTION);
					}
					break;
				case 16:
					{
					setState(2859);
					match(MESSAGE);
					setState(2860);
					match(TYPE);
					}
					break;
				case 17:
					{
					setState(2861);
					match(PROCEDURE);
					}
					break;
				case 18:
					{
					setState(2862);
					match(QUEUE);
					}
					break;
				case 19:
					{
					setState(2863);
					match(REMOTE);
					setState(2864);
					match(SERVICE);
					setState(2865);
					match(BINDING);
					}
					break;
				case 20:
					{
					setState(2866);
					match(ROLE);
					}
					break;
				case 21:
					{
					setState(2867);
					match(ROUTE);
					}
					break;
				case 22:
					{
					setState(2868);
					match(RULE);
					}
					break;
				case 23:
					{
					setState(2869);
					match(SYNONYM);
					}
					break;
				case 24:
					{
					setState(2870);
					match(XML);
					setState(2871);
					match(SCHEMA);
					setState(2872);
					match(COLLECTION);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2875);
				match(CREATE);
				setState(2876);
				match(ANY);
				setState(2880);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
					{
					setState(2877);
					match(DATABASE);
					}
					break;
				case EXTERNAL:
					{
					setState(2878);
					match(EXTERNAL);
					setState(2879);
					match(LIBRARY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2882);
				match(VIEW);
				setState(2888);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SERVER:
					{
					setState(2883);
					_la = _input.LA(1);
					if ( !(_la==DATABASE || _la==SERVER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2884);
					match(STATE);
					}
					break;
				case DDL:
					{
					setState(2885);
					match(DDL);
					setState(2886);
					match(EVENT);
					setState(2887);
					match(NOTIFICATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2890);
				match(VIEW);
				setState(2891);
				match(ANY);
				setState(2897);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLUMN:
					{
					setState(2892);
					match(COLUMN);
					setState(2893);
					_la = _input.LA(1);
					if ( !(_la==ENCRYPTION || _la==MASTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2894);
					match(KEY);
					setState(2895);
					match(DEFINITION);
					}
					break;
				case DEFINITION:
					{
					setState(2896);
					match(DEFINITION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2899);
				match(EXECUTE);
				setState(2900);
				match(ANY);
				setState(2901);
				match(EXTERNAL);
				setState(2902);
				match(SCRIPT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2903);
				match(CONNECT);
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REPLICATION) {
					{
					setState(2904);
					match(REPLICATION);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2907);
				match(KILL);
				setState(2908);
				match(DATABASE);
				setState(2909);
				match(CONNECTION);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2910);
				match(BACKUP);
				setState(2911);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==LOG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2912);
				match(AUTHENTICATE);
				setState(2914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SERVER) {
					{
					setState(2913);
					match(SERVER);
					}
				}

				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2916);
				match(SHOWPLAN);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2917);
				match(SUBSCRIBE);
				setState(2918);
				match(QUERY);
				setState(2919);
				match(NOTIFICATIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2920);
				match(UNMASK);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2921);
				match(CHECKPOINT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2922);
				match(ADMINISTER);
				setState(2923);
				match(DATABASE);
				setState(2924);
				match(BULK);
				setState(2925);
				match(OPERATIONS);
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

	public static class DatabasePrincipalPermissionContext extends ParserRuleContext {
		public TerminalNode IMPERSONATE() { return getToken(SQLServerStatementParser.IMPERSONATE, 0); }
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode APPLICATION() { return getToken(SQLServerStatementParser.APPLICATION, 0); }
		public DatabasePrincipalPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databasePrincipalPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDatabasePrincipalPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasePrincipalPermissionContext databasePrincipalPermission() throws RecognitionException {
		DatabasePrincipalPermissionContext _localctx = new DatabasePrincipalPermissionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_databasePrincipalPermission);
		int _la;
		try {
			setState(2938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPERSONATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2928);
				match(IMPERSONATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2929);
				match(ALTER);
				setState(2930);
				match(ANY);
				setState(2936);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case USER:
					{
					setState(2931);
					match(USER);
					}
					break;
				case ROLE:
				case APPLICATION:
					{
					setState(2933);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==APPLICATION) {
						{
						setState(2932);
						match(APPLICATION);
						}
					}

					setState(2935);
					match(ROLE);
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

	public static class SchemaPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(SQLServerStatementParser.SEQUENCE, 0); }
		public TerminalNode VIEW() { return getToken(SQLServerStatementParser.VIEW, 0); }
		public TerminalNode CHANGE() { return getToken(SQLServerStatementParser.CHANGE, 0); }
		public TerminalNode TRACKING() { return getToken(SQLServerStatementParser.TRACKING, 0); }
		public SchemaPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSchemaPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaPermissionContext schemaPermission() throws RecognitionException {
		SchemaPermissionContext _localctx = new SchemaPermissionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_schemaPermission);
		try {
			setState(2948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2940);
				match(ALTER);
				setState(2941);
				match(ANY);
				setState(2942);
				match(SCHEMA);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2943);
				match(CREATE);
				setState(2944);
				match(SEQUENCE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(2945);
				match(VIEW);
				setState(2946);
				match(CHANGE);
				setState(2947);
				match(TRACKING);
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

	public static class ServiceBrokerPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CONTRACT() { return getToken(SQLServerStatementParser.CONTRACT, 0); }
		public TerminalNode MESSAGE() { return getToken(SQLServerStatementParser.MESSAGE, 0); }
		public TerminalNode TYPE() { return getToken(SQLServerStatementParser.TYPE, 0); }
		public TerminalNode REMOTE() { return getToken(SQLServerStatementParser.REMOTE, 0); }
		public TerminalNode SERVICE() { return getToken(SQLServerStatementParser.SERVICE, 0); }
		public TerminalNode BINDING() { return getToken(SQLServerStatementParser.BINDING, 0); }
		public TerminalNode ROUTE() { return getToken(SQLServerStatementParser.ROUTE, 0); }
		public ServiceBrokerPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceBrokerPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitServiceBrokerPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceBrokerPermissionContext serviceBrokerPermission() throws RecognitionException {
		ServiceBrokerPermissionContext _localctx = new ServiceBrokerPermissionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_serviceBrokerPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
			match(ALTER);
			setState(2951);
			match(ANY);
			setState(2960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRACT:
				{
				setState(2952);
				match(CONTRACT);
				}
				break;
			case MESSAGE:
				{
				setState(2953);
				match(MESSAGE);
				setState(2954);
				match(TYPE);
				}
				break;
			case REMOTE:
				{
				setState(2955);
				match(REMOTE);
				setState(2956);
				match(SERVICE);
				setState(2957);
				match(BINDING);
				}
				break;
			case ROUTE:
				{
				setState(2958);
				match(ROUTE);
				}
				break;
			case SERVICE:
				{
				setState(2959);
				match(SERVICE);
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

	public static class EndpointPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLServerStatementParser.ENDPOINT, 0); }
		public EndpointPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitEndpointPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndpointPermissionContext endpointPermission() throws RecognitionException {
		EndpointPermissionContext _localctx = new EndpointPermissionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_endpointPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2962);
			match(ALTER);
			setState(2963);
			match(ANY);
			setState(2964);
			match(ENDPOINT);
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

	public static class CertificatePermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode CERTIFICATE() { return getToken(SQLServerStatementParser.CERTIFICATE, 0); }
		public CertificatePermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificatePermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCertificatePermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificatePermissionContext certificatePermission() throws RecognitionException {
		CertificatePermissionContext _localctx = new CertificatePermissionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_certificatePermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2966);
			match(ALTER);
			setState(2967);
			match(ANY);
			setState(2968);
			match(CERTIFICATE);
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

	public static class SymmetricKeyPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode SYMMETRIC() { return getToken(SQLServerStatementParser.SYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public SymmetricKeyPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetricKeyPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitSymmetricKeyPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymmetricKeyPermissionContext symmetricKeyPermission() throws RecognitionException {
		SymmetricKeyPermissionContext _localctx = new SymmetricKeyPermissionContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_symmetricKeyPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2970);
			match(ALTER);
			setState(2971);
			match(ANY);
			setState(2972);
			match(SYMMETRIC);
			setState(2973);
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

	public static class AsymmetricKeyPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASYMMETRIC() { return getToken(SQLServerStatementParser.ASYMMETRIC, 0); }
		public TerminalNode KEY() { return getToken(SQLServerStatementParser.KEY, 0); }
		public AsymmetricKeyPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asymmetricKeyPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAsymmetricKeyPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsymmetricKeyPermissionContext asymmetricKeyPermission() throws RecognitionException {
		AsymmetricKeyPermissionContext _localctx = new AsymmetricKeyPermissionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_asymmetricKeyPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2975);
			match(ALTER);
			setState(2976);
			match(ANY);
			setState(2977);
			match(ASYMMETRIC);
			setState(2978);
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

	public static class AssemblyPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode ASSEMBLY() { return getToken(SQLServerStatementParser.ASSEMBLY, 0); }
		public AssemblyPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAssemblyPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyPermissionContext assemblyPermission() throws RecognitionException {
		AssemblyPermissionContext _localctx = new AssemblyPermissionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_assemblyPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2980);
			match(ALTER);
			setState(2981);
			match(ANY);
			setState(2982);
			match(ASSEMBLY);
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

	public static class AvailabilityGroupPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode AVAILABILITY() { return getToken(SQLServerStatementParser.AVAILABILITY, 0); }
		public TerminalNode GROUP() { return getToken(SQLServerStatementParser.GROUP, 0); }
		public TerminalNode CONNECT() { return getToken(SQLServerStatementParser.CONNECT, 0); }
		public AvailabilityGroupPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityGroupPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAvailabilityGroupPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailabilityGroupPermissionContext availabilityGroupPermission() throws RecognitionException {
		AvailabilityGroupPermissionContext _localctx = new AvailabilityGroupPermissionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_availabilityGroupPermission);
		try {
			setState(2989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2984);
				match(ALTER);
				setState(2985);
				match(ANY);
				setState(2986);
				match(AVAILABILITY);
				setState(2987);
				match(GROUP);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2988);
				match(CONNECT);
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

	public static class FullTextPermissionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ANY() { return getToken(SQLServerStatementParser.ANY, 0); }
		public TerminalNode FULLTEXT() { return getToken(SQLServerStatementParser.FULLTEXT, 0); }
		public TerminalNode CATALOG() { return getToken(SQLServerStatementParser.CATALOG, 0); }
		public FullTextPermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextPermission; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitFullTextPermission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullTextPermissionContext fullTextPermission() throws RecognitionException {
		FullTextPermissionContext _localctx = new FullTextPermissionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_fullTextPermission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2991);
			match(ALTER);
			setState(2992);
			match(ANY);
			setState(2993);
			match(FULLTEXT);
			setState(2994);
			match(CATALOG);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(SQLServerStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClass_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 494, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			match(IDENTIFIER_);
			setState(2997);
			match(COLON_);
			setState(2998);
			match(COLON_);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(SQLServerStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(SQLServerStatementParser.COLON_, i);
		}
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public TerminalNode DATABASE() { return getToken(SQLServerStatementParser.DATABASE, 0); }
		public TerminalNode OBJECT() { return getToken(SQLServerStatementParser.OBJECT, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLServerStatementParser.SCHEMA, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3000);
			_la = _input.LA(1);
			if ( !(_la==SCHEMA || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (USER - 206)) | (1L << (ROLE - 206)) | (1L << (DATABASE - 206)) | (1L << (LOGIN - 206)) | (1L << (OBJECT - 206)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3001);
			match(COLON_);
			setState(3002);
			match(COLON_);
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
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitRoleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleClauseContext roleClause() throws RecognitionException {
		RoleClauseContext _localctx = new RoleClauseContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_roleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3004);
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3006);
			match(CREATE);
			setState(3007);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3009);
			match(DROP);
			setState(3010);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(SQLServerStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3012);
			match(ALTER);
			setState(3013);
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
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3015);
			match(CREATE);
			setState(3016);
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
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3018);
			match(DROP);
			setState(3019);
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
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(SQLServerStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3021);
			match(ALTER);
			setState(3022);
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

	public static class CreateLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLServerStatementParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public CreateLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCreateLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLoginContext createLogin() throws RecognitionException {
		CreateLoginContext _localctx = new CreateLoginContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_createLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			match(CREATE);
			setState(3025);
			match(LOGIN);
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

	public static class DropLoginContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLServerStatementParser.DROP, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public DropLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitDropLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropLoginContext dropLogin() throws RecognitionException {
		DropLoginContext _localctx = new DropLoginContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_dropLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			match(DROP);
			setState(3028);
			match(LOGIN);
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

	public static class AlterLoginContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLServerStatementParser.ALTER, 0); }
		public TerminalNode LOGIN() { return getToken(SQLServerStatementParser.LOGIN, 0); }
		public AlterLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterLogin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitAlterLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterLoginContext alterLogin() throws RecognitionException {
		AlterLoginContext _localctx = new AlterLoginContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_alterLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3030);
			match(ALTER);
			setState(3031);
			match(LOGIN);
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
		public TerminalNode CALL() { return getToken(SQLServerStatementParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLServerStatementVisitor ) return ((SQLServerStatementVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3033);
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
		case 65:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 68:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 71:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 72:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u01a4\u0bde\4\2\t"+
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
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0229\n\2\3\2\5\2\u022c\n\2\3\3\5\3\u022f\n\3"+
		"\3\3\3\3\5\3\u0233\n\3\3\3\5\3\u0236\n\3\3\3\3\3\5\3\u023a\n\3\3\3\5\3"+
		"\u023d\n\3\3\3\3\3\3\3\5\3\u0242\n\3\3\4\5\4\u0245\n\4\3\4\5\4\u0248\n"+
		"\4\3\4\3\4\3\4\3\5\5\5\u024e\n\5\3\5\5\5\u0251\n\5\3\5\3\5\3\5\3\5\7\5"+
		"\u0257\n\5\f\5\16\5\u025a\13\5\3\6\5\6\u025d\n\6\3\6\5\6\u0260\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\u0268\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u0272\n\t\f\t\16\t\u0275\13\t\3\n\3\n\3\n\3\n\7\n\u027b\n\n\f\n\16\n"+
		"\u027e\13\n\3\n\3\n\3\n\3\n\5\n\u0284\n\n\3\13\3\13\5\13\u0288\n\13\3"+
		"\f\3\f\5\f\u028c\n\f\3\f\3\f\5\f\u0290\n\f\3\f\5\f\u0293\n\f\3\f\5\f\u0296"+
		"\n\f\3\r\5\r\u0299\n\r\3\r\5\r\u029c\n\r\3\r\3\r\5\r\u02a0\n\r\3\r\5\r"+
		"\u02a3\n\r\3\r\5\r\u02a6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u02b1\n\16\3\17\3\17\5\17\u02b5\n\17\3\17\3\17\3\17\5\17\u02ba"+
		"\n\17\7\17\u02bc\n\17\f\17\16\17\u02bf\13\17\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u02c6\n\21\3\21\3\21\5\21\u02ca\n\21\3\21\7\21\u02cd\n\21\f\21\16"+
		"\21\u02d0\13\21\3\22\3\22\5\22\u02d4\n\22\3\22\3\22\5\22\u02d8\n\22\3"+
		"\22\5\22\u02db\n\22\3\22\5\22\u02de\n\22\3\22\5\22\u02e1\n\22\3\22\5\22"+
		"\u02e4\n\22\3\23\3\23\3\24\3\24\5\24\u02ea\n\24\3\24\3\24\7\24\u02ee\n"+
		"\24\f\24\16\24\u02f1\13\24\3\25\3\25\3\25\5\25\u02f6\n\25\3\25\5\25\u02f9"+
		"\n\25\3\25\5\25\u02fc\n\25\3\25\5\25\u02ff\n\25\3\26\3\26\5\26\u0303\n"+
		"\26\3\26\3\26\5\26\u0307\n\26\3\26\5\26\u030a\n\26\3\26\3\26\5\26\u030e"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0318\n\26\3\27\3\27"+
		"\5\27\u031c\n\27\3\30\3\30\5\30\u0320\n\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\7\34\u032d\n\34\f\34\16\34\u0330\13\34\3"+
		"\35\3\35\7\35\u0334\n\35\f\35\16\35\u0337\13\35\3\36\3\36\5\36\u033b\n"+
		"\36\3\36\5\36\u033e\n\36\3\36\3\36\5\36\u0342\n\36\3\36\3\36\5\36\u0346"+
		"\n\36\3\36\3\36\3\36\3\36\5\36\u034c\n\36\3\37\5\37\u034f\n\37\3\37\5"+
		"\37\u0352\n\37\3\37\3\37\3\37\3\37\5\37\u0358\n\37\3\37\5\37\u035b\n\37"+
		"\3\37\3\37\5\37\u035f\n\37\3\37\3\37\3\37\5\37\u0364\n\37\5\37\u0366\n"+
		"\37\3 \3 \3 \3 \5 \u036c\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0376\n\""+
		"\f\"\16\"\u0379\13\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\7%\u0386\n%\f%\16"+
		"%\u0389\13%\3&\3&\5&\u038d\n&\3&\3&\3&\3\'\3\'\3\'\5\'\u0395\n\'\3\'\3"+
		"\'\3\'\5\'\u039a\n\'\5\'\u039c\n\'\3(\3(\3(\7(\u03a1\n(\f(\16(\u03a4\13"+
		"(\3)\3)\3)\3)\5)\u03aa\n)\3)\5)\u03ad\n)\3*\3*\3*\3+\3+\3+\5+\u03b5\n"+
		"+\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-\u03c0\n-\3.\3.\3/\5/\u03c5\n/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03d0\n\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u03dc\n\65\3\66\3\66\3\67\3\67\38"+
		"\38\38\58\u03e5\n8\38\38\39\39\39\59\u03ec\n9\39\39\3:\3:\3;\3;\3<\3<"+
		"\3<\3<\7<\u03f8\n<\f<\16<\u03fb\13<\3<\3<\3=\3=\3=\3=\7=\u0403\n=\f=\16"+
		"=\u0406\13=\3=\3=\3>\5>\u040b\n>\3>\3>\3>\7>\u0410\n>\f>\16>\u0413\13"+
		">\3>\5>\u0416\n>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u0420\nA\5A\u0422\nA\3A\3"+
		"A\3B\5B\u0427\nB\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u0434\nC\3C\3C\3"+
		"C\3C\7C\u043a\nC\fC\16C\u043d\13C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\5F\u0449"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u0458\nF\fF\16F\u045b\13"+
		"F\3G\3G\3H\3H\5H\u0461\nH\3H\3H\3H\3H\3H\5H\u0468\nH\3H\3H\3H\3H\3H\7"+
		"H\u046f\nH\fH\16H\u0472\13H\3H\3H\3H\3H\5H\u0478\nH\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u0481\nH\3H\3H\3H\3H\5H\u0487\nH\3H\5H\u048a\nH\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\7I\u04ad\nI\fI\16I\u04b0\13I\3J\3J\3J\3J\3J\3J\3J\3J\5"+
		"J\u04ba\nJ\3J\3J\3J\3J\7J\u04c0\nJ\fJ\16J\u04c3\13J\3J\3J\3J\5J\u04c8"+
		"\nJ\3J\3J\3J\3J\3J\3J\3J\3J\5J\u04d2\nJ\3J\3J\3J\7J\u04d7\nJ\fJ\16J\u04da"+
		"\13J\3K\3K\3K\5K\u04df\nK\3L\3L\3L\5L\u04e4\nL\3L\3L\3L\7L\u04e9\nL\f"+
		"L\16L\u04ec\13L\3L\5L\u04ef\nL\3L\3L\3M\3M\3N\3N\3O\3O\5O\u04f9\nO\3P"+
		"\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q\u0507\nQ\fQ\16Q\u050a\13Q\3Q\3Q\5"+
		"Q\u050e\nQ\3Q\3Q\3R\3R\3R\3R\3R\7R\u0517\nR\fR\16R\u051a\13R\3R\5R\u051d"+
		"\nR\3R\3R\3S\3S\3S\3S\3S\5S\u0526\nS\3T\3T\5T\u052a\nT\3T\6T\u052d\nT"+
		"\rT\16T\u052e\3T\5T\u0532\nT\3U\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\5W\u0540"+
		"\nW\3X\3X\3X\3X\3X\7X\u0547\nX\fX\16X\u054a\13X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\5X\u0555\nX\5X\u0557\nX\3Y\3Y\3Y\5Y\u055c\nY\3Y\5Y\u055f\nY\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u0568\nZ\3Z\3Z\3Z\5Z\u056d\nZ\3[\3[\3\\\3\\\3\\\3"+
		"\\\5\\\u0575\n\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0581\n]\3]\3]\3^"+
		"\3^\3^\3^\3^\5^\u058a\n^\3^\3^\3^\3^\5^\u0590\n^\3_\3_\3_\3`\3`\3`\5`"+
		"\u0598\n`\3`\5`\u059b\n`\3`\5`\u059e\n`\3`\3`\3a\3a\3a\3a\3a\7a\u05a7"+
		"\na\fa\16a\u05aa\13a\3b\3b\3b\3c\3c\5c\u05b1\nc\3d\3d\3d\3d\3d\3e\3e\5"+
		"e\u05ba\ne\3f\3f\3f\3f\3f\3f\5f\u05c2\nf\3g\3g\3g\3g\3g\3g\5g\u05ca\n"+
		"g\3h\3h\5h\u05ce\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05db\ni\5i\u05dd"+
		"\ni\3j\3j\3j\3j\3k\3k\3k\5k\u05e6\nk\3l\3l\3l\3m\3m\3n\3n\3n\3o\3o\3o"+
		"\3o\3o\3o\3p\3p\3p\7p\u05f9\np\fp\16p\u05fc\13p\3q\3q\5q\u0600\nq\3r\3"+
		"r\3r\3r\3s\3s\3s\3s\3s\3s\5s\u060c\ns\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3"+
		"t\5t\u0619\nt\3u\3u\3v\3v\3v\7v\u0620\nv\fv\16v\u0623\13v\3w\3w\3x\3x"+
		"\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\7z\u063b\nz\fz"+
		"\16z\u063e\13z\3{\3{\3{\3{\5{\u0644\n{\3{\3{\3{\3|\3|\3|\5|\u064c\n|\3"+
		"|\3|\3}\3}\3}\5}\u0653\n}\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\5\177\u065f"+
		"\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0669\n\u0081\f\u0081\16\u0081\u066c\13\u0081\3\u0081\3\u0081"+
		"\5\u0081\u0670\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u0679\n\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u067e\n"+
		"\u0083\f\u0083\16\u0083\u0681\13\u0083\3\u0083\3\u0083\5\u0083\u0685\n"+
		"\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0694\n\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u069e"+
		"\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06a9\n\u0084\3\u0084\5\u0084\u06ac\n\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u06b6\n"+
		"\u0084\f\u0084\16\u0084\u06b9\13\u0084\3\u0084\5\u0084\u06bc\n\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\5\u0086\u06ce"+
		"\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u06d3\n\u0086\3\u0087\3\u0087"+
		"\5\u0087\u06d7\n\u0087\3\u0087\3\u0087\5\u0087\u06db\n\u0087\3\u0088\5"+
		"\u0088\u06de\n\u0088\3\u0088\5\u0088\u06e1\n\u0088\3\u0088\5\u0088\u06e4"+
		"\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\7\u008a\u06f0\n\u008a\f\u008a\16\u008a\u06f3\13\u008a"+
		"\3\u008a\3\u008a\5\u008a\u06f7\n\u008a\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u06fc\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u070c"+
		"\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\5\u0091\u0717\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u071f\n\u0091\f\u0091\16\u0091\u0722\13\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u072a\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0731\n\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\5\u0094\u0737\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0740\n\u0095\3\u0095\5\u0095\u0743\n"+
		"\u0095\3\u0095\5\u0095\u0746\n\u0095\3\u0095\5\u0095\u0749\n\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u0750\n\u0096\f\u0096\16\u0096"+
		"\u0753\13\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u075a"+
		"\n\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u0763\n\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u0768\n\u009a\f\u009a\16"+
		"\u009a\u076b\13\u009a\5\u009a\u076d\n\u009a\3\u009b\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u0775\n\u009b\5\u009b\u0777\n\u009b\3\u009b"+
		"\5\u009b\u077a\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\5\u009d\u0784\n\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u0789\n\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u078e\n\u009e\3\u009f\3"+
		"\u009f\5\u009f\u0792\n\u009f\3\u00a0\5\u00a0\u0795\n\u00a0\3\u00a0\3\u00a0"+
		"\5\u00a0\u0799\n\u00a0\3\u00a0\5\u00a0\u079c\n\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\5\u00a1\u07a1\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\5\u00a3\u07a9\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7"+
		"\u00a3\u07b0\n\u00a3\f\u00a3\16\u00a3\u07b3\13\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\5\u00a4\u07ba\n\u00a4\3\u00a4\5\u00a4\u07bd\n\u00a4"+
		"\3\u00a4\5\u00a4\u07c0\n\u00a4\3\u00a5\5\u00a5\u07c3\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u07c9\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u07cd"+
		"\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u07d3\n\u00a6\f\u00a6"+
		"\16\u00a6\u07d6\13\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u07eb\n\u00a8\5\u00a8\u07ed\n"+
		"\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u07f2\n\u00a9\5\u00a9\u07f4\n\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u07fb\n\u00a9\5\u00a9"+
		"\u07fd\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0801\n\u00a9\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\7\u00aa\u0807\n\u00aa\f\u00aa\16\u00aa\u080a\13\u00aa\3"+
		"\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u0817\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0820\n\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\5\u00ab\u082f\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab"+
		"\u0835\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u0839\n\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u083e\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0844"+
		"\n\u00ac\f\u00ac\16\u00ac\u0847\13\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u084f\n\u00ad\3\u00ad\5\u00ad\u0852\n\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u0868\n\u00af\5\u00af\u086a\n\u00af\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u0875\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u087c\n"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0883\n\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u088b\n\u00b2\f"+
		"\u00b2\16\u00b2\u088e\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\5\u00b3"+
		"\u0894\n\u00b3\3\u00b3\5\u00b3\u0897\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u08a2\n\u00b4\3"+
		"\u00b5\3\u00b5\5\u00b5\u08a6\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08ab"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u08b1\n\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u08b6\n\u00b6\3\u00b6\5\u00b6\u08b9\n\u00b6\3"+
		"\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u08c2\n"+
		"\u00b8\f\u00b8\16\u00b8\u08c5\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u08cd\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u08d1\n"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u08e0\n\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u08e7\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u08f3\n\u00bd\3\u00bd\5\u00bd\u08f6\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08fa"+
		"\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08fe\n\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0907\n\u00be\3\u00bf\5\u00bf"+
		"\u090a\n\u00bf\3\u00bf\5\u00bf\u090d\n\u00bf\3\u00bf\3\u00bf\3\u00bf\7"+
		"\u00bf\u0912\n\u00bf\f\u00bf\16\u00bf\u0915\13\u00bf\3\u00c0\3\u00c0\5"+
		"\u00c0\u0919\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0920"+
		"\n\u00c1\f\u00c1\16\u00c1\u0923\13\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0936\n\u00c2\5\u00c2\u0938\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\5\u00c4\u093e\n\u00c4\3\u00c4\3"+
		"\u00c4\3\u00c4\7\u00c4\u0943\n\u00c4\f\u00c4\16\u00c4\u0946\13\u00c4\3"+
		"\u00c5\3\u00c5\5\u00c5\u094a\n\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u094f"+
		"\n\u00c5\f\u00c5\16\u00c5\u0952\13\u00c5\3\u00c6\5\u00c6\u0955\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u095b\n\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0961\n\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0966\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u096c\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0973\n\u00c8\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0979\n\u00c9\3\u00c9\3\u00c9\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0982\n\u00ca\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u0989\n\u00cb\5\u00cb\u098b\n\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0991\n\u00cc\3\u00cc\5\u00cc\u0994\n"+
		"\u00cc\3\u00cc\5\u00cc\u0997\n\u00cc\3\u00cc\3\u00cc\3\u00cd\5\u00cd\u099c"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\5\u00ce\u09a3\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09ac"+
		"\n\u00cf\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09b1\n\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09ba\n\u00d2\5\u00d2"+
		"\u09bc\n\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u09c1\n\u00d3\3\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09ca\n\u00d4\5"+
		"\u00d4\u09cc\n\u00d4\3\u00d4\5\u00d4\u09cf\n\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09e1\n\u00d5\5\u00d5\u09e3\n"+
		"\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u09ed\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u09ff\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da"+
		"\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00de"+
		"\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a15\n\u00df"+
		"\3\u00e0\3\u00e0\5\u00e0\u0a19\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0"+
		"\u0a1e\n\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a23\n\u00e1\3\u00e2\3"+
		"\u00e2\3\u00e2\5\u00e2\u0a28\n\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a2d"+
		"\n\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\5\u00e5\u0a35"+
		"\n\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0a3a\n\u00e5\7\u00e5\u0a3c\n"+
		"\u00e5\f\u00e5\16\u00e5\u0a3f\13\u00e5\3\u00e6\5\u00e6\u0a42\n\u00e6\3"+
		"\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u0a49\n\u00e7\f\u00e7\16"+
		"\u00e7\u0a4c\13\u00e7\3\u00e8\5\u00e8\u0a4f\n\u00e8\3\u00e8\3\u00e8\3"+
		"\u00e9\3\u00e9\5\u00e9\u0a55\n\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3"+
		"\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\5\u00e9\u0a66\n\u00e9\3\u00ea\3\u00ea\5\u00ea\u0a6a\n"+
		"\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0a71\n\u00ea\3"+
		"\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea"+
		"\u0a7b\n\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a87\n\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0a9c"+
		"\n\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0aaa\n\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0acc\n\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0ad4\n\u00ed\5\u00ed\u0ad6\n\u00ed\3"+
		"\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0ae6\n\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0aec\n\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u0af0\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u0afb\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b08"+
		"\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b17\n\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b3c"+
		"\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b43\n\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b4b\n\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b54"+
		"\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b5c"+
		"\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u0b65\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b71\n\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\5\u00ef\u0b78\n\u00ef\3\u00ef\5\u00ef\u0b7b\n\u00ef\5"+
		"\u00ef\u0b7d\n\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3"+
		"\u00f0\3\u00f0\5\u00f0\u0b87\n\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3"+
		"\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1\u0b93\n\u00f1\3"+
		"\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\5\u00f7\u0bb0\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0100\3\u0101\3\u0101\3\u0101"+
		"\3\u0102\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\3\u0104\3\u0104\3\u0104"+
		"\3\u0105\3\u0105\3\u0105\2\6\u0084\u008a\u0090\u0092\u0106\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\2\60\4\2NNpp\4\2XX\\"+
		"\\\4\2WWZ[\3\2\u019e\u019f\3\2\u0085\u0087\3\2kl \2\66\66FGyz~\177\u0083"+
		"\u0083\u0088\u0089\u008b\u008b\u008d\u008d\u0092\u0097\u009a\u009b\u009d"+
		"\u009d\u009f\u00a0\u00a2\u00a4\u00a7\u00a8\u00ab\u00ab\u00ae\u00ae\u00bd"+
		"\u00bd\u00bf\u00c4\u00c7\u00c8\u00d1\u00d2\u00d5\u00d9\u00db\u00dc\u00de"+
		"\u00e9\u00eb\u00f0\u00f2\u00fa\u00fc\u0111\u0118\u0189\u018b\u018b\u0191"+
		"\u0191\u019d\u019f\3\2\u01a0\u01a1\4\2\4\5fg\4\2\6\6ii\4\2jl\u00c6\u00c6"+
		"\3\2pq\3\2\30\35\5\2\6\7\17\20\u00bd\u00bd\3\2\u0093\u0097\3\2\u00c4\u00c5"+
		"\4\2\u00a7\u00a7\u018b\u018b\3\2vw\4\2\u00dc\u00dc\u00e7\u00e7\n\2\u0081"+
		"\u0081\u0085\u0086\u00ac\u00ad\u00af\u00b7\u00bd\u00bd\u0130\u0130\u018d"+
		"\u019c\u01a0\u01a0\4\2\u00c5\u00c5\u0106\u0106\4\2\u0168\u0168\u0179\u0179"+
		"\7\2\u00c4\u00c4\u00db\u00db\u00fb\u00fb\u0100\u0100\u0165\u0165\n\2\u00fe"+
		"\u00fe\u010a\u010a\u0161\u0162\u0168\u0168\u0171\u0172\u0176\u0177\u017c"+
		"\u017c\u0188\u0188\4\2``\u00fd\u00fd\5\2\u00d7\u00d7\u00fb\u00fb\u010d"+
		"\u010d\4\2\u00d2\u00d2\u00ea\u00ea\4\2\u00e5\u00e5\u0105\u0105\3\2\u00d8"+
		"\u00d9\3\2\61\62\4\2jj\u0098\u0098\5\2\u00c4\u00c4\u00fb\u00fb\u0100\u0100"+
		"\4\2\u00f2\u00f3\u0101\u0101\3\2\u0174\u0175\3\2Z[\4\2\u00ca\u00ca\u00fa"+
		"\u00fa\3\2\u009a\u009b\5\2\u008a\u008a\u008c\u008e\u00df\u00e2\5\2<<\u009b"+
		"\u009b\u00d6\u00d6\4\2\u00d3\u00d3\u0110\u0110\4\2\u00de\u00de\u011b\u011b"+
		"\3\2\u011e\u011f\4\2\u00de\u00de\u0120\u0120\3\2\u0141\u0142\4\2\u00de"+
		"\u00de\u0159\u0159\7\2\67\67\u00d0\u00d1\u00de\u00de\u00f6\u00f6\u00fc"+
		"\u00fc\2\u0d1e\2\u0228\3\2\2\2\4\u022e\3\2\2\2\6\u0244\3\2\2\2\b\u024d"+
		"\3\2\2\2\n\u025c\3\2\2\2\f\u0263\3\2\2\2\16\u0269\3\2\2\2\20\u026d\3\2"+
		"\2\2\22\u0283\3\2\2\2\24\u0287\3\2\2\2\26\u0289\3\2\2\2\30\u0298\3\2\2"+
		"\2\32\u02b0\3\2\2\2\34\u02b2\3\2\2\2\36\u02c0\3\2\2\2 \u02c2\3\2\2\2\""+
		"\u02d1\3\2\2\2$\u02e5\3\2\2\2&\u02e9\3\2\2\2(\u02fe\3\2\2\2*\u0300\3\2"+
		"\2\2,\u031b\3\2\2\2.\u031f\3\2\2\2\60\u0321\3\2\2\2\62\u0323\3\2\2\2\64"+
		"\u0326\3\2\2\2\66\u0329\3\2\2\28\u0331\3\2\2\2:\u034b\3\2\2\2<\u0365\3"+
		"\2\2\2>\u036b\3\2\2\2@\u036d\3\2\2\2B\u0370\3\2\2\2D\u037a\3\2\2\2F\u037d"+
		"\3\2\2\2H\u0381\3\2\2\2J\u038a\3\2\2\2L\u0391\3\2\2\2N\u039d\3\2\2\2P"+
		"\u03a5\3\2\2\2R\u03ae\3\2\2\2T\u03b4\3\2\2\2V\u03b6\3\2\2\2X\u03bf\3\2"+
		"\2\2Z\u03c1\3\2\2\2\\\u03c4\3\2\2\2^\u03cf\3\2\2\2`\u03d1\3\2\2\2b\u03d3"+
		"\3\2\2\2d\u03d5\3\2\2\2f\u03d7\3\2\2\2h\u03db\3\2\2\2j\u03dd\3\2\2\2l"+
		"\u03df\3\2\2\2n\u03e4\3\2\2\2p\u03eb\3\2\2\2r\u03ef\3\2\2\2t\u03f1\3\2"+
		"\2\2v\u03f3\3\2\2\2x\u03fe\3\2\2\2z\u040a\3\2\2\2|\u0417\3\2\2\2~\u0419"+
		"\3\2\2\2\u0080\u041b\3\2\2\2\u0082\u0426\3\2\2\2\u0084\u0433\3\2\2\2\u0086"+
		"\u043e\3\2\2\2\u0088\u0440\3\2\2\2\u008a\u0442\3\2\2\2\u008c\u045c\3\2"+
		"\2\2\u008e\u0489\3\2\2\2\u0090\u048b\3\2\2\2\u0092\u04d1\3\2\2\2\u0094"+
		"\u04de\3\2\2\2\u0096\u04e0\3\2\2\2\u0098\u04f2\3\2\2\2\u009a\u04f4\3\2"+
		"\2\2\u009c\u04f8\3\2\2\2\u009e\u04fa\3\2\2\2\u00a0\u0501\3\2\2\2\u00a2"+
		"\u0511\3\2\2\2\u00a4\u0525\3\2\2\2\u00a6\u0527\3\2\2\2\u00a8\u0533\3\2"+
		"\2\2\u00aa\u0538\3\2\2\2\u00ac\u053f\3\2\2\2\u00ae\u0541\3\2\2\2\u00b0"+
		"\u055b\3\2\2\2\u00b2\u0560\3\2\2\2\u00b4\u056e\3\2\2\2\u00b6\u0570\3\2"+
		"\2\2\u00b8\u0578\3\2\2\2\u00ba\u0584\3\2\2\2\u00bc\u0591\3\2\2\2\u00be"+
		"\u0594\3\2\2\2\u00c0\u05a1\3\2\2\2\u00c2\u05ab\3\2\2\2\u00c4\u05b0\3\2"+
		"\2\2\u00c6\u05b2\3\2\2\2\u00c8\u05b9\3\2\2\2\u00ca\u05c1\3\2\2\2\u00cc"+
		"\u05c9\3\2\2\2\u00ce\u05cb\3\2\2\2\u00d0\u05dc\3\2\2\2\u00d2\u05de\3\2"+
		"\2\2\u00d4\u05e2\3\2\2\2\u00d6\u05e7\3\2\2\2\u00d8\u05ea\3\2\2\2\u00da"+
		"\u05ec\3\2\2\2\u00dc\u05ef\3\2\2\2\u00de\u05f5\3\2\2\2\u00e0\u05ff\3\2"+
		"\2\2\u00e2\u0601\3\2\2\2\u00e4\u0605\3\2\2\2\u00e6\u0613\3\2\2\2\u00e8"+
		"\u061a\3\2\2\2\u00ea\u061c\3\2\2\2\u00ec\u0624\3\2\2\2\u00ee\u0626\3\2"+
		"\2\2\u00f0\u062c\3\2\2\2\u00f2\u0634\3\2\2\2\u00f4\u063f\3\2\2\2\u00f6"+
		"\u0648\3\2\2\2\u00f8\u064f\3\2\2\2\u00fa\u0658\3\2\2\2\u00fc\u065e\3\2"+
		"\2\2\u00fe\u0660\3\2\2\2\u0100\u0664\3\2\2\2\u0102\u0678\3\2\2\2\u0104"+
		"\u067a\3\2\2\2\u0106\u06bb\3\2\2\2\u0108\u06bd\3\2\2\2\u010a\u06cd\3\2"+
		"\2\2\u010c\u06d6\3\2\2\2\u010e\u06dd\3\2\2\2\u0110\u06e5\3\2\2\2\u0112"+
		"\u06e7\3\2\2\2\u0114\u06fb\3\2\2\2\u0116\u06fd\3\2\2\2\u0118\u0703\3\2"+
		"\2\2\u011a\u0706\3\2\2\2\u011c\u0709\3\2\2\2\u011e\u070d\3\2\2\2\u0120"+
		"\u0716\3\2\2\2\u0122\u0729\3\2\2\2\u0124\u0730\3\2\2\2\u0126\u0732\3\2"+
		"\2\2\u0128\u073c\3\2\2\2\u012a\u074a\3\2\2\2\u012c\u0759\3\2\2\2\u012e"+
		"\u075b\3\2\2\2\u0130\u075e\3\2\2\2\u0132\u076c\3\2\2\2\u0134\u076e\3\2"+
		"\2\2\u0136\u077b\3\2\2\2\u0138\u0783\3\2\2\2\u013a\u078a\3\2\2\2\u013c"+
		"\u0791\3\2\2\2\u013e\u0794\3\2\2\2\u0140\u079d\3\2\2\2\u0142\u07a2\3\2"+
		"\2\2\u0144\u07a8\3\2\2\2\u0146\u07b4\3\2\2\2\u0148\u07cc\3\2\2\2\u014a"+
		"\u07ce\3\2\2\2\u014c\u07d9\3\2\2\2\u014e\u07ec\3\2\2\2\u0150\u07f3\3\2"+
		"\2\2\u0152\u0802\3\2\2\2\u0154\u083d\3\2\2\2\u0156\u083f\3\2\2\2\u0158"+
		"\u0851\3\2\2\2\u015a\u0857\3\2\2\2\u015c\u0869\3\2\2\2\u015e\u086b\3\2"+
		"\2\2\u0160\u087b\3\2\2\2\u0162\u087d\3\2\2\2\u0164\u0893\3\2\2\2\u0166"+
		"\u08a1\3\2\2\2\u0168\u08a5\3\2\2\2\u016a\u08ac\3\2\2\2\u016c\u08ba\3\2"+
		"\2\2\u016e\u08be\3\2\2\2\u0170\u08cc\3\2\2\2\u0172\u08d0\3\2\2\2\u0174"+
		"\u08df\3\2\2\2\u0176\u08e1\3\2\2\2\u0178\u08eb\3\2\2\2\u017a\u08ff\3\2"+
		"\2\2\u017c\u0909\3\2\2\2\u017e\u0916\3\2\2\2\u0180\u091a\3\2\2\2\u0182"+
		"\u0937\3\2\2\2\u0184\u0939\3\2\2\2\u0186\u093b\3\2\2\2\u0188\u0947\3\2"+
		"\2\2\u018a\u0954\3\2\2\2\u018c\u095c\3\2\2\2\u018e\u0962\3\2\2\2\u0190"+
		"\u0974\3\2\2\2\u0192\u097c\3\2\2\2\u0194\u0983\3\2\2\2\u0196\u098c\3\2"+
		"\2\2\u0198\u099b\3\2\2\2\u019a\u09a2\3\2\2\2\u019c\u09ab\3\2\2\2\u019e"+
		"\u09ad\3\2\2\2\u01a0\u09b2\3\2\2\2\u01a2\u09b5\3\2\2\2\u01a4\u09c0\3\2"+
		"\2\2\u01a6\u09c2\3\2\2\2\u01a8\u09e2\3\2\2\2\u01aa\u09e4\3\2\2\2\u01ac"+
		"\u09f0\3\2\2\2\u01ae\u09f3\3\2\2\2\u01b0\u09fe\3\2\2\2\u01b2\u0a04\3\2"+
		"\2\2\u01b4\u0a06\3\2\2\2\u01b6\u0a09\3\2\2\2\u01b8\u0a0b\3\2\2\2\u01ba"+
		"\u0a0d\3\2\2\2\u01bc\u0a10\3\2\2\2\u01be\u0a16\3\2\2\2\u01c0\u0a1f\3\2"+
		"\2\2\u01c2\u0a24\3\2\2\2\u01c4\u0a29\3\2\2\2\u01c6\u0a2e\3\2\2\2\u01c8"+
		"\u0a32\3\2\2\2\u01ca\u0a41\3\2\2\2\u01cc\u0a45\3\2\2\2\u01ce\u0a4e\3\2"+
		"\2\2\u01d0\u0a65\3\2\2\2\u01d2\u0a7a\3\2\2\2\u01d4\u0a7c\3\2\2\2\u01d6"+
		"\u0acb\3\2\2\2\u01d8\u0ad5\3\2\2\2\u01da\u0b70\3\2\2\2\u01dc\u0b7c\3\2"+
		"\2\2\u01de\u0b86\3\2\2\2\u01e0\u0b88\3\2\2\2\u01e2\u0b94\3\2\2\2\u01e4"+
		"\u0b98\3\2\2\2\u01e6\u0b9c\3\2\2\2\u01e8\u0ba1\3\2\2\2\u01ea\u0ba6\3\2"+
		"\2\2\u01ec\u0baf\3\2\2\2\u01ee\u0bb1\3\2\2\2\u01f0\u0bb6\3\2\2\2\u01f2"+
		"\u0bba\3\2\2\2\u01f4\u0bbe\3\2\2\2\u01f6\u0bc0\3\2\2\2\u01f8\u0bc3\3\2"+
		"\2\2\u01fa\u0bc6\3\2\2\2\u01fc\u0bc9\3\2\2\2\u01fe\u0bcc\3\2\2\2\u0200"+
		"\u0bcf\3\2\2\2\u0202\u0bd2\3\2\2\2\u0204\u0bd5\3\2\2\2\u0206\u0bd8\3\2"+
		"\2\2\u0208\u0bdb\3\2\2\2\u020a\u0229\5\36\20\2\u020b\u0229\5\4\3\2\u020c"+
		"\u0229\5\f\7\2\u020d\u0229\5\26\f\2\u020e\u0229\5\u00f0y\2\u020f\u0229"+
		"\5\u00f4{\2\u0210\u0229\5\u00f8}\2\u0211\u0229\5\u00eex\2\u0212\u0229"+
		"\5\u00f2z\2\u0213\u0229\5\u00f6|\2\u0214\u0229\5\u00fa~\2\u0215\u0229"+
		"\5\u01ae\u00d8\2\u0216\u0229\5\u01b4\u00db\2\u0217\u0229\5\u01b0\u00d9"+
		"\2\u0218\u0229\5\u01b6\u00dc\2\u0219\u0229\5\u01b8\u00dd\2\u021a\u0229"+
		"\5\u01ba\u00de\2\u021b\u0229\5\u01bc\u00df\2\u021c\u0229\5\u01be\u00e0"+
		"\2\u021d\u0229\5\u01c0\u00e1\2\u021e\u0229\5\u01f6\u00fc\2\u021f\u0229"+
		"\5\u01f8\u00fd\2\u0220\u0229\5\u01fa\u00fe\2\u0221\u0229\5\u01fc\u00ff"+
		"\2\u0222\u0229\5\u01fe\u0100\2\u0223\u0229\5\u0200\u0101\2\u0224\u0229"+
		"\5\u0202\u0102\2\u0225\u0229\5\u0204\u0103\2\u0226\u0229\5\u0206\u0104"+
		"\2\u0227\u0229\5\u0208\u0105\2\u0228\u020a\3\2\2\2\u0228\u020b\3\2\2\2"+
		"\u0228\u020c\3\2\2\2\u0228\u020d\3\2\2\2\u0228\u020e\3\2\2\2\u0228\u020f"+
		"\3\2\2\2\u0228\u0210\3\2\2\2\u0228\u0211\3\2\2\2\u0228\u0212\3\2\2\2\u0228"+
		"\u0213\3\2\2\2\u0228\u0214\3\2\2\2\u0228\u0215\3\2\2\2\u0228\u0216\3\2"+
		"\2\2\u0228\u0217\3\2\2\2\u0228\u0218\3\2\2\2\u0228\u0219\3\2\2\2\u0228"+
		"\u021a\3\2\2\2\u0228\u021b\3\2\2\2\u0228\u021c\3\2\2\2\u0228\u021d\3\2"+
		"\2\2\u0228\u021e\3\2\2\2\u0228\u021f\3\2\2\2\u0228\u0220\3\2\2\2\u0228"+
		"\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228\u0223\3\2\2\2\u0228\u0224\3\2"+
		"\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u022c\7+\2\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\3\3\2\2\2\u022d\u022f\5H%\2\u022e\u022d\3\2\2\2\u022e\u022f"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\7\60\2\2\u0231\u0233\5*\26\2"+
		"\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236"+
		"\7J\2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u023c\5n8\2\u0238\u023a\7_\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023d\5.\30\2\u023c\u0239\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u0241\3\2\2\2\u023e\u0242\5\6\4\2\u023f\u0242\5\b\5\2\u0240"+
		"\u0242\5\n\6\2\u0241\u023e\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2"+
		"\2\2\u0242\5\3\2\2\2\u0243\u0245\5v<\2\u0244\u0243\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\5L\'\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\u0098\2\2\u024a\u024b"+
		"\7K\2\2\u024b\7\3\2\2\2\u024c\u024e\5v<\2\u024d\u024c\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\5L\'\2\u0250\u024f\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7K\2\2\u0253\u0258\5\22"+
		"\n\2\u0254\u0255\7%\2\2\u0255\u0257\5\22\n\2\u0256\u0254\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\t\3\2\2\2"+
		"\u025a\u0258\3\2\2\2\u025b\u025d\5v<\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0260\5L\'\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5\36\20\2\u0262\13\3\2"+
		"\2\2\u0263\u0264\7\61\2\2\u0264\u0265\5\66\34\2\u0265\u0267\5\20\t\2\u0266"+
		"\u0268\5@!\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\r\3\2\2\2\u0269"+
		"\u026a\5p9\2\u026a\u026b\7\30\2\2\u026b\u026c\5\24\13\2\u026c\17\3\2\2"+
		"\2\u026d\u026e\7;\2\2\u026e\u0273\5\16\b\2\u026f\u0270\7%\2\2\u0270\u0272"+
		"\5\16\b\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2"+
		"\u0273\u0274\3\2\2\2\u0274\21\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277"+
		"\7\37\2\2\u0277\u027c\5\24\13\2\u0278\u0279\7%\2\2\u0279\u027b\5\24\13"+
		"\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7 \2\2\u0280"+
		"\u0284\3\2\2\2\u0281\u0282\7\37\2\2\u0282\u0284\7 \2\2\u0283\u0276\3\2"+
		"\2\2\u0283\u0281\3\2\2\2\u0284\23\3\2\2\2\u0285\u0288\5\u0084C\2\u0286"+
		"\u0288\7\u0098\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288\25\3"+
		"\2\2\2\u0289\u028b\7\62\2\2\u028a\u028c\5*\26\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u0290\5\30\r\2\u028e\u0290\5"+
		"\32\16\2\u028f\u028d\3\2\2\2\u028f\u028e\3\2\2\2\u0290\u0292\3\2\2\2\u0291"+
		"\u0293\5L\'\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2"+
		"\2\2\u0294\u0296\5@!\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\27"+
		"\3\2\2\2\u0297\u0299\7T\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u029c\7\37\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3"+
		"\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\5n8\2\u029e\u02a0\7 \2\2\u029f"+
		"\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a5\3\2\2\2\u02a1\u02a3\7_"+
		"\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\5.\30\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\31\3\2\2"+
		"\2\u02a7\u02a8\5\34\17\2\u02a8\u02a9\7T\2\2\u02a9\u02aa\5\66\34\2\u02aa"+
		"\u02b1\3\2\2\2\u02ab\u02ac\7T\2\2\u02ac\u02ad\5\34\17\2\u02ad\u02ae\7"+
		"]\2\2\u02ae\u02af\5\66\34\2\u02af\u02b1\3\2\2\2\u02b0\u02a7\3\2\2\2\u02b0"+
		"\u02ab\3\2\2\2\u02b1\33\3\2\2\2\u02b2\u02b4\5n8\2\u02b3\u02b5\7\25\2\2"+
		"\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bd\3\2\2\2\u02b6\u02b7"+
		"\7%\2\2\u02b7\u02b9\5n8\2\u02b8\u02ba\7\25\2\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b6\3\2\2\2\u02bc\u02bf\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\35\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0\u02c1\5 \21\2\u02c1\37\3\2\2\2\u02c2\u02ce\5\"\22\2\u02c3"+
		"\u02c5\7M\2\2\u02c4\u02c6\7p\2\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2"+
		"\2\u02c6\u02ca\3\2\2\2\u02c7\u02ca\7\u00ba\2\2\u02c8\u02ca\7\u00bb\2\2"+
		"\u02c9\u02c3\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cd\5\"\22\2\u02cc\u02c9\3\2\2\2\u02cd\u02d0\3\2\2\2"+
		"\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf!\3\2\2\2\u02d0\u02ce\3"+
		"\2\2\2\u02d1\u02d3\7/\2\2\u02d2\u02d4\5$\23\2\u02d3\u02d2\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\5&\24\2\u02d6\u02d8\5\64"+
		"\33\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02db\5@!\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2"+
		"\2\u02dc\u02de\5B\"\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0"+
		"\3\2\2\2\u02df\u02e1\5D#\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e3\3\2\2\2\u02e2\u02e4\5\u00aeX\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4#\3\2\2\2\u02e5\u02e6\t\2\2\2\u02e6%\3\2\2\2\u02e7\u02ea"+
		"\5\60\31\2\u02e8\u02ea\5(\25\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2"+
		"\u02ea\u02ef\3\2\2\2\u02eb\u02ec\7%\2\2\u02ec\u02ee\5(\25\2\u02ed\u02eb"+
		"\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\'\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f6\5*\26\2\u02f3\u02f6\5p9\2\u02f4"+
		"\u02f6\5\u0084C\2\u02f5\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4"+
		"\3\2\2\2\u02f6\u02fb\3\2\2\2\u02f7\u02f9\7_\2\2\u02f8\u02f7\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\5.\30\2\u02fb\u02f8\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02ff\5\62\32\2\u02fe"+
		"\u02f5\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ff)\3\2\2\2\u0300\u0302\7\u00c3"+
		"\2\2\u0301\u0303\7\37\2\2\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0306\5,\27\2\u0305\u0307\7 \2\2\u0306\u0305\3\2"+
		"\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u030a\7\u00b8\2\2\u0309"+
		"\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u030c\7L"+
		"\2\2\u030c\u030e\7\u00b9\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u0317\3\2\2\2\u030f\u0310\7\u0189\2\2\u0310\u0311\7\37\2\2\u0311\u0312"+
		"\7 \2\2\u0312\u0313\7\u00ff\2\2\u0313\u0314\7\37\2\2\u0314\u0315\5\u00ae"+
		"X\2\u0315\u0316\7 \2\2\u0316\u0318\3\2\2\2\u0317\u030f\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318+\3\2\2\2\u0319\u031c\5\\/\2\u031a\u031c\5V,\2\u031b\u0319"+
		"\3\2\2\2\u031b\u031a\3\2\2\2\u031c-\3\2\2\2\u031d\u0320\5h\65\2\u031e"+
		"\u0320\7\u01a1\2\2\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320/\3\2"+
		"\2\2\u0321\u0322\7\21\2\2\u0322\61\3\2\2\2\u0323\u0324\5h\65\2\u0324\u0325"+
		"\7\25\2\2\u0325\63\3\2\2\2\u0326\u0327\7T\2\2\u0327\u0328\5\66\34\2\u0328"+
		"\65\3\2\2\2\u0329\u032e\58\35\2\u032a\u032b\7%\2\2\u032b\u032d\58\35\2"+
		"\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\67\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0335\5:\36\2\u0332"+
		"\u0334\5<\37\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u03369\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033d"+
		"\5n8\2\u0339\u033b\7_\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033e\5.\30\2\u033d\u033a\3\2\2\2\u033d\u033e\3\2"+
		"\2\2\u033e\u034c\3\2\2\2\u033f\u0341\5F$\2\u0340\u0342\7_\2\2\u0341\u0340"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\5.\30\2\u0344"+
		"\u0346\5v<\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034c\3\2\2"+
		"\2\u0347\u0348\7\37\2\2\u0348\u0349\5\66\34\2\u0349\u034a\7 \2\2\u034a"+
		"\u034c\3\2\2\2\u034b\u0338\3\2\2\2\u034b\u033f\3\2\2\2\u034b\u0347\3\2"+
		"\2\2\u034c;\3\2\2\2\u034d\u034f\7U\2\2\u034e\u034d\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\t\3\2\2\u0351\u0350\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7V\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0357\5:\36\2\u0356\u0358\5> \2\u0357\u0356\3\2\2\2\u0357\u0358"+
		"\3\2\2\2\u0358\u0366\3\2\2\2\u0359\u035b\7U\2\2\u035a\u0359\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\t\4\2\2\u035d\u035f\7Y"+
		"\2\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\7V\2\2\u0361\u0363\5:\36\2\u0362\u0364\5> \2\u0363\u0362\3\2\2"+
		"\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u034e\3\2\2\2\u0365\u035a"+
		"\3\2\2\2\u0366=\3\2\2\2\u0367\u0368\7`\2\2\u0368\u036c\5\u0084C\2\u0369"+
		"\u036a\7]\2\2\u036a\u036c\5v<\2\u036b\u0367\3\2\2\2\u036b\u0369\3\2\2"+
		"\2\u036c?\3\2\2\2\u036d\u036e\7^\2\2\u036e\u036f\5\u0084C\2\u036fA\3\2"+
		"\2\2\u0370\u0371\7t\2\2\u0371\u0372\7u\2\2\u0372\u0377\5\u00b0Y\2\u0373"+
		"\u0374\7%\2\2\u0374\u0376\5\u00b0Y\2\u0375\u0373\3\2\2\2\u0376\u0379\3"+
		"\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378C\3\2\2\2\u0379\u0377"+
		"\3\2\2\2\u037a\u037b\7x\2\2\u037b\u037c\5\u0084C\2\u037cE\3\2\2\2\u037d"+
		"\u037e\7\37\2\2\u037e\u037f\5 \21\2\u037f\u0380\7 \2\2\u0380G\3\2\2\2"+
		"\u0381\u0382\7L\2\2\u0382\u0387\5J&\2\u0383\u0384\7%\2\2\u0384\u0386\5"+
		"J&\2\u0385\u0383\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388I\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038c\5h\65\2"+
		"\u038b\u038d\5v<\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u038f\7_\2\2\u038f\u0390\5F$\2\u0390K\3\2\2\2\u0391\u0394"+
		"\7\u019d\2\2\u0392\u0395\5N(\2\u0393\u0395\5R*\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0393\3\2\2\2\u0395\u039b\3\2\2\2\u0396\u0397\7J\2\2\u0397\u0399\5T+"+
		"\2\u0398\u039a\5v<\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c"+
		"\3\2\2\2\u039b\u0396\3\2\2\2\u039b\u039c\3\2\2\2\u039cM\3\2\2\2\u039d"+
		"\u03a2\5P)\2\u039e\u039f\7%\2\2\u039f\u03a1\5P)\2\u03a0\u039e\3\2\2\2"+
		"\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3O\3"+
		"\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\t\5\2\2\u03a6\u03a7\7\24\2\2\u03a7"+
		"\u03ac\5t;\2\u03a8\u03aa\7_\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2"+
		"\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\5.\30\2\u03ac\u03a9\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03adQ\3\2\2\2\u03ae\u03af\t\5\2\2\u03af\u03b0\7\25\2\2\u03b0"+
		"S\3\2\2\2\u03b1\u03b2\7*\2\2\u03b2\u03b5\5t;\2\u03b3\u03b5\5n8\2\u03b4"+
		"\u03b1\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5U\3\2\2\2\u03b6\u03b7\7)\2\2\u03b7"+
		"W\3\2\2\2\u03b8\u03c0\5Z.\2\u03b9\u03c0\5\\/\2\u03ba\u03c0\5^\60\2\u03bb"+
		"\u03c0\5`\61\2\u03bc\u03c0\5b\62\2\u03bd\u03c0\5d\63\2\u03be\u03c0\5f"+
		"\64\2\u03bf\u03b8\3\2\2\2\u03bf\u03b9\3\2\2\2\u03bf\u03ba\3\2\2\2\u03bf"+
		"\u03bb\3\2\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2"+
		"\2\2\u03c0Y\3\2\2\2\u03c1\u03c2\7\u01a1\2\2\u03c2[\3\2\2\2\u03c3\u03c5"+
		"\7\20\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2"+
		"\u03c6\u03c7\7\u01a2\2\2\u03c7]\3\2\2\2\u03c8\u03c9\t\6\2\2\u03c9\u03d0"+
		"\7\u01a1\2\2\u03ca\u03cb\7!\2\2\u03cb\u03cc\5h\65\2\u03cc\u03cd\7\u01a1"+
		"\2\2\u03cd\u03ce\7\"\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c8\3\2\2\2\u03cf"+
		"\u03ca\3\2\2\2\u03d0_\3\2\2\2\u03d1\u03d2\7\u01a3\2\2\u03d2a\3\2\2\2\u03d3"+
		"\u03d4\7\u01a4\2\2\u03d4c\3\2\2\2\u03d5\u03d6\t\7\2\2\u03d6e\3\2\2\2\u03d7"+
		"\u03d8\7j\2\2\u03d8g\3\2\2\2\u03d9\u03dc\7\u01a0\2\2\u03da\u03dc\5j\66"+
		"\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dci\3\2\2\2\u03dd\u03de"+
		"\t\b\2\2\u03dek\3\2\2\2\u03df\u03e0\5h\65\2\u03e0m\3\2\2\2\u03e1\u03e2"+
		"\5r:\2\u03e2\u03e3\7\24\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e1\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\5t;\2\u03e7o\3\2\2\2\u03e8"+
		"\u03e9\5r:\2\u03e9\u03ea\7\24\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e8\3\2"+
		"\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\5t;\2\u03eeq"+
		"\3\2\2\2\u03ef\u03f0\5h\65\2\u03f0s\3\2\2\2\u03f1\u03f2\5h\65\2\u03f2"+
		"u\3\2\2\2\u03f3\u03f4\7\37\2\2\u03f4\u03f9\5p9\2\u03f5\u03f6\7%\2\2\u03f6"+
		"\u03f8\5p9\2\u03f7\u03f5\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9\u03f7\3\2\2"+
		"\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fd"+
		"\7 \2\2\u03fdw\3\2\2\2\u03fe\u03ff\7\37\2\2\u03ff\u0404\5\u00ceh\2\u0400"+
		"\u0401\7%\2\2\u0401\u0403\5\u00ceh\2\u0402\u0400\3\2\2\2\u0403\u0406\3"+
		"\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0407\u0408\7 \2\2\u0408y\3\2\2\2\u0409\u040b\7\37\2\2"+
		"\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0411"+
		"\5n8\2\u040d\u040e\7%\2\2\u040e\u0410\5n8\2\u040f\u040d\3\2\2\2\u0410"+
		"\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0415\3\2"+
		"\2\2\u0413\u0411\3\2\2\2\u0414\u0416\7 \2\2\u0415\u0414\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416{\3\2\2\2\u0417\u0418\5h\65\2\u0418}\3\2\2\2\u0419"+
		"\u041a\t\t\2\2\u041a\177\3\2\2\2\u041b\u0421\7\37\2\2\u041c\u041f\7\u01a2"+
		"\2\2\u041d\u041e\7%\2\2\u041e\u0420\7\u01a2\2\2\u041f\u041d\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u041c\3\2\2\2\u0421\u0422\3\2"+
		"\2\2\u0422\u0423\3\2\2\2\u0423\u0424\7 \2\2\u0424\u0081\3\2\2\2\u0425"+
		"\u0427\7@\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428\u0429\7C\2\2\u0429\u0083\3\2\2\2\u042a\u042b\bC\1\2\u042b\u042c"+
		"\5\u0088E\2\u042c\u042d\5\u0084C\5\u042d\u0434\3\2\2\2\u042e\u042f\7\37"+
		"\2\2\u042f\u0430\5\u0084C\2\u0430\u0431\7 \2\2\u0431\u0434\3\2\2\2\u0432"+
		"\u0434\5\u008aF\2\u0433\u042a\3\2\2\2\u0433\u042e\3\2\2\2\u0433\u0432"+
		"\3\2\2\2\u0434\u043b\3\2\2\2\u0435\u0436\f\6\2\2\u0436\u0437\5\u0086D"+
		"\2\u0437\u0438\5\u0084C\7\u0438\u043a\3\2\2\2\u0439\u0435\3\2\2\2\u043a"+
		"\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0085\3\2"+
		"\2\2\u043d\u043b\3\2\2\2\u043e\u043f\t\n\2\2\u043f\u0087\3\2\2\2\u0440"+
		"\u0441\t\13\2\2\u0441\u0089\3\2\2\2\u0442\u0443\bF\1\2\u0443\u0444\5\u008e"+
		"H\2\u0444\u0459\3\2\2\2\u0445\u0446\f\7\2\2\u0446\u0448\7h\2\2\u0447\u0449"+
		"\7i\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u0458\t\f\2\2\u044b\u044c\f\6\2\2\u044c\u044d\7\26\2\2\u044d\u0458\5"+
		"\u008eH\2\u044e\u044f\f\5\2\2\u044f\u0450\5\u008cG\2\u0450\u0451\5\u008e"+
		"H\2\u0451\u0458\3\2\2\2\u0452\u0453\f\4\2\2\u0453\u0454\5\u008cG\2\u0454"+
		"\u0455\t\r\2\2\u0455\u0456\5F$\2\u0456\u0458\3\2\2\2\u0457\u0445\3\2\2"+
		"\2\u0457\u044b\3\2\2\2\u0457\u044e\3\2\2\2\u0457\u0452\3\2\2\2\u0458\u045b"+
		"\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u008b\3\2\2\2\u045b"+
		"\u0459\3\2\2\2\u045c\u045d\t\16\2\2\u045d\u008d\3\2\2\2\u045e\u0460\5"+
		"\u0090I\2\u045f\u0461\7i\2\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0463\7o\2\2\u0463\u0464\5F$\2\u0464\u048a\3\2\2"+
		"\2\u0465\u0467\5\u0090I\2\u0466\u0468\7i\2\2\u0467\u0466\3\2\2\2\u0467"+
		"\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7o\2\2\u046a\u046b\7\37"+
		"\2\2\u046b\u0470\5\u0084C\2\u046c\u046d\7%\2\2\u046d\u046f\5\u0084C\2"+
		"\u046e\u046c\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7 \2\2\u0474"+
		"\u048a\3\2\2\2\u0475\u0477\5\u0090I\2\u0476\u0478\7i\2\2\u0477\u0476\3"+
		"\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\7n\2\2\u047a"+
		"\u047b\5\u0090I\2\u047b\u047c\7f\2\2\u047c\u047d\5\u008eH\2\u047d\u048a"+
		"\3\2\2\2\u047e\u0480\5\u0090I\2\u047f\u0481\7i\2\2\u0480\u047f\3\2\2\2"+
		"\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7r\2\2\u0483\u0486"+
		"\5\u0092J\2\u0484\u0485\7\u00be\2\2\u0485\u0487\5\u0092J\2\u0486\u0484"+
		"\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u048a\5\u0090I"+
		"\2\u0489\u045e\3\2\2\2\u0489\u0465\3\2\2\2\u0489\u0475\3\2\2\2\u0489\u047e"+
		"\3\2\2\2\u0489\u0488\3\2\2\2\u048a\u008f\3\2\2\2\u048b\u048c\bI\1\2\u048c"+
		"\u048d\5\u0092J\2\u048d\u04ae\3\2\2\2\u048e\u048f\f\r\2\2\u048f\u0490"+
		"\7\b\2\2\u0490\u04ad\5\u0090I\16\u0491\u0492\f\f\2\2\u0492\u0493\7\t\2"+
		"\2\u0493\u04ad\5\u0090I\r\u0494\u0495\f\13\2\2\u0495\u0496\7\n\2\2\u0496"+
		"\u04ad\5\u0090I\f\u0497\u0498\f\n\2\2\u0498\u0499\7\13\2\2\u0499\u04ad"+
		"\5\u0090I\13\u049a\u049b\f\t\2\2\u049b\u049c\7\17\2\2\u049c\u04ad\5\u0090"+
		"I\n\u049d\u049e\f\b\2\2\u049e\u049f\7\20\2\2\u049f\u04ad\5\u0090I\t\u04a0"+
		"\u04a1\f\7\2\2\u04a1\u04a2\7\21\2\2\u04a2\u04ad\5\u0090I\b\u04a3\u04a4"+
		"\f\6\2\2\u04a4\u04a5\7\22\2\2\u04a5\u04ad\5\u0090I\7\u04a6\u04a7\f\5\2"+
		"\2\u04a7\u04a8\7\r\2\2\u04a8\u04ad\5\u0090I\6\u04a9\u04aa\f\4\2\2\u04aa"+
		"\u04ab\7\f\2\2\u04ab\u04ad\5\u0090I\5\u04ac\u048e\3\2\2\2\u04ac\u0491"+
		"\3\2\2\2\u04ac\u0494\3\2\2\2\u04ac\u0497\3\2\2\2\u04ac\u049a\3\2\2\2\u04ac"+
		"\u049d\3\2\2\2\u04ac\u04a0\3\2\2\2\u04ac\u04a3\3\2\2\2\u04ac\u04a6\3\2"+
		"\2\2\u04ac\u04a9\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u0091\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\bJ"+
		"\1\2\u04b2\u04d2\5\u0094K\2\u04b3\u04d2\5V,\2\u04b4\u04d2\5X-\2\u04b5"+
		"\u04d2\5p9\2\u04b6\u04b7\t\17\2\2\u04b7\u04d2\5\u0092J\b\u04b8\u04ba\7"+
		"\u00c4\2\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2"+
		"\u04bb\u04bc\7\37\2\2\u04bc\u04c1\5\u0084C\2\u04bd\u04be\7%\2\2\u04be"+
		"\u04c0\5\u0084C\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c5\7 \2\2\u04c5\u04d2\3\2\2\2\u04c6\u04c8\7m\2\2\u04c7\u04c6\3\2\2"+
		"\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04d2\5F$\2\u04ca\u04cb"+
		"\7!\2\2\u04cb\u04cc\5h\65\2\u04cc\u04cd\5\u0084C\2\u04cd\u04ce\7\"\2\2"+
		"\u04ce\u04d2\3\2\2\2\u04cf\u04d2\5\u00a6T\2\u04d0\u04d2\5\u00acW\2\u04d1"+
		"\u04b1\3\2\2\2\u04d1\u04b3\3\2\2\2\u04d1\u04b4\3\2\2\2\u04d1\u04b5\3\2"+
		"\2\2\u04d1\u04b6\3\2\2\2\u04d1\u04b9\3\2\2\2\u04d1\u04c7\3\2\2\2\u04d1"+
		"\u04ca\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d8\3\2"+
		"\2\2\u04d3\u04d4\f\t\2\2\u04d4\u04d5\7\5\2\2\u04d5\u04d7\5\u0092J\n\u04d6"+
		"\u04d3\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2"+
		"\2\2\u04d9\u0093\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04df\5\u0096L\2\u04dc"+
		"\u04df\5\u009cO\2\u04dd\u04df\5\u00a2R\2\u04de\u04db\3\2\2\2\u04de\u04dc"+
		"\3\2\2\2\u04de\u04dd\3\2\2\2\u04df\u0095\3\2\2\2\u04e0\u04e1\5\u0098M"+
		"\2\u04e1\u04e3\7\37\2\2\u04e2\u04e4\5\u009aN\2\u04e3\u04e2\3\2\2\2\u04e3"+
		"\u04e4\3\2\2\2\u04e4\u04ee\3\2\2\2\u04e5\u04ea\5\u0084C\2\u04e6\u04e7"+
		"\7%\2\2\u04e7\u04e9\5\u0084C\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\3\2\2\2"+
		"\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ef\3\2\2\2\u04ec\u04ea"+
		"\3\2\2\2\u04ed\u04ef\7\21\2\2\u04ee\u04e5\3\2\2\2\u04ee\u04ed\3\2\2\2"+
		"\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7 \2\2\u04f1\u0097"+
		"\3\2\2\2\u04f2\u04f3\t\20\2\2\u04f3\u0099\3\2\2\2\u04f4\u04f5\7N\2\2\u04f5"+
		"\u009b\3\2\2\2\u04f6\u04f9\5\u009eP\2\u04f7\u04f9\5\u00a0Q\2\u04f8\u04f6"+
		"\3\2\2\2\u04f8\u04f7\3\2\2\2\u04f9\u009d\3\2\2\2\u04fa\u04fb\7Q\2\2\u04fb"+
		"\u04fc\7\37\2\2\u04fc\u04fd\5\u0084C\2\u04fd\u04fe\7_\2\2\u04fe\u04ff"+
		"\5\u00b2Z\2\u04ff\u0500\7 \2\2\u0500\u009f\3\2\2\2\u0501\u0502\7\u0081"+
		"\2\2\u0502\u0503\7\37\2\2\u0503\u0508\5\u0084C\2\u0504\u0505\7%\2\2\u0505"+
		"\u0507\5\u0084C\2\u0506\u0504\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050d\3\2\2\2\u050a\u0508\3\2\2\2\u050b"+
		"\u050c\7]\2\2\u050c\u050e\5\u00e8u\2\u050d\u050b\3\2\2\2\u050d\u050e\3"+
		"\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\7 \2\2\u0510\u00a1\3\2\2\2\u0511"+
		"\u0512\5\u00a4S\2\u0512\u051c\7\37\2\2\u0513\u0518\5\u0084C\2\u0514\u0515"+
		"\7%\2\2\u0515\u0517\5\u0084C\2\u0516\u0514\3\2\2\2\u0517\u051a\3\2\2\2"+
		"\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051d\3\2\2\2\u051a\u0518"+
		"\3\2\2\2\u051b\u051d\7\21\2\2\u051c\u0513\3\2\2\2\u051c\u051b\3\2\2\2"+
		"\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\7 \2\2\u051f\u00a3"+
		"\3\2\2\2\u0520\u0526\5h\65\2\u0521\u0526\7a\2\2\u0522\u0526\7\u0088\2"+
		"\2\u0523\u0526\7\u0089\2\2\u0524\u0526\7\u0084\2\2\u0525\u0520\3\2\2\2"+
		"\u0525\u0521\3\2\2\2\u0525\u0522\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0524"+
		"\3\2\2\2\u0526\u00a5\3\2\2\2\u0527\u0529\7O\2\2\u0528\u052a\5\u0092J\2"+
		"\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u052d"+
		"\5\u00a8U\2\u052c\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052c\3\2\2"+
		"\2\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u0532\5\u00aaV\2\u0531"+
		"\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u00a7\3\2\2\2\u0533\u0534\7P"+
		"\2\2\u0534\u0535\5\u0084C\2\u0535\u0536\7c\2\2\u0536\u0537\5\u0084C\2"+
		"\u0537\u00a9\3\2\2\2\u0538\u0539\7b\2\2\u0539\u053a\5\u0084C\2\u053a\u00ab"+
		"\3\2\2\2\u053b\u0540\5\u00bc_\2\u053c\u0540\5\u00b6\\\2\u053d\u0540\5"+
		"\u00b8]\2\u053e\u0540\5\u00ba^\2\u053f\u053b\3\2\2\2\u053f\u053c\3\2\2"+
		"\2\u053f\u053d\3\2\2\2\u053f\u053e\3\2\2\2\u0540\u00ad\3\2\2\2\u0541\u0542"+
		"\7s\2\2\u0542\u0543\7u\2\2\u0543\u0548\5\u00b0Y\2\u0544\u0545\7%\2\2\u0545"+
		"\u0547\5\u00b0Y\2\u0546\u0544\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546"+
		"\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u0556\3\2\2\2\u054a\u0548\3\2\2\2\u054b"+
		"\u054c\7z\2\2\u054c\u054d\5\u0084C\2\u054d\u0554\t\21\2\2\u054e\u054f"+
		"\7\u018a\2\2\u054f\u0550\t\22\2\2\u0550\u0551\5\u0084C\2\u0551\u0552\t"+
		"\21\2\2\u0552\u0553\7\u018c\2\2\u0553\u0555\3\2\2\2\u0554\u054e\3\2\2"+
		"\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u054b\3\2\2\2\u0556\u0557"+
		"\3\2\2\2\u0557\u00af\3\2\2\2\u0558\u055c\5p9\2\u0559\u055c\5\\/\2\u055a"+
		"\u055c\5\u0084C\2\u055b\u0558\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055a"+
		"\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055f\t\23\2\2\u055e\u055d\3\2\2\2"+
		"\u055e\u055f\3\2\2\2\u055f\u00b1\3\2\2\2\u0560\u056c\5\u00b4[\2\u0561"+
		"\u056d\5\u0080A\2\u0562\u0563\7\37\2\2\u0563\u0564\7\u0093\2\2\u0564\u056d"+
		"\7 \2\2\u0565\u0567\7\37\2\2\u0566\u0568\t\24\2\2\u0567\u0566\3\2\2\2"+
		"\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\5\u00e8u\2\u056a"+
		"\u056b\7 \2\2\u056b\u056d\3\2\2\2\u056c\u0561\3\2\2\2\u056c\u0562\3\2"+
		"\2\2\u056c\u0565\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u00b3\3\2\2\2\u056e"+
		"\u056f\t\25\2\2\u056f\u00b5\3\2\2\2\u0570\u0574\7\u01a0\2\2\u0571\u0572"+
		"\7L\2\2\u0572\u0573\7\u0086\2\2\u0573\u0575\7\u0112\2\2\u0574\u0571\3"+
		"\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\7\u01a1\2\2"+
		"\u0577\u00b7\3\2\2\2\u0578\u0579\7Q\2\2\u0579\u057a\7\37\2\2\u057a\u057b"+
		"\5\u0084C\2\u057b\u057c\7_\2\2\u057c\u0580\5\u00b2Z\2\u057d\u057e\7\37"+
		"\2\2\u057e\u057f\7\u01a2\2\2\u057f\u0581\7 \2\2\u0580\u057d\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7 \2\2\u0583\u00b9\3\2"+
		"\2\2\u0584\u0585\7\u00dd\2\2\u0585\u0589\5\u00b2Z\2\u0586\u0587\7\37\2"+
		"\2\u0587\u0588\7\u01a2\2\2\u0588\u058a\7 \2\2\u0589\u0586\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7%\2\2\u058c\u058f\5\u0084"+
		"C\2\u058d\u058e\7%\2\2\u058e\u0590\7\u01a2\2\2\u058f\u058d\3\2\2\2\u058f"+
		"\u0590\3\2\2\2\u0590\u00bb\3\2\2\2\u0591\u0592\5\u0094K\2\u0592\u0593"+
		"\5\u00be`\2\u0593\u00bd\3\2\2\2\u0594\u0595\7\u00ff\2\2\u0595\u0597\7"+
		"\37\2\2\u0596\u0598\5\u00c0a\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2"+
		"\u0598\u059a\3\2\2\2\u0599\u059b\5\u00aeX\2\u059a\u0599\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059e\5\u00c2b\2\u059d\u059c"+
		"\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\7 \2\2\u05a0"+
		"\u00bf\3\2\2\2\u05a1\u05a2\7\u00c1\2\2\u05a2\u05a3\7u\2\2\u05a3\u05a8"+
		"\5\u0084C\2\u05a4\u05a5\7%\2\2\u05a5\u05a7\5\u0084C\2\u05a6\u05a4\3\2"+
		"\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u00c1\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ac\t\26\2\2\u05ac\u05ad\5"+
		"\u00c4c\2\u05ad\u00c3\3\2\2\2\u05ae\u05b1\5\u00caf\2\u05af\u05b1\5\u00c6"+
		"d\2\u05b0\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1\u00c5\3\2\2\2\u05b2"+
		"\u05b3\7n\2\2\u05b3\u05b4\5\u00c8e\2\u05b4\u05b5\7f\2\2\u05b5\u05b6\5"+
		"\u00c8e\2\u05b6\u00c7\3\2\2\2\u05b7\u05ba\5\u00caf\2\u05b8\u05ba\5\u00cc"+
		"g\2\u05b9\u05b7\3\2\2\2\u05b9\u05b8\3\2\2\2\u05ba\u00c9\3\2\2\2\u05bb"+
		"\u05bc\7\u00f4\2\2\u05bc\u05c2\7\u0104\2\2\u05bd\u05be\7\u01a2\2\2\u05be"+
		"\u05c2\7\u0104\2\2\u05bf\u05c0\7\u0099\2\2\u05c0\u05c2\7\u00c4\2\2\u05c1"+
		"\u05bb\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u00cb\3\2"+
		"\2\2\u05c3\u05c4\7\u00f4\2\2\u05c4\u05ca\7\u00ee\2\2\u05c5\u05c6\7\u01a2"+
		"\2\2\u05c6\u05ca\7\u00ee\2\2\u05c7\u05c8\7\u0099\2\2\u05c8\u05ca\7\u00c4"+
		"\2\2\u05c9\u05c3\3\2\2\2\u05c9\u05c5\3\2\2\2\u05c9\u05c7\3\2\2\2\u05ca"+
		"\u00cd\3\2\2\2\u05cb\u05cd\5p9\2\u05cc\u05ce\t\23\2\2\u05cd\u05cc\3\2"+
		"\2\2\u05cd\u05ce\3\2\2\2\u05ce\u00cf\3\2\2\2\u05cf\u05d0\7\u00ed\2\2\u05d0"+
		"\u05d1\7\30\2\2\u05d1\u05dd\7\u01a2\2\2\u05d2\u05dd\5\u00d6l\2\u05d3\u05d4"+
		"\t\27\2\2\u05d4\u05dd\5\u00d4k\2\u05d5\u05d6\7\u00f8\2\2\u05d6\u05d7\7"+
		"\30\2\2\u05d7\u05dd\7\u01a2\2\2\u05d8\u05da\5\u00d2j\2\u05d9\u05db\5\u00dc"+
		"o\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc"+
		"\u05cf\3\2\2\2\u05dc\u05d2\3\2\2\2\u05dc\u05d3\3\2\2\2\u05dc\u05d5\3\2"+
		"\2\2\u05dc\u05d8\3\2\2\2\u05dd\u00d1\3\2\2\2\u05de\u05df\7\u016a\2\2\u05df"+
		"\u05e0\7\30\2\2\u05e0\u05e1\t\30\2\2\u05e1\u00d3\3\2\2\2\u05e2\u05e3\7"+
		"\30\2\2\u05e3\u05e5\7\u01a2\2\2\u05e4\u05e6\7\u00e3\2\2\u05e5\u05e4\3"+
		"\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u00d5\3\2\2\2\u05e7\u05e8\5\u00d8m\2"+
		"\u05e8\u05e9\5\u00dan\2\u05e9\u00d7\3\2\2\2\u05ea\u05eb\t\31\2\2\u05eb"+
		"\u00d9\3\2\2\2\u05ec\u05ed\7\30\2\2\u05ed\u05ee\t\32\2\2\u05ee\u00db\3"+
		"\2\2\2\u05ef\u05f0\7`\2\2\u05f0\u05f1\7\u00c2\2\2\u05f1\u05f2\7\37\2\2"+
		"\u05f2\u05f3\5\u00dep\2\u05f3\u05f4\7 \2\2\u05f4\u00dd\3\2\2\2\u05f5\u05fa"+
		"\5\u00e0q\2\u05f6\u05f7\7%\2\2\u05f7\u05f9\5\u00e0q\2\u05f8\u05f6\3\2"+
		"\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u00df\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u0600\7\u01a2\2\2\u05fe\u0600"+
		"\5\u00e2r\2\u05ff\u05fd\3\2\2\2\u05ff\u05fe\3\2\2\2\u0600\u00e1\3\2\2"+
		"\2\u0601\u0602\7\u01a2\2\2\u0602\u0603\7e\2\2\u0603\u0604\7\u01a2\2\2"+
		"\u0604\u00e3\3\2\2\2\u0605\u0606\7\u0170\2\2\u0606\u0607\7\37\2\2\u0607"+
		"\u0608\7\u0179\2\2\u0608\u0609\7\30\2\2\u0609\u060b\7\u01a2\2\2\u060a"+
		"\u060c\7\u00e3\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d"+
		"\3\2\2\2\u060d\u060e\7%\2\2\u060e\u060f\7\u0160\2\2\u060f\u0610\7\30\2"+
		"\2\u0610\u0611\t\33\2\2\u0611\u0612\7 \2\2\u0612\u00e5\3\2\2\2\u0613\u0618"+
		"\7`\2\2\u0614\u0615\7\37\2\2\u0615\u0616\5\u00e4s\2\u0616\u0617\7 \2\2"+
		"\u0617\u0619\3\2\2\2\u0618\u0614\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u00e7"+
		"\3\2\2\2\u061a\u061b\7\u01a0\2\2\u061b\u00e9\3\2\2\2\u061c\u0621\5\u00e8"+
		"u\2\u061d\u061e\7%\2\2\u061e\u0620\5\u00e8u\2\u061f\u061d\3\2\2\2\u0620"+
		"\u0623\3\2\2\2\u0621\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u00eb\3\2"+
		"\2\2\u0623\u0621\3\2\2\2\u0624\u0625\7\3\2\2\u0625\u00ed\3\2\2\2\u0626"+
		"\u0627\7\63\2\2\u0627\u0628\7<\2\2\u0628\u0629\5n8\2\u0629\u062a\5\u00fc"+
		"\177\2\u062a\u062b\5\u00fe\u0080\2\u062b\u00ef\3\2\2\2\u062c\u062d\7\63"+
		"\2\2\u062d\u062e\5\u0164\u00b3\2\u062e\u062f\7>\2\2\u062f\u0630\5|?\2"+
		"\u0630\u0631\7`\2\2\u0631\u0632\5n8\2\u0632\u0633\5x=\2\u0633\u00f1\3"+
		"\2\2\2\u0634\u0635\7\64\2\2\u0635\u0636\7<\2\2\u0636\u0637\5n8\2\u0637"+
		"\u063c\5\u0166\u00b4\2\u0638\u0639\7%\2\2\u0639\u063b\5\u0166\u00b4\2"+
		"\u063a\u0638\3\2\2\2\u063b\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d"+
		"\3\2\2\2\u063d\u00f3\3\2\2\2\u063e\u063c\3\2\2\2\u063f\u0640\7\64\2\2"+
		"\u0640\u0643\7>\2\2\u0641\u0644\5|?\2\u0642\u0644\7p\2\2\u0643\u0641\3"+
		"\2\2\2\u0643\u0642\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\7`\2\2\u0646"+
		"\u0647\5n8\2\u0647\u00f5\3\2\2\2\u0648\u0649\7\65\2\2\u0649\u064b\7<\2"+
		"\2\u064a\u064c\5\u01ac\u00d7\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2"+
		"\u064c\u064d\3\2\2\2\u064d\u064e\5z>\2\u064e\u00f7\3\2\2\2\u064f\u0650"+
		"\7\65\2\2\u0650\u0652\7>\2\2\u0651\u0653\5\u01ac\u00d7\2\u0652\u0651\3"+
		"\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5|?\2\u0655"+
		"\u0656\7`\2\2\u0656\u0657\5n8\2\u0657\u00f9\3\2\2\2\u0658\u0659\7\66\2"+
		"\2\u0659\u065a\7<\2\2\u065a\u065b\5n8\2\u065b\u00fb\3\2\2\2\u065c\u065d"+
		"\7_\2\2\u065d\u065f\7\u00ec\2\2\u065e\u065c\3\2\2\2\u065e\u065f\3\2\2"+
		"\2\u065f\u00fd\3\2\2\2\u0660\u0661\5\u0100\u0081\2\u0661\u0662\5\u014e"+
		"\u00a8\2\u0662\u0663\5\u0150\u00a9\2\u0663\u00ff\3\2\2\2\u0664\u0665\7"+
		"\37\2\2\u0665\u066a\5\u0102\u0082\2\u0666\u0667\7%\2\2\u0667\u0669\5\u0102"+
		"\u0082\2\u0668\u0666\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a"+
		"\u066b\3\2\2\2\u066b\u066f\3\2\2\2\u066c\u066a\3\2\2\2\u066d\u066e\7%"+
		"\2\2\u066e\u0670\5\u014c\u00a7\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2"+
		"\2\u0670\u0671\3\2\2\2\u0671\u0672\7 \2\2\u0672\u0101\3\2\2\2\u0673\u0679"+
		"\5\u0104\u0083\2\u0674\u0679\5\u0134\u009b\2\u0675\u0679\5\u0136\u009c"+
		"\2\u0676\u0679\5\u0138\u009d\2\u0677\u0679\5\u0146\u00a4\2\u0678\u0673"+
		"\3\2\2\2\u0678\u0674\3\2\2\2\u0678\u0675\3\2\2\2\u0678\u0676\3\2\2\2\u0678"+
		"\u0677\3\2\2\2\u0679\u0103\3\2\2\2\u067a\u067b\5p9\2\u067b\u067f\5\u00b2"+
		"Z\2\u067c\u067e\5\u0106\u0084\2\u067d\u067c\3\2\2\2\u067e\u0681\3\2\2"+
		"\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0682\3\2\2\2\u0681\u067f"+
		"\3\2\2\2\u0682\u0684\5\u0132\u009a\2\u0683\u0685\5\u0128\u0095\2\u0684"+
		"\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0105\3\2\2\2\u0686\u06bc\7\u00eb"+
		"\2\2\u0687\u0688\7\u00da\2\2\u0688\u06bc\5~@\2\u0689\u06bc\7\u010e\2\2"+
		"\u068a\u068b\7\u00f7\2\2\u068b\u068c\7L\2\2\u068c\u068d\7\37\2\2\u068d"+
		"\u068e\7F\2\2\u068e\u068f\7\30\2\2\u068f\u0690\7\u01a1\2\2\u0690\u06bc"+
		"\7 \2\2\u0691\u0692\7?\2\2\u0692\u0694\5\u00e8u\2\u0693\u0691\3\2\2\2"+
		"\u0693\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\7\u0098\2\2\u0696"+
		"\u06bc\5\u0084C\2\u0697\u069d\7\u00f1\2\2\u0698\u0699\7\37\2\2\u0699\u069a"+
		"\7\u01a2\2\2\u069a\u069b\7%\2\2\u069b\u069c\7\u01a2\2\2\u069c\u069e\7"+
		" \2\2\u069d\u0698\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06bc\3\2\2\2\u069f"+
		"\u06a0\7i\2\2\u06a0\u06a1\7d\2\2\u06a1\u06bc\7\u0109\2\2\u06a2\u06a3\7"+
		"\u00cb\2\2\u06a3\u06a4\7\u00c8\2\2\u06a4\u06a5\7_\2\2\u06a5\u06a6\7\u00c4"+
		"\2\2\u06a6\u06a8\t\34\2\2\u06a7\u06a9\7\u00bf\2\2\u06a8\u06a7\3\2\2\2"+
		"\u06a8\u06a9\3\2\2\2\u06a9\u06bc\3\2\2\2\u06aa\u06ac\7i\2\2\u06ab\u06aa"+
		"\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06bc\7j\2\2\u06ae"+
		"\u06bc\7\u010b\2\2\u06af\u06b0\7\u00e9\2\2\u06b0\u06b1\7L\2\2\u06b1\u06bc"+
		"\5\u0108\u0085\2\u06b2\u06b7\5\u010a\u0086\2\u06b3\u06b4\7%\2\2\u06b4"+
		"\u06b6\5\u010a\u0086\2\u06b5\u06b3\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5"+
		"\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06bc\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba"+
		"\u06bc\5\u0128\u0095\2\u06bb\u0686\3\2\2\2\u06bb\u0687\3\2\2\2\u06bb\u0689"+
		"\3\2\2\2\u06bb\u068a\3\2\2\2\u06bb\u0693\3\2\2\2\u06bb\u0697\3\2\2\2\u06bb"+
		"\u069f\3\2\2\2\u06bb\u06a2\3\2\2\2\u06bb\u06ab\3\2\2\2\u06bb\u06ae\3\2"+
		"\2\2\u06bb\u06af\3\2\2\2\u06bb\u06b2\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc"+
		"\u0107\3\2\2\2\u06bd\u06be\7\37\2\2\u06be\u06bf\7\u0166\2\2\u06bf\u06c0"+
		"\7\30\2\2\u06c0\u06c1\5\u00e8u\2\u06c1\u06c2\7%\2\2\u06c2\u06c3\7\u016c"+
		"\2\2\u06c3\u06c4\7\30\2\2\u06c4\u06c5\t\35\2\2\u06c5\u06c6\7%\2\2\u06c6"+
		"\u06c7\7\u00d5\2\2\u06c7\u06c8\7\30\2\2\u06c8\u06c9\7\u01a1\2\2\u06c9"+
		"\u06ca\7 \2\2\u06ca\u0109\3\2\2\2\u06cb\u06cc\7?\2\2\u06cc\u06ce\5\u00e8"+
		"u\2\u06cd\u06cb\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d2\3\2\2\2\u06cf"+
		"\u06d3\5\u010c\u0087\2\u06d0\u06d3\5\u0120\u0091\2\u06d1\u06d3\5\u0126"+
		"\u0094\2\u06d2\u06cf\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d1\3\2\2\2\u06d3"+
		"\u010b\3\2\2\2\u06d4\u06d7\5\u0082B\2\u06d5\u06d7\7A\2\2\u06d6\u06d4\3"+
		"\2\2\2\u06d6\u06d5\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06db\5\u010e\u0088"+
		"\2\u06d9\u06db\5\u011c\u008f\2\u06da\u06d8\3\2\2\2\u06da\u06d9\3\2\2\2"+
		"\u06db\u010d\3\2\2\2\u06dc\u06de\5\u0110\u0089\2\u06dd\u06dc\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06e1\5\u0112\u008a\2\u06e0\u06df"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e4\5\u0114\u008b"+
		"\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u010f\3\2\2\2\u06e5\u06e6"+
		"\t\36\2\2\u06e6\u0111\3\2\2\2\u06e7\u06f6\7L\2\2\u06e8\u06e9\7\u00ed\2"+
		"\2\u06e9\u06ea\7\30\2\2\u06ea\u06f7\7\u01a2\2\2\u06eb\u06ec\7\37\2\2\u06ec"+
		"\u06f1\5\u00d0i\2\u06ed\u06ee\7%\2\2\u06ee\u06f0\5\u00d0i\2\u06ef\u06ed"+
		"\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f4\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f5\7 \2\2\u06f5\u06f7\3\2"+
		"\2\2\u06f6\u06e8\3\2\2\2\u06f6\u06eb\3\2\2\2\u06f7\u0113\3\2\2\2\u06f8"+
		"\u06fc\5\u0116\u008c\2\u06f9\u06fc\5\u0118\u008d\2\u06fa\u06fc\5\u011a"+
		"\u008e\2\u06fb\u06f8\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fa\3\2\2\2\u06fc"+
		"\u0115\3\2\2\2\u06fd\u06fe\7`\2\2\u06fe\u06ff\5l\67\2\u06ff\u0700\7\37"+
		"\2\2\u0700\u0701\5p9\2\u0701\u0702\7 \2\2\u0702\u0117\3\2\2\2\u0703\u0704"+
		"\7`\2\2\u0704\u0705\5\u00e8u\2\u0705\u0119\3\2\2\2\u0706\u0707\7`\2\2"+
		"\u0707\u0708\7\u01a1\2\2\u0708\u011b\3\2\2\2\u0709\u070b\7\u00d8\2\2\u070a"+
		"\u070c\5\u011e\u0090\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u011d"+
		"\3\2\2\2\u070d\u070e\7L\2\2\u070e\u070f\7\37\2\2\u070f\u0710\7\u0164\2"+
		"\2\u0710\u0711\7\30\2\2\u0711\u0712\7\u01a2\2\2\u0712\u0713\7 \2\2\u0713"+
		"\u011f\3\2\2\2\u0714\u0715\7B\2\2\u0715\u0717\7C\2\2\u0716\u0714\3\2\2"+
		"\2\u0716\u0717\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\7\u00cf\2\2\u0719"+
		"\u071a\5n8\2\u071a\u071b\7\37\2\2\u071b\u071c\5p9\2\u071c\u0720\7 \2\2"+
		"\u071d\u071f\5\u0122\u0092\2\u071e\u071d\3\2\2\2\u071f\u0722\3\2\2\2\u0720"+
		"\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0121\3\2\2\2\u0722\u0720\3\2"+
		"\2\2\u0723\u0724\7`\2\2\u0724\u0725\t\37\2\2\u0725\u072a\5\u0124\u0093"+
		"\2\u0726\u0727\7i\2\2\u0727\u0728\7d\2\2\u0728\u072a\7\u0109\2\2\u0729"+
		"\u0723\3\2\2\2\u0729\u0726\3\2\2\2\u072a\u0123\3\2\2\2\u072b\u072c\7\u00cc"+
		"\2\2\u072c\u0731\7\u00d4\2\2\u072d\u0731\7\u00c9\2\2\u072e\u072f\7;\2"+
		"\2\u072f\u0731\t \2\2\u0730\u072b\3\2\2\2\u0730\u072d\3\2\2\2\u0730\u072e"+
		"\3\2\2\2\u0731\u0125\3\2\2\2\u0732\u0736\7\u00ca\2\2\u0733\u0734\7i\2"+
		"\2\u0734\u0735\7d\2\2\u0735\u0737\7\u0109\2\2\u0736\u0733\3\2\2\2\u0736"+
		"\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\7\37\2\2\u0739\u073a\5"+
		"\u0084C\2\u073a\u073b\7 \2\2\u073b\u0127\3\2\2\2\u073c\u073d\7>\2\2\u073d"+
		"\u073f\5|?\2\u073e\u0740\5\u0110\u0089\2\u073f\u073e\3\2\2\2\u073f\u0740"+
		"\3\2\2\2\u0740\u0742\3\2\2\2\u0741\u0743\5\u012a\u0096\2\u0742\u0741\3"+
		"\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0746\5\u012c\u0097"+
		"\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0748\3\2\2\2\u0747\u0749"+
		"\5\u0130\u0099\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u0129\3"+
		"\2\2\2\u074a\u074b\7L\2\2\u074b\u074c\7\37\2\2\u074c\u0751\5\u00d0i\2"+
		"\u074d\u074e\7%\2\2\u074e\u0750\5\u00d0i\2\u074f\u074d\3\2\2\2\u0750\u0753"+
		"\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0754\3\2\2\2\u0753"+
		"\u0751\3\2\2\2\u0754\u0755\7 \2\2\u0755\u012b\3\2\2\2\u0756\u075a\5\u0116"+
		"\u008c\2\u0757\u075a\5\u0118\u008d\2\u0758\u075a\5\u012e\u0098\2\u0759"+
		"\u0756\3\2\2\2\u0759\u0757\3\2\2\2\u0759\u0758\3\2\2\2\u075a\u012d\3\2"+
		"\2\2\u075b\u075c\7`\2\2\u075c\u075d\7\u0098\2\2\u075d\u012f\3\2\2\2\u075e"+
		"\u0762\7\u017e\2\2\u075f\u0763\5\u00e8u\2\u0760\u0763\5l\67\2\u0761\u0763"+
		"\7\u01a1\2\2\u0762\u075f\3\2\2\2\u0762\u0760\3\2\2\2\u0762\u0761\3\2\2"+
		"\2\u0763\u0131\3\2\2\2\u0764\u0769\5\u010a\u0086\2\u0765\u0766\7%\2\2"+
		"\u0766\u0768\5\u010a\u0086\2\u0767\u0765\3\2\2\2\u0768\u076b\3\2\2\2\u0769"+
		"\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076d\3\2\2\2\u076b\u0769\3\2"+
		"\2\2\u076c\u0764\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0133\3\2\2\2\u076e"+
		"\u076f\5p9\2\u076f\u0770\7_\2\2\u0770\u0776\5\u0084C\2\u0771\u0774\7\u0103"+
		"\2\2\u0772\u0773\7i\2\2\u0773\u0775\7j\2\2\u0774\u0772\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0777\3\2\2\2\u0776\u0771\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0779\3\2\2\2\u0778\u077a\5\u010a\u0086\2\u0779\u0778\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u0135\3\2\2\2\u077b\u077c\5\u00e8u\2\u077c\u077d\7\u01a0"+
		"\2\2\u077d\u077e\7\u0167\2\2\u077e\u077f\7d\2\2\u077f\u0780\7\u0163\2"+
		"\2\u0780\u0137\3\2\2\2\u0781\u0782\7?\2\2\u0782\u0784\5\u00e8u\2\u0783"+
		"\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0788\3\2\2\2\u0785\u0789\5\u013a"+
		"\u009e\2\u0786\u0789\5\u0144\u00a3\2\u0787\u0789\5\u0126\u0094\2\u0788"+
		"\u0785\3\2\2\2\u0788\u0786\3\2\2\2\u0788\u0787\3\2\2\2\u0789\u0139\3\2"+
		"\2\2\u078a\u078d\5\u013c\u009f\2\u078b\u078e\5\u013e\u00a0\2\u078c\u078e"+
		"\5\u0140\u00a1\2\u078d\u078b\3\2\2\2\u078d\u078c\3\2\2\2\u078e\u013b\3"+
		"\2\2\2\u078f\u0792\5\u0082B\2\u0790\u0792\7A\2\2\u0791\u078f\3\2\2\2\u0791"+
		"\u0790\3\2\2\2\u0792\u013d\3\2\2\2\u0793\u0795\5\u0110\u0089\2\u0794\u0793"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0798\5v<\2\u0797"+
		"\u0799\5\u0112\u008a\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079b"+
		"\3\2\2\2\u079a\u079c\5\u0114\u008b\2\u079b\u079a\3\2\2\2\u079b\u079c\3"+
		"\2\2\2\u079c\u013f\3\2\2\2\u079d\u07a0\7\u00d9\2\2\u079e\u07a1\5v<\2\u079f"+
		"\u07a1\5\u0142\u00a2\2\u07a0\u079e\3\2\2\2\u07a0\u079f\3\2\2\2\u07a1\u0141"+
		"\3\2\2\2\u07a2\u07a3\7\u00ef\2\2\u07a3\u07a4\5v<\2\u07a4\u07a5\5\u011e"+
		"\u0090\2\u07a5\u0143\3\2\2\2\u07a6\u07a7\7B\2\2\u07a7\u07a9\7C\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\5v"+
		"<\2\u07ab\u07ac\7\u00cf\2\2\u07ac\u07ad\5n8\2\u07ad\u07b1\5v<\2\u07ae"+
		"\u07b0\5\u0122\u0092\2\u07af\u07ae\3\2\2\2\u07b0\u07b3\3\2\2\2\u07b1\u07af"+
		"\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u0145\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b4"+
		"\u07b5\7>\2\2\u07b5\u07b6\5|?\2\u07b6\u07b9\5\u0148\u00a5\2\u07b7\u07b8"+
		"\7L\2\2\u07b8\u07ba\5\u014a\u00a6\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3"+
		"\2\2\2\u07ba\u07bc\3\2\2\2\u07bb\u07bd\5\u012c\u0097\2\u07bc\u07bb\3\2"+
		"\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07bf\3\2\2\2\u07be\u07c0\5\u0130\u0099"+
		"\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u0147\3\2\2\2\u07c1\u07c3"+
		"\5\u0110\u0089\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3"+
		"\2\2\2\u07c4\u07cd\5v<\2\u07c5\u07c6\7\u00d8\2\2\u07c6\u07cd\7\u00db\2"+
		"\2\u07c7\u07c9\7\u00d9\2\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9"+
		"\u07ca\3\2\2\2\u07ca\u07cb\7\u00db\2\2\u07cb\u07cd\5v<\2\u07cc\u07c2\3"+
		"\2\2\2\u07cc\u07c5\3\2\2\2\u07cc\u07c8\3\2\2\2\u07cd\u0149\3\2\2\2\u07ce"+
		"\u07cf\7\37\2\2\u07cf\u07d4\5\u00d0i\2\u07d0\u07d1\7%\2\2\u07d1\u07d3"+
		"\5\u00d0i\2\u07d2\u07d0\3\2\2\2\u07d3\u07d6\3\2\2\2\u07d4\u07d2\3\2\2"+
		"\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d7\u07d8"+
		"\7 \2\2\u07d8\u014b\3\2\2\2\u07d9\u07da\7\u0102\2\2\u07da\u07db\7d\2\2"+
		"\u07db\u07dc\7\u016d\2\2\u07dc\u07dd\7\37\2\2\u07dd\u07de\5p9\2\u07de"+
		"\u07df\7%\2\2\u07df\u07e0\5p9\2\u07e0\u07e1\7 \2\2\u07e1\u014d\3\2\2\2"+
		"\u07e2\u07ea\7`\2\2\u07e3\u07e4\5l\67\2\u07e4\u07e5\7\37\2\2\u07e5\u07e6"+
		"\5p9\2\u07e6\u07e7\7 \2\2\u07e7\u07eb\3\2\2\2\u07e8\u07eb\5\u00e8u\2\u07e9"+
		"\u07eb\7\u01a1\2\2\u07ea\u07e3\3\2\2\2\u07ea\u07e8\3\2\2\2\u07ea\u07e9"+
		"\3\2\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07e2\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed"+
		"\u014f\3\2\2\2\u07ee\u07f1\7\u016f\2\2\u07ef\u07f2\5\u00e8u\2\u07f0\u07f2"+
		"\7\u01a1\2\2\u07f1\u07ef\3\2\2\2\u07f1\u07f0\3\2\2\2\u07f2\u07f4\3\2\2"+
		"\2\u07f3\u07ee\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07fc\3\2\2\2\u07f5\u07f6"+
		"\7\u017e\2\2\u07f6\u07fb\5l\67\2\u07f7\u07f8\5\u00e8u\2\u07f8\u07f9\7"+
		"\u01a1\2\2\u07f9\u07fb\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fa\u07f7\3\2\2\2"+
		"\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0800"+
		"\3\2\2\2\u07fe\u07ff\7L\2\2\u07ff\u0801\5\u0152\u00aa\2\u0800\u07fe\3"+
		"\2\2\2\u0800\u0801\3\2\2\2\u0801\u0151\3\2\2\2\u0802\u0803\7\37\2\2\u0803"+
		"\u0808\5\u0154\u00ab\2\u0804\u0805\7%\2\2\u0805\u0807\5\u0154\u00ab\2"+
		"\u0806\u0804\3\2\2\2\u0807\u080a\3\2\2\2\u0808\u0806\3\2\2\2\u0808\u0809"+
		"\3\2\2\2\u0809\u080b\3\2\2\2\u080a\u0808\3\2\2\2\u080b\u080c\7 \2\2\u080c"+
		"\u0153\3\2\2\2\u080d\u080e\7\u016a\2\2\u080e\u080f\7\30\2\2\u080f\u0816"+
		"\t!\2\2\u0810\u0811\7`\2\2\u0811\u0812\7\u00c2\2\2\u0812\u0813\7\37\2"+
		"\2\u0813\u0814\5\u00dep\2\u0814\u0815\7 \2\2\u0815\u0817\3\2\2\2\u0816"+
		"\u0810\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u083e\3\2\2\2\u0818\u0819\7\u0180"+
		"\2\2\u0819\u081a\7\30\2\2\u081a\u083e\5\u00e8u\2\u081b\u081c\7\u017f\2"+
		"\2\u081c\u081f\7\30\2\2\u081d\u0820\5~@\2\u081e\u0820\7\u0169\2\2\u081f"+
		"\u081d\3\2\2\2\u081f\u081e\3\2\2\2\u0820\u083e\3\2\2\2\u0821\u0822\7\u0182"+
		"\2\2\u0822\u0823\7\30\2\2\u0823\u083e\5\u00e8u\2\u0824\u0825\7\u0183\2"+
		"\2\u0825\u0826\7\30\2\2\u0826\u083e\5\u00e8u\2\u0827\u0828\7\u0181\2\2"+
		"\u0828\u0829\7\30\2\2\u0829\u083e\5\u00e8u\2\u082a\u082b\7\u016e\2\2\u082b"+
		"\u082c\7\30\2\2\u082c\u082e\7`\2\2\u082d\u082f\5\u01aa\u00d6\2\u082e\u082d"+
		"\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u083e\3\2\2\2\u0830\u0831\7\u017d\2"+
		"\2\u0831\u0838\7\30\2\2\u0832\u0834\7`\2\2\u0833\u0835\5\u0156\u00ac\2"+
		"\u0834\u0833\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0839\3\2\2\2\u0836\u0837"+
		"\7\u00fd\2\2\u0837\u0839\5\u015a\u00ae\2\u0838\u0832\3\2\2\2\u0838\u0836"+
		"\3\2\2\2\u0839\u083e\3\2\2\2\u083a\u083e\5\u015c\u00af\2\u083b\u083e\5"+
		"\u015e\u00b0\2\u083c\u083e\5\u0160\u00b1\2\u083d\u080d\3\2\2\2\u083d\u0818"+
		"\3\2\2\2\u083d\u081b\3\2\2\2\u083d\u0821\3\2\2\2\u083d\u0824\3\2\2\2\u083d"+
		"\u0827\3\2\2\2\u083d\u082a\3\2\2\2\u083d\u0830\3\2\2\2\u083d\u083a\3\2"+
		"\2\2\u083d\u083b\3\2\2\2\u083d\u083c\3\2\2\2\u083e\u0155\3\2\2\2\u083f"+
		"\u0840\7\37\2\2\u0840\u0845\5\u0156\u00ac\2\u0841\u0842\7%\2\2\u0842\u0844"+
		"\5\u0156\u00ac\2\u0843\u0841\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3"+
		"\2\2\2\u0845\u0846\3\2\2\2\u0846\u0848\3\2\2\2\u0847\u0845\3\2\2\2\u0848"+
		"\u0849\7 \2\2\u0849\u0157\3\2\2\2\u084a\u084b\7\u0184\2\2\u084b\u084e"+
		"\7\30\2\2\u084c\u084f\7j\2\2\u084d\u084f\5\u0094K\2\u084e\u084c\3\2\2"+
		"\2\u084e\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\7%\2\2\u0851\u084a"+
		"\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\7\u017b\2"+
		"\2\u0854\u0855\7\30\2\2\u0855\u0856\t\"\2\2\u0856\u0159\3\2\2\2\u0857"+
		"\u0858\7\37\2\2\u0858\u0859\7\u017b\2\2\u0859\u085a\7\30\2\2\u085a\u085b"+
		"\7\u0101\2\2\u085b\u085c\7 \2\2\u085c\u015b\3\2\2\2\u085d\u085e\7\u017a"+
		"\2\2\u085e\u085f\7\30\2\2\u085f\u086a\7`\2\2\u0860\u0861\7\u00e8\2\2\u0861"+
		"\u0862\7\30\2\2\u0862\u086a\t#\2\2\u0863\u0864\7\u016e\2\2\u0864\u0865"+
		"\7\30\2\2\u0865\u0867\7`\2\2\u0866\u0868\5\u01aa\u00d6\2\u0867\u0866\3"+
		"\2\2\2\u0867\u0868\3\2\2\2\u0868\u086a\3\2\2\2\u0869\u085d\3\2\2\2\u0869"+
		"\u0860\3\2\2\2\u0869\u0863\3\2\2\2\u086a\u015d\3\2\2\2\u086b\u086c\7\u00e6"+
		"\2\2\u086c\u0874\7\30\2\2\u086d\u086e\7\u00ef\2\2\u086e\u086f\7\37\2\2"+
		"\u086f\u0870\5p9\2\u0870\u0871\7 \2\2\u0871\u0875\3\2\2\2\u0872\u0875"+
		"\7\u0173\2\2\u0873\u0875\7\u0108\2\2\u0874\u086d\3\2\2\2\u0874\u0872\3"+
		"\2\2\2\u0874\u0873\3\2\2\2\u0875\u015f\3\2\2\2\u0876\u0877\7\u00d8\2\2"+
		"\u0877\u0878\7\u00db\2\2\u0878\u087c\7>\2\2\u0879\u087c\7\u00f0\2\2\u087a"+
		"\u087c\5\u0162\u00b2\2\u087b\u0876\3\2\2\2\u087b\u0879\3\2\2\2\u087b\u087a"+
		"\3\2\2\2\u087c\u0161\3\2\2\2\u087d\u087e\7\u00c1\2\2\u087e\u087f\7\37"+
		"\2\2\u087f\u0880\5p9\2\u0880\u0882\7\u0106\2\2\u0881\u0883\t$\2\2\u0882"+
		"\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\7d"+
		"\2\2\u0885\u0886\7K\2\2\u0886\u0887\7\37\2\2\u0887\u088c\5\u0092J\2\u0888"+
		"\u0889\7%\2\2\u0889\u088b\5\u0092J\2\u088a\u0888\3\2\2\2\u088b\u088e\3"+
		"\2\2\2\u088c\u088a\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088f\3\2\2\2\u088e"+
		"\u088c\3\2\2\2\u088f\u0890\7 \2\2\u0890\u0891\7 \2\2\u0891\u0163\3\2\2"+
		"\2\u0892\u0894\7A\2\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0896"+
		"\3\2\2\2\u0895\u0897\5\u0110\u0089\2\u0896\u0895\3\2\2\2\u0896\u0897\3"+
		"\2\2\2\u0897\u0165\3\2\2\2\u0898\u08a2\5\u0168\u00b5\2\u0899\u08a2\5\u016a"+
		"\u00b6\2\u089a\u08a2\5\u017a\u00be\2\u089b\u08a2\5\u018a\u00c6\2\u089c"+
		"\u08a2\5\u018c\u00c7\2\u089d\u08a2\5\u018e\u00c8\2\u089e\u08a2\5\u0190"+
		"\u00c9\2\u089f\u08a2\5\u01a8\u00d5\2\u08a0\u08a2\7\u0107\2\2\u08a1\u0898"+
		"\3\2\2\2\u08a1\u0899\3\2\2\2\u08a1\u089a\3\2\2\2\u08a1\u089b\3\2\2\2\u08a1"+
		"\u089c\3\2\2\2\u08a1\u089d\3\2\2\2\u08a1\u089e\3\2\2\2\u08a1\u089f\3\2"+
		"\2\2\u08a1\u08a0\3\2\2\2\u08a2\u0167\3\2\2\2\u08a3\u08a4\7L\2\2\u08a4"+
		"\u08a6\t%\2\2\u08a5\u08a3\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2"+
		"\2\2\u08a7\u08aa\7:\2\2\u08a8\u08ab\5\u016e\u00b8\2\u08a9\u08ab\5\u0174"+
		"\u00bb\2\u08aa\u08a8\3\2\2\2\u08aa\u08a9\3\2\2\2\u08ab\u0169\3\2\2\2\u08ac"+
		"\u08ad\5\u016c\u00b7\2\u08ad\u08b0\5\u00b2Z\2\u08ae\u08af\7\u00da\2\2"+
		"\u08af\u08b1\5~@\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b5"+
		"\3\2\2\2\u08b2\u08b6\7j\2\2\u08b3\u08b4\7i\2\2\u08b4\u08b6\7j\2\2\u08b5"+
		"\u08b2\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b8\3\2"+
		"\2\2\u08b7\u08b9\7\u010e\2\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9"+
		"\u016b\3\2\2\2\u08ba\u08bb\7\64\2\2\u08bb\u08bc\7=\2\2\u08bc\u08bd\5p"+
		"9\2\u08bd\u016d\3\2\2\2\u08be\u08c3\5\u0170\u00b9\2\u08bf\u08c0\7%\2\2"+
		"\u08c0\u08c2\5\u0170\u00b9\2\u08c1\u08bf\3\2\2\2\u08c2\u08c5\3\2\2\2\u08c3"+
		"\u08c1\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u016f\3\2\2\2\u08c5\u08c3\3\2"+
		"\2\2\u08c6\u08cd\5\u0104\u0083\2\u08c7\u08cd\5\u0134\u009b\2\u08c8\u08cd"+
		"\5\u0136\u009c\2\u08c9\u08cd\5\u0138\u009d\2\u08ca\u08cd\5\u019e\u00d0"+
		"\2\u08cb\u08cd\5\u0172\u00ba\2\u08cc\u08c6\3\2\2\2\u08cc\u08c7\3\2\2\2"+
		"\u08cc\u08c8\3\2\2\2\u08cc\u08c9\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cc\u08cb"+
		"\3\2\2\2\u08cd\u0171\3\2\2\2\u08ce\u08cf\7?\2\2\u08cf\u08d1\5\u00e8u\2"+
		"\u08d0\u08ce\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3"+
		"\7\u0098\2\2\u08d3\u08d4\5\u0092J\2\u08d4\u08d5\7d\2\2\u08d5\u08d6\5p"+
		"9\2\u08d6\u0173\3\2\2\2\u08d7\u08d8\5\u0176\u00bc\2\u08d8\u08d9\7%\2\2"+
		"\u08d9\u08da\5\u014c\u00a7\2\u08da\u08e0\3\2\2\2\u08db\u08dc\5\u014c\u00a7"+
		"\2\u08dc\u08dd\7%\2\2\u08dd\u08de\5\u0176\u00bc\2\u08de\u08e0\3\2\2\2"+
		"\u08df\u08d7\3\2\2\2\u08df\u08db\3\2\2\2\u08e0\u0175\3\2\2\2\u08e1\u08e2"+
		"\5\u0178\u00bd\2\u08e2\u08e3\7\u0098\2\2\u08e3\u08e6\5\u0092J\2\u08e4"+
		"\u08e5\7L\2\2\u08e5\u08e7\7K\2\2\u08e6\u08e4\3\2\2\2\u08e6\u08e7\3\2\2"+
		"\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\7%\2\2\u08e9\u08ea\5\u0178\u00bd\2"+
		"\u08ea\u0177\3\2\2\2\u08eb\u08ec\5p9\2\u08ec\u08ed\5\u00b4[\2\u08ed\u08ee"+
		"\7\u00cb\2\2\u08ee\u08ef\7\u00c8\2\2\u08ef\u08f0\7_\2\2\u08f0\u08f2\7"+
		"\u00c4\2\2\u08f1\u08f3\t\34\2\2\u08f2\u08f1\3\2\2\2\u08f2\u08f3\3\2\2"+
		"\2\u08f3\u08f5\3\2\2\2\u08f4\u08f6\7\u00bf\2\2\u08f5\u08f4\3\2\2\2\u08f5"+
		"\u08f6\3\2\2\2\u08f6\u08f9\3\2\2\2\u08f7\u08f8\7i\2\2\u08f8\u08fa\7j\2"+
		"\2\u08f9\u08f7\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fd\3\2\2\2\u08fb\u08fc"+
		"\7?\2\2\u08fc\u08fe\5\u00e8u\2\u08fd\u08fb\3\2\2\2\u08fd\u08fe\3\2\2\2"+
		"\u08fe\u0179\3\2\2\2\u08ff\u0906\7\65\2\2\u0900\u0907\5\u017c\u00bf\2"+
		"\u0901\u0907\5\u0186\u00c4\2\u0902\u0907\5\u0188\u00c5\2\u0903\u0904\7"+
		"\u0102\2\2\u0904\u0905\7d\2\2\u0905\u0907\7\u016d\2\2\u0906\u0900\3\2"+
		"\2\2\u0906\u0901\3\2\2\2\u0906\u0902\3\2\2\2\u0906\u0903\3\2\2\2\u0907"+
		"\u017b\3\2\2\2\u0908\u090a\7?\2\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2"+
		"\2\2\u090a\u090c\3\2\2\2\u090b\u090d\5\u01ac\u00d7\2\u090c\u090b\3\2\2"+
		"\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0913\5\u017e\u00c0\2"+
		"\u090f\u0910\7%\2\2\u0910\u0912\5\u017e\u00c0\2\u0911\u090f\3\2\2\2\u0912"+
		"\u0915\3\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u017d\3\2"+
		"\2\2\u0915\u0913\3\2\2\2\u0916\u0918\5\u00e8u\2\u0917\u0919\5\u0180\u00c1"+
		"\2\u0918\u0917\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u017f\3\2\2\2\u091a\u091b"+
		"\7L\2\2\u091b\u091c\7\37\2\2\u091c\u0921\5\u0182\u00c2\2\u091d\u091e\7"+
		"%\2\2\u091e\u0920\5\u0182\u00c2\2\u091f\u091d\3\2\2\2\u0920\u0923\3\2"+
		"\2\2\u0921\u091f\3\2\2\2\u0921";
	private static final String _serializedATNSegment1 =
		"\u0922\3\2\2\2\u0922\u0924\3\2\2\2\u0923\u0921\3\2\2\2\u0924\u0925\7 "+
		"\2\2\u0925\u0181\3\2\2\2\u0926\u0927\7\u00f8\2\2\u0927\u0928\7\30\2\2"+
		"\u0928\u0938\7\u01a2\2\2\u0929\u092a\7\u00fe\2\2\u092a\u092b\7\30\2\2"+
		"\u092b\u0938\5\u0184\u00c3\2\u092c\u092d\7\u00f9\2\2\u092d\u0935\7e\2"+
		"\2\u092e\u092f\5l\67\2\u092f\u0930\7\37\2\2\u0930\u0931\5p9\2\u0931\u0932"+
		"\7 \2\2\u0932\u0936\3\2\2\2\u0933\u0936\5\u00e8u\2\u0934\u0936\7\u01a1"+
		"\2\2\u0935\u092e\3\2\2\2\u0935\u0933\3\2\2\2\u0935\u0934\3\2\2\2\u0936"+
		"\u0938\3\2\2\2\u0937\u0926\3\2\2\2\u0937\u0929\3\2\2\2\u0937\u092c\3\2"+
		"\2\2\u0938\u0183\3\2\2\2\u0939\u093a\t\32\2\2\u093a\u0185\3\2\2\2\u093b"+
		"\u093d\7=\2\2\u093c\u093e\5\u01ac\u00d7\2\u093d\u093c\3\2\2\2\u093d\u093e"+
		"\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0944\5p9\2\u0940\u0941\7%\2\2\u0941"+
		"\u0943\5p9\2\u0942\u0940\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942\3\2\2"+
		"\2\u0944\u0945\3\2\2\2\u0945\u0187\3\2\2\2\u0946\u0944\3\2\2\2\u0947\u0949"+
		"\7>\2\2\u0948\u094a\5\u01ac\u00d7\2\u0949\u0948\3\2\2\2\u0949\u094a\3"+
		"\2\2\2\u094a\u094b\3\2\2\2\u094b\u0950\5|?\2\u094c\u094d\7%\2\2\u094d"+
		"\u094f\5|?\2\u094e\u094c\3\2\2\2\u094f\u0952\3\2\2\2\u0950\u094e\3\2\2"+
		"\2\u0950\u0951\3\2\2\2\u0951\u0189\3\2\2\2\u0952\u0950\3\2\2\2\u0953\u0955"+
		"\7L\2\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\3\2\2\2\u0956"+
		"\u0957\t%\2\2\u0957\u095a\7?\2\2\u0958\u095b\7p\2\2\u0959\u095b\5\u00ea"+
		"v\2\u095a\u0958\3\2\2\2\u095a\u0959\3\2\2\2\u095b\u018b\3\2\2\2\u095c"+
		"\u095d\t&\2\2\u095d\u0960\7G\2\2\u095e\u0961\7p\2\2\u095f\u0961\5\u00ea"+
		"v\2\u0960\u095e\3\2\2\2\u0960\u095f\3\2\2\2\u0961\u018d\3\2\2\2\u0962"+
		"\u0965\7\u010f\2\2\u0963\u0964\7\u00c1\2\2\u0964\u0966\5\u0084C\2\u0965"+
		"\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7e"+
		"\2\2\u0968\u096b\5n8\2\u0969\u096a\7\u00c1\2\2\u096a\u096c\5\u0084C\2"+
		"\u096b\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u0972\3\2\2\2\u096d\u096e"+
		"\7L\2\2\u096e\u096f\7\37\2\2\u096f\u0970\5\u00e4s\2\u0970\u0971\7 \2\2"+
		"\u0971\u0973\3\2\2\2\u0972\u096d\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u018f"+
		"\3\2\2\2\u0974\u0975\7;\2\2\u0975\u0978\7\37\2\2\u0976\u0979\5\u0192\u00ca"+
		"\2\u0977\u0979\5\u0194\u00cb\2\u0978\u0976\3\2\2\2\u0978\u0977\3\2\2\2"+
		"\u0979\u097a\3\2\2\2\u097a\u097b\7 \2\2\u097b\u0191\3\2\2\2\u097c\u097d"+
		"\7\u017e\2\2\u097d\u0981\7\30\2\2\u097e\u0982\5l\67\2\u097f\u0982\5\u00e8"+
		"u\2\u0980\u0982\7\u01a1\2\2\u0981\u097e\3\2\2\2\u0981\u097f\3\2\2\2\u0981"+
		"\u0980\3\2\2\2\u0982\u0193\3\2\2\2\u0983\u0984\7\u016e\2\2\u0984\u098a"+
		"\7\30\2\2\u0985\u098b\7\u00fd\2\2\u0986\u0988\7`\2\2\u0987\u0989\5\u0196"+
		"\u00cc\2\u0988\u0987\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098b\3\2\2\2\u098a"+
		"\u0985\3\2\2\2\u098a\u0986\3\2\2\2\u098b\u0195\3\2\2\2\u098c\u0990\7\37"+
		"\2\2\u098d\u098e\7\u0186\2\2\u098e\u098f\7\30\2\2\u098f\u0991\5n8\2\u0990"+
		"\u098d\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993\3\2\2\2\u0992\u0994\5\u0198"+
		"\u00cd\2\u0993\u0992\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0996\3\2\2\2\u0995"+
		"\u0997\5\u019a\u00ce\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0998"+
		"\3\2\2\2\u0998\u0999\7 \2\2\u0999\u0197\3\2\2\2\u099a\u099c\7%\2\2\u099b"+
		"\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e\7\u016b"+
		"\2\2\u099e\u099f\7\30\2\2\u099f\u09a0\5\u0184\u00c3\2\u09a0\u0199\3\2"+
		"\2\2\u09a1\u09a3\7%\2\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a4\3\2\2\2\u09a4\u09a5\7\u0185\2\2\u09a5\u09a6\7\30\2\2\u09a6\u09a7"+
		"\5\u019c\u00cf\2\u09a7\u019b\3\2\2\2\u09a8\u09ac\7\u00f5\2\2\u09a9\u09aa"+
		"\7\u01a2\2\2\u09aa\u09ac\t\'\2\2\u09ab\u09a8\3\2\2\2\u09ab\u09a9\3\2\2"+
		"\2\u09ac\u019d\3\2\2\2\u09ad\u09b0\5\u01a0\u00d1\2\u09ae\u09b1\5\u01a2"+
		"\u00d2\2\u09af\u09b1\5\u01a6\u00d4\2\u09b0\u09ae\3\2\2\2\u09b0\u09af\3"+
		"\2\2\2\u09b1\u019f\3\2\2\2\u09b2\u09b3\7>\2\2\u09b3\u09b4\5|?\2\u09b4"+
		"\u01a1\3\2\2\2\u09b5\u09bb\7\u00d9\2\2\u09b6\u09bc\5\u0142\u00a2\2\u09b7"+
		"\u09b9\5x=\2\u09b8\u09ba\5\u01a4\u00d3\2\u09b9\u09b8\3\2\2\2\u09b9\u09ba"+
		"\3\2\2\2\u09ba\u09bc\3\2\2\2\u09bb\u09b6\3\2\2\2\u09bb\u09b7\3\2\2\2\u09bc"+
		"\u01a3\3\2\2\2\u09bd\u09be\7`\2\2\u09be\u09c1\5\u00e8u\2\u09bf\u09c1\7"+
		"\u0098\2\2\u09c0\u09bd\3\2\2\2\u09c0\u09bf\3\2\2\2\u09c1\u01a5\3\2\2\2"+
		"\u09c2\u09c3\7\u00d8\2\2\u09c3\u09cb\7\u00db\2\2\u09c4\u09c5\7L\2\2\u09c5"+
		"\u09c6\7\u0168\2\2\u09c6\u09c7\7\30\2\2\u09c7\u09c9\7\u01a2\2\2\u09c8"+
		"\u09ca\7\u00e3\2\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cc"+
		"\3\2\2\2\u09cb\u09c4\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09ce\3\2\2\2\u09cd"+
		"\u09cf\5\u012c\u0097\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u01a7"+
		"\3\2\2\2\u09d0\u09d1\7;\2\2\u09d1\u09d2\7\37\2\2\u09d2\u09d3\7\u0187\2"+
		"\2\u09d3\u09d4\7\30\2\2\u09d4\u09d5\t(\2\2\u09d5\u09e3\7 \2\2\u09d6\u09d7"+
		"\7\u017a\2\2\u09d7\u09d8\7\30\2\2\u09d8\u09e3\7`\2\2\u09d9\u09da\7\u00e8"+
		"\2\2\u09da\u09db\7\30\2\2\u09db\u09e3\t#\2\2\u09dc\u09dd\7\u016e\2\2\u09dd"+
		"\u09de\7\30\2\2\u09de\u09e0\7`\2\2\u09df\u09e1\5\u01aa\u00d6\2\u09e0\u09df"+
		"\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e3\3\2\2\2\u09e2\u09d0\3\2\2\2\u09e2"+
		"\u09d6\3\2\2\2\u09e2\u09d9\3\2\2\2\u09e2\u09dc\3\2\2\2\u09e3\u01a9\3\2"+
		"\2\2\u09e4\u09e5\7\37\2\2\u09e5\u09e6\7\u0186\2\2\u09e6\u09e7\7\30\2\2"+
		"\u09e7\u09ec\5n8\2\u09e8\u09e9\7%\2\2\u09e9\u09ea\7\u016b\2\2\u09ea\u09eb"+
		"\7\30\2\2\u09eb\u09ed\5\u0184\u00c3\2\u09ec\u09e8\3\2\2\2\u09ec\u09ed"+
		"\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\7 \2\2\u09ef\u01ab\3\2\2\2\u09f0"+
		"\u09f1\7a\2\2\u09f1\u09f2\7m\2\2\u09f2\u01ad\3\2\2\2\u09f3\u09f4\7;\2"+
		"\2\u09f4\u09f5\7\u00d3\2\2\u09f5\u01af\3\2\2\2\u09f6\u09f7\7a\2\2\u09f7"+
		"\u09f8\7*\2\2\u09f8\u09f9\7*\2\2\u09f9\u09fa\7\u0111\2\2\u09fa\u09fb\7"+
		"\32\2\2\u09fb\u09fc\7\u01a2\2\2\u09fc\u09fd\7|\2\2\u09fd\u09ff\7\u0110"+
		"\2\2\u09fe\u09f6\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00"+
		"\u0a01\7;\2\2\u0a01\u0a02\7\u0178\2\2\u0a02\u0a03\5\u01b2\u00da\2\u0a03"+
		"\u01b1\3\2\2\2\u0a04\u0a05\t\32\2\2\u0a05\u01b3\3\2\2\2\u0a06\u0a07\7"+
		"{\2\2\u0a07\u0a08\t)\2\2\u0a08\u01b5\3\2\2\2\u0a09\u0a0a\7|\2\2\u0a0a"+
		"\u01b7\3\2\2\2\u0a0b\u0a0c\7}\2\2\u0a0c\u01b9\3\2\2\2\u0a0d\u0a0e\7\u010c"+
		"\2\2\u0a0e\u0a0f\t)\2\2\u0a0f\u01bb\3\2\2\2\u0a10\u0a14\78\2\2\u0a11\u0a15"+
		"\5\u01c2\u00e2\2\u0a12\u0a15\5\u01c4\u00e3\2\u0a13\u0a15\5\u01f4\u00fb"+
		"\2\u0a14\u0a11\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a14\u0a13\3\2\2\2\u0a15\u01bd"+
		"\3\2\2\2\u0a16\u0a1d\79\2\2\u0a17\u0a19\5\u01c6\u00e4\2\u0a18\u0a17\3"+
		"\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1e\5\u01c2\u00e2"+
		"\2\u0a1b\u0a1e\5\u01c4\u00e3\2\u0a1c\u0a1e\5\u01f4\u00fb\2\u0a1d\u0a18"+
		"\3\2\2\2\u0a1d\u0a1b\3\2\2\2\u0a1d\u0a1c\3\2\2\2\u0a1e\u01bf\3\2\2\2\u0a1f"+
		"\u0a22\7\u00e4\2\2\u0a20\u0a23\5\u01c2\u00e2\2\u0a21\u0a23\5\u01c4\u00e3"+
		"\2\u0a22\u0a20\3\2\2\2\u0a22\u0a21\3\2\2\2\u0a23\u01c1\3\2\2\2\u0a24\u0a27"+
		"\5\u01c8\u00e5\2\u0a25\u0a26\7`\2\2\u0a26\u0a28\5\u01ca\u00e6\2\u0a27"+
		"\u0a25\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u01c3\3\2\2\2\u0a29\u0a2c\5\u01cc"+
		"\u00e7\2\u0a2a\u0a2b\7`\2\2\u0a2b\u0a2d\5\u01ce\u00e8\2\u0a2c\u0a2a\3"+
		"\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d\u01c5\3\2\2\2\u0a2e\u0a2f\78\2\2\u0a2f"+
		"\u0a30\7\u00cd\2\2\u0a30\u0a31\7d\2\2\u0a31\u01c7\3\2\2\2\u0a32\u0a34"+
		"\5\u01d0\u00e9\2\u0a33\u0a35\5v<\2\u0a34\u0a33\3\2\2\2\u0a34\u0a35\3\2"+
		"\2\2\u0a35\u0a3d\3\2\2\2\u0a36\u0a37\7%\2\2\u0a37\u0a39\5\u01d0\u00e9"+
		"\2\u0a38\u0a3a\5v<\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3c"+
		"\3\2\2\2\u0a3b\u0a36\3\2\2\2\u0a3c\u0a3f\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3d"+
		"\u0a3e\3\2\2\2\u0a3e\u01c9\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a40\u0a42\5\u01f0"+
		"\u00f9\2\u0a41\u0a40\3\2\2\2\u0a41\u0a42\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43"+
		"\u0a44\5n8\2\u0a44\u01cb\3\2\2\2\u0a45\u0a4a\5\u01d0\u00e9\2\u0a46\u0a47"+
		"\7%\2\2\u0a47\u0a49\5\u01d0\u00e9\2\u0a48\u0a46\3\2\2\2\u0a49\u0a4c\3"+
		"\2\2\2\u0a4a\u0a48\3\2\2\2\u0a4a\u0a4b\3\2\2\2\u0a4b\u01cd\3\2\2\2\u0a4c"+
		"\u0a4a\3\2\2\2\u0a4d\u0a4f\5\u01f2\u00fa\2\u0a4e\u0a4d\3\2\2\2\u0a4e\u0a4f"+
		"\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\5n8\2\u0a51\u01cf\3\2\2\2\u0a52"+
		"\u0a54\7p\2\2\u0a53\u0a55\7\u00ce\2\2\u0a54\u0a53\3\2\2\2\u0a54\u0a55"+
		"\3\2\2\2\u0a55\u0a66\3\2\2\2\u0a56\u0a66\5\u01d2\u00ea\2\u0a57\u0a66\5"+
		"\u01d4\u00eb\2\u0a58\u0a66\5\u01d6\u00ec\2\u0a59\u0a66\5\u01d8\u00ed\2"+
		"\u0a5a\u0a66\5\u01da\u00ee\2\u0a5b\u0a66\5\u01dc\u00ef\2\u0a5c\u0a66\5"+
		"\u01de\u00f0\2\u0a5d\u0a66\5\u01e0\u00f1\2\u0a5e\u0a66\5\u01e2\u00f2\2"+
		"\u0a5f\u0a66\5\u01e4\u00f3\2\u0a60\u0a66\5\u01e6\u00f4\2\u0a61\u0a66\5"+
		"\u01e8\u00f5\2\u0a62\u0a66\5\u01ea\u00f6\2\u0a63\u0a66\5\u01ec\u00f7\2"+
		"\u0a64\u0a66\5\u01ee\u00f8\2\u0a65\u0a52\3\2\2\2\u0a65\u0a56\3\2\2\2\u0a65"+
		"\u0a57\3\2\2\2\u0a65\u0a58\3\2\2\2\u0a65\u0a59\3\2\2\2\u0a65\u0a5a\3\2"+
		"\2\2\u0a65\u0a5b\3\2\2\2\u0a65\u0a5c\3\2\2\2\u0a65\u0a5d\3\2\2\2\u0a65"+
		"\u0a5e\3\2\2\2\u0a65\u0a5f\3\2\2\2\u0a65\u0a60\3\2\2\2\u0a65\u0a61\3\2"+
		"\2\2\u0a65\u0a62\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a64\3\2\2\2\u0a66"+
		"\u01d1\3\2\2\2\u0a67\u0a69\7\u0118\2\2\u0a68\u0a6a\7\u0120\2\2\u0a69\u0a68"+
		"\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a\u0a7b\3\2\2\2\u0a6b\u0a6c\7\u0119\2"+
		"\2\u0a6c\u0a7b\7\u011a\2\2\u0a6d\u0a7b\7\64\2\2\u0a6e\u0a70\7I\2\2\u0a6f"+
		"\u0a71\7q\2\2\u0a70\u0a6f\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u0a72\3\2"+
		"\2\2\u0a72\u0a7b\7\u011b\2\2\u0a73\u0a7b\7\u00cf\2\2\u0a74\u0a7b\7/\2"+
		"\2\u0a75\u0a7b\7\60\2\2\u0a76\u0a7b\7\61\2\2\u0a77\u0a7b\7\62\2\2\u0a78"+
		"\u0a7b\7\u0113\2\2\u0a79\u0a7b\7\u0121\2\2\u0a7a\u0a67\3\2\2\2\u0a7a\u0a6b"+
		"\3\2\2\2\u0a7a\u0a6d\3\2\2\2\u0a7a\u0a6e\3\2\2\2\u0a7a\u0a73\3\2\2\2\u0a7a"+
		"\u0a74\3\2\2\2\u0a7a\u0a75\3\2\2\2\u0a7a\u0a76\3\2\2\2\u0a7a\u0a77\3\2"+
		"\2\2\u0a7a\u0a78\3\2\2\2\u0a7a\u0a79\3\2\2\2\u0a7b\u01d3\3\2\2\2\u0a7c"+
		"\u0a7d\7I\2\2\u0a7d\u0a7e\7\u0122\2\2\u0a7e\u0a7f\7\u0124\2\2\u0a7f\u01d5"+
		"\3\2\2\2\u0a80\u0a86\7\64\2\2\u0a81\u0a87\7\u0125\2\2\u0a82\u0a87\7\u0126"+
		"\2\2\u0a83\u0a87\7\u0123\2\2\u0a84\u0a85\7\u0120\2\2\u0a85\u0a87\7\u0127"+
		"\2\2\u0a86\u0a81\3\2\2\2\u0a86\u0a82\3\2\2\2\u0a86\u0a83\3\2\2\2\u0a86"+
		"\u0a84\3\2\2\2\u0a87\u0acc\3\2\2\2\u0a88\u0a89\7\64\2\2\u0a89\u0a9b\7"+
		"q\2\2\u0a8a\u0a8b\7\u0128\2\2\u0a8b\u0a9c\7t\2\2\u0a8c\u0a9c\7\u0116\2"+
		"\2\u0a8d\u0a9c\7\u0129\2\2\u0a8e\u0a9c\7\u00de\2\2\u0a8f\u0a9c\7\u012a"+
		"\2\2\u0a90\u0a91\7\u012b\2\2\u0a91\u0a9c\7\u012c\2\2\u0a92\u0a93\7\u012b"+
		"\2\2\u0a93\u0a9c\7\u0114\2\2\u0a94\u0a95\7\u012d\2\2\u0a95\u0a9c\7\u0120"+
		"\2\2\u0a96\u0a9c\7\u00f6\2\2\u0a97\u0a98\7\u0120\2\2\u0a98\u0a9c\7\u012e"+
		"\2\2\u0a99\u0a9a\7\u0120\2\2\u0a9a\u0a9c\7\u00d1\2\2\u0a9b\u0a8a\3\2\2"+
		"\2\u0a9b\u0a8c\3\2\2\2\u0a9b\u0a8d\3\2\2\2\u0a9b\u0a8e\3\2\2\2\u0a9b\u0a8f"+
		"\3\2\2\2\u0a9b\u0a90\3\2\2\2\u0a9b\u0a92\3\2\2\2\u0a9b\u0a94\3\2\2\2\u0a9b"+
		"\u0a96\3\2\2\2\u0a9b\u0a97\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0acc\3\2"+
		"\2\2\u0a9d\u0aa9\7\63\2\2\u0a9e\u0a9f\7\u0128\2\2\u0a9f\u0aaa\7t\2\2\u0aa0"+
		"\u0aa1\7\u012f\2\2\u0aa1\u0aa2\7\u012b\2\2\u0aa2\u0aaa\7\u012c\2\2\u0aa3"+
		"\u0aaa\7\u012a\2\2\u0aa4\u0aa5\7\u0120\2\2\u0aa5\u0aaa\7\u00d1\2\2\u0aa6"+
		"\u0aa7\7\u0123\2\2\u0aa7\u0aa8\7\u012b\2\2\u0aa8\u0aaa\7\u012c\2\2\u0aa9"+
		"\u0a9e\3\2\2\2\u0aa9\u0aa0\3\2\2\2\u0aa9\u0aa3\3\2\2\2\u0aa9\u0aa4\3\2"+
		"\2\2\u0aa9\u0aa6\3\2\2\2\u0aaa\u0acc\3\2\2\2\u0aab\u0aac\7\63\2\2\u0aac"+
		"\u0aad\7q\2\2\u0aad\u0acc\7\u00de\2\2\u0aae\u0aaf\7I\2\2\u0aaf\u0ab0\7"+
		"\u0120\2\2\u0ab0\u0acc\7\u0127\2\2\u0ab1\u0ab2\7I\2\2\u0ab2\u0ab3\7q\2"+
		"\2\u0ab3\u0acc\t*\2\2\u0ab4\u0ab5\7\u0115\2\2\u0ab5\u0ab6\7q\2\2\u0ab6"+
		"\u0acc\7\u00de\2\2\u0ab7\u0ab8\7\u0115\2\2\u0ab8\u0acc\7\u00a2\2\2\u0ab9"+
		"\u0aba\7\u0131\2\2\u0aba\u0abb\7q\2\2\u0abb\u0acc\7\u00f6\2\2\u0abc\u0abd"+
		"\7/\2\2\u0abd\u0abe\7p\2\2\u0abe\u0abf\7\u00d0\2\2\u0abf\u0acc\7\u0132"+
		"\2\2\u0ac0\u0ac1\7\u0133\2\2\u0ac1\u0acc\7\u0120\2\2\u0ac2\u0ac3\7\u0134"+
		"\2\2\u0ac3\u0ac4\7\u0135\2\2\u0ac4\u0acc\7\u011d\2\2\u0ac5\u0ac6\7\u0136"+
		"\2\2\u0ac6\u0ac7\7\u0137\2\2\u0ac7\u0acc\7\u0138\2\2\u0ac8\u0ac9\7\u0139"+
		"\2\2\u0ac9\u0acc\7\u011d\2\2\u0aca\u0acc\7\u013a\2\2\u0acb\u0a80\3\2\2"+
		"\2\u0acb\u0a88\3\2\2\2\u0acb\u0a9d\3\2\2\2\u0acb\u0aab\3\2\2\2\u0acb\u0aae"+
		"\3\2\2\2\u0acb\u0ab1\3\2\2\2\u0acb\u0ab4\3\2\2\2\u0acb\u0ab7\3\2\2\2\u0acb"+
		"\u0ab9\3\2\2\2\u0acb\u0abc\3\2\2\2\u0acb\u0ac0\3\2\2\2\u0acb\u0ac2\3\2"+
		"\2\2\u0acb\u0ac5\3\2\2\2\u0acb\u0ac8\3\2\2\2\u0acb\u0aca\3\2\2\2\u0acc"+
		"\u01d7\3\2\2\2\u0acd\u0ad6\7\u0131\2\2\u0ace\u0acf\7\64\2\2\u0acf\u0ad3"+
		"\7q\2\2\u0ad0\u0ad4\7\u00f6\2\2\u0ad1\u0ad2\7\u0120\2\2\u0ad2\u0ad4\7"+
		"\u00d1\2\2\u0ad3\u0ad0\3\2\2\2\u0ad3\u0ad1\3\2\2\2\u0ad4\u0ad6\3\2\2\2"+
		"\u0ad5\u0acd\3\2\2\2\u0ad5\u0ace\3\2\2\2\u0ad6\u01d9\3\2\2\2\u0ad7\u0ad8"+
		"\7\64\2\2\u0ad8\u0b71\7\u0123\2\2\u0ad9\u0ada\7\64\2\2\u0ada\u0b16\7q"+
		"\2\2\u0adb\u0ae5\7\u00de\2\2\u0adc\u0ae6\7\u012e\2\2\u0add\u0ade\7\u012f"+
		"\2\2\u0ade\u0ae6\7G\2\2\u0adf\u0ae0\7\u012b\2\2\u0ae0\u0ae6\7\u012c\2"+
		"\2\u0ae1\u0ae2\7\u012b\2\2\u0ae2\u0ae6\7\u0114\2\2\u0ae3\u0ae4\7\u013b"+
		"\2\2\u0ae4\u0ae6\7\u013c\2\2\u0ae5\u0adc\3\2\2\2\u0ae5\u0add\3\2\2\2\u0ae5"+
		"\u0adf\3\2\2\2\u0ae5\u0ae1\3\2\2\2\u0ae5\u0ae3\3\2\2\2\u0ae5\u0ae6\3\2"+
		"\2\2\u0ae6\u0b17\3\2\2\2\u0ae7\u0b17\7\u013d\2\2\u0ae8\u0b17\7\67\2\2"+
		"\u0ae9\u0aeb\7\u013e\2\2\u0aea\u0aec\7\u012e\2\2\u0aeb\u0aea\3\2\2\2\u0aeb"+
		"\u0aec\3\2\2\2\u0aec\u0b17\3\2\2\2\u0aed\u0b17\7\u00d0\2\2\u0aee\u0af0"+
		"\7\u011c\2\2\u0aef\u0aee\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0af1\3\2\2"+
		"\2\u0af1\u0b17\7\u00d1\2\2\u0af2\u0b17\7\u013f\2\2\u0af3\u0b17\7\u0140"+
		"\2\2\u0af4\u0b17\7\u011d\2\2\u0af5\u0b17\7\u0116\2\2\u0af6\u0afb\7\u011e"+
		"\2\2\u0af7\u0afb\7\u011f\2\2\u0af8\u0af9\7=\2\2\u0af9\u0afb\7\u0141\2"+
		"\2\u0afa\u0af6\3\2\2\2\u0afa\u0af7\3\2\2\2\u0afa\u0af8\3\2\2\2\u0afb\u0afc"+
		"\3\2\2\2\u0afc\u0b17\7C\2\2\u0afd\u0afe\7=\2\2\u0afe\u0aff\7\u0142\2\2"+
		"\u0aff\u0b00\7C\2\2\u0b00\u0b17\7\u011b\2\2\u0b01\u0b07\7\u0134\2\2\u0b02"+
		"\u0b03\7\u0143\2\2\u0b03\u0b08\7\u0144\2\2\u0b04\u0b05\7\u0145\2\2\u0b05"+
		"\u0b08\7\u0146\2\2\u0b06\u0b08\7\u0147\2\2\u0b07\u0b02\3\2\2\2\u0b07\u0b04"+
		"\3\2\2\2\u0b07\u0b06\3\2\2\2\u0b08\u0b17\3\2\2\2\u0b09\u0b0a\7\u0148\2"+
		"\2\u0b0a\u0b17\7\u0117\2\2\u0b0b\u0b17\7\u0149\2\2\u0b0c\u0b0d\7\u014b"+
		"\2\2\u0b0d\u0b17\7\u00ae\2\2\u0b0e\u0b0f\7\u014c\2\2\u0b0f\u0b10\7\u013e"+
		"\2\2\u0b10\u0b17\7\u014d\2\2\u0b11\u0b17\7\u014e\2\2\u0b12\u0b13\7\u012b"+
		"\2\2\u0b13\u0b17\7\u0114\2\2\u0b14\u0b15\7\u014f\2\2\u0b15\u0b17\7\u0150"+
		"\2\2\u0b16\u0adb\3\2\2\2\u0b16\u0ae7\3\2\2\2\u0b16\u0ae8\3\2\2\2\u0b16"+
		"\u0ae9\3\2\2\2\u0b16\u0aed\3\2\2\2\u0b16\u0aef\3\2\2\2\u0b16\u0af2\3\2"+
		"\2\2\u0b16\u0af3\3\2\2\2\u0b16\u0af4\3\2\2\2\u0b16\u0af5\3\2\2\2\u0b16"+
		"\u0afa\3\2\2\2\u0b16\u0afd\3\2\2\2\u0b16\u0b01\3\2\2\2\u0b16\u0b09\3\2"+
		"\2\2\u0b16\u0b0b\3\2\2\2\u0b16\u0b0c\3\2\2\2\u0b16\u0b0e\3\2\2\2\u0b16"+
		"\u0b11\3\2\2\2\u0b16\u0b12\3\2\2\2\u0b16\u0b14\3\2\2\2\u0b17\u0b71\3\2"+
		"\2\2\u0b18\u0b3b\7\63\2\2\u0b19\u0b3c\7\u00de\2\2\u0b1a\u0b1b\7\u00de"+
		"\2\2\u0b1b\u0b1c\7\u012f\2\2\u0b1c\u0b1d\7\u012b\2\2\u0b1d\u0b3c\7\u012c"+
		"\2\2\u0b1e\u0b3c\7\67\2\2\u0b1f\u0b3c\7<\2\2\u0b20\u0b3c\7I\2\2\u0b21"+
		"\u0b3c\7\u013e\2\2\u0b22\u0b3c\7\u00ae\2\2\u0b23\u0b3c\7\u0098\2\2\u0b24"+
		"\u0b3c\7\u0151\2\2\u0b25\u0b3c\7\u011d\2\2\u0b26\u0b27\t+\2\2\u0b27\u0b3c"+
		"\7C\2\2\u0b28\u0b3c\7\u013f\2\2\u0b29\u0b3c\7\u0140\2\2\u0b2a\u0b2b\7"+
		"\u0148\2\2\u0b2b\u0b3c\7\u0117\2\2\u0b2c\u0b3c\7F\2\2\u0b2d\u0b2e\7\u014b"+
		"\2\2\u0b2e\u0b3c\7\u00ae\2\2\u0b2f\u0b3c\7H\2\2\u0b30\u0b3c\7\u0152\2"+
		"\2\u0b31\u0b32\7\u014c\2\2\u0b32\u0b33\7\u013e\2\2\u0b33\u0b3c\7\u014d"+
		"\2\2\u0b34\u0b3c\7\u00d1\2\2\u0b35\u0b3c\7\u014e\2\2\u0b36\u0b3c\7\u0153"+
		"\2\2\u0b37\u0b3c\7\u0154\2\2\u0b38\u0b39\7\u0130\2\2\u0b39\u0b3a\7\67"+
		"\2\2\u0b3a\u0b3c\7\u0155\2\2\u0b3b\u0b19\3\2\2\2\u0b3b\u0b1a\3\2\2\2\u0b3b"+
		"\u0b1e\3\2\2\2\u0b3b\u0b1f\3\2\2\2\u0b3b\u0b20\3\2\2\2\u0b3b\u0b21\3\2"+
		"\2\2\u0b3b\u0b22\3\2\2\2\u0b3b\u0b23\3\2\2\2\u0b3b\u0b24\3\2\2\2\u0b3b"+
		"\u0b25\3\2\2\2\u0b3b\u0b26\3\2\2\2\u0b3b\u0b28\3\2\2\2\u0b3b\u0b29\3\2"+
		"\2\2\u0b3b\u0b2a\3\2\2\2\u0b3b\u0b2c\3\2\2\2\u0b3b\u0b2d\3\2\2\2\u0b3b"+
		"\u0b2f\3\2\2\2\u0b3b\u0b30\3\2\2\2\u0b3b\u0b31\3\2\2\2\u0b3b\u0b34\3\2"+
		"\2\2\u0b3b\u0b35\3\2\2\2\u0b3b\u0b36\3\2\2\2\u0b3b\u0b37\3\2\2\2\u0b3b"+
		"\u0b38\3\2\2\2\u0b3c\u0b71\3\2\2\2\u0b3d\u0b3e\7\63\2\2\u0b3e\u0b42\7"+
		"q\2\2\u0b3f\u0b43\7\u00de\2\2\u0b40\u0b41\7\u0134\2\2\u0b41\u0b43\7\u0147"+
		"\2\2\u0b42\u0b3f\3\2\2\2\u0b42\u0b40\3\2\2\2\u0b43\u0b71\3\2\2\2\u0b44"+
		"\u0b4a\7I\2\2\u0b45\u0b46\t,\2\2\u0b46\u0b4b\7\u0127\2\2\u0b47\u0b48\7"+
		"\u012f\2\2\u0b48\u0b49\7\u012b\2\2\u0b49\u0b4b\7\u012c\2\2\u0b4a\u0b45"+
		"\3\2\2\2\u0b4a\u0b47\3\2\2\2\u0b4b\u0b71\3\2\2\2\u0b4c\u0b4d\7I\2\2\u0b4d"+
		"\u0b53\7q\2\2\u0b4e\u0b4f\7=\2\2\u0b4f\u0b50\t-\2\2\u0b50\u0b51\7C\2\2"+
		"\u0b51\u0b54\7\u011b\2\2\u0b52\u0b54\7\u011b\2\2\u0b53\u0b4e\3\2\2\2\u0b53"+
		"\u0b52\3\2\2\2\u0b54\u0b71\3\2\2\2\u0b55\u0b56\7\u0113\2\2\u0b56\u0b57"+
		"\7q\2\2\u0b57\u0b58\7\u0134\2\2\u0b58\u0b71\7\u0156\2\2\u0b59\u0b5b\7"+
		"\u0115\2\2\u0b5a\u0b5c\7\u0109\2\2\u0b5b\u0b5a\3\2\2\2\u0b5b\u0b5c\3\2"+
		"\2\2\u0b5c\u0b71\3\2\2\2\u0b5d\u0b5e\7\u0157\2\2\u0b5e\u0b5f\7\u00de\2"+
		"\2\u0b5f\u0b71\7\u0116\2\2\u0b60\u0b61\7\u0158\2\2\u0b61\u0b71\t.\2\2"+
		"\u0b62\u0b64\7\u0133\2\2\u0b63\u0b65\7\u0120\2\2\u0b64\u0b63\3\2\2\2\u0b64"+
		"\u0b65\3\2\2\2\u0b65\u0b71\3\2\2\2\u0b66\u0b71\7\u015a\2\2\u0b67\u0b68"+
		"\7\u015b\2\2\u0b68\u0b69\7\u015c\2\2\u0b69\u0b71\7\u015d\2\2\u0b6a\u0b71"+
		"\7\u014a\2\2\u0b6b\u0b71\7\u015e\2\2\u0b6c\u0b6d\7\u0136\2\2\u0b6d\u0b6e"+
		"\7\u00de\2\2\u0b6e\u0b6f\7\u0137\2\2\u0b6f\u0b71\7\u0138\2\2\u0b70\u0ad7"+
		"\3\2\2\2\u0b70\u0ad9\3\2\2\2\u0b70\u0b18\3\2\2\2\u0b70\u0b3d\3\2\2\2\u0b70"+
		"\u0b44\3\2\2\2\u0b70\u0b4c\3\2\2\2\u0b70\u0b55\3\2\2\2\u0b70\u0b59\3\2"+
		"\2\2\u0b70\u0b5d\3\2\2\2\u0b70\u0b60\3\2\2\2\u0b70\u0b62\3\2\2\2\u0b70"+
		"\u0b66\3\2\2\2\u0b70\u0b67\3\2\2\2\u0b70\u0b6a\3\2\2\2\u0b70\u0b6b\3\2"+
		"\2\2\u0b70\u0b6c\3\2\2\2\u0b71\u01db\3\2\2\2\u0b72\u0b7d\7\u0131\2\2\u0b73"+
		"\u0b74\7\64\2\2\u0b74\u0b7a\7q\2\2\u0b75\u0b7b\7\u00d0\2\2\u0b76\u0b78"+
		"\7\u011c\2\2\u0b77\u0b76\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78\u0b79\3\2\2"+
		"\2\u0b79\u0b7b\7\u00d1\2\2\u0b7a\u0b75\3\2\2\2\u0b7a\u0b77\3\2\2\2\u0b7b"+
		"\u0b7d\3\2\2\2\u0b7c\u0b72\3\2\2\2\u0b7c\u0b73\3\2\2\2\u0b7d\u01dd\3\2"+
		"\2\2\u0b7e\u0b7f\7\64\2\2\u0b7f\u0b80\7q\2\2\u0b80\u0b87\7\67\2\2\u0b81"+
		"\u0b82\7\63\2\2\u0b82\u0b87\7\u015f\2\2\u0b83\u0b84\7I\2\2\u0b84\u0b85"+
		"\7\u0122\2\2\u0b85\u0b87\7\u0124\2\2\u0b86\u0b7e\3\2\2\2\u0b86\u0b81\3"+
		"\2\2\2\u0b86\u0b83\3\2\2\2\u0b87\u01df\3\2\2\2\u0b88\u0b89\7\64\2\2\u0b89"+
		"\u0b92\7q\2\2\u0b8a\u0b93\7\u0140\2\2\u0b8b\u0b8c\7\u014b\2\2\u0b8c\u0b93"+
		"\7\u00ae\2\2\u0b8d\u0b8e\7\u014c\2\2\u0b8e\u0b8f\7\u013e\2\2\u0b8f\u0b93"+
		"\7\u014d\2\2\u0b90\u0b93\7\u014e\2\2\u0b91\u0b93\7\u013e\2\2\u0b92\u0b8a"+
		"\3\2\2\2\u0b92\u0b8b\3\2\2\2\u0b92\u0b8d\3\2\2\2\u0b92\u0b90\3\2\2\2\u0b92"+
		"\u0b91\3\2\2\2\u0b93\u01e1\3\2\2\2\u0b94\u0b95\7\64\2\2\u0b95\u0b96\7"+
		"q\2\2\u0b96\u0b97\7\u012a\2\2\u0b97\u01e3\3\2\2\2\u0b98\u0b99\7\64\2\2"+
		"\u0b99\u0b9a\7q\2\2\u0b9a\u0b9b\7\u013f\2\2\u0b9b\u01e5\3\2\2\2\u0b9c"+
		"\u0b9d\7\64\2\2\u0b9d\u0b9e\7q\2\2\u0b9e\u0b9f\7\u011e\2\2\u0b9f\u0ba0"+
		"\7C\2\2\u0ba0\u01e7\3\2\2\2\u0ba1\u0ba2\7\64\2\2\u0ba2\u0ba3\7q\2\2\u0ba3"+
		"\u0ba4\7\u011f\2\2\u0ba4\u0ba5\7C\2\2\u0ba5\u01e9\3\2\2\2\u0ba6\u0ba7"+
		"\7\64\2\2\u0ba7\u0ba8\7q\2\2\u0ba8\u0ba9\7\u011d\2\2\u0ba9\u01eb\3\2\2"+
		"\2\u0baa\u0bab\7\64\2\2\u0bab\u0bac\7q\2\2\u0bac\u0bad\7\u0128\2\2\u0bad"+
		"\u0bb0\7t\2\2\u0bae\u0bb0\7\u0115\2\2\u0baf\u0baa\3\2\2\2\u0baf\u0bae"+
		"\3\2\2\2\u0bb0\u01ed\3\2\2\2\u0bb1\u0bb2\7\64\2\2\u0bb2\u0bb3\7q\2\2\u0bb3"+
		"\u0bb4\7\u0148\2\2\u0bb4\u0bb5\7\u0117\2\2\u0bb5\u01ef\3\2\2\2\u0bb6\u0bb7"+
		"\7\u01a0\2\2\u0bb7\u0bb8\7\16\2\2\u0bb8\u0bb9\7\16\2\2\u0bb9\u01f1\3\2"+
		"\2\2\u0bba\u0bbb\t/\2\2\u0bbb\u0bbc\7\16\2\2\u0bbc\u0bbd\7\16\2\2\u0bbd"+
		"\u01f3\3\2\2\2\u0bbe\u0bbf\5\u00eav\2\u0bbf\u01f5\3\2\2\2\u0bc0\u0bc1"+
		"\7\63\2\2\u0bc1\u0bc2\7\u00d0\2\2\u0bc2\u01f7\3\2\2\2\u0bc3\u0bc4\7\65"+
		"\2\2\u0bc4\u0bc5\7\u00d0\2\2\u0bc5\u01f9\3\2\2\2\u0bc6\u0bc7\7\64\2\2"+
		"\u0bc7\u0bc8\7\u00d0\2\2\u0bc8\u01fb\3\2\2\2\u0bc9\u0bca\7\63\2\2\u0bca"+
		"\u0bcb\7\u00d1\2\2\u0bcb\u01fd\3\2\2\2\u0bcc\u0bcd\7\65\2\2\u0bcd\u0bce"+
		"\7\u00d1\2\2\u0bce\u01ff\3\2\2\2\u0bcf\u0bd0\7\64\2\2\u0bd0\u0bd1\7\u00d1"+
		"\2\2\u0bd1\u0201\3\2\2\2\u0bd2\u0bd3\7\63\2\2\u0bd3\u0bd4\7\u00f6\2\2"+
		"\u0bd4\u0203\3\2\2\2\u0bd5\u0bd6\7\65\2\2\u0bd6\u0bd7\7\u00f6\2\2\u0bd7"+
		"\u0205\3\2\2\2\u0bd8\u0bd9\7\64\2\2\u0bd9\u0bda\7\u00f6\2\2\u0bda\u0207"+
		"\3\2\2\2\u0bdb\u0bdc\7\u009c\2\2\u0bdc\u0209\3\2\2\2\u0153\u0228\u022b"+
		"\u022e\u0232\u0235\u0239\u023c\u0241\u0244\u0247\u024d\u0250\u0258\u025c"+
		"\u025f\u0267\u0273\u027c\u0283\u0287\u028b\u028f\u0292\u0295\u0298\u029b"+
		"\u029f\u02a2\u02a5\u02b0\u02b4\u02b9\u02bd\u02c5\u02c9\u02ce\u02d3\u02d7"+
		"\u02da\u02dd\u02e0\u02e3\u02e9\u02ef\u02f5\u02f8\u02fb\u02fe\u0302\u0306"+
		"\u0309\u030d\u0317\u031b\u031f\u032e\u0335\u033a\u033d\u0341\u0345\u034b"+
		"\u034e\u0351\u0357\u035a\u035e\u0363\u0365\u036b\u0377\u0387\u038c\u0394"+
		"\u0399\u039b\u03a2\u03a9\u03ac\u03b4\u03bf\u03c4\u03cf\u03db\u03e4\u03eb"+
		"\u03f9\u0404\u040a\u0411\u0415\u041f\u0421\u0426\u0433\u043b\u0448\u0457"+
		"\u0459\u0460\u0467\u0470\u0477\u0480\u0486\u0489\u04ac\u04ae\u04b9\u04c1"+
		"\u04c7\u04d1\u04d8\u04de\u04e3\u04ea\u04ee\u04f8\u0508\u050d\u0518\u051c"+
		"\u0525\u0529\u052e\u0531\u053f\u0548\u0554\u0556\u055b\u055e\u0567\u056c"+
		"\u0574\u0580\u0589\u058f\u0597\u059a\u059d\u05a8\u05b0\u05b9\u05c1\u05c9"+
		"\u05cd\u05da\u05dc\u05e5\u05fa\u05ff\u060b\u0618\u0621\u063c\u0643\u064b"+
		"\u0652\u065e\u066a\u066f\u0678\u067f\u0684\u0693\u069d\u06a8\u06ab\u06b7"+
		"\u06bb\u06cd\u06d2\u06d6\u06da\u06dd\u06e0\u06e3\u06f1\u06f6\u06fb\u070b"+
		"\u0716\u0720\u0729\u0730\u0736\u073f\u0742\u0745\u0748\u0751\u0759\u0762"+
		"\u0769\u076c\u0774\u0776\u0779\u0783\u0788\u078d\u0791\u0794\u0798\u079b"+
		"\u07a0\u07a8\u07b1\u07b9\u07bc\u07bf\u07c2\u07c8\u07cc\u07d4\u07ea\u07ec"+
		"\u07f1\u07f3\u07fa\u07fc\u0800\u0808\u0816\u081f\u082e\u0834\u0838\u083d"+
		"\u0845\u084e\u0851\u0867\u0869\u0874\u087b\u0882\u088c\u0893\u0896\u08a1"+
		"\u08a5\u08aa\u08b0\u08b5\u08b8\u08c3\u08cc\u08d0\u08df\u08e6\u08f2\u08f5"+
		"\u08f9\u08fd\u0906\u0909\u090c\u0913\u0918\u0921\u0935\u0937\u093d\u0944"+
		"\u0949\u0950\u0954\u095a\u0960\u0965\u096b\u0972\u0978\u0981\u0988\u098a"+
		"\u0990\u0993\u0996\u099b\u09a2\u09ab\u09b0\u09b9\u09bb\u09c0\u09c9\u09cb"+
		"\u09ce\u09e0\u09e2\u09ec\u09fe\u0a14\u0a18\u0a1d\u0a22\u0a27\u0a2c\u0a34"+
		"\u0a39\u0a3d\u0a41\u0a4a\u0a4e\u0a54\u0a65\u0a69\u0a70\u0a7a\u0a86\u0a9b"+
		"\u0aa9\u0acb\u0ad3\u0ad5\u0ae5\u0aeb\u0aef\u0afa\u0b07\u0b16\u0b3b\u0b42"+
		"\u0b4a\u0b53\u0b5b\u0b64\u0b70\u0b77\u0b7a\u0b7c\u0b86\u0b92\u0baf";
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