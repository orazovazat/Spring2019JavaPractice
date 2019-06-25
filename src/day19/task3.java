package day19;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
        
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		System.out.println("Enter your name:");
		  name = scan.nextLine() ;
		int count = name.length() ;
		while( count>0 ) {
			
			 count-- ;
			 System.out.print(  name.charAt(count) + "-");
//			System.out.print(  name.charAt(count-1) + "-");
//		  count-- ;
		}
	}

}


