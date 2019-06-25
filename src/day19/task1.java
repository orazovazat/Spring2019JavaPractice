package day19;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a sentence:");
//		String sentence = scan.nextLine();
		
		String sentence = "";
		//while(sentence.contains("java") == false ) { ---> it works
		//while(!sentence.contains("java") ) { ---> it works 
		while(!sentence.toLowerCase().contains("java") ) {  // ---> it works too
			
			System.out.println("Enter a sentence:");
			 sentence = scan.nextLine();
		}
		
		System.out.println("END");
		

	}

}
