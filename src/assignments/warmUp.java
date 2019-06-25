package assignments;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Math library");
		int n1 , n2 ;
		
		System.out.println("Enter 2 integer");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		
		if((n1+n2) >= 100) {
			System.out.println("You entered great numbers");
			
		}else {
			System.out.println("Your sum is less than 100");
		}
		
				
	}

}
