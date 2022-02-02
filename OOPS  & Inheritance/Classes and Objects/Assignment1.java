
public class Assignment1 {

	public static void main(String[] args) {
		Box b1 = new Box(2,3,4);
		System.out.println("The volume of the box is : "+b1.volume());
		
	}
}
class Box{
	double width,height,depth;
	
	// declare parameterized constructor
	public Box(double d, double e, double f){			
		width = d;
		height = e;
		depth = f;
	}
	public double volume() {
		return width*height*depth;
		
	}
}
