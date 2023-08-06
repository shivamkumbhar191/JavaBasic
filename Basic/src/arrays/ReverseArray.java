package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,22,55,21,4,54,10};
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length+i- a.length/2];
			a[a.length+i- a.length/2]=temp;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
