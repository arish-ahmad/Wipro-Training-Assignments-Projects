import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter the integer : ");
		int num = sc.nextInt();
		
		repetitions(str,num);
		
	}
   
	private static void repetitions(String str, int num) {
		StringBuffer sb1 = new StringBuffer(str);
		sb1.delete(0,str.length()-num);
		System.out.println(sb1.toString());
		String result = "";
		
		for (int i = 0 ; i < num ; i++)
			result +=sb1.toString();
		
		System.out.println(result);
		
	}
}


