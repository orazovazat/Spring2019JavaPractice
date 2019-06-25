package day20;

import java.util.Scanner;

public class loopPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = scan.next();
		int x = 0 ;
		
		do {
			
			System.out.print(name.charAt(x) + " ");
			x++ ;
			
		} while ( x < name.length());
//      } while ( x <= name.length()-1);  it works too

	}

}
