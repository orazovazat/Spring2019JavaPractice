package day48;

public class StudentTester {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Azat";
		p1.age = 34 ;
		p1.height = 5.8f ;
		p1.gender = 'M' ;
		p1.test = "bolyan ekeni";
		p1.eat();
		
		System.out.println(p1.height);
		System.out.println(p1.test);
		
		Student s1 = new Student();
		s1.name = "Jnnet";
		s1.age = 36 ;
		s1.height = 4.8f ;
		s1.gender = 'F' ;
		s1.studentId = 123 ;
		s1.eat();
		System.out.println(s1.studentId);
		
		Teacher t1 = new Teacher();
		t1.age = 55 ;
		t1.teacherId = "abc555";
		
		System.out.println(t1.age);
		System.out.println(t1.teacherId);

	}

}
