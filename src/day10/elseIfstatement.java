package day10;

import java.util.Scanner;

public class elseIfstatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your score please");

		int score = scan.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("Invalid number");
		} else if (score > 90) {
			System.out.println("Great score : A!");

		} else if (score > 80) {
			System.out.println("Good score : B !!");

		} else if (score > 70) {
			System.out.println("OK score : C !!");

		} else {
			System.out.println("Study Harder  !!!");

		}
	}

}
