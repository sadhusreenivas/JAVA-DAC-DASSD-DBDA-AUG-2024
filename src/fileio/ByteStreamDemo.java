package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Users/hp/Desktop/files/dassddac.txt",true);
        String str = "\nWe are not sleepy....!!";
        byte[] b = str.getBytes();
		fos.write(b);
    fos.close();
    System.out.println("File written successfully");
}
}
