package multithreading;

//
public class ThreadOne extends Thread{
	Table t;
	
	public ThreadOne(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(17);
	}
}
