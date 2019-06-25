package day33;

public class WarmUpTask1 {

	public static void main(String[] args) {

		/*
		 * Warmup 1.1
		 * 
		 * Create a static method getSum accept 1 paramter as int array and return the
		 * sum of the all the items in array
		 * 
		 * another method called addAll accept 1 paramter as String array and return the
		 * concatenation of all items
		 * 
		 * another method called getMax accept 1 paramter as int array and return the
		 * max from the all the items in array
		 */

		int[] nums = { 5, 6, 9, 12, 34 };
		int sum = getSum(nums);
		System.out.println("Sum of all numbers: " + sum);
		System.out.println(getSum(nums));
		
		int max = getMax(nums);
		System.out.println("Max of all numbers: " + max);
		
		
		String[] names = {"Emine", "Firdevs", "Sharif", "Bahadir", "Mehmet"};
		

	}

	public static int getSum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return total;
	}

	public static int getMax (int[] arr) {
		int max = arr[0] ;
		for (int i = 0; i < arr.length; i++) {
			if(arr[0]<arr[i]) {
				max = arr[i];
			}
		}
            return max ;
	}
}




	
	
	
	
	
	
	
