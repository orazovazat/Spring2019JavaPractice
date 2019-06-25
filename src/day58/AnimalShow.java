package day58;

public class AnimalShow {

	public static void main(String[] args) {
		
		// Dog is dog
		
		// reference type
		 
		Dog d = new Dog();
		
		//Dog is an Animal
		Animal a1 = new Dog();
		
		// Dog is an IndoorPet
		IndoorPet d2 = new Dog();
		
		// Horse
		Horse h1 = new Horse();
		Animal h2 = new Horse();
		// Horse and IndoorPet has no relationship
		//IndoorPet h3 = new Horse();
		
		// Dog d1 = new Animal(); -->> BAD 
		// Animal a3 = new IndoorPet(); -->> BAD (interface can't create
		//an object
		
	}

}
