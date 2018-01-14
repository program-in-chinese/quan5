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
		T__0=1, T变量名=2, T数=3, T加=4, T減=5, T乘=6, T数乘=7, T除=8, T数除=9, T新行=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T变量名", "T数", "T加", "T減", "T乘", "T数乘", "T除", "T数除", "T新行"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, null, "'+'", "'-'", "'*'", "'\u00D7'", "'/'", "'\u00F7'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "T\u0001\u0002\u0003", "T\u0001", "T\u0001", "T\u0001", "T\u0001", 
		"T\u0001\u0002", "T\u0001", "T\u0001\u0002", "T\u0001\u0002"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\64\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\3\6\3\33\n\3\r\3\16\3\34\3\4\6\4 \n\4\r\4\16\4!\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13\61\n\13\3\13\3\13"+
		"\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\6\2C\\c|\u4e02"+
		"\u9fa7\uf902\ufa2f\3\2\62;\2\66\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2\7\37\3\2\2\2\t#\3\2\2\2\13"+
		"%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21+\3\2\2\2\23-\3\2\2\2\25\60\3\2\2"+
		"\2\27\30\7?\2\2\30\4\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\32\3\2\2\2\34\35\3\2\2\2\35\6\3\2\2\2\36 \t\3\2\2\37\36\3\2\2\2 !"+
		"\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\b\3\2\2\2#$\7-\2\2$\n\3\2\2\2%&\7/\2"+
		"\2&\f\3\2\2\2\'(\7,\2\2(\16\3\2\2\2)*\7\u00d9\2\2*\20\3\2\2\2+,\7\61\2"+
		"\2,\22\3\2\2\2-.\7\u00f9\2\2.\24\3\2\2\2/\61\7\17\2\2\60/\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\7\f\2\2\63\26\3\2\2\2\6\2\34!\60\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}