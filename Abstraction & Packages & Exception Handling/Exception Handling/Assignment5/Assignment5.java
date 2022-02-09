

public class Assignment5 {

	public static void main(String[] args){
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		try {
		personDetails(name,age);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	private static void personDetails(String name, int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		if (age < 18 || age >= 60)
			throw new InvalidAgeException("Invalid age");
		else
		System.out.println("Name: " + name + "\nAge: " + age);
		
	}
}
class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}
