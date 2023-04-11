package relationship;

public class Engine {
	
	private Double cc;
	
	private Integer pistonCount;

	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", pistonCount=" + pistonCount + "]";
	}

	public Engine(Double cc, Integer pistonCount) {
		super();
		this.cc = cc;
		this.pistonCount = pistonCount;
	}
	
	
	void engineDetails() {
		System.out.println("ENGINE CC "+this.cc);
		System.out.println("ENGINE PISTON COUNT "+this.pistonCount);
	}

}
