package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FRDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/Users/hp/eclipse-workspace-dacdassddbda/DemoApp/src/fileio/FRDemo.java");
        FileWriter fw = new FileWriter("C:/Users/hp/Desktop/files/asdf.txt");
		
		int x;
		
		int cc =0;
		int wc = 0;
		int lc = 0;
		
		while((x = fr.read()) != -1) {
			System.out.print((char)x);
			fw.write(x);
			
			cc++;
			if(x == '\n')
				lc++;
			
			if(x ==' ')
				wc++;
			
		}
		
		fr.close();
		fw.close();
		
		System.out.println("\n"+cc+" "+(wc+lc)+" "+(lc+1));
	}

}