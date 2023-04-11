package relationship;

public class Ac {
	
	
	private String acGas;
	
	
	public Ac(String acGas) {
		super();
		this.acGas = acGas;
	}

	

	@Override
	public String toString() {
		return "Ac [acGas=" + acGas + "]";
	}



	void acAvailability() {
		
	
		System.out.println("IT HAS AC SYSTEM");
		
	}

}
