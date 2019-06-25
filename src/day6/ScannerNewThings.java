package day6;

import java.util.Scanner;

public class ScannerNewThings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter your name today : ") ;

		String name = input.next();
		
		System.out.println("Enter your age today : ");
		
		int age = input.nextInt();
		
		System.out.println("Your name is : " + name
				+"\nYour age is: " + age);
		
		

	}

}
