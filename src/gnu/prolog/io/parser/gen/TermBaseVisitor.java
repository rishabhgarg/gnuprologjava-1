// Generated from Term.g4 by ANTLR 4.0

package gnu.prolog.io.parser.gen;
import gnu.prolog.io.parser.*;
import gnu.prolog.term.*;
import gnu.prolog.io.*;
import gnu.prolog.vm.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class TermBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TermVisitor<T> {
	@Override public T visitComma(TermParser.CommaContext ctx) { return visitChildren(ctx); }

	@Override public T visitList_term(TermParser.List_termContext ctx) { return visitChildren(ctx); }

	@Override public T visitCompound(TermParser.CompoundContext ctx) { return visitChildren(ctx); }

	@Override public T visitClose_list(TermParser.Close_listContext ctx) { return visitChildren(ctx); }

	@Override public T visitChar_code_list(TermParser.Char_code_listContext ctx) { return visitChildren(ctx); }

	@Override public T visitOp(TermParser.OpContext ctx) { return visitChildren(ctx); }

	@Override public T visitInteger(TermParser.IntegerContext ctx) { return visitChildren(ctx); }

	@Override public T visitCurly_term(TermParser.Curly_termContext ctx) { return visitChildren(ctx); }

	@Override public T visitReadTerm(TermParser.ReadTermContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpen_list(TermParser.Open_listContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpen_ct(TermParser.Open_ctContext ctx) { return visitChildren(ctx); }

	@Override public T visitClose(TermParser.CloseContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpen_curly(TermParser.Open_curlyContext ctx) { return visitChildren(ctx); }

	@Override public T visitOpen(TermParser.OpenContext ctx) { return visitChildren(ctx); }

	@Override public T visitExp(TermParser.ExpContext ctx) { return visitChildren(ctx); }

	@Override public T visitOp2(TermParser.Op2Context ctx) { return visitChildren(ctx); }

	@Override public T visitFloat_number(TermParser.Float_numberContext ctx) { return visitChildren(ctx); }

	@Override public T visitHt_sep(TermParser.Ht_sepContext ctx) { return visitChildren(ctx); }

	@Override public T visitTerm(TermParser.TermContext ctx) { return visitChildren(ctx); }

	@Override public T visitName(TermParser.NameContext ctx) { return visitChildren(ctx); }

	@Override public T visitSimpleTerm(TermParser.SimpleTermContext ctx) { return visitChildren(ctx); }

	@Override public T visitClose_curly(TermParser.Close_curlyContext ctx) { return visitChildren(ctx); }

	@Override public T visitReadTermEof(TermParser.ReadTermEofContext ctx) { return visitChildren(ctx); }

	@Override public T visitVariable(TermParser.VariableContext ctx) { return visitChildren(ctx); }

	@Override public T visitEnd(TermParser.EndContext ctx) { return visitChildren(ctx); }
}