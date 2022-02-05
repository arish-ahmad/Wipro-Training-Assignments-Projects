import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		ispalindrome(str);
	}

	private static void ispalindrome(String str) {
		StringBuffer sbf = new StringBuffer(str);
		sbf.reverse();
		if (str.equals(sbf.toString()))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
		
	}
		
	
}