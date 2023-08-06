package oops;

import java.util.Scanner;

public class VolumeCalculator {
	
	public double calculateVolume(double radius,double height) {
		double cylinderVolume=3.14*radius*radius*height;
		return cylinderVolume;
	}
	public double calculateVolume(int len,int breadth,int height) {
		double cuboidVolume=len*breadth*height;
		return cuboidVolume;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		VolumeCalculator vc= new VolumeCalculator();
		System.out.println("enter the choice");
		System.out.println("1.Find volume for cylinder\n2.Find volume for cuboid");
		int choice=sc.nextInt();

		switch (choice) {
		case 1:System.out.println(vc.calculateVolume(3, 2));
		break;
		case 2:	System.out.println(vc.calculateVolume(3, 2, 1));
		break;
		default:System.out.println("invalid choice");
		sc.close();
	
		}

	}

}
