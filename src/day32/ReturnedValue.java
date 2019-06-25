package day32;

public class ReturnedValue {

	public static void main(String[] args) {
		
		char cLast = giveMeLastChar("Azat");
		System.out.println();
		System.out.println(cLast + " " + cLast);

	}
	
	public static char giveMeLastChar(String name) {
		
		char last = name.charAt(name.length()-1);
		System.out.println(last);
		return last ;
	}
	

}
