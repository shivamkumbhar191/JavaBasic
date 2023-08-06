package arrayassignment;

import java.util.Arrays;

public class Q12HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6, 23, 67, 39, 10, 2, 5};
		
		int first =a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=first;
		System.out.println(Arrays.toString(a));

	}

}
