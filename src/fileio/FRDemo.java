package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FRDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/Users/hp/Desktop/files/sample.txt");

		int x;
		
		while((x = fr.read()) != -1) {
			System.out.print((char)x);
		}
		
		fr.close();
	}

}
