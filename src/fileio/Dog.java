package fileio;

import java.io.Serializable;

public class Dog implements Serializable {

	private String name;
	private int age;
	private String breed;
	private transient String confidentialInfo;
	
	public Dog(String name, int age, String breed, String confidentialInfo) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.confidentialInfo = confidentialInfo;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", confidentialInfo=" + confidentialInfo
				+ "]";
	}
	
}
