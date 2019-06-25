package day21;

public class task2ContinuePractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i += 2) {

			System.out.print(i + " ");

		}
		//
		System.out.println();
		for (int i = 1; i <= 50; i ++) {

			if(i % 2 == 1) 
			System.out.print(i + " ");
	
		}
		//
		System.out.println();
		for (int i = 1; i <= 50; i ++) {

			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
			
		}
		//

		System.out.println();
		int total = 0;

		for (int i = 1; i < 50; i ++) {

			if(i%4==0) {
				total = total + 1; 
			}
//			System.out.print(i + " ");
//			total = total + i;

		}

//		System.out.println();
		System.out.print("Count is : " + total);
		
		
		System.out.println();
		int count = 0;

		for (int i = 1; i < 50; i ++) {

			if(i%4 !=0) {
				continue;
			}
			count = count + 1; 

		}

		System.out.print("Count is : " + count);
	}

}
