package day19;

public class LoopPractice {

	public static void main(String[] args) {
		
		String name = "Bilal" ;
		
		//System.out.println();
//		System.out.print(name.charAt(0)+ "-");
//		System.out.print(name.charAt(1)+ "-");
//		System.out.print(name.charAt(2)+ "-");
//		System.out.print(name.charAt(3)+ "-");
//		System.out.print(name.charAt(4)+ "-");

		int x = 0 ;
		while(x<5) {
			System.out.print(  name.charAt(x) + "-");
			x++ ; // ++x ; ---> also works
		}
	}

}
