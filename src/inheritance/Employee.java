package inheritance;
public class Employee {
	private int eid;
	private String ename;
	protected double basicPay;
	private static String worksFor = "C-DAC";
	
	public Employee(int eid, String ename, double basicPay) {
		this.eid = eid;
		this.ename= ename;
		this.basicPay = basicPay;
	}
	
	public void dispEmployee() {
		System.out.println(eid+" "+ename+" "+basicPay+" "+worksFor);
	}
	// calculate salary
	public void calSalary() {
		double hra = 0.3;
		double da = 0.53;
		double ta = 0.1;
		
		double salary = basicPay + basicPay*(hra+da+ta);
		System.out.println("Total Salary: "+salary);
	}
	
//	public double getBasicPay() {
//		return basicPay;
//	}
	
	
	
}
