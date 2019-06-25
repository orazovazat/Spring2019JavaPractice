package day53;

public class EBook extends Book{
	
	// sub class can hide super class's field by redeclaring it
	// the only thing matter is the <name> !!!!!
	float name = 12.11f ;
	long page = 100 ;
	
	// @Override only for instance method so this will not work !!
	private static double weigth = -1 ;
	
	public static void main(String[] args) {
		
		EBook e = new EBook();
		System.out.println(e.name);
		e.showValues();
		
	}
	
	public void showValues() {
		System.out.println( super.name  + " --- " + this.name );
		System.out.println( super.page + " --- " + this.page );
		// static fields can be accessed directly in instance method
		// or we can make it obvios to call in static way EBook .weight
		System.out.println( super.weigth + " --- " + weigth);
	}
	

}


// -------------------
// We can have more than one class in one source file
// however only one should be public

class Book {
	
	String name = "BookName";
	int page = 10;
	double weigth = 5.0;
	
}
