
public class fridayClass01 {

	public static void main(String[] args) {
		
		// for( initlization ; condition ; iterator )
		
				for(double i = 1 ; i > 0 ; i-- ) {
					System.out.println("Hello");
					//i--;
				}
				// how can we print given number like this:  1-2+3-4+5 = 3
					int total=0;  // 
					
					for(int i=1; i < 6; ) {
						// total += i;     // 1+2+3+4+5
						if(i%2==0) {
							total -= i;
						} 
						if(i%2 !=0) {
							total += i;
						}
						i++;
					}
					System.out.println(total);
					
					
						// while( condition ){ }
					int total2=0;
					int k=1;
					while(k<6) {
						if(k%2==0) {
							total2 -= k;
						} 
						if(k%2 !=0) {
							total2 += k;
						}
						k++;
					}
					System.out.println(total2);
					
					boolean AA=false;
					while(AA) {  // if the condition is false, body won't be executed.
						System.out.println("Batch11");
					}
					
					do {
						System.out.println("Batch11");
					}while(AA);

	}

}
