package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElement {
	
	public void alternateEle(int a[]) {

		for (int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]);
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
		System.out.println(Arrays.toString(a));
		AlternateElement al= new AlternateElement();
		al.alternateEle(a);
		sc.close();

	}

}
