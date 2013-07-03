// Generated from Unicode.g4 by ANTLR 4.1
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
		WS=1, VARIABLE_TOKEN=2, IDENTIFIER_TOKEN=3;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "VARIABLE_TOKEN", "IDENTIFIER_TOKEN"
	};
	public static final int
		RULE_type = 0;
	public static final String[] ruleNames = {
		"type"
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_TOKEN() { return getToken(UnicodeParser.IDENTIFIER_TOKEN, 0); }
		public TerminalNode VARIABLE_TOKEN() { return getToken(UnicodeParser.VARIABLE_TOKEN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnicodeVisitor ) return ((UnicodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(6);
			switch (_input.LA(1)) {
			case VARIABLE_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2); match(VARIABLE_TOKEN);
				System.out.println("Var");
				}
				break;
			case IDENTIFIER_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(4); match(IDENTIFIER_TOKEN);
				System.out.println("Id");
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\5\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\5\2\t\n\2\3\2\2\3\2\2\2\n\2\b\3\2\2\2\4\5\7\4\2\2\5\t\b\2"+
		"\1\2\6\7\7\5\2\2\7\t\b\2\1\2\b\4\3\2\2\2\b\6\3\2\2\2\t\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}