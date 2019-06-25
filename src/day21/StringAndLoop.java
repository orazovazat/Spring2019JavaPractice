package day21;

public class StringAndLoop {

	public static void main(String[] args) {
		
		// every for loop can be written in while loop 
		
		// use for loop to print your name char by char
		// and print reverse order char by char
		// optionally save it into another variable
		
		String name = "Azat" ;
		for (int i = 0; i < name.length(); i++) {
			
			System.out.print(name.charAt(i) + " ");
			
		}
		/////////////////////////
		    System.out.println();
		    
        for (int i = name.length()-1; i >= 0; i--) {
			
			System.out.print(name.charAt(i) + " ");
			
		}
        
        ////////////////////
        
        String newStr = "";
        System.out.println();
	    
        for (int i = name.length()-1; i >= 0; i--) {
			
			//System.out.print(name.charAt(i) + " ");
        	char eachChar = name.charAt(i);
        	newStr =newStr +" "+ eachChar ;
		}
        System.out.println(newStr);

	}

}
