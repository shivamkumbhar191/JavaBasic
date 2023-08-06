package arrays;

import java.util.Arrays;

public class EachElementFrequency {
	public static void eleFrequncy(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[k] == a[i]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i] + " " + count);

			}
		}

	}
	
	public static void main(String[] args) {
		int sk[] = { 94, 21, 67, 80, 94 };
		System.out.println(Arrays.toString(sk));
		EachElementFrequency.eleFrequncy(sk);

	}

}
