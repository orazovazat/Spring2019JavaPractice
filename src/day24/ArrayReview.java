package day24;

public class ArrayReview {

	public static void main(String[] args) {
		
		int[] nums = new int [3];
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		boolean[] bools = new boolean[4];
		
		bools[0] = false ;
		bools[1] = false ;
		bools[2] = false ;
		bools[3] = true ;
		
		int[] nums2 = new int[] {1,2,3,4,5,65,6} ;
		System.out.println(nums2[5]);

		
		int[] nums3 = {1,2,3,4,5,65,6} ;
		System.out.println( nums3.length);
		System.out.println(nums3[2]);
	}

}
