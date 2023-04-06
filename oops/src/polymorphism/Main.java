package polymorphism;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Calculator.addition();
		
		Calculator.addition(1,2);
 
		Calculator calci=new Calculator();
		
		calci.subtraction();
		
		Integer subtraction = calci.subtraction(9, 7); //HARDCODING
		
		System.out.println("HARDCODED INPUTS RESULTS" + subtraction );
		
		System.out.println("GETTING THE VALUES FROM USER");
		
		Integer subtraction2 = calci.subtraction(scanner.nextInt(),scanner.nextInt()); //GETTING INPUTS FROM USER
		
		System.out.println("Output for the inputs got from user"+subtraction2);
		
}

}
