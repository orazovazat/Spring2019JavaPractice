package day26;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		
		
		String shows = "Orville, Game Of Throne, X-man, Gifted, Braking bad" ;
		
		String[] showsArray = shows.split(",");
		// trim() ulansan hem bolyar yada ", " seydip comma'dan son space goymaly
//		System.out.println(Arrays.toString(showsArray));
//		for (int i = 0; i < showsArray.length; i++) {
//			System.out.println(showsArray[i].trim()); 
//		}
//		System.out.println(showsArray[1] );
//		
//		System.out.println(showsArray[showsArray.length-1] );
		
		String[] showsArray2 = shows.split(",");
		
		for (int i = 0; i < showsArray2.length; i++) {
			System.out.println(showsArray2[i]);
		}

	}

}
