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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T为=12, T变量名=13, T数=14, T加=15, T減=16, T乘=17, T数乘=18, 
		T除=19, T数除=20, T相等=21, T新行=22, T空格=23;
	public static final int
		RULE_程序 = 0, RULE_声明 = 1, RULE_表达式 = 2, RULE_等同判断表达式 = 3, RULE_比较表达式 = 4, 
		RULE_求和表达式 = 5, RULE_求积表达式 = 6, RULE_最小表达式 = 7, RULE_字面量 = 8;
	public static final String[] ruleNames = {
		"程序", "声明", "表达式", "等同判断表达式", "比较表达式", "求和表达式", "求积表达式", "最小表达式", "字面量"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'!='", "'\u2260'", "'<'", "'>'", "'<='", "'>='", "'\u2264'", 
		"'\u2265'", "'('", "')'", "'\u4E3A'", null, null, "'+'", "'-'", "'*'", 
		"'\u00D7'", "'/'", "'\u00F7'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"T\u0001", "T\u0001\u0002\u0003", "T\u0001", "T\u0001", "T\u0001", "T\u0001", 
		"T\u0001\u0002", "T\u0001", "T\u0001\u0002", "T\u0001\u0002", "T\u0001\u0002", 
		"T\u0001\u0002"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				声明();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T变量名) | (1L << T数) | (1L << T新行))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public 声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_声明; }
	 
		public 声明Context() { }
		public void copyFrom(声明Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class 赋值Context extends 声明Context {
		public TerminalNode T变量名() { return getToken(圈5Parser.T变量名, 0); }
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 赋值Context(声明Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit赋值(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 求值Context extends 声明Context {
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 求值Context(声明Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit求值(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 空行Context extends 声明Context {
		public TerminalNode T新行() { return getToken(圈5Parser.T新行, 0); }
		public 空行Context(声明Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit空行(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 声明Context 声明() throws RecognitionException {
		声明Context _localctx = new 声明Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_声明);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new 求值Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				表达式();
				setState(24);
				match(T新行);
				}
				break;
			case 2:
				_localctx = new 赋值Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T变量名);
				setState(27);
				match(T__0);
				setState(28);
				表达式();
				setState(29);
				match(T新行);
				}
				break;
			case 3:
				_localctx = new 空行Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
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
		enterRule(_localctx, 4, RULE_表达式);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_等同判断表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			比较表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(39);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(40);
						match(T相等);
						setState(41);
						比较表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						match(T为);
						setState(44);
						比较表达式(0);
						}
						break;
					case 3:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(45);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(46);
						match(T__1);
						setState(47);
						比较表达式(0);
						}
						break;
					case 4:
						{
						_localctx = new 等同判断表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_等同判断表达式);
						setState(48);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(49);
						match(T__2);
						setState(50);
						比较表达式(0);
						}
						break;
					}
					} 
				}
				setState(55);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_比较表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(57);
			求和表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						match(T__3);
						setState(61);
						求和表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						match(T__4);
						setState(64);
						求和表达式(0);
						}
						break;
					case 3:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						match(T__5);
						setState(67);
						求和表达式(0);
						}
						break;
					case 4:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						match(T__6);
						setState(70);
						求和表达式(0);
						}
						break;
					case 5:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__7);
						setState(73);
						求和表达式(0);
						}
						break;
					case 6:
						{
						_localctx = new 比较表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_比较表达式);
						setState(74);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(75);
						match(T__8);
						setState(76);
						求和表达式(0);
						}
						break;
					}
					} 
				}
				setState(81);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_求和表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(83);
			求积表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new 求和表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求和表达式);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						match(T加);
						setState(87);
						求积表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 求和表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求和表达式);
						setState(88);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(89);
						match(T減);
						setState(90);
						求积表达式(0);
						}
						break;
					}
					} 
				}
				setState(95);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_求积表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(97);
			最小表达式();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(T乘);
						setState(101);
						最小表达式();
						}
						break;
					case 2:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(T除);
						setState(104);
						最小表达式();
						}
						break;
					case 3:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(105);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(106);
						match(T数乘);
						setState(107);
						最小表达式();
						}
						break;
					case 4:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(108);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(109);
						match(T数除);
						setState(110);
						最小表达式();
						}
						break;
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 14, RULE_最小表达式);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T变量名:
			case T数:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				字面量();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__9);
				setState(118);
				表达式();
				setState(119);
				match(T__10);
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
		enterRule(_localctx, 16, RULE_字面量);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		case 3:
			return 等同判断表达式_sempred((等同判断表达式Context)_localctx, predIndex);
		case 4:
			return 比较表达式_sempred((比较表达式Context)_localctx, predIndex);
		case 5:
			return 求和表达式_sempred((求和表达式Context)_localctx, predIndex);
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
		"\2\26\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66"+
		"\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\2\6\b\n\f\16\13\2\4\6\b\n\f\16\20\22"+
		"\2\3\3\2\17\20\2\u008a\2\25\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2"+
		"\n:\3\2\2\2\fT\3\2\2\2\16b\3\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24\26\5\4\3"+
		"\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2"+
		"\2\31\32\5\6\4\2\32\33\7\30\2\2\33#\3\2\2\2\34\35\7\17\2\2\35\36\7\3\2"+
		"\2\36\37\5\6\4\2\37 \7\30\2\2 #\3\2\2\2!#\7\30\2\2\"\31\3\2\2\2\"\34\3"+
		"\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\5\b\5\2%\7\3\2\2\2&\'\b\5\1\2\'(\5\n\6"+
		"\2(\67\3\2\2\2)*\f\6\2\2*+\7\27\2\2+\66\5\n\6\2,-\f\5\2\2-.\7\16\2\2."+
		"\66\5\n\6\2/\60\f\4\2\2\60\61\7\4\2\2\61\66\5\n\6\2\62\63\f\3\2\2\63\64"+
		"\7\5\2\2\64\66\5\n\6\2\65)\3\2\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2:;\b\6"+
		"\1\2;<\5\f\7\2<Q\3\2\2\2=>\f\b\2\2>?\7\6\2\2?P\5\f\7\2@A\f\7\2\2AB\7\7"+
		"\2\2BP\5\f\7\2CD\f\6\2\2DE\7\b\2\2EP\5\f\7\2FG\f\5\2\2GH\7\t\2\2HP\5\f"+
		"\7\2IJ\f\4\2\2JK\7\n\2\2KP\5\f\7\2LM\f\3\2\2MN\7\13\2\2NP\5\f\7\2O=\3"+
		"\2\2\2O@\3\2\2\2OC\3\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\13\3\2\2\2SQ\3\2\2\2TU\b\7\1\2UV\5\16\b\2V_\3\2\2\2"+
		"WX\f\4\2\2XY\7\21\2\2Y^\5\16\b\2Z[\f\3\2\2[\\\7\22\2\2\\^\5\16\b\2]W\3"+
		"\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2\2bc"+
		"\b\b\1\2cd\5\20\t\2ds\3\2\2\2ef\f\6\2\2fg\7\23\2\2gr\5\20\t\2hi\f\5\2"+
		"\2ij\7\25\2\2jr\5\20\t\2kl\f\4\2\2lm\7\24\2\2mr\5\20\t\2no\f\3\2\2op\7"+
		"\26\2\2pr\5\20\t\2qe\3\2\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2\2\2s"+
		"q\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2v|\5\22\n\2wx\7\f\2\2xy\5\6\4"+
		"\2yz\7\r\2\2z|\3\2\2\2{v\3\2\2\2{w\3\2\2\2|\21\3\2\2\2}~\t\2\2\2~\23\3"+
		"\2\2\2\r\27\"\65\67OQ]_qs{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}