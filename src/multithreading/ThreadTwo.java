package multithreading;

public class ThreadTwo extends Thread{

	Table t;

	public ThreadTwo(Table t) {
		super();
		this.t = t;
	}
	
	public void run() {
		t.printTable(18);
	}
}
