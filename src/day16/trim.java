package day16;

public class trim {

	public static void main(String[] args) {
		
		
		String str = "    GOO     JAVA SPARTAN      !" ;
		// System.out.println(str);
		
		int indexOfJ = str.indexOf("J");
		System.out.println(indexOfJ);
		System.out.println(str.lastIndexOf(" "));
		System.out.println(str.substring(indexOfJ, (str.lastIndexOf(" ")+2)));

	}

}
