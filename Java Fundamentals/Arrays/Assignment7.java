import java.util.Arrays;

public class Assignment7 {

	public static void main(String[] args) {
		int[] arr = {12,34,12,45,67,89}; 
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
        //finding the size of resulting array
        int size = 1;
		for(int k = 0 ; k < n-1;k++) {
			if(arr[k] !=arr[k+1]) 
				size+=1;	
			}
		//create empty array used to store result
		int result[] = new int[size];
		//remove duplicate elements
		int counter = 0,i=0;
		while (i < n-1 ) { 
			if(arr[i] != arr[i+1]) {
				result[counter] = arr[i];
				counter++;
			}
			i++;	
		}
		result[counter] = arr[n-1];  
		System.out.println(Arrays.toString(result));
		
	}	
		
}
