package collections.lists;
import java.util.*;

public class ListApp {
	public static void main(String[] args) {
		
     String[] cities = {"Hyd", "Blr", "Che", "Pune", "Mumbai", "Noida"};
     
     for(String s:cities)
    	 System.out.print(s+" ");
     System.out.println();
     
     List<String>  cityList = Arrays.asList(cities);
     System.out.println(cityList);
     
     System.out.println();
     Collections.sort(cityList);
     System.out.println(cityList);
     
     System.out.println();
     //Collections.reverse(cityList);
     //System.out.println(cityList);
     
     System.out.println();
    // Collections.sort(cityList, new MyComp()); // DESC
//     Collections.sort(cityList, new Comparator<String>() {
//    	 @Override
//    		public int compare(String s1, String s2) {
//    			// TODO Auto-generated method stub
//    			return s2.compareTo(s1); // DESC
//    	 }
//     });
     // sorting in DESC
     Collections.sort(cityList, (s1, s2) -> s2.compareTo(s1));
     
     System.out.println(cityList);
     
	}
}

//class MyComp implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2) {
//		// TODO Auto-generated method stub
//		return s2.compareTo(s1); // DESC
//	}
//}
