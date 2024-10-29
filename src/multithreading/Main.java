package multithreading;

public class Main {

	public static void main(String[] args) {
		
		Table t = new Table();
		
	    new Thread() {
			public void run() {
				t.printTable(17);
			}
		}.start();
		
		Thread t2 = new Thread() {
			public void run() {
				t.printTable(18);
			}
		};
		t2.start();
		
		new Thread() {
			public void run() {
				t.printTable(19);
			}
		}.start();
		
//		Thread t4 = new Thread() {
//			public void run() {
//				t.printTable(17);
//			}
//		};
//		t4.start();
//		
		// lambda expresiion
		
		Thread t4 = new Thread(
				() -> t.printTable(17)
				);
		t4.start();
		
		new Thread() {
			public void run() {
				t.printTable(24);
			}
		}.start();
		
		
		
	}

}
