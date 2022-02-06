import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];
		Random random = new Random();   
		for (int i = 0; i < 10; i++) {
    		int randomNum = random.nextInt(0,5);
    		switch(randomNum) {
    		case 0:
    			continue;
    		case 1:
    			compartments[i] = new Luggage();
    			break;
    		case 2 :
    			compartments[i] = new Ladies();
    			break;
    		case 3:
    			compartments[i] = new General();
    			break;
    		case 4:
    			compartments[i] = new FirstClass();
    			break;
    		}
    		compartments[i].notice();
    	}
	}
		
}
