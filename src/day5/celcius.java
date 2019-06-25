package day5;

public class celcius {

	public static void main(String[] args) {
		
		double fahrenheit = 80d ;
		double celcius = (5.0/9)*(fahrenheit -32) ;
		
		// double celcius = (5/9.0)*(fahrenheit -32) ; same result
		// double celcius = (5/9d)*(fahrenheit -32) ; same result
		
		System.out.println("the celcius value is " + celcius);
		
		

	}

}
