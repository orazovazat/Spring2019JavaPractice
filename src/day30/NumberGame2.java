package day30;

public class NumberGame2 {

	public static void main(String[] args) {

		// Task2
		/*
		 * 2.1 create static method with no return type called printTheDoubleNuMber it
		 * take 1 int as parameter and it will print out doubled number on the console
		 * 
		 * 2.2 create another static method with no return type called checkForAge it
		 * take 1 int as parameter inside body , check whether the age is more than 18
		 * if the age is more than 10 --> print adult if not print not an adult
		 * 
		 */

//		printTheDoubledNumber(10); // --> 20
//		printTheDoubledNumber(3); 
		 checkForAge(21); // --> adult
		 
		 int i = 21 ;
		 checkForAge(i);
		 
		 checkForAge(17);

	}

	public static void checkForAge(int age) {

		//int i = age;

		if (age > 18) {
			System.out.println("adult");
		} else {
			System.out.println("not an adult");
		}

	}

	public static void printTheDoubledNumber(int num) {

		int doubledNum = num * 2;
		// System.out.println(doubledNum);
		System.out.println(num + " was doubled --> " + doubledNum);
	}

}

//		printDoubledNumber(10);
//		checkForAge(21);
//	}
//
//	public static void printDoubledNumber(int number){
//
//		         number = number * 2;
//		         System.out.println(number);
//
//		     }
//
//	public static void checkForAge(int age){
//
//		         if(age > 18){
//		             System.out.println("Adult");
//		         }else{
//		             System.out.println("Not a adult");
//	
//		         }
