package encapsulation;

public class Employee {
	
	private  String employeeUsername="KARTHIKEYAN";
	
	private String password="anywhereworks";
	
	private Double salary=20000.0;
	
	
	
	public Employee() {
		super();
	}



	public String getEmployeeUsername() {
		return employeeUsername;
	}



	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}




	
}
