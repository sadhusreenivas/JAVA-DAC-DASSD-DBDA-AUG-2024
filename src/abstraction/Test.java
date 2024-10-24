package abstraction;

interface Printable {
	void print();
}

interface Showable extends Printable{
	void show();
}

public class Test implements Showable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing.....");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing results....");
	}

	public static void main(String[] args) {
		
		Showable s = new Test();
		s.print();
		s.show();
		
	}
}