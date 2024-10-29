package multithreading;

public class Multi extends Thread {

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

	public static void main(String[] args) {
		
		Multi t1 = new Multi(); // new 
		t1.start(); // Runnable
		
		Multi t2 = new Multi(); // new 
		t2.start(); // Runnable
		
		
	}
}
