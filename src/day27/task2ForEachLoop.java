package day27;

import java.util.Scanner;

public class task2ForEachLoop {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String str = scan.next();
		
		char[] charStr = str.toCharArray();
		
		for (char eachChar : charStr ) {
			
			System.out.print(eachChar+"-");
		}

		System.out.println();
		String[] splitted = str.split("");
		for(String each : splitted) {
			System.out.print(each + "-");
		}
		
	}

}
