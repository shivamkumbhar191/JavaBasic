package controlstmts;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//display the numbers between 50 to 120
		for (int i=50;i<=120;i++) {
			System.out.println(i);
		}
		
		//display the numbers between 340 to 275
		System.out.println("==============================================");
		for (int i=340;i>=275;i--) {
			System.out.println(i);
		}
		
		//calculate the sum of 1 to 10 numbers
		System.out.println("==============================================");
		int sum =0;
		for (int i=1;i<=10;i++) {
			sum= sum+i;
			
		}
		System.out.println(sum);
		
		//count the odd number from 1 to 20
		System.out.println("==============================================");
		int count=0;
		for (int i=1;i<=20;i++) {
			if (i%2!=0) {
				count++;
			}
		}
		System.out.println(count);
		
		//display the table of a given number
		System.out.println("==============================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the table number");
		int num=sc.nextInt();
		int table=0;
		for (int i=1;i<=10;i++) {
			table= num*i;
			System.out.println(table);
		}
		//factorial of given number
		System.out.println("==============================================");
		System.out.println("enter the number");
		int num2=sc.nextInt();
		int fact=1;
		for (int i=1;i<=num2;i++) {
			fact= fact*i;
			
		}
		System.out.println(fact);
		sc.close();

	}

}
