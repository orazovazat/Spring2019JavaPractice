package day15;

import java.util.Scanner;

public class comparisionOperator {

	public static void main(String[] args) {
		
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter items to search for : ");
	     String itemToSearachFor = scan.nextLine();
	     System.out.println("You have entered : " + itemToSearachFor );
	     
	     String expectedResult = "Amazon.com : Ipad";
	     String actualResult = "Amazon.com :" + itemToSearachFor ;
	     
	     if(expectedResult.equalsIgnoreCase(actualResult)) {
	    	 System.out.println("Test pass for ipad");
	     }else {
	    	 System.out.println("Test Fail for ipad");
	     }
	     
	     
		
	}

}
