package streamapinlambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
	public static void main(String[] args) {
		
		List<String> cityList = Arrays.asList("Hyd", "Blr","Che","Del", "Mum", "Pun", "Hyderabad");
		Integer[] arr = {1,3,5,7,2,4,6,8,2,4,9};
		List<Integer> intList = Arrays.asList(arr);
		
		cityList.stream().forEach(System.out::print);
		intList.stream().forEach(System.out::print);
		
		cityList.stream().forEach(x -> System.out.println(x));
		
		List<String> cities = cityList.stream().filter(name -> name.startsWith("H"))
		                 .map(String::toUpperCase)
		                 .skip(1)
		                 .collect(Collectors.toList());
		
		System.out.println("\n"+cities);
		
		List<Integer> even = intList.stream()
				.filter(x -> x%2 == 0)
				.distinct()
				.collect(Collectors.toList());
		
	     System.out.println(even);
	}
}
