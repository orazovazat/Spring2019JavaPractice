package day5;

import java.util.Scanner;

// import scanner class to define the location


public class scannerIntro {

	public static void main(String[] args) {
		
		
		// Create a Scanner object
		Scanner userInput = new Scanner(System.in) ;

		System.out.println("Enter your name please : ");
		
		String name = userInput.next();
		
		System.out.println("You have entered :" + name);
		
		
	}

}
