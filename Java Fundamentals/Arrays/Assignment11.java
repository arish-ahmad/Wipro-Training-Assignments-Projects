
public class Assignment11 {

	public static void main(String[] args) {
		int[] arr = {1,4,1,4};
		only14(arr);

	}

	private static void only14(int[] arr) {
		boolean flag = true;
		for (int i = 0 ; i< arr.length ; i++) {
			if (arr[i] != 1 && arr[i] != 4)
				flag = false;
		}
		System.out.println(flag);
		
		
	}

}
