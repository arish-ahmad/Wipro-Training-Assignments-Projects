
public class Assignment1 {

	public static void main(String[] args) {
		int[] myList = {1, 9, 4, 5, 5, 9, 3, 3, 2};
		double sum =0,average;
		
		for(int i=0;i<myList.length;i++) {
			sum += myList[i];
		}
		average = sum / myList.length;
		System.out.println("Sum of the elements : "+sum);
		System.out.println("Average of the elements : "+average);
		
	}

}
