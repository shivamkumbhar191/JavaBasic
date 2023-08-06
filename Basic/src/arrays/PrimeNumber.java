package arrays;

public class PrimeNumber {
	public void primeNum(int a[]) {
		for (int i = 0; i < a.length; i++) {
				boolean isprime = true;
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						isprime = false;
						break;
					}
				}
				if (isprime == true) {
					System.out.println(a[i]);
				}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 9,17, 6, 15, 63, 23 };
		PrimeNumber pn = new PrimeNumber();
		pn.primeNum(a);

	}

}
