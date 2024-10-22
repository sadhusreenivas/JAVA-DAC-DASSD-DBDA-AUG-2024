package inheritance;

public class ClassicCustomer extends Customer {
	double intRate;
	public ClassicCustomer(int cid, String cname, double balance, double intRate) {
		super(cid, cname, balance);
		this.intRate = intRate;
	}
	
	@Override
	public void disp() {
		super.disp();
		System.out.println("Interest Rate: "+intRate);
	
	}
	@Override
	public void calSI() {
		double si = getBalance()*3.5*intRate;
		System.out.println("Interest earned: "+si);
	}
	
	
	
	
}
