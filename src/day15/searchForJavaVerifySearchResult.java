package day15;

public class searchForJavaVerifySearchResult {

	public static void main(String[] args) {
		
		// About 816,000,000 results (0.64 seconds) 
		
		String str = "About 816,000,000 results (0.64 seconds)" ;
		
		if( str.indexOf("About") == 0 ) {
			System.out.println("it started with About");
		}else {
			System.out.println("it did not started with About");
		}
		
		if(str.indexOf("results") >= 0) {
			System.out.println("it contains results");
		}else {
			System.out.println("no results ");
		}	

	}

}
