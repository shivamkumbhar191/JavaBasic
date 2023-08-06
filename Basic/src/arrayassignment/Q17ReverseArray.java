package arrayassignment;

import java.util.Arrays;

public class Q17ReverseArray {

	public static void main(String[] args) {
		int a[]= {10,20,40,90,60,20};
		reversearray(a);
		//reversearray2(a);

	}

	public static void reversearray2(int[] a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void reversearray(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
