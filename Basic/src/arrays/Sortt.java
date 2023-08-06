package arrays;

import java.util.Arrays;

public class Sortt {
	public void ascSort(int a[]) {
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	
	public void descSort(int a[]) {
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sk= {72,49,51,67,80};
		System.out.println(Arrays.toString(sk));
		Sortt s= new Sortt();
		s.ascSort(sk);
		s.descSort(sk);

	}

}
