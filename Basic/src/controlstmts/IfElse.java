package controlstmts;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num1= sc.nextInt();
		if(num1%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		System.out.println("enter the number");
		int num2=sc.nextInt();
		if (num2%5==0) {
			System.out.println("number is divisible by 5");
		}
		else {
			System.out.println("number is not divisible by 5");
		}
		System.out.println("enter the number");
		int num3=sc.nextInt();
		if(num3<50) {
			System.out.println("number is less than 50");
		}
		else {
			System.out.println("number is greter than 50");
		}
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch=='z' || ch=='Z') {
			System.out.println("the given character is z");
		}
		else {
			System.out.println("the given character is not z");
		}
		sc.close();

	}

}
