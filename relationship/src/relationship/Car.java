package relationship;

public class Car {
	
	private String carName;
	
	private Double price;
	
	private Engine engine=new Engine(1956.0,4);
	
	private Ac ac=null;;
	
	
	public Car(String carName, Double price) {
		super();
		this.carName = carName;
		this.price = price;
		
	}
	
	
	Ac acAvailability () {
		if (ac==null) {
			ac=new Ac("R1234YF");
			return ac;
			
		}
       return null;		
	}



	@Override
	public String toString() {
		return "Car [carName=" + carName + ", price=" + price + ", engine=" + engine + ", ac=" + ac + "]";
	}

	



	public static void main(String[] args)  {
		Car car=new Car("TATA HARRIER",2600000.0);
		Car car1=new Car("TATA SAFARI",2500000.0);
		
		
		
		car.engine.engineDetails();
		
		car.acAvailability();
		
		car.ac.acAvailability();
		 
		System.out.println(car);
		
		System.out.println(car.hashCode());
		
		System.out.println(car1);
		System.out.println(car1.hashCode());
		
	
		
		
		
		
	}

}
