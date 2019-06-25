package day7;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	   	     	    	    
	    
	    System.out.println("Enter Item1 and its price: ");
	    String item1 = scan.next();
	    System.out.println("Enter price for Tomateos :");
	    double Tomatoes = scan.nextDouble();
	    
	    System.out.println("Enter Item2 and its price: ");
	    String item2 = scan.next();
	    System.out.println("Enter price for Cheese :");
	    double Cheese = scan.nextDouble();

	    System.out.println("Enter Item3 and its price: ");
	    String item3 = scan.next();
	    System.out.println("Enter price for Apples :");
	    double Apples = scan.nextDouble();
	    
	    double totalPrice = scan.nextDouble();
	    System.out.println();
	    
	    String report = scan.next();
	    

	}

}
