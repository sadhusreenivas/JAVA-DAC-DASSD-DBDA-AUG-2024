package collections.sets;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set hs = new LinkedHashSet();
		hs.add(10);
		hs.add("Java");
		hs.add(null);
		hs.add("C-DAC");
		hs.add(10); // ignored
		hs.add(123);
		hs.add(3.14);
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
