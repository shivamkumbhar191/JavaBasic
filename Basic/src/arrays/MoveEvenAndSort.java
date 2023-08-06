package arrays;

import java.util.Arrays;

public class MoveEvenAndSort {

	public static void main(String[] args) {
		int a[]= {1,92,72,49,7,80,16};
		moveeven(a);
		

	}

	public static void moveeven(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]%2==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		sortEven(a);
		
	}

	public static void sortEven(int[] a) {
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				pos=i;
				break;
			}
		}
	
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
		sortOdd(a,pos);
		
	}

	public static void sortOdd(int[] a,int pos) {
		// TODO Auto-generated method stub
		for(int i=0;i<pos;i++) {
			for(int j=i+1;j<pos;j++) {
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
