package arrayassignment;

import java.util.Arrays;

public class Q6HW {

	public static void main(String[] args) {
		// replace zero with one
		int a[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		for (int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
