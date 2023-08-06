package lab;

import java.util.Scanner;

public class TwoDArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int [3][4];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element in array");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for(int x[]:a) {
			for (int e:x) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
