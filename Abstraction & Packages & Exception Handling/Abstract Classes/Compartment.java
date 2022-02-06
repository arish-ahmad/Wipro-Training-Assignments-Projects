
public abstract class Compartment {

	abstract void notice();
	
}

class FirstClass extends Compartment{

	@Override
	void notice() {
		System.out.println("This is FirstClass Compartment");	
	}
	
}
class Ladies extends Compartment{

	@Override
	void notice() {
		System.out.println("This is Ladies Compartment");	
	}
	
}
class General extends Compartment{

	@Override
	void notice() {
		System.out.println("This is General Compartment");	
	}
	
}
class Luggage extends Compartment{

	@Override
	void notice() {
		System.out.println("This is Luggage Compartment");	
	}
	
}