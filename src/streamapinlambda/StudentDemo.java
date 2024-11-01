package streamapinlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(111,"Shiva","CSE",7.8));
		studs.add(new Student(222,"Aparna", "ECE", 8.1));
		studs.add(new Student(333,"Mamatha", "CSE", 8.2));
		studs.add(new Student(444,"Kusuma","ECE",7.2));
		studs.add(new Student(555,"Rekha", "CSE", 7.9));
		studs.add(new Student(666,"Sreeni", "IT", 8.9));
		studs.add(new Student(777, "Vasu","EEE",7.8));
		
		for (Student student : studs) {
			System.out.println(student);
		}
		
		System.out.println("*****************************");
		studs.stream().forEach(System.out::println);
         
//		// find the average GPA
//		double sum = 0;
//		int count = 0;
//		for (Student student : studs) {
//			if(student.getCourse().equals("CSE")) {
//			sum = sum + student.getGpa();
//			count++;
//			}
//		}
//		System.out.println(sum/count);
//		System.out.println(String.format("%.2f", sum/count));
//		
		System.out.println(studs.stream().filter(x -> x.getCourse().equals("CSE")).count());
		
		double avg = studs.stream()
				     .filter(x -> x.getCourse().equals("CSE"))
				     .mapToDouble(Student::getGpa)
				     .average()
				     .orElse(0.0);
		
		System.out.println(String.format("%.2f", avg));
		
		List<Student> sortedByName = studs.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		
	    System.out.println(sortedByName);
	    
	    Collections.sort(studs, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
	    
	    System.out.println(studs);
	    
	    Collections.sort(studs, (s1, s2) -> s2.getName().compareTo(s1.getName()));
	    System.out.println(studs);
	}

}
