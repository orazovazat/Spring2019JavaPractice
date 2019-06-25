package day19;

import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		//int y = 100;
		int number = scan.nextInt();
		int x = 1 ;

		do {
			System.out.print(x + ",");
			x++;
			
		} while (x <= number );
		
		do {
			System.out.println();
			System.out.print(x + ",");
			x--;
			
		} while (x >= 10 );
		
	}

}
