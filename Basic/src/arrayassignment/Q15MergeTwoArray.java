package arrayassignment;

import java.util.Arrays;

public class Q15MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 40, 90, 60, 20 };
		int b[] = { 20, 60, 40, 30, 80, 80 };
	
		int c[] = new int[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					c[i] = a[i];
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] != b[j]) {
					c[count] = b[i];
					count++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
