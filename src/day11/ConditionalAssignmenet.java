package day11;

import java.util.Scanner;

public class ConditionalAssignmenet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score ;
		String result ;
		
		System.out.println("Enter the number:");
		score = scan.nextInt();
		
		if(score > 75) {
			result = "pass" ;
			
		}else {
			result = "fail" ;
		}
		
		System.out.println("result is: "+result);

	}

}
