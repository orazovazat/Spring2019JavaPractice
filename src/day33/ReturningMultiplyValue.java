package day33;

import java.util.Arrays;

public class ReturningMultiplyValue {

	public static void main(String[] args) {
		
		
		int[] myArray = giveMeAnArray();
		System.out.println(Arrays.toString(myArray));
		
		System.out.println(Arrays.toString(giveMeAnArray()) );
		

	}
	
	
	public static int[] giveMeAnArray() {
		
		//System.out.println("Action");
		int[] arr = new int[] {1,2,3} ;
		return arr ;
		
	}

}
