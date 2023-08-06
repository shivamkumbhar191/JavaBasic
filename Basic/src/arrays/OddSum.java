package arrays;

import java.util.Scanner;

public class OddSum {
	public static void sumOdd(int arr[]) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum= sum +arr[i];
			}	
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int [5];
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter element in array");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		OddSum.sumOdd(a);
		
		sc.close();
	
		

	}

}
