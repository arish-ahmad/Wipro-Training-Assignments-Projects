import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the first string : ");
		str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		str2 = sc.nextLine();
		
		combination(str1,str2);
	}
	private static void combination(String str1, String str2) {
		String bigStr = str1.length() > str2.length() ? str1 : str2;
		String smallStr = str1.length() < str2.length() ? str1 : str2;
		String outStr = "";

		for (int i = 0; i < smallStr.length(); i++) {
			outStr += str1.charAt(i);
			outStr += str2.charAt(i);
		}
		//Concatenate characters which're left of bigString
		outStr += bigStr.substring(smallStr.length(), bigStr.length());
		
		System.out.println(outStr);
	}
}
