import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String : ");
	 String str = sc.nextLine();
	 
	 ncopies(str);
	 
		
	}

	private static void ncopies(String str) {
		String result = "";
		StringBuffer sb1 = new StringBuffer(str);
		int strlength = sb1.length();
		sb1.delete(2, strlength);
		//System.out.println(sb1.toString());
		 
		for (int i = 0 ; i < strlength ; i++)
			result +=sb1.toString();
		
		System.out.println(result);
	}
}
