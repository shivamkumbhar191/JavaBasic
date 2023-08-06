package arrayassignment;

public class Q11HW {

	public static void main(String[] args) {
		int a[] = { 27, 2, 4, 12, 36, 48, 81 };
		for (int i = 0; i < a.length; i++) {
			int j = 1;
			while (j <= a[i]) {
				int square = j * j;
				if (square == a[i]) {
					System.out.println(a[i]);
				}
				j++;
			}
		}
	}

	public static void sqaurerootlogic() {
		int num = 9;
		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		System.out.println(sqrtroot);
	}

}
