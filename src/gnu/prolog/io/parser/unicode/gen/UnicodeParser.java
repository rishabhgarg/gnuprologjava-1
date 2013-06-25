// Generated from Unicode.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnicodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, UNICODE=2;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "UNICODE"
	};
	public static final int
		RULE_unicode_test = 0;
	public static final String[] ruleNames = {
		"unicode_test"
	};

	@Override
	public String getGrammarFileName() { return "Unicode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public UnicodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Unicode_testContext extends ParserRuleContext {
		public TerminalNode UNICODE() { return getToken(UnicodeParser.UNICODE, 0); }
		public Unicode_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicode_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnicodeVisitor ) return ((UnicodeVisitor<? extends T>)visitor).visitUnicode_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unicode_testContext unicode_test() throws RecognitionException {
		Unicode_testContext _localctx = new Unicode_testContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unicode_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(UNICODE);
			}
		}
		catch (RecognitionException re) {
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
		"\2\3\4\7\4\2\t\2\3\2\3\2\3\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\4\2\2\5\3\3"+
		"\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}