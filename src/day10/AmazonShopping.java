package day10;

import java.util.Scanner;

public class AmazonShopping {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Amazon");
		
		System.out.println("Enter your price for your card: ");
		double price = scan.nextDouble();
		
		System.out.println("Are you a Prime member ?"); 
		boolean isPrimeMember = scan.nextBoolean();
		
		
	// 	if(isPrimeMember == true) {
			if(isPrimeMember) {	
			System.out.println("You got a free shipping, you need to pay: " + price+"$");
			
		}else if(price > 35) {
			
			System.out.println("You still got a free shipping, you need to pay: "+ price+"$");
			
		}else {
			System.out.println("You need to pay extra 5$ for shipping, total you need to pay: "
		+(price+5)+"$");
		}
		
		
	}

}
