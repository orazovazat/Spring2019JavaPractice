package day11;

public class ternaryConditionalOperator {

	public static void main(String[] args) {
		
//
//		int score = 98 ;
//		String abc = "" ;
//		
////		if (score > 75 )
////			abc = "pass";
////		else
////			abc = "fail";
//		
//		abc = (score > 75 ) ? "pass" : "fail" ;
//		System.out.println(abc);
		
		
		
		
		double price = 85.55 ;
//		String label = (price > 100) ? "expensive" : "cheap" ;
//		System.out.println(label);
		 
//		 
//		if(price > 100) {
//		    label = "expensive";
//		}else if(price > 90){
//			label = "moderate";	
//		}else {
//			label = "cheap";
//		}
		 
		 String label = (price > 100) ? "expensive" : (price > 90) ? "moderate" : "cheap" ;
		 System.out.println(label);
//		 String label2 = (price <= 100 && price > 90) ? "moderate " : "cheapOrExp" ;
		 
		 
		 
		
		 


	}

}
