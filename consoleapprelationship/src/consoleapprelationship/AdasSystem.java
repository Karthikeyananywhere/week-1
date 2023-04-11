package consoleapprelationship;

public class AdasSystem {
	

	private Double adasSystemVersion;
	
	
	
	public AdasSystem(Double adasSystemVersion) {
		super();
		this.adasSystemVersion = adasSystemVersion;
	}



	@Override
	public String toString() {
		return "AdasSystem [adasSystemVersion=" + adasSystemVersion + "]";
	}



	String adasavailability() {
		return "ADAS VERSION 3.O IS ADDED";
	}
	
	

}
