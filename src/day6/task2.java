package day6;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in) ;
		
        System.out.println("Enter your birth year as a number ;");
        
        int dob = input.nextInt();
        
        System.out.println("your date of birth year is : " + dob);
        
        int today = 2019 ;
        
		System.out.println("you are " + (today - dob) + " years old." );
		
		// System.out.println("Enter double value : ");
		// byte b1 = input.nextByte();
		// short b1 = input.nextShort();
		// long b1 = input.nextLong();
		// float b1 = input.nextFloat();
	    // double d1 = input.nextDouble();
		// System.out.println("You have entered float value : " + b1);
		// System.out.println("You have entered double value : " + d1);

//		System.out.println("Are you hungry ? ");
//		boolean isHungry = input.nextBoolean();
//		System.out.println("I am hungry : " + isHungry );
		
		
		
	}

}
