package day8;

import java.util.Scanner;

public class ifHelpClass2 {

	public static void main(String[] args) {
		
		 String subject1;
	     String subject2;
	     String subject3;
	     String subject4;

	     float grade1;
	     float grade2;
	     float grade3;
	     float grade4;

	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Welcome to the Grader!");
	     System.out.println("Please enter subject name number 1 and score for this subject");
	     subject1 = scan.next();
	     grade1 = scan.nextFloat();
	     
	     System.out.println("Please enter subject name number 2 and score for this subject");
	     subject2 = scan.next();
	     grade2 = scan.nextFloat();
	    
	     System.out.println("Please enter subject name number 3 and score for this subject");
	     subject3 = scan.next();
	     grade3 = scan.nextFloat();     
	     
	     System.out.println("Please enter subject name number 4 and score for this subject");
	     subject4 = scan.next();
	     grade4 = scan.nextFloat();      
	     
	     String summary = subject1 + " - " + grade1 +", "+ subject2 +" - " + grade2+ ", " + subject3 + " - " + grade3 + ", " + subject4 + " - " + grade4;
	     float average = (grade1 + grade2+ grade3+ grade4) / 4;
	     
	     System.out.println("Summary: " + summary);
	     System.out.println("Your average score is: " + average);
	     System.out.println("Thank you for using Grader!");
	     System.out.println("Goodbye!");
	    
	  }   
	

//		Scanner input = new Scanner(System.in);
//		
//		double iPhonePrice = 599.99d, iPadPrice = 899.99d, yourBudget;
//
//		int iPhoneCount ; 
//		int iPadCount ;
//		
//		System.out.println("Enter your budget: ");
//		yourBudget = input.nextDouble();
//		
//		System.out.println("Enter a tablet count: ");
//		iPadCount = input.nextInt();
//
//		System.out.println("Enter the iPhone count: ");
//	    iPhoneCount = input.nextInt();
//		
//		double total1 = iPhoneCount * iPhonePrice;
//		double total = iPadPrice * iPadCount;
//		double totalPrice = total + total1 ;
//		
//	    System.out.println("Total price for your goods : " + totalPrice );
//	    
//
//		if (totalPrice < yourBudget) {
//			
//			System.out.println("You can check out your tablet momentarily!");
//		}
//
//		else {
//			System.out.println("you need to pay extra " + (total1 - yourBudget));
//			
////		}
////
////		else {
////			System.out.println("you need to pay extra " + (total - yourBudget));
//		}

	 }	
	

	
