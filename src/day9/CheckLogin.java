package day9;

import java.util.Scanner;

public class CheckLogin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username : ");
		String username = scan.next();
		System.out.println("Enter your password : ");
		String password = scan.next();
        
		boolean usernameEqualToExpected = username.equals("Azat");
		// System.out.println(usernameEqualToExpected);
		
		boolean passwordEqualToExpected = password.equals("123456");
		// System.out.println(passwordEqualToExpected);

		if(usernameEqualToExpected && passwordEqualToExpected ) {
			System.out.println("login successful");
		}else{
			System.out.println("login failed");	
	
	}

 }

}