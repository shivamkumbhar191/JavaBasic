package lab;

import java.util.Arrays;

public class RowColSum {
	
	public static void rowcolcum(int a[][]) {
		for (int i=0;i<a.length;i++) {
			int rowsum=0;
			int colsum=0;
			for (int j=0;j<a[i].length;j++) {
				rowsum=rowsum+a[i][j];
				colsum=colsum+a[j][i];
				
			}
			System.out.println(i+1+" row sum :"+rowsum+" ");
			System.out.println(i+1+" column sum :"+colsum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{72,49,51},{67,80,94},{56,21,48}};
		System.out.println(Arrays.deepToString(arr));
		RowColSum.rowcolcum(arr);

	}

}
