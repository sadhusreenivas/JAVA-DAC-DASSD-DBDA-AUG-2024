package exceptions;
public class NestedTryDemo {
	public static void main(String[] args) {
		try {
            System.out.println("Welcome to outer Try");
            try {
            	int[] arr = new int[5];
            	arr[5] = 10; // AIOBE
            }catch(ArithmeticException e) {
            	System.err.println(e);
            }
            
            System.out.println(" Welcome to inner Try");
            try {
            	String s = null;
            	System.out.println(s.length()); // NPE
            }catch(NullPointerException e) {
            	System.err.println(e);
            }
            System.out.println("exiting outer try");
		}catch(Exception e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Finally is executed always!!");
		}
		System.out.println("Rest of the code follows....");
	}

}
