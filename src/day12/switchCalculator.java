package day12;

import java.util.Scanner;

public class switchCalculator {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter 2 numbers :");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();
		 
		 System.out.println("Enter Operator + , - , * , / : ");
		 String operator = scan.next();
		 
		 switch(operator) {
		 
		 case "+" :
			 System.out.println("the result is " + (num1 + num2));
			 break ;
		 case "-" :
			 System.out.println("the result is " + (num1 - num2));
			 break ;
		 case "*" :
			 System.out.println("the result is " + (num1 * num2));
			 break ;
		 case "/" :
			 System.out.println("the result is " + (num1 / num2));
			 break ;
			 
	     default :
	    	 System.out.println("INVALID OPERATOR");
	    	 break;
			 
			 
		 } 
		
	}

}
