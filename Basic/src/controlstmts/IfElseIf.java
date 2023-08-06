package controlstmts;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		if(num>0) {
			System.out.println("number is positive");
		}
		else if(num<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='a'&& ch<='z' || ch>='A'&&ch<='Z') {
			System.out.println("character is alphabet");
		}
		else if(ch>='0'&& ch<='9') {
			System.out.println("character is digit");
		}
		else {
			System.out.println("character is symbol");
		}
		
		System.out.println("enter the number");
		int num2=sc.nextInt();
		if(num2%9==0) {
			System.out.println("number is divisible by 3 and 9");
		}
		else if (num2%3==0) {
			System.out.println("number is divisible by 3");
		}
		else {
			System.out.println("number is not divisible by 3");
		}
		sc.close();

	}

}
