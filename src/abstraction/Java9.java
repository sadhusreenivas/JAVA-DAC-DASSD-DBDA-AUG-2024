package abstraction;

public interface Java9 {

	default void msg() {
		System.out.println("Its a default method");
		disp();
	}
	
	private void disp() {
		System.out.println("Its a private method");
	}
	
	static void fun() {
		System.out.println("Its a static method");
	}
	
	void test();
}
