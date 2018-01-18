// Generated from com/中文编程/圈5/分析器/圈5.g4 by ANTLR 4.7
package com.中文编程.圈5.分析器;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 圈5Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T为=4, T变量名=5, T数=6, T加=7, T減=8, T乘=9, T数乘=10, 
		T除=11, T数除=12, T相等=13, T大于=14, T小于=15, T大于等于=16, T数大于等于=17, T小于等于=18, 
		T数小于等于=19, T不等=20, T数不等=21, T新行=22, T空格=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T为", "T变量名", "T数", "T加", "T減", "T乘", "T数乘", "T除", 
		"T数除", "T相等", "T大于", "T小于", "T大于等于", "T数大于等于", "T小于等于", "T数小于等于", "T不等", 
		"T数不等", "T新行", "T空格"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'\u4E3A'", null, null, "'+'", "'-'", "'*'", 
		"'\u00D7'", "'/'", "'\u00F7'", "'=='", "'>'", "'<'", "'>='", "'\u2265'", 
		"'<='", "'\u2264'", "'!='", "'\u2260'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "T\u0001", "T\u0001\u0002\u0003", "T\u0001", "T\u0001", 
		"T\u0001", "T\u0001", "T\u0001\u0002", "T\u0001", "T\u0001\u0002", "T\u0001\u0002", 
		"T\u0001\u0002", "T\u0001\u0002", "T\u0001\u0002\u0003\u0004", "T\u0001\u0002\u0003\u0004\u0005", 
		"T\u0001\u0002\u0003\u0004", "T\u0001\u0002\u0003\u0004\u0005", "T\u0001\u0002", 
		"T\u0001\u0002\u0003", "T\u0001\u0002", "T\u0001\u0002"
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


	public 圈5Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "圈5.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6;\n\6\r\6\16\6<\3\7\6\7@\n\7\r\7\16\7A\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\5\27g\n\27\3\27\3\27\3\30\6\30l\n\30\r\30\16\30"+
		"m\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\5\6\2C\\"+
		"c|\u4e02\u9fa7\uf902\ufa2f\3\2\62;\3\2\"\"\2t\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2"+
		"\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17C\3\2\2\2\21E"+
		"\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35"+
		"R\3\2\2\2\37T\3\2\2\2!V\3\2\2\2#Y\3\2\2\2%[\3\2\2\2\'^\3\2\2\2)`\3\2\2"+
		"\2+c\3\2\2\2-f\3\2\2\2/k\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63\64\7*\2"+
		"\2\64\6\3\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7\u4e3c\2\28\n\3\2\2\29"+
		";\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\f\3\2\2\2>@\t\3\2\2"+
		"?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\16\3\2\2\2CD\7-\2\2D\20\3\2"+
		"\2\2EF\7/\2\2F\22\3\2\2\2GH\7,\2\2H\24\3\2\2\2IJ\7\u00d9\2\2J\26\3\2\2"+
		"\2KL\7\61\2\2L\30\3\2\2\2MN\7\u00f9\2\2N\32\3\2\2\2OP\7?\2\2PQ\7?\2\2"+
		"Q\34\3\2\2\2RS\7@\2\2S\36\3\2\2\2TU\7>\2\2U \3\2\2\2VW\7@\2\2WX\7?\2\2"+
		"X\"\3\2\2\2YZ\7\u2267\2\2Z$\3\2\2\2[\\\7>\2\2\\]\7?\2\2]&\3\2\2\2^_\7"+
		"\u2266\2\2_(\3\2\2\2`a\7#\2\2ab\7?\2\2b*\3\2\2\2cd\7\u2262\2\2d,\3\2\2"+
		"\2eg\7\17\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\f\2\2i.\3\2\2\2jl\t\4"+
		"\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\30\2\2p\60"+
		"\3\2\2\2\7\2<Afm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}