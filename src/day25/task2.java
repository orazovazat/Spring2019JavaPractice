package day25;

import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {
		
		
		String[] movies = new String [4];
		
		movies [0] = "life";
		movies [1] = "meaningless";
		movies [2] = "love is";
		movies [3] = "without";
		
		System.out.println(Arrays.deepToString(movies));
		
		
		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i] + " --> " + movies[i].length());
		}
		
		int max = movies[0].length() ;
		
		for (int i = 1; i < movies.length; i++) {
			if(movies[i].length() > max ) {
				max = movies[i].length();
			}
		}
		System.out.println(max);
		
		
		
		
		
	}

}
