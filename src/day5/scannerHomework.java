package day5;

import java.util.Scanner;

public class scannerHomework {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter your first name :");
		String firstname = input.next() ;
		System.out.println("Your first name is : " + firstname);
		System.out.println("Enter your last name : ");
		String lastname = input.next() ;
		System.out.println("Your last name is : " + lastname);
		System.out.println("Enter your date of birth : ");
		String birthday = input.next() ;
		System.out.println("Your birth day is : " + birthday);
		System.out.println("Your full name is : " + firstname +" " + lastname);
		System.out.println("Where are you from ? ");
		String country = input.next();
		System.out.println("You are from : " + country);
		System.out.println("In which state do you live ? ");
		String state = input.next();
		System.out.println("You live in : " + state);
		System.out.println("In which city do you live ? ");
		String city = input.next();
		System.out.println("You live in : " + city);
		System.out.println("How old are you ? ");
		String age = input.next();
		System.out.println("You are " + age + " years old.");
		System.out.println("What do you do ? ");
		input.nextLine();
		String job = input.nextLine();
		System.out.println("You are  " + job);
		System.out.println("Short info about you : " + firstname +" "+ lastname +", "+
		      "DOB: " +
		       birthday + "," + " you are from " + country + ", you live in : " + city + 
		       ", " + state + " you are " + age + " years old, " + "you will be a good " 
		       + job +", good luck to you !!!");
		
	}

}
