package day21;

import java.util.Scanner;

public class warmUpTask1 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * WARM UP

ASK USER TWO NUMBER

KEEP ASKING UNTIL THE SUM OF
TWO NUMBERS ARE MORE THAN 100

PTINT THE END AFTER THE LOOP

OPTIONAL : 3 ATTEMPS ONLY
		 */
		
		
		
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter 2 number:");
//		int x = scan.nextInt();
//		int y = scan.nextInt();
		
		int x = 0 ;
		int y = 0 ;
		int tryCount = 0;
		
		do {
			
			System.out.println("Enter num1");
			 x = scan.nextInt();
			System.out.println("Enter num2");
			 y = scan.nextInt();
			 
			 ++tryCount ;
			 if(tryCount == 3) {
				 System.out.println("You lost");
				 break;
			 }
			 
		} while (x+y <= 100);
		
		System.out.println("The End");
		
		
//		while() {
//			
//		    total = total + x + y ;
//		    x++ ;
//		    y++ ;
////			if(total == 100) {
////				break;	
////			}
//			
//		}
//
//		System.out.println(total);
	}

}
