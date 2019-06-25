package day26;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayPractice {

	public static void main(String[] args) {
		
		
		// Task2
		// get user input using scanner as string name
		// turn it into char Array and count letter a
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter a name :");
		String name = scan.next();
		
		System.out.println("Enter char to count ");
		//String userCount = scan.next();
		String userCharstr = scan.next();
		char charToLookFor = userCharstr.charAt(0);
		
		char[] nameChars = name.toCharArray();
		
		System.out.println(Arrays.toString(nameChars));
		
		int counter = 0 ;
		
		for (int i = 0; i < nameChars.length; i++) {
			
			if(nameChars[i] == charToLookFor) {
				counter++;
			}
		}
		System.out.println("The counter is : " + counter);

	}

}
