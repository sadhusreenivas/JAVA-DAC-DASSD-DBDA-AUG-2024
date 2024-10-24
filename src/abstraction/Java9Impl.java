package abstraction;

public class Java9Impl implements Java9 {

	@Override
	public void test() {
		System.out.println("abstract method implemented");
	}
	
	public static void main(String[] args) {
		
		Java9 obj = new Java9Impl();
		
		obj.test(); // disp()
		obj.msg();
		Java9.fun();
		
		
		
	}

}
