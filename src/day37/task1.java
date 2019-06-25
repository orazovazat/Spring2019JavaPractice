package day37;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		
		
		ArrayList<Double> priceList = new ArrayList<>();
		
		priceList.add(5.55);
		priceList.add(12.43);
		priceList.add(9.99);
		priceList.add(15.12);
		priceList.add(3.13);
		
		System.out.println(priceList.get(2));
		
		for (int i = 0; i < priceList.size(); i++) {
			System.out.println(priceList.get(i));
			
		}

		for (Double each : priceList) {
			System.out.println(each);
		}
		
		for (int i = 0; i < priceList.size(); i++) {
			if(priceList.get(i) > 10) {
				System.out.println(priceList.get(i) );
			}
			
		}
		
	}

}
