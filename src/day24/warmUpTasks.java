package day24;

public class warmUpTasks {

	public static void main(String[] args) {
		
		
		// WARM UP TASKS
        /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */ 
		
		for (int j = 0; j < 5; j++) {
			
			for (int i = 0; i < 5; i++) {
				System.out.print("java" + " ");
			}
			System.out.println();
		}
		
		//////
		
		for (int x = 0; x < 5; x++) {
			for (int n = 1; n <= 5; n++) {
				System.out.print(n + " ");	
			}
			System.out.println();
		}
		/////////
		
		
		for (int z = 1; z <= 5; z++) {
			
			for (int y = 1; y <= z; y++) {
				System.out.print(y + " ");	
			}
			System.out.println();
		}
		
		////
		
		
		for (int w = 'A'; w <= 'Z'; w++) {
			
			for (int s = 'A'; s <= w; s++) {
				System.out.print( (char) s + " ");	
			}
			System.out.println();
		}
		
		/////
		for (int r = 1; r <=10 ; r++) {
			
			for (int q = 1; q <= r; q++) {
				System.out.print(q + " ");
			}
			System.out.println();
			
		}
       ///////
		for (int d = 10; d >= 1 ; d--) {
			
			for (int p = 10; p >= d; p--) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		
	}

}
