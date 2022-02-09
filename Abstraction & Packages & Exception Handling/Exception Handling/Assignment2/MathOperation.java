import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args)
	throws ArithmeticException , NumberFormatException{
		if (args.length == 5) {
			int[] arr = new int[args.length];
			double sum = 0,avg = 0 ;
			try {
				for (int i =0 ;i<args.length ; i++) {
					arr[i] = Integer.parseInt(args[i]);
				}
				for (int j = 0 ; j<args.length ; j++) {
					sum+=arr[j];
				}
				avg = sum /args.length;
				System.out.println("sum of given five numbers: " + sum);
				System.out.println("avg of given five numbers: " + avg);
			}catch (Exception ex){
				System.out.println(ex.getClass());
			}
		}else {
			System.out.println("Enter five integer in command line");
		}
	}
}

