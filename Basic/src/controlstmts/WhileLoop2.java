package controlstmts;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		//sum of even digit from number
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int digit = n%10;
			if (digit%2==0) {
				sum=sum+digit;
			}
			n=n/10;
		}
		System.out.println(sum);
		
		//average of odd digit from the number
		System.out.println("enter the number");
		int m=sc.nextInt();
		int summ=0;
		int count=0;
		while(m>0) {
			int digit = m%10;
			if (digit%2!=0) {
				summ= summ+digit;
				count++;
			}
			m=m/10;
		}
		float avg=(float)summ/count;
		System.out.println(avg);
		
		//sum of first digit and last digit 
		System.out.println("enter the number");
		int q=sc.nextInt();
		int firtsdigit=0;
		int lastdigit=q%10;
		while(q>0) {
			firtsdigit=q%10;
			q=q/10;
		}
		int sumfl=firtsdigit+lastdigit;
		System.out.println(sumfl);
		
		sc.close();

	}

}
