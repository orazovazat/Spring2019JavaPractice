package day4;

public class primitives {

	public static void main(String[] args) {
		
		int n1 = 55 , n2 = 65 ;
		int totalsub = n1 - n2 ;
		int totaladd = n1 + n2 ;
		
		double num1 = 1.5 , num2 = 2.5 ;
		double addtotal = num1+num2 ;
		double subtotal = num1-num2 ;
	    char a1 = '!' ;
	    float b1 = 2.20f ;
	    float b2 = 3.30f ;
	    
	    int x = 10 , y = 20 , z = 30 ;
	    int mult = x * y * z ;
	    int div = y / x ;
	    int mod = x % y ;
	    int multdiv = x * y / z ;
	   
	    
//	    System.out.println(mult);
//	    System.out.println(div);
//	    System.out.println(mod);
//	    System.out.println(multdiv);
	    String allmix = "Maybe it works maybe not i'm just trying to use all "
	    		+ "the primitives and mix them i want to concatenating "
	    		+ "them and use them in same line " ;
	    
	    System.out.println(allmix + "-->" + "  " +
	    ((mult + div) + (multdiv-x) + (b1 + b2) - (x-y) + 
	    		(addtotal - subtotal)));
	    
	   // System.out.println(allmix);
	    System.out.println("allmix " + "-->" + "  " + (mult + div) );
	    System.out.println("allmix " + "-->" + "  " + ((mult + div) + (multdiv-x)));
	    
	
		
//		String jemi = "the result of addition is -->" ;
//		String ayirmak = "the result of substraction  is -->" ;
//		
//		System.out.println(jemi + totaladd + a1 );
//		System.out.println(ayirmak + totalsub);
//	
//		System.out.println(jemi + addtotal );
//		System.out.println(ayirmak + subtotal);
//		System.out.println(addtotal + subtotal);
//		System.out.println(b1+b2);
//		System.out.println("the total of all" +a1 +"-->"+ " " + (addtotal + subtotal) * (b1+b2));
		
		
//		double num1=10, num2=70;
//		double addResult=num1+num2;
//		double subResult=num1-num2;
//		String sentenceAdd="The addition result is";
//		String sentenceSub="Subtruction result is";
//		System.out.println(sentenceAdd + addResult);
//		System.out.println(sentenceSub + subResult);
		

	}

}
