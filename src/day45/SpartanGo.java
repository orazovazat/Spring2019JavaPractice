package day45;

public class SpartanGo {

	public static void main(String[] args) {

		Spartan s1 = new Spartan();
		System.out.println(s1);

		String[] certs = { "OCA", "PSM", "AWS", "OCP" };

		Spartan s2 = new Spartan("Coder", 8, 600, false, certs);
		System.out.println(s2);

	}

}
