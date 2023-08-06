package controlstmts;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the length");
		int length=sc.nextInt();
		System.out.println("enter the breadth");
		int breadth=sc.nextInt();
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("enter the height ");
		int height=sc.nextInt();
		System.out.println("enter the radius");
		int radius=sc.nextInt();
		System.out.println("enter the pie");
		float pie=sc.nextFloat();
		System.out.println("enter the side");
		int side=sc.nextInt();
		char ch=' ';
		do {
			System.out.println("enter the choice");
			System.out.println("1.area of Rectangle\n2.area of triangle\n3.area of circle\n4.area of square");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("area of rectangle is "+(length*breadth));
			break;
			case 2:System.out.println("area of triangle is "+(base*height)/2);
			break;
			case 3:System.out.println("area of circle is "+(pie*radius*radius));
			break;
			case 4:System.out.println("area of square is "+(side*side));
			break;
			default:System.out.println("invalid choice ");
			}
			System.out.println("do you want to continue");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		sc.close();

	}

}
