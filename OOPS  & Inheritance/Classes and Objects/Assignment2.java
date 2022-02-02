public class Assignment2 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int powInt = (int)calc.powInt(2, 3);
		double powDouble = calc.powDouble(1.5, 1.5);

		System.out.println("Power in integer format : "+powInt+"\nPower in double format  : "+powDouble);
		
		
	}

}
class Calculator{
	
	public double powInt(int num1,int num2) {
		return Math.pow(num1, num2);
		
	}
	public double powDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
