package day8;

import java.util.Scanner;

public class IfBestBuyShopping {

	public static void main(String[] args) {

		/*
		 * if(/// put some boolean expression in here) { do some action if its true }
		 * else { do something else if its false } // HackerRank , CodingBat , LeetCode
		 * and so on TASK 2 BestBuy store : declare double variables for price of iphone
		 * , Ipad , yourBudget assign value for iPhone as 599.99, ipad 899.99 declare 2
		 * more int variables for phoneCount and tabletCount ask user to enter the
		 * budget ask user to enter quantity you want to buy calculate the total price
		 *
		 * write a conditional statement to check whether total price is more than your
		 * budget if it's more print , out of budget else print I Will take it !!
		 */

		Scanner input = new Scanner(System.in);

		double iphone = 599.99d;
		double iPad = 899.99d;
		double yourBudget;

		int iphoneCount;
		int iPadCount;

		System.out.println("Enter your budget : ");
		yourBudget = input.nextDouble();

		System.out.println("Enter how many iphone you want : ");
		iphoneCount = input.nextInt();

		System.out.println("Enter how many iPad you want : ");
		iPadCount = input.nextInt();

		double totalPrice = (iphone * iphoneCount) + (iPad * iPadCount);

		System.out.println("Total price for goods that you want to buy is : " 
		+ totalPrice);

		if(totalPrice < yourBudget) {
			System.out.println("You will be able to buy all the goods what you wanted. ");
		}else {
			System.out.println("Sorry, total price for your goods is over your budget. ");
		}
		
//		Scanner input=new Scanner(System.in);
//		double ipadPrice=599.99d;
//		double iphonePrice=899.99d;
//		System.out.println("Please enter your budget: ");
//		double budget=input.nextDouble();
//		System.out.println("Please enter how many phones whoukd you lke to buy: ");
//		int phoneCount=input.nextInt();
//		System.out.println("Please enter how many ipads whoukd you lke to buy: ");
//		int ipadCount=input.nextInt();
//		double totalPrice=ipadPrice*ipadCount+iphonePrice*phoneCount;
//		
//		if(totalPrice>budget) {System.out.println("Great");
//		}else {
//			System.out.println("I am sorry");

//		double iphone, ipad, yourBudget;
//		ipad=899.99;
//		iphone=599.99;
//					
//		Scanner input =new Scanner(System.in);
//		System.out.println("Please put your budget: ");
//		 yourBudget=input.nextDouble();
//		
//		System.out.println("Please put the number of ipad you want: ");
//		int ipadCount=input.nextInt();
//		System.out.println("Please put the number of iphone you want: ");
//		int iphoneCount=input.nextInt();
//		
//		double totalPrice=ipad*ipadCount+iphone*iphoneCount;
//		
//		if (totalPrice>yourBudget) {
//			System.out.println("Buy all items.");
//			
//		
//		}else {
//			System.out.println("Sorry you are below budget.Buy all items.");
//		
//		}

	}

}
