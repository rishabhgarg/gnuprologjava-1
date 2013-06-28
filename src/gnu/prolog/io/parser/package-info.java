/**
 * This package contains the TermParser.g4 file which is used by ANTLR 4.1 to
 * generate the parser found in {@link gnu.prolog.io.parser.gen}.
 * 
 * Earlier, javacc was used and unicode support was not provided. 
 * The parser in .gen supports unicode conforming to the Unicode Consortium.
 * When you wish to modify something in .gen then you dont't need to also modify the .g4 file
 * but that would be less beneficial as on regeneration the orignal .gen files would
 * reappear.
 * 
 * This package also contains classes such as
 * {@link gnu.prolog.io.parser.NameToken NameToken},
 * {@link gnu.prolog.io.parser.ReaderCharStream ReaderCharStream} and
 * {@link gnu.prolog.io.parser.TermParserUtils TermParserUtils} which contain
 * some of the code needed to integrate the generated parser with the rest of
 * the codebase.
 * 
 * 
 */
package gnu.prolog.io.parser;

