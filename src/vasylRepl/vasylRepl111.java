package vasylRepl;

import java.util.Arrays;

public class vasylRepl111 {

	public static void main(String[] args) {
	
		int[] nums = { 44, 44, 12, 12, 32, 32, 10, 10, 17 };
        // TODO: write your code below
        Arrays.sort(nums);
        // [1, 1, 2, 3, 4, 3, 4]
        // [1, 1, 2, 3, 3, 4, 4]
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    System.out.println(nums[i]);
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    System.out.println(nums[i]);
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    System.out.println(nums[i]);
                }
            }
        }
		
	}

}
