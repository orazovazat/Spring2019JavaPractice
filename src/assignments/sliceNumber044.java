package assignments;

import java.util.Scanner;

public class sliceNumber044 {

	public static void main(String[] args) {
	
		/*
		 * In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

		 *
		 */
Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		//int score = scan.nextInt();
		String show = scan.next();
		
		char ch1 = show.charAt(0);
		char ch2 = show.charAt(1);
		char ch3 = show.charAt(2);
		char ch4 = show.charAt(3);
		char ch5 = show.charAt(4);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		
//		String name = scan.next();
//		// char response ;
//	    char ch1 = name.charAt(0);
//		//System.out.println(ch1);

	}

}
