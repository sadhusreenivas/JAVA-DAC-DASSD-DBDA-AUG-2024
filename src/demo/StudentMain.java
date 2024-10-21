package demo;

public class StudentMain {

	public static void main(String[] args) {
		Address a1 = new Address("plot no 6 & 7","HW Park", "Raviryal", "Hyderabad", 501510,"TG");
		Student s1 = new Student(123, "ASDF", 9.3, a1);
		
		System.out.println(s1);

	}

}
