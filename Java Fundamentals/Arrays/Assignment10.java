import java.util.Arrays;

public class Assignment10 {

	public static void main(String[] args) {
		int[] arr = {2,2,2};
		evenOdd(arr);

	}
	private static void evenOdd(int[] arr) {
		int[] result =new int[arr.length];
		int counter = 0;
		for (int i =0 ; i<arr.length ; i++) {
			if (arr[i] % 2 ==0) {
				result[counter] = arr[i];
				counter++;
			}
		}
		for (int j = 0 ; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				result[counter] = arr[j];
				counter++;
		}
		}
		System.out.println(Arrays.toString(result));		
			
		}
		
	

}
