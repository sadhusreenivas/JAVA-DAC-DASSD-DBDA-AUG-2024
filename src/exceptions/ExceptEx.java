package exceptions;
import java.util.*;
public class ExceptEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two nos:");
		int a =0;
		int b =0;
		try {
		 a = scanner.nextInt();
		 b = scanner.nextInt();
		System.out.println(a+" "+b);
		
		int sum = a + b;
		System.out.println(sum);
		int div = a / b;  // throw new ArithmeticException();
		System.out.println(div);
		}
//		catch(ArithmeticException e) {
//			System.err.println(e);
//			//e.printStackTrace();
//		}
		catch(Exception e) {
			System.err.println(e);
		}
		
//		catch(InputMismatchException e) {
//			System.err.println(e);
//		}
		
		int prod = a *b;
		System.out.println(prod);
				
		// rest of the code...
		System.out.println("Rest of the code follows.....");
		
	}

}
