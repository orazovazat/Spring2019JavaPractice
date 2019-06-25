package assignments;

import java.util.Scanner;

public class testTasks {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		   
		    char firstLetter = word.charAt(0);
		    int count = word.length();
		    int lastChar = count -1;
		    char ch = word.charAt(lastChar);
		    System.out.println(firstLetter+ ""+ ch) ;
		    
		    
		  
		    
		  }
		}

