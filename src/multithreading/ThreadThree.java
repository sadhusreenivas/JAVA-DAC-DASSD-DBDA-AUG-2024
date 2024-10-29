package multithreading;

public class ThreadThree extends Thread {
	
	Table t;

	public ThreadThree(Table t) {
		super();
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(19);
	}

}
