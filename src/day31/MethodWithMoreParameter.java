package day31;

import java.util.Scanner;

public class MethodWithMoreParameter {

	public static void main(String[] args) {
		
		
		
		login("Azat", "abc123", true);
		
		login("Orazov", "h300", false);
		
		String user = "abc";
		String pass = "efg";
		boolean isChecked = false ;
		
		login(user, pass, isChecked);
		
		

	}
	
	
	
	public static void login(String username, String password, boolean rememberMe) {
		
		System.out.println("You entered username : " + username);
		System.out.println("You entered password : " + password);
		
		if(rememberMe == true) {
			System.out.println("You checked rememberMe checkbox");
		}else {
			System.out.println("You did not check rememberMe checkbox");
		}
		
	}

}
