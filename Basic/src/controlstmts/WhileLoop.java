package controlstmts;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// find average of digit from the number
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			int digit = n%10;
			count++;
			sum = sum+ digit ;
			n=n/10;
		}
		float avg= (float)sum/count;
		System.out.println(avg);
		
		//check the number is pallindrome or not
		System.out.println("enter the number");
		int m= sc.nextInt();
		int temp=m;
		int rev=0;
		while(m>0) {
			int digit = m%10;
			rev= rev*10+digit;
			m=m/10;
		}
		m= temp;
		System.out.println(rev);
		if (m==rev) {
			System.out.println("the given number is pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
		//check the given number is spy number or not
		System.out.println("enter the number");
		int q=sc.nextInt();
		int add=0;
		int multi=1;
		while(q>0) {
			int digit = q%10;
			add=add+digit;
			multi=multi*digit;
			q=q/10;
		}
		if(add==multi) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not spy number");
		}
		sc.close();
		
		

	}

}
