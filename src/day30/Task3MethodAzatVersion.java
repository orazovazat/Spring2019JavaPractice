package day30;

public class Task3MethodAzatVersion {

	public static void reportName(String firstName, String lastName ) {
//		String firstName = "Azat" ;
//		String lastName = "Orazov";
		
		System.out.println("the length of first name is : " + firstName.length() );
		System.out.println("the length of last name is : " + lastName.length() );
		System.out.println(firstName.charAt(0));
		System.out.println(lastName.charAt(0));
		
		
		
	}
	public static void main(String[] args) {
	
		
	reportName("Azat", "Orazov");	
	reportName("Jon", "Snow");
	
	reverseString("abc");
	reverseString("java");
	reverseString("azat");

	}

	
	public static void reverseString(String str) {
		
		for (int i = str.length()-1; 0 <= i ; i--) {
			System.out.print(str.charAt(i) + "");
	
		}
		System.out.println();
		
	}
	
	
	
}
