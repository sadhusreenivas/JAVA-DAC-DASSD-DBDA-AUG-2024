package collections.lists;

public class Student {
	
	int sid;
	String name;
	String course;
	double gpa;
	static String inst = "C-DAC";
	
	
	public Student(int sid, String name, String course, double gpa) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.gpa = gpa;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + ", gpa=" + gpa + ",Inst= "+inst+"]";
	}



	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public static String getInst() {
		return inst;
	}
	public static void setInst(String inst) {
		Student.inst = inst;
	}
	
	
    
}
