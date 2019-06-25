package day28;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {

		int[][] sheet = new int[4][2];
		sheet[0][0] = 12;
		sheet[0][1] = 17;
		sheet[1][0] = 3;
		sheet[1][1] = 40;
		sheet[2][0] = 44;
		sheet[2][1] = 27;
		sheet[3][0] = 23;
		sheet[3][1] = 12;
		for (int[] row : sheet) {

			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < sheet.length; i++) {
			//int[] eachRow = sheet[i] ;
			//System.out.println(Arrays.toString(eachRow));
			for (int j = 0; j < sheet[i].length; j++) {
				System.out.print(sheet[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
