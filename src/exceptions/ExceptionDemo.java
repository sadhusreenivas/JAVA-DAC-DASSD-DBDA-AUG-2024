package exceptions;

import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		String name = br.readLine(); // reads a line of text
		System.out.println("Your Good Name: "+name);
		
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
		
		

	}

}
