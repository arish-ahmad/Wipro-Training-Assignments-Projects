import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(str);
		if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x' ) {
			sb1.delete(0, 1);
			sb1.delete(sb1.length()-1,sb1.length());
			System.out.println(sb1.toString());
		}
		else
			System.out.println(str);
			
	}	
		
}
