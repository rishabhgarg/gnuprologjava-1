// Generated from Term.g4 by ANTLR 4.1

package gnu.prolog.io.parser.gen;
import gnu.prolog.io.parser.*;
import gnu.prolog.term.*;
import gnu.prolog.io.*;
import gnu.prolog.vm.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TermParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SPECIAL_TOKEN=2, OPEN_LIST_TOKEN=3, CLOSE_LIST_TOKEN=4, HEAD_TAIL_SEPARATOR_TOKEN=5, 
		OPEN_TOKEN=6, CLOSE_TOKEN=7, OPEN_CURLY_TOKEN=8, CLOSE_CURLY_TOKEN=9, 
		COMMA_TOKEN=10, END_TOKEN=11, END_CHAR=12, OPEN_LIST_CHAR=13, CLOSE_LIST_CHAR=14, 
		HEAD_TAIL_SEPARATOR_CHAR=15, NAME_TOKEN=16, VARIABLE_TOKEN=17, INTEGER_TOKEN=18, 
		ANONYMOUS_VARIABLE=19, NAMED_VARIABLE=20, VARIABLE_INDICATOR_CHAR=21, 
		IDENTIFIER_TOKEN=22, ALPHA_NUMERIC_CHAR=23, ALPHA_CHAR=24, LETTER_CHAR=25, 
		GRAPHIC_TOKEN=26, GRAPHIC_TOKEN_CHAR=27, QUOTED_TOKEN=28, SINGLE_QUOTED_ITEM=29, 
		CONTINUATION_ESCAPE_SEQUENCE=30, SEMICOLON_TOKEN=31, CUT_TOKEN=32, GRAPHIC_CHAR=33, 
		CUT_CHAR=34, OPEN_CHAR=35, CLOSE_CHAR=36, COMMA_CHAR=37, SEMICOLON_CHAR=38, 
		OPEN_CURLY_CHAR=39, CLOSE_CURLY_CHAR=40, END_LINE_COMMENT_CHAR=41, CAPITAL_LETTER_CHAR=42, 
		SMALL_LETTER_CHAR=43, DECIMAL_DIGIT_CHAR=44, UNDERSCORE_CHAR=45, BACKSLASH_CHAR=46, 
		SINGLE_QUOTE_CHAR=47, DOUBLE_QUOTE_CHAR=48, BACK_QUOTE_CHAR=49, SINGLE_QUOTED_CHAR=50, 
		NON_QUOTE_CHAR=51, CHARACTER=52, DOUBLE_QUOTED_CHAR=53, BACK_QUOTED_CHAR=54, 
		META_ESCAPE_SEQUENCE=55, CONTROL_ESCAPE_SEQUENCE=56, SYMBOLIC_CONTROL_CHAR=57, 
		SYMBOLIC_ALERT_CHAR=58, SYMBOLIC_BACKSPACE_CHAR=59, SYMBOLIC_FORM_FEED_CHAR=60, 
		SYMBOLIC_NEW_LINE_CHAR=61, SYMBOLIC_HORIZONTAL_TAB_CHAR=62, SYMBOLIC_VERTICAL_TAB_CHAR=63, 
		SYMBOLIC_CARRIAGE_RETURN_CHAR=64, SYMBOLIC_HEXADECIMAL_CHAR=65, OCTAL_ESCAPE_SEQUENCE=66, 
		HEXADECIMAL_ESCAPE_SEQUENCE=67, INTEGER_CONSTANT=68, CHARACTER_CODE_CONSTANT=69, 
		BINARY_CONSTANT=70, OCTAL_CONSTANT=71, HEXADECIMAL_CONSTANT=72, FLOAT_NUMBER_TOKEN=73, 
		FRACTION=74, EXPONENT=75, CHAR_CODE_LIST_TOKEN=76, DOUBLE_QUOTED_ITEM=77, 
		BACK_QUOTED_STRING=78, BACK_QUOTED_ITEM=79, GRAPHIC_CHAR_PERIOD=80, BINARY_DIGIT_CHAR=81, 
		OCTAL_DIGIT_CHAR=82, HEXADECIMAL_DIGIT_CHAR=83, SOLO_CHAR=84, LAYOUT_CHAR=85, 
		SPACE_CHAR=86, NEW_LINE_CHAR=87, META_CHAR=88, LAYOUT_TEXT_SEQUENCE=89, 
		LAYOUT_TEXT=90, COMMENT=91, SINGLE_LINE_COMMENT=92, BRACKETED_COMMENT=93;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "SPECIAL_TOKEN", "OPEN_LIST_TOKEN", "CLOSE_LIST_TOKEN", 
		"HEAD_TAIL_SEPARATOR_TOKEN", "OPEN_TOKEN", "CLOSE_TOKEN", "OPEN_CURLY_TOKEN", 
		"CLOSE_CURLY_TOKEN", "COMMA_TOKEN", "END_TOKEN", "'.'", "'['", "']'", 
		"'|'", "NAME_TOKEN", "VARIABLE_TOKEN", "INTEGER_TOKEN", "ANONYMOUS_VARIABLE", 
		"NAMED_VARIABLE", "VARIABLE_INDICATOR_CHAR", "IDENTIFIER_TOKEN", "ALPHA_NUMERIC_CHAR", 
		"ALPHA_CHAR", "LETTER_CHAR", "GRAPHIC_TOKEN", "GRAPHIC_TOKEN_CHAR", "QUOTED_TOKEN", 
		"SINGLE_QUOTED_ITEM", "CONTINUATION_ESCAPE_SEQUENCE", "SEMICOLON_TOKEN", 
		"CUT_TOKEN", "GRAPHIC_CHAR", "'!'", "'('", "')'", "','", "';'", "'{'", 
		"'}'", "'%'", "CAPITAL_LETTER_CHAR", "SMALL_LETTER_CHAR", "DECIMAL_DIGIT_CHAR", 
		"'_'", "'\\'", "'''", "'\"'", "'`'", "SINGLE_QUOTED_CHAR", "NON_QUOTE_CHAR", 
		"CHARACTER", "DOUBLE_QUOTED_CHAR", "BACK_QUOTED_CHAR", "META_ESCAPE_SEQUENCE", 
		"CONTROL_ESCAPE_SEQUENCE", "SYMBOLIC_CONTROL_CHAR", "'a'", "'b'", "'f'", 
		"'n'", "'t'", "'v'", "'r'", "'x'", "OCTAL_ESCAPE_SEQUENCE", "HEXADECIMAL_ESCAPE_SEQUENCE", 
		"INTEGER_CONSTANT", "CHARACTER_CODE_CONSTANT", "BINARY_CONSTANT", "OCTAL_CONSTANT", 
		"HEXADECIMAL_CONSTANT", "FLOAT_NUMBER_TOKEN", "FRACTION", "EXPONENT", 
		"CHAR_CODE_LIST_TOKEN", "DOUBLE_QUOTED_ITEM", "BACK_QUOTED_STRING", "BACK_QUOTED_ITEM", 
		"GRAPHIC_CHAR_PERIOD", "BINARY_DIGIT_CHAR", "OCTAL_DIGIT_CHAR", "HEXADECIMAL_DIGIT_CHAR", 
		"SOLO_CHAR", "LAYOUT_CHAR", "SPACE_CHAR", "NEW_LINE_CHAR", "META_CHAR", 
		"LAYOUT_TEXT_SEQUENCE", "LAYOUT_TEXT", "COMMENT", "SINGLE_LINE_COMMENT", 
		"BRACKETED_COMMENT"
	};
	public static final int
		RULE_readTerm = 0, RULE_readTermEof = 1, RULE_term = 2, RULE_exp = 3, 
		RULE_op = 4, RULE_op2 = 5, RULE_operatorTerm = 6, RULE_simpleTerm = 7, 
		RULE_list_term = 8, RULE_curly_term = 9, RULE_compound = 10, RULE_name = 11, 
		RULE_variable = 12, RULE_integer = 13, RULE_float_number = 14, RULE_char_code_list = 15, 
		RULE_open = 16, RULE_open_ct = 17, RULE_close = 18, RULE_open_list = 19, 
		RULE_close_list = 20, RULE_open_curly = 21, RULE_close_curly = 22, RULE_ht_sep = 23, 
		RULE_comma = 24, RULE_end = 25;
	public static final String[] ruleNames = {
		"readTerm", "readTermEof", "term", "exp", "op", "op2", "operatorTerm", 
		"simpleTerm", "list_term", "curly_term", "compound", "name", "variable", 
		"integer", "float_number", "char_code_list", "open", "open_ct", "close", 
		"open_list", "close_list", "open_curly", "close_curly", "ht_sep", "comma", 
		"end"
	};

	@Override
	public String getGrammarFileName() { return "Term.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	//For Testing
	public void printer()
	{   
	    System.out.println(_input.LT(1).getText());
	    System.out.println(_input.LT(2).getText());
	    System.out.println(_input.LT(3).getText());
	    System.out.println(_input.LT(4).getText());
	    System.out.println(_input.LT(5).getText());
	    System.out.println(_input.LA(1));
	    System.out.println(_input.LA(2));
	    System.out.println(_input.LA(3));
	    System.out.println(_input.LA(4));
	    System.out.println(_input.LA(5));
	}
	 
	//Reader stream that acts as an interface between the project and the parser 
	ReaderCharStream stream;
	//Defining the environment the user specifies
	protected Environment environment;
	 
	public int getCurrentLine()
	    {
	        return stream.getEndLine();
	    }

	public int getCurrentColumn()
	    {
	        return stream.getEndColumn();
	    } 
	 
	public boolean isFunctor()
	    {
	        return _input.LA(1) == TermParser.NAME_TOKEN &&
	        _input.LA(2) == TermParser.OPEN_TOKEN;
	    }
	  
	boolean testOp(ReadOptions Options, int i)
	    {
	        Token tk = _input.LT(i);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isOperator(Options.operatorSet);
	    }

	boolean testNoOp (ReadOptions Options)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isNonOperator(Options.operatorSet);
	    }

	boolean testFX (ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return !isFunctor() && ntk.isFxOperator(Options.operatorSet,priority);
	    }

	boolean testFY (ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return !isFunctor() && ntk.isFyOperator(Options.operatorSet,priority);
	    }

	boolean testXFX(ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isXfxOperator(Options.operatorSet,priority);
	    }

	boolean testXFY(ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        int tk_name = _input.LA(1);
	        return priority >= Options.operatorSet.getCommaLevel() && tk_name == COMMA_TOKEN  ||
	               ntk.isXfyOperator(Options.operatorSet,priority);
	    }

	boolean testYFX(ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isYfxOperator(Options.operatorSet,priority);
	    }

	boolean testXF (ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isXfOperator(Options.operatorSet,priority);
	    }

	boolean testYF (ReadOptions Options, int priority)
	    {
	        Token tk = _input.LT(1);
	        NameToken ntk = new NameToken(tk);
	        return ntk.isYfOperator(Options.operatorSet,priority);
	    }
	  
	public boolean isExpSeparator(int i)
	    {
	        Token tk = _input.LT(i);
	        switch (_input.LA(i))
	        {
	            case COMMA_TOKEN              :
	            case CLOSE_TOKEN              :
	            case CLOSE_CURLY_TOKEN        :
	            case CLOSE_LIST_TOKEN         :
	            case END_TOKEN                :
	            case EOF                      :
	            case HEAD_TAIL_SEPARATOR_TOKEN:
	                return true;
	            default:
	                return false;
	        }
	    }
	  
	boolean is1201Separator(int i)
	    {
	        switch (_input.LA(i))
	        {
	            case CLOSE_TOKEN              :
	            case CLOSE_CURLY_TOKEN        :
	            case END_TOKEN                :
	            case EOF                      :
	                return true;
	            default:
	                return false;
	        }
	    }

	Term createTerm(CompoundTermTag op, Term t)
	{
	    if (op.arity != 1) 
	    {
	        throw new IllegalArgumentException("Arity of term tag must be 1");
	    }
	    return new CompoundTerm(op, new Term[]{t});
	} 
	    
	Term createTerm(CompoundTermTag op, Term t1, Term t2)
	    {
	    if (op.arity != 2)
	    {
	        throw new IllegalArgumentException("Arity of term tag must be 2");
	    }
	    return new CompoundTerm(op, new Term[]{t1,t2});
	    }
	    
	void skipToDot()
	{
	    while ((_input.LA(1) != END_TOKEN) && (_input.LA(1) != EOF)) 
	    {
	        consume();
	    }
	} 

	void skipToEof()
	{
	    while (_input.LA(1) != EOF) 
	    {
	        consume();
	    }
	}

	public TermParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ReadTermContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term t;
		public TermContext a;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TermParser.EOF, 0); }
		public TerminalNode END_TOKEN() { return getToken(TermParser.END_TOKEN, 0); }
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ReadTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReadTermContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_readTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitReadTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadTermContext readTerm(ReadOptions Options) throws RecognitionException {
		ReadTermContext _localctx = new ReadTermContext(_ctx, getState(), Options);
		enterRule(_localctx, 0, RULE_readTerm);

		    ((ReadTermContext)_localctx).t =  null;

		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(EOF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(END_TOKEN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); ((ReadTermContext)_localctx).a = term(_localctx.Options, _localctx.Options.operatorSet.getMaxLevel());
				((ReadTermContext)_localctx).t =  ((ReadTermContext)_localctx).a.t;
				setState(56); end();
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

	public static class ReadTermEofContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term t;
		public TermContext a;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TermParser.EOF, 0); }
		public ReadTermEofContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReadTermEofContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_readTermEof; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitReadTermEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadTermEofContext readTermEof(ReadOptions Options) throws RecognitionException {
		ReadTermEofContext _localctx = new ReadTermEofContext(_ctx, getState(), Options);
		enterRule(_localctx, 2, RULE_readTermEof);

		    ((ReadTermEofContext)_localctx).t =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); ((ReadTermEofContext)_localctx).a = term(_localctx.Options, _localctx.Options.operatorSet.getMaxLevel());
			((ReadTermEofContext)_localctx).t =  ((ReadTermEofContext)_localctx).a.t;
			setState(62); match(EOF);
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

	public static class TermContext extends ParserRuleContext {
		public ReadOptions Options;
		public int priority;
		public Term t;
		public boolean pIs1201;
		public boolean pIsZero;
		public SimpleTermContext a;
		public NameContext b;
		public SimpleTermContext simpleTerm() {
			return getRuleContext(SimpleTermContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, ReadOptions Options, int priority) {
			super(parent, invokingState);
			this.Options = Options;
			this.priority = priority;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term(ReadOptions Options,int priority) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), Options, priority);
		enterRule(_localctx, 4, RULE_term);
		   int p = 0;
		    p = _localctx.Options.operatorSet.getNextLevel(_localctx.priority);
		    ((TermContext)_localctx).t =  null;
		    ((TermContext)_localctx).pIs1201 =  false;
		    ((TermContext)_localctx).pIsZero =  false;
		    if (p == 0)
		    {
		        ((TermContext)_localctx).pIsZero =  true;
		    }
		    if (_localctx.priority == 1201)
		    {
		        ((TermContext)_localctx).pIs1201 =  true;
		    }

		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				if (!(_localctx.pIsZero)) throw new FailedPredicateException(this, "$pIsZero");
				setState(65); ((TermContext)_localctx).a = simpleTerm(_localctx.Options);

				            ((TermContext)_localctx).t =  ((TermContext)_localctx).a.t;
				          
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				if (!(_localctx.pIs1201)) throw new FailedPredicateException(this, "$pIs1201");
				setState(69);
				if (!(is1201Separator(2))) throw new FailedPredicateException(this, "is1201Separator(2)");
				setState(70); ((TermContext)_localctx).b = name();

				            ((TermContext)_localctx).t =  ((TermContext)_localctx).b.alpha;
				          
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

	public static class ExpContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term t;
		public NameContext a;
		public TermContext b;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp(ReadOptions Options) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), Options);
		enterRule(_localctx, 6, RULE_exp);

		    ((ExpContext)_localctx).t =  null;

		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				if (!(testOp(_localctx.Options, 1))) throw new FailedPredicateException(this, "testOp($Options, 1)");
				setState(76);
				if (!(isExpSeparator(2))) throw new FailedPredicateException(this, "isExpSeparator(2)");
				setState(77); ((ExpContext)_localctx).a = name();
				((ExpContext)_localctx).t =  ((ExpContext)_localctx).a.alpha;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); ((ExpContext)_localctx).b = term(_localctx.Options, _localctx.Options.operatorSet.getCommaLevel()-1);
				((ExpContext)_localctx).t =  ((ExpContext)_localctx).b.t;
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

	public static class OpContext extends ParserRuleContext {
		public ReadOptions Options;
		public int priority;
		public CompoundTermTag tag;
		public Token NAME_TOKEN;
		public TerminalNode NAME_TOKEN() { return getToken(TermParser.NAME_TOKEN, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpContext(ParserRuleContext parent, int invokingState, ReadOptions Options, int priority) {
			super(parent, invokingState);
			this.Options = Options;
			this.priority = priority;
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op(ReadOptions Options,int priority) throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState(), Options, priority);
		enterRule(_localctx, 8, RULE_op);

		    ((OpContext)_localctx).tag =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); ((OpContext)_localctx).NAME_TOKEN = match(NAME_TOKEN);

			            NameToken tk = (NameToken)((OpContext)_localctx).NAME_TOKEN; 
			            ((OpContext)_localctx).tag =  tk.fxOp.tag;
			        
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

	public static class Op2Context extends ParserRuleContext {
		public ReadOptions Options;
		public int priority;
		public CompoundTermTag tag;
		public Token NAME_TOKEN;
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TerminalNode NAME_TOKEN() { return getToken(TermParser.NAME_TOKEN, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Op2Context(ParserRuleContext parent, int invokingState, ReadOptions Options, int priority) {
			super(parent, invokingState);
			this.Options = Options;
			this.priority = priority;
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2(ReadOptions Options,int priority) throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState(), Options, priority);
		enterRule(_localctx, 10, RULE_op2);

		    ((Op2Context)_localctx).tag =  null;

		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				if (!(_localctx.priority >= 1000)) throw new FailedPredicateException(this, "$priority >= 1000");
				setState(89);
				if (!(getCurrentToken().getType() == COMMA_TOKEN)) throw new FailedPredicateException(this, "getCurrentToken().getType() == COMMA_TOKEN");
				setState(90); comma();

				            ((Op2Context)_localctx).tag =  TermConstants.conjunctionTag;
				        
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); ((Op2Context)_localctx).NAME_TOKEN = match(NAME_TOKEN);

				            NameToken tk = (NameToken)((Op2Context)_localctx).NAME_TOKEN; 
				            ((Op2Context)_localctx).tag =  tk.xfOp.tag;
				        
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

	public static class OperatorTermContext extends ParserRuleContext {
		public ReadOptions Options;
		public int priority;
		public Term t;
		public int token_name;
		public Token token;
		public OpContext a;
		public TermContext b;
		public OpContext d;
		public TermContext e;
		public TermContext g;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OperatorTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OperatorTermContext(ParserRuleContext parent, int invokingState, ReadOptions Options, int priority) {
			super(parent, invokingState);
			this.Options = Options;
			this.priority = priority;
		}
		@Override public int getRuleIndex() { return RULE_operatorTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOperatorTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorTermContext operatorTerm(ReadOptions Options,int priority) throws RecognitionException {
		OperatorTermContext _localctx = new OperatorTermContext(_ctx, getState(), Options, priority);
		enterRule(_localctx, 12, RULE_operatorTerm);

		    ((OperatorTermContext)_localctx).token_name =  0;
		    ((OperatorTermContext)_localctx).token =  null;
		    int p = _localctx.priority;
		    Term t2 = null;
		    ((OperatorTermContext)_localctx).t =  null;
		    CompoundTermTag f = null;

		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				if (!(testFY(_localctx.Options, _localctx.priority))) throw new FailedPredicateException(this, "testFY($Options, $priority)");
				setState(98); ((OperatorTermContext)_localctx).a = op(_localctx.Options, p);
				f = ((OperatorTermContext)_localctx).a.tag;
				setState(100); ((OperatorTermContext)_localctx).b = term(_localctx.Options, p);
				((OperatorTermContext)_localctx).t =  ((OperatorTermContext)_localctx).b.t; ((OperatorTermContext)_localctx).t =  createTerm(f, _localctx.t);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				if (!(testFX(_localctx.Options, _localctx.priority))) throw new FailedPredicateException(this, "testFX($Options, $priority)");
				setState(104); ((OperatorTermContext)_localctx).d = op(_localctx.Options, p);
				f = ((OperatorTermContext)_localctx).d.tag;
				setState(106); ((OperatorTermContext)_localctx).e = term(_localctx.Options, p-1);
				((OperatorTermContext)_localctx).t =  ((OperatorTermContext)_localctx).e.t; ((OperatorTermContext)_localctx).t =  createTerm(f, _localctx.t);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); ((OperatorTermContext)_localctx).g = term(_localctx.Options, p-1);
				((OperatorTermContext)_localctx).t =  ((OperatorTermContext)_localctx).g.t;
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

	public static class SimpleTermContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term t;
		public CompoundContext a;
		public NameContext b;
		public VariableContext c;
		public IntegerContext d;
		public Float_numberContext e;
		public List_termContext f;
		public Curly_termContext g;
		public Char_code_listContext h;
		public TermContext i;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Float_numberContext float_number() {
			return getRuleContext(Float_numberContext.class,0);
		}
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public Char_code_listContext char_code_list() {
			return getRuleContext(Char_code_listContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List_termContext list_term() {
			return getRuleContext(List_termContext.class,0);
		}
		public Curly_termContext curly_term() {
			return getRuleContext(Curly_termContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SimpleTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SimpleTermContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_simpleTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitSimpleTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTermContext simpleTerm(ReadOptions Options) throws RecognitionException {
		SimpleTermContext _localctx = new SimpleTermContext(_ctx, getState(), Options);
		enterRule(_localctx, 14, RULE_simpleTerm);

		    ((SimpleTermContext)_localctx).t =  null;

		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				if (!(_input.LA(2) == OPEN_TOKEN)) throw new FailedPredicateException(this, "_input.LA(2) == OPEN_TOKEN");
				setState(115); ((SimpleTermContext)_localctx).a = compound(_localctx.Options);
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).a.rc; System.out.println("compound");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				if (!(testNoOp(_localctx.Options))) throw new FailedPredicateException(this, "testNoOp($Options)");
				setState(119); ((SimpleTermContext)_localctx).b = name();
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).b.alpha; System.out.println("name");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); ((SimpleTermContext)_localctx).c = variable(_localctx.Options);
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).c.var; System.out.println("var");
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); ((SimpleTermContext)_localctx).d = integer();
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).d.int_term; System.out.println("int");
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); ((SimpleTermContext)_localctx).e = float_number();
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).e.float_term; System.out.println("float");
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131); ((SimpleTermContext)_localctx).f = list_term(_localctx.Options);
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).f.rc; System.out.println("list");
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134); ((SimpleTermContext)_localctx).g = curly_term(_localctx.Options);
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).g.curled_term; System.out.println("curly");
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137); ((SimpleTermContext)_localctx).h = char_code_list();
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).h.char_term; System.out.println("charcode");
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140); open();
				setState(141); ((SimpleTermContext)_localctx).i = term(_localctx.Options, 1201);
				((SimpleTermContext)_localctx).t =  ((SimpleTermContext)_localctx).i.t;
				setState(143); close();
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

	public static class List_termContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term rc;
		public ExpContext a;
		public ExpContext b;
		public ExpContext c;
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public Open_listContext open_list() {
			return getRuleContext(Open_listContext.class,0);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Close_listContext close_list() {
			return getRuleContext(Close_listContext.class,0);
		}
		public Ht_sepContext ht_sep() {
			return getRuleContext(Ht_sepContext.class,0);
		}
		public List_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public List_termContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_list_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitList_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_termContext list_term(ReadOptions Options) throws RecognitionException {
		List_termContext _localctx = new List_termContext(_ctx, getState(), Options);
		enterRule(_localctx, 16, RULE_list_term);

		    ((List_termContext)_localctx).rc =  null;
		    Term t1 = null;
		    Term t2 = null;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); open_list();
			{
			setState(148); ((List_termContext)_localctx).a = exp(_localctx.Options);

			                t1 = ((List_termContext)_localctx).a.t;
			                t1 = createTerm(TermConstants.listTag,t1,null);
			                ((List_termContext)_localctx).rc =  t1;
			            
			System.out.print("[alpha");
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_TOKEN) {
				{
				{
				setState(151); comma();
				setState(152); ((List_termContext)_localctx).b = exp(_localctx.Options);

				                    t2 = ((List_termContext)_localctx).b.t;
				                    t2 = createTerm(TermConstants.listTag,t2,null);
				                    ((CompoundTerm)t1).args[1] = t2;
				                    t1 = t2;
				                
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); ht_sep();
			System.out.print("|");
			setState(162); ((List_termContext)_localctx).c = exp(_localctx.Options);
			System.out.print("beta");

			               ((CompoundTerm)t1).args[1] = t2;
			            
			}
			setState(166); close_list();
			System.out.print("]");

			            if (_localctx.rc == null)
			            {
			                ((List_termContext)_localctx).rc =  TermConstants.emptyListAtom;
			            }
			            if (((CompoundTerm)t1).args[1] == null)
			            {
			                ((CompoundTerm)t1).args[1] = TermConstants.emptyListAtom;
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

	public static class Curly_termContext extends ParserRuleContext {
		public ReadOptions Options;
		public Term curled_term;
		public TermContext a;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Close_curlyContext close_curly() {
			return getRuleContext(Close_curlyContext.class,0);
		}
		public Open_curlyContext open_curly() {
			return getRuleContext(Open_curlyContext.class,0);
		}
		public Curly_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Curly_termContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_curly_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitCurly_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Curly_termContext curly_term(ReadOptions Options) throws RecognitionException {
		Curly_termContext _localctx = new Curly_termContext(_ctx, getState(), Options);
		enterRule(_localctx, 18, RULE_curly_term);

		    Term t = null; 
		    ((Curly_termContext)_localctx).curled_term =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); open_curly();
			{
			}
			setState(172); ((Curly_termContext)_localctx).a = term(_localctx.Options, 1201);
			setState(173); close_curly();
			{
			}

			            t = ((Curly_termContext)_localctx).a.t;
			            if (t == null)
			            {
			                ((Curly_termContext)_localctx).curled_term =  TermConstants.emptyCurlyAtom;
			            }
			            else
			            {
			                ((Curly_termContext)_localctx).curled_term =  createTerm(CompoundTermTag.curly1, t);
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

	public static class CompoundContext extends ParserRuleContext {
		public ReadOptions Options;
		public CompoundTerm rc;
		public NameContext a;
		public ExpContext b;
		public ExpContext x;
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public Open_ctContext open_ct() {
			return getRuleContext(Open_ctContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CompoundContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompoundContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound(ReadOptions Options) throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState(), Options);
		enterRule(_localctx, 20, RULE_compound);

		    AtomTerm functor = null;
		    ArrayList<Term> args = new ArrayList<Term>();
		    Term e1 = null;
		    ((CompoundContext)_localctx).rc =  null;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((CompoundContext)_localctx).a = name();
			functor = ((CompoundContext)_localctx).a.alpha;
			setState(179); open_ct();
			setState(180); ((CompoundContext)_localctx).b = exp(_localctx.Options);
			e1 = ((CompoundContext)_localctx).b.t; args.add(e1);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_TOKEN) {
				{
				{
				setState(182); comma();
				setState(183); ((CompoundContext)_localctx).x = exp(_localctx.Options);
				e1 = ((CompoundContext)_localctx).x.t; args.add(e1);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191); close();

			                int n = args.size();
			                ((CompoundContext)_localctx).rc =  new CompoundTerm(functor,n);
			                for (int i=0; i<n; i++)
			                {
			                    _localctx.rc.args[i] = args.get(i);
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

	public static class NameContext extends ParserRuleContext {
		public AtomTerm alpha;
		public Token NAME_TOKEN;
		public TerminalNode NAME_TOKEN() { return getToken(TermParser.NAME_TOKEN, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);

		    ((NameContext)_localctx).alpha =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); ((NameContext)_localctx).NAME_TOKEN = match(NAME_TOKEN);
			((NameContext)_localctx).alpha =  AtomTerm.get((((NameContext)_localctx).NAME_TOKEN!=null?((NameContext)_localctx).NAME_TOKEN.getText():null));
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

	public static class VariableContext extends ParserRuleContext {
		public ReadOptions Options;
		public VariableTerm var;
		public Token VARIABLE_TOKEN;
		public TerminalNode VARIABLE_TOKEN() { return getToken(TermParser.VARIABLE_TOKEN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableContext(ParserRuleContext parent, int invokingState, ReadOptions Options) {
			super(parent, invokingState);
			this.Options = Options;
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable(ReadOptions Options) throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState(), Options);
		enterRule(_localctx, 24, RULE_variable);

		    ((VariableContext)_localctx).var =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); ((VariableContext)_localctx).VARIABLE_TOKEN = match(VARIABLE_TOKEN);

			            ((VariableContext)_localctx).var =  _localctx.Options.variableNames.get((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null));
			            if (_localctx.var == null)
			            {
			            ((VariableContext)_localctx).var =  new VariableTerm((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null));
			            if (!"_".equals((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null)))
			            {
			                _localctx.Options.variableNames.put((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null), _localctx.var);
			                _localctx.Options.singletons.put((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null), _localctx.var);
			            }
			                _localctx.Options.variables.add(_localctx.var);
			            }
			            else
			            {
			                _localctx.Options.singletons.remove((((VariableContext)_localctx).VARIABLE_TOKEN!=null?((VariableContext)_localctx).VARIABLE_TOKEN.getText():null));
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

	public static class IntegerContext extends ParserRuleContext {
		public IntegerTerm int_term;
		public Token INTEGER_TOKEN;
		public TerminalNode INTEGER_TOKEN() { return getToken(TermParser.INTEGER_TOKEN, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integer);

		    ((IntegerContext)_localctx).int_term =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); ((IntegerContext)_localctx).INTEGER_TOKEN = match(INTEGER_TOKEN);
			((IntegerContext)_localctx).int_term =  IntegerTerm.get((((IntegerContext)_localctx).INTEGER_TOKEN!=null?((IntegerContext)_localctx).INTEGER_TOKEN.getText():null));
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

	public static class Float_numberContext extends ParserRuleContext {
		public FloatTerm float_term;
		public Token FLOAT_NUMBER_TOKEN;
		public TerminalNode FLOAT_NUMBER_TOKEN() { return getToken(TermParser.FLOAT_NUMBER_TOKEN, 0); }
		public Float_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitFloat_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_numberContext float_number() throws RecognitionException {
		Float_numberContext _localctx = new Float_numberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_float_number);

		    ((Float_numberContext)_localctx).float_term =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); ((Float_numberContext)_localctx).FLOAT_NUMBER_TOKEN = match(FLOAT_NUMBER_TOKEN);
			((Float_numberContext)_localctx).float_term =  new FloatTerm((((Float_numberContext)_localctx).FLOAT_NUMBER_TOKEN!=null?((Float_numberContext)_localctx).FLOAT_NUMBER_TOKEN.getText():null));
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

	public static class Char_code_listContext extends ParserRuleContext {
		public Term char_term;
		public Token CHAR_CODE_LIST_TOKEN;
		public TerminalNode CHAR_CODE_LIST_TOKEN() { return getToken(TermParser.CHAR_CODE_LIST_TOKEN, 0); }
		public Char_code_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_code_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitChar_code_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_code_listContext char_code_list() throws RecognitionException {
		Char_code_listContext _localctx = new Char_code_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_char_code_list);

		    ((Char_code_listContext)_localctx).char_term =  null;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); ((Char_code_listContext)_localctx).CHAR_CODE_LIST_TOKEN = match(CHAR_CODE_LIST_TOKEN);

			            String val = TermParserUtils.convertQuotedString((((Char_code_listContext)_localctx).CHAR_CODE_LIST_TOKEN!=null?((Char_code_listContext)_localctx).CHAR_CODE_LIST_TOKEN.getText():null),'\"');
			            // Get the Atom form
			            AtomTerm atomValue = AtomTerm.get(val);
			            int i,n = val.length();
			            //get the codes form and chars form with one loop
			            Term codesValue = TermConstants.emptyListAtom;
			            char[] valChars = val.toCharArray();
			            AtomTerm[] valAtoms = new AtomTerm[valChars.length];
			            for (i=n-1; i>=0; --i)
			            {
			                codesValue = CompoundTerm.getList(IntegerTerm.get(val.charAt(i)), codesValue);
			                valAtoms[i] = AtomTerm.get(valChars[i]);
			            }
			            Term charsValue = CompoundTerm.getList(valAtoms);
			            ((Char_code_listContext)_localctx).char_term =  new DoubleQuotesTerm(environment, codesValue, charsValue, atomValue);
			        
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

	public static class OpenContext extends ParserRuleContext {
		public TerminalNode OPEN_TOKEN() { return getToken(TermParser.OPEN_TOKEN, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(OPEN_TOKEN);
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

	public static class Open_ctContext extends ParserRuleContext {
		public TerminalNode OPEN_TOKEN() { return getToken(TermParser.OPEN_TOKEN, 0); }
		public Open_ctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_ct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOpen_ct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_ctContext open_ct() throws RecognitionException {
		Open_ctContext _localctx = new Open_ctContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_open_ct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(OPEN_TOKEN);
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

	public static class CloseContext extends ParserRuleContext {
		public TerminalNode CLOSE_TOKEN() { return getToken(TermParser.CLOSE_TOKEN, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(CLOSE_TOKEN);
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

	public static class Open_listContext extends ParserRuleContext {
		public TerminalNode OPEN_LIST_TOKEN() { return getToken(TermParser.OPEN_LIST_TOKEN, 0); }
		public Open_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOpen_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_listContext open_list() throws RecognitionException {
		Open_listContext _localctx = new Open_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_open_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(OPEN_LIST_TOKEN);
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

	public static class Close_listContext extends ParserRuleContext {
		public TerminalNode CLOSE_LIST_TOKEN() { return getToken(TermParser.CLOSE_LIST_TOKEN, 0); }
		public Close_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitClose_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_listContext close_list() throws RecognitionException {
		Close_listContext _localctx = new Close_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_close_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(CLOSE_LIST_TOKEN);
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

	public static class Open_curlyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_TOKEN() { return getToken(TermParser.OPEN_CURLY_TOKEN, 0); }
		public Open_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_curly; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitOpen_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_curlyContext open_curly() throws RecognitionException {
		Open_curlyContext _localctx = new Open_curlyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_open_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(OPEN_CURLY_TOKEN);
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

	public static class Close_curlyContext extends ParserRuleContext {
		public TerminalNode CLOSE_CURLY_TOKEN() { return getToken(TermParser.CLOSE_CURLY_TOKEN, 0); }
		public Close_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_curly; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitClose_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_curlyContext close_curly() throws RecognitionException {
		Close_curlyContext _localctx = new Close_curlyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_close_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(CLOSE_CURLY_TOKEN);
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

	public static class Ht_sepContext extends ParserRuleContext {
		public TerminalNode HEAD_TAIL_SEPARATOR_TOKEN() { return getToken(TermParser.HEAD_TAIL_SEPARATOR_TOKEN, 0); }
		public Ht_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ht_sep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitHt_sep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ht_sepContext ht_sep() throws RecognitionException {
		Ht_sepContext _localctx = new Ht_sepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ht_sep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(HEAD_TAIL_SEPARATOR_TOKEN);
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA_TOKEN() { return getToken(TermParser.COMMA_TOKEN, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(COMMA_TOKEN);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END_TOKEN() { return getToken(TermParser.END_TOKEN, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermVisitor ) return ((TermVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(END_TOKEN);
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
		case 2: return term_sempred((TermContext)_localctx, predIndex);

		case 3: return exp_sempred((ExpContext)_localctx, predIndex);

		case 5: return op2_sempred((Op2Context)_localctx, predIndex);

		case 6: return operatorTerm_sempred((OperatorTermContext)_localctx, predIndex);

		case 7: return simpleTerm_sempred((SimpleTermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op2_sempred(Op2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return _localctx.priority >= 1000;

		case 6: return getCurrentToken().getType() == COMMA_TOKEN;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return testOp(_localctx.Options, 1);

		case 4: return isExpSeparator(2);
		}
		return true;
	}
	private boolean operatorTerm_sempred(OperatorTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return testFY(_localctx.Options, _localctx.priority);

		case 8: return testFX(_localctx.Options, _localctx.priority);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return _localctx.pIsZero;

		case 1: return _localctx.pIs1201;

		case 2: return is1201Separator(2);
		}
		return true;
	}
	private boolean simpleTerm_sempred(SimpleTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return _input.LA(2) == OPEN_TOKEN;

		case 10: return testNoOp(_localctx.Options);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3_\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u00de\2<\3\2\2\2\4>\3\2\2\2\6"+
		"K\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fa\3\2\2\2\16r\3\2\2\2\20\u0093\3\2\2"+
		"\2\22\u0095\3\2\2\2\24\u00ac\3\2\2\2\26\u00b3\3\2\2\2\30\u00c4\3\2\2\2"+
		"\32\u00c7\3\2\2\2\34\u00ca\3\2\2\2\36\u00cd\3\2\2\2 \u00d0\3\2\2\2\"\u00d3"+
		"\3\2\2\2$\u00d5\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3\2\2\2*\u00db\3\2\2\2,"+
		"\u00dd\3\2\2\2.\u00df\3\2\2\2\60\u00e1\3\2\2\2\62\u00e3\3\2\2\2\64\u00e5"+
		"\3\2\2\2\66=\7\2\2\3\67=\7\r\2\289\5\6\4\29:\b\2\1\2:;\5\64\33\2;=\3\2"+
		"\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2=\3\3\2\2\2>?\5\6\4\2?@\b\3\1\2"+
		"@A\7\2\2\3A\5\3\2\2\2BC\6\4\2\3CD\5\20\t\2DE\b\4\1\2EL\3\2\2\2FG\6\4\3"+
		"\3GH\6\4\4\2HI\5\30\r\2IJ\b\4\1\2JL\3\2\2\2KB\3\2\2\2KF\3\2\2\2L\7\3\2"+
		"\2\2MN\6\5\5\3NO\6\5\6\2OP\5\30\r\2PQ\b\5\1\2QV\3\2\2\2RS\5\6\4\2ST\b"+
		"\5\1\2TV\3\2\2\2UM\3\2\2\2UR\3\2\2\2V\t\3\2\2\2WX\7\22\2\2XY\b\6\1\2Y"+
		"\13\3\2\2\2Z[\6\7\7\3[\\\6\7\b\2\\]\5\62\32\2]^\b\7\1\2^b\3\2\2\2_`\7"+
		"\22\2\2`b\b\7\1\2aZ\3\2\2\2a_\3\2\2\2b\r\3\2\2\2cd\6\b\t\3de\5\n\6\2e"+
		"f\b\b\1\2fg\5\6\4\2gh\b\b\1\2hs\3\2\2\2ij\6\b\n\3jk\5\n\6\2kl\b\b\1\2"+
		"lm\5\6\4\2mn\b\b\1\2ns\3\2\2\2op\5\6\4\2pq\b\b\1\2qs\3\2\2\2rc\3\2\2\2"+
		"ri\3\2\2\2ro\3\2\2\2s\17\3\2\2\2tu\6\t\13\2uv\5\26\f\2vw\b\t\1\2w\u0094"+
		"\3\2\2\2xy\6\t\f\3yz\5\30\r\2z{\b\t\1\2{\u0094\3\2\2\2|}\5\32\16\2}~\b"+
		"\t\1\2~\u0094\3\2\2\2\177\u0080\5\34\17\2\u0080\u0081\b\t\1\2\u0081\u0094"+
		"\3\2\2\2\u0082\u0083\5\36\20\2\u0083\u0084\b\t\1\2\u0084\u0094\3\2\2\2"+
		"\u0085\u0086\5\22\n\2\u0086\u0087\b\t\1\2\u0087\u0094\3\2\2\2\u0088\u0089"+
		"\5\24\13\2\u0089\u008a\b\t\1\2\u008a\u0094\3\2\2\2\u008b\u008c\5 \21\2"+
		"\u008c\u008d\b\t\1\2\u008d\u0094\3\2\2\2\u008e\u008f\5\"\22\2\u008f\u0090"+
		"\5\6\4\2\u0090\u0091\b\t\1\2\u0091\u0092\5&\24\2\u0092\u0094\3\2\2\2\u0093"+
		"t\3\2\2\2\u0093x\3\2\2\2\u0093|\3\2\2\2\u0093\177\3\2\2\2\u0093\u0082"+
		"\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u008b\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096\5(\25\2\u0096\u0097\5\b\5"+
		"\2\u0097\u0098\b\n\1\2\u0098\u009f\b\n\1\2\u0099\u009a\5\62\32\2\u009a"+
		"\u009b\5\b\5\2\u009b\u009c\b\n\1\2\u009c\u009e\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\60\31\2\u00a3\u00a4\b"+
		"\n\1\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\b\n\1\2\u00a6\u00a7\b\n\1\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\5*\26\2\u00a9\u00aa\b\n\1\2\u00aa\u00ab\b\n"+
		"\1\2\u00ab\23\3\2\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\5\6\4\2\u00af\u00b0\5.\30\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\13\1\2"+
		"\u00b2\25\3\2\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\b\f\1\2\u00b5\u00b6"+
		"\5$\23\2\u00b6\u00b7\5\b\5\2\u00b7\u00be\b\f\1\2\u00b8\u00b9\5\62\32\2"+
		"\u00b9\u00ba\5\b\5\2\u00ba\u00bb\b\f\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\b\f"+
		"\1\2\u00c3\27\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\b\r\1\2\u00c6\31"+
		"\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\b\16\1\2\u00c9\33\3\2\2\2\u00ca"+
		"\u00cb\7\24\2\2\u00cb\u00cc\b\17\1\2\u00cc\35\3\2\2\2\u00cd\u00ce\7K\2"+
		"\2\u00ce\u00cf\b\20\1\2\u00cf\37\3\2\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2"+
		"\b\21\1\2\u00d2!\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4#\3\2\2\2\u00d5\u00d6"+
		"\7\b\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\'\3\2\2\2\u00d9\u00da"+
		"\7\5\2\2\u00da)\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc+\3\2\2\2\u00dd\u00de"+
		"\7\n\2\2\u00de-\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0/\3\2\2\2\u00e1\u00e2"+
		"\7\7\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4\63\3\2\2\2\u00e5\u00e6"+
		"\7\r\2\2\u00e6\65\3\2\2\2\n<KUar\u0093\u009f\u00be";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}