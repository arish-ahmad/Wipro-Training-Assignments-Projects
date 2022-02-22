

public class Assignment1 {

	public static void main(String[] args) {
		Integer num1 = new Integer(2);
		Double  num2 = new Double(2.5);
		Long    num3 = new Long(1000);
		Short   num4 = new Short((short) 3);
		Byte    bt = new Byte((byte) 3);
		Float   ft = new Float(2.5);
		
		System.out.println("Integer Range\n"+"min: "+num1.MIN_VALUE+"\n"+"max: "+num1.MAX_VALUE);
		System.out.println("Double Range\n"+"min: "+num2.MIN_VALUE+"\n"+"max: "+num2.MAX_VALUE);
		System.out.println("Long Range\n"+"min: "+num3.MIN_VALUE+"\n"+"max: "+num3.MAX_VALUE);
		System.out.println("Short Range\n"+"min: "+num4.MIN_VALUE+"\n"+"max: "+num4.MAX_VALUE);
		System.out.println("Byte Range\n"+"min: "+bt.MIN_VALUE+"\n"+"max: "+bt.MAX_VALUE);
		System.out.println("Float Range\n"+"min: "+ft.MIN_VALUE+"\n"+"max: "+ft.MAX_VALUE);
	}
}