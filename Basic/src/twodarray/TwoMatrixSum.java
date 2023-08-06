package twodarray;

public class TwoMatrixSum {

	public static void sum(int a[][], int b[][]) {
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				int c[][] = new int[a.length][a[i].length];
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 6, 9 }, { 7, 8, 9 } };
		int b[][] = { { 5, 3, 1 }, { 6, 4, 2 } };

		TwoMatrixSum.sum(a, b);

	}

}
