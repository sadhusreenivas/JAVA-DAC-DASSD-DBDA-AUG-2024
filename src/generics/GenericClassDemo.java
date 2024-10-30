package generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		MyGen<String> s1 = new MyGen();
		s1.setData("Hello");
		System.out.println(s1.getData());
		
		MyGen<Integer> i1 = new MyGen();
		i1.setData(10);
		System.out.println(i1.getData());

	}

}

// Generic class

class MyGen<T>{
	
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}