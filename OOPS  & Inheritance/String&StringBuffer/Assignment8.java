import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String[] stars = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		for (String x : stars) 
			sb.append(x);
		System.out.println(sb);
		
	}

}
