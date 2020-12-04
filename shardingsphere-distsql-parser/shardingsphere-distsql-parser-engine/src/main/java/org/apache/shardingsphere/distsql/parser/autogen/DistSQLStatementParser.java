// Generated from org/apache/shardingsphere/distsql/parser/autogen/DistSQLStatement.g4 by ANTLR 4.7.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DistSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, TILDE=4, VERTICALBAR=5, AMPERSAND=6, SIGNEDLEFTSHIFT=7, 
		SIGNEDRIGHTSHIFT=8, CARET=9, MOD=10, COLON=11, PLUS=12, MINUS=13, ASTERISK=14, 
		SLASH=15, BACKSLASH=16, DOT=17, DOTASTERISK=18, SAFEEQ=19, DEQ=20, EQ=21, 
		NEQ=22, GT=23, GTE=24, LT=25, LTE=26, POUND=27, LP=28, RP=29, LBE=30, 
		RBE=31, LBT=32, RBT=33, COMMA=34, DQ=35, SQ=36, BQ=37, QUESTION=38, AT=39, 
		SEMI=40, JSONSEPARATOR=41, UL=42, WS=43, CREATE=44, DATASOURCES=45, SHARDINGRULE=46, 
		FOR_GENERATOR=47, IDENTIFIER=48, STRING=49, INT=50, HEX=51, NUMBER=52, 
		HEXDIGIT=53, BITNUM=54;
	public static final int
		RULE_execute = 0, RULE_createDataSources = 1, RULE_createShardingRule = 2, 
		RULE_tableRule = 3, RULE_dataSource = 4, RULE_dataSourceDefinition = 5, 
		RULE_tableRuleDefinition = 6, RULE_strategyType = 7, RULE_strategyDefinition = 8, 
		RULE_strategyProps = 9, RULE_strategyProp = 10, RULE_dataSourceName = 11, 
		RULE_tableName = 12, RULE_columName = 13, RULE_hostName = 14, RULE_ip = 15, 
		RULE_port = 16, RULE_dbName = 17, RULE_user = 18, RULE_password = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createDataSources", "createShardingRule", "tableRule", "dataSource", 
			"dataSourceDefinition", "tableRuleDefinition", "strategyType", "strategyDefinition", 
			"strategyProps", "strategyProp", "dataSourceName", "tableName", "columName", 
			"hostName", "ip", "port", "dbName", "user", "password"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "'->>'", "'_'", null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "TILDE", "VERTICALBAR", "AMPERSAND", "SIGNEDLEFTSHIFT", 
			"SIGNEDRIGHTSHIFT", "CARET", "MOD", "COLON", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "BACKSLASH", "DOT", "DOTASTERISK", "SAFEEQ", "DEQ", "EQ", "NEQ", 
			"GT", "GTE", "LT", "LTE", "POUND", "LP", "RP", "LBE", "RBE", "LBT", "RBT", 
			"COMMA", "DQ", "SQ", "BQ", "QUESTION", "AT", "SEMI", "JSONSEPARATOR", 
			"UL", "WS", "CREATE", "DATASOURCES", "SHARDINGRULE", "FOR_GENERATOR", 
			"IDENTIFIER", "STRING", "INT", "HEX", "NUMBER", "HEXDIGIT", "BITNUM"
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
	public String getGrammarFileName() { return "DistSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DistSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExecuteContext extends ParserRuleContext {
		public CreateDataSourcesContext createDataSources() {
			return getRuleContext(CreateDataSourcesContext.class,0);
		}
		public CreateShardingRuleContext createShardingRule() {
			return getRuleContext(CreateShardingRuleContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(DistSQLStatementParser.SEMI, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitExecute(this);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(40);
				createDataSources();
				}
				break;
			case 2:
				{
				setState(41);
				createShardingRule();
				}
				break;
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(44);
				match(SEMI);
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

	public static class CreateDataSourcesContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DistSQLStatementParser.CREATE, 0); }
		public TerminalNode DATASOURCES() { return getToken(DistSQLStatementParser.DATASOURCES, 0); }
		public TerminalNode LP() { return getToken(DistSQLStatementParser.LP, 0); }
		public List<DataSourceContext> dataSource() {
			return getRuleContexts(DataSourceContext.class);
		}
		public DataSourceContext dataSource(int i) {
			return getRuleContext(DataSourceContext.class,i);
		}
		public TerminalNode RP() { return getToken(DistSQLStatementParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DistSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DistSQLStatementParser.COMMA, i);
		}
		public CreateDataSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDataSources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitCreateDataSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDataSourcesContext createDataSources() throws RecognitionException {
		CreateDataSourcesContext _localctx = new CreateDataSourcesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createDataSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(CREATE);
			setState(48);
			match(DATASOURCES);
			setState(49);
			match(LP);
			setState(50);
			dataSource();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51);
				match(COMMA);
				setState(52);
				dataSource();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateShardingRuleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DistSQLStatementParser.CREATE, 0); }
		public TerminalNode SHARDINGRULE() { return getToken(DistSQLStatementParser.SHARDINGRULE, 0); }
		public TerminalNode LP() { return getToken(DistSQLStatementParser.LP, 0); }
		public List<TableRuleContext> tableRule() {
			return getRuleContexts(TableRuleContext.class);
		}
		public TableRuleContext tableRule(int i) {
			return getRuleContext(TableRuleContext.class,i);
		}
		public TerminalNode RP() { return getToken(DistSQLStatementParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DistSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DistSQLStatementParser.COMMA, i);
		}
		public CreateShardingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createShardingRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitCreateShardingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateShardingRuleContext createShardingRule() throws RecognitionException {
		CreateShardingRuleContext _localctx = new CreateShardingRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createShardingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CREATE);
			setState(61);
			match(SHARDINGRULE);
			setState(62);
			match(LP);
			setState(63);
			tableRule();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				setState(65);
				tableRule();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRuleContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DistSQLStatementParser.EQ, 0); }
		public TableRuleDefinitionContext tableRuleDefinition() {
			return getRuleContext(TableRuleDefinitionContext.class,0);
		}
		public TableRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitTableRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRuleContext tableRule() throws RecognitionException {
		TableRuleContext _localctx = new TableRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tableRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			tableName();
			setState(74);
			match(EQ);
			setState(75);
			tableRuleDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSourceContext extends ParserRuleContext {
		public DataSourceNameContext dataSourceName() {
			return getRuleContext(DataSourceNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(DistSQLStatementParser.EQ, 0); }
		public DataSourceDefinitionContext dataSourceDefinition() {
			return getRuleContext(DataSourceDefinitionContext.class,0);
		}
		public DataSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitDataSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceContext dataSource() throws RecognitionException {
		DataSourceContext _localctx = new DataSourceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			dataSourceName();
			setState(78);
			match(EQ);
			setState(79);
			dataSourceDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSourceDefinitionContext extends ParserRuleContext {
		public HostNameContext hostName() {
			return getRuleContext(HostNameContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(DistSQLStatementParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DistSQLStatementParser.COLON, i);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public DbNameContext dbName() {
			return getRuleContext(DbNameContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public DataSourceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSourceDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitDataSourceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceDefinitionContext dataSourceDefinition() throws RecognitionException {
		DataSourceDefinitionContext _localctx = new DataSourceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataSourceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			hostName();
			setState(82);
			match(COLON);
			setState(83);
			port();
			setState(84);
			match(COLON);
			setState(85);
			dbName();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(86);
				match(COLON);
				setState(87);
				user();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(88);
					match(COLON);
					setState(89);
					password();
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

	public static class TableRuleDefinitionContext extends ParserRuleContext {
		public StrategyTypeContext strategyType() {
			return getRuleContext(StrategyTypeContext.class,0);
		}
		public TerminalNode LP() { return getToken(DistSQLStatementParser.LP, 0); }
		public StrategyDefinitionContext strategyDefinition() {
			return getRuleContext(StrategyDefinitionContext.class,0);
		}
		public TerminalNode RP() { return getToken(DistSQLStatementParser.RP, 0); }
		public TableRuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRuleDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitTableRuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRuleDefinitionContext tableRuleDefinition() throws RecognitionException {
		TableRuleDefinitionContext _localctx = new TableRuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableRuleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			strategyType();
			setState(95);
			match(LP);
			setState(96);
			strategyDefinition();
			setState(97);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrategyTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public StrategyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitStrategyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyTypeContext strategyType() throws RecognitionException {
		StrategyTypeContext _localctx = new StrategyTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_strategyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrategyDefinitionContext extends ParserRuleContext {
		public ColumNameContext columName() {
			return getRuleContext(ColumNameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DistSQLStatementParser.COMMA, 0); }
		public StrategyPropsContext strategyProps() {
			return getRuleContext(StrategyPropsContext.class,0);
		}
		public StrategyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitStrategyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyDefinitionContext strategyDefinition() throws RecognitionException {
		StrategyDefinitionContext _localctx = new StrategyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_strategyDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			columName();
			setState(102);
			match(COMMA);
			setState(103);
			strategyProps();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrategyPropsContext extends ParserRuleContext {
		public List<StrategyPropContext> strategyProp() {
			return getRuleContexts(StrategyPropContext.class);
		}
		public StrategyPropContext strategyProp(int i) {
			return getRuleContext(StrategyPropContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DistSQLStatementParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DistSQLStatementParser.COMMA, i);
		}
		public StrategyPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyProps; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitStrategyProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyPropsContext strategyProps() throws RecognitionException {
		StrategyPropsContext _localctx = new StrategyPropsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_strategyProps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			strategyProp();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				strategyProp();
				}
				}
				setState(112);
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

	public static class StrategyPropContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(DistSQLStatementParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(DistSQLStatementParser.INT, 0); }
		public StrategyPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyProp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitStrategyProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrategyPropContext strategyProp() throws RecognitionException {
		StrategyPropContext _localctx = new StrategyPropContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strategyProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << NUMBER))) != 0)) ) {
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

	public static class DataSourceNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public DataSourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSourceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitDataSourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceNameContext dataSourceName() throws RecognitionException {
		DataSourceNameContext _localctx = new DataSourceNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataSourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public ColumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitColumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumNameContext columName() throws RecognitionException {
		ColumNameContext _localctx = new ColumNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public IpContext ip() {
			return getRuleContext(IpContext.class,0);
		}
		public HostNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitHostName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostNameContext hostName() throws RecognitionException {
		HostNameContext _localctx = new HostNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hostName);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				ip();
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

	public static class IpContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DistSQLStatementParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DistSQLStatementParser.NUMBER, i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(NUMBER);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DistSQLStatementParser.INT, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public DbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbNameContext dbName() throws RecognitionException {
		DbNameContext _localctx = new DbNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(DistSQLStatementParser.NUMBER, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
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

	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DistSQLStatementParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(DistSQLStatementParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DistSQLStatementParser.STRING, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DistSQLStatementVisitor ) return ((DistSQLStatementVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_password);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\5\2\60\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13o\n\13\f\13\16\13r\13\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20~\n\20\3\21\6\21\u0081"+
		"\n\21\r\21\16\21\u0082\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2"+
		"\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\5\2\62\62\64\64"+
		"\66\66\4\2\62\62\66\66\4\2\62\63\66\66\2\u0081\2,\3\2\2\2\4\61\3\2\2\2"+
		"\6>\3\2\2\2\bK\3\2\2\2\nO\3\2\2\2\fS\3\2\2\2\16`\3\2\2\2\20e\3\2\2\2\22"+
		"g\3\2\2\2\24k\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2"+
		"\36}\3\2\2\2 \u0080\3\2\2\2\"\u0084\3\2\2\2$\u0086\3\2\2\2&\u0088\3\2"+
		"\2\2(\u008a\3\2\2\2*-\5\4\3\2+-\5\6\4\2,*\3\2\2\2,+\3\2\2\2-/\3\2\2\2"+
		".\60\7*\2\2/.\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\7.\2\2\62\63\7/\2"+
		"\2\63\64\7\36\2\2\649\5\n\6\2\65\66\7$\2\2\668\5\n\6\2\67\65\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\37\2\2=\5\3\2"+
		"\2\2>?\7.\2\2?@\7\60\2\2@A\7\36\2\2AF\5\b\5\2BC\7$\2\2CE\5\b\5\2DB\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\37\2\2J\7\3"+
		"\2\2\2KL\5\32\16\2LM\7\27\2\2MN\5\16\b\2N\t\3\2\2\2OP\5\30\r\2PQ\7\27"+
		"\2\2QR\5\f\7\2R\13\3\2\2\2ST\5\36\20\2TU\7\r\2\2UV\5\"\22\2VW\7\r\2\2"+
		"W^\5$\23\2XY\7\r\2\2Y\\\5&\24\2Z[\7\r\2\2[]\5(\25\2\\Z\3\2\2\2\\]\3\2"+
		"\2\2]_\3\2\2\2^X\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`a\5\20\t\2ab\7\36\2\2bc"+
		"\5\22\n\2cd\7\37\2\2d\17\3\2\2\2ef\7\62\2\2f\21\3\2\2\2gh\5\34\17\2hi"+
		"\7$\2\2ij\5\24\13\2j\23\3\2\2\2kp\5\26\f\2lm\7$\2\2mo\5\26\f\2nl\3\2\2"+
		"\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\25\3\2\2\2rp\3\2\2\2st\t\2\2\2t\27\3"+
		"\2\2\2uv\7\62\2\2v\31\3\2\2\2wx\7\62\2\2x\33\3\2\2\2yz\7\62\2\2z\35\3"+
		"\2\2\2{~\7\62\2\2|~\5 \21\2}{\3\2\2\2}|\3\2\2\2~\37\3\2\2\2\177\u0081"+
		"\7\66\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083!\3\2\2\2\u0084\u0085\7\64\2\2\u0085#\3\2\2\2\u0086"+
		"\u0087\7\62\2\2\u0087%\3\2\2\2\u0088\u0089\t\3\2\2\u0089\'\3\2\2\2\u008a"+
		"\u008b\t\4\2\2\u008b)\3\2\2\2\13,/9F\\^p}\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}