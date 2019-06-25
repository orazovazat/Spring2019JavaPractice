package day58;

public class Horse extends Animal{
	
	public String color ;
	public String legsCount ;
	
	@Override
	public void makeNoise() {
		System.out.println("NEIGH NEIGH");
	}

}
