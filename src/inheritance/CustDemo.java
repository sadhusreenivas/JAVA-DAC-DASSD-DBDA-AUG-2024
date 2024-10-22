package inheritance;

public class CustDemo {

	public static void main(String[] args) {
		 Customer c1 = new Customer(12321, "ABC", 100000);
		 c1.disp();
		 c1.calSI();
		 
		 ClassicCustomer cc1 = new ClassicCustomer(12345, "XYZ", 100000, 8.5);
		 cc1.disp();
		 cc1.calSI();
		 
		 c1 = cc1; // upcasting
		 Customer c2 = new ClassicCustomer(345, "ASDF", 100000, 8.6);
		 
		 c2.calSI();
		 c2.disp();
		 
		 c1.calSI();
		 c1.disp();
		 
		 
		 
	}

}
