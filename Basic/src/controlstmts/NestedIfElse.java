package controlstmts;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the percentage");
		float per=sc.nextFloat();
		System.out.println("enter the passing year");
		int passingYear=sc.nextInt();
		if(per>=60) {
			if(passingYear>=2021) {
				System.out.println("allow candidate for interview");
				
			}
			else {
				System.out.println("reject the candidate");
			}
		}
		else {
			System.out.println("reject the candidate");
		}
		
		System.out.println("enter the chracter");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("character is alphabet");
			if(ch>='A' && ch<='Z') {
				System.out.println("character is uppercase letter");
			}
			else {
				System.out.println("character is lowercase letter");
			}
		}
		else {
			System.out.println("character is another letter");
		}
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%5==0) {
			if(num%11==0) {
				System.out.println("number is divisible by 5 and 11");
			}
			else {
				System.out.println("number is divisible by 5");
			}
		}
		else {
			System.out.println("number is not divisible by 5 and 11");
		}
		sc.close();
		

	}

}
