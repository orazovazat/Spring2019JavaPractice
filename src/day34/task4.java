package day34;

public class task4 {

	public static void main(String[] args) {
		
		System.out.println(sentenceBuilder("Azat" , "Jemile" , "Nazik" , 
				"Aynur" , "Annagurban" , "Muhammetaly") );

	}
	
	public static String sentenceBuilder(String...str) {
		
		String str2 = "";
		for (int i = 0; i < str.length; i++) {
		str2 = str2 + str[i] + " ";
		}
		
		return str2;
	}

}
