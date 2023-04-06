package polymorphism;

public class Calculator {

	String calculatorName;
	
	Double price;
	
	//CONSTRUCTOR OVERLOADING 
	public Calculator() {
		super();
	}
	
	
	
public Calculator(String calculatorName, Double price) {
		super();
		this.calculatorName = calculatorName;
		this.price = price;
	}



//	METHOD OVERLOADING IN BOTH STATIC AND NON STATIC METHODS
	public static void addition() {
		System.out.println("NO ARGUMENTS TO PERFORM ADDITION");
	}
	


	public static void addition (Integer input1,Integer input2) {
		
		Integer sum=input1+input2;
		System.out.println(sum);
	}
	
	public void subtraction() {
		System.out.println("NO ARGUMENTS TO PERFORM SUBTRACTION");
	}
	
	public Integer subtraction(Integer input1,Integer input2) {
		Integer result=input1-input2;
		
		return result;
	}



	public String getCalculatorName() {
		return calculatorName;
	}



	public void setCalculatorName(String calculatorName) {
		this.calculatorName = calculatorName;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Calculator [calculatorName=" + calculatorName + ", price=" + price + "]";
	}
	
	

}
