// Generated from 圈5.g4 by ANTLR 4.7
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
		RULE_程序 = 0, RULE_声明 = 1, RULE_表达式 = 2;
	public static final String[] ruleNames = {
		"程序", "声明", "表达式"
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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				声明();
				}
				}
				setState(9); 
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
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new 求值Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				表达式(0);
				setState(12);
				match(T新行);
				}
				break;
			case 2:
				_localctx = new 赋值Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(T变量名);
				setState(15);
				match(T__0);
				setState(16);
				表达式(0);
				setState(17);
				match(T新行);
				}
				break;
			case 3:
				_localctx = new 空行Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
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
		public 表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_表达式; }
	 
		public 表达式Context() { }
		public void copyFrom(表达式Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class 数Context extends 表达式Context {
		public TerminalNode T数() { return getToken(圈5Parser.T数, 0); }
		public 数Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit数(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 加減Context extends 表达式Context {
		public Token 运算符;
		public List<表达式Context> 表达式() {
			return getRuleContexts(表达式Context.class);
		}
		public 表达式Context 表达式(int i) {
			return getRuleContext(表达式Context.class,i);
		}
		public 加減Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit加減(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 乘除Context extends 表达式Context {
		public Token 运算符;
		public List<表达式Context> 表达式() {
			return getRuleContexts(表达式Context.class);
		}
		public 表达式Context 表达式(int i) {
			return getRuleContext(表达式Context.class,i);
		}
		public 乘除Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit乘除(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 括号Context extends 表达式Context {
		public 表达式Context 表达式() {
			return getRuleContext(表达式Context.class,0);
		}
		public 括号Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit括号(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 变量Context extends 表达式Context {
		public TerminalNode T变量名() { return getToken(圈5Parser.T变量名, 0); }
		public 变量Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit变量(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T数:
				{
				_localctx = new 数Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(T数);
				}
				break;
			case T变量名:
				{
				_localctx = new 变量Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T变量名);
				}
				break;
			case T__1:
				{
				_localctx = new 括号Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__1);
				setState(26);
				表达式(0);
				setState(27);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new 乘除Context(new 表达式Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_表达式);
						setState(31);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(32);
						((乘除Context)_localctx).运算符 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T乘) | (1L << T数乘) | (1L << T除) | (1L << T数除))) != 0)) ) {
							((乘除Context)_localctx).运算符 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(33);
						表达式(6);
						}
						break;
					case 2:
						{
						_localctx = new 加減Context(new 表达式Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_表达式);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						((加減Context)_localctx).运算符 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T加 || _la==T減) ) {
							((加減Context)_localctx).运算符 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						表达式(5);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return 表达式_sempred((表达式Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean 表达式_sempred(表达式Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\n\r\3\2\b\t\2\60"+
		"\2\t\3\2\2\2\4\26\3\2\2\2\6\37\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3"+
		"\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7\16\2"+
		"\2\17\27\3\2\2\2\20\21\7\6\2\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7\16"+
		"\2\2\24\27\3\2\2\2\25\27\7\16\2\2\26\r\3\2\2\2\26\20\3\2\2\2\26\25\3\2"+
		"\2\2\27\5\3\2\2\2\30\31\b\4\1\2\31 \7\7\2\2\32 \7\6\2\2\33\34\7\4\2\2"+
		"\34\35\5\6\4\2\35\36\7\5\2\2\36 \3\2\2\2\37\30\3\2\2\2\37\32\3\2\2\2\37"+
		"\33\3\2\2\2 )\3\2\2\2!\"\f\7\2\2\"#\t\2\2\2#(\5\6\4\b$%\f\6\2\2%&\t\3"+
		"\2\2&(\5\6\4\7\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7"+
		"\3\2\2\2+)\3\2\2\2\7\13\26\37\')";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}