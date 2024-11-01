package streamapinlambda;

	import java.util.Set;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class Test {
	    public static void main(String[] args) {
	    	
	        Set<String> result = Stream.of("John", "George", "Joe", "Sue", "James")
	            .filter(name -> name.startsWith("J")) // Filter names starting with "J"
	            .map(String::toUpperCase)             // Convert names to uppercase
	            .skip(1)                               // Skip one name
	            .collect(Collectors.toSet());          // Collect into a Set

	        System.out.println(result);
	    }
	}

