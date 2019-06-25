package day25;

import java.util.Arrays;

public class task1 {

	public static void main(String[] args) {

		
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		System.out.println(Arrays.toString(nums));
		
		//////
		
		int[] evenNumbers = new int [51];

		for (int j = 0; j < evenNumbers.length; j++) {
			evenNumbers[j] = j*2 ;
			
		}
		
		System.out.println(Arrays.toString(evenNumbers));
		
		
		
		
	}

}
