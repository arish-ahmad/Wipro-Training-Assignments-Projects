import java.util.Arrays;

public class Assignment12 {

	public static void main(String[] args) {
		int[] arr1 = {7,7,7};
		int[] arr2 = {3,8,0};
		middleway(arr1,arr2);

	}

	private static void middleway(int[] arr1, int[] arr2) {
		int[] result = new int[2];
		result[0] = arr1[1];
		result[1] = arr2[1];
		System.out.println(Arrays.toString(result));
		
	}

}
