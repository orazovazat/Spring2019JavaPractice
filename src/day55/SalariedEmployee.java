package day55;

public class SalariedEmployee extends Employee {

	private int monthlySalary;
	
	
	public SalariedEmployee(int id , String name , int monthlySalary) {
		super(id,name);
		this.monthlySalary = monthlySalary;
	}	

	@Override
	public void calculateAnnualSalary() {
		
		System.out.println(monthlySalary * 12);




	}

}
