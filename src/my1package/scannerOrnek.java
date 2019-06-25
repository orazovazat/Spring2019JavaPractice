package my1package;

import java.util.Scanner;

public class scannerOrnek {

	public static void main(String[] args) {
		
		
		Scanner jennet = new Scanner(System.in);
		
		String user , parol ;
		int x ;
		double y ;
		
		System.out.println("Print something : ");

		user = jennet.next();
		parol = jennet.next();
		x = jennet.nextInt();
	    y = jennet.nextDouble();
		
	    System.out.println("user "+(x)+(y)+ " parol");
	    
	}

}
