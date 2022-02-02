class Person{
	
	 protected String name;
	
}
class Employee extends Person{
	
	private double annual_salary;
	private int starting_year;
	private int NI_no;
	
	//Constructor
	Employee(String name, double annual_salary, int starting_year, int NI_no){
		this.name = name;
		this.annual_salary = annual_salary;
		this.starting_year = starting_year;
		this.NI_no = NI_no;
	}
	// Name Getter
	public String getName() {
	    return name;
	}
	// Salary Getter
	public double getSalary() {
		return annual_salary;
	}
	// Date Getter
	public int getDate() {
		return starting_year;
	}
	// National Insurance Number Getter
	public int getNI_no() {
		return NI_no;
	}

	// Name Setter
	public void setName(String newName) {
	    this.name = newName;
	}
	
	// Salary Setter
	public void setSalary(double new_salary) {
		this.annual_salary = new_salary;
	 }
	
}