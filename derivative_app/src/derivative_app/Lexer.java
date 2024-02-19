package derivative_app;

import java.util.ArrayList;
import java.util.HashMap;
import derivative_app.IToken.Kind;
public class Lexer implements ILexer{
	ArrayList<Token> tokens = new ArrayList<Token>();
	HashMap<String, Kind> res = new HashMap<>();
	
	int col =0;
	int pos = 0;
	int tokenPos = 0;
	
	@Override
	public IToken peek() throws LexicalException {
		return tokens.get(tokenPos);
	}
	@Override
	public IToken next() throws LexicalException {
		 
		 
		if(tokens.get(tokenPos).kind == Kind.ERROR){
		 
			throw new LexicalException("error");
		}
		return tokens.get(++tokenPos);
		 
		 
	}

	private enum State {
		START, 
		HAVE_DOT, 
		HAVE_NUMB, 
		HAVE_EOF, 
		HAVE_MINUS, 
	}
	
	void inc()
	{
		pos++;
		col++;
	}
	
	public Lexer(String input)
	{
		//define initial state
		State state = State.START;
		char chars[] = input.toCharArray();
		int line = 0;
		int startPos = 0;
		char ch = chars[pos];
		
		
		//begin tokenizing
		while(true)
		{
			switch(state) {
			case START:
				startPos = col;
				
				
				switch(ch) {
				case '*':
					Token times_token = new Token(Kind.TIMES, "*", line, startPos, 1);
					inc();
					break;
				case '/':
					Token div_token = new Token(Kind.DIV, "/", line, startPos, 1);
					inc();
					break;
				case '+':
					Token plus_token = new Token(Kind.PLUS, "+", line, startPos, 1);
					inc();
					break;
				case '-':
					Token minus_token = new Token(Kind.MINUS, "-", line, startPos, 1);
					tokens.add(minus_token);
					break;
				case  '1','2','3','4','5','6','7','8','9':
					inc();
					 
					state = State.HAVE_NUMB;
					break;
							
			}
		}
	}

	}
}
