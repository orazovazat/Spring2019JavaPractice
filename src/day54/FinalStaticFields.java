package day54;

public class FinalStaticFields {
	
	// public static final fields is also called --->>> CONSTANT
	
	//FINAL STATIC VALUE MUST BE INITILIZED BEFORE CLASS FINISH LOADING 
	public static final String RACE = "HUMAN";
	static final int MAX_NUM = getStaticNum();
	
	private static final int MAX_SPEED ;
	//ALL CAP IS HIGHLY RECOMMENDED
	//static final String lowercase = "lower"; 
	
	static {
		MAX_SPEED = 120;
	}
	
	public static int getStaticNum() {
		return 200 ;
	}
	
	public static void main(String[] args) {
		
		System.out.println(RACE);
		System.out.println(MAX_NUM);
		System.out.println(MAX_SPEED);
		
		//RACE = "Humanoid";
		
		System.out.println(  Integer.MAX_VALUE );
		System.out.println( Math.PI );
		
	}

}
