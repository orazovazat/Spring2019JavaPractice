package vasylRepl;

public class repl111SecondSolution {

	public static void main(String[] args) {
		
		
		int[] nums = { 44, 44, 12, 12, 32, 32, 10, 10, 17 };
		int counter = 0;
		int value = 0;
//		outer loop
		for(int i =0; i<nums.length;i++) {
//			inner loop
			for(int j =0; j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					counter++;
				}

			}
			if(counter == 1) {
				value = nums[i];
				break;
			}
			counter = 0;
		}
		System.out.println(value);

	}

}
