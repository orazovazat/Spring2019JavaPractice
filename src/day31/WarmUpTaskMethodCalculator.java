package day31;

public class WarmUpTaskMethodCalculator {

	public static void main(String[] args) {

		add(100, 30);
		sub(100, 30);
		mult(100, 30);
		div(100, 30);
		mod(100, 30);

	}

	public static void add(int x, int y) {

		int sum = x + y;
		System.out.println(sum);

	}

	public static void sub(int x, int y) {

		int sum = x - y;
		System.out.println(sum);

	}

	public static void mult(int x, int y) {
		int sum = x * y;
		System.out.println(sum);
	}

	public static void div(int x, int y) {

		int sum = x / y;
		System.out.println(sum);

	}

	public static void mod(int x, int y) {

		int sum = x % y;
		System.out.println(sum);

	}

}
