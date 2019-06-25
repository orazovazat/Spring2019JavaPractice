package day32;

public class task4Converter {

	public static void main(String[] args) {
	
		
		System.out.println(meterToCM (2) );
		System.out.println(feetToInch(2) );
		
		System.out.println(fahrToCel(38));
		int cel = (int) fahrToCel(81);
		
		System.out.println(cel);

	}

	public static int meterToCM (int meter) {
		
		int cm = meter * 100 ;
		
		return cm;
	}

	public static double feetToInch(int feet) {
		double inch = feet * 12 ;
		return inch ;
	}
	
	public static double fahrToCel(double fahr) {
		
		return ( (fahr-32) * 5 / 9 );
	}
	
	
	
}
