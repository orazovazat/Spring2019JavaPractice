package day23;

public class CreatingArray {

	public static void main(String[] args) {
		
		
		int[] numbers ;
		      numbers = new int[2];
		numbers[0] = 10 ;
		numbers[1] = 15;
		numbers[0] = 100 ;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		numbers = new int[4];
		System.out.println(numbers[0]);
		
		// second way to create array with predefined items
		
		int[] nums = new int[]{1,3,4,5,8,9,0,4,-2};
		
		// getting the size of an array // second way to create 
		
		int size = nums.length ;
		System.out.println(size);
		
		nums[0] = 100 ;
		System.out.println(nums[0]);
		System.out.println(nums[size-1]);
		
		// final(third) way to create an array
		
		int[] nums2 = {1,2,3,5,6,7,8,8,12,32,4,56};
		
		System.out.println(nums2.length);
		
		
		
	}

}
