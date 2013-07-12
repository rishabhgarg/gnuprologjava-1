// Generated from Term.g4 by ANTLR 4.1

package gnu.prolog.io.parser.gen;
import gnu.prolog.io.parser.*;
import gnu.prolog.term.*;
import gnu.prolog.io.*;
import gnu.prolog.vm.*;
import java.io.IOException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TermParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TermVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TermParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(@NotNull TermParser.CommaContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#list_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_term(@NotNull TermParser.List_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(@NotNull TermParser.CompoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#close_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_list(@NotNull TermParser.Close_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#char_code_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_code_list(@NotNull TermParser.Char_code_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull TermParser.OpContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull TermParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#curly_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurly_term(@NotNull TermParser.Curly_termContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#readTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadTerm(@NotNull TermParser.ReadTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#open_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_list(@NotNull TermParser.Open_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#open_ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_ct(@NotNull TermParser.Open_ctContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(@NotNull TermParser.CloseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#open_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_curly(@NotNull TermParser.Open_curlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(@NotNull TermParser.OpenContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull TermParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(@NotNull TermParser.Op2Context ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#float_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_number(@NotNull TermParser.Float_numberContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#operatorTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorTerm(@NotNull TermParser.OperatorTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#ht_sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt_sep(@NotNull TermParser.Ht_sepContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull TermParser.TermContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull TermParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#simpleTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTerm(@NotNull TermParser.SimpleTermContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#close_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_curly(@NotNull TermParser.Close_curlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#readTermEof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadTermEof(@NotNull TermParser.ReadTermEofContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull TermParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link TermParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(@NotNull TermParser.EndContext ctx);
}