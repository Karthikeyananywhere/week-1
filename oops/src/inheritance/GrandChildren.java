package inheritance;


class GrandFather {
	
	public void eat() {
		System.out.println("GRANDFATHER IS EATING");
	}
	
}

class Father extends GrandFather {
	
	public void eat() {
		System.out.println("FATHER IS EATING");
	}
}

public class GrandChildren extends Father {

	public void eat() {
		System.out.println("GRANDCHILDREN IS EATING");
	}
	
	
	public static void main(String[] args) {
	
		GrandFather gf=new GrandChildren();
		
		gf.eat();
		
	}
}
