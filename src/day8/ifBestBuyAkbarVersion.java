package day8;

import java.util.Scanner;

public class ifBestBuyAkbarVersion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double iPhonePrice = 599.99, iPadPrice = 899.99, yourBudget;
		int phoneCount, tabletCount;

		System.out.println("Enter iphone count: ");
		phoneCount = input.nextInt();
		System.out.println("Enter iPad count: ");
		tabletCount = input.nextInt();

		System.out.println("Enter your budget: ");
		yourBudget = input.nextDouble();

		double total = iPhonePrice * phoneCount + iPadPrice * tabletCount;

		/// commad + shift + F on mac 
		/// ctr + shift + F on windows 

		System.out.println(total);

		if (total > yourBudget) {

			System.out.println("OUT OF BUDGET");
			System.out.println("You need extra "+  (total-yourBudget)  );

		} else {

			System.out.println("i will take it !!");

		}


	}

}
