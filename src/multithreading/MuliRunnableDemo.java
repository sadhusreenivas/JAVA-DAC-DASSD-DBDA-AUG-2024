package multithreading;

public class MuliRunnableDemo implements Runnable {

	@Override
	public void run() {
		 for(int i=1; i<=25; i++) {
			 System.out.println(i);
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = new MuliRunnableDemo();
		Runnable r2 = new MuliRunnableDemo();
		
		// creating threads 
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t1.join(2500);
		t2.start();
	}
}
