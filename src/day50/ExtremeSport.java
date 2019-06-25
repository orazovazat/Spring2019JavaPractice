package day50;

public class ExtremeSport extends Sport{
	//ady birmenzes bolmaly bolmasa override islemeyar
	public void doSport() {
		System.out.println("doing extreme sport ---> sky diving" );
	}
	
	public String toString() {
		return "extreme message";
	}
	
	
public static void main(String[] args) {
	
	ExtremeSport e1 = new ExtremeSport();
	e1.doSport();
	System.out.println(e1.toString());
}	

}
