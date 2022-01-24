
public class Assignment16 {

	public static void main(String[] args) {
		int num  = 214, result = 0;
		
		while(num != 0) {
		      int digit = num % 10;
		      result = result * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + result);

	}

}
