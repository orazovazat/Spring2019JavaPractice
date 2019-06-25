package day27;

import java.util.Arrays;

public class warmUpTask {

	public static void main(String[] args) {
		
		/*
		 * Saturday WARM UP Tasks : 

//Task1 : 
	create an array of int with 5 items , return true if all items are more than 10
	return false if not

//Task 2 :
given : 
String str = "Cybertek Batch Spartan is most hardworking Batch ever";

use the method your learned to get each words
and store it into String array: 

loop through each items -- 
  in each iteratrion loop : 
  	 turn each word into char array 
  	 print each char out with seperated by -
output : 
	C-y-b-e-r-t-e-k-
	B-a-t-c-h-
	S-p-a-r-t-a-n-
	i-s-
	m-o-s-t-
	h-a-r-d-w-o-r-k-i-n-g-
	o-n-e-
	e-v-e-r-

// Optional : Reverse each word in sentence
your output should be 
ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
		 */
		
		boolean result = true ;
		
		int[] num = {25,28,23,11,53,67} ;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] <= 10) {
				result = false ;
				break;
			}
		}
		System.out.println(result);
		
//		Task2
		
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for (int j = 0; j < words.length; j++) {
			//System.out.println(words[j]);
			String one = words[j];     //"Cybertek";
			char[] cyberChars = one.toCharArray();
			for (int i = 0; i < cyberChars.length; i++) {	
				System.out.print(cyberChars[i] + "-");
			}
			System.out.println();
		}
		
		

		
		

	}

}
