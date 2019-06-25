package day50;

public class StudentUser extends SlackUser{

//	String displayName ;
//	int timezone ;
//	String status ;
	int groupNumber ;
	
	public static void main(String[] args) {
		
		StudentUser s1 = new StudentUser();
		System.out.println(s1);
		s1.changeStatus("relax");
		System.out.println(s1);
//		StudentUser s2 = new StudentUser("Azat",6,"available",26);
//		System.out.println(s2);
//		s2.sendMessage("Hello");
//		s2.changeStatus("relax");
//	    System.out.println(s2.status);
	}
	
	public StudentUser() {
//		super();
		
//		this.displayName = "Spartan" ;
//		this.status = "I CAN DO IT !!!" ;
//		this.timezone = 5 ;
//		this("Spartan" , 5 , "I CAN DO IT !!!" , 0 );
		super("Spartan" , 5 , "I CAN DO IT !!!");
		System.out.println("Student User no arg");
	}

	public StudentUser(String displayName, int timezone, String status , int groupNumber) {
//		this.displayName = displayName;
//		this.timezone = timezone;
//		this.status = status;
		super(displayName,timezone,status);
		this.groupNumber = groupNumber;
		System.out.println("Student user 4 args is being called");
	}

	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber 
				+ ", displayName=" + displayName 
				+ ", timezone=" + timezone
				+ ", status=" + status + "]";
	}
	
	
	
	
}
