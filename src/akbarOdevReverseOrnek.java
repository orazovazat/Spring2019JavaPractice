import java.util.Scanner;

public class akbarOdevReverseOrnek {

	public static void main(String[] args) {
		
		//Task:write a program to reverse a string

		
			Scanner scan=new Scanner(System.in); 
			System.out.println("Put a word or sentece:");
			String word=scan.nextLine();
			String reverse="";
			int len=word.length();
	//with charAt()
			for (int i = len-1; i>=0;i--) {
				reverse+=word.charAt(i);
				
			}
			System.out.println("reversed :"+reverse);
	//with substring
			String reverse1="";
			for (int i =len-1;i>=0;i--) {
				reverse1+=word.substring(i, i+1);
				
			}
			System.out.println("reversed :"+reverse1);

	}

}
