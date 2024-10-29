package multithreading;

public class Customer {
	double balance;

	public double getBalance() {
		return balance;
	}

	public Customer(double balanace) {
		super();
		this.balance = balanace;
	}
	
	public synchronized void withdraw(int amount) {
		
		System.out.println("Going to withdraw!");
		if(amount > balance) {
			System.out.println("Insufficient balance");
			System.out.println(getBalance());
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
		System.out.println("Withdraw success");
		System.out.println(getBalance());
	}
	
	public synchronized void deposit(int amount) {
		
		System.out.println("Going to deposit");
		System.out.println("Current balance : "+getBalance());
		balance += amount;
		System.out.println("Latest balance: "+getBalance());
		
		notify(); //
	}

}
