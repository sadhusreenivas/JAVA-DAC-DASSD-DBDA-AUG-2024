package collections.maps;

import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new TreeMap(new MyComp());
		
        m.put("DAC", 90000);
        m.put("DBDA", 115000);
        m.put("DASSD", 95000);
        m.put("DAI", 120000);
		
		System.out.println(m);
		
		// collection views
		Collection c1 = m.keySet();
		System.out.println(c1);
		
		Collection c2 = m.values();
		System.out.println(c2);
		
		// Iterating a map
		Set s = m.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
	}

}

class MyComp implements Comparator<String>{
@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1); // DESC
	}
}
