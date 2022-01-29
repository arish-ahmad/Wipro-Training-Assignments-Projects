import java.util.Arrays;

public class Assignment9 {

	public static void main(String[] args) {
		int[] arr = {1,99,10};
		withoutTen(arr);

	}

	private static void withoutTen(int[] arr) {
		int[] result = new int[arr.length];
		int counter =0;
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] != 10) {
				result[counter] = arr[i];
			counter++;
			}
			
		}
		System.out.println(Arrays.toString(result));
	}

	

}
