package nestedclasses;

@FunctionalInterface
public interface Readable {
	 void read();
	 
	 
	 public static void main(String[] args) {
		
//		 Readable r = new Readable() {
//			@Override
//			public void read() {
//				System.out.println("Reading Java documentation");
//			}
//		};
//		r.read();
		 
		 Readable r = () ->System.out.println("Reading Java docs");
		 r.read();
	}
}
