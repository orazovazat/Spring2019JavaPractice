package day25;

import java.util.Arrays;

public class GetTheStringItemWithMaxLength {

	public static void main(String[] args) {
	 
		
String[] movies = new String [4];
		
		movies [0] = "life";
		movies [1] = "without";
		movies [2] = "love is";
		movies [3] = "meaningless";
		
		
		int max = movies[0].length() ;
		int index = 0;
		for (int i = 1; i < movies.length; i++) {
			
			if(movies[i].length() > max ) {
				max = movies[i].length();
				index = i ;
			}
		}
		System.out.println(index);
		System.out.println(movies[index] );
		
		
		

	}

}
