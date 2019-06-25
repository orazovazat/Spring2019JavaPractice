package day8;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("What is area code");
//		int areaCode = input.nextInt();
//		System.out.println("What is local number");
//		int localNumber = input.nextInt();
//		
//
//		
//		System.out.println("Calling number " + "(" + areaCode + ")" + "-" + 
//		localNumber);

		
		Scanner input = new Scanner(System.in);
		
		int areaCode = input.nextInt();
		int localNumber = input.nextInt();
		
		String phoneNumber = "(" + areaCode + ")-" + localNumber ;
		
		System.out.println("Calling number" + phoneNumber);
		
		
		
		

	}

}
