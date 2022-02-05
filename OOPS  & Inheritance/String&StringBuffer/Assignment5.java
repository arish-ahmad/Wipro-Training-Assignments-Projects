import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		StringBuffer sb1 = new StringBuffer(sc.nextLine());
		
		//delete first character
		sb1.delete(0,1 );
		//delete last character
		sb1.delete(sb1.length()-1, sb1.length() );
		
		System.out.println(sb1.toString());
	}

}
