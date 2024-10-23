package abstraction;

public class SBI implements ATM, TTP{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi  = new SBI();
		sbi.transfer();
		sbi.withdraw();
		sbi.confirmTransaction();
		
		
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

	@Override
	public void confirmTransaction() {
		// TODO Auto-generated method stub
		System.out.println("transaction confirmed");
	}

}
