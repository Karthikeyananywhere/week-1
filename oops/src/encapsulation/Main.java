package encapsulation;

public class Main {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		
		System.out.println(emp.getEmployeeUsername()); 
		
		System.out.println(emp.getPassword());

		System.out.println(emp.getSalary());
	
		System.out.println("**************************** ");
		emp.setEmployeeUsername("VIJAYAPRASADH");
		emp.setPassword("PRASADH");
		emp.setSalary(20000.0);

		System.out.println(emp.getEmployeeUsername()); 
		
		System.out.println(emp.getPassword());

		System.out.println(emp.getSalary());
	
		
	}

}
