package day24;

public class getTheMax {

	public static void main(String[] args) {
		
        int[] nums = { 1, 4, 6, 8, 9, 5 };
		
        int max = nums[0] ;
        int min = nums[0] ;
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i] > max) {
				max = nums[i] ;
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
