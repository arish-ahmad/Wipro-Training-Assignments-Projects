
public class Assignment14 {

	public static void main(String[] args) {
		long sum;
		long num = 1241;
		for(sum=0; num!=0; num= num /10)  
		{        
		sum = sum + num % 10;  
		}   
		System.out.println("Sum of digits: "+sum);  
		}  

	}

