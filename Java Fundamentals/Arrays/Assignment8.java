
public class Assignment8 {

	public static void main(String[] args) {
		int[] arr = {1,6,4,7,9};
		int sum = 0,i=0;
		boolean flag =false;
		while (i < arr.length ) {
			if (arr[i] !=6 && !flag) {
				sum+=arr[i];
			}
			else if (arr[i] == 6)
				flag = true;
			else if (arr[i]==7)
				flag = false;
			i++;	
		}
		if (arr[arr.length-1] == 6)
			sum+=6;
		System.out.println(sum);

	}

}
