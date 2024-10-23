package abstraction;
public class Bank extends RBI{
	
	public Bank(int cashback) {
		super(cashback);
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw success and received cashabck: "+cashback);
	}

	@Override
	void transfer() {
		System.out.println("Transfer success");
		
	}

	@Override
	void disp() {
		super.disp();
		System.out.println("I am a Bank");
	}
	
	void msg() {
		System.out.println("Welcome to Bank");
	}
	

}
