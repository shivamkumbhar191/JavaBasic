package lab;

import java.util.Arrays;

public class ColumnMin {
	
	public void colmin(int a[][]) {
		for(int i=0;i<a.length;i++) {
			int min=a[0][i];
			for(int j=0;j<a[i].length;j++) {
				if(min>a[j][i]) {
					min=a[j][i];
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{72,49,51},{67,80,94},{56,21,48}};
		System.out.println(Arrays.deepToString(arr));
		new ColumnMin().colmin(arr);

	}

}
