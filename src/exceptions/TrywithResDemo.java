package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResDemo {
	
	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			System.out.println("Enter name");
			String name = br.readLine();
			
			System.out.println("Hello: "+name);
		} // AutoCloseable resources wl get closeed automatically
		
//		finally {  no longer required
//			
//		}
	}

}
