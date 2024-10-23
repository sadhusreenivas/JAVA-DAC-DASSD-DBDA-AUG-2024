package abstraction;

public class SBI implements ATM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a = new SBI();
		a.transfer();
		a.withdraw();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw success");
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("transfer success  and received: "+cashback);
	}

}
