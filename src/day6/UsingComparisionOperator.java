package day6;

import java.util.Scanner;

public class UsingComparisionOperator {

	public static void main(String[] args) {
		

          Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter number 1 : ") ;
		int num1 = input.nextInt();
		System.out.println("Enter number 2 : ") ;
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2 ;
		
		System.out.println("is number 1 greater than number 2 ? " + isGreater ) ;
		
	
		

	}

}
