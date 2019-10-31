package magicSquare;

/*
 * Title : 5*5 ¸¶¹æÁø 
 * Author : ljryul
 */

public class MagicSquare5_5 {

	public static void main(String[] args) {
		int[][] ma = new int[5][5];
		int row = 0, col = 2;

		for (int i = 1; i <= 25; i++) {

			ma[row][col] = i;

			if (i % 5 == 0) {
				row++;
			} else {
				row--;
				col++;
			}

			if (row < 0)
				row = 4;
		
			if (col > 4)
				col = 0;
		}
		
		for (int[] array : ma) {
			for (int num : array) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}
