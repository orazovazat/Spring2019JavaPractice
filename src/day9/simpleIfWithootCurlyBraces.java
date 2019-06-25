package day9;

import java.util.Scanner;

public class simpleIfWithootCurlyBraces {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numbers");
		
		int x = scan.nextInt();
		
		if(x != 10) {
			System.out.println("Not 10 !");
		}else {
			System.out.println("YES IT IS 10");
		}

	}

}
