package nestedclasses;

public abstract class Person{
	
	abstract void eat();
	abstract void speak();
	
	void play() {
		System.out.println("Playing games!");
	}
	
	public static void main(String[] args) {
        Person p1 = new Person() {
			@Override
			public void eat() {
				System.out.println("Eats fruits!");
			}
			@Override
			public void speak() {
				System.out.println("English");
			}
			
			
        };
        p1.eat();
        p1.speak();
        p1.play();
	}
}