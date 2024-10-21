package demo;

public class Student {
	int rno;
	String name;
	double gpa;
	static String university = "C-DAC";
	private Address address;

	public Student(int rno, String name, double gpa, Address address) {
		this.rno = rno;
		this.name = name;
		this.gpa = gpa;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", gpa=" + gpa + ", address=" + address + "]";
	}
}


	
	

