package exceptions;

public class CustomerApp {
	private double balance;
	
	public CustomerApp(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int amount) throws InsufficientFundsException{
		if(amount < balance)
			balance -= amount;
		else
			throw new InsufficientFundsException("less balance");
	}


	public static void main(String[] args) {
		
		CustomerApp c1 = new CustomerApp(25000);
		System.out.println(c1.getBalance());
		
		try {
			c1.withdraw(5000);
			System.out.println(c1.getBalance());
			c1.withdraw(25000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(c1 != null)
				c1 = null;
			System.out.println("Resource closed!");
		}
		System.out.println("Rest of the code folows.......");

	}

}
