package multithreading;

public class Table {
	
	public synchronized void printTable(int n) {
		
	    System.out.println("Printing Table...."+n);
	    
	    for(int i=1; i<=10; i++) {
	    	System.out.println(n+" * "+i+" ="+(n*i));
	    	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	}

}
