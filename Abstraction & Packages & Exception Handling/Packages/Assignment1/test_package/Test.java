package test_package;

public class Test {
	public static void main(String[] args) {
		Foundation fd = new Foundation();
		// var1 is not accessible  because it is private variable
		fd.var2  = 2;
		fd.var3 = 30;
		fd.var4 = 32;
		System.out.println(fd.var2);
		System.out.println(fd.var3);
		System.out.println(fd.var4);
	}
}
