package assignments;

import java.util.Scanner;

public class Party_083 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int catCount = 0;
        int dogCount = 0;

        for ( int i = 0; i < str.length() - 2; i++ ){
        
        	String cat = "";
            if ( cat.equals( str.substring( i, i + 3 ) ) )
            {
                catCount++;
            }
            if ( "dog".equals( str.substring( i, i + 3 ) ) )
            {
                dogCount++;
            }
        }

        System.out.println(catCount == dogCount); 
        System.out.println(catCount);
        System.out.println(dogCount);
		
		
	}

}
