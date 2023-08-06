package twodarray;

import java.util.Arrays;

public class RowMaxMin {
	
	public void rowmax(int a[][]) {
		System.out.println("max number in row");
		for (int i=0;i<a.length;i++) {
			int max=a[i][0];
			for (int j=0;j<a[i].length;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
			
			System.out.println(max);
		}

	}

	public void rowmin(int a[][]) {
		System.out.println("min number in row");
		for (int i=0;i<a.length;i++) {
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[i][j]) {
					min=a[i][j];
				}
			}
			
			System.out.println(min);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 6, 9 }, { 8, 7, 1 }, { 6, 4, 5 } };
		System.out.println(Arrays.deepToString(a));
		RowMaxMin mx=new RowMaxMin();
		mx.rowmax(a);
		mx.rowmin(a);

	}

}
