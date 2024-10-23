package abstraction;

public class Car extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Vehicle v = new Car();
		v.run();
		v.disp();
	}

	@Override
	void run() {
		System.out.println("running safely.....");
	}

	@Override
	void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("I am a car");
	}

	
}
