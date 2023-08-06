package controlstmts;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,4,6};
//		int sum=0;
//		
//		for (int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				sum= sum+a[i];
//			}
//		}
//		System.out.println(sum);
			
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int m=sc.nextInt();
		int n= sc.nextInt();
		for (int i=m;i<=n;i++) {
			boolean isprime=true;
			for (int j=2;j<i;j++) {
				if (i%j==0) {
					isprime = false;
					break;
					}
			}
			if(isprime==true) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
