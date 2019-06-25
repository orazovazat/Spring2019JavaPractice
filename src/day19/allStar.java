package day19;

public class allStar {

	public static void main(String[] args) {
		
		String star = "*";
		int x = 0 ;
		String allStar = "";
//		while(x < 5) {
//			
//			
//			System.out.println(star);
//			star = star + "*";   // ---> this is a one of the way
//			x++ ;
//			
//		}
		
            while(x < 5) {
            	
			allStar = allStar + star;
			System.out.println(allStar);  // ---> it works too
			x++ ;
			
		}

	}

}
