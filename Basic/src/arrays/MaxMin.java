package arrays;

import java.util.Scanner;

public class MaxMin {
	
	public void maxMinEle(int a[]) {
		int maxInt=a[0];
		int minInt=a[0];
		for (int i=0;i<a.length;i++) {
			if (maxInt<a[i]) {
				maxInt=a[i];
			}
			else if(minInt>a[i]) {
				minInt=a[i];
			}
			else {
				a[i]=a[i];
			}
			
		}
		System.out.println("maximum element in array is "+maxInt);
		System.out.println("minimum element in array is "+minInt);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int [5];
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter element in array");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		MaxMin mx=new MaxMin();
		mx.maxMinEle(a);
		sc.close();

	}

}
