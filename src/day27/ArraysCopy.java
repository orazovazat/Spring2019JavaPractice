package day27;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		
		String[] dcComicHeros = {"Spiderman", "ipman"};
		
		System.out.println(Arrays.deepToString(dcComicHeros));
		Arrays.sort(dcComicHeros);
	for (String each : dcComicHeros) {
		System.out.println(each);
		
	}

	}

}
