package collections.lists;
import java.util.*;
public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		
		s.add(123);
		s.push(321);
		s.add(123);
		s.add(null);
		s.push(30);
		System.out.println(s);
		System.out.println(s.pop()); //30
		s.push(40);
		System.out.println(s.peek()); // 40
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
