public class Assignment2 {

	public static void main(String[] args) {
		int[] myList = {10, 9, 43, 50, 9, 3, 2};
		int max = myList[0], min = myList[0];
        
 
        for (int i = 1; i < myList.length; i++)
            if (myList[i] > max)
                max = myList[i];
        for (int i = 1; i < myList.length; i++)
            if (myList[i] < min)
                min = myList[i];
        System.out.println("Maximum : "+max + "\nMinimum : "+min);
		

	}

}
