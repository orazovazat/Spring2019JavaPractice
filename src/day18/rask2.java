package day18;

import java.util.Scanner;

public class rask2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        int bill = 0 ;
        
        while(bill != 5 && bill != 10) {
        	
        	System.out.println("Enter bill 5& or 10$:");
        	   bill = scan.nextInt();
        }
         
        System.out.println("You finally did it.");
		
	}

}
