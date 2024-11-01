package garbagecollection;

public class GCDemo {
	
	public void finalize() {
		System.out.println("Garbage collected!");
		// clean up code
	}
   
	public static void main(String[] args) {
		
		GCDemo[] gcDemo = new GCDemo[10];  // array
		
		for(int i=0; i<2; i++)
			gcDemo[i] = new GCDemo(); // 10
		
		gcDemo = null;
		
		
		
		System.gc(); // invoking GC
		
		//Runtime.getRuntime().gc();
		

	}

}
