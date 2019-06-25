import java.util.Arrays;
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		
		int counter = 1 ;
		String email = "info@cybertekschool.com";
		
		 if(counter == 1){
		        String [] str = email.split("@");
		        
		        for(int j=0 ; j < str.length ; j++){
		        	
		        
		        System.out.println("Email id: " + str[j]);
		        //System.out.println("Email domain: " + str[j]);
		        }
		      }else{
		        System.out.println("invalid email");
		      }
		
		
		
		
	}

}
