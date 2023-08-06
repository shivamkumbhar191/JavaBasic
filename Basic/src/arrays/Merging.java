package arrays;

import java.util.Arrays;

public class Merging {

	public static void main(String[] args) {
		//int a[]= {1,2,3,4,5};
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length+i-(a.length/2)];
			a[a.length+i-(a.length/2)]=temp;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
