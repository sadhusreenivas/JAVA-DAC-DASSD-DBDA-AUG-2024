package inheritance;

public class TechEmp extends Employee {

	private int bonus;

	public TechEmp(int eid, String ename, double basicPay, int bonus) {
		super(eid, ename, basicPay); //
		this.bonus = bonus;
	}

//	public int getBonus() {
//		return bonus;
//	}

//	public void setBonus(int bonus) {
//		this.bonus = bonus;
//	}

	// re-definition => overriding
	public void calSalary() {
		double hra = 0.3;
		double da = 0.53;
		double ta = 0.1;

		double salary = basicPay + basicPay * (hra + da + ta) + bonus;
		System.out.println("Total Salary: " + salary);
	}

	// all the 3 methods available

	@Override
	public void dispEmployee() {
		// System.out.println(eid+" "+ename+" "+basicPay+" "+worksFor);
		super.dispEmployee();
		System.out.println("Bonus: " + bonus);
	}
}
