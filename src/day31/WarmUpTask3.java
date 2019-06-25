package day31;

import java.util.Arrays;

public class WarmUpTask3 {

	public static void main(String[] args) {
		
		
		int [] arr1 = {1,2,3} ;
		int [] arr2 = {1,2,3,5} ; 
		
		reportBiggerArray(arr1 , arr2);
		
		reportBiggerArray(new int[] {1,5} , new int[] {1,5,6});

		

	}
	
    public static void reportBiggerArray(int[] arr1, int[] arr2 ) {
    	if(arr1.length > arr2.length) {
    		System.out.println(Arrays.toString(arr1));
    	}else {
    		System.out.println(Arrays.toString(arr2));
    	}
    	
    }

}
