import java.util.Scanner;

public class UserRegisteration {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter country");
		String country = sc.next();
		try {
		registerUser(username,country);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void registerUser(String username, String country) throws InvalidCountryException{
		String message = "InvalidCountryException should be thrown\nUser outside India Cannot be registered";
		if (country.equals("India") == true)
			System.out.println("registration done successfully");	
		else
			throw new InvalidCountryException(message);
	}
}
class InvalidCountryException extends Exception{
	public InvalidCountryException(String s) {
		super(s);
	}
}