public class Assignment1 {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Mango apple = new Mango();
		Orange orange = new Orange();
		fruit.eat();
		apple.eat();
		orange.eat();	
	}
}
class Fruit {
	String name, taste, size;
	
	void eat() {
		System.out.println("Fruits...");
	}
}

class Mango extends Fruit {
	
	Mango() {
		name = "Mango";
		taste = "sweet";
		size = "medium";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste"+" and "+size +" in size");
	}
}

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "Tart";
		size = "small";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste"+" and "+size +" in size");
	}	
}

