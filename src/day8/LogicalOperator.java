package day8;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		int a = 10 , b = 20 , c = 10 ;
		
		boolean b1 = a > b ;
		boolean b2 = a >= c ;
		
		System.out.println("a is more than b --> " + b1);
		System.out.println("a is more than or equal to c --> " + b2);
		
		boolean bothMeetRequirment = b1 && b2 ;
		System.out.println("are both ");
		
	}

}
