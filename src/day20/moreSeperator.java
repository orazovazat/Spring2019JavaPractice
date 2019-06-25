package day20;

public class moreSeperator {

	public static void main(String[] args) {
	
		
         String mix = "Aonline123x";
         String numberStr = "";
         String numberWord = "";
         
         int i = 0;
         while(i < mix.length()) {
        	 
        	 char c = mix.charAt(i);
        	 
        	 if(c >= '0' && c <= '9')
        	 {
        		 System.out.println(c);
        		 numberStr = numberStr + c;
        	 }
        	 
        	 i++ ;
        	 
//             char c = mix.charAt(i);
//        	 
//        	 if(c >= 'a' && c <= 'z')
//        	 {
//        		 System.out.println(c);
//        		 numberWord = numberWord + c;
//        	 }
//        	 
//        	 i++ ;
        	 
         }
		System.out.println(numberStr);
		  
		 
	}

}
