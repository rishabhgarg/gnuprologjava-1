// Generated from Term.g4 by ANTLR 4.0

package gnu.prolog.io.parser.gen;
import gnu.prolog.io.parser.*;
import gnu.prolog.term.*;
import gnu.prolog.io.*;
import gnu.prolog.vm.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TermVisitor<T> extends ParseTreeVisitor<T> {
	T visitComma(TermParser.CommaContext ctx);

	T visitList_term(TermParser.List_termContext ctx);

	T visitCompound(TermParser.CompoundContext ctx);

	T visitClose_list(TermParser.Close_listContext ctx);

	T visitChar_code_list(TermParser.Char_code_listContext ctx);

	T visitOp(TermParser.OpContext ctx);

	T visitInteger(TermParser.IntegerContext ctx);

	T visitCurly_term(TermParser.Curly_termContext ctx);

	T visitReadTerm(TermParser.ReadTermContext ctx);

	T visitOpen_list(TermParser.Open_listContext ctx);

	T visitOpen_ct(TermParser.Open_ctContext ctx);

	T visitClose(TermParser.CloseContext ctx);

	T visitOpen_curly(TermParser.Open_curlyContext ctx);

	T visitOpen(TermParser.OpenContext ctx);

	T visitExp(TermParser.ExpContext ctx);

	T visitOp2(TermParser.Op2Context ctx);

	T visitFloat_number(TermParser.Float_numberContext ctx);

	T visitHt_sep(TermParser.Ht_sepContext ctx);

	T visitTerm(TermParser.TermContext ctx);

	T visitName(TermParser.NameContext ctx);

	T visitSimpleTerm(TermParser.SimpleTermContext ctx);

	T visitClose_curly(TermParser.Close_curlyContext ctx);

	T visitReadTermEof(TermParser.ReadTermEofContext ctx);

	T visitVariable(TermParser.VariableContext ctx);

	T visitEnd(TermParser.EndContext ctx);
}