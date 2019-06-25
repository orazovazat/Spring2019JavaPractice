package day9;

import java.util.Scanner;

public class askName {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please : ");
	
		String name = scan.next();
        
		boolean nameEqualToExpected = name.equals("Azat");
		System.out.println(nameEqualToExpected);
		
		// if(name.equals("Azat"))
		if(nameEqualToExpected) {
			System.out.println("That's Azat");
		}else {
			System.out.println("NOT HIM !!!");
			
		}
		
		
	

	}

}
