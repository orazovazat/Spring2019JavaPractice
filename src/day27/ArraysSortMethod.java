package day27;

import java.util.Arrays;

public class ArraysSortMethod {

	public static void main(String[] args) {
		
		
		
		
		int[] nums = {1,4,5,2,77,45};
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		// char Array
		String name = "CyberTek 123";
		char[] nameChars = name.toCharArray();
		
		Arrays.sort(nameChars);
		System.out.println(Arrays.toString(nameChars) );
		
		String[] names = {"abc","efg"," ","123","Ku"} ;
		Arrays.sort(names);
		System.out.println(Arrays.deepToString(names));
		
		String[] names2 = {"bca","abc","afg","afZ"} ;
		Arrays.sort(names2);
		System.out.println(Arrays.deepToString(names2));
		
		String[] names3 = {"a19999","a2","afg","afZ"} ;
		Arrays.sort(names3);
		System.out.println(Arrays.deepToString(names3));
	
		
		

	}

}
