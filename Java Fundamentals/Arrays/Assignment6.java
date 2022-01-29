import java.util.Arrays;

public class Assignment6 {

	public static void main(String[] args) {
		int[] arr = {0 ,111 ,2 ,3 ,4 ,5 ,6 ,77 ,8 ,9 ,10};

		// performing insertion sort
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
	}

}
