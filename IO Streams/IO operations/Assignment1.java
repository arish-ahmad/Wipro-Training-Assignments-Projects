import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename  = sc.next();
		FileInputStream f1 = new FileInputStream(filename);
		System.out.println("Enter the characte to be counted");
		String charfind = sc.next();
		int i,count =0;
		
		do {
			i = f1.read();
			if(String.valueOf((char)i ).equalsIgnoreCase(charfind))
				count++;
			//System.out.print((char)i);
			
		}while(i!=-1);
		f1.close();
		System.out.println("File "+filename +" has "+count+" instances of letter "+charfind);
		
	}
}