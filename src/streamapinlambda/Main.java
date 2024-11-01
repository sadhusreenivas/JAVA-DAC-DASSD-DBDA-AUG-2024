package streamapinlambda;


public class Main {
	public static void main(String[] args) {

		Table table = new Table();

		// create thread 1
		 Thread x = new Thread(
			() ->	table.printTable(17)
		 );
		 x. start();
		 
		// create thread 2
		new Thread() {
			public void run() {
				table.printTable(16);
			}
		}.start();

		// create thread 3
		new Thread() {
			public void run() {
				table.printTable(29);
			}
		}.start();

		// create thread 4
		new Thread() {
			public void run() {
				table.printTable(33);
			}
		}.start();

		// create thread 5
		new Thread() {
			public void run() {
				table.printTable(14);
			}
		}.start();
	}

}