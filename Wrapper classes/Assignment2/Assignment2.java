public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		
		System.out.println("Given Number :" + num);		
		System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
		System.out.println("Octal equivalent :" + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num));

	}

}