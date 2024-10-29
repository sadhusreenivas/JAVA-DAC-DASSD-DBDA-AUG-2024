package multithreading;

public class ITCTest {

	public static void main(String[] args) {
	
		Customer c1 = new Customer(25000);
		
		new Thread(
				() -> c1.withdraw(30000)
				).start();
       
		new Thread() {
			public void run() {
				c1.deposit(15000);
			}
		}.start();
		
		
	}

}
