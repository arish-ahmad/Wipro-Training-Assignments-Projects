import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		firsthalf(str);
    
	}

	private static void firsthalf(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		 if (sb1.length() % 2 == 0 ) {
			 sb1.delete(sb1.length()/2, sb1.length());
			 System.out.println(sb1.toString());
		 }
		 else
			 System.out.println("null");
		
	}

}
