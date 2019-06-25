package day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(123);
		Integer i = 100;
		numList.add(i);
		numList.add(200) ;
		numList.add(300) ;
		System.out.println(numList);

	}

}
