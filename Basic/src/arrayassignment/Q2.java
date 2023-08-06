package arrayassignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of array");
		int n= sc.nextInt();
		int a[]= new int[n];
		int sum=0;
		System.out.println("enter elements");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		float avg=(float)sum/(a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(avg);
		sc.close();

	}

}
