package day6;

import java.util.Scanner;

public class scannerPractice {

	public static void main(String[] args) {
	
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user questions
		System.out.println("Enter your mood today : ");
		String mood = input.nextLine();
		// save user input into String
		System.out.println("you are : " + mood );
		// ask user questions 
		System.out.println("Enter your location today : ");
		String location = input.nextLine();
		System.out.println("your location is : " + location);
		// ask user questions
		System.out.println("Enter your location2 today : ");
		// save user input into String
		String location2 = input.nextLine();
		// ask your 
		System.out.println("your location2 today : " + location2);
		
		
	
		
		
	}

}
