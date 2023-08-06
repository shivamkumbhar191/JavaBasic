package twodarray;

import java.util.Arrays;

public class ColSum {
	public void coloumsum(int a[][]) {
		for (int i=0;i<a.length;i++) {
			int sum=0;
			for (int j=0;j<a[i].length;j++) {
				sum=sum+a[j][i];
			}
			System.out.println(sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int[3][3];
		a[0][0]=8;
		a[0][1]=9;
		a[0][2]=4;
		a[1][0]=2;
		a[1][1]=3;
		a[1][2]=7;
		a[2][0]=6;
		a[2][1]=1;
		a[2][2]=9;
		System.out.println(Arrays.deepToString(a));
		ColSum cl=new ColSum();
		cl.coloumsum(a);
		

	}

}
