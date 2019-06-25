package day60;

import day58.Dog;

// -->>Director

public class Director extends Manager{
	
	int stockOption = 50000 ;

	
	public static void main(String[] args) {
		
		Director e1 = new Director();
		//System.out.println(e1.);
		
		Employee e = new Director();
		System.out.println(e.salary);
		
		// how to access Director's stock option
		// in order to acsess 
		
		Director d = (Director) e;
		System.out.println(d.salary);
		System.out.println(d.budget);
		System.out.println(d.stockOption);
		
		Object o = new Dog();
		Dog puppy = (Dog)o ;
		puppy.makeNoise();
		
		
	}
}
