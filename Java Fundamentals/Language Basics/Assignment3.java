public class Assignment3 {

	public static void main(String[] args) {
		String result = String.format("The sum of %1$s and %2$s is %3$s",args[0],args[1],Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(result);

	}

}
