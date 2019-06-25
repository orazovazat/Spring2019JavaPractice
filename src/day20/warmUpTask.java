package day20;

import java.util.Scanner;

public class warmUpTask {

	public static void main(String[] args) {
		
		String name = "";
		String pass = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username : ");
		name = scan.next();
		System.out.println("Enter Pasword : ");
		pass = scan.next();
		
		do {
			
			System.out.println("Enter username : ");
			name = scan.next();
			System.out.println("Enter Pasword : ");
			pass = scan.next();
			
		} while (  ! ( name.contentEquals("abc") && pass.contentEquals("123")  )  );
		
		System.out.println("END");

	}

}
