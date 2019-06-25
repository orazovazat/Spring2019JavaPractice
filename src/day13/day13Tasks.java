package day13;

import java.util.Scanner;

public class day13Tasks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name1: ");
		String name1 = scan.next();
		System.out.println("Enter a name2: ");
		String name2 = scan.next();
		
//		boolean b1 = name1.equalsIgnoreCase(name2);
//		System.out.println(b1);

		System.out.println(name1.equalsIgnoreCase(name2));
		
	    int count1 = name1.length();
	    int count2 = name2.length();
	    
	    System.out.println((count1 > count2) ? name1.charAt(2) : name2.charAt(3));
	    
	    // int lastCharIndex = count2-1 ; --> bu sekildede yazyp bolyar
	    
	    char lastChar = (name2.charAt(count2-1));
	    System.out.println(lastChar);
	    
	    switch(lastChar) {
	    
	    case 'a' :
	    	System.out.println("the name2 ends with : a");
	    	break;
	    case 'z' :
	    	System.out.println("the name2 ends with : z");
	    	break;
	    case 'v' :
	    	System.out.println("the name2 ends with : v");
	    	break;
	    	default :
	    		System.out.println("no matches");
	    }

	}

}
