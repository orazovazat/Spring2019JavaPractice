package day12;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	    System.out.println("Enter Day number : ");
	    int dayNum = scan.nextInt();
	    String dayWord = "Unknown";
	    
	    switch(dayNum) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
	    case 5:
	    	dayWord = "Weekdays";
	    	break ;
	    case 6:
	    case 7:
	    	dayWord = "Weekends";
	    	break ;
	    	
	    	
	    default :
	    	dayWord = "Invalid Days";
	    	break ;
	    } 
	    	System.out.println("the day is: " + dayWord);
	    	
	    

	}

}
