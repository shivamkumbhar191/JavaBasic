package arrays;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {72,49,51,67,80};
		System.out.println(Arrays.toString(a));
		int b[]= {94,21,05,67,80};
		System.out.println(Arrays.toString(b));
		int c[]= new int[a.length+b.length];
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
			
		}
		System.out.println(Arrays.toString(c));
	}

}
