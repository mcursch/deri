package derivative_app;

public interface ILexer {

	IToken next() throws LexicalException;
	IToken peek() throws LexicalException;
}
