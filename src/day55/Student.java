package day55;

public abstract class Student {
	
//abstract class are not meant to be instantiated
//abstract class are meant to be a super class
// to provide a general idea, without providing implementation 
// 	
	
	
	int id ;
	String name ;
	public static final String SCHOOL = "Cybertek";
	
	public Student(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	public void study() {
		System.out.println("Study hard to get the job");
	}
	
	public void showShcool() {
		System.out.println(SCHOOL);
	}


	public abstract void attendClass();

	
//	public void attendClass() {	
//		System.out.println("IMPLEMENT IN SUB CLASSES");
//	}
	
	

}
