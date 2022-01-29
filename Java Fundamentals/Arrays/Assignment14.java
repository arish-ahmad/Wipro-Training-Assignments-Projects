
public class Assignment14 {

	public static void main(String[] args) {
		if (args.length != 9)
			System.out.println("Please enter 9 integer numbers");
		else
			Biggest(args);

	}
	private static void Biggest(String[] args) {
		int size = 3;
		int[][] arr = new int[size][size];
		
		//append  command line values in empty array
		int counter = 0;
		for (int i = 0 ; i< size; i++) {
			for (int j = 0 ; j< size; j++) {
				arr[i][j] = Integer.parseInt(args[counter]);
				counter++;
			}
		}
		//print the given array
		System.out.println("The given array is");
		for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) 
                System.out.print(arr[k][l] + " ");
            System.out.print("\n");
		}
		//finding maximum element in args
		int max = Integer.parseInt(args[0]);
		for (int c = 0 ; c < args.length ;c++) {
			if (max < Integer.parseInt(args[c]))
				max = Integer.parseInt(args[c]);
		}
		System.out.println("The Biggest number in the given array is "+max);
	}

}
