package consoleapprelationship;

public class Engine {
	
	private Integer pistonCount;
	
	private Double cc;
	
	
	
	
	public Engine(Integer pistonCount, Double cc) {
		super();
		this.pistonCount = pistonCount;
		this.cc = cc;
	}




	



	@Override
	public String toString() {
		return "Engine [pistonCount=" + pistonCount + ", cc=" + cc + "]";
	}








	void engineSpecifications()  {
		System.out.println("CYCLINDER FORMATION +INLINE ");
		System.out.println("POWER OUTPUT +163 bhp");
	}

}
