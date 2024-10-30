package collections.maps;

import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		Map m = new IdentityHashMap();
		m.put(i1, 123);
		m.put(i2, 321);
		
		System.out.println(m); //

	}

}
