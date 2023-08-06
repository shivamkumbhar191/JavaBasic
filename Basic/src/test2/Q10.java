package test2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int first=1;
			int second=2;
			int c;
			System.out.print(first+",");
			
			for (int i=2;i<=n;i++) {
				if (i%2==0) {
					c = first + second;
					System.out.print(c+",");
					first=c;
				}
				else {
					c= first+ second;
					System.out.print(second+",");
					second=c;
				}
			}
			sc.close();
			
	}

}
