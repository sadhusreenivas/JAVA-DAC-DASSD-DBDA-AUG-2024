package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FWDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:/Users/hp/Desktop/files/sample.txt");
		fw.write("Java is Object Oriented\nJava is robust\nJava is dynamic");
		fw.write("\nJava developed by James Gosling");
		
		fw.close();
		System.out.println("File Written successfully");
	}

}
