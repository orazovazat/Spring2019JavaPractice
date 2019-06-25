package day28;

import java.util.Arrays;

public class TwoDArray2ndWay {

	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,3,5} ;
		int[] nums2 = new int[] {1,13} ;
		
		
		int[][] numsOfNums = new int[2][] ;
		numsOfNums[0] = nums1 ;
		numsOfNums[1] = nums2 ;
		
		for (int i = 0; i < numsOfNums.length; i++) {
			
			System.out.println(Arrays.toString(numsOfNums[i]) );
			System.out.println(numsOfNums[i].length);
			
		}
		
		for (int[] eachRow : numsOfNums) {
			
			for (int eachCell : eachRow) {
				
				System.out.println(eachCell);
			}
			
		}
		
		/*
		 * int[] nums1 = new int[] {1,3,5} ; 
    int[] nums2 = new int[] {1,13} ; 
    
    // 2 dimesional array is an array object that store 
    // 1 dimensional array in each slot 
    
    int[][] numsOfnums = new int[2][] ;
    // length method on an array will always return first dimension length
    System.out.println( numsOfnums.length );
    
    numsOfnums[0] = nums1 ; 
    numsOfnums[1] = nums2 ; 
    
    for (int i = 0; i < numsOfnums.length; i++) {
      
      System.out.println( Arrays.toString(numsOfnums[i])  );
      System.out.println( numsOfnums[i].length  );
      
    }
    
    for( int[] eachRow :  numsOfnums ) {
      
      for( int eachCell : eachRow) {
        
        System.out.print( eachCell + " " );
        
      }
      
    }
		 */

	}

}
