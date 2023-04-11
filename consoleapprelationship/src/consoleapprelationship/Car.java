package consoleapprelationship;

public class Car {

	private String brandName;
	
	private String model;
	
	private Engine engine=new Engine(4, 1653.0);
	
	private AdasSystem as;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public AdasSystem getAs() {
		return as;
	}

	public void setAc(AdasSystem ac) {
		this.as = ac;
	}

	public Car(String brandName, String model) {
		super();
		this.brandName = brandName;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", model=" + model + ", engine=" + engine + ", adasSystem=" + as + "]";
	}
	
	int customizeAsSetup() {
		if (as==null) {
			as=new AdasSystem(3.0);
			return 1;
		}
		
		return 0;
	}
	
	
}
