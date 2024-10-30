package collections.sets;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet(new MyComp());
		
		ts.add("DBDA");
		ts.add("DASSD");
		ts.add("DAC");
		ts.add("DESD");
		ts.add("DVLSI");
		ts.add("DAC");
		
		System.out.println(ts); // NSO => ASC
	}
}

class MyComp implements Comparator<String>{
@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1); // DESC
	}
}