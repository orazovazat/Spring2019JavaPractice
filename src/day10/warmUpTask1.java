package day10;

import java.util.Scanner;

public class warmUpTask1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Banking App");
		
		long accNumber = 123456L;
		String userPassword = "abcd" ;
		
		
		System.out.println("Enter your account Number: ");
		long account = scan.nextLong();
		System.out.println("Enter your password : ");
	    String password = scan.next();
	    
	    // boolean acc = accNumber == acc ;
	    // boolean expPassword = password.equals("Azat");
		
		if(accNumber == account && userPassword.contentEquals(password)) {
			System.out.println("Password match");
			
		}else {
			System.out.println("Login failed");
		}
		

	}

}
