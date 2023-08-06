package arrayassignment;

import java.util.Arrays;

public class Q4HW {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 32 };
		boolean equal = true;
		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equal = false;
					break;
				} else {
					equal = true;
				}
			}
		} 
		else {
			equal = false;
		}
		System.out.println(equal);

	}
}
