package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GivenNumFrequency {
	public static void givenNumFrequncy(int a[],int n) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[k] == n) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] ==n) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc= new Scanner (System.in);
		int sk[] = { 94, 21, 67, 80, 94 };
		System.out.println(Arrays.toString(sk));
		System.out.println("enter the number");
		int n= sc.nextInt();
		
		GivenNumFrequency.givenNumFrequncy(sk,n);
		sc.close();


	}

}
