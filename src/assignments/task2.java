package assignments;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.next();
		char firstChar = name.charAt(0);
		char lastChar = name.charAt(name.length()-1);
		
		int firstLetter = firstChar ;
		int lastLetter = lastChar ;
		
		System.out.println(firstLetter);
		System.out.println(lastLetter);
		
		///////////////////////////
		
		char char0 = '0';
		int zeroAcsiiNumber = char0 ;
		System.out.println(zeroAcsiiNumber);
		
		int x = 100;
		char myChar = (char) x ;
		System.out.println(myChar);
		
		//////////////
		
		double y = 100.99;
		char myChar2 = (char) y ;
		System.out.println(myChar2);
		

	}

}
