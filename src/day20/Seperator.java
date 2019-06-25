package day20;

public class Seperator {

	public static void main(String[] args) {
		
		String mix = "Aonline123x";
		
		char c = mix.charAt(0);
		
		System.out.println();
		
		if(c >= '0' && c <= '9') {
			
			System.out.println("NUMBER!!!");
			
		}else {
			
			System.out.println("NOT NUMBER!!!");
		}
		
        if(c >= 'A' && c <= 'Z') {
			
			System.out.println("UPPERCASE!!!");
			
		}else {
			
			System.out.println("NOT UPPERCASE!!!");
		}

	}

}
