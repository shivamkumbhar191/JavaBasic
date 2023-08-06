package arrayassignment;

import java.util.Arrays;

public class Q16SortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,40,90,60,20};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
