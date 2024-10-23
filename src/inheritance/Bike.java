package inheritance;

public class Bike extends Vehicle{

    @Override
	public void run() {
		System.out.println("Bike is running is safely");
	}
	
	
    public static void main(String[] args) {
		
    	Vehicle v = new Bike(); // upcasting
    	
    	v.run(); // RTP -> DMD
    	
    	Bike b = new Bike(); //
    	b.run();
	}
	
}
