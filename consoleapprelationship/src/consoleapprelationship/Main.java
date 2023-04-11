package consoleapprelationship;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		 Boolean input=true;;
		
		Car car=new Car("TATA","HARRIER");
		
		do {
			System.out.println("SELECT THE OPTIONS THAT U WANT TO DISPLAY");
			System.out.println("1.CAR SPECIFICATIONS\n2.ENGINE SPECIFICATIONS\n3.ADAS AVAILABILITY\n4.CUSTOMIZE ADAS SETUP\n5.EXIT");
			Scanner scanner=new Scanner (System.in);
			
			Integer userInput=scanner.nextInt();
			
			
			
			switch (userInput) {
			
			case 1:{
				if (car!=null) {
					System.out.println(car);
				} else {
	                 System.out.println("PLS SELECT THE CAR FIRST");
				}
				
			break;}
			
			case 2:{
				if (car.getEngine()!=null) {
					System.out.println(car.getEngine());
				}
				else {
					System.out.println("SORRY WE CANT DISCLOSE THE ENGINE SPEC");
				}
				
				break;}
			
			case 3:{
				
				if (car.getAs()!=null) {
					System.out.println(car.getAs().adasavailability());
				} else {
	                System.out.println("SORRY THIS CAR DON'T  HAVE THAT FEATURE");
				}
				
				break;}
			case 4:{
				if (car.getAs()==null) {
			          int customizeAsSetup = car.customizeAsSetup();				
					if (customizeAsSetup>0) {
						System.out.println(car.getAs().adasavailability());
					}
				
				} else {
	               System.out.println("WE CAN NOT CUSTOMIZE ADAS SINCE IT IS ALREADT PRESENT");
				}
				
				break;}
			
			case 5:{
				input =false;
				break;
			}

			}
			
		}while(input);
		
	
			
	
		
				
		
	}

}

