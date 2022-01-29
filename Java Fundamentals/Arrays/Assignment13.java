

public class Assignment13 {

	public static void main(String[] args) {
		if (args.length != 4)
			System.out.println("Please enter 4 integer numbers");
		else
			reverse(args);
	}
	private static void reverse(String[] args) {
		int size = 2;
		int[][] arr = new int[size][size];
		System.out.println("The given array is");
		
		//append  command line values in empty array
		int counter = 0;
		for (int i = 0 ; i< size; i++) {
			for (int j = 0 ; j< size; j++) {
				arr[i][j] = Integer.parseInt(args[counter]);
				counter++;
			}
		}
		//print the given array
		for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) 
                System.out.print(arr[k][l] + " ");
            System.out.print("\n");
		}
		
		//print the array in reverse order
		System.out.println("The Reverse of the array is ");
		for (int m = size-1; m >= 0; m--) {
            for (int n = size-1; n >=0; n--) 
                System.out.print(arr[m][n] + " ");
            System.out.print("\n");
		}
		
	}
}
