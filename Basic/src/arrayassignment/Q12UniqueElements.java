package arrayassignment;

public class Q12UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 11, 48, 24, 39, 61, 11, 48 };
		countuniquemethod1(b);
		countuniquemethod2(b);
	}

	public static void countuniquemethod2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				if (count == 1) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void countuniquemethod1(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				continue;
			}
			int counts = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					counts++;
					a[j] = 0;
				}
			}
			if (counts == 1) {
				System.out.println(a[i] + " " + counts);
			}

		}

	}

}
