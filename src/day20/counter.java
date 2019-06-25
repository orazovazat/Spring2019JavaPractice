package day20;

public class counter {

	public static void main(String[] args) {
		
		
		String str = "azat";
		
		int count = 0 ;
		int x = 0 ;
		
		
		do {
			
			char c = str.charAt(x);
			if(c == 'a') {
				System.out.println("Bingo" +" "+ x);
				++count ; // count = count + 1;
			}
				
			
			// System.out.println(str.charAt(x) + " ");
			x++ ;
			
		} while (x<str.length());
		
		System.out.println(count);

	}

}
