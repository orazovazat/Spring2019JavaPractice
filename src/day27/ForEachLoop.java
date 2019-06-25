package day27;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		int[] nums = {1,33,567,11,22};
		
		for (int i = 0; i < nums.length; i++) {
			
			int eachItem = nums[i] ;
			System.out.println(eachItem);
			
		}
		
		
		for( int eachItem : nums ) {
			System.out.println(eachItem); // yokardaky ikisem shol bir zady edyar.
		}
		
		
		

	}

}
