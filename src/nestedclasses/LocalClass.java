package nestedclasses;

public class LocalClass {
	
	private String str = "Welcome to Java";
	
	public void display() {
		//  local class
		
		class Local{
			void disp() {
				System.out.println(str);
			}
		}
		
		Local local = new Local();
		local.disp();
	} /// method end

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		
		lc.display(); //
	}
}
