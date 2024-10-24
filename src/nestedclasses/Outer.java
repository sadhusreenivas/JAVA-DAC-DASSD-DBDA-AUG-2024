package nestedclasses;

public class Outer {
	private String str = "C-DAC Hyd";
	// member inner class
	class Inner {
		void disp() {
			System.out.println(str);
		}
	}
	void display() {
		Inner in = new Inner();
		in.disp();
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.disp();
		out.display(); //
	}
}


