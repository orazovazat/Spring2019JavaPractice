package day12;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter 2 numbers :");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();
		 
		 System.out.println("Enter Operator + , - , * , / : ");
		 String operator = scan.next();
		 
		 if(operator.contentEquals("+")) {
			 System.out.println("the result is " + (num1 + num2));
			 
		 }else if(operator.contentEquals("-")) {
			 System.out.println("the result is " + (num1 - num2));
		
		 }else if(operator.contentEquals("*")) {
			 System.out.println("the result is " + (num1 * num2));
			 
		 }else if(operator.contentEquals("/")) {
			 System.out.println("the result is " + (num1 / num2)); 	
		 
		 }else {
			 System.out.println("INVALID OPERATOR");
			 
		 }
			 
	}

}
