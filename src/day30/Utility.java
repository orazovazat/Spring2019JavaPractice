package day30;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {
		
	
		 PrintUsresName() ; 
		 PrintUsresName() ; 
		

	}

	
	public static void PrintUsresName() {
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter your name please");
		
		String name = scan.next();
		
		System.out.println("You entered : " + name);
		
	}
	

	
	
	
}
