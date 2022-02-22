

public class Test_Employee implements Cloneable {
	private String name;
	
	public Test_Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Test_Employee clone() {
		try {
			return (Test_Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Employee emp = new Test_Employee("Arish Ahmad");
		Test_Employee empClone = emp.clone();
		
		empClone.setName("Amir");
		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}