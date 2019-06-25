package day21;

public class task3 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		for (int i = 1; i < 50; i++) {
			
			if(i%3==0 && i%5==0) {
				
				continue;
			}
			System.out.print(i + " ");
			sum = sum + i ;
		}
		System.out.println();
		System.out.println(sum);

	}

}
