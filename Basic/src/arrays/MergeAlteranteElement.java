package arrays;

import java.util.Arrays;

public class MergeAlteranteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {10,20,30,40,50,60};
		int c[]=new int[a.length+b.length];
		int idx=0;
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[idx]=a[i];
				idx++;
			}
			if(i<b.length) {
				c[idx]=b[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
