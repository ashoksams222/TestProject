package roughWork;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			System.out.println("My Channel");
			int c = 10/0;
			System.out.println("Result"+c);
			
		} finally {
			
			System.out.println("Hello i m finally block");
		}
		
		
		
		System.out.println("Hey How r u");
		System.out.println("I m Fine");

	}

}
