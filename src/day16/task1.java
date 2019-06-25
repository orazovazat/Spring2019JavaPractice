package day16;

public class task1 {

	public static void main(String[] args) {
		
		String str = "Sunday is Java Day" ;
		System.out.println(str);
		String up = str.toUpperCase();
		System.out.println(up);
		int lengthOfStr = str.length();
		System.out.println((str.substring(lengthOfStr-2, lengthOfStr)));
		System.out.println((str.substring(lengthOfStr-2)));
		System.out.println(str.indexOf("is"));
		System.out.println(str.contains("Java"));
		System.out.println(str.indexOf("Java") > -1);
		
		
		
		
		
		

	}

}
