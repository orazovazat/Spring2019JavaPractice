package day29;

public class MethodWithParameter {

	public static void main(String[] args) {
		
		
		// Arrays.sort(arr) ;
		
		 holdYourHorse("Anar");
	//	 holdYourHorse(12345);  // does not compile if datatype not match
		 holdYourHorse("David");
		 holdYourHorse("Azat");
		 holdYourHorse("Jennet");
		
	}
	                                // parameter
	public static void holdYourHorse(String owner) {
		
		//String owner = "Anar" ;
		
		System.out.println(owner + ", hold your horse please!");
	}

}
