package arrays;

import java.util.Arrays;

public class EvenOddSep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,2, 5, 6, 8, 3, 7,10 };
		evenoddsep(a);

	}

	public static void evenoddsep(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j<a.length; j++) {
				if (a[i] % 2 == 0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
