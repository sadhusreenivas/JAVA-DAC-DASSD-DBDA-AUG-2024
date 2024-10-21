package demo;
public class Person {
 String name;
 int age;
 String city;
 static String country = "India";
 
public Person(String name, int age, String city) {
	this.name = name;
	this.age = age;
	this.city = city;
}

void getPerson() {
	System.out.println(name+" "+age+" "+city+" "+country);
}

}
