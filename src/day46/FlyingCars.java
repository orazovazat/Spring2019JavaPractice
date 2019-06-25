package day46;

public class FlyingCars {
	
	//int engineSize ;
	//String name;
	private static FlyingCars fcar ;
	
	private FlyingCars() {
		
	}
	
	public static FlyingCars getInstance() {
		
		FlyingCars f1 = new FlyingCars() ;
		 return f1 ;
		
	}

}
