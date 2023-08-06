package arrays;

import java.util.Scanner;

public class OddElement {
	
	public void oddElement(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int [5];
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter element in array");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		OddElement oe= new OddElement();
		oe.oddElement(a);
		sc.close();
		

	}

}
