import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("Input.txt");
		FileOutputStream f2 = new FileOutputStream("Output.txt",true);
		int i;
		do {
			i = f1.read();
			f2.write((char)i);
				
			//System.out.print((char)i);
			
		}while(i!=-1);
		System.out.println("File copied successfully");
		f1.close();
		f2.close();
	}

}