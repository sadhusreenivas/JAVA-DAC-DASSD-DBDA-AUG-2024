package inheritance;
public class Customer {
	private int cid;
	private String cname;
	private double balance;
	private static String bank = "SBI";
	public Customer(int cid, String cname, double balance) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.balance = balance;
	}
	public void disp() {
		System.out.println(cid+" "+cname+" "+balance+" "+bank);
	}
	
	public void calSI() {
		double si = balance*3.5*6.5;
		System.out.println("Interest earned: "+si);
	}
	public double getBalance() {
		return balance;
	}
	
	
}
