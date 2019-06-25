package day32;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
				
		boolean result = isAdultOrNot(19);
		System.out.println(result);
		System.out.println(isAdultOrNot(16));
		
		

	}

	
	public static boolean isAdultOrNot(int age) {
		
//		if(age>18) {
//			return true;
//		}else {
//			return false;
//		}
		
		return age>18;
		
	
	}
	
}
