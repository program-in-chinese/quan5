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
		T__0=1, T__1=2, T__2=3, T__3=4, T为=5, T变量名=6, T数=7, T加=8, T減=9, T乘=10, 
		T数乘=11, T除=12, T数除=13, T相等=14, T大于=15, T小于=16, T大于等于=17, T数大于等于=18, T小于等于=19, 
		T数小于等于=20, T不等=21, T数不等=22, T新行=23, T空格=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T为", "T变量名", "T数", "T加", "T減", "T乘", 
		"T数乘", "T除", "T数除", "T相等", "T大于", "T小于", "T大于等于", "T数大于等于", "T小于等于", "T数小于等于", 
		"T不等", "T数不等", "T新行", "T空格"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7@\n\7\r\7\16\7A\3"+
		"\b\6\bE\n\b\r\b\16\bF\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\5\30l\n\30\3\30\3\30"+
		"\3\31\6\31q\n\31\r\31\16\31r\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\3\2\5\6\2C\\c|\u4e02\u9fa7\uf902\ufa2f\3\2\62;\3\2"+
		"\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2\t:\3\2\2\2"+
		"\13<\3\2\2\2\r?\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2"+
		"\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!Y\3\2\2"+
		"\2#[\3\2\2\2%^\3\2\2\2\'`\3\2\2\2)c\3\2\2\2+e\3\2\2\2-h\3\2\2\2/k\3\2"+
		"\2\2\61p\3\2\2\2\63\64\7\u5984\2\2\64\65\7\u679e\2\2\65\4\3\2\2\2\66\67"+
		"\7?\2\2\67\6\3\2\2\289\7*\2\29\b\3\2\2\2:;\7+\2\2;\n\3\2\2\2<=\7\u4e3c"+
		"\2\2=\f\3\2\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\16"+
		"\3\2\2\2CE\t\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\20\3\2\2\2"+
		"HI\7-\2\2I\22\3\2\2\2JK\7/\2\2K\24\3\2\2\2LM\7,\2\2M\26\3\2\2\2NO\7\u00d9"+
		"\2\2O\30\3\2\2\2PQ\7\61\2\2Q\32\3\2\2\2RS\7\u00f9\2\2S\34\3\2\2\2TU\7"+
		"?\2\2UV\7?\2\2V\36\3\2\2\2WX\7@\2\2X \3\2\2\2YZ\7>\2\2Z\"\3\2\2\2[\\\7"+
		"@\2\2\\]\7?\2\2]$\3\2\2\2^_\7\u2267\2\2_&\3\2\2\2`a\7>\2\2ab\7?\2\2b("+
		"\3\2\2\2cd\7\u2266\2\2d*\3\2\2\2ef\7#\2\2fg\7?\2\2g,\3\2\2\2hi\7\u2262"+
		"\2\2i.\3\2\2\2jl\7\17\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\f\2\2n\60"+
		"\3\2\2\2oq\t\4\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2t"+
		"u\b\31\2\2u\62\3\2\2\2\7\2AFkr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}