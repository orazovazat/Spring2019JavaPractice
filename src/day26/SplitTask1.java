package day26;

import java.util.Arrays;

public class SplitTask1 {

	public static void main(String[] args) {
		
		String groceries = "banana, apple, kiwi, onion" ;
		String[] items = groceries.split(",") ;
		System.out.println(Arrays.toString(items));
		
		////
	
		System.out.println("The object q-ty is : "+items.length);
		
		////
		
		// trim() aradaky space ayirmak ucin ulanylyar , bolmasa uzynlygy 1 sany artykmac gorkezyar
		for (int i = 0; i < items.length; i++) {	
			System.out.println(items[i].trim().length() );
		}

		
		
	}
}
