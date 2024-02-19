package derivative_app;
import java.util.ArrayList;
public class Token implements IToken{
	final Kind kind;
	final String input;
	final int pos;
	final int line;
	final int length;
	
	public Token(Kind kind, String input,  int line, int pos, int length) {
		this.line = line;
		this.kind = kind;
		this.pos = pos;
		this.length = length;
		this.input = input;
	}
}
