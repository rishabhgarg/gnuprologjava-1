grammar Term;

@header
{
package gnu.prolog.io.parser.gen;
import gnu.prolog.io.parser.*;
import gnu.prolog.term.*;
import gnu.prolog.io.*;
import gnu.prolog.vm.*;
}

@parser::members
{
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
 
//NameToken file does not return any instances 
public boolean isFunctor()
    {
        return _input.LA(1) == TermParser.NAME_TOKEN &&
        _input.LA(2) == TermParser.OPEN_TOKEN;
    }
  
boolean testOp(ReadOptions Options, int i)
    {
        Token tk = _input.LT(i);
        return tk instanceof NameToken && ((NameToken)tk).isOperator(Options.operatorSet);
    }

boolean testNoOp (ReadOptions Options)
    {
        Token tk = _input.LT(1);
        return tk instanceof NameToken && ((NameToken)tk).isNonOperator(Options.operatorSet);
    }

boolean testFX (ReadOptions Options, int priority)
    {
        Token tk = _input.LT(1);
        return !isFunctor() && tk instanceof NameToken && ((NameToken)tk).isFxOperator(Options.operatorSet,priority);
    }
  
boolean testFY (ReadOptions Options, int priority)
    {
        Token tk = _input.LT(1);
        return !isFunctor() && tk instanceof NameToken && ((NameToken)tk).isFyOperator(Options.operatorSet,priority);
    }
  
boolean testXFX(ReadOptions Options, int priority)
    {
        Token tk = _input.LT(1);
        return tk instanceof NameToken && ((NameToken)tk).isXfxOperator(Options.operatorSet,priority);
    }
  
boolean testXFY(ReadOptions Options, int priority)
    {
        Token tk = _input.LT(1);
        int tk_name = _input.LA(1);
        return priority >= Options.operatorSet.getCommaLevel() && tk_name == COMMA_TOKEN  ||
               tk instanceof NameToken && ((NameToken)tk).isXfyOperator(Options.operatorSet,priority);
    }
  
boolean testYFX(ReadOptions Options, int priority)
  {
    Token tk = _input.LT(1);
    return tk instanceof NameToken && ((NameToken)tk).isYfxOperator(Options.operatorSet,priority);
  }
  
boolean testXF (ReadOptions Options, int priority)
  {
    Token tk = _input.LT(1);
    return tk instanceof NameToken && ((NameToken)tk).isXfOperator(Options.operatorSet,priority);
  }
  
  boolean testYF (ReadOptions Options, int priority)
  {
    Token tk = _input.LT(1);
    return tk instanceof NameToken && ((NameToken)tk).isYfOperator(Options.operatorSet,priority);
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
}

readTerm[ReadOptions Options] returns [Term t]
@init
{
    $t = null;
}     
        : EOF
        | END_TOKEN
        | a=term[$Options, $Options.operatorSet.getMaxLevel()] {$t = $a.t;}
          end         
        ;

readTermEof[ReadOptions Options] returns [Term t]
@init
{
    $t = null;
}
        : a=term[$Options, $Options.operatorSet.getMaxLevel()] {$t = $a.t;}
          EOF
    ;
  
//Operator Term not implemented so not included in the term alternatives
term[ReadOptions Options, int priority] returns [Term t]
locals [boolean pIs1201, boolean pIsZero]
@init
{   int p = 0;
    p = $Options.operatorSet.getNextLevel($priority);
    $t = null;
    $pIs1201 = false;
    $pIsZero = false;
    if (p == 0)
    {
        $pIsZero = true;
    }
    if ($priority == 1201)
    {
        $pIs1201 = true;
    }
}
        : {$pIsZero}? a=simpleTerm[$Options]
          {
            $t = $a.t;
          }
        | {$pIs1201}? {is1201Separator(2)}? b=name
          {
            $t = $b.alpha;
          }  
        ;

exp[ReadOptions Options] returns [Term t]
@init
{
    $t = null;
}
        : {testOp($Options, 1)}? {isExpSeparator(2)}? 
          a=name {$t = $a.alpha;}
        | b=term[$Options, $Options.operatorSet.getCommaLevel()-1]
          {$t = $b.t;}
        ;

op[ReadOptions Options, int priority] returns [CompoundTermTag tag]
@init
{
    $tag = null;
}
        : NAME_TOKEN 
        {
            NameToken tk = (NameToken)$NAME_TOKEN; 
            $tag = tk.fxOp.tag;
        }
        ;

op2[ReadOptions Options, int priority] returns [CompoundTermTag tag]
@init
{
    $tag = null;
}
        : {$priority >= 1000}? {getCurrentToken().getType() == COMMA_TOKEN}? 
          comma
        {
            $tag = TermConstants.conjunctionTag;
        }  
        | NAME_TOKEN  
        {
            NameToken tk = (NameToken)$NAME_TOKEN; 
            $tag = tk.xfOp.tag;
        }
        ;

//Operator Term will be implemented once ANTLR 4.1 is out as ANTLR 4.0 has a bug 
//that surfaces using multiple predicates
/*
operatorTerm[ReadOptions Options, int priority] returns [Term t]
locals [int token_name, Token token]
@init
{
    $token_name = 0;
    $token = null;
    int p = $priority;
    Term t2 = null;
    $t = null;
    CompoundTermTag f = null;
}     
        : {testFY($Options, $priority)}?
          a=op[$Options, p]         {f = $a.tag;}
          b=term[$Options, p]       {$t = $b.t; $t = createTerm(f, $t);}
        | {testFX($Options, $priority)}?
          d=op[$Options, p]         {f = $d.tag;}
          e=term[$Options, p-1]     {$t = $e.t; $t = createTerm(f, $t);}
        | g=term[$Options, p-1]     {$t = $g.t;}
        ;
          /*  (
            ({testXFX($Options, $priority)}?
            h=op2[$Options, p]      {f = $h.tag;}
            i=term[$Options, p-1]   {t2 = $i.t; $t = createTerm(f, $t, t2);}
            )
            |
            ({testXF($Options, $priority)}?
            j=op2[$Options, p]      {f = $j.tag; $t = createTerm(f, $t);}
            )
            |
            ({testXFY($Options, $priority)}?
            k=op2[$Options, p]      {f = $k.tag;}
            l=term[$Options, p]     {t2 = $l.t; $t = createTerm(f, $t, t2);}
            ));/*
            |
            (
            {$token_name = _input.LA(1); $token = _input.LT(1);}
            {($token_name == INTEGER_TOKEN || $token_name == FLOAT_NUMBER_TOKEN)}?
            {$token.getText().charAt(0) == '-'}?
                (
                {$Options.operatorSet.lookupXf("-") == Operator.nonOperator}?
                )
                |
                (
                {$token_name == INTEGER_TOKEN}?
                INTEGER_TOKEN
                {$t = 
                createTerm(CompoundTermTag.minus2,$t,IntegerTerm.get(-(IntegerTerm.get($token.getText()).value)));
                }
                )
            )
            );/*
            
                |
                (
                {$token_name = _input.LA(1); $token = _input.LT(1);}
                {($token_name == INTEGER_TOKEN || $token_name == FLOAT_NUMBER_TOKEN)}?
                {$token.getText().charAt(0) == '-'}?
                FLOAT_NUMBER_TOKEN
                {$t = 
                createTerm(CompoundTermTag.minus2,$t,new FloatTerm(-(new FloatTerm($token.getText()).value)));
                }
                )
        ; */

simpleTerm[ReadOptions Options] returns [Term t]
@init
{
    $t = null;
}
        : {_input.LA(2) == OPEN_TOKEN}?
          a=compound[$Options] {$t = $a.rc; System.out.println("compound");}
        | {testNoOp($Options)}? 
          b=name               {$t = $b.alpha; System.out.println("name");} 
        | c=variable[$Options]  {$t = $c.var; System.out.println("var");}
        | d=integer             {$t = $d.int_term; System.out.println("int");} 
        | e=float_number        {$t = $e.float_term; System.out.println("float");}
        | f=list_term[$Options] {$t = $f.rc; System.out.println("list");}
        | g=curly_term[$Options]{$t = $g.curled_term; System.out.println("curly");}
        | h=char_code_list      {$t = $h.char_term; System.out.println("charcode");}
        | open
          i=term[$Options, 1201]{$t = $i.t;}
          close
        ;

//Looks like an error in the rule itself
list_term[ReadOptions Options] returns [Term rc]
@init
    {
    $rc = null;
    Term t1 = null;
    Term t2 = null;
    }
        : open_list 
        ( 
            a=exp[$Options] 
            {
                t1 = $a.t;
                t1 = createTerm(TermConstants.listTag,t1,null);
                $rc = t1;
            }
            {System.out.print("[alpha");}
            (
                comma
                b=exp[$Options]
                {
                    t2 = $b.t;
                    t2 = createTerm(TermConstants.listTag,t2,null);
                    ((CompoundTerm)t1).args[1] = t2;
                    t1 = t2;
                }
            )*
            ht_sep
            {System.out.print("|");}
            c=exp[$Options]
            {System.out.print("beta");}
            {
               ((CompoundTerm)t1).args[1] = t2;
            }
        )
        close_list
        {System.out.print("]");}
        {
            if ($rc == null)
            {
                $rc = TermConstants.emptyListAtom;
            }
            if (((CompoundTerm)t1).args[1] == null)
            {
                ((CompoundTerm)t1).args[1] = TermConstants.emptyListAtom;
            }
        }
        ;

curly_term[ReadOptions Options] returns [Term curled_term]
@init
{
    Term t = null; 
    $curled_term = null;
}
        : open_curly()
          a=term[$Options, 1201]
          close_curly()
        {
            t = $a.t;
            if (t == null)
            {
                $curled_term = TermConstants.emptyCurlyAtom;
            }
            else
            {
                $curled_term = createTerm(CompoundTermTag.curly1, t);
            }
        }
        ;

compound[ReadOptions Options] returns [CompoundTerm rc]    
@init 
{
    AtomTerm functor = null;
    ArrayList<Term> args = new ArrayList<Term>();
    Term e1 = null;
    $rc = null;
}
        : a=name {functor = $a.alpha;} 
          open_ct
          b=exp[$Options] {e1 = $b.t; args.add(e1);}
          (comma x=exp[$Options] {e1 = $x.t; args.add(e1);})*
          close
          {
                int n = args.size();
                $rc = new CompoundTerm(functor,n);
                for (int i=0; i<n; i++)
                {
                    $rc.args[i] = args.get(i);
                }
          }
        ;

name returns [AtomTerm alpha]
@init
{
    $alpha = null;
}    
	: NAME_TOKEN {$alpha = AtomTerm.get($NAME_TOKEN.text);}
	;

variable[ReadOptions Options] returns [VariableTerm var]
@init
{
    $var = null;
}
     
	: VARIABLE_TOKEN
        {
            $var = $Options.variableNames.get($VARIABLE_TOKEN.text);
            if ($var == null)
            {
            $var = new VariableTerm($VARIABLE_TOKEN.text);
            if (!"_".equals($VARIABLE_TOKEN.text))
            {
                $Options.variableNames.put($VARIABLE_TOKEN.text, $var);
                $Options.singletons.put($VARIABLE_TOKEN.text, $var);
            }
                $Options.variables.add($var);
            }
            else
            {
                $Options.singletons.remove($VARIABLE_TOKEN.text);
            }
        }
	;

integer returns [IntegerTerm int_term]
@init
{
    $int_term = null;
}
	: INTEGER_TOKEN {$int_term = IntegerTerm.get($INTEGER_TOKEN.text);}
	;
   
float_number returns [FloatTerm float_term]
@init
{
    $float_term = null;
}
	: FLOAT_NUMBER_TOKEN {$float_term = new FloatTerm($FLOAT_NUMBER_TOKEN.text);}
	;

char_code_list returns [Term char_term]
@init
{
    $char_term = null;
}  
	: CHAR_CODE_LIST_TOKEN	
        {
            String val = TermParserUtils.convertQuotedString($CHAR_CODE_LIST_TOKEN.text,'\"');
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
            $char_term = new DoubleQuotesTerm(environment, codesValue, charsValue, atomValue);
        }
	;

open
	: OPEN_TOKEN
	;
    
open_ct
        : OPEN_TOKEN            
        ;  
  
close
	: CLOSE_TOKEN
	;

open_list
	: OPEN_LIST_TOKEN
	;

close_list
	: CLOSE_LIST_TOKEN
	;	

open_curly
	: OPEN_CURLY_TOKEN
	;

close_curly
	: CLOSE_CURLY_TOKEN
	;

ht_sep
	: HEAD_TAIL_SEPARATOR_TOKEN
	;

comma 
	: COMMA_TOKEN
	;

end
	: END_TOKEN
	;

/*********** 
Lexer
*/
WS  :   [ \t\r\n]+ -> skip ;

SPECIAL_TOKEN
        : 
        (
        LAYOUT_TEXT_SEQUENCE      
        | LAYOUT_TEXT
        | COMMENT
        | SINGLE_LINE_COMMENT
        | BRACKETED_COMMENT
        )
        -> skip
        ;

OPEN_LIST_TOKEN
	: OPEN_LIST_CHAR 
	;
	
CLOSE_LIST_TOKEN
	: CLOSE_LIST_CHAR 
	;

HEAD_TAIL_SEPARATOR_TOKEN
	: HEAD_TAIL_SEPARATOR_CHAR 
	;

OPEN_TOKEN
	: OPEN_CHAR 
	;
	
CLOSE_TOKEN
	: CLOSE_CHAR 
	;
	
OPEN_CURLY_TOKEN
	: OPEN_CURLY_CHAR 
	;
	
CLOSE_CURLY_TOKEN
	: CLOSE_CURLY_CHAR 
	;

COMMA_TOKEN
	: COMMA_CHAR 
	;
	
END_TOKEN
	: END_CHAR 
	;

END_CHAR
	: '.'
	;

OPEN_LIST_CHAR:          			'[';
CLOSE_LIST_CHAR:         			']';
HEAD_TAIL_SEPARATOR_CHAR:			'|';

NAME_TOKEN
	: IDENTIFIER_TOKEN
        | GRAPHIC_TOKEN
        | QUOTED_TOKEN
        | SEMICOLON_TOKEN
        | CUT_TOKEN 
        | UNICODE
    ;

UNICODE
        : ['\u00C0'..'\u00D6']
        | ['\u00D8'..'\u00F6'] 
        | ['\u00F8'..'\u02FF'] 
        | ['\u0370'..'\u037D'] 
        | ['\u037F'..'\u1FFF']
        | ['\u200C'..'\u200D']
      
    ;


VARIABLE_TOKEN
	: ANONYMOUS_VARIABLE
        | NAMED_VARIABLE
	;

INTEGER_TOKEN
	: ('-')? 
	( INTEGER_CONSTANT
        | CHARACTER_CODE_CONSTANT
        | BINARY_CONSTANT
        | OCTAL_CONSTANT
        | HEXADECIMAL_CONSTANT
        )
        ;

ANONYMOUS_VARIABLE
	: VARIABLE_INDICATOR_CHAR
	;

NAMED_VARIABLE
	: VARIABLE_INDICATOR_CHAR (ALPHA_NUMERIC_CHAR)+ 
        | CAPITAL_LETTER_CHAR (ALPHA_NUMERIC_CHAR)*
        ;
        
VARIABLE_INDICATOR_CHAR
 	: UNDERSCORE_CHAR
	;

IDENTIFIER_TOKEN
	: SMALL_LETTER_CHAR (ALPHA_NUMERIC_CHAR)*   
        ;

ALPHA_NUMERIC_CHAR
	: ALPHA_CHAR 
	| DECIMAL_DIGIT_CHAR
	;
	
ALPHA_CHAR
	: UNDERSCORE_CHAR
        | LETTER_CHAR 
        ;

LETTER_CHAR
	: CAPITAL_LETTER_CHAR
        | SMALL_LETTER_CHAR
        ;
        
GRAPHIC_TOKEN
	: '.' (GRAPHIC_TOKEN_CHAR)+ 
	| GRAPHIC_TOKEN_CHAR (GRAPHIC_TOKEN_CHAR|'.')* 
	;

GRAPHIC_TOKEN_CHAR
	: GRAPHIC_CHAR 
	| BACKSLASH_CHAR
	;

QUOTED_TOKEN
	: SINGLE_QUOTE_CHAR (SINGLE_QUOTED_ITEM )* SINGLE_QUOTE_CHAR
        ;
        
SINGLE_QUOTED_ITEM
	: SINGLE_QUOTED_CHAR 
        | CONTINUATION_ESCAPE_SEQUENCE 
        ;
         
CONTINUATION_ESCAPE_SEQUENCE
	: BACKSLASH_CHAR NEW_LINE_CHAR 
        ;
        
SEMICOLON_TOKEN
	: SEMICOLON_CHAR  
	;
	
CUT_TOKEN
	: CUT_CHAR 
	;

GRAPHIC_CHAR
	: '#'|'$'|'&'|'*'|'+'|'-'|'/'|':'|'<'|'='|'>'|'?'|'@'|'^'|'~'/*|'.'*/
	;

CUT_CHAR:                			'!';
OPEN_CHAR:               			'(';
CLOSE_CHAR:              			')';
COMMA_CHAR:              			',';
SEMICOLON_CHAR:          			';';
OPEN_CURLY_CHAR:         			'{';
CLOSE_CURLY_CHAR:        			'}';
END_LINE_COMMENT_CHAR:   			'%';
CAPITAL_LETTER_CHAR:    			[A-Z];
SMALL_LETTER_CHAR:      			[a-z];
DECIMAL_DIGIT_CHAR:     			[0-9];
UNDERSCORE_CHAR: 				'_';
BACKSLASH_CHAR:					'\\';
SINGLE_QUOTE_CHAR:				'\'';
DOUBLE_QUOTE_CHAR:				'\"';
BACK_QUOTE_CHAR:				'`';
      
SINGLE_QUOTED_CHAR
	: NON_QUOTE_CHAR
        | SINGLE_QUOTE_CHAR SINGLE_QUOTE_CHAR 
        | DOUBLE_QUOTE_CHAR
        | BACK_QUOTE_CHAR
	;
   
NON_QUOTE_CHAR
	: GRAPHIC_CHAR
        | ALPHA_NUMERIC_CHAR
        | SOLO_CHAR
        | SPACE_CHAR
        | META_ESCAPE_SEQUENCE
        | CONTROL_ESCAPE_SEQUENCE
        | OCTAL_ESCAPE_SEQUENCE
        | HEXADECIMAL_ESCAPE_SEQUENCE
        | '.'
        ;

CHARACTER
	: GRAPHIC_CHAR       
        | ALPHA_NUMERIC_CHAR 
        | SOLO_CHAR          
        | LAYOUT_CHAR        
        | META_CHAR         
	;

DOUBLE_QUOTED_CHAR
	: NON_QUOTE_CHAR
        | SINGLE_QUOTE_CHAR
        | DOUBLE_QUOTE_CHAR DOUBLE_QUOTE_CHAR
        | BACK_QUOTE_CHAR
        ;

BACK_QUOTED_CHAR
	: NON_QUOTE_CHAR
	| SINGLE_QUOTE_CHAR
        | DOUBLE_QUOTE_CHAR 
        | BACK_QUOTE_CHAR BACK_QUOTE_CHAR
	;			          
         
META_ESCAPE_SEQUENCE
	: BACKSLASH_CHAR META_CHAR  
        ;
        
CONTROL_ESCAPE_SEQUENCE
	: BACKSLASH_CHAR SYMBOLIC_CONTROL_CHAR  
        ;
        
SYMBOLIC_CONTROL_CHAR
	: SYMBOLIC_ALERT_CHAR
        | SYMBOLIC_BACKSPACE_CHAR
        | SYMBOLIC_FORM_FEED_CHAR
        | SYMBOLIC_NEW_LINE_CHAR
        | SYMBOLIC_HORIZONTAL_TAB_CHAR
        | SYMBOLIC_VERTICAL_TAB_CHAR
        | SYMBOLIC_CARRIAGE_RETURN_CHAR
        ;
        
SYMBOLIC_ALERT_CHAR:          			'a';
SYMBOLIC_BACKSPACE_CHAR:      			'b';
SYMBOLIC_FORM_FEED_CHAR:      			'f';
SYMBOLIC_NEW_LINE_CHAR:       			'n';
SYMBOLIC_HORIZONTAL_TAB_CHAR: 			't';
SYMBOLIC_VERTICAL_TAB_CHAR:   			'v';
SYMBOLIC_CARRIAGE_RETURN_CHAR:			'r';
SYMBOLIC_HEXADECIMAL_CHAR:    			'x';

OCTAL_ESCAPE_SEQUENCE
	: BACKSLASH_CHAR (OCTAL_DIGIT_CHAR)+ BACKSLASH_CHAR 
        ;

HEXADECIMAL_ESCAPE_SEQUENCE
	: BACKSLASH_CHAR SYMBOLIC_HEXADECIMAL_CHAR (HEXADECIMAL_DIGIT_CHAR)+ BACKSLASH_CHAR 
	;
                        
INTEGER_CONSTANT
	: (DECIMAL_DIGIT_CHAR)+ 
	;
	 
CHARACTER_CODE_CONSTANT
	: '0' SINGLE_QUOTE_CHAR SINGLE_QUOTED_CHAR 
	;
	 
BINARY_CONSTANT
	: '0b' (BINARY_DIGIT_CHAR)+ 
	;
	
OCTAL_CONSTANT
	: '0o' (OCTAL_DIGIT_CHAR)+ 
	;
	
HEXADECIMAL_CONSTANT
	: '0x' (HEXADECIMAL_DIGIT_CHAR)+ 
	;

FLOAT_NUMBER_TOKEN
	: ('-')? INTEGER_CONSTANT FRACTION (EXPONENT)? 
	;
	
FRACTION
	: '.' (DECIMAL_DIGIT_CHAR)+ 
	;
	 
EXPONENT
	: ('E'|'e') ('+'|'-')? INTEGER_CONSTANT 
	; 

CHAR_CODE_LIST_TOKEN
	: DOUBLE_QUOTE_CHAR (DOUBLE_QUOTED_ITEM)* DOUBLE_QUOTE_CHAR 
	;
	
DOUBLE_QUOTED_ITEM
	: DOUBLE_QUOTED_CHAR 
        | CONTINUATION_ESCAPE_SEQUENCE  
	;

BACK_QUOTED_STRING
	: BACK_QUOTE_CHAR BACK_QUOTED_ITEM BACK_QUOTE_CHAR 
	;
	
BACK_QUOTED_ITEM
	: BACK_QUOTED_CHAR  
        | CONTINUATION_ESCAPE_SEQUENCE  
        ;

GRAPHIC_CHAR_PERIOD
	: ('.') 
	| GRAPHIC_CHAR
	;

BINARY_DIGIT_CHAR:                            '0'|'1';
OCTAL_DIGIT_CHAR:       			[0-7];
HEXADECIMAL_DIGIT_CHAR: 		  [0-9a-fA-F];

SOLO_CHAR
	: CUT_CHAR
        | OPEN_CHAR
        | CLOSE_CHAR
        | COMMA_CHAR
        | SEMICOLON_CHAR
        | OPEN_LIST_CHAR
        | CLOSE_LIST_CHAR
        | OPEN_CURLY_CHAR
        | CLOSE_CURLY_CHAR
        | HEAD_TAIL_SEPARATOR_CHAR
        | END_LINE_COMMENT_CHAR
        ;

LAYOUT_CHAR
	: SPACE_CHAR
        | NEW_LINE_CHAR
        ;

SPACE_CHAR
	: [ \t]
	;
	
NEW_LINE_CHAR
	: '\r\n'    
	| '\n\r' 
	| '\n' 
	| '\r'
	;

META_CHAR
	: BACKSLASH_CHAR
	| SINGLE_QUOTE_CHAR
        | DOUBLE_QUOTE_CHAR
        | BACK_QUOTE_CHAR
        ;
        
LAYOUT_TEXT_SEQUENCE
        : LAYOUT_TEXT+                               
        ;

LAYOUT_TEXT
        : COMMENT 
        | LAYOUT_CHAR
        ;

COMMENT
        : SINGLE_LINE_COMMENT 
        | BRACKETED_COMMENT
        ;

SINGLE_LINE_COMMENT
        : '%' (~('\n'|'\r'))* ('\n'|'\r'|'\r\n')  
        ;

BRACKETED_COMMENT
        : '/*' .*? '*/'
        ;   