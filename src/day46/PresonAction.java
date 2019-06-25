package day46;

public class PresonAction {

	public static void main(String[] args) {
		
		Person p1 = new Person("Azat", 5.8f , 'M');
		Person p2 = new Person("jemile", 5.2f , 'F');
		
		System.out.println(Person.race);
		
		System.out.println(p1.race);
		
		Person.race = "Humanoid";
		System.out.println(p2.race);
		
		p2.race = "Spartan";
		System.out.println(p1.race);

	}

}
