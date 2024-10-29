package multithreading;

public class Display {

	public synchronized void printUpperCase() {

		for (int i = 65; i <= 90; i++)
			System.out.print((char) i+" ");
		
		System.out.println();
	}

	public synchronized void printLowerCase() {

		for (int i = 97; i <= 122; i++)
			System.out.print((char) i+" ");
		
		System.out.println();
	}

	public synchronized void printNumbers() {

		for (int i = 48; i <=57; i++)
			System.out.print((char) i+" ");
		
		System.out.println();
	}

}
