package day5;

import java.util.Scanner;

public class gelnejeminki {

	public static void main(String[] args) {
		
		/* Scanner input = new Scanner(System.in);
		String Name;
		
		System.out.println ("Hi, who is your teacher?");
		
		String name = input.next();
		
		System.out.println("Your teacher is : " + name);
		System.out.println("Do you have any other teachers? ");
		String teacher = input.next();
		System.out.println("ok, " + teacher + " is also your teacher");
		*/
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your firstname : ");
		String firstName = input.next();
		System.out.println("Enter your lastname :  ");
		String lastName = input.next();
		System.out.println("Birthday(m/d) :  ");
		String Birthday = input.next();
		System.out.println("In which city do you live? :  ");
		String lives = input.next();
		System.out.println("In which State do you live? :  ");
		String State = input.next();
		System.out.println("Here is your short info: " + firstName+ " "
		+lastName+ ", " + Birthday+ ", " + lives+" " +State+ 
		". Good Luck"+ " "+firstName+ ", "+ "you will be the best programmer!");
		
		

	}

}
