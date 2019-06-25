package day27;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a 5 nunbers :");

		int[] nums = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };

		// String numbers = nums.toString();
		System.out.println(Arrays.toString(nums));
		int sum = 0;

		for (int eachNum : nums) {
			sum += eachNum;
		}
		System.out.println("Sum is : " + sum);

		int max = 0;

		for (int eachNum : nums) {

			if (eachNum > max) {
				max = eachNum;

			}
		}
		System.out.println("Max is : " + max);

		int min = nums[0];

		for (int eachNum : nums) {
			if (min > eachNum) {
				min = eachNum;
			}
		}

		System.out.println("Min is : " + min);
	}

}
