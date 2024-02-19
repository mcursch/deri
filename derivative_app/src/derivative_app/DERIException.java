package derivative_app;
import derivative_app.IToken.SourceLocation;

@SuppressWarnings("serial")
public class DERIException extends Exception{
	public DERIException (String message) {
		super(message);
	}
	public DERIException (Throwable cause) {
		super(cause);
	}
	public DERIException(String error_message, int line, int column) {
		super(line + ":" + column + "  " + error_message);
	}

	public DERIException(String error_message, SourceLocation loc) {
		super(loc.line()+ ":" + loc.column() + " " + error_message);
	}
}
