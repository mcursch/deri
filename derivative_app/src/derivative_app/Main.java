package derivative_app;

public class Main {

	public static String tokens;
	public static void main(String[] args) {
		tokens = "";
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String s = "";
		tokenize("x^2 + 2", s);
		System.out.print(s);
		
		print(tokens);

	}
	public static void print(Object s) {
		System.out.println(s.toString()); 
	}

	
	public static String tokenize(String equation, String s)
	{
		
		char[] chareq = equation.toCharArray();
		for(int i = 0; i < chareq.length; i++) {
			classify(chareq[i], s);
		}
		return null;
	}
	
	public static void classify(char item, String s) 
	{
		
		switch(item) {
		case 'x':
			tokens += "VAR";
			break;
		case '(':
			tokens += "LPAREN";
			break;
		case ')':
			tokens += "RPAREN";
			break;
		case '^':
			tokens += "EXPONENTIAL";
			break;
		case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
			tokens += "NUMBER";
			break;
		default:
			tokens += "BAD";
			break;
		}
			
	}

}
