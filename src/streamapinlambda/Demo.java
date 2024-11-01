package streamapinlambda;

public class Demo {
	   static void hello() {
		   System.out.println("Hello");
	   }
	
	    public static void main(String[] args) {
	    	Student s = new Student(111,"Kumar","CSE",7.8);
	        // Creating a thread with a lambda expression
	        Thread thread = new Thread(() -> {
	            // Code to be executed in the new thread
	            System.out.println("Hello from the thread!");
	            hello();
	            System.out.println(s);
	        });

	        thread.start(); // Start the thread
	    }
	}

