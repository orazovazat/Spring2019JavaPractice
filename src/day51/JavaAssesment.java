package day51;

public class JavaAssesment extends Assesment{
	
	int level ;
//	int questionCount ;
//	int score ;
//	String type ;
	
//	static int timeLimit ;
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Assesment.timeLimit);
		
		System.out.println(timeLimit);
		timeLimit = 50;
		
		System.out.println(JavaAssesment.timeLimit);
		
		Assesment.printTimeLimit();
		printTimeLimit();
		JavaAssesment.printTimeLimit();
		
	}

//public static void printTimeLimit() {
//		
//		System.out.println("time Limit " + timeLimit);
//	}
//
//	public String toString() {
//		return "Assesment [questionCount=" 
//	           + questionCount + ", score=" + score 
//	           + ", type=" + type + "]";
//	}
	
	
	
	
	
}
