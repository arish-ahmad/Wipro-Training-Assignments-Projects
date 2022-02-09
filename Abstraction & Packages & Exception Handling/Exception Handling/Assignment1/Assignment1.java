import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of element in the array");
			int n = sc.nextInt();
			
			System.out.println("Enter the elements in the array");
			int[] arr = new int[n];
			for (int i = 0 ; i<arr.length ; i++)
				arr[i] = sc.nextInt();
			
			System.out.println("Enter the index of the element you want to access");
			int index = sc.nextInt();
			try {
				System.out.println("The array element at index "+index +" = "+arr[index]);
				System.out.println("The array element successfully accessed");
				}
			catch (ArrayIndexOutOfBoundsException nf) {
					System.out.println(nf.getClass());
			}
		}
		catch (InputMismatchException e){
			System.out.println(e);
		}
	}
}