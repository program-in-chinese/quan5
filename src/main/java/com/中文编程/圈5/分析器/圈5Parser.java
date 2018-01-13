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
		RULE_程序 = 0, RULE_声明 = 1, RULE_表达式 = 2, RULE_算术表达式 = 3, RULE_求积表达式 = 4;
	public static final String[] ruleNames = {
		"程序", "声明", "表达式", "算术表达式", "求积表达式"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				声明();
				}
				}
				setState(13); 
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
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new 求值Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				表达式();
				setState(16);
				match(T新行);
				}
				break;
			case 2:
				_localctx = new 赋值Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(T变量名);
				setState(19);
				match(T__0);
				setState(20);
				表达式();
				setState(21);
				match(T新行);
				}
				break;
			case 3:
				_localctx = new 空行Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
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
		public 算术表达式Context 算术表达式() {
			return getRuleContext(算术表达式Context.class,0);
		}
		public 加減Context(表达式Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit加減(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class 乘除Context extends 表达式Context {
		public 求积表达式Context 求积表达式() {
			return getRuleContext(求积表达式Context.class,0);
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
		表达式Context _localctx = new 表达式Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_表达式);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new 乘除Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				求积表达式();
				}
				break;
			case 2:
				_localctx = new 加減Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				算术表达式();
				}
				break;
			case 3:
				_localctx = new 数Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(T数);
				}
				break;
			case 4:
				_localctx = new 变量Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T变量名);
				}
				break;
			case 5:
				_localctx = new 括号Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				match(T__1);
				setState(30);
				表达式();
				setState(31);
				match(T__2);
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

	public static class 算术表达式Context extends ParserRuleContext {
		public List<求积表达式Context> 求积表达式() {
			return getRuleContexts(求积表达式Context.class);
		}
		public 求积表达式Context 求积表达式(int i) {
			return getRuleContext(求积表达式Context.class,i);
		}
		public 算术表达式Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_算术表达式; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof 圈5Visitor ) return ((圈5Visitor<? extends T>)visitor).visit算术表达式(this);
			else return visitor.visitChildren(this);
		}
	}

	public final 算术表达式Context 算术表达式() throws RecognitionException {
		算术表达式Context _localctx = new 算术表达式Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_算术表达式);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			求积表达式();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T加 || _la==T減) {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==T加 || _la==T減) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(37);
				求积表达式();
				}
				}
				setState(42);
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

	public static class 求积表达式Context extends ParserRuleContext {
		public List<TerminalNode> T数() { return getTokens(圈5Parser.T数); }
		public TerminalNode T数(int i) {
			return getToken(圈5Parser.T数, i);
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
		求积表达式Context _localctx = new 求积表达式Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_求积表达式);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T数);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T乘) | (1L << T数乘) | (1L << T除) | (1L << T数除))) != 0)) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T乘) | (1L << T数乘) | (1L << T除) | (1L << T数除))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45);
				match(T数);
				}
				}
				setState(50);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4"+
		"\3\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\6\2\2\7\2\4\6\b\n\2\4\3\2\b\t\3\2\n\r\28\2\r\3\2\2\2\4\32\3\2"+
		"\2\2\6#\3\2\2\2\b%\3\2\2\2\n-\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3"+
		"\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\16"+
		"\2\2\23\33\3\2\2\2\24\25\7\6\2\2\25\26\7\3\2\2\26\27\5\6\4\2\27\30\7\16"+
		"\2\2\30\33\3\2\2\2\31\33\7\16\2\2\32\21\3\2\2\2\32\24\3\2\2\2\32\31\3"+
		"\2\2\2\33\5\3\2\2\2\34$\5\n\6\2\35$\5\b\5\2\36$\4\6\7\2\37 \7\4\2\2 !"+
		"\5\6\4\2!\"\7\5\2\2\"$\3\2\2\2#\34\3\2\2\2#\35\3\2\2\2#\36\3\2\2\2#\37"+
		"\3\2\2\2$\7\3\2\2\2%*\5\n\6\2&\'\t\2\2\2\')\5\n\6\2(&\3\2\2\2),\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+\t\3\2\2\2,*\3\2\2\2-\62\7\7\2\2./\t\3\2\2/\61"+
		"\7\7\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3"+
		"\2\2\2\64\62\3\2\2\2\7\17\32#*\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}