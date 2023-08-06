package arrays;

import java.util.Scanner;

public class EvenPosition {
	
	public void evenIndex(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.println("position of even number is "+i);
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
		EvenPosition ep= new EvenPosition();
		ep.evenIndex(a);
		sc.close();

	}

}
