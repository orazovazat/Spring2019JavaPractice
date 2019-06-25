package day24;

public class ArrayTask {

	public static void main(String[] args) {
		
		char[] name1 = new char[4] ;
		name1[0] = 'A';
		name1[1] = 'Z';
		name1[2] = 'A';
		name1[3] = 'T';
		
		System.out.print(name1[0]);
		System.out.print(name1[1]);
		System.out.print(name1[2]);
		System.out.print(name1[3]);
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.print(name1[i]);
		}
		
		System.out.println();
		char[] name2 = new char[] {'A','Z','A','T'} ;
		for (int j = 0; j < name2.length; j++) {
			System.out.print(name2[j] + " ");
		}
		
		
		System.out.println();
		char[] name3 = {'A','Z','A','T'} ;
		for (int x = 0; x < name3.length; x++) {
			System.out.print(name3[x] + " ");
		}
		
		
		System.out.println();
		int count = name3.length ;
		System.out.println(name3[count-1]);   //---> to get a last character
		
		System.out.println();
		int midIndex = count/2 ;
		System.out.println(name3[midIndex]); // ---> to get a middle character
		
		System.out.println();
		for (int y = name3.length-1; y >= 0 ; y--) {
			System.out.print(name3[y] + " ");    // --> reversing the name
		}
		
	}

}
