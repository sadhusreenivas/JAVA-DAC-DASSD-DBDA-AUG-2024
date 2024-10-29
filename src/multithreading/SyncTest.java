package multithreading;

public class SyncTest {
	public static void main(String[] args) {
		
		Display d = new Display();
		new Thread(
				() -> d.printUpperCase()
				).start();
		
		new Thread(
				() -> d.printLowerCase()
				).start();
		
		new Thread(
				() -> d.printNumbers()
				).start();
		
	}

}
