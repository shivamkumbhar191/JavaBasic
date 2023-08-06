package arrays;

import java.util.Arrays;

public class ShiftZero {
	
	public static void moveZeroToLast(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == 0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 0, 2, 0, 4, 1, 5 };
		moveZeroToLast(a);
		
	}

}
