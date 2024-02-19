package derivative_app;

public interface IToken {
    public record SourceLocation(int line, int column) {}  

	public static enum Kind {
		LPAREN,
		RPAREN,
		VAR,
		INT, 
		FLOAT,
		ERROR,
		EXPONENT,
		TIMES, 
		DIV,
		PLUS,
		MINUS, 
		EOF
		
	}

}
