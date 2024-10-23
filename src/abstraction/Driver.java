package abstraction;

public class Driver {

	public static void main(String[] args) {
		
		RBI rbi = new Bank(10);
		rbi.transfer();
		rbi.withdraw();
		rbi.disp();
		
		new Bank(10).msg();
	}

}
