package day27;

import java.util.Scanner;

public class task3ForEachLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence");
		
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		String[] words = sentence.split(" ");
		
		for (String eachWord : words) {
			System.out.println(eachWord);
			
		}
		
		
		
		

	}

}
