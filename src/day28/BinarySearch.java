package day28;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {11,20,4,6,54,19,5};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		// Array object must be sorted before using this method
		
		int index = Arrays.binarySearch(nums, 5) ;
		System.out.println(index);
		
		int indexOf20 = Arrays.binarySearch(nums, 20) ;
		System.out.println(indexOf20);
		
		// if we do not have the item in the array
		// we will get minus number to point the insertion point of the array
		// to keep this array sorted
		
		// [4, 5, 6, 11, 19, 20, 54]
		/////////////////////////////// [4, 5, 6, 10, 11, 19, 20, 54]
		// [4, 5, 6, 11, 19, 20, 54, 100]
		
		int indexOf10 = Arrays.binarySearch(nums, 10) ;
		System.out.println(indexOf10);
		
		int indexOf100 = Arrays.binarySearch(nums, 100) ;
		System.out.println(indexOf100);
		
		int indexOf3 = Arrays.binarySearch(nums, 3) ;
		System.out.println(indexOf3);
		
		int[] nums100 = new int[100];
		Arrays.fill(nums100,  5);
		System.out.println(Arrays.toString(nums100));

	}

}
