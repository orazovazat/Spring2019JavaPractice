package day10;

import java.util.Scanner;

public class conditionalIfOnly {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Okta to Slack");
		System.out.println("Enter the length of your name");
		int lengthOfName = scan.nextInt();
		
		if(lengthOfName > 22) {
			System.out.println("Slack can not take more than 22 char");
			System.out.println("User name has been adjusted");
			
		}
		
		System.out.println("Successfully added user");

	}

}
