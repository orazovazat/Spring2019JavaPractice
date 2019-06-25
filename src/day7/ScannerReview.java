package day7;

// any class under java.lang package doesnt need an import
   
// import java.lang.String ;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name please : ");
		String name = scan.next() ;
		// String name = scan.nextLine() ;
		scan.nextLine();
		
		System.out.println("Enter your company please : ");
		// String company = scan.next();
		String company = scan.nextLine();
	
		
		System.out.println("Enter your age please : ");
		int age = scan.nextInt();
		
		System.out.println("Hello Fellow coder , your name is " + name + 
				" You work at " + company + " Your age is : " + age);	

	}

}
