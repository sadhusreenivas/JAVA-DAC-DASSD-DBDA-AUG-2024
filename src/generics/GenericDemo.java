package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	
	// generic method
	public static  <E> void printList(List<?> l){
		for(Object ele: l)
			System.out.println(ele);
	}
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		
		printList(l1);
	}

}
