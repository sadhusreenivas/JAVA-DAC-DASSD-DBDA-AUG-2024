package collections.lists;

import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		
		List<String> al = new LinkedList();
		System.out.println(al.size());
		
		al.add("HYD");
		al.add("CDAC");
		al.add("BLR");
		al.add("HWPARK");
		al.add("JAVA");
		al.add("CDAC");
		
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		// for each
		for(String str: al)
			System.out.println(str);
		
		System.out.println("*******************");
		
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String s = litr.next();
			if(s.equals("BLR"))
				litr.remove();
			
			if(s.equalsIgnoreCase("Java"))
				litr.set("Srisailam Highway");
		}
		System.out.println(litr.previous());
		System.out.println(al);
		
	}
}
