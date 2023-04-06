package inheritance;

abstract class Parent {

	String name;

	public Parent(String name) {
		this.name = name;
	}

	public abstract void occupation();

}

// class Parent1 {
//	 
//	 String name;
//	 
//	 public Parent1(String name) {
//		 this.name=name;
//	 }
// }

public class Child extends Parent {

	public Child() {
		super("KUMARAVELU");

	}

	public static void main(String[] args) {
		Parent parent = new Child();

		System.out.println(parent.name);
	}


	public void occupation() {
		System.out.println("SOFTWARE DEVELOPER");

	}

}
