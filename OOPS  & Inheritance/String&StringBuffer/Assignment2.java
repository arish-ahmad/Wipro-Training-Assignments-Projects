import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
		
		concatenation(str1,str2);
	}

	private static void concatenation(String str1, String str2) {
		StringBuffer sb2 = new StringBuffer(str2);
		String merge = null;
		if (str1.toLowerCase().charAt(str1.length()-1) == str2.toLowerCase().charAt(0)) {
			sb2.delete(0,1);
			merge = str1+sb2.toString();
			System.out.println(merge.toLowerCase());
		}
		else {
			merge = str1+" "+sb2.toString();
			System.out.println(merge.toLowerCase());
		}
			
			
			
		
	}

}

