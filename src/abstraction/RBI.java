package abstraction;

abstract public class RBI {
	
	protected int cashback;
	
	public RBI(int cashback) {
		this.cashback = cashback;
	}
	
	abstract void withdraw();
	abstract void transfer();
	
	void disp() {
		System.out.println("I am RBI");
	}
	
}

// 66%