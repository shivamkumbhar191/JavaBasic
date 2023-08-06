package arrayassignment;

import java.util.Arrays;

public class Q9HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,4,6,7,10,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]%2!=0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
