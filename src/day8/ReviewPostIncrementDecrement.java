package day8;

public class ReviewPostIncrementDecrement {

	public static void main(String[] args) {
		
		int score = 10;
		
//		System.out.println("score++ " + score++);
//		System.out.println("score " + score);
//		System.out.println(++score);
//		System.out.println(score--);
//		System.out.println(score);
		
		int result = score++ ;
		System.out.println("result is "+ result);
		
		score = score++ + ++score ;
		System.out.println(score);
		

	}

}
