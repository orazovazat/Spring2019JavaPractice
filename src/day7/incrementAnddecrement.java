package day7;

public class incrementAnddecrement {

	public static void main(String[] args) {
		
		// Increment and decrement operator
		// increment --- increasing value by one ++ for example b++ ++b
		// decrement --- decreasing value by one -- for example b-- --b
		
		int x = 3 ;
//		x = x++ ;  // --> x = 3
//		System.out.println(x);
//		x = ++x ;  // --> x = 4
//		
//		System.out.println(x);
		
		// int result = ++x + 5 ;
		
		// x = x++ + ++x ; // 3 + 5 = 8
		
		x = x++ + --x + x-- + x ;
		
		
		// System.out.println(result);
		System.out.println(x);
		
//		x-- ;
//		System.out.println(x);
		
//		System.out.println(++x); 
//		System.out.println(x);
//		System.out.println(x);
		
		// System.out.println(x--);
//		System.out.println(--x);
//		System.out.println(x);
		
		
		
		
	}

}
