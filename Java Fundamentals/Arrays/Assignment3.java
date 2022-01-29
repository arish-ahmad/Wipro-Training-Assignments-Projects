
public class Assignment3 {

	public static void main(String[] args) {
		int[] myList = {10, 91, 43, 9, 50, 9, 3, 2};
		int num = 9;
		boolean flag = false;
		
		for (int i = 0; i < myList.length; i++) {
			if (num == myList[i]) {
				System.out.println(i);
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("-1");
		}			        

	}

