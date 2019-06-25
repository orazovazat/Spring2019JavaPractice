package day50.difPack;

import day50.Vehicle;

public class Airplane extends Vehicle {

//	protected int year;
	private int wingCount;

//	public Airplane() {
//		super();
//	}

	public static void main(String[] args) {

		Airplane a1 = new Airplane("Boeing", "737", 2020, 4);

		System.out.println(a1);
		System.out.println(a1.year);
		
		Vehicle v1 = new Vehicle("F35", "730", 2020);
		//--> eger vehicle class to string etmesek 
		//     onda hash code beryar
		System.out.println(v1);

	}

	public Airplane(String brand, String model, int year, int wingCount) {
		super(brand, model, year);
//		setBrand(brand);
//		this.setModel(model);
//		
//		this.year = year ;
		this.wingCount = wingCount;
	}

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	public String toString() {
		return "Airplane [wingCount=" + wingCount + ", year=" + year + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + "]";
	}

}