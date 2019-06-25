package day8;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
	
		int score = 10 ;
		boolean result = score > 4 ;
		boolean result2 = score > 4 && score <11 ;
		
		boolean result3 = score > 14 && score <11 ;
		boolean result4 = score > 14 || score <11 ;
		
		// boolean result5 = score++ >10 && score <12 ;
		// boolean result5 = ++score >10 && score <12 ;
		// boolean result5 = score++ >10 || score <12 ;
		
		// boolean result5 = score++ >10 & ++score <12 ;
		// boolean result5 = score++ >10 && ++score <12 ; 
		
		boolean result5 = score >10 & ++score <12 ;
		
		System.out.println("the value of score right now : " + score);
		
		System.out.println("result is " + result );
		System.out.println("result is " + result2 );
		System.out.println("result is " + result3 );
		System.out.println("result is " + result4 );
		System.out.println("result is " + result5 );
		

	}

}
