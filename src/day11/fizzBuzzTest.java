package day11;

import java.util.Scanner;

public class fizzBuzzTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		
		String result ; 
		
		result = ((score % 5 == 0 && score % 3 == 0)) ? "fizzBuzz" : "NotFizzBuzz" ;
		System.out.println(result);
		

	}

}
