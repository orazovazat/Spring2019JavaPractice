package day58;

public class AninalShow2 {

	public static void main(String[] args) {

		String[] arr = new String[3];

		Animal[] animals = new Animal[3];

		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Horse();

		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;

		for (Animal each : animals) {
			each.makeNoise();

		}

	}

}
