package day11;

import java.util.Scanner;

public class warmUpTaskFizzBuzz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number");
		int score = scan.nextInt();

		if (score % 5 == 0 && score % 3 == 0) {
			System.out.println(" fizz buzz");

		} else if (score % 5 == 0) {
			System.out.println("fizz");

		} else if (score % 3 == 0) {
			System.out.println("buzz");

		} else {
			System.out.println("NOT A FIZZ BIZZ NUMBER");

		}

	}

}
