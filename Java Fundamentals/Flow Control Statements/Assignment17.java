
public class Assignment17 {

	public static void main(String[] args) {
		int num  = 2132, result = 0;
		int num2 = num;
		while(num != 0) {
		      int digit = num % 10;
		      result = result * 10 + digit;
		      num /= 10;
		    }
		if (num2 == result) 
			System.out.println(result +" is a palindrome");
		else
			System.out.println(result +" is not a palindrome");

	}

}
