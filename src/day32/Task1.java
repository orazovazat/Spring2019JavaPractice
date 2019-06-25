package day32;

public class Task1 {

	public static void main(String[] args) {
	
		
//		System.out.println(giveMe6DigitSalary() );
//		System.out.println(giveMe6DigitSalary()*2 );
		long firstYearSalary = giveMe6DigitSalary() ;
		long secondYearSalary = giveMe6DigitSalary() ;
		System.out.println(firstYearSalary + secondYearSalary);
		
		long secondYearSalaryAfter = (long) (firstYearSalary * 1.1);
		System.out.println(secondYearSalaryAfter);
		
		
	}

	
public static long giveMe6DigitSalary() {

		return 180000L ;
	}
	
	
}
