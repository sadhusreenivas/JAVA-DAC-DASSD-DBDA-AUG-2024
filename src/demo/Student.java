package demo;
public class Student {
	int rno;
	String name;
	double gpa;
	static String university = "C-DAC";
	
	public Student(int rno, String name, double gpa) {
		this.rno = rno;
		this.name = name;
		this.gpa = gpa;
	}

    void disp(){
    	System.out.println(rno+" "+name+" "+gpa+"  "+university);
    }

	public static void main(String[] args) {
		
		Student s1 = new Student(123,"ABC", 9.1);
		s1.disp();
	
	}

}
