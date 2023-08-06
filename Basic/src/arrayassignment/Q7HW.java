package arrayassignment;

import java.util.Arrays;

public class Q7HW {

	public static void main(String[] args) {
		// replace negative number with alternate numbers square
		int a[]= {5,2,-1,-6,4,-7};
		if(a[0]<0) {
			a[0]=a[a.length-1]*a[a.length-1];
		}
		if(a.length>1) {
			for(int i=0;i<a.length;i++) {
				if(a[i]<0) {
					a[i]=a[i-1]*a[i-1];
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
