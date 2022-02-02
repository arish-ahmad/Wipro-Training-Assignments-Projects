
public class Assignment1 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		
		System.out.println(bird.eat());
		System.out.println(bird.sleep());
		System.out.println(bird.fly());
		
	}
}

class Animal{
	
	public String eat() {
		return "Eat method called";
		
	}
	public String sleep() {
		return "sleep method called";
		
	}
}
class Bird extends Animal{
	
	public String fly() {
		return "fly method called";
		
	}
}