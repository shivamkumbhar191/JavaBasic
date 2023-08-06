package onextel;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range");
		int n = sc.nextInt();
		System.out.println("enter the number ");
		int m = sc.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}

			}
			if (prime == true) {
				if(count!=m) {
					sum=sum+i;
					count++;
				}
				
			}
	
		}
		System.out.println(sum);
		sc.close();

	}

}
