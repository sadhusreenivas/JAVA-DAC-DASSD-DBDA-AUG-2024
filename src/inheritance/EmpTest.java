package inheritance;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(12321, "Qwerty", 100000);
		e1.dispEmployee();
		e1.calSalary();
		
		TechEmp te1 = new TechEmp(54321, "ASDF",100000, 10000);
		te1.dispEmployee();
		//System.out.println(te1.getBonus());
		te1.calSalary();
	}

}
