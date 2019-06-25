package day26;

import java.util.Arrays;

public class SplitingTheString{

	public static void main(String[] args) {
		
		String str = "Java is fun java is challenging breadjambread " ;
		String[] words = str.split(" ") ;
		System.out.println(Arrays.toString(words));
		
		String[] parts = str.split("a") ;
		System.out.println(Arrays.toString(parts));
		
		String[] parts2 = str.split("t") ;
		System.out.println(Arrays.toString(parts2)); // spliting with letter t 
		
		String[] parts3 = str.split("is") ;
		System.out.println(Arrays.toString(parts3));
		
		String[] parts4 = str.split("bread") ;
		System.out.println(Arrays.toString(parts4));

	}

}
