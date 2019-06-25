package day26;

import java.util.Arrays;

public class StringtoCharArray {

	public static void main(String[] args) {
		
		String str = "Spartan" ;
		
//		int size = str.length();
//		
//		char[] myChars = new char[size] ;
//		
//		for (int i = 0; i < myChars.length; i++) { // here we can use a size too
//			
//			myChars[i] = str.charAt(i) ;
//		}
//		
//		System.out.println(Arrays.toString(myChars));
		
		
		char[] myChars = str.toCharArray();
		System.out.println(Arrays.toString(myChars));
		

	}

}
