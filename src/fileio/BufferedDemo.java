package fileio;

import java.io.*;


public class BufferedDemo {
	public static void main(String[] args) throws IOException{
		
		File f = new File("C:/Users/hp/eclipse-workspace-dacdassddbda/DemoApp/src/fileio/BufferedDemo.java");
		//FileReader fr = new FileReader(f);
		//BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/hp/Desktop/files/RWDemo.java"));
		
		String line = br.readLine();
		while(line !=null) {
			
			System.out.println(line);
			bw.write(line);
			line = br.readLine();
			
		}
		
		br.close();
		bw.close();
		
		
	}

}
