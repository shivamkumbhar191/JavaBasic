package arrays;

import java.util.Arrays;

public class MoveOddAndSort {

	public static void main(String[] args) {
		int a[]= {4,1,9,6,3,7,8,5};
		moveodd(a);

	}

	public static void moveodd(int[] a) {
		// TODO Auto-generated method stub
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
		sortodd(a);
		
	}

	public static void sortodd(int[] a) {
		// TODO Auto-generated method stub
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				pos=i;
				break;
			}
		}
		System.out.println(pos);
		for(int i=pos;i<a.length;i++) {
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
