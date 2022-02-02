
public class TestEmloyee {
	public static void main(String[] args) {
		
		Employee p1 =new Employee(
				"Arish Ahmad",    //Employee name
				350000,           // Annual Salary
				2022,     		  // Staring Year
				1234567);         // National Insurance Number
		System.out.println("Employee name : "+p1.getName());
		System.out.println("Employee salary : "+p1.getSalary());
		System.out.println("Employee Starting year : "+p1.getDate());
		System.out.println("Employee National insurance number : "+p1.getNI_no());
		
	}
}
