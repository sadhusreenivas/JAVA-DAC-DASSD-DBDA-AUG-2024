package exceptions;
public class VotingApp {
	public void vote(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("age <18");
		else
			System.out.println("Welcome to Vote");
	}
	public static void main(String[] args) {
		VotingApp v1 = new VotingApp();
		try {
			v1.vote(19);
			v1.vote(15);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		finally {
			if(v1 != null)
				v1=null;
			System.out.println("Resource closed!");
		}
		
		System.out.println("Rest of the code follows.....");
	}

}
