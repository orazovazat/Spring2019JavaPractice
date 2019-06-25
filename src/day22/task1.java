package day22;

public class task1 {

	public static void main(String[] args) {
		
		String str = "ABCAA" ;
		
		for (int i = 0; i < str.length(); i++) {
			
			String eachChar = str.substring(i, i+1);
			if(i == str.length()-1){	
				System.out.print( eachChar ) ;
			}else {
				System.out.print( eachChar + "-") ;
			}
			
		}
		
		
	/*
	 * 
	 * 	
	 */
		
		
		


	}

}
