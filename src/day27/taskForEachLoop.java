package day27;

public class taskForEachLoop {

	public static void main(String[] args) {
		
		
		String[] names = {"Nazik", "Aynur", "Annagurban", "Muhammetaly"} ;
		
		
		
		for(String eachName : names ) {
			System.out.println(eachName);
		}
		
		
		Double[] nums = {12.3 , 55.5, 3.23,  };
		
		for ( Double eachNums : nums ) {
			System.out.println(eachNums);
		}
		
		char[] ch = {'A' , 'B' , 'z' , 'x'};
		
		for(char eachCh : ch) {
			System.out.println(eachCh);
		}

	}

}
