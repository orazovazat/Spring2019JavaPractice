package day20;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scan.nextInt();
		
		int x = 1 ;
		int totalSum = 0 ;
		
		do {
			
			totalSum = totalSum + x ;
			System.out.print(totalSum);
			x++;
				
			if(totalSum > 40) 
				break;
				
		} while (x <= number);
		
		
		
		
	}

}
