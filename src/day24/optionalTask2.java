package day24;

public class optionalTask2 {

	public static void main(String[] args) {
		
		
		
		int[] nums = { 1, 4, 6, 8, 9 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		System.out.println();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);
		
		
		///----> do while loop
		
		int j = 0 ;
		do {
			sum = sum + nums[j];
			j++ ;
		} while (j<nums.length);
		
		System.out.println(sum);
		
		///// --> while loop
		
		int z = 0;
		while(z<nums.length) {
			sum = sum + nums[z];
			z++ ;
		}
		System.out.println(sum);
       
	}

}
