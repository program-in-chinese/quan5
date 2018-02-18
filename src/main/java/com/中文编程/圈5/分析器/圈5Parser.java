// Generated from com/中文编程/圈5/分析器/圈5.g4 by ANTLR 4.7
package com.中文编程.圈5.分析器;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 圈5Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T为=5, T变量名=6, T数=7, T加=8, T減=9, T乘=10, 
		T数乘=11, T除=12, T数除=13, T相等=14, T大于=15, T小于=16, T大于等于=17, T数大于等于=18, T小于等于=19, 
		T数小于等于=20, T不等=21, T数不等=22, T新行=23, T空格=24;
	public static final int
		RULE_程序 = 0, RULE_声明 = 1, RULE_条件声明 = 2, RULE_赋值声明 = 3, RULE_求值声明 = 4, 
		RULE_表达式 = 5, RULE_等同判断表达式 = 6, RULE_比较表达式 = 7, RULE_求和表达式 = 8, RULE_求积表达式 = 9, 
		RULE_最小表达式 = 10, RULE_字面量 = 11;
	public static final String[] ruleNames = {
		"程序", "声明", "条件声明", "赋值声明", "求值声明", "表达式", "等同判断表达式", "比较表达式", "求和表达式", 
		"求积表达式", "最小表达式", "字面量"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u5982\u679C'", "'='", "'('", "')'", "'\u4E3A'", null, null, "'+'", 
		"'-'", "'*'", "'\u00D7'", "'/'", "'\u00F7'", "'=='", "'>'", "'<'", "'>='", 
		"'\u2265'", "'<='", "'\u2264'", "'!='", "'\u2260'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "T\u0001", "T\u0001\u0002\u0003", "T\u0001", 
		"T\u0001", "T\u0001", "T\u0001", "T\u0001\u0002", "T\u0001", "T\u0001\u0002", 
		"T\u0001\u0002", "T\u0001\u0002", "T\u0001\u0002", "T\u0001\u0002\u0003\u0004", 
		"T\u0001\u0002\u0003\u0004\u0005", "T\u0001\u0002\u0003\u0004", "T\u0001\u0002\u0003\u0004\u0005", 
		"T\u0001\u0002", "T\u0001\u0002\u0003", "T\u0001\u0002", "T\u0001\u0002"
	};
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
	public String getGrammarFileName() { return "圈5.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public 圈5Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class 程序Context extends ParserRuleContext {
		public List<声明Context> 声明() {
			return getRuleContexts(声明Context.class);
		}
		public 声明Context 声明(int i) {
			return getRuleContext(声明Context.class,i);
		}
		public 程序Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_程序; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit程序(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 程序Context 程序() throws RecognitionException {
		程序Context _localctx = new 程序Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_程序);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				声明();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T变量名) | (1L << T数) | (1L << T新行))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 声明Context extends ParserRuleContext {
		public 赋值声明Context 赋值声明() {
			return getRuleContext(赋值声明Context.class,0);
		}
		public 条件声明Context 条件声明() {
			return getRuleContext(条件声明Context.class,0);
		}
		public 求值声明Context 求值声明() {
			return getRuleContext(求值声明Context.class,0);
		}
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_声明; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit声明(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 声明Context 声明() throws RecognitionException {
		声明Context _localctx = new 声明Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_声明);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				赋值声明();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				条件声明();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				求值声明();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(T新行);
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

	public static class 条件声明Context extends ParserRuleContext {
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public 声明Context 声明() {
			return getRuleContext(声明Context.class,0);
		}
		public 条件声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_条件声明; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit条件声明(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 条件声明Context 条件声明() throws RecognitionException {
		条件声明Context _localctx = new 条件声明Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_条件声明);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			表达式();
			setState(37);
			声明();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 赋值声明Context extends ParserRuleContext {
		public TerminalNode T变量名() { return getToken(圈5Parser.T变量名, 0); }
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 赋值声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_赋值声明; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit赋值声明(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 赋值声明Context 赋值声明() throws RecognitionException {
		赋值声明Context _localctx = new 赋值声明Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_赋值声明);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T变量名);
			setState(40);
			match(T__1);
			setState(41);
			表达式();
			setState(42);
			match(T新行);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 求值声明Context extends ParserRuleContext {
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 求值声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_求值声明; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit求值声明(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 求值声明Context 求值声明() throws RecognitionException {
		求值声明Context _localctx = new 求值声明Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_求值声明);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			表达式();
			setState(45);
			match(T新行);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 表达式Context extends ParserRuleContext {
		public 等同判断表达式Context 等同判断表达式() {
			return getRuleContext(等同判断表达式Context.class,0);
		}
		public 表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 表达式Context 表达式() throws RecognitionException {
		表达式Context _localctx = new 表达式Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_表达式);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			等同判断表达式(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 等同判断表达式Context extends ParserRuleContext {
		public 比较表达式Context 比较表达式() {
			return getRuleContext(比较表达式Context.class,0);
		}
		public 等同判断表达式Context 等同判断表达式() {
			return getRuleContext(等同判断表达式Context.class,0);
		}
		public 等同判断表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_等同判断表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit等同判断表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 等同判断表达式Context 等同判断表达式() throws RecognitionException {
		return 等同判断表达式(0);
	}

	private 等同判断表达式Context 等同判断表达式(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		等同判断表达式Context _localctx = new 等同判断表达式Context(_ctx, _parentState);
		等同判断表达式Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_等同判断表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			比较表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						match(T相等);
						setState(54);
						比较表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						match(T为);
						setState(57);
						比较表达式(0);
						}
						break;
					case 3:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(58);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(59);
						match(T不等);
						setState(60);
						比较表达式(0);
						}
						break;
					case 4:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(61);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(62);
						match(T数不等);
						setState(63);
						比较表达式(0);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class 比较表达式Context extends ParserRuleContext {
		public 求和表达式Context 求和表达式() {
			return getRuleContext(求和表达式Context.class,0);
		}
		public 比较表达式Context 比较表达式() {
			return getRuleContext(比较表达式Context.class,0);
		}
		public 比较表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_比较表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit比较表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 比较表达式Context 比较表达式() throws RecognitionException {
		return 比较表达式(0);
	}

	private 比较表达式Context 比较表达式(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		比较表达式Context _localctx = new 比较表达式Context(_ctx, _parentState);
		比较表达式Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_比较表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			求和表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(72);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(73);
						match(T小于);
						setState(74);
						求和表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(75);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(76);
						match(T大于);
						setState(77);
						求和表达式(0);
						}
						break;
					case 3:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(78);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(79);
						match(T小于等于);
						setState(80);
						求和表达式(0);
						}
						break;
					case 4:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(81);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(82);
						match(T大于等于);
						setState(83);
						求和表达式(0);
						}
						break;
					case 5:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(84);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(85);
						match(T数小于等于);
						setState(86);
						求和表达式(0);
						}
						break;
					case 6:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(87);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(88);
						match(T数大于等于);
						setState(89);
						求和表达式(0);
						}
						break;
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class 求和表达式Context extends ParserRuleContext {
		public 求积表达式Context 求积表达式() {
			return getRuleContext(求积表达式Context.class,0);
		}
		public 求和表达式Context 求和表达式() {
			return getRuleContext(求和表达式Context.class,0);
		}
		public 求和表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_求和表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit求和表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 求和表达式Context 求和表达式() throws RecognitionException {
		return 求和表达式(0);
	}

	private 求和表达式Context 求和表达式(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		求和表达式Context _localctx = new 求和表达式Context(_ctx, _parentState);
		求和表达式Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_求和表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			求积表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new 求和表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求和表达式);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(T加);
						setState(100);
						求积表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 求和表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求和表达式);
						setState(101);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(102);
						match(T減);
						setState(103);
						求积表达式(0);
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class 求积表达式Context extends ParserRuleContext {
		public 最小表达式Context 最小表达式() {
			return getRuleContext(最小表达式Context.class,0);
		}
		public 求积表达式Context 求积表达式() {
			return getRuleContext(求积表达式Context.class,0);
		}
		public 求积表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_求积表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit求积表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 求积表达式Context 求积表达式() throws RecognitionException {
		return 求积表达式(0);
	}

	private 求积表达式Context 求积表达式(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		求积表达式Context _localctx = new 求积表达式Context(_ctx, _parentState);
		求积表达式Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_求积表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			最小表达式();
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						match(T乘);
						setState(114);
						最小表达式();
						}
						break;
					case 2:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						match(T除);
						setState(117);
						最小表达式();
						}
						break;
					case 3:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
						match(T数乘);
						setState(120);
						最小表达式();
						}
						break;
					case 4:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(121);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(122);
						match(T数除);
						setState(123);
						最小表达式();
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class 最小表达式Context extends ParserRuleContext {
		public 字面量Context 字面量() {
			return getRuleContext(字面量Context.class,0);
		}
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public 最小表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_最小表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit最小表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 最小表达式Context 最小表达式() throws RecognitionException {
		最小表达式Context _localctx = new 最小表达式Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_最小表达式);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T变量名:
			case T数:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				字面量();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__2);
				setState(131);
				表达式();
				setState(132);
				match(T__3);
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

	public static class 字面量Context extends ParserRuleContext {
		public TerminalNode T数() { return getToken(圈5Parser.T数, 0); }
		public TerminalNode T变量名() { return getToken(圈5Parser.T变量名, 0); }
		public 字面量Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_字面量; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit字面量(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 字面量Context 字面量() throws RecognitionException {
		字面量Context _localctx = new 字面量Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_字面量);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==T变量名 || _la==T数) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return 等同判断表达式_sempred((等同判断表达式Context)_localctx, predIndex);
		case 7:
			return 比较表达式_sempred((比较表达式Context)_localctx, predIndex);
		case 8:
			return 求和表达式_sempred((求和表达式Context)_localctx, predIndex);
		case 9:
			return 求积表达式_sempred((求积表达式Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean 等同判断表达式_sempred(等同判断表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean 比较表达式_sempred(比较表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean 求和表达式_sempred(求和表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean 求积表达式_sempred(求积表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\5\3$"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bC\n\b\f\b\16\bF"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\2\6\16\20\22\24\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\b\t\2\u0095\2\33\3\2\2\2\4#\3\2"+
		"\2\2\6%\3\2\2\2\b)\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2\16\63\3\2\2\2\20G\3"+
		"\2\2\2\22a\3\2\2\2\24o\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\34"+
		"\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3"+
		"\3\2\2\2\37$\5\b\5\2 $\5\6\4\2!$\5\n\6\2\"$\7\31\2\2#\37\3\2\2\2# \3\2"+
		"\2\2#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\7\3\2\2&\'\5\f\7\2\'(\5\4\3\2("+
		"\7\3\2\2\2)*\7\b\2\2*+\7\4\2\2+,\5\f\7\2,-\7\31\2\2-\t\3\2\2\2./\5\f\7"+
		"\2/\60\7\31\2\2\60\13\3\2\2\2\61\62\5\16\b\2\62\r\3\2\2\2\63\64\b\b\1"+
		"\2\64\65\5\20\t\2\65D\3\2\2\2\66\67\f\6\2\2\678\7\20\2\28C\5\20\t\29:"+
		"\f\5\2\2:;\7\7\2\2;C\5\20\t\2<=\f\4\2\2=>\7\27\2\2>C\5\20\t\2?@\f\3\2"+
		"\2@A\7\30\2\2AC\5\20\t\2B\66\3\2\2\2B9\3\2\2\2B<\3\2\2\2B?\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\17\3\2\2\2FD\3\2\2\2GH\b\t\1\2HI\5\22\n\2"+
		"I^\3\2\2\2JK\f\b\2\2KL\7\22\2\2L]\5\22\n\2MN\f\7\2\2NO\7\21\2\2O]\5\22"+
		"\n\2PQ\f\6\2\2QR\7\25\2\2R]\5\22\n\2ST\f\5\2\2TU\7\23\2\2U]\5\22\n\2V"+
		"W\f\4\2\2WX\7\26\2\2X]\5\22\n\2YZ\f\3\2\2Z[\7\24\2\2[]\5\22\n\2\\J\3\2"+
		"\2\2\\M\3\2\2\2\\P\3\2\2\2\\S\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2"+
		"^\\\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ab\b\n\1\2bc\5\24\13\2cl\3"+
		"\2\2\2de\f\4\2\2ef\7\n\2\2fk\5\24\13\2gh\f\3\2\2hi\7\13\2\2ik\5\24\13"+
		"\2jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23\3\2\2\2nl\3\2"+
		"\2\2op\b\13\1\2pq\5\26\f\2q\u0080\3\2\2\2rs\f\6\2\2st\7\f\2\2t\177\5\26"+
		"\f\2uv\f\5\2\2vw\7\16\2\2w\177\5\26\f\2xy\f\4\2\2yz\7\r\2\2z\177\5\26"+
		"\f\2{|\f\3\2\2|}\7\17\2\2}\177\5\26\f\2~r\3\2\2\2~u\3\2\2\2~x\3\2\2\2"+
		"~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\25\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0089\5\30\r\2\u0084\u0085\7\5\2"+
		"\2\u0085\u0086\5\f\7\2\u0086\u0087\7\6\2\2\u0087\u0089\3\2\2\2\u0088\u0083"+
		"\3\2\2\2\u0088\u0084\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\t\2\2\2\u008b"+
		"\31\3\2\2\2\r\35#BD\\^jl~\u0080\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}