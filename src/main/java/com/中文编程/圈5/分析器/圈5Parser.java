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
		T__0=1, T__1=2, T__2=3, T变量名=4, T数=5, T加=6, T減=7, T乘=8, T数乘=9, T除=10, 
		T数除=11, T新行=12;
	public static final int
		RULE_程序 = 0, RULE_声明 = 1, RULE_表达式 = 2, RULE_求积表达式 = 3, RULE_最小表达式 = 4, 
		RULE_字面量 = 5;
	public static final String[] ruleNames = {
		"程序", "声明", "表达式", "求积表达式", "最小表达式", "字面量"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, null, "'+'", "'-'", "'*'", "'\u00D7'", 
		"'/'", "'\u00F7'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "T\u0001\u0002\u0003", "T\u0001", "T\u0001", "T\u0001", 
		"T\u0001", "T\u0001\u0002", "T\u0001", "T\u0001\u0002", "T\u0001\u0002"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				声明();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T变量名) | (1L << T数) | (1L << T新行))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new 求值Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				表达式(0);
				setState(18);
				match(T新行);
				}
				break;
			case 2:
				_localctx = new 赋值Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T变量名);
				setState(21);
				match(T__0);
				setState(22);
				表达式(0);
				setState(23);
				match(T新行);
				}
				break;
			case 3:
				_localctx = new 空行Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
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
		public 求积表达式Context 求积表达式() {
			return getRuleContext(求积表达式Context.class,0);
		}
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
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
		return 表达式(0);
	}

	private 表达式Context 表达式(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		表达式Context _localctx = new 表达式Context(_ctx, _parentState);
		表达式Context _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			求积表达式(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new 表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_表达式);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						match(T加);
						setState(33);
						求积表达式(0);
						}
						break;
					case 2:
						{
						_localctx = new 表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_表达式);
						setState(34);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(35);
						match(T減);
						setState(36);
						求积表达式(0);
						}
						break;
					}
					} 
				}
				setState(41);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_求积表达式, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(43);
			最小表达式();
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						match(T乘);
						setState(47);
						最小表达式();
						}
						break;
					case 2:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						match(T除);
						setState(50);
						最小表达式();
						}
						break;
					case 3:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						match(T数乘);
						setState(53);
						最小表达式();
						}
						break;
					case 4:
						{
						_localctx = new 求积表达式Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_求积表达式);
						setState(54);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(55);
						match(T数除);
						setState(56);
						最小表达式();
						}
						break;
					}
					} 
				}
				setState(61);
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
		enterRule(_localctx, 8, RULE_最小表达式);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T变量名:
			case T数:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				字面量();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__1);
				setState(64);
				表达式(0);
				setState(65);
				match(T__2);
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
		enterRule(_localctx, 10, RULE_字面量);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		case 2:
			return 表达式_sempred((表达式Context)_localctx, predIndex);
		case 3:
			return 求积表达式_sempred((求积表达式Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean 表达式_sempred(表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean 求积表达式_sempred(求积表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\3\6\3\6\5\6F"+
		"\n\6\3\7\3\7\3\7\2\4\6\b\b\2\4\6\b\n\f\2\3\3\2\6\7\2M\2\17\3\2\2\2\4\34"+
		"\3\2\2\2\6\36\3\2\2\2\b,\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16\20\5\4\3\2\17"+
		"\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23"+
		"\24\5\6\4\2\24\25\7\16\2\2\25\35\3\2\2\2\26\27\7\6\2\2\27\30\7\3\2\2\30"+
		"\31\5\6\4\2\31\32\7\16\2\2\32\35\3\2\2\2\33\35\7\16\2\2\34\23\3\2\2\2"+
		"\34\26\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\b\4\1\2\37 \5\b\5\2 )"+
		"\3\2\2\2!\"\f\4\2\2\"#\7\b\2\2#(\5\b\5\2$%\f\3\2\2%&\7\t\2\2&(\5\b\5\2"+
		"\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2"+
		"\2\2,-\b\5\1\2-.\5\n\6\2.=\3\2\2\2/\60\f\6\2\2\60\61\7\n\2\2\61<\5\n\6"+
		"\2\62\63\f\5\2\2\63\64\7\f\2\2\64<\5\n\6\2\65\66\f\4\2\2\66\67\7\13\2"+
		"\2\67<\5\n\6\289\f\3\2\29:\7\r\2\2:<\5\n\6\2;/\3\2\2\2;\62\3\2\2\2;\65"+
		"\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2"+
		"@F\5\f\7\2AB\7\4\2\2BC\5\6\4\2CD\7\5\2\2DF\3\2\2\2E@\3\2\2\2EA\3\2\2\2"+
		"F\13\3\2\2\2GH\t\2\2\2H\r\3\2\2\2\t\21\34\');=E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}