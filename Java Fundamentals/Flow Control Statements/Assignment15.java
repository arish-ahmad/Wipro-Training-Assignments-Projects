import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Please enter an integer number:  ");  
		int num = sc.nextInt(); 
		 for(int  n =1 ; n<=num; n++) {
			 for (int j =1 ; j<=n; j++) {
				 System.out.print("*\t");
			 }
			 System.out.print("\n");
			 
		 }

	}

}
