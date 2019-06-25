package day9;

import java.util.Scanner;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// Grade book 
		
		int score ;
		System.out.println("What is your score : " );
		score = scan.nextInt();
		
		// if the score is between 90-100 A
		// if the score is between 80-89 B
		// if the score is between 70-79 C
		// ELSE D and print study harder
		
		if(score >= 90) {
			System.out.println(" YOU GOT A ");
		}else if(score >=80 && score <90 ) {
			System.out.println(" YOU GOT B ");
		}else if(score >=70 && score <80 ) {
			System.out.println(" YOU GOT C ");
		
		}else {
			System.out.println("Study harder ");
			
		}
		
		
	}

}
