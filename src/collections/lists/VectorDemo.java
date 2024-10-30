package collections.lists;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		
		v.add(10);
		v.addElement(123);
		v.add("Java");
		v.add(null);
		v.add(false);
		
		System.out.println(v);
		v.removeElement(false);
		v.add(321);
		System.out.println(v);
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
	}
}
