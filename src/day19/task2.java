package day19;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = scan.next();
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		if (firstChar >= '0' && firstChar <= '9') {

			  System.out.println(" number ");
		} else {

			  System.out.println("NOT number");
		}

	}

}
//Scanner scan = new Scanner(System.in);
//
//String str = scan.next();
//// how to check whether string start with a-z
//char firstChar = str.charAt(0);
//
////ABC System.out.println('a' > 'b');
//
//if (firstChar >= 'a' && firstChar <= 'z') {
//
//  System.out.println(" lower case letter");
//
//} else {
//
//  System.out.println("NOT a-z");